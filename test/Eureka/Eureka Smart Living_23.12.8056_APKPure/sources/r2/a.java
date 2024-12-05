package r2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import z2.b;

/* loaded from: classes.dex */
public abstract class a {
    public static int a(int i6, int i7) {
        return androidx.core.graphics.a.j(i6, (Color.alpha(i6) * i7) / 255);
    }

    public static int b(Context context, int i6, int i7) {
        TypedValue a6 = b.a(context, i6);
        return a6 != null ? l(context, a6) : i7;
    }

    public static int c(Context context, int i6, String str) {
        return l(context, b.e(context, i6, str));
    }

    public static int d(View view, int i6) {
        return l(view.getContext(), b.f(view, i6));
    }

    public static int e(View view, int i6, int i7) {
        return b(view.getContext(), i6, i7);
    }

    public static ColorStateList f(Context context, int i6, ColorStateList colorStateList) {
        TypedValue a6 = b.a(context, i6);
        ColorStateList m6 = a6 != null ? m(context, a6) : null;
        return m6 == null ? colorStateList : m6;
    }

    public static ColorStateList g(Context context, int i6) {
        TypedValue a6 = b.a(context, i6);
        if (a6 == null) {
            return null;
        }
        int i7 = a6.resourceId;
        if (i7 != 0) {
            return androidx.core.content.a.d(context, i7);
        }
        int i8 = a6.data;
        if (i8 != 0) {
            return ColorStateList.valueOf(i8);
        }
        return null;
    }

    public static boolean h(int i6) {
        return i6 != 0 && androidx.core.graphics.a.c(i6) > 0.5d;
    }

    public static int i(int i6, int i7) {
        return androidx.core.graphics.a.f(i7, i6);
    }

    public static int j(int i6, int i7, float f6) {
        return i(i6, androidx.core.graphics.a.j(i7, Math.round(Color.alpha(i7) * f6)));
    }

    public static int k(View view, int i6, int i7, float f6) {
        return j(d(view, i6), d(view, i7), f6);
    }

    private static int l(Context context, TypedValue typedValue) {
        int i6 = typedValue.resourceId;
        return i6 != 0 ? androidx.core.content.a.c(context, i6) : typedValue.data;
    }

    private static ColorStateList m(Context context, TypedValue typedValue) {
        int i6 = typedValue.resourceId;
        return i6 != 0 ? androidx.core.content.a.d(context, i6) : ColorStateList.valueOf(typedValue.data);
    }
}
