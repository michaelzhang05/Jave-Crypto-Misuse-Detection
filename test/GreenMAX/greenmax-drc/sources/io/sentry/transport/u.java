package io.sentry.transport;

import io.sentry.h4;
import io.sentry.n1;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: NoOpTransport.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class u implements r {

    /* renamed from: f, reason: collision with root package name */
    private static final u f19274f = new u();

    private u() {
    }

    public static u a() {
        return f19274f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // io.sentry.transport.r
    public void d(long j2) {
    }

    @Override // io.sentry.transport.r
    public void x(h4 h4Var, n1 n1Var) throws IOException {
    }
}
