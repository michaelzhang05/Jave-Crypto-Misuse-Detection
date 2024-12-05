package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.u;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes2.dex */
final class a {
    private final Rect a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f16548b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f16549c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f16550d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16551e;

    /* renamed from: f, reason: collision with root package name */
    private final e.e.b.b.z.k f16552f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, e.e.b.b.z.k kVar, Rect rect) {
        c.h.j.j.b(rect.left);
        c.h.j.j.b(rect.top);
        c.h.j.j.b(rect.right);
        c.h.j.j.b(rect.bottom);
        this.a = rect;
        this.f16548b = colorStateList2;
        this.f16549c = colorStateList;
        this.f16550d = colorStateList3;
        this.f16551e = i2;
        this.f16552f = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Context context, int i2) {
        c.h.j.j.a(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, e.e.b.b.l.X2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(e.e.b.b.l.Y2, 0), obtainStyledAttributes.getDimensionPixelOffset(e.e.b.b.l.a3, 0), obtainStyledAttributes.getDimensionPixelOffset(e.e.b.b.l.Z2, 0), obtainStyledAttributes.getDimensionPixelOffset(e.e.b.b.l.b3, 0));
        ColorStateList a = e.e.b.b.w.c.a(context, obtainStyledAttributes, e.e.b.b.l.c3);
        ColorStateList a2 = e.e.b.b.w.c.a(context, obtainStyledAttributes, e.e.b.b.l.h3);
        ColorStateList a3 = e.e.b.b.w.c.a(context, obtainStyledAttributes, e.e.b.b.l.f3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.e.b.b.l.g3, 0);
        e.e.b.b.z.k m = e.e.b.b.z.k.b(context, obtainStyledAttributes.getResourceId(e.e.b.b.l.d3, 0), obtainStyledAttributes.getResourceId(e.e.b.b.l.e3, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(TextView textView) {
        e.e.b.b.z.g gVar = new e.e.b.b.z.g();
        e.e.b.b.z.g gVar2 = new e.e.b.b.z.g();
        gVar.setShapeAppearanceModel(this.f16552f);
        gVar2.setShapeAppearanceModel(this.f16552f);
        gVar.X(this.f16549c);
        gVar.f0(this.f16551e, this.f16550d);
        textView.setTextColor(this.f16548b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f16548b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.a;
        u.m0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
