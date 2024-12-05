package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2100t0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f15898e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15899f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f15900g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ X0 f15901h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2100t0(X0 x02, String str, String str2, Bundle bundle) {
        super(x02, true);
        this.f15901h = x02;
        this.f15898e = str;
        this.f15899f = str2;
        this.f15900g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15901h.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).clearConditionalUserProperty(this.f15898e, this.f15899f, this.f15900g);
    }
}
