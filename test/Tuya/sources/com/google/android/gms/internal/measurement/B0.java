package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC1969d0 f15255e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ X0 f15256f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(X0 x02, BinderC1969d0 binderC1969d0) {
        super(x02, true);
        this.f15256f = x02;
        this.f15255e = binderC1969d0;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15256f.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).getCachedAppInstanceId(this.f15255e);
    }

    @Override // com.google.android.gms.internal.measurement.M0
    protected final void b() {
        this.f15255e.G(null);
    }
}
