package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: PerformanceCollectionData.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class k3 {
    private w2 a = null;

    /* renamed from: b, reason: collision with root package name */
    private x0 f18990b = null;

    public void a(x0 x0Var) {
        if (x0Var != null) {
            this.f18990b = x0Var;
        }
    }

    public void b(w2 w2Var) {
        if (w2Var != null) {
            this.a = w2Var;
        }
    }

    public x0 c() {
        return this.f18990b;
    }

    public w2 d() {
        return this.a;
    }
}
