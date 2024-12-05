package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2093s1 {

    /* renamed from: a, reason: collision with root package name */
    final C2147z f15885a;

    /* renamed from: b, reason: collision with root package name */
    final T1 f15886b;

    /* renamed from: c, reason: collision with root package name */
    final T1 f15887c;

    /* renamed from: d, reason: collision with root package name */
    final C2127w3 f15888d;

    public C2093s1() {
        C2147z c2147z = new C2147z();
        this.f15885a = c2147z;
        T1 t12 = new T1(null, c2147z);
        this.f15887c = t12;
        this.f15886b = t12.a();
        C2127w3 c2127w3 = new C2127w3();
        this.f15888d = c2127w3;
        t12.g("require", new D7(c2127w3));
        c2127w3.a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.R0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new F7();
            }
        });
        t12.g("runtime.counter", new C2020j(Double.valueOf(0.0d)));
    }

    public final r a(T1 t12, C2094s2... c2094s2Arr) {
        r rVar = r.f15866c0;
        for (C2094s2 c2094s2 : c2094s2Arr) {
            rVar = V2.a(c2094s2);
            AbstractC2110u2.c(this.f15887c);
            if ((rVar instanceof C2091s) || (rVar instanceof C2076q)) {
                rVar = this.f15885a.a(t12, rVar);
            }
        }
        return rVar;
    }
}
