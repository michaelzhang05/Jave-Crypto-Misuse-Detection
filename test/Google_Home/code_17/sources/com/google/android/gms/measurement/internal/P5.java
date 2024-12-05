package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17289a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ I5 f17290b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P5(I5 i52, b6 b6Var) {
        this.f17289a = b6Var;
        this.f17290b = i52;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (this.f17290b.U((String) AbstractC1400p.l(this.f17289a.f17497a)).B() && C2472x3.q(this.f17289a.f17518v).B()) {
            C2485z2 g8 = this.f17290b.g(this.f17289a);
            if (g8 == null) {
                this.f17290b.c().L().a("App info was null when attempting to get app instance id");
                return null;
            }
            return g8.m();
        }
        this.f17290b.c().K().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
