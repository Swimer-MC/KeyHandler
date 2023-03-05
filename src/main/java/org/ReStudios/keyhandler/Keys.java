package org.ReStudios.keyhandler;

import java.util.HashMap;
@SuppressWarnings("unused")
public class Keys {

    public static int BACKSPACE = 0x08;
    public static int TAB = 0x09;
    public static int ENTER = 0x0D;
    public static int ESCAPE = 0x1B;
    public static int CAPSLOCK = 0x14;
    public static int SPACE = 0x20;
    public static int PAGEUP = 0x21;
    public static int PAGEDOWN = 0x22;
    public static int END = 0x23;
    public static int HOME = 0x24;

    // Arrows ←↑→↓
    public static int LEFT = 0x25; // ←
    public static int UP = 0x26; // ↑
    public static int RIGHT = 0x27; // →
    public static int DOWN = 0x29; // ↓

    public static int PRINTSCREEN = 0x2C;
    public static int INSERT = 0x2D;
    public static int DELETE = 0x2F;

    // Digital keys
    public static int KEY_0 = 0x30;
    public static int KEY_1 = 0x31;
    public static int KEY_2 = 0x32;
    public static int KEY_3 = 0x33;
    public static int KEY_4 = 0x34;
    public static int KEY_5 = 0x35;
    public static int KEY_6 = 0x36;
    public static int KEY_7 = 0x37;
    public static int KEY_8 = 0x38;
    public static int KEY_9 = 0x39;

    // Alphabetic keys
    public static int KEY_A = 0x41;
    public static int KEY_B = 0x42;
    public static int KEY_C = 0x43;
    public static int KEY_D = 0x44;
    public static int KEY_E = 0x45;
    public static int KEY_F = 0x46;
    public static int KEY_G = 0x47;
    public static int KEY_H = 0x48;
    public static int KEY_I = 0x49;
    public static int KEY_J = 0x4A;
    public static int KEY_K = 0x4B;
    public static int KEY_L = 0x4C;
    public static int KEY_M = 0x4D;
    public static int KEY_N = 0x4E;
    public static int KEY_O = 0x4F;
    public static int KEY_P = 0x50;
    public static int KEY_Q = 0x51;
    public static int KEY_R = 0x52;
    public static int KEY_S = 0x53;
    public static int KEY_T = 0x54;
    public static int KEY_U = 0x55;
    public static int KEY_V = 0x56;
    public static int KEY_W = 0x57;
    public static int KEY_X = 0x58;
    public static int KEY_Y = 0x59;
    public static int KEY_Z = 0x5A;

    public static int LWINDOWS = 0x5B;
    public static int RWINDOWS = 0x5C;

    // NUMPAD
    public static int NUM0 = 0x60;
    public static int NUM1 = 0x61;
    public static int NUM2 = 0x62;
    public static int NUM3 = 0x63;
    public static int NUM4 = 0x64;
    public static int NUM5 = 0x65;
    public static int NUM6 = 0x66;
    public static int NUM7 = 0x67;
    public static int NUM8 = 0x68;
    public static int NUM9 = 0x69;
    public static int NUM_MULTIPLY = 0x6A; // *
    public static int NUM_ADD = 0x6B; // +
    public static int NUM_SUBTRACT = 0x6D; // -
    public static int NUM_DECIMAL = 0x6E; // . at numpad (del)
    public static int NUM_DIVIDE = 0x6f; // /
    // /NUMPAD


    // F* functional keys
    public static int F1 = 0x70;
    public static int F2 = 0x71;
    public static int F3 = 0x72;
    public static int F4 = 0x73;
    public static int F5 = 0x74;
    public static int F6 = 0x75;
    public static int F7 = 0x76;
    public static int F8 = 0x77;
    public static int F9 = 0x78;
    public static int F10 = 0x79;
    public static int F11 = 0x7A;
    public static int F12 = 0x7B;

    public static int NUMLOCK = 0x90;
    public static int SCROLLLOCK = 0x91;
    public static int LSHIFT = 0xA0; // Left Shift
    public static int RSHIFT = 0xA1; // Right Shift
    public static int LCTRL = 0xA2; // Left Control
    public static int RCTRL = 0xA3; // Right Control
    public static int LALT = 0xA4; // Left Alt
    public static int RALT = 0xA5; // Right Alt


    // chars
    public static int SEMILICON = 0xBA;  // ;
    public static int PLUS = 0xBB;       // +
    public static int COMMA = 0xBC;      // ,
    public static int MINUS = 0xBD;      // -
    public static int DOT = 0xBE;        // .
    public static int SLASH = 0xBF;      // /
    public static int TILDA = 0xC0;      // ~
    public static int LEFT_SQUARE_BRACKET = 0xDB; // [
    public static int BACK_SLASH = 0xDC; // \
    public static int RIGHT_SQUARE_BRACKET = 0xDD; // ]
    public static int SINGLE_QUOTE = 0xDE; // '


    @SuppressWarnings("all")
    private static final HashMap<Integer, String> descriptions;
    static {
        descriptions = new HashMap<Integer,String>(){{
            put(0x01, "LMB"); // Left Mouse Button
            put(0x02, "RMB"); // Right Mouse Button
            put(0x03, "Cancel");
            put(0x04, "MMB"); // Middle Mouse Button
            put(0x05, "X1");
            put(0x06, "X2");

            put(0x07, "Unassigned1"); // none

            put(0x08, "Backspace");
            put(0x09, "TAB");

            put(0x0A, "Unassigned2"); // none
            put(0x0B, "Unassigned3"); // none

            put(0x0C, "Clear");
            put(0x0D, "Enter");

            put(0x0E, "Unassigned4"); // none
            put(0x0F, "Unassigned5"); // none

            put(0x10, "Shift");
            put(0x11, "Ctrl");
            put(0x12, "Alt");
            put(0x13, "Pause");
            put(0x14, "CapsLock");

            put(0x15, "Unassigned6"); // none
            put(0x16, "Unassigned7"); // none
            put(0x17, "Unassigned8"); // none
            put(0x18, "Unassigned9"); // none
            put(0x19, "Unassigned10"); // none
            put(0x1A, "Unassigned11"); // none

            put(0x1B, "ESC");

            put(0x1C, "Unassigned12"); // none
            put(0x1D, "Unassigned13"); // none
            put(0x1E, "Unassigned14"); // none
            put(0x1F, "Unassigned15"); // none

            put(0x20, "Space");
            put(0x21, "PageUp");
            put(0x22, "PageDown");
            put(0x23, "End");
            put(0x24, "Home");
            put(0x25, "LeftArrow");
            put(0x26, "UpArrow");
            put(0x27, "RightArrow");
            put(0x28, "DownArrow");
            put(0x29, "Select");
            put(0x2A, "Print");
            put(0x2B, "Execute");
            put(0x2C, "PrintScreen"); // PrtScr
            put(0x2D, "Insert");
            put(0x2E, "Delete");
            put(0x2F, "Help");

            put(0x30, "0");
            put(0x31, "1");
            put(0x32, "2");
            put(0x33, "3");
            put(0x34, "4");
            put(0x35, "5");
            put(0x36, "6");
            put(0x37, "7");
            put(0x38, "8");
            put(0x39, "9");

            put(0x3A, "Unassigned16"); // none
            put(0x3B, "Unassigned17"); // none
            put(0x3C, "Unassigned18"); // none
            put(0x3D, "Unassigned19"); // none
            put(0x3E, "Unassigned20"); // none
            put(0x3F, "Unassigned21"); // none
            put(0x40, "Unassigned23"); // none

            put(0x41,"A");
            put(0x42,"B");
            put(0x43,"C");
            put(0x44,"D");
            put(0x45,"E");
            put(0x46,"F");
            put(0x47,"G");
            put(0x48,"H");
            put(0x49,"I");
            put(0x4A,"J");
            put(0x4B,"K");
            put(0x4C,"L");
            put(0x4D,"M");
            put(0x4E,"N");
            put(0x4F,"O");
            put(0x50,"P");
            put(0x51,"Q");
            put(0x52,"R");
            put(0x53,"S");
            put(0x54,"T");
            put(0x55,"U");
            put(0x56,"V");
            put(0x57,"W");
            put(0x58,"X");
            put(0x59,"Y");
            put(0x5A,"Z");

            put(0x5B, "LWindows"); // Left Windows
            put(0x5C, "RWindows"); // Right Windows
            put(0x5D, "Applications");

            put(0x5E, "Unassigned24"); // none

            put(0x5F, "Sleep");

            put(0x60, "Num0");
            put(0x61, "Num1");
            put(0x62, "Num2");
            put(0x63, "Num3");
            put(0x64, "Num4");
            put(0x65, "Num5");
            put(0x66, "Num6");
            put(0x67, "Num7");
            put(0x68, "Num8");
            put(0x69, "Num9");

            put(0x6A, "Multiply"); // *
            put(0x6B, "Add"); // +
            put(0x6C, "Separator");
            put(0x6D, "Subtract"); // -
            put(0x6E, "Decimal"); // .
            put(0x6F, "Divide");  // /

            put(0x70, "F1");
            put(0x71, "F2");
            put(0x72, "F3");
            put(0x73, "F4");
            put(0x74, "F5");
            put(0x75, "F6");
            put(0x76, "F7");
            put(0x77, "F8");
            put(0x78, "F9");
            put(0x79, "F10");
            put(0x7A, "F11");
            put(0x7B, "F12");
            put(0x7C, "F13");
            put(0x7D, "F14");
            put(0x7E, "F15");
            put(0x7F, "F16");
            put(0x80, "F17");
            put(0x81, "F18");
            put(0x82, "F19");
            put(0x83, "F20");
            put(0x84, "F21");
            put(0x85, "F22");
            put(0x86, "F23");
            put(0x87, "F24");

            put(0x88, "Unassigned25"); // none
            put(0x89, "Unassigned26"); // none
            put(0x8A, "Unassigned27"); // none
            put(0x8B, "Unassigned28"); // none
            put(0x8C, "Unassigned29"); // none
            put(0x8D, "Unassigned30"); // none
            put(0x8E, "Unassigned31"); // none
            put(0x8F, "Unassigned32"); // none

            put(0x90, "NumLock");
            put(0x91, "ScrollLock");

            put(0x92, "Unassigned33"); // none
            put(0x93, "Unassigned34"); // none
            put(0x94, "Unassigned35"); // none
            put(0x95, "Unassigned36"); // none
            put(0x96, "Unassigned37"); // none
            put(0x97, "Unassigned38"); // none
            put(0x98, "Unassigned39"); // none
            put(0x99, "Unassigned40"); // none
            put(0x9A, "Unassigned41"); // none
            put(0x9B, "Unassigned42"); // none
            put(0x9C, "Unassigned43"); // none
            put(0x9D, "Unassigned44"); // none
            put(0x9E, "Unassigned45"); // none
            put(0x9F, "Unassigned46"); // none

            put(0xA0, "LShift"); // Left Shift
            put(0xA1, "RShift"); // Right SHIFT
            put(0xA2, "LCtrl"); // Left Ctrl
            put(0xA3, "RCtrl"); // Right Ctrl
            put(0xA4, "LAlt"); // Left Alt
            put(0xA5, "RAlt"); // Right Alt

            put(0xA6, "Unassigned47"); // none
            put(0xA7, "Unassigned48"); // none
            put(0xA8, "Unassigned49"); // none
            put(0xA9, "Unassigned50"); // none
            put(0xAA, "Unassigned51"); // none
            put(0xAB, "Unassigned52"); // none
            put(0xAC, "Unassigned53"); // none
            put(0xAD, "Unassigned54"); // none
            put(0xAE, "Unassigned55"); // none
            put(0xAF, "Unassigned56"); // none
            put(0xB1, "Unassigned57"); // none
            put(0xB2, "Unassigned58"); // none
            put(0xB3, "Unassigned59"); // none
            put(0xB4, "Unassigned60"); // none
            put(0xB5, "Unassigned61"); // none
            put(0xB6, "Unassigned62"); // none
            put(0xB7, "Unassigned63"); // none
            put(0xB8, "Unassigned64"); // none
            put(0xB9, "Unassigned65"); // none

            put(0xBA, ";"); // ";", ":"
            put(0xBB, "+");
            put(0xBC, ",");
            put(0xBD, "-");
            put(0xBE, ".");
            put(0xBF, "/"); // "/", "?"
            put(0xC0, "~");

            put(0xC1, "Unassigned66"); // none
            put(0xC2, "Unassigned67"); // none
            put(0xC3, "Unassigned68"); // none
            put(0xC4, "Unassigned69"); // none
            put(0xC5, "Unassigned70"); // none
            put(0xC6, "Unassigned71"); // none
            put(0xC7, "Unassigned72"); // none
            put(0xC8, "Unassigned73"); // none
            put(0xC9, "Unassigned74"); // none
            put(0xCA, "Unassigned75"); // none
            put(0xCB, "Unassigned76"); // none
            put(0xCC, "Unassigned77"); // none
            put(0xCD, "Unassigned78"); // none
            put(0xCE, "Unassigned79"); // none
            put(0xCF, "Unassigned80"); // none
            put(0xD1, "Unassigned81"); // none
            put(0xD2, "Unassigned82"); // none
            put(0xD3, "Unassigned83"); // none
            put(0xD4, "Unassigned84"); // none
            put(0xD5, "Unassigned85"); // none
            put(0xD6, "Unassigned86"); // none
            put(0xD7, "Unassigned87"); // none
            put(0xD8, "Unassigned88"); // none
            put(0xD9, "Unassigned89"); // none
            put(0xDA, "Unassigned90"); // none

            put(0xDB, "[");
            put(0xDC, "\\");
            put(0xDD, "]");
            put(0xDE, "'");
            put(0XDF, "OEM8"); // like BA-DE

            put(0xE0, "Unassigned91"); // none
            put(0xE1, "Unassigned92"); // none

            put(0xE2, "\\"); // "<", ">" for US, "\\|" for non-US 102-key keyboard

            put(0xE3, "Unassigned93"); // none
            put(0xE4, "Unassigned94"); // none
            put(0xE5, "Unassigned95"); // none
            put(0xE6, "Unassigned96"); // none
            put(0xE7, "Unassigned97"); // none
            put(0xE8, "Unassigned98"); // none
            put(0xE9, "Unassigned99"); // none
            put(0xEA, "Unassigned100"); // none
            put(0xEB, "Unassigned101"); // none
            put(0xEC, "Unassigned102"); // none
            put(0xED, "Unassigned103"); // none
            put(0xEE, "Unassigned104"); // none
            put(0xEF, "Unassigned105"); // none
            put(0xF1, "Unassigned106"); // none
            put(0xF2, "Unassigned107"); // none
            put(0xF3, "Unassigned108"); // none
            put(0xF4, "Unassigned109"); // none
            put(0xF5, "Unassigned110"); // none

            put(0xF6, "Attn");
            put(0xF7, "CrSel");
            put(0xF8, "ExSel");
            put(0xF9, "EREOF"); // Erase EOF key
            put(0xFA, "Play");
            put(0xFB, "Zoom");

            put(0xFC, "Unassigned111"); // none

            put(0xFD, "PA1");
            put(0xFE, "Clear");

        }};
    }
    public static String get(int vk){
        return descriptions.getOrDefault(vk, "Unassigned");
    }
}
