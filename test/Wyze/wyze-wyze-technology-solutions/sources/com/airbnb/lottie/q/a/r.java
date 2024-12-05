package com.airbnb.lottie.q.a;

import com.airbnb.lottie.q.b.a;
import com.airbnb.lottie.s.j.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public class r implements b, a.InterfaceC0101a {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a.InterfaceC0101a> f8052b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final q.a f8053c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, Float> f8054d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, Float> f8055e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.q.b.a<?, Float> f8056f;

    public r(com.airbnb.lottie.s.k.a aVar, com.airbnb.lottie.s.j.q qVar) {
        this.a = qVar.c();
        this.f8053c = qVar.f();
        com.airbnb.lottie.q.b.a<Float, Float> a = qVar.e().a();
        this.f8054d = a;
        com.airbnb.lottie.q.b.a<Float, Float> a2 = qVar.b().a();
        this.f8055e = a2;
        com.airbnb.lottie.q.b.a<Float, Float> a3 = qVar.d().a();
        this.f8056f = a3;
        aVar.i(a);
        aVar.i(a2);
        aVar.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // com.airbnb.lottie.q.b.a.InterfaceC0101a
    public void a() {
        for (int i2 = 0; i2 < this.f8052b.size(); i2++) {
            this.f8052b.get(i2).a();
        }
    }

    @Override // com.airbnb.lottie.q.a.b
    public void b(List<b> list, List<b> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(a.InterfaceC0101a interfaceC0101a) {
        this.f8052b.add(interfaceC0101a);
    }

    public com.airbnb.lottie.q.b.a<?, Float> f() {
        return this.f8055e;
    }

    public com.airbnb.lottie.q.b.a<?, Float> h() {
        return this.f8056f;
    }

    public com.airbnb.lottie.q.b.a<?, Float> i() {
        return this.f8054d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q.a j() {
        return this.f8053c;
    }
}
