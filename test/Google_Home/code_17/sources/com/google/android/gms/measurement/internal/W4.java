package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import android.text.TextUtils;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f17398a = true;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b6 f17399b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f17400c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C2350g f17401d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2350g f17402e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ D4 f17403f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W4(D4 d42, boolean z8, b6 b6Var, boolean z9, C2350g c2350g, C2350g c2350g2) {
        this.f17399b = b6Var;
        this.f17400c = z9;
        this.f17401d = c2350g;
        this.f17402e = c2350g2;
        this.f17403f = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        C2350g c2350g;
        interfaceC3272g = this.f17403f.f17004d;
        if (interfaceC3272g == null) {
            this.f17403f.c().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f17398a) {
            AbstractC1400p.l(this.f17399b);
            D4 d42 = this.f17403f;
            if (this.f17400c) {
                c2350g = null;
            } else {
                c2350g = this.f17401d;
            }
            d42.T(interfaceC3272g, c2350g, this.f17399b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f17402e.f17578a)) {
                    AbstractC1400p.l(this.f17399b);
                    interfaceC3272g.t(this.f17401d, this.f17399b);
                } else {
                    interfaceC3272g.O(this.f17401d);
                }
            } catch (RemoteException e8) {
                this.f17403f.c().G().b("Failed to send conditional user property to the service", e8);
            }
        }
        this.f17403f.m0();
    }
}
