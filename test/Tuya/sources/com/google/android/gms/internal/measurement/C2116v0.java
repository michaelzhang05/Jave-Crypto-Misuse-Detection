package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.app.Activity;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2116v0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f15917e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15918f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f15919g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ X0 f15920h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2116v0(X0 x02, Activity activity, String str, String str2) {
        super(x02, true);
        this.f15920h = x02;
        this.f15917e = activity;
        this.f15918f = str;
        this.f15919g = str2;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        InterfaceC2005h0 interfaceC2005h0;
        interfaceC2005h0 = this.f15920h.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).setCurrentScreen(Z.b.m0(this.f15917e), this.f15918f, this.f15919g, this.f15390a);
    }
}
