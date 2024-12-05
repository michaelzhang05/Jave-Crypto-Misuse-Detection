package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;

/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2396m3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17719a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ W2 f17720b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2396m3(W2 w22, b6 b6Var) {
        this.f17719a = b6Var;
        this.f17720b = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        I5 i53;
        i52 = this.f17720b.f17393a;
        i52.z0();
        i53 = this.f17720b.f17393a;
        b6 b6Var = this.f17719a;
        i53.e().k();
        i53.A0();
        AbstractC1400p.f(b6Var.f17497a);
        i53.o0(b6Var);
        i53.m0(b6Var);
    }
}
