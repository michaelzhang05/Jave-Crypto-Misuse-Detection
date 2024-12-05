package io.sentry;

/* compiled from: NoOpHub.java */
/* loaded from: classes2.dex */
public final class y2 implements v1 {
    private static final y2 a = new y2();

    /* renamed from: b, reason: collision with root package name */
    private final x4 f19348b = x4.empty();

    private y2() {
    }

    public static y2 a() {
        return a;
    }

    @Override // io.sentry.v1
    public void close() {
    }

    @Override // io.sentry.v1
    public void d(long j2) {
    }

    @Override // io.sentry.v1
    public /* synthetic */ void e(v0 v0Var) {
        u1.a(this, v0Var);
    }

    @Override // io.sentry.v1
    public void endSession() {
    }

    @Override // io.sentry.v1
    public io.sentry.protocol.q f(h4 h4Var, n1 n1Var) {
        return io.sentry.protocol.q.f19172f;
    }

    @Override // io.sentry.v1
    public e2 g(r5 r5Var, t5 t5Var) {
        return d3.r();
    }

    @Override // io.sentry.v1
    public /* synthetic */ io.sentry.protocol.q h(io.sentry.protocol.x xVar, o5 o5Var, n1 n1Var) {
        return u1.c(this, xVar, o5Var, n1Var);
    }

    @Override // io.sentry.v1
    public void i(v0 v0Var, n1 n1Var) {
    }

    @Override // io.sentry.v1
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.v1
    public void j(t3 t3Var) {
    }

    @Override // io.sentry.v1
    public void k(Throwable th, d2 d2Var, String str) {
    }

    @Override // io.sentry.v1
    public x4 l() {
        return this.f19348b;
    }

    @Override // io.sentry.v1
    public io.sentry.protocol.q m(io.sentry.protocol.x xVar, o5 o5Var, n1 n1Var, m3 m3Var) {
        return io.sentry.protocol.q.f19172f;
    }

    @Override // io.sentry.v1
    public /* synthetic */ io.sentry.protocol.q n(h4 h4Var) {
        return u1.b(this, h4Var);
    }

    @Override // io.sentry.v1
    public io.sentry.protocol.q o(l4 l4Var, n1 n1Var) {
        return io.sentry.protocol.q.f19172f;
    }

    @Override // io.sentry.v1
    public void startSession() {
    }

    @Override // io.sentry.v1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public v1 m368clone() {
        return a;
    }
}
