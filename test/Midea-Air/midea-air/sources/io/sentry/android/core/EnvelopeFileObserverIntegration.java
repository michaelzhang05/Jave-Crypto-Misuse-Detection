package io.sentry.android.core;

import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.j3;
import io.sentry.s4;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x4;
import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class EnvelopeFileObserverIntegration implements Integration, Closeable {

    /* renamed from: f, reason: collision with root package name */
    private y0 f18563f;

    /* renamed from: g, reason: collision with root package name */
    private w1 f18564g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        protected String w(x4 x4Var) {
            return x4Var.getOutboxPath();
        }
    }

    public static EnvelopeFileObserverIntegration b() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        y0 y0Var = this.f18563f;
        if (y0Var != null) {
            y0Var.stopWatching();
            w1 w1Var = this.f18564g;
            if (w1Var != null) {
                w1Var.c(s4.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.Integration
    public final void f(v1 v1Var, x4 x4Var) {
        io.sentry.util.q.c(v1Var, "Hub is required");
        io.sentry.util.q.c(x4Var, "SentryOptions is required");
        this.f18564g = x4Var.getLogger();
        String w = w(x4Var);
        if (w == null) {
            this.f18564g.c(s4.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        w1 w1Var = this.f18564g;
        s4 s4Var = s4.DEBUG;
        w1Var.c(s4Var, "Registering EnvelopeFileObserverIntegration for path: %s", w);
        y0 y0Var = new y0(w, new j3(v1Var, x4Var.getEnvelopeReader(), x4Var.getSerializer(), this.f18564g, x4Var.getFlushTimeoutMillis()), this.f18564g, x4Var.getFlushTimeoutMillis());
        this.f18563f = y0Var;
        try {
            y0Var.startWatching();
            this.f18564g.c(s4Var, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            x4Var.getLogger().b(s4.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    abstract String w(x4 x4Var);
}
