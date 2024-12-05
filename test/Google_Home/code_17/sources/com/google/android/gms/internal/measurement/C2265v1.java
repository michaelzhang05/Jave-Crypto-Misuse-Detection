package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2265v1 {

    /* renamed from: a, reason: collision with root package name */
    private final E f16866a;

    /* renamed from: b, reason: collision with root package name */
    final V2 f16867b;

    /* renamed from: c, reason: collision with root package name */
    final V2 f16868c;

    /* renamed from: d, reason: collision with root package name */
    private final Z4 f16869d;

    public C2265v1() {
        E e8 = new E();
        this.f16866a = e8;
        V2 v22 = new V2(null, e8);
        this.f16868c = v22;
        this.f16867b = v22.d();
        Z4 z42 = new Z4();
        this.f16869d = z42;
        v22.h("require", new J8(z42));
        z42.b("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.g1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new I8();
            }
        });
        v22.h("runtime.counter", new C2165k(Double.valueOf(0.0d)));
    }

    public final InterfaceC2236s a(V2 v22, C2119f3... c2119f3Arr) {
        InterfaceC2236s interfaceC2236s = InterfaceC2236s.f16802b0;
        for (C2119f3 c2119f3 : c2119f3Arr) {
            interfaceC2236s = AbstractC2070a4.a(c2119f3);
            AbstractC2128g2.b(this.f16868c);
            if ((interfaceC2236s instanceof C2263v) || (interfaceC2236s instanceof C2245t)) {
                interfaceC2236s = this.f16866a.a(v22, interfaceC2236s);
            }
        }
        return interfaceC2236s;
    }

    public final void b(String str, Callable callable) {
        this.f16869d.b(str, callable);
    }
}
