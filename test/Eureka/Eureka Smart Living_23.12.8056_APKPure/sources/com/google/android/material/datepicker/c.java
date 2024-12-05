package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    final b f4930a;

    /* renamed from: b, reason: collision with root package name */
    final b f4931b;

    /* renamed from: c, reason: collision with root package name */
    final b f4932c;

    /* renamed from: d, reason: collision with root package name */
    final b f4933d;

    /* renamed from: e, reason: collision with root package name */
    final b f4934e;

    /* renamed from: f, reason: collision with root package name */
    final b f4935f;

    /* renamed from: g, reason: collision with root package name */
    final b f4936g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f4937h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z2.b.d(context, m2.a.f7568v, j.class.getCanonicalName()), m2.j.f7864y2);
        this.f4930a = b.a(context, obtainStyledAttributes.getResourceId(m2.j.B2, 0));
        this.f4936g = b.a(context, obtainStyledAttributes.getResourceId(m2.j.f7870z2, 0));
        this.f4931b = b.a(context, obtainStyledAttributes.getResourceId(m2.j.A2, 0));
        this.f4932c = b.a(context, obtainStyledAttributes.getResourceId(m2.j.C2, 0));
        ColorStateList a6 = z2.c.a(context, obtainStyledAttributes, m2.j.D2);
        this.f4933d = b.a(context, obtainStyledAttributes.getResourceId(m2.j.F2, 0));
        this.f4934e = b.a(context, obtainStyledAttributes.getResourceId(m2.j.E2, 0));
        this.f4935f = b.a(context, obtainStyledAttributes.getResourceId(m2.j.G2, 0));
        Paint paint = new Paint();
        this.f4937h = paint;
        paint.setColor(a6.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
