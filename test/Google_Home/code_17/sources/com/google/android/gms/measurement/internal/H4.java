package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import l0.InterfaceC3272g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class H4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17173a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f17174b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ V5 f17175c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ D4 f17176d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H4(D4 d42, b6 b6Var, boolean z8, V5 v52) {
        this.f17173a = b6Var;
        this.f17174b = z8;
        this.f17175c = v52;
        this.f17176d = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3272g interfaceC3272g;
        V5 v52;
        interfaceC3272g = this.f17176d.f17004d;
        if (interfaceC3272g == null) {
            this.f17176d.c().G().a("Discarding data. Failed to set user property");
            return;
        }
        AbstractC1400p.l(this.f17173a);
        D4 d42 = this.f17176d;
        if (this.f17174b) {
            v52 = null;
        } else {
            v52 = this.f17175c;
        }
        d42.T(interfaceC3272g, v52, this.f17173a);
        this.f17176d.m0();
    }
}
