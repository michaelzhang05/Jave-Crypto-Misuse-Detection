package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2029k0;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2250q3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16754a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16755b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K3 f16756c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2250q3(K3 k32, D4 d42, InterfaceC2029k0 interfaceC2029k0) {
        this.f16756c = k32;
        this.f16754a = d42;
        this.f16755b = interfaceC2029k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y1 y12;
        InterfaceC3391d interfaceC3391d;
        String str = null;
        try {
            try {
                if (!this.f16756c.f16777a.F().q().j(m0.o.ANALYTICS_STORAGE)) {
                    this.f16756c.f16777a.d().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f16756c.f16777a.I().C(null);
                    this.f16756c.f16777a.F().f16151g.b(null);
                    y12 = this.f16756c.f16777a;
                } else {
                    K3 k32 = this.f16756c;
                    interfaceC3391d = k32.f16202d;
                    if (interfaceC3391d == null) {
                        k32.f16777a.d().r().a("Failed to get app instance id");
                        y12 = this.f16756c.f16777a;
                    } else {
                        AbstractC1319p.l(this.f16754a);
                        str = interfaceC3391d.z(this.f16754a);
                        if (str != null) {
                            this.f16756c.f16777a.I().C(str);
                            this.f16756c.f16777a.F().f16151g.b(str);
                        }
                        this.f16756c.E();
                        y12 = this.f16756c.f16777a;
                    }
                }
            } catch (RemoteException e8) {
                this.f16756c.f16777a.d().r().b("Failed to get app instance id", e8);
                y12 = this.f16756c.f16777a;
            }
            y12.N().K(this.f16755b, str);
        } catch (Throwable th) {
            this.f16756c.f16777a.N().K(this.f16755b, null);
            throw th;
        }
    }
}
