package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class F0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15321e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15322f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f15323g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinderC1969d0 f15324h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ X0 f15325i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(X0 x02, String str, String str2, boolean z8, BinderC1969d0 binderC1969d0) {
        super(x02, true);
        this.f15325i = x02;
        this.f15321e = str;
        this.f15322f = str2;
        this.f15323g = z8;
        this.f15324h = binderC1969d0;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15325i.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).getUserProperties(this.f15321e, this.f15322f, this.f15323g, this.f15324h);
    }

    @Override // com.google.android.gms.internal.measurement.M0
    protected final void b() {
        this.f15324h.G(null);
    }
}
