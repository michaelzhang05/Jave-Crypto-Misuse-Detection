package io.sentry.transport;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.a1;
import io.sentry.h4;
import io.sentry.n1;
import io.sentry.p3;
import io.sentry.s4;
import io.sentry.transport.m;
import io.sentry.util.m;
import io.sentry.w1;
import io.sentry.x4;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncHttpTransport.java */
/* loaded from: classes2.dex */
public final class m implements r {

    /* renamed from: f, reason: collision with root package name */
    private final x f19257f;

    /* renamed from: g, reason: collision with root package name */
    private final io.sentry.cache.r f19258g;

    /* renamed from: h, reason: collision with root package name */
    private final x4 f19259h;

    /* renamed from: i, reason: collision with root package name */
    private final y f19260i;

    /* renamed from: j, reason: collision with root package name */
    private final s f19261j;

    /* renamed from: k, reason: collision with root package name */
    private final p f19262k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncHttpTransport.java */
    /* loaded from: classes2.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private int f19263f;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryAsyncConnection-");
            int i2 = this.f19263f;
            this.f19263f = i2 + 1;
            sb.append(i2);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncHttpTransport.java */
    /* loaded from: classes2.dex */
    public final class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final h4 f19264f;

        /* renamed from: g, reason: collision with root package name */
        private final n1 f19265g;

        /* renamed from: h, reason: collision with root package name */
        private final io.sentry.cache.r f19266h;

        /* renamed from: i, reason: collision with root package name */
        private final a0 f19267i = a0.a();

        c(h4 h4Var, n1 n1Var, io.sentry.cache.r rVar) {
            this.f19264f = (h4) io.sentry.util.q.c(h4Var, "Envelope is required.");
            this.f19265g = n1Var;
            this.f19266h = (io.sentry.cache.r) io.sentry.util.q.c(rVar, "EnvelopeCache is required.");
        }

        private a0 c() {
            a0 a0Var = this.f19267i;
            this.f19264f.b().d(null);
            this.f19266h.q(this.f19264f, this.f19265g);
            io.sentry.util.m.k(this.f19265g, io.sentry.hints.g.class, new m.a() { // from class: io.sentry.transport.c
                @Override // io.sentry.util.m.a
                public final void a(Object obj) {
                    m.c.this.e((io.sentry.hints.g) obj);
                }
            });
            if (m.this.f19261j.isConnected()) {
                final h4 c2 = m.this.f19259h.getClientReportRecorder().c(this.f19264f);
                try {
                    c2.b().d(a1.j(m.this.f19259h.getDateProvider().a().r()));
                    a0 h2 = m.this.f19262k.h(c2);
                    if (h2.d()) {
                        this.f19266h.d(this.f19264f);
                        return h2;
                    }
                    String str = "The transport failed to send the envelope with response code " + h2.c();
                    m.this.f19259h.getLogger().c(s4.ERROR, str, new Object[0]);
                    if (h2.c() >= 400 && h2.c() != 429) {
                        io.sentry.util.m.j(this.f19265g, io.sentry.hints.k.class, new m.c() { // from class: io.sentry.transport.b
                            @Override // io.sentry.util.m.c
                            public final void a(Object obj) {
                                m.c.this.g(c2, obj);
                            }
                        });
                    }
                    throw new IllegalStateException(str);
                } catch (IOException e2) {
                    io.sentry.util.m.l(this.f19265g, io.sentry.hints.k.class, new m.a() { // from class: io.sentry.transport.e
                        @Override // io.sentry.util.m.a
                        public final void a(Object obj) {
                            ((io.sentry.hints.k) obj).d(true);
                        }
                    }, new m.b() { // from class: io.sentry.transport.a
                        @Override // io.sentry.util.m.b
                        public final void a(Object obj, Class cls) {
                            m.c.this.j(c2, obj, cls);
                        }
                    });
                    throw new IllegalStateException("Sending the event failed.", e2);
                }
            }
            io.sentry.util.m.l(this.f19265g, io.sentry.hints.k.class, new m.a() { // from class: io.sentry.transport.f
                @Override // io.sentry.util.m.a
                public final void a(Object obj) {
                    ((io.sentry.hints.k) obj).d(true);
                }
            }, new m.b() { // from class: io.sentry.transport.d
                @Override // io.sentry.util.m.b
                public final void a(Object obj, Class cls) {
                    m.c.this.m(obj, cls);
                }
            });
            return a0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void e(io.sentry.hints.g gVar) {
            gVar.b();
            m.this.f19259h.getLogger().c(s4.DEBUG, "Disk flush envelope fired", new Object[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void g(h4 h4Var, Object obj) {
            m.this.f19259h.getClientReportRecorder().b(io.sentry.clientreport.e.NETWORK_ERROR, h4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void j(h4 h4Var, Object obj, Class cls) {
            io.sentry.util.p.a(cls, obj, m.this.f19259h.getLogger());
            m.this.f19259h.getClientReportRecorder().b(io.sentry.clientreport.e.NETWORK_ERROR, h4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m(Object obj, Class cls) {
            io.sentry.util.p.a(cls, obj, m.this.f19259h.getLogger());
            m.this.f19259h.getClientReportRecorder().b(io.sentry.clientreport.e.NETWORK_ERROR, this.f19264f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void o(a0 a0Var, io.sentry.hints.p pVar) {
            m.this.f19259h.getLogger().c(s4.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(a0Var.d()));
            pVar.c(a0Var.d());
        }

        @Override // java.lang.Runnable
        public void run() {
            final a0 a0Var = this.f19267i;
            try {
                a0Var = c();
                m.this.f19259h.getLogger().c(s4.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public m(x4 x4Var, y yVar, s sVar, p3 p3Var) {
        this(o(x4Var.getMaxQueueSize(), x4Var.getEnvelopeDiskCache(), x4Var.getLogger()), x4Var, yVar, sVar, new p(x4Var, p3Var, yVar));
    }

    private static void J(n1 n1Var, final boolean z) {
        io.sentry.util.m.k(n1Var, io.sentry.hints.p.class, new m.a() { // from class: io.sentry.transport.i
            @Override // io.sentry.util.m.a
            public final void a(Object obj) {
                ((io.sentry.hints.p) obj).c(false);
            }
        });
        io.sentry.util.m.k(n1Var, io.sentry.hints.k.class, new m.a() { // from class: io.sentry.transport.j
            @Override // io.sentry.util.m.a
            public final void a(Object obj) {
                ((io.sentry.hints.k) obj).d(z);
            }
        });
    }

    private static x o(int i2, final io.sentry.cache.r rVar, final w1 w1Var) {
        return new x(1, i2, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.h
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                m.w(io.sentry.cache.r.this, w1Var, runnable, threadPoolExecutor);
            }
        }, w1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void w(io.sentry.cache.r rVar, w1 w1Var, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.m.d(cVar.f19265g, io.sentry.hints.f.class)) {
                rVar.q(cVar.f19264f, cVar.f19265g);
            }
            J(cVar.f19265g, true);
            w1Var.c(s4.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19257f.shutdown();
        this.f19259h.getLogger().c(s4.DEBUG, "Shutting down", new Object[0]);
        try {
            if (this.f19257f.awaitTermination(1L, TimeUnit.MINUTES)) {
                return;
            }
            this.f19259h.getLogger().c(s4.WARNING, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.", new Object[0]);
            this.f19257f.shutdownNow();
        } catch (InterruptedException unused) {
            this.f19259h.getLogger().c(s4.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.r
    public void d(long j2) {
        this.f19257f.b(j2);
    }

    @Override // io.sentry.transport.r
    public void x(h4 h4Var, n1 n1Var) throws IOException {
        io.sentry.cache.r rVar = this.f19258g;
        boolean z = false;
        if (io.sentry.util.m.d(n1Var, io.sentry.hints.f.class)) {
            rVar = t.a();
            this.f19259h.getLogger().c(s4.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        }
        h4 b2 = this.f19260i.b(h4Var, n1Var);
        if (b2 == null) {
            if (z) {
                this.f19258g.d(h4Var);
                return;
            }
            return;
        }
        if (io.sentry.util.m.d(n1Var, UncaughtExceptionHandlerIntegration.a.class)) {
            b2 = this.f19259h.getClientReportRecorder().c(b2);
        }
        Future<?> submit = this.f19257f.submit(new c(b2, n1Var, rVar));
        if (submit == null || !submit.isCancelled()) {
            return;
        }
        this.f19259h.getClientReportRecorder().b(io.sentry.clientreport.e.QUEUE_OVERFLOW, b2);
    }

    public m(x xVar, x4 x4Var, y yVar, s sVar, p pVar) {
        this.f19257f = (x) io.sentry.util.q.c(xVar, "executor is required");
        this.f19258g = (io.sentry.cache.r) io.sentry.util.q.c(x4Var.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f19259h = (x4) io.sentry.util.q.c(x4Var, "options is required");
        this.f19260i = (y) io.sentry.util.q.c(yVar, "rateLimiter is required");
        this.f19261j = (s) io.sentry.util.q.c(sVar, "transportGate is required");
        this.f19262k = (p) io.sentry.util.q.c(pVar, "httpConnection is required");
    }
}
