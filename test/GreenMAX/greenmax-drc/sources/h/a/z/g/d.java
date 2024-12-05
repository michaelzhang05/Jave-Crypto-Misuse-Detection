package h.a.z.g;

import h.a.r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExecutorScheduler.java */
/* loaded from: classes2.dex */
public final class d extends r {

    /* renamed from: b, reason: collision with root package name */
    static final r f18183b = h.a.b0.a.c();

    /* renamed from: c, reason: collision with root package name */
    final boolean f18184c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f18185d;

    /* compiled from: ExecutorScheduler.java */
    /* loaded from: classes2.dex */
    final class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final b f18186f;

        a(b bVar) {
            this.f18186f = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f18186f;
            bVar.f18189g.a(d.this.b(bVar));
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* loaded from: classes2.dex */
    static final class b extends AtomicReference<Runnable> implements Runnable, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.z.a.f f18188f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.z.a.f f18189g;

        b(Runnable runnable) {
            super(runnable);
            this.f18188f = new h.a.z.a.f();
            this.f18189g = new h.a.z.a.f();
        }

        @Override // h.a.x.c
        public void d() {
            if (getAndSet(null) != null) {
                this.f18188f.d();
                this.f18189g.d();
            }
        }

        @Override // h.a.x.c
        public boolean f() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    h.a.z.a.f fVar = this.f18188f;
                    h.a.z.a.c cVar = h.a.z.a.c.DISPOSED;
                    fVar.lazySet(cVar);
                    this.f18189g.lazySet(cVar);
                } catch (Throwable th) {
                    lazySet(null);
                    this.f18188f.lazySet(h.a.z.a.c.DISPOSED);
                    this.f18189g.lazySet(h.a.z.a.c.DISPOSED);
                    throw th;
                }
            }
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* loaded from: classes2.dex */
    public static final class c extends r.b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final boolean f18190f;

        /* renamed from: g, reason: collision with root package name */
        final Executor f18191g;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f18193i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f18194j = new AtomicInteger();

        /* renamed from: k, reason: collision with root package name */
        final h.a.x.b f18195k = new h.a.x.b();

        /* renamed from: h, reason: collision with root package name */
        final h.a.z.f.a<Runnable> f18192h = new h.a.z.f.a<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExecutorScheduler.java */
        /* loaded from: classes2.dex */
        public static final class a extends AtomicBoolean implements Runnable, h.a.x.c {

            /* renamed from: f, reason: collision with root package name */
            final Runnable f18196f;

            a(Runnable runnable) {
                this.f18196f = runnable;
            }

            @Override // h.a.x.c
            public void d() {
                lazySet(true);
            }

            @Override // h.a.x.c
            public boolean f() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f18196f.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExecutorScheduler.java */
        /* loaded from: classes2.dex */
        public static final class b extends AtomicInteger implements Runnable, h.a.x.c {

            /* renamed from: f, reason: collision with root package name */
            final Runnable f18197f;

            /* renamed from: g, reason: collision with root package name */
            final h.a.z.a.b f18198g;

            /* renamed from: h, reason: collision with root package name */
            volatile Thread f18199h;

            b(Runnable runnable, h.a.z.a.b bVar) {
                this.f18197f = runnable;
                this.f18198g = bVar;
            }

            void a() {
                h.a.z.a.b bVar = this.f18198g;
                if (bVar != null) {
                    bVar.c(this);
                }
            }

            @Override // h.a.x.c
            public void d() {
                while (true) {
                    int i2 = get();
                    if (i2 >= 2) {
                        return;
                    }
                    if (i2 == 0) {
                        if (compareAndSet(0, 4)) {
                            a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f18199h;
                        if (thread != null) {
                            thread.interrupt();
                            this.f18199h = null;
                        }
                        set(4);
                        a();
                        return;
                    }
                }
            }

            @Override // h.a.x.c
            public boolean f() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f18199h = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f18197f.run();
                            this.f18199h = null;
                            if (compareAndSet(1, 2)) {
                                a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                            return;
                        } catch (Throwable th) {
                            this.f18199h = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                a();
                            }
                            throw th;
                        }
                    }
                    this.f18199h = null;
                }
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: h.a.z.g.d$c$c, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        final class RunnableC0260c implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            private final h.a.z.a.f f18200f;

            /* renamed from: g, reason: collision with root package name */
            private final Runnable f18201g;

            RunnableC0260c(h.a.z.a.f fVar, Runnable runnable) {
                this.f18200f = fVar;
                this.f18201g = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18200f.a(c.this.b(this.f18201g));
            }
        }

        public c(Executor executor, boolean z) {
            this.f18191g = executor;
            this.f18190f = z;
        }

        @Override // h.a.r.b
        public h.a.x.c b(Runnable runnable) {
            h.a.x.c aVar;
            if (this.f18193i) {
                return h.a.z.a.d.INSTANCE;
            }
            Runnable q = h.a.a0.a.q(runnable);
            if (this.f18190f) {
                aVar = new b(q, this.f18195k);
                this.f18195k.b(aVar);
            } else {
                aVar = new a(q);
            }
            this.f18192h.offer(aVar);
            if (this.f18194j.getAndIncrement() == 0) {
                try {
                    this.f18191g.execute(this);
                } catch (RejectedExecutionException e2) {
                    this.f18193i = true;
                    this.f18192h.clear();
                    h.a.a0.a.o(e2);
                    return h.a.z.a.d.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // h.a.r.b
        public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (j2 <= 0) {
                return b(runnable);
            }
            if (this.f18193i) {
                return h.a.z.a.d.INSTANCE;
            }
            h.a.z.a.f fVar = new h.a.z.a.f();
            h.a.z.a.f fVar2 = new h.a.z.a.f(fVar);
            j jVar = new j(new RunnableC0260c(fVar2, h.a.a0.a.q(runnable)), this.f18195k);
            this.f18195k.b(jVar);
            Executor executor = this.f18191g;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    jVar.a(((ScheduledExecutorService) executor).schedule((Callable) jVar, j2, timeUnit));
                } catch (RejectedExecutionException e2) {
                    this.f18193i = true;
                    h.a.a0.a.o(e2);
                    return h.a.z.a.d.INSTANCE;
                }
            } else {
                jVar.a(new h.a.z.g.c(d.f18183b.c(jVar, j2, timeUnit)));
            }
            fVar.a(jVar);
            return fVar2;
        }

        @Override // h.a.x.c
        public void d() {
            if (this.f18193i) {
                return;
            }
            this.f18193i = true;
            this.f18195k.d();
            if (this.f18194j.getAndIncrement() == 0) {
                this.f18192h.clear();
            }
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18193i;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.a.z.f.a<Runnable> aVar = this.f18192h;
            int i2 = 1;
            while (!this.f18193i) {
                do {
                    Runnable poll = aVar.poll();
                    if (poll == null) {
                        if (this.f18193i) {
                            aVar.clear();
                            return;
                        } else {
                            i2 = this.f18194j.addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        }
                    } else {
                        poll.run();
                    }
                } while (!this.f18193i);
                aVar.clear();
                return;
            }
            aVar.clear();
        }
    }

    public d(Executor executor, boolean z) {
        this.f18185d = executor;
        this.f18184c = z;
    }

    @Override // h.a.r
    public r.b a() {
        return new c(this.f18185d, this.f18184c);
    }

    @Override // h.a.r
    public h.a.x.c b(Runnable runnable) {
        Runnable q = h.a.a0.a.q(runnable);
        try {
            if (this.f18185d instanceof ExecutorService) {
                i iVar = new i(q);
                iVar.a(((ExecutorService) this.f18185d).submit(iVar));
                return iVar;
            }
            if (this.f18184c) {
                c.b bVar = new c.b(q, null);
                this.f18185d.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(q);
            this.f18185d.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e2) {
            h.a.a0.a.o(e2);
            return h.a.z.a.d.INSTANCE;
        }
    }

    @Override // h.a.r
    public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        Runnable q = h.a.a0.a.q(runnable);
        if (this.f18185d instanceof ScheduledExecutorService) {
            try {
                i iVar = new i(q);
                iVar.a(((ScheduledExecutorService) this.f18185d).schedule(iVar, j2, timeUnit));
                return iVar;
            } catch (RejectedExecutionException e2) {
                h.a.a0.a.o(e2);
                return h.a.z.a.d.INSTANCE;
            }
        }
        b bVar = new b(q);
        bVar.f18188f.a(f18183b.c(new a(bVar), j2, timeUnit));
        return bVar;
    }
}
