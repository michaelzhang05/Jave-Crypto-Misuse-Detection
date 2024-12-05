package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17287a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ D4 f17288b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P4(D4 d42, b6 b6Var) {
        this.f17287a = b6Var;
        this.f17288b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        interfaceC3272g = this.f17288b.f17004d;
        if (interfaceC3272g == null) {
            this.f17288b.c().L().a("Failed to send app backgrounded");
            return;
        }
        try {
            AbstractC1400p.l(this.f17287a);
            interfaceC3272g.r(this.f17287a);
            this.f17288b.m0();
        } catch (RemoteException e8) {
            this.f17288b.c().G().b("Failed to send app backgrounded to the service", e8);
        }
    }
}
