package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class A3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16002a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f16003b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2173d f16004c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2173d f16005d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K3 f16006e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A3(K3 k32, boolean z8, D4 d42, boolean z9, C2173d c2173d, C2173d c2173d2) {
        this.f16006e = k32;
        this.f16002a = d42;
        this.f16003b = z9;
        this.f16004c = c2173d;
        this.f16005d = c2173d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        C2173d c2173d;
        K3 k32 = this.f16006e;
        interfaceC3391d = k32.f16202d;
        if (interfaceC3391d == null) {
            k32.f16777a.d().r().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        AbstractC1319p.l(this.f16002a);
        K3 k33 = this.f16006e;
        if (this.f16003b) {
            c2173d = null;
        } else {
            c2173d = this.f16004c;
        }
        k33.r(interfaceC3391d, c2173d, this.f16002a);
        this.f16006e.E();
    }
}
