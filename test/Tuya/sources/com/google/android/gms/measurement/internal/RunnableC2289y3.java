package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2289y3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16938a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K3 f16939b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2289y3(K3 k32, D4 d42) {
        this.f16939b = k32;
        this.f16938a = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        K3 k32 = this.f16939b;
        interfaceC3391d = k32.f16202d;
        if (interfaceC3391d == null) {
            k32.f16777a.d().r().a("Failed to send consent settings to service");
            return;
        }
        try {
            AbstractC1319p.l(this.f16938a);
            interfaceC3391d.V(this.f16938a);
            this.f16939b.E();
        } catch (RemoteException e8) {
            this.f16939b.f16777a.d().r().b("Failed to send consent settings to the service", e8);
        }
    }
}