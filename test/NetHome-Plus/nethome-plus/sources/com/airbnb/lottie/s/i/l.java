package com.airbnb.lottie.s.i;

import android.graphics.PointF;
import com.airbnb.lottie.q.b.o;

/* compiled from: AnimatableTransform.java */
/* loaded from: classes.dex */
public class l implements com.airbnb.lottie.s.j.b {
    private final e a;

    /* renamed from: b, reason: collision with root package name */
    private final m<PointF, PointF> f8120b;

    /* renamed from: c, reason: collision with root package name */
    private final g f8121c;

    /* renamed from: d, reason: collision with root package name */
    private final b f8122d;

    /* renamed from: e, reason: collision with root package name */
    private final d f8123e;

    /* renamed from: f, reason: collision with root package name */
    private final b f8124f;

    /* renamed from: g, reason: collision with root package name */
    private final b f8125g;

    public l() {
        this(new e(), new e(), new g(), new b(), new d(), new b(), new b());
    }

    @Override // com.airbnb.lottie.s.j.b
    public com.airbnb.lottie.q.a.b a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar) {
        return null;
    }

    public o b() {
        return new o(this);
    }

    public e c() {
        return this.a;
    }

    public b d() {
        return this.f8125g;
    }

    public d e() {
        return this.f8123e;
    }

    public m<PointF, PointF> f() {
        return this.f8120b;
    }

    public b g() {
        return this.f8122d;
    }

    public g h() {
        return this.f8121c;
    }

    public b i() {
        return this.f8124f;
    }

    public l(e eVar, m<PointF, PointF> mVar, g gVar, b bVar, d dVar, b bVar2, b bVar3) {
        this.a = eVar;
        this.f8120b = mVar;
        this.f8121c = gVar;
        this.f8122d = bVar;
        this.f8123e = dVar;
        this.f8124f = bVar2;
        this.f8125g = bVar3;
    }
}
