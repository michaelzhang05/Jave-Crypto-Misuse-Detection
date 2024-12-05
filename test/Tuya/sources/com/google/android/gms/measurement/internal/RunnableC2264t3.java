package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;
import android.os.RemoteException;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2264t3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16826a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f16827b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K3 f16828c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2264t3(K3 k32, D4 d42, Bundle bundle) {
        this.f16828c = k32;
        this.f16826a = d42;
        this.f16827b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        K3 k32 = this.f16828c;
        interfaceC3391d = k32.f16202d;
        if (interfaceC3391d == null) {
            k32.f16777a.d().r().a("Failed to send default event parameters to service");
            return;
        }
        try {
            AbstractC1319p.l(this.f16826a);
            interfaceC3391d.s(this.f16827b, this.f16826a);
        } catch (RemoteException e8) {
            this.f16828c.f16777a.d().r().b("Failed to send default event parameters to service", e8);
        }
    }
}
