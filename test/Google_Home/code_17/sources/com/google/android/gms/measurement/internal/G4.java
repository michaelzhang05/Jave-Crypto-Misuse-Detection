package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Bundle;
import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17042a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17043b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ b6 f17044c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f17045d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17046e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ D4 f17047f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G4(D4 d42, String str, String str2, b6 b6Var, boolean z8, com.google.android.gms.internal.measurement.R0 r02) {
        this.f17042a = str;
        this.f17043b = str2;
        this.f17044c = b6Var;
        this.f17045d = z8;
        this.f17046e = r02;
        this.f17047f = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        Bundle bundle = new Bundle();
        try {
            interfaceC3272g = this.f17047f.f17004d;
            if (interfaceC3272g == null) {
                this.f17047f.c().G().c("Failed to get user properties; not connected to service", this.f17042a, this.f17043b);
                return;
            }
            AbstractC1400p.l(this.f17044c);
            Bundle G8 = a6.G(interfaceC3272g.l0(this.f17042a, this.f17043b, this.f17045d, this.f17044c));
            this.f17047f.m0();
            this.f17047f.h().R(this.f17046e, G8);
        } catch (RemoteException e8) {
            this.f17047f.c().G().c("Failed to get user properties; remote exception", this.f17042a, e8);
        } finally {
            this.f17047f.h().R(this.f17046e, bundle);
        }
    }
}
