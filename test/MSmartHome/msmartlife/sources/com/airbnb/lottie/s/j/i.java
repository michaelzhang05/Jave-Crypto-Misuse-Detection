package com.airbnb.lottie.s.j;

import android.graphics.PointF;

/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public class i implements b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8164b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8165c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.m<PointF, PointF> f8166d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8167e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8168f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8169g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8170h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8171i;

    /* compiled from: PolystarShape.java */
    /* loaded from: classes.dex */
    public enum a {
        Star(1),
        Polygon(2);


        /* renamed from: i, reason: collision with root package name */
        private final int f8175i;

        a(int i2) {
            this.f8175i = i2;
        }

        public static a d(int i2) {
            for (a aVar : values()) {
                if (aVar.f8175i == i2) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public i(String str, a aVar, com.airbnb.lottie.s.i.b bVar, com.airbnb.lottie.s.i.m<PointF, PointF> mVar, com.airbnb.lottie.s.i.b bVar2, com.airbnb.lottie.s.i.b bVar3, com.airbnb.lottie.s.i.b bVar4, com.airbnb.lottie.s.i.b bVar5, com.airbnb.lottie.s.i.b bVar6) {
        this.a = str;
        this.f8164b = aVar;
        this.f8165c = bVar;
        this.f8166d = mVar;
        this.f8167e = bVar2;
        this.f8168f = bVar3;
        this.f8169g = bVar4;
        this.f8170h = bVar5;
        this.f8171i = bVar6;
    }

    @Override // com.airbnb.lottie.s.j.b
    public com.airbnb.lottie.q.a.b a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar) {
        return new com.airbnb.lottie.q.a.m(fVar, aVar, this);
    }

    public com.airbnb.lottie.s.i.b b() {
        return this.f8168f;
    }

    public com.airbnb.lottie.s.i.b c() {
        return this.f8170h;
    }

    public String d() {
        return this.a;
    }

    public com.airbnb.lottie.s.i.b e() {
        return this.f8169g;
    }

    public com.airbnb.lottie.s.i.b f() {
        return this.f8171i;
    }

    public com.airbnb.lottie.s.i.b g() {
        return this.f8165c;
    }

    public com.airbnb.lottie.s.i.m<PointF, PointF> h() {
        return this.f8166d;
    }

    public com.airbnb.lottie.s.i.b i() {
        return this.f8167e;
    }

    public a j() {
        return this.f8164b;
    }
}
