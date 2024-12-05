package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Bundle;
import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17293a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f17294b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ D4 f17295c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q4(D4 d42, b6 b6Var, Bundle bundle) {
        this.f17293a = b6Var;
        this.f17294b = bundle;
        this.f17295c = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        interfaceC3272g = this.f17295c.f17004d;
        if (interfaceC3272g == null) {
            this.f17295c.c().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            AbstractC1400p.l(this.f17293a);
            interfaceC3272g.n(this.f17294b, this.f17293a);
        } catch (RemoteException e8) {
            this.f17295c.c().G().b("Failed to send default event parameters to service", e8);
        }
    }
}
