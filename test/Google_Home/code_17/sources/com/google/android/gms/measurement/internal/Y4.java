package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import java.util.ArrayList;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17423a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17424b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ b6 f17425c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17426d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ D4 f17427e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y4(D4 d42, String str, String str2, b6 b6Var, com.google.android.gms.internal.measurement.R0 r02) {
        this.f17423a = str;
        this.f17424b = str2;
        this.f17425c = b6Var;
        this.f17426d = r02;
        this.f17427e = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        ArrayList arrayList = new ArrayList();
        try {
            interfaceC3272g = this.f17427e.f17004d;
            if (interfaceC3272g == null) {
                this.f17427e.c().G().c("Failed to get conditional properties; not connected to service", this.f17423a, this.f17424b);
                return;
            }
            AbstractC1400p.l(this.f17425c);
            ArrayList t02 = a6.t0(interfaceC3272g.u(this.f17423a, this.f17424b, this.f17425c));
            this.f17427e.m0();
            this.f17427e.h().T(this.f17426d, t02);
        } catch (RemoteException e8) {
            this.f17427e.c().G().d("Failed to get conditional properties; remote exception", this.f17423a, this.f17424b, e8);
        } finally {
            this.f17427e.h().T(this.f17426d, arrayList);
        }
    }
}
