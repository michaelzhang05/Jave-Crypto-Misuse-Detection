package androidx.core.view;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class z {

    /* loaded from: classes.dex */
    static class a {
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
            marginLayoutParams.resolveLayoutDirection(i6);
        }

        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
            marginLayoutParams.setLayoutDirection(i6);
        }

        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
            marginLayoutParams.setMarginEnd(i6);
        }

        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
            marginLayoutParams.setMarginStart(i6);
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
        a.g(marginLayoutParams, i6);
    }

    public static void d(ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
        a.h(marginLayoutParams, i6);
    }
}
