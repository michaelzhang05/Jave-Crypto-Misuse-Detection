package com.airbnb.lottie.q.b;

import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes.dex */
public class p<K, A> extends a<K, A> {

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.w.b<A> f8083g;

    public p(com.airbnb.lottie.w.c<A> cVar) {
        super(Collections.emptyList());
        this.f8083g = new com.airbnb.lottie.w.b<>();
        m(cVar);
    }

    @Override // com.airbnb.lottie.q.b.a
    float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.q.b.a
    public A h() {
        return this.f8060e.b(0.0f, 0.0f, null, null, f(), f(), f());
    }

    @Override // com.airbnb.lottie.q.b.a
    A i(com.airbnb.lottie.w.a<K> aVar, float f2) {
        return h();
    }

    @Override // com.airbnb.lottie.q.b.a
    public void j() {
        if (this.f8060e != null) {
            super.j();
        }
    }
}
