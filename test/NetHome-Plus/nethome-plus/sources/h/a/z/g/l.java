package h.a.z.g;

import h.a.r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleScheduler.java */
/* loaded from: classes2.dex */
public final class l extends r {

    /* renamed from: b, reason: collision with root package name */
    static final h f18237b;

    /* renamed from: c, reason: collision with root package name */
    static final ScheduledExecutorService f18238c;

    /* renamed from: d, reason: collision with root package name */
    final ThreadFactory f18239d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f18240e;

    /* compiled from: SingleScheduler.java */
    /* loaded from: classes2.dex */
    static final class a extends r.b {

        /* renamed from: f, reason: collision with root package name */
        final ScheduledExecutorService f18241f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.x.b f18242g = new h.a.x.b();

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f18243h;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f18241f = scheduledExecutorService;
        }

        @Override // h.a.r.b
        public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            Future<?> schedule;
            if (this.f18243h) {
                return h.a.z.a.d.INSTANCE;
            }
            j jVar = new j(h.a.a0.a.q(runnable), this.f18242g);
            this.f18242g.b(jVar);
            try {
                if (j2 <= 0) {
                    schedule = this.f18241f.submit((Callable) jVar);
                } else {
                    schedule = this.f18241f.schedule((Callable) jVar, j2, timeUnit);
                }
                jVar.a(schedule);
                return jVar;
            } catch (RejectedExecutionException e2) {
                d();
                h.a.a0.a.o(e2);
                return h.a.z.a.d.INSTANCE;
            }
        }

        @Override // h.a.x.c
        public void d() {
            if (this.f18243h) {
                return;
            }
            this.f18243h = true;
            this.f18242g.d();
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18243h;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f18238c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f18237b = new h("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public l() {
        this(f18237b);
    }

    static ScheduledExecutorService d(ThreadFactory threadFactory) {
        return k.a(threadFactory);
    }

    @Override // h.a.r
    public r.b a() {
        return new a(this.f18240e.get());
    }

    @Override // h.a.r
    public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Future<?> schedule;
        i iVar = new i(h.a.a0.a.q(runnable));
        try {
            if (j2 <= 0) {
                schedule = this.f18240e.get().submit(iVar);
            } else {
                schedule = this.f18240e.get().schedule(iVar, j2, timeUnit);
            }
            iVar.a(schedule);
            return iVar;
        } catch (RejectedExecutionException e2) {
            h.a.a0.a.o(e2);
            return h.a.z.a.d.INSTANCE;
        }
    }

    public l(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f18240e = atomicReference;
        this.f18239d = threadFactory;
        atomicReference.lazySet(d(threadFactory));
    }
}
