package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;

/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2206i2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16516a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16517b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2206i2(BinderC2249q2 binderC2249q2, D4 d42) {
        this.f16517b = binderC2249q2;
        this.f16516a = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4 r4Var;
        r4 r4Var2;
        r4Var = this.f16517b.f16751a;
        r4Var.e();
        r4Var2 = this.f16517b.f16751a;
        D4 d42 = this.f16516a;
        r4Var2.f().h();
        r4Var2.g();
        AbstractC1319p.f(d42.f16061a);
        m0.p c8 = m0.p.c(d42.f16082v, 100);
        m0.p c02 = r4Var2.c0(d42.f16061a);
        r4Var2.d().v().c("Setting consent, package, consent", d42.f16061a, c8);
        r4Var2.A(d42.f16061a, c8);
        if (c8.m(c02)) {
            r4Var2.v(d42);
        }
    }
}
