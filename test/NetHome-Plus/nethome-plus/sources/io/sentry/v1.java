package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: IHub.java */
/* loaded from: classes2.dex */
public interface v1 {
    v1 clone();

    void close();

    void d(long j2);

    void e(v0 v0Var);

    void endSession();

    io.sentry.protocol.q f(h4 h4Var, n1 n1Var);

    e2 g(r5 r5Var, t5 t5Var);

    @ApiStatus.Internal
    io.sentry.protocol.q h(io.sentry.protocol.x xVar, o5 o5Var, n1 n1Var);

    void i(v0 v0Var, n1 n1Var);

    boolean isEnabled();

    void j(t3 t3Var);

    @ApiStatus.Internal
    void k(Throwable th, d2 d2Var, String str);

    x4 l();

    @ApiStatus.Internal
    io.sentry.protocol.q m(io.sentry.protocol.x xVar, o5 o5Var, n1 n1Var, m3 m3Var);

    io.sentry.protocol.q n(h4 h4Var);

    io.sentry.protocol.q o(l4 l4Var, n1 n1Var);

    void startSession();
}
