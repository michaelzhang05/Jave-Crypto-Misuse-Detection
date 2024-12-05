package m5;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static int f7952a = 6;

    public static void a(String str, String str2) {
        if (3 >= f7952a) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (3 >= f7952a) {
            Log.d(str, String.format(str2, objArr));
        }
    }

    public static void c(String str, String str2) {
        if (6 >= f7952a) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (6 >= f7952a) {
            Log.e(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (4 >= f7952a) {
            Log.i(str, str2);
        }
    }

    public static void f(String str, String str2) {
        if (2 >= f7952a) {
            Log.v(str, str2);
        }
    }

    public static void g(String str, String str2) {
        if (5 >= f7952a) {
            Log.w(str, str2);
        }
    }

    public static void h(String str, String str2, Throwable th) {
        if (5 >= f7952a) {
            Log.w(str, str2, th);
        }
    }

    public static void i(String str, Throwable th) {
        if (5 >= f7952a) {
            Log.w(str, th);
        }
    }
}
