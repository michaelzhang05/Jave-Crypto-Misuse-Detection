package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: HubAdapter.java */
/* loaded from: classes2.dex */
public final class q1 implements v1 {
    private static final q1 a = new q1();

    private q1() {
    }

    public static q1 a() {
        return a;
    }

    @Override // io.sentry.v1
    public void close() {
        a4.d();
    }

    @Override // io.sentry.v1
    public void d(long j2) {
        a4.h(j2);
    }

    @Override // io.sentry.v1
    public /* synthetic */ void e(v0 v0Var) {
        u1.a(this, v0Var);
    }

    @Override // io.sentry.v1
    public void endSession() {
        a4.f();
    }

    @Override // io.sentry.v1
    @ApiStatus.Internal
    public io.sentry.protocol.q f(h4 h4Var, n1 n1Var) {
        return a4.i().f(h4Var, n1Var);
    }

    @Override // io.sentry.v1
    public e2 g(r5 r5Var, t5 t5Var) {
        return a4.t(r5Var, t5Var);
    }

    @Override // io.sentry.v1
    public /* synthetic */ io.sentry.protocol.q h(io.sentry.protocol.x xVar, o5 o5Var, n1 n1Var) {
        return u1.c(this, xVar, o5Var, n1Var);
    }

    @Override // io.sentry.v1
    public void i(v0 v0Var, n1 n1Var) {
        a4.a(v0Var, n1Var);
    }

    @Override // io.sentry.v1
    public boolean isEnabled() {
        return a4.o();
    }

    @Override // io.sentry.v1
    public void j(t3 t3Var) {
        a4.e(t3Var);
    }

    @Override // io.sentry.v1
    public void k(Throwable th, d2 d2Var, String str) {
        a4.i().k(th, d2Var, str);
    }

    @Override // io.sentry.v1
    public x4 l() {
        return a4.i().l();
    }

    @Override // io.sentry.v1
    public io.sentry.protocol.q m(io.sentry.protocol.x xVar, o5 o5Var, n1 n1Var, m3 m3Var) {
        return a4.i().m(xVar, o5Var, n1Var, m3Var);
    }

    @Override // io.sentry.v1
    public /* synthetic */ io.sentry.protocol.q n(h4 h4Var) {
        return u1.b(this, h4Var);
    }

    @Override // io.sentry.v1
    public io.sentry.protocol.q o(l4 l4Var, n1 n1Var) {
        return a4.c(l4Var, n1Var);
    }

    @Override // io.sentry.v1
    public void startSession() {
        a4.s();
    }

    @Override // io.sentry.v1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public v1 m367clone() {
        return a4.i().m368clone();
    }
}
