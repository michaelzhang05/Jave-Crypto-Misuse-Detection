package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Bundle;
import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17353a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f17354b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ D4 f17355c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T4(D4 d42, b6 b6Var, Bundle bundle) {
        this.f17353a = b6Var;
        this.f17354b = bundle;
        this.f17355c = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        interfaceC3272g = this.f17355c.f17004d;
        if (interfaceC3272g == null) {
            this.f17355c.c().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            AbstractC1400p.l(this.f17353a);
            interfaceC3272g.U(this.f17354b, this.f17353a);
        } catch (RemoteException e8) {
            this.f17355c.c().G().b("Failed to send default event parameters to service", e8);
        }
    }
}
