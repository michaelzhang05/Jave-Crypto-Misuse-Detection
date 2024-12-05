package androidx.biometric;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
abstract class n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, t0.f1356a);
    }

    private static boolean b(Context context, String str, int i6) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i6)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(Context context, String str, int i6) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i6)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(Context context, String str, int i6) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i6)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return b(context, str, t0.f1359d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, t0.f1360e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return d(context, str, t0.f1358c) || c(context, str2, t0.f1357b);
    }
}
