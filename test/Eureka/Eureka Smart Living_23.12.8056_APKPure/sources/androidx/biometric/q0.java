package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
abstract class q0 {

    /* loaded from: classes.dex */
    private static class a {
        static boolean a(KeyguardManager keyguardManager) {
            return keyguardManager.isKeyguardSecure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        static KeyguardManager a(Context context) {
            Object systemService;
            systemService = context.getSystemService((Class<Object>) KeyguardManager.class);
            return (KeyguardManager) systemService;
        }

        static boolean b(KeyguardManager keyguardManager) {
            boolean isDeviceSecure;
            isDeviceSecure = keyguardManager.isDeviceSecure();
            return isDeviceSecure;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeyguardManager a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context) {
        KeyguardManager a6 = a(context);
        if (a6 == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 23 ? b.b(a6) : a.a(a6);
    }
}
