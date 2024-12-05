package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.app.Activity;

/* loaded from: classes3.dex */
final class U0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f15580e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC1969d0 f15581f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ W0 f15582g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(W0 w02, Activity activity, BinderC1969d0 binderC1969d0) {
        super(w02.f15593a, true);
        this.f15582g = w02;
        this.f15580e = activity;
        this.f15581f = binderC1969d0;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15582g.f15593a.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).onActivitySaveInstanceState(Z.b.m0(this.f15580e), this.f15581f, this.f15391b);
    }
}
