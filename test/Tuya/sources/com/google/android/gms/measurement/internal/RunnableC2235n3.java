package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2235n3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16701a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f16702b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u4 f16703c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K3 f16704d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2235n3(K3 k32, D4 d42, boolean z8, u4 u4Var) {
        this.f16704d = k32;
        this.f16701a = d42;
        this.f16702b = z8;
        this.f16703c = u4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        u4 u4Var;
        K3 k32 = this.f16704d;
        interfaceC3391d = k32.f16202d;
        if (interfaceC3391d == null) {
            k32.f16777a.d().r().a("Discarding data. Failed to set user property");
            return;
        }
        AbstractC1319p.l(this.f16701a);
        K3 k33 = this.f16704d;
        if (this.f16702b) {
            u4Var = null;
        } else {
            u4Var = this.f16703c;
        }
        k33.r(interfaceC3391d, u4Var, this.f16701a);
        this.f16704d.E();
    }
}
