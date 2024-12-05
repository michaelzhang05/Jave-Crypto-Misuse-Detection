package com.airbnb.lottie.s.j;

import android.graphics.Path;

/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public class m implements b {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f8184b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8185c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.a f8186d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.d f8187e;

    public m(String str, boolean z, Path.FillType fillType, com.airbnb.lottie.s.i.a aVar, com.airbnb.lottie.s.i.d dVar) {
        this.f8185c = str;
        this.a = z;
        this.f8184b = fillType;
        this.f8186d = aVar;
        this.f8187e = dVar;
    }

    @Override // com.airbnb.lottie.s.j.b
    public com.airbnb.lottie.q.a.b a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar) {
        return new com.airbnb.lottie.q.a.f(fVar, aVar, this);
    }

    public com.airbnb.lottie.s.i.a b() {
        return this.f8186d;
    }

    public Path.FillType c() {
        return this.f8184b;
    }

    public String d() {
        return this.f8185c;
    }

    public com.airbnb.lottie.s.i.d e() {
        return this.f8187e;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
