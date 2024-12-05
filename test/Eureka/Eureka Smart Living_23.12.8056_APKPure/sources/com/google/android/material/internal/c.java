package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.a3;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(Window window, boolean z5, Integer num, Integer num2) {
        boolean z6 = num == null || num.intValue() == 0;
        boolean z7 = num2 == null || num2.intValue() == 0;
        if (z6 || z7) {
            int b6 = r2.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z6) {
                num = Integer.valueOf(b6);
            }
            if (z7) {
                num2 = Integer.valueOf(b6);
            }
        }
        a3.b(window, !z5);
        int c6 = c(window.getContext(), z5);
        int b7 = b(window.getContext(), z5);
        window.setStatusBarColor(c6);
        window.setNavigationBarColor(b7);
        f(window, d(c6, r2.a.h(num.intValue())));
        e(window, d(b7, r2.a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z5) {
        if (z5 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.a.j(r2.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z5) {
            return 0;
        }
        return r2.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z5) {
        if (z5 && Build.VERSION.SDK_INT < 23) {
            return androidx.core.graphics.a.j(r2.a.b(context, R.attr.statusBarColor, -16777216), 128);
        }
        if (z5) {
            return 0;
        }
        return r2.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i6, boolean z5) {
        return r2.a.h(i6) || (i6 == 0 && z5);
    }

    public static void e(Window window, boolean z5) {
        a3.a(window, window.getDecorView()).c(z5);
    }

    public static void f(Window window, boolean z5) {
        a3.a(window, window.getDecorView()).d(z5);
    }
}
