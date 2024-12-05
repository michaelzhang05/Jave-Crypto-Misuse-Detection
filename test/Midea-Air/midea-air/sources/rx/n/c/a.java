package rx.n.c;

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
import rx.h;

/* compiled from: CachedThreadScheduler.java */
/* loaded from: classes3.dex */
public final class a extends rx.h implements k {

    /* renamed from: f, reason: collision with root package name */
    private static final long f22980f;

    /* renamed from: g, reason: collision with root package name */
    private static final TimeUnit f22981g = TimeUnit.SECONDS;

    /* renamed from: h, reason: collision with root package name */
    static final c f22982h;

    /* renamed from: i, reason: collision with root package name */
    static final C0413a f22983i;

    /* renamed from: j, reason: collision with root package name */
    final ThreadFactory f22984j;

    /* renamed from: k, reason: collision with root package name */
    final AtomicReference<C0413a> f22985k = new AtomicReference<>(f22983i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedThreadScheduler.java */
    /* renamed from: rx.n.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0413a {
        private final ThreadFactory a;

        /* renamed from: b, reason: collision with root package name */
        private final long f22986b;

        /* renamed from: c, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f22987c;

        /* renamed from: d, reason: collision with root package name */
        private final rx.t.b f22988d;

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f22989e;

        /* renamed from: f, reason: collision with root package name */
        private final Future<?> f22990f;

        /* compiled from: CachedThreadScheduler.java */
        /* renamed from: rx.n.c.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class ThreadFactoryC0414a implements ThreadFactory {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ThreadFactory f22991f;

            ThreadFactoryC0414a(ThreadFactory threadFactory) {
                this.f22991f = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f22991f.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        /* compiled from: CachedThreadScheduler.java */
        /* renamed from: rx.n.c.a$a$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0413a.this.a();
            }
        }

        C0413a(ThreadFactory threadFactory, long j2, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            this.a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
            this.f22986b = nanos;
            this.f22987c = new ConcurrentLinkedQueue<>();
            this.f22988d = new rx.t.b();
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactoryC0414a(threadFactory));
                h.m(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f22989e = scheduledExecutorService;
            this.f22990f = scheduledFuture;
        }

        void a() {
            if (this.f22987c.isEmpty()) {
                return;
            }
            long c2 = c();
            Iterator<c> it = this.f22987c.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.n() > c2) {
                    return;
                }
                if (this.f22987c.remove(next)) {
                    this.f22988d.d(next);
                }
            }
        }

        c b() {
            if (this.f22988d.isUnsubscribed()) {
                return a.f22982h;
            }
            while (!this.f22987c.isEmpty()) {
                c poll = this.f22987c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.a);
            this.f22988d.a(cVar);
            return cVar;
        }

        long c() {
            return System.nanoTime();
        }

        void d(c cVar) {
            cVar.o(c() + this.f22986b);
            this.f22987c.offer(cVar);
        }

        void e() {
            try {
                Future<?> future = this.f22990f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f22989e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.f22988d.unsubscribe();
            }
        }
    }

    /* compiled from: CachedThreadScheduler.java */
    /* loaded from: classes3.dex */
    static final class b extends h.a implements rx.m.a {

        /* renamed from: g, reason: collision with root package name */
        private final C0413a f22995g;

        /* renamed from: h, reason: collision with root package name */
        private final c f22996h;

        /* renamed from: f, reason: collision with root package name */
        private final rx.t.b f22994f = new rx.t.b();

        /* renamed from: i, reason: collision with root package name */
        final AtomicBoolean f22997i = new AtomicBoolean();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CachedThreadScheduler.java */
        /* renamed from: rx.n.c.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0415a implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.m.a f22998f;

            C0415a(rx.m.a aVar) {
                this.f22998f = aVar;
            }

            @Override // rx.m.a
            public void call() {
                if (b.this.isUnsubscribed()) {
                    return;
                }
                this.f22998f.call();
            }
        }

        b(C0413a c0413a) {
            this.f22995g = c0413a;
            this.f22996h = c0413a.b();
        }

        @Override // rx.h.a
        public rx.k c(rx.m.a aVar) {
            return d(aVar, 0L, null);
        }

        @Override // rx.m.a
        public void call() {
            this.f22995g.d(this.f22996h);
        }

        @Override // rx.h.a
        public rx.k d(rx.m.a aVar, long j2, TimeUnit timeUnit) {
            if (this.f22994f.isUnsubscribed()) {
                return rx.t.e.c();
            }
            j j3 = this.f22996h.j(new C0415a(aVar), j2, timeUnit);
            this.f22994f.a(j3);
            j3.c(this.f22994f);
            return j3;
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f22994f.isUnsubscribed();
        }

        @Override // rx.k
        public void unsubscribe() {
            if (this.f22997i.compareAndSet(false, true)) {
                this.f22996h.c(this);
            }
            this.f22994f.unsubscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedThreadScheduler.java */
    /* loaded from: classes3.dex */
    public static final class c extends h {
        private long n;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.n = 0L;
        }

        public long n() {
            return this.n;
        }

        public void o(long j2) {
            this.n = j2;
        }
    }

    static {
        c cVar = new c(rx.n.e.i.f23112f);
        f22982h = cVar;
        cVar.unsubscribe();
        C0413a c0413a = new C0413a(null, 0L, null);
        f22983i = c0413a;
        c0413a.e();
        f22980f = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    public a(ThreadFactory threadFactory) {
        this.f22984j = threadFactory;
        start();
    }

    @Override // rx.h
    public h.a createWorker() {
        return new b(this.f22985k.get());
    }

    @Override // rx.n.c.k
    public void shutdown() {
        C0413a c0413a;
        C0413a c0413a2;
        do {
            c0413a = this.f22985k.get();
            c0413a2 = f22983i;
            if (c0413a == c0413a2) {
                return;
            }
        } while (!this.f22985k.compareAndSet(c0413a, c0413a2));
        c0413a.e();
    }

    @Override // rx.n.c.k
    public void start() {
        C0413a c0413a = new C0413a(this.f22984j, f22980f, f22981g);
        if (this.f22985k.compareAndSet(f22983i, c0413a)) {
            return;
        }
        c0413a.e();
    }
}
