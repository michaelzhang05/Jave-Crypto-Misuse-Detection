package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.c3;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f5121a = {m2.a.f7556j};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f5122b = {m2.a.f7557k};

    public static void a(Context context) {
        e(context, f5121a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i6, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m2.j.B6, i6, i7);
        boolean z5 = obtainStyledAttributes.getBoolean(m2.j.D6, false);
        obtainStyledAttributes.recycle();
        if (z5) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(m2.a.f7565s, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f5122b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7, int... iArr2) {
        boolean z5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m2.j.B6, i6, i7);
        if (!obtainStyledAttributes.getBoolean(m2.j.E6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z5 = obtainStyledAttributes.getResourceId(m2.j.C6, -1) != -1;
        } else {
            z5 = f(context, attributeSet, iArr, i6, i7, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z5) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, i7);
        for (int i8 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i8, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(Context context) {
        return z2.b.b(context, m2.a.f7564r, false);
    }

    private static boolean h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            if (!obtainStyledAttributes.hasValue(i6)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray i(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7, int... iArr2) {
        b(context, attributeSet, i6, i7);
        d(context, attributeSet, iArr, i6, i7, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i6, i7);
    }

    public static c3 j(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7, int... iArr2) {
        b(context, attributeSet, i6, i7);
        d(context, attributeSet, iArr, i6, i7, iArr2);
        return c3.v(context, attributeSet, iArr, i6, i7);
    }
}
