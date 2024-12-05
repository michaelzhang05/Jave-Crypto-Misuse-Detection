package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15331e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f15332f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ X0 f15333g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(X0 x02, boolean z8, int i8, String str, Object obj, Object obj2, Object obj3) {
        super(x02, false);
        this.f15333g = x02;
        this.f15331e = str;
        this.f15332f = obj;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15333g.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).logHealthData(5, this.f15331e, Z.b.m0(this.f15332f), Z.b.m0(null), Z.b.m0(null));
    }
}
