package org.ReStudios.keyhandler;

import org.ReStudios.utitlitium.FileHandle;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
@SuppressWarnings("unused")
public class KeyHandler {
    private static final ArrayList<IKeyHandler> handlers;
    private static final HashMap<Integer, Boolean> lastStates;

    static {
        handlers = new ArrayList<>();
        lastStates = new HashMap<>();
    }


    @Contract(" -> new")
    @SuppressWarnings("all")
    public static @NotNull Thread init(){
        String arch = System.getProperty("os.arch").contains("64") ? "64" : "";
        if(arch.equals("64")){
            try {
                FileHandle.unzip(KeyHandler.class, "KeyHandler64.dll", "KeyHandler64.dll", false, true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
                FileHandle.unzip(KeyHandler.class, "KeyHandler.dll", "KeyHandler.dll", false, true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        System.load(new File("KeyHandler"+arch+".dll").getAbsolutePath());
        return new Thread(KeyHandler::m0){{start();}};
    }

    public static void addHandler(IKeyHandler handler){
        handlers.add(Objects.requireNonNull(handler));
    }
    public static void removeHandler(IKeyHandler handler){
        handlers.remove(handler);
    }
    public static boolean isKeyPressed(int vk){
        return m3(vk);
    }


    /**
     * init
     */
    private static native void m0();

    /**
     * onKeyPress
     */
    private static void m1(int var0){
        if(!lastStates.containsKey(var0) || !lastStates.get(var0)){handlers.forEach(handler -> handler.onKeyPress(var0));}
        lastStates.put(var0, true);
    }

    /**
     * onKeyRelease
     */
    private static void m2(int var0){
        if(lastStates.get(var0)){handlers.forEach(handler -> handler.onKeyRelease(var0));}
        lastStates.put(var0, false);
    }

    /**
     * isKeyPressed
     */
    private static native boolean m3(int var0);
}
