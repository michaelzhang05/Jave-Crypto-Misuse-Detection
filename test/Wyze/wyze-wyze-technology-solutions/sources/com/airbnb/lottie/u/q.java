package com.airbnb.lottie.u;

import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
class q {
    private static final Interpolator a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    private static c.e.h<WeakReference<Interpolator>> f8256b;

    q() {
    }

    private static WeakReference<Interpolator> a(int i2) {
        WeakReference<Interpolator> g2;
        synchronized (q.class) {
            g2 = e().g(i2);
        }
        return g2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> com.airbnb.lottie.w.a<T> b(JsonReader jsonReader, com.airbnb.lottie.d dVar, float f2, j0<T> j0Var, boolean z) throws IOException {
        if (z) {
            return c(dVar, jsonReader, f2, j0Var);
        }
        return d(jsonReader, f2, j0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> com.airbnb.lottie.w.a<T> c(com.airbnb.lottie.d r16, android.util.JsonReader r17, float r18, com.airbnb.lottie.u.j0<T> r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.u.q.c(com.airbnb.lottie.d, android.util.JsonReader, float, com.airbnb.lottie.u.j0):com.airbnb.lottie.w.a");
    }

    private static <T> com.airbnb.lottie.w.a<T> d(JsonReader jsonReader, float f2, j0<T> j0Var) throws IOException {
        return new com.airbnb.lottie.w.a<>(j0Var.a(jsonReader, f2));
    }

    private static c.e.h<WeakReference<Interpolator>> e() {
        if (f8256b == null) {
            f8256b = new c.e.h<>();
        }
        return f8256b;
    }

    private static void f(int i2, WeakReference<Interpolator> weakReference) {
        synchronized (q.class) {
            f8256b.l(i2, weakReference);
        }
    }
}
