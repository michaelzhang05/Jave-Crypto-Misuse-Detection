package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17239a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ D4 f17240b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K4(D4 d42, b6 b6Var) {
        this.f17239a = b6Var;
        this.f17240b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        interfaceC3272g = this.f17240b.f17004d;
        if (interfaceC3272g == null) {
            this.f17240b.c().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            AbstractC1400p.l(this.f17239a);
            interfaceC3272g.D(this.f17239a);
        } catch (RemoteException e8) {
            this.f17240b.c().G().b("Failed to reset data on the service: remote exception", e8);
        }
        this.f17240b.m0();
    }
}
