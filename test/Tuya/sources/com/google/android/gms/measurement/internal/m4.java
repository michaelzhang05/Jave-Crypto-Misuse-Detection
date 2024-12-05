package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D4 f16693a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r4 f16694b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m4(r4 r4Var, D4 d42) {
        this.f16694b = r4Var;
        this.f16693a = d42;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        m0.p c02 = this.f16694b.c0((String) AbstractC1319p.l(this.f16693a.f16061a));
        m0.o oVar = m0.o.ANALYTICS_STORAGE;
        if (c02.j(oVar) && m0.p.c(this.f16693a.f16082v, 100).j(oVar)) {
            return this.f16694b.S(this.f16693a).m0();
        }
        this.f16694b.d().v().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
