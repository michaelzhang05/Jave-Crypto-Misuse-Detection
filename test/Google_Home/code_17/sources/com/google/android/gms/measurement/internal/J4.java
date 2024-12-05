package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17229a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b6 f17230b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ D4 f17231c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J4(D4 d42, AtomicReference atomicReference, b6 b6Var) {
        this.f17229a = atomicReference;
        this.f17230b = b6Var;
        this.f17231c = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        synchronized (this.f17229a) {
            try {
                try {
                } catch (RemoteException e8) {
                    this.f17231c.c().G().b("Failed to get app instance id", e8);
                }
                if (this.f17231c.f().M().B()) {
                    interfaceC3272g = this.f17231c.f17004d;
                    if (interfaceC3272g == null) {
                        this.f17231c.c().G().a("Failed to get app instance id");
                        return;
                    }
                    AbstractC1400p.l(this.f17230b);
                    this.f17229a.set(interfaceC3272g.S(this.f17230b));
                    String str = (String) this.f17229a.get();
                    if (str != null) {
                        this.f17231c.o().a1(str);
                        this.f17231c.f().f17819i.b(str);
                    }
                    this.f17231c.m0();
                    this.f17229a.notify();
                    return;
                }
                this.f17231c.c().M().a("Analytics storage consent denied; will not get app instance id");
                this.f17231c.o().a1(null);
                this.f17231c.f().f17819i.b(null);
                this.f17229a.set(null);
            } finally {
                this.f17229a.notify();
            }
        }
    }
}
