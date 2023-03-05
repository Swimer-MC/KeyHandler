#include "org_ReStudios_keyhandler_KeyHandler.h";
#include <windows.h>


JNIEnv* jniEnv;
jclass javaClass;

LRESULT CALLBACK KeyboardProc(int nCode, WPARAM wParam, LPARAM lParam)
{
    if (nCode == HC_ACTION && (wParam == WM_KEYDOWN || wParam == WM_SYSKEYDOWN))
    {
        KBDLLHOOKSTRUCT* pKbdStruct = reinterpret_cast<KBDLLHOOKSTRUCT*>(lParam);

        jmethodID methodID = jniEnv->GetStaticMethodID(javaClass, "m1", "(I)V");
        if (methodID == nullptr)
        {
            return CallNextHookEx(nullptr, nCode, wParam, lParam);
        }

        jniEnv->CallStaticVoidMethod(javaClass, methodID, static_cast<jint>(pKbdStruct->vkCode));

    }
    else if (nCode == HC_ACTION && (wParam == WM_KEYUP || wParam == WM_SYSKEYUP))
    {
        KBDLLHOOKSTRUCT* pKbdStruct = reinterpret_cast<KBDLLHOOKSTRUCT*>(lParam);


        jmethodID methodID = jniEnv->GetStaticMethodID(javaClass, "m2", "(I)V");
        if (methodID == nullptr)
        {
            return CallNextHookEx(nullptr, nCode, wParam, lParam);
        }

        jniEnv->CallStaticVoidMethod(javaClass, methodID, static_cast<jint>(pKbdStruct->vkCode));
    }

    return CallNextHookEx(nullptr, nCode, wParam, lParam);
}


JNIEXPORT void JNICALL Java_org_ReStudios_keyhandler_KeyHandler_m0(JNIEnv* env, jclass clazz)
{


    jniEnv = env;
    javaClass = clazz;

    HINSTANCE hInstance = GetModuleHandle(nullptr);

    HHOOK hHook = SetWindowsHookEx(WH_KEYBOARD_LL, KeyboardProc, hInstance, 0);

    MSG msg;
    while (GetMessage(&msg, nullptr, 0, 0))
    {
        TranslateMessage(&msg);
        DispatchMessage(&msg);
    }

    UnhookWindowsHookEx(hHook);
}
JNIEXPORT jboolean JNICALL Java_org_ReStudios_keyhandler_KeyHandler_m3(JNIEnv* env, jclass clazz, jint vk) {
    // Получаем состояние клавиатуры
    SHORT state = GetAsyncKeyState(vk);
    // Проверяем, нажата ли кнопка vk (состояние младшего бита равно 1)
    if (state & 0x0001) {
        return JNI_TRUE; // Кнопка нажата
    }
    else {
        return JNI_FALSE; // Кнопка не нажата
    }
}
