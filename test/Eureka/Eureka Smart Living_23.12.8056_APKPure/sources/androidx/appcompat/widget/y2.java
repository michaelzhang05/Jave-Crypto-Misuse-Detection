package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class y2 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f1277a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f1278b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f1279c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f1280d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f1281e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f1282f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f1283g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f1284h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f1285i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f1286j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d.j.f6371y0);
        try {
            if (!obtainStyledAttributes.hasValue(d.j.D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i6) {
        ColorStateList e6 = e(context, i6);
        if (e6 != null && e6.isStateful()) {
            return e6.getColorForState(f1278b, e6.getDefaultColor());
        }
        TypedValue f6 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f6, true);
        return d(context, i6, f6.getFloat());
    }

    public static int c(Context context, int i6) {
        int[] iArr = f1286j;
        iArr[0] = i6;
        c3 u5 = c3.u(context, null, iArr);
        try {
            return u5.b(0, 0);
        } finally {
            u5.w();
        }
    }

    static int d(Context context, int i6, float f6) {
        return androidx.core.graphics.a.j(c(context, i6), Math.round(Color.alpha(r0) * f6));
    }

    public static ColorStateList e(Context context, int i6) {
        int[] iArr = f1286j;
        iArr[0] = i6;
        c3 u5 = c3.u(context, null, iArr);
        try {
            return u5.c(0);
        } finally {
            u5.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f1277a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
