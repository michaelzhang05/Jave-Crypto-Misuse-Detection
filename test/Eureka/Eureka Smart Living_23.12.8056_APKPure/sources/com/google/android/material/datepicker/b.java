package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.b1;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f4924a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f4925b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f4926c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f4927d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4928e;

    /* renamed from: f, reason: collision with root package name */
    private final c3.k f4929f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i6, c3.k kVar, Rect rect) {
        androidx.core.util.h.c(rect.left);
        androidx.core.util.h.c(rect.top);
        androidx.core.util.h.c(rect.right);
        androidx.core.util.h.c(rect.bottom);
        this.f4924a = rect;
        this.f4925b = colorStateList2;
        this.f4926c = colorStateList;
        this.f4927d = colorStateList3;
        this.f4928e = i6;
        this.f4929f = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(Context context, int i6) {
        androidx.core.util.h.a(i6 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, m2.j.H2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(m2.j.I2, 0), obtainStyledAttributes.getDimensionPixelOffset(m2.j.K2, 0), obtainStyledAttributes.getDimensionPixelOffset(m2.j.J2, 0), obtainStyledAttributes.getDimensionPixelOffset(m2.j.L2, 0));
        ColorStateList a6 = z2.c.a(context, obtainStyledAttributes, m2.j.M2);
        ColorStateList a7 = z2.c.a(context, obtainStyledAttributes, m2.j.R2);
        ColorStateList a8 = z2.c.a(context, obtainStyledAttributes, m2.j.P2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(m2.j.Q2, 0);
        c3.k m6 = c3.k.b(context, obtainStyledAttributes.getResourceId(m2.j.N2, 0), obtainStyledAttributes.getResourceId(m2.j.O2, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a6, a7, a8, dimensionPixelSize, m6, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(TextView textView) {
        c(textView, null);
    }

    void c(TextView textView, ColorStateList colorStateList) {
        c3.g gVar = new c3.g();
        c3.g gVar2 = new c3.g();
        gVar.setShapeAppearanceModel(this.f4929f);
        gVar2.setShapeAppearanceModel(this.f4929f);
        if (colorStateList == null) {
            colorStateList = this.f4926c;
        }
        gVar.R(colorStateList);
        gVar.W(this.f4928e, this.f4927d);
        textView.setTextColor(this.f4925b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f4925b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f4924a;
        b1.u0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
