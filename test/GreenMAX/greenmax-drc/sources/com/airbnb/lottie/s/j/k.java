package com.airbnb.lottie.s.j;

/* compiled from: Repeater.java */
/* loaded from: classes.dex */
public class k implements b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8179b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.b f8180c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.s.i.l f8181d;

    public k(String str, com.airbnb.lottie.s.i.b bVar, com.airbnb.lottie.s.i.b bVar2, com.airbnb.lottie.s.i.l lVar) {
        this.a = str;
        this.f8179b = bVar;
        this.f8180c = bVar2;
        this.f8181d = lVar;
    }

    @Override // com.airbnb.lottie.s.j.b
    public com.airbnb.lottie.q.a.b a(com.airbnb.lottie.f fVar, com.airbnb.lottie.s.k.a aVar) {
        return new com.airbnb.lottie.q.a.o(fVar, aVar, this);
    }

    public com.airbnb.lottie.s.i.b b() {
        return this.f8179b;
    }

    public String c() {
        return this.a;
    }

    public com.airbnb.lottie.s.i.b d() {
        return this.f8180c;
    }

    public com.airbnb.lottie.s.i.l e() {
        return this.f8181d;
    }
}
