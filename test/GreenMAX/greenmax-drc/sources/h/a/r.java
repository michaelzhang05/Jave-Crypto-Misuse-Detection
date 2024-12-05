package h.a;

import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler.java */
/* loaded from: classes2.dex */
public abstract class r {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scheduler.java */
    /* loaded from: classes2.dex */
    public static final class a implements h.a.x.c, Runnable {

        /* renamed from: f, reason: collision with root package name */
        final Runnable f17967f;

        /* renamed from: g, reason: collision with root package name */
        final b f17968g;

        /* renamed from: h, reason: collision with root package name */
        Thread f17969h;

        a(Runnable runnable, b bVar) {
            this.f17967f = runnable;
            this.f17968g = bVar;
        }

        @Override // h.a.x.c
        public void d() {
            if (this.f17969h == Thread.currentThread()) {
                b bVar = this.f17968g;
                if (bVar instanceof h.a.z.g.g) {
                    ((h.a.z.g.g) bVar).h();
                    return;
                }
            }
            this.f17968g.d();
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f17968g.f();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17969h = Thread.currentThread();
            try {
                this.f17967f.run();
            } finally {
                d();
                this.f17969h = null;
            }
        }
    }

    /* compiled from: Scheduler.java */
    /* loaded from: classes2.dex */
    public static abstract class b implements h.a.x.c {
        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public h.a.x.c b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit);
    }

    public abstract b a();

    public h.a.x.c b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        b a2 = a();
        a aVar = new a(h.a.a0.a.q(runnable), a2);
        a2.c(aVar, j2, timeUnit);
        return aVar;
    }
}
