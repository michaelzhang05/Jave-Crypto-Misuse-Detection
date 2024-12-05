package com.airbnb.lottie.s;

import android.graphics.PointF;

/* compiled from: CubicCurveData.java */
/* loaded from: classes.dex */
public class a {
    private final PointF a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f8093b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f8094c;

    public a() {
        this.a = new PointF();
        this.f8093b = new PointF();
        this.f8094c = new PointF();
    }

    public PointF a() {
        return this.a;
    }

    public PointF b() {
        return this.f8093b;
    }

    public PointF c() {
        return this.f8094c;
    }

    public void d(float f2, float f3) {
        this.a.set(f2, f3);
    }

    public void e(float f2, float f3) {
        this.f8093b.set(f2, f3);
    }

    public void f(float f2, float f3) {
        this.f8094c.set(f2, f3);
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.f8093b = pointF2;
        this.f8094c = pointF3;
    }
}
