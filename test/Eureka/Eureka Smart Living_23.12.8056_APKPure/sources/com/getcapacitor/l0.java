package com.getcapacitor;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static c0 f4437a;

    /* renamed from: b, reason: collision with root package name */
    private static l0 f4438b;

    public static void a(String str) {
        b("Capacitor", str);
    }

    public static void b(String str, String str2) {
        if (j()) {
            Log.d(str, str2);
        }
    }

    public static void c(String str) {
        d("Capacitor", str, null);
    }

    public static void d(String str, String str2, Throwable th) {
        if (j()) {
            Log.e(str, str2, th);
        }
    }

    public static void e(String str, Throwable th) {
        d("Capacitor", str, th);
    }

    private static l0 f() {
        if (f4438b == null) {
            f4438b = new l0();
        }
        return f4438b;
    }

    public static void g(String str, String str2) {
        if (j()) {
            Log.i(str, str2);
        }
    }

    public static void h(c0 c0Var) {
        f().i(c0Var);
    }

    private void i(c0 c0Var) {
        f4437a = c0Var;
    }

    public static boolean j() {
        c0 c0Var = f4437a;
        return c0Var == null || c0Var.r();
    }

    public static String k(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return "Capacitor";
        }
        return "Capacitor/" + TextUtils.join("/", strArr);
    }

    public static void l(String str) {
        m("Capacitor", str);
    }

    public static void m(String str, String str2) {
        if (j()) {
            Log.v(str, str2);
        }
    }

    public static void n(String str) {
        o("Capacitor", str);
    }

    public static void o(String str, String str2) {
        if (j()) {
            Log.w(str, str2);
        }
    }
}
