package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.v5;
import java.io.Closeable;
import java.lang.Thread;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes2.dex */
public final class UncaughtExceptionHandlerIntegration implements Integration, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: f, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f18520f;

    /* renamed from: g, reason: collision with root package name */
    private v1 f18521g;

    /* renamed from: h, reason: collision with root package name */
    private x4 f18522h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18523i;

    /* renamed from: j, reason: collision with root package name */
    private final v5 f18524j;

    @ApiStatus.Internal
    /* loaded from: classes2.dex */
    public static class a extends io.sentry.hints.e implements io.sentry.hints.l {
        public a(long j2, w1 w1Var) {
            super(j2, w1Var);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(v5.a.c());
    }

    static Throwable b(Thread thread, Throwable th) {
        io.sentry.protocol.i iVar = new io.sentry.protocol.i();
        iVar.i(Boolean.FALSE);
        iVar.j("UncaughtExceptionHandler");
        return new ExceptionMechanismException(iVar, th, thread);
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this == this.f18524j.b()) {
            this.f18524j.a(this.f18520f);
            x4 x4Var = this.f18522h;
            if (x4Var != null) {
                x4Var.getLogger().c(s4.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.Integration
    public final void f(v1 v1Var, x4 x4Var) {
        if (this.f18523i) {
            x4Var.getLogger().c(s4.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f18523i = true;
        this.f18521g = (v1) io.sentry.util.q.c(v1Var, "Hub is required");
        x4 x4Var2 = (x4) io.sentry.util.q.c(x4Var, "SentryOptions is required");
        this.f18522h = x4Var2;
        w1 logger = x4Var2.getLogger();
        s4 s4Var = s4.DEBUG;
        logger.c(s4Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f18522h.isEnableUncaughtExceptionHandler()));
        if (this.f18522h.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler b2 = this.f18524j.b();
            if (b2 != null) {
                this.f18522h.getLogger().c(s4Var, "default UncaughtExceptionHandler class='" + b2.getClass().getName() + "'", new Object[0]);
                this.f18520f = b2;
            }
            this.f18524j.a(this);
            this.f18522h.getLogger().c(s4Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            a();
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        x4 x4Var = this.f18522h;
        if (x4Var == null || this.f18521g == null) {
            return;
        }
        x4Var.getLogger().c(s4.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f18522h.getFlushTimeoutMillis(), this.f18522h.getLogger());
            l4 l4Var = new l4(b(thread, th));
            l4Var.z0(s4.FATAL);
            n1 a2 = io.sentry.util.m.a(aVar);
            boolean equals = this.f18521g.o(l4Var, a2).equals(io.sentry.protocol.q.f19172f);
            io.sentry.hints.h b2 = io.sentry.util.m.b(a2);
            if ((!equals || io.sentry.hints.h.MULTITHREADED_DEDUPLICATION.equals(b2)) && !aVar.e()) {
                this.f18522h.getLogger().c(s4.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", l4Var.G());
            }
        } catch (Throwable th2) {
            this.f18522h.getLogger().b(s4.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.f18520f != null) {
            this.f18522h.getLogger().c(s4.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f18520f.uncaughtException(thread, th);
        } else if (this.f18522h.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }

    UncaughtExceptionHandlerIntegration(v5 v5Var) {
        this.f18523i = false;
        this.f18524j = (v5) io.sentry.util.q.c(v5Var, "threadAdapter is required.");
    }
}
