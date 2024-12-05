package h.a.z.g;

import h.a.r;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: IoScheduler.java */
/* loaded from: classes2.dex */
public final class e extends r {

    /* renamed from: b, reason: collision with root package name */
    static final h f18203b;

    /* renamed from: c, reason: collision with root package name */
    static final h f18204c;

    /* renamed from: f, reason: collision with root package name */
    static final c f18207f;

    /* renamed from: g, reason: collision with root package name */
    static final a f18208g;

    /* renamed from: h, reason: collision with root package name */
    final ThreadFactory f18209h;

    /* renamed from: i, reason: collision with root package name */
    final AtomicReference<a> f18210i;

    /* renamed from: e, reason: collision with root package name */
    private static final TimeUnit f18206e = TimeUnit.SECONDS;

    /* renamed from: d, reason: collision with root package name */
    private static final long f18205d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IoScheduler.java */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final long f18211f;

        /* renamed from: g, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f18212g;

        /* renamed from: h, reason: collision with root package name */
        final h.a.x.b f18213h;

        /* renamed from: i, reason: collision with root package name */
        private final ScheduledExecutorService f18214i;

        /* renamed from: j, reason: collision with root package name */
        private final Future<?> f18215j;

        /* renamed from: k, reason: collision with root package name */
        private final ThreadFactory f18216k;

        a(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
            this.f18211f = nanos;
            this.f18212g = new ConcurrentLinkedQueue<>();
            this.f18213h = new h.a.x.b();
            this.f18216k = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, e.f18204c);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f18214i = scheduledExecutorService;
            this.f18215j = scheduledFuture;
        }

        void a() {
            if (this.f18212g.isEmpty()) {
                return;
            }
            long c2 = c();
            Iterator<c> it = this.f18212g.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.i() > c2) {
                    return;
                }
                if (this.f18212g.remove(next)) {
                    this.f18213h.a(next);
                }
            }
        }

        c b() {
            if (this.f18213h.f()) {
                return e.f18207f;
            }
            while (!this.f18212g.isEmpty()) {
                c poll = this.f18212g.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f18216k);
            this.f18213h.b(cVar);
            return cVar;
        }

        long c() {
            return System.nanoTime();
        }

        void d(c cVar) {
            cVar.j(c() + this.f18211f);
            this.f18212g.offer(cVar);
        }

        void e() {
            this.f18213h.d();
            Future<?> future = this.f18215j;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f18214i;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* compiled from: IoScheduler.java */
    /* loaded from: classes2.dex */
    static final class b extends r.b {

        /* renamed from: g, reason: collision with root package name */
        private final a f18218g;

        /* renamed from: h, reason: collision with root package name */
        private final c f18219h;

        /* renamed from: i, reason: collision with root package name */
        final AtomicBoolean f18220i = new AtomicBoolean();

        /* renamed from: f, reason: collision with root package name */
        private final h.a.x.b f18217f = new h.a.x.b();

        b(a aVar) {
            this.f18218g = aVar;
            this.f18219h = aVar.b();
        }

        @Override // h.a.r.b
        public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.f18217f.f()) {
                return h.a.z.a.d.INSTANCE;
            }
            return this.f18219h.e(runnable, j2, timeUnit, this.f18217f);
        }

        @Override // h.a.x.c
        public void d() {
            if (this.f18220i.compareAndSet(false, true)) {
                this.f18217f.d();
                this.f18218g.d(this.f18219h);
            }
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18220i.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IoScheduler.java */
    /* loaded from: classes2.dex */
    public static final class c extends g {

        /* renamed from: h, reason: collision with root package name */
        private long f18221h;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f18221h = 0L;
        }

        public long i() {
            return this.f18221h;
        }

        public void j(long j2) {
            this.f18221h = j2;
        }
    }

    static {
        c cVar = new c(new h("RxCachedThreadSchedulerShutdown"));
        f18207f = cVar;
        cVar.d();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        h hVar = new h("RxCachedThreadScheduler", max);
        f18203b = hVar;
        f18204c = new h("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0L, null, hVar);
        f18208g = aVar;
        aVar.e();
    }

    public e() {
        this(f18203b);
    }

    @Override // h.a.r
    public r.b a() {
        return new b(this.f18210i.get());
    }

    public void d() {
        a aVar = new a(f18205d, f18206e, this.f18209h);
        if (this.f18210i.compareAndSet(f18208g, aVar)) {
            return;
        }
        aVar.e();
    }

    public e(ThreadFactory threadFactory) {
        this.f18209h = threadFactory;
        this.f18210i = new AtomicReference<>(f18208g);
        d();
    }
}
