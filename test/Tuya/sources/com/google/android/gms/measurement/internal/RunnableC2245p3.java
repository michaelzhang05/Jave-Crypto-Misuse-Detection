package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2245p3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f16736a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D4 f16737b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K3 f16738c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2245p3(K3 k32, AtomicReference atomicReference, D4 d42) {
        this.f16738c = k32;
        this.f16736a = atomicReference;
        this.f16737b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC3391d interfaceC3391d;
        synchronized (this.f16736a) {
            try {
                try {
                } catch (RemoteException e8) {
                    this.f16738c.f16777a.d().r().b("Failed to get app instance id", e8);
                    atomicReference = this.f16736a;
                }
                if (!this.f16738c.f16777a.F().q().j(m0.o.ANALYTICS_STORAGE)) {
                    this.f16738c.f16777a.d().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f16738c.f16777a.I().C(null);
                    this.f16738c.f16777a.F().f16151g.b(null);
                    this.f16736a.set(null);
                    return;
                }
                K3 k32 = this.f16738c;
                interfaceC3391d = k32.f16202d;
                if (interfaceC3391d == null) {
                    k32.f16777a.d().r().a("Failed to get app instance id");
                    return;
                }
                AbstractC1319p.l(this.f16737b);
                this.f16736a.set(interfaceC3391d.z(this.f16737b));
                String str = (String) this.f16736a.get();
                if (str != null) {
                    this.f16738c.f16777a.I().C(str);
                    this.f16738c.f16777a.F().f16151g.b(str);
                }
                this.f16738c.E();
                atomicReference = this.f16736a;
                atomicReference.notify();
            } finally {
                this.f16736a.notify();
            }
        }
    }
}
