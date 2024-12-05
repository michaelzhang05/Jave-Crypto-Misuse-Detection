package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f19970a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f19971b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f19972c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f19973d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f19974e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f19975f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f19976g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f19977h = true;

    static {
        if (!MBridgeConstans.DEBUG) {
            f19976g = false;
            f19970a = false;
            f19972c = false;
            f19977h = false;
            f19971b = false;
            f19975f = false;
            f19974e = false;
            f19973d = false;
        }
    }

    public static void a(String str, String str2) {
        if (!f19970a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f19971b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (f19972c && !TextUtils.isEmpty(str2)) {
            Log.i(a(str), str2);
        }
    }

    public static void d(String str, String str2) {
        if (f19977h && !TextUtils.isEmpty(str2)) {
            Log.w(a(str), str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (!f19977h || TextUtils.isEmpty(str2)) {
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
        if (!f19971b || str2 == null || th == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        if (!f19977h || th == null) {
            return;
        }
        Log.w(a(str), th);
    }
}
