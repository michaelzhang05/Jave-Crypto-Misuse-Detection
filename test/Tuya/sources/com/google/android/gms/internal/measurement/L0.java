package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class L0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15382e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15383f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f15384g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f15385h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ X0 f15386i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(X0 x02, String str, String str2, Object obj, boolean z8) {
        super(x02, true);
        this.f15386i = x02;
        this.f15382e = str;
        this.f15383f = str2;
        this.f15384g = obj;
        this.f15385h = z8;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15386i.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).setUserProperty(this.f15382e, this.f15383f, Z.b.m0(this.f15384g), this.f15385h, this.f15390a);
    }
}
