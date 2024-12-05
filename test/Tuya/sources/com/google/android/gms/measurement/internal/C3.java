package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2029k0;
import java.util.ArrayList;
import m0.InterfaceC3391d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class C3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16030a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16031b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D4 f16032c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16033d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K3 f16034e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3(K3 k32, String str, String str2, D4 d42, InterfaceC2029k0 interfaceC2029k0) {
        this.f16034e = k32;
        this.f16030a = str;
        this.f16031b = str2;
        this.f16032c = d42;
        this.f16033d = interfaceC2029k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y1 y12;
        InterfaceC3391d interfaceC3391d;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                K3 k32 = this.f16034e;
                interfaceC3391d = k32.f16202d;
                if (interfaceC3391d == null) {
                    k32.f16777a.d().r().c("Failed to get conditional properties; not connected to service", this.f16030a, this.f16031b);
                    y12 = this.f16034e.f16777a;
                } else {
                    AbstractC1319p.l(this.f16032c);
                    arrayList = y4.v(interfaceC3391d.P(this.f16030a, this.f16031b, this.f16032c));
                    this.f16034e.E();
                    y12 = this.f16034e.f16777a;
                }
            } catch (RemoteException e8) {
                this.f16034e.f16777a.d().r().d("Failed to get conditional properties; remote exception", this.f16030a, this.f16031b, e8);
                y12 = this.f16034e.f16777a;
            }
            y12.N().F(this.f16033d, arrayList);
        } catch (Throwable th) {
            this.f16034e.f16777a.N().F(this.f16033d, arrayList);
            throw th;
        }
    }
}
