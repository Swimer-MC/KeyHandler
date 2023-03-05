# KeyHandler 
Java. By ReStudios

The `KeyHandler` class is a Java class that provides functionality for detecting keyboard events and registering event handlers for them. The class uses a native library, `KeyHandler.dll` or `KeyHandler64.dll`, depending on the system architecture, to detect keyboard events at a low level.

The class has a static initializer that initializes an array list of `IKeyHandler` objects and a hash map of integer keys and boolean values. The array list holds the event handlers that are registered for the keyboard events, while the hash map holds the last state of each key that was pressed.

The `init()` method is a static factory method that initializes the native library and starts a new thread to listen for keyboard events. The method checks the system architecture and unzips the appropriate native library, `KeyHandler.dll` or `KeyHandler64.dll`, from the class resources. It then loads the native library using the `System.load()` method and starts a new thread that runs the native method `m0()`.

The `addHandler()` and `removeHandler()` methods are used to register and unregister event handlers for the keyboard events. The methods take an `IKeyHandler` object as an argument, which is added or removed from the array list of event handlers.

The `isKeyPressed()` method is used to determine if a key is currently pressed. The method takes an integer virtual key code (VK) as an argument and returns a boolean value indicating whether the key is currently pressed.

The `m0()`, `m1()`, `m2()`, and `m3()` methods are native methods that are implemented in the KeyHandler.dll or KeyHandler64.dll library. The m0() method initializes the keyboard event listener, while the `m1()` and `m2()` methods handle the key press and key release events, respectively. The `m3()` method checks if a key is currently pressed.

Overall, the `KeyHandler` class provides a simple and effective way to detect keyboard events and register event handlers for them in Java applications.


### Examples

### "Hello world"
```java 
import org.ReStudios.keyhandler.IKeyHandler;
import org.ReStudios.keyhandler.KeyHandler;
import org.ReStudios.keyhandler.Keys;

class MyClass {

	public static void main(String[] args) {
		KeyHandler.init();

		KeyHandler.addHandler(new IKeyHandler() {
			@Override
			public void onKeyPress(int key) {
				// Keys.get(int) - converts the button to a description. For example "Backspace", "Space", "Key_W", "Key_3" etc
				System.out.println("pressed: " + Keys.get(key));
			}

			@Override
			public void onKeyRelease(int key) {
				System.out.println("released: "+Keys.get(key));
			}
		});
	}

}
```

### Handling only button click event
```java  
import org.ReStudios.keyhandler.KeyAdapter;
import org.ReStudios.keyhandler.KeyHandler;
import org.ReStudios.keyhandler.Keys;

class MyClass {

	public static void main(String[] args) {
		KeyHandler.init();

		KeyHandler.addHandler(new KeyAdapter() {
			@Override
			public void onKeyPress(int key) {
				System.out.println("pressed: "+Keys.get(key));
			}
		});
	}

}
```


### Removing handler

```java  
import org.ReStudios.keyhandler.KeyAdapter;
import org.ReStudios.keyhandler.KeyHandler; 

class MyClass {

	public static void main(String[] args) {
		KeyHandler.init();

		KeyAdapter handler = new KeyAdapter() {/* methods */};
		KeyHandler.removeHandler(handler);
	}

}
```

### isKeyPressed

```java  
import org.ReStudios.keyhandler.KeyAdapter;
import org.ReStudios.keyhandler.KeyHandler;
import org.ReStudios.keyhandler.Keys;

class MyClass {

	public static void main(String[] args) {
		KeyHandler.init();

		boolean isPressed = KeyHandler.isKeyPressed(Keys.ENTER); // is Enter pressed right now
		System.out.println(isPressed ? "pressed" : "released");
	}

}
```

