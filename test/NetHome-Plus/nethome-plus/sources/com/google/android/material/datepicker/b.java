package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalendarStyle.java */
/* loaded from: classes2.dex */
public final class b {
    final a a;

    /* renamed from: b, reason: collision with root package name */
    final a f16553b;

    /* renamed from: c, reason: collision with root package name */
    final a f16554c;

    /* renamed from: d, reason: collision with root package name */
    final a f16555d;

    /* renamed from: e, reason: collision with root package name */
    final a f16556e;

    /* renamed from: f, reason: collision with root package name */
    final a f16557f;

    /* renamed from: g, reason: collision with root package name */
    final a f16558g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f16559h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.e.b.b.w.b.c(context, e.e.b.b.b.v, e.class.getCanonicalName()), e.e.b.b.l.O2);
        this.a = a.a(context, obtainStyledAttributes.getResourceId(e.e.b.b.l.R2, 0));
        this.f16558g = a.a(context, obtainStyledAttributes.getResourceId(e.e.b.b.l.P2, 0));
        this.f16553b = a.a(context, obtainStyledAttributes.getResourceId(e.e.b.b.l.Q2, 0));
        this.f16554c = a.a(context, obtainStyledAttributes.getResourceId(e.e.b.b.l.S2, 0));
        ColorStateList a = e.e.b.b.w.c.a(context, obtainStyledAttributes, e.e.b.b.l.T2);
        this.f16555d = a.a(context, obtainStyledAttributes.getResourceId(e.e.b.b.l.V2, 0));
        this.f16556e = a.a(context, obtainStyledAttributes.getResourceId(e.e.b.b.l.U2, 0));
        this.f16557f = a.a(context, obtainStyledAttributes.getResourceId(e.e.b.b.l.W2, 0));
        Paint paint = new Paint();
        this.f16559h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
