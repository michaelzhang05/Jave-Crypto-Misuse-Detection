package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ G f17342a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17343b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.R0 f17344c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ D4 f17345d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S4(D4 d42, G g8, String str, com.google.android.gms.internal.measurement.R0 r02) {
        this.f17342a = g8;
        this.f17343b = str;
        this.f17344c = r02;
        this.f17345d = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        try {
            interfaceC3272g = this.f17345d.f17004d;
            if (interfaceC3272g == null) {
                this.f17345d.c().G().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] o8 = interfaceC3272g.o(this.f17342a, this.f17343b);
            this.f17345d.m0();
            this.f17345d.h().V(this.f17344c, o8);
        } catch (RemoteException e8) {
            this.f17345d.c().G().b("Failed to send event to the service to bundle", e8);
        } finally {
            this.f17345d.h().V(this.f17344c, null);
        }
    }
}
