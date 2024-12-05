package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f21025a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f21026b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21027c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f21028d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f21029e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f21030f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f21031g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f21032h = true;

    static {
        if (!MBridgeConstans.DEBUG) {
            f21031g = false;
            f21025a = false;
            f21027c = false;
            f21032h = false;
            f21026b = false;
            f21030f = false;
            f21029e = false;
            f21028d = false;
        }
    }

    public static void a(String str, String str2) {
        if (!f21025a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f21026b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (f21027c && !TextUtils.isEmpty(str2)) {
            Log.i(a(str), str2);
        }
    }

    public static void d(String str, String str2) {
        if (f21032h && !TextUtils.isEmpty(str2)) {
            Log.w(a(str), str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (!f21032h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f21026b || str2 == null || th == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        if (!f21032h || th == null) {
            return;
        }
        Log.w(a(str), th);
    }
}
