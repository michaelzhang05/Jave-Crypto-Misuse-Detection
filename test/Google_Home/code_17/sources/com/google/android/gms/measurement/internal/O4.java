package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2459v4 f17278a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ D4 f17279b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O4(D4 d42, C2459v4 c2459v4) {
        this.f17278a = c2459v4;
        this.f17279b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        interfaceC3272g = this.f17279b.f17004d;
        if (interfaceC3272g == null) {
            this.f17279b.c().G().a("Failed to send current screen to service");
            return;
        }
        try {
            C2459v4 c2459v4 = this.f17278a;
            if (c2459v4 == null) {
                interfaceC3272g.L(0L, null, null, this.f17279b.w().getPackageName());
            } else {
                interfaceC3272g.L(c2459v4.f17866c, c2459v4.f17864a, c2459v4.f17865b, this.f17279b.w().getPackageName());
            }
            this.f17279b.m0();
        } catch (RemoteException e8) {
            this.f17279b.c().G().b("Failed to send current screen to the service", e8);
        }
    }
}
