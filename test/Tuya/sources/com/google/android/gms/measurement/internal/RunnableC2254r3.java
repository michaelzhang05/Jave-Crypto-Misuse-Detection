package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2254r3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16778a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K3 f16779b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2254r3(K3 k32, D4 d42) {
        this.f16779b = k32;
        this.f16778a = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3391d interfaceC3391d;
        K3 k32 = this.f16779b;
        interfaceC3391d = k32.f16202d;
        if (interfaceC3391d == null) {
            k32.f16777a.d().r().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AbstractC1319p.l(this.f16778a);
            interfaceC3391d.M(this.f16778a);
            this.f16779b.f16777a.C().t();
            this.f16779b.r(interfaceC3391d, null, this.f16778a);
            this.f16779b.E();
        } catch (RemoteException e8) {
            this.f16779b.f16777a.d().r().b("Failed to send app launch to the service", e8);
        }
    }
}
