package io.sentry;

import io.sentry.k5;
import io.sentry.s3;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Hub.java */
/* loaded from: classes2.dex */
public final class p1 implements v1 {
    private volatile io.sentry.protocol.q a;

    /* renamed from: b, reason: collision with root package name */
    private final x4 f19065b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f19066c;

    /* renamed from: d, reason: collision with root package name */
    private final k5 f19067d;

    /* renamed from: e, reason: collision with root package name */
    private final p5 f19068e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Throwable, io.sentry.util.r<WeakReference<d2>, String>> f19069f;

    /* renamed from: g, reason: collision with root package name */
    private final u5 f19070g;

    public p1(x4 x4Var) {
        this(x4Var, p(x4Var));
    }

    private void a(l4 l4Var) {
        io.sentry.util.r<WeakReference<d2>, String> rVar;
        d2 d2Var;
        if (!this.f19065b.isTracingEnabled() || l4Var.O() == null || (rVar = this.f19069f.get(io.sentry.util.k.a(l4Var.O()))) == null) {
            return;
        }
        WeakReference<d2> a = rVar.a();
        if (l4Var.C().e() == null && a != null && (d2Var = a.get()) != null) {
            l4Var.C().m(d2Var.m());
        }
        String b2 = rVar.b();
        if (l4Var.t0() != null || b2 == null) {
            return;
        }
        l4Var.E0(b2);
    }

    private s3 b(s3 s3Var, t3 t3Var) {
        if (t3Var != null) {
            try {
                s3 s3Var2 = new s3(s3Var);
                t3Var.a(s3Var2);
                return s3Var2;
            } catch (Throwable th) {
                this.f19065b.getLogger().b(s4.ERROR, "Error in the 'ScopeCallback' callback.", th);
            }
        }
        return s3Var;
    }

    private io.sentry.protocol.q c(l4 l4Var, n1 n1Var, t3 t3Var) {
        io.sentry.protocol.q qVar = io.sentry.protocol.q.f19172f;
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return qVar;
        }
        if (l4Var == null) {
            this.f19065b.getLogger().c(s4.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return qVar;
        }
        try {
            a(l4Var);
            k5.a a = this.f19067d.a();
            qVar = a.a().b(l4Var, b(a.c(), t3Var), n1Var);
            this.a = qVar;
            return qVar;
        } catch (Throwable th) {
            this.f19065b.getLogger().b(s4.ERROR, "Error while capturing event with id: " + l4Var.G(), th);
            return qVar;
        }
    }

    private static k5.a p(x4 x4Var) {
        t(x4Var);
        return new k5.a(x4Var, new d4(x4Var), new s3(x4Var));
    }

    private e2 q(r5 r5Var, t5 t5Var) {
        final e2 e2Var;
        io.sentry.util.q.c(r5Var, "transactionContext is required");
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            e2Var = d3.r();
        } else if (!this.f19065b.getInstrumenter().equals(r5Var.s())) {
            this.f19065b.getLogger().c(s4.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", r5Var.s(), this.f19065b.getInstrumenter());
            e2Var = d3.r();
        } else if (!this.f19065b.isTracingEnabled()) {
            this.f19065b.getLogger().c(s4.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            e2Var = d3.r();
        } else {
            q5 a = this.f19068e.a(new r3(r5Var, t5Var.e()));
            r5Var.n(a);
            b5 b5Var = new b5(r5Var, this, t5Var, this.f19070g);
            if (a.c().booleanValue() && a.a().booleanValue()) {
                this.f19065b.getTransactionProfiler().b(b5Var);
            }
            e2Var = b5Var;
        }
        if (t5Var.i()) {
            j(new t3() { // from class: io.sentry.h
                @Override // io.sentry.t3
                public final void a(s3 s3Var) {
                    s3Var.z(e2.this);
                }
            });
        }
        return e2Var;
    }

    private static void t(x4 x4Var) {
        io.sentry.util.q.c(x4Var, "SentryOptions is required.");
        if (x4Var.getDsn() == null || x4Var.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
    }

    @Override // io.sentry.v1
    public void close() {
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration integration : this.f19065b.getIntegrations()) {
                if (integration instanceof Closeable) {
                    try {
                        ((Closeable) integration).close();
                    } catch (IOException e2) {
                        this.f19065b.getLogger().c(s4.WARNING, "Failed to close the integration {}.", integration, e2);
                    }
                }
            }
            j(new t3() { // from class: io.sentry.i
                @Override // io.sentry.t3
                public final void a(s3 s3Var) {
                    s3Var.b();
                }
            });
            this.f19065b.getTransactionProfiler().close();
            this.f19065b.getTransactionPerformanceCollector().close();
            this.f19065b.getExecutorService().a(this.f19065b.getShutdownTimeoutMillis());
            this.f19067d.a().a().close();
        } catch (Throwable th) {
            this.f19065b.getLogger().b(s4.ERROR, "Error while closing the Hub.", th);
        }
        this.f19066c = false;
    }

    @Override // io.sentry.v1
    public void d(long j2) {
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f19067d.a().a().d(j2);
        } catch (Throwable th) {
            this.f19065b.getLogger().b(s4.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.v1
    public /* synthetic */ void e(v0 v0Var) {
        u1.a(this, v0Var);
    }

    @Override // io.sentry.v1
    public void endSession() {
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        k5.a a = this.f19067d.a();
        d5 g2 = a.c().g();
        if (g2 != null) {
            a.a().a(g2, io.sentry.util.m.a(new io.sentry.hints.m()));
        }
    }

    @Override // io.sentry.v1
    @ApiStatus.Internal
    public io.sentry.protocol.q f(h4 h4Var, n1 n1Var) {
        io.sentry.util.q.c(h4Var, "SentryEnvelope is required.");
        io.sentry.protocol.q qVar = io.sentry.protocol.q.f19172f;
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return qVar;
        }
        try {
            io.sentry.protocol.q f2 = this.f19067d.a().a().f(h4Var, n1Var);
            return f2 != null ? f2 : qVar;
        } catch (Throwable th) {
            this.f19065b.getLogger().b(s4.ERROR, "Error while capturing envelope.", th);
            return qVar;
        }
    }

    @Override // io.sentry.v1
    @ApiStatus.Internal
    public e2 g(r5 r5Var, t5 t5Var) {
        return q(r5Var, t5Var);
    }

    @Override // io.sentry.v1
    public /* synthetic */ io.sentry.protocol.q h(io.sentry.protocol.x xVar, o5 o5Var, n1 n1Var) {
        return u1.c(this, xVar, o5Var, n1Var);
    }

    @Override // io.sentry.v1
    public void i(v0 v0Var, n1 n1Var) {
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (v0Var == null) {
            this.f19065b.getLogger().c(s4.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.f19067d.a().c().a(v0Var, n1Var);
        }
    }

    @Override // io.sentry.v1
    public boolean isEnabled() {
        return this.f19066c;
    }

    @Override // io.sentry.v1
    public void j(t3 t3Var) {
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            t3Var.a(this.f19067d.a().c());
        } catch (Throwable th) {
            this.f19065b.getLogger().b(s4.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.v1
    @ApiStatus.Internal
    public void k(Throwable th, d2 d2Var, String str) {
        io.sentry.util.q.c(th, "throwable is required");
        io.sentry.util.q.c(d2Var, "span is required");
        io.sentry.util.q.c(str, "transactionName is required");
        Throwable a = io.sentry.util.k.a(th);
        if (this.f19069f.containsKey(a)) {
            return;
        }
        this.f19069f.put(a, new io.sentry.util.r<>(new WeakReference(d2Var), str));
    }

    @Override // io.sentry.v1
    public x4 l() {
        return this.f19067d.a().b();
    }

    @Override // io.sentry.v1
    @ApiStatus.Internal
    public io.sentry.protocol.q m(io.sentry.protocol.x xVar, o5 o5Var, n1 n1Var, m3 m3Var) {
        io.sentry.util.q.c(xVar, "transaction is required");
        io.sentry.protocol.q qVar = io.sentry.protocol.q.f19172f;
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return qVar;
        }
        if (!xVar.p0()) {
            this.f19065b.getLogger().c(s4.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", xVar.G());
            return qVar;
        }
        if (!Boolean.TRUE.equals(Boolean.valueOf(xVar.q0()))) {
            this.f19065b.getLogger().c(s4.DEBUG, "Transaction %s was dropped due to sampling decision.", xVar.G());
            this.f19065b.getClientReportRecorder().a(io.sentry.clientreport.e.SAMPLE_RATE, z0.Transaction);
            return qVar;
        }
        try {
            k5.a a = this.f19067d.a();
            return a.a().c(xVar, o5Var, a.c(), n1Var, m3Var);
        } catch (Throwable th) {
            this.f19065b.getLogger().b(s4.ERROR, "Error while capturing transaction with id: " + xVar.G(), th);
            return qVar;
        }
    }

    @Override // io.sentry.v1
    public /* synthetic */ io.sentry.protocol.q n(h4 h4Var) {
        return u1.b(this, h4Var);
    }

    @Override // io.sentry.v1
    public io.sentry.protocol.q o(l4 l4Var, n1 n1Var) {
        return c(l4Var, n1Var, null);
    }

    @Override // io.sentry.v1
    public void startSession() {
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        k5.a a = this.f19067d.a();
        s3.d A = a.c().A();
        if (A != null) {
            if (A.b() != null) {
                a.a().a(A.b(), io.sentry.util.m.a(new io.sentry.hints.m()));
            }
            a.a().a(A.a(), io.sentry.util.m.a(new io.sentry.hints.o()));
            return;
        }
        this.f19065b.getLogger().c(s4.WARNING, "Session could not be started.", new Object[0]);
    }

    private p1(x4 x4Var, k5 k5Var) {
        this.f19069f = Collections.synchronizedMap(new WeakHashMap());
        t(x4Var);
        this.f19065b = x4Var;
        this.f19068e = new p5(x4Var);
        this.f19067d = k5Var;
        this.a = io.sentry.protocol.q.f19172f;
        this.f19070g = x4Var.getTransactionPerformanceCollector();
        this.f19066c = true;
    }

    @Override // io.sentry.v1
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public v1 m366clone() {
        if (!isEnabled()) {
            this.f19065b.getLogger().c(s4.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new p1(this.f19065b, new k5(this.f19067d));
    }

    private p1(x4 x4Var, k5.a aVar) {
        this(x4Var, new k5(x4Var.getLogger(), aVar));
    }
}
