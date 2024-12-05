package com.airbnb.lottie.q.b;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    private final List<? extends com.airbnb.lottie.w.a<K>> f8058c;

    /* renamed from: e, reason: collision with root package name */
    protected com.airbnb.lottie.w.c<A> f8060e;

    /* renamed from: f, reason: collision with root package name */
    private com.airbnb.lottie.w.a<K> f8061f;
    final List<InterfaceC0101a> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f8057b = false;

    /* renamed from: d, reason: collision with root package name */
    private float f8059d = 0.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: com.airbnb.lottie.q.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0101a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<? extends com.airbnb.lottie.w.a<K>> list) {
        this.f8058c = list;
    }

    private com.airbnb.lottie.w.a<K> b() {
        com.airbnb.lottie.w.a<K> aVar = this.f8061f;
        if (aVar != null && aVar.a(this.f8059d)) {
            return this.f8061f;
        }
        com.airbnb.lottie.w.a<K> aVar2 = this.f8058c.get(r0.size() - 1);
        if (this.f8059d < aVar2.c()) {
            for (int size = this.f8058c.size() - 1; size >= 0; size--) {
                aVar2 = this.f8058c.get(size);
                if (aVar2.a(this.f8059d)) {
                    break;
                }
            }
        }
        this.f8061f = aVar2;
        return aVar2;
    }

    private float d() {
        com.airbnb.lottie.w.a<K> b2 = b();
        if (b2.d()) {
            return 0.0f;
        }
        return b2.f8271d.getInterpolation(e());
    }

    private float g() {
        if (this.f8058c.isEmpty()) {
            return 0.0f;
        }
        return this.f8058c.get(0).c();
    }

    public void a(InterfaceC0101a interfaceC0101a) {
        this.a.add(interfaceC0101a);
    }

    float c() {
        if (this.f8058c.isEmpty()) {
            return 1.0f;
        }
        return this.f8058c.get(r0.size() - 1).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        if (this.f8057b) {
            return 0.0f;
        }
        com.airbnb.lottie.w.a<K> b2 = b();
        if (b2.d()) {
            return 0.0f;
        }
        return (this.f8059d - b2.c()) / (b2.b() - b2.c());
    }

    public float f() {
        return this.f8059d;
    }

    public A h() {
        return i(b(), d());
    }

    abstract A i(com.airbnb.lottie.w.a<K> aVar, float f2);

    public void j() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            this.a.get(i2).a();
        }
    }

    public void k() {
        this.f8057b = true;
    }

    public void l(float f2) {
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.f8059d) {
            return;
        }
        this.f8059d = f2;
        j();
    }

    public void m(com.airbnb.lottie.w.c<A> cVar) {
        com.airbnb.lottie.w.c<A> cVar2 = this.f8060e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f8060e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
