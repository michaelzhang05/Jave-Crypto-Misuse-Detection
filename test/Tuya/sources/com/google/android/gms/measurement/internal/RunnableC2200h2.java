package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;

/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2200h2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16507a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16508b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2200h2(BinderC2249q2 binderC2249q2, D4 d42) {
        this.f16508b = binderC2249q2;
        this.f16507a = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4 r4Var;
        r4 r4Var2;
        r4Var = this.f16508b.f16751a;
        r4Var.e();
        r4Var2 = this.f16508b.f16751a;
        D4 d42 = this.f16507a;
        r4Var2.f().h();
        r4Var2.g();
        AbstractC1319p.f(d42.f16061a);
        r4Var2.S(d42);
    }
}
