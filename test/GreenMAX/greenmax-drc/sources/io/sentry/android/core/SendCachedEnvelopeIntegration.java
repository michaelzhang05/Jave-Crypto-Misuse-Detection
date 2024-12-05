package io.sentry.android.core;

import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.s4;
import io.sentry.u3;
import io.sentry.v1;
import io.sentry.x3;
import io.sentry.x4;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SendCachedEnvelopeIntegration implements Integration {

    /* renamed from: f, reason: collision with root package name */
    private final x3 f18594f;

    /* renamed from: g, reason: collision with root package name */
    private final io.sentry.util.o<Boolean> f18595g;

    public SendCachedEnvelopeIntegration(x3 x3Var, io.sentry.util.o<Boolean> oVar) {
        this.f18594f = (x3) io.sentry.util.q.c(x3Var, "SendFireAndForgetFactory is required");
        this.f18595g = oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(u3 u3Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            u3Var.a();
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(s4.ERROR, "Failed trying to send cached events.", th);
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // io.sentry.Integration
    public void f(v1 v1Var, x4 x4Var) {
        io.sentry.util.q.c(v1Var, "Hub is required");
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.q.c(x4Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x4Var : null, "SentryAndroidOptions is required");
        if (!this.f18594f.c(x4Var.getCacheDirPath(), x4Var.getLogger())) {
            x4Var.getLogger().c(s4.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        final u3 b2 = this.f18594f.b(v1Var, sentryAndroidOptions);
        if (b2 == null) {
            sentryAndroidOptions.getLogger().c(s4.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            Future<?> submit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.a0
                @Override // java.lang.Runnable
                public final void run() {
                    SendCachedEnvelopeIntegration.b(u3.this, sentryAndroidOptions);
                }
            });
            if (this.f18595g.a().booleanValue()) {
                sentryAndroidOptions.getLogger().c(s4.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                try {
                    submit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    sentryAndroidOptions.getLogger().c(s4.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                }
            }
            sentryAndroidOptions.getLogger().c(s4.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
        } catch (RejectedExecutionException e2) {
            sentryAndroidOptions.getLogger().b(s4.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e2);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().b(s4.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }
}
