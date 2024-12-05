package com.airbnb.lottie;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: L.java */
/* loaded from: classes.dex */
public class c {
    public static boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    private static String[] f7898d;

    /* renamed from: e, reason: collision with root package name */
    private static long[] f7899e;

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f7896b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f7897c = false;

    /* renamed from: f, reason: collision with root package name */
    private static int f7900f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static int f7901g = 0;

    public static void a(String str) {
        if (f7897c) {
            int i2 = f7900f;
            if (i2 == 20) {
                f7901g++;
                return;
            }
            f7898d[i2] = str;
            f7899e[i2] = System.nanoTime();
            androidx.core.os.c.a(str);
            f7900f++;
        }
    }

    public static void b(String str) {
        if (a) {
            Log.d("LOTTIE", str);
        }
    }

    public static float c(String str) {
        int i2 = f7901g;
        if (i2 > 0) {
            f7901g = i2 - 1;
            return 0.0f;
        }
        if (!f7897c) {
            return 0.0f;
        }
        int i3 = f7900f - 1;
        f7900f = i3;
        if (i3 != -1) {
            if (str.equals(f7898d[i3])) {
                androidx.core.os.c.b();
                return ((float) (System.nanoTime() - f7899e[f7900f])) / 1000000.0f;
            }
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f7898d[f7900f] + ".");
        }
        throw new IllegalStateException("Can't end trace section. There are none.");
    }

    public static void d(String str) {
        Set<String> set = f7896b;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str);
        set.add(str);
    }
}
