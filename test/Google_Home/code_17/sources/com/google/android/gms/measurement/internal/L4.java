package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class L4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17246a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ D4 f17247b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L4(D4 d42, b6 b6Var) {
        this.f17246a = b6Var;
        this.f17247b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        interfaceC3272g = this.f17247b.f17004d;
        if (interfaceC3272g == null) {
            this.f17247b.c().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AbstractC1400p.l(this.f17246a);
            interfaceC3272g.B(this.f17246a);
            this.f17247b.n().J();
            this.f17247b.T(interfaceC3272g, null, this.f17246a);
            this.f17247b.m0();
        } catch (RemoteException e8) {
            this.f17247b.c().G().b("Failed to send app launch to the service", e8);
        }
    }
}
