package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17364a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ D4 f17365b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U4(D4 d42, b6 b6Var) {
        this.f17364a = b6Var;
        this.f17365b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        interfaceC3272g = this.f17365b.f17004d;
        if (interfaceC3272g == null) {
            this.f17365b.c().G().a("Failed to send consent settings to service");
            return;
        }
        try {
            AbstractC1400p.l(this.f17364a);
            interfaceC3272g.k0(this.f17364a);
            this.f17365b.m0();
        } catch (RemoteException e8) {
            this.f17365b.c().G().b("Failed to send consent settings to the service", e8);
        }
    }
}