package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.RemoteException;
import android.text.TextUtils;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f17408a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b6 f17409b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f17410c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ G f17411d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f17412e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ D4 f17413f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X4(D4 d42, boolean z8, b6 b6Var, boolean z9, G g8, String str) {
        this.f17408a = z8;
        this.f17409b = b6Var;
        this.f17410c = z9;
        this.f17411d = g8;
        this.f17412e = str;
        this.f17413f = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        G g8;
        interfaceC3272g = this.f17413f.f17004d;
        if (interfaceC3272g == null) {
            this.f17413f.c().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f17408a) {
            AbstractC1400p.l(this.f17409b);
            D4 d42 = this.f17413f;
            if (this.f17410c) {
                g8 = null;
            } else {
                g8 = this.f17411d;
            }
            d42.T(interfaceC3272g, g8, this.f17409b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f17412e)) {
                    AbstractC1400p.l(this.f17409b);
                    interfaceC3272g.p(this.f17411d, this.f17409b);
                } else {
                    interfaceC3272g.m(this.f17411d, this.f17412e, this.f17413f.c().O());
                }
            } catch (RemoteException e8) {
                this.f17413f.c().G().b("Failed to send event to the service", e8);
            }
        }
        this.f17413f.m0();
    }
}
