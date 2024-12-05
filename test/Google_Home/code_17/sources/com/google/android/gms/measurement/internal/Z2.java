package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;

/* loaded from: classes3.dex */
final class Z2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17432a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ W2 f17433b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z2(W2 w22, b6 b6Var) {
        this.f17432a = b6Var;
        this.f17433b = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        I5 i53;
        i52 = this.f17433b.f17393a;
        i52.z0();
        i53 = this.f17433b.f17393a;
        b6 b6Var = this.f17432a;
        i53.e().k();
        i53.A0();
        AbstractC1400p.f(b6Var.f17497a);
        i53.g(b6Var);
    }
}
