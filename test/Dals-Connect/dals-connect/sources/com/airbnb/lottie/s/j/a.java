package com.airbnb.lottie.s.j;

import android.graphics.PointF;

/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public class a implements b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.m<PointF, PointF> f8126b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.f f8127c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8128d;

    public a(String str, com.airbnb.lottie.s.i.m<PointF, PointF> mVar, com.airbnb.lottie.s.i.f fVar, boolean z) {
        this.a = str;
        this.f8126b = mVar;
        this.f8127c = fVar;
        this.f8128d = z;
    }

    @Override // com.airbnb.lottie.s.j.b
    public com.airbnb.lottie.q.a.b a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar) {
        return new com.airbnb.lottie.q.a.e(fVar, aVar, this);
    }

    public String b() {
        return this.a;
    }

    public com.airbnb.lottie.s.i.m<PointF, PointF> c() {
        return this.f8126b;
    }

    public com.airbnb.lottie.s.i.f d() {
        return this.f8127c;
    }

    public boolean e() {
        return this.f8128d;
    }
}
