package h1;

import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class a {
    private static String a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    public static void b(String str, String str2, Object obj) {
        String e6 = e(str);
        if (Log.isLoggable(e6, 3)) {
            Log.d(e6, String.format(str2, obj));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        String e6 = e(str);
        if (Log.isLoggable(e6, 3)) {
            Log.d(e6, String.format(str2, objArr));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String e6 = e(str);
        if (Log.isLoggable(e6, 6)) {
            Log.e(e6, str2, th);
        }
    }

    private static String e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static void f(String str, String str2, Object obj) {
        String e6 = e(str);
        if (Log.isLoggable(e6, 4)) {
            Log.i(e6, String.format(str2, obj));
        }
    }

    public static void g(String str, String str2, Object obj) {
        String e6 = e(str);
        if (Log.isLoggable(e6, 5)) {
            Log.w(e6, String.format(str2, obj));
        }
    }
}
