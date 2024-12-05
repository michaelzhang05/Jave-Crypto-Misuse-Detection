package com.airbnb.lottie.s.j;

import android.graphics.PointF;

/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public class j implements b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.m<PointF, PointF> f8176b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.f f8177c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8178d;

    public j(String str, com.airbnb.lottie.s.i.m<PointF, PointF> mVar, com.airbnb.lottie.s.i.f fVar, com.airbnb.lottie.s.i.b bVar) {
        this.a = str;
        this.f8176b = mVar;
        this.f8177c = fVar;
        this.f8178d = bVar;
    }

    @Override // com.airbnb.lottie.s.j.b
    public com.airbnb.lottie.q.a.b a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar) {
        return new com.airbnb.lottie.q.a.n(fVar, aVar, this);
    }

    public com.airbnb.lottie.s.i.b b() {
        return this.f8178d;
    }

    public String c() {
        return this.a;
    }

    public com.airbnb.lottie.s.i.m<PointF, PointF> d() {
        return this.f8176b;
    }

    public com.airbnb.lottie.s.i.f e() {
        return this.f8177c;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f8176b + ", size=" + this.f8177c + '}';
    }
}
