package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class M4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17261a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17262b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ D4 f17263c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M4(D4 d42, b6 b6Var, com.google.android.gms.internal.measurement.R0 r02) {
        this.f17261a = b6Var;
        this.f17262b = r02;
        this.f17263c = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        try {
            if (this.f17263c.f().M().B()) {
                interfaceC3272g = this.f17263c.f17004d;
                if (interfaceC3272g == null) {
                    this.f17263c.c().G().a("Failed to get app instance id");
                    return;
                }
                AbstractC1400p.l(this.f17261a);
                String S8 = interfaceC3272g.S(this.f17261a);
                if (S8 != null) {
                    this.f17263c.o().a1(S8);
                    this.f17263c.f().f17819i.b(S8);
                }
                this.f17263c.m0();
                this.f17263c.h().S(this.f17262b, S8);
                return;
            }
            this.f17263c.c().M().a("Analytics storage consent denied; will not get app instance id");
            this.f17263c.o().a1(null);
            this.f17263c.f().f17819i.b(null);
        } catch (RemoteException e8) {
            this.f17263c.c().G().b("Failed to get app instance id", e8);
        } finally {
            this.f17263c.h().S(this.f17262b, null);
        }
    }
}
