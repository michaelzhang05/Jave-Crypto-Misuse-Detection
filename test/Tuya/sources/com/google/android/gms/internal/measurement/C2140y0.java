package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2140y0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15961e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ X0 f15962f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140y0(X0 x02, String str) {
        super(x02, true);
        this.f15962f = x02;
        this.f15961e = str;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15962f.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).endAdUnitExposure(this.f15961e, this.f15391b);
    }
}
