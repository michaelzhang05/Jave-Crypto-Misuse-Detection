package io.sentry;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class ShutdownHookIntegration implements Integration, Closeable {

    /* renamed from: f, reason: collision with root package name */
    private final Runtime f18518f;

    /* renamed from: g, reason: collision with root package name */
    private Thread f18519g;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f18518f = (Runtime) io.sentry.util.q.c(runtime, "Runtime is required");
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Thread thread = this.f18519g;
        if (thread != null) {
            try {
                this.f18518f.removeShutdownHook(thread);
            } catch (IllegalStateException e2) {
                String message = e2.getMessage();
                if (message == null || !message.equals("Shutdown in progress")) {
                    throw e2;
                }
            }
        }
    }

    @Override // io.sentry.Integration
    public void f(final v1 v1Var, final x4 x4Var) {
        io.sentry.util.q.c(v1Var, "Hub is required");
        io.sentry.util.q.c(x4Var, "SentryOptions is required");
        if (x4Var.isEnableShutdownHook()) {
            Thread thread = new Thread(new Runnable() { // from class: io.sentry.q0
                @Override // java.lang.Runnable
                public final void run() {
                    v1.this.d(x4Var.getFlushTimeoutMillis());
                }
            });
            this.f18519g = thread;
            this.f18518f.addShutdownHook(thread);
            x4Var.getLogger().c(s4.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            a();
            return;
        }
        x4Var.getLogger().c(s4.INFO, "enableShutdownHook is disabled.", new Object[0]);
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
