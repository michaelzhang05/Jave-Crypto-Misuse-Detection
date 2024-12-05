package h.a.z.g;

import h.a.r;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TrampolineScheduler.java */
/* loaded from: classes2.dex */
public final class m extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final m f18244b = new m();

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes2.dex */
    static final class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final Runnable f18245f;

        /* renamed from: g, reason: collision with root package name */
        private final c f18246g;

        /* renamed from: h, reason: collision with root package name */
        private final long f18247h;

        a(Runnable runnable, c cVar, long j2) {
            this.f18245f = runnable;
            this.f18246g = cVar;
            this.f18247h = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18246g.f18255i) {
                return;
            }
            long a = this.f18246g.a(TimeUnit.MILLISECONDS);
            long j2 = this.f18247h;
            if (j2 > a) {
                try {
                    Thread.sleep(j2 - a);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    h.a.a0.a.o(e2);
                    return;
                }
            }
            if (this.f18246g.f18255i) {
                return;
            }
            this.f18245f.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes2.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: f, reason: collision with root package name */
        final Runnable f18248f;

        /* renamed from: g, reason: collision with root package name */
        final long f18249g;

        /* renamed from: h, reason: collision with root package name */
        final int f18250h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f18251i;

        b(Runnable runnable, Long l, int i2) {
            this.f18248f = runnable;
            this.f18249g = l.longValue();
            this.f18250h = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int b2 = h.a.z.b.b.b(this.f18249g, bVar.f18249g);
            return b2 == 0 ? h.a.z.b.b.a(this.f18250h, bVar.f18250h) : b2;
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes2.dex */
    static final class c extends r.b implements h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final PriorityBlockingQueue<b> f18252f = new PriorityBlockingQueue<>();

        /* renamed from: g, reason: collision with root package name */
        private final AtomicInteger f18253g = new AtomicInteger();

        /* renamed from: h, reason: collision with root package name */
        final AtomicInteger f18254h = new AtomicInteger();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f18255i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TrampolineScheduler.java */
        /* loaded from: classes2.dex */
        public final class a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final b f18256f;

            a(b bVar) {
                this.f18256f = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18256f.f18251i = true;
                c.this.f18252f.remove(this.f18256f);
            }
        }

        c() {
        }

        @Override // h.a.r.b
        public h.a.x.c b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // h.a.r.b
        public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            long a2 = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j2);
            return e(new a(runnable, this, a2), a2);
        }

        @Override // h.a.x.c
        public void d() {
            this.f18255i = true;
        }

        h.a.x.c e(Runnable runnable, long j2) {
            if (this.f18255i) {
                return h.a.z.a.d.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j2), this.f18254h.incrementAndGet());
            this.f18252f.add(bVar);
            if (this.f18253g.getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f18255i) {
                    b poll = this.f18252f.poll();
                    if (poll == null) {
                        i2 = this.f18253g.addAndGet(-i2);
                        if (i2 == 0) {
                            return h.a.z.a.d.INSTANCE;
                        }
                    } else if (!poll.f18251i) {
                        poll.f18248f.run();
                    }
                }
                this.f18252f.clear();
                return h.a.z.a.d.INSTANCE;
            }
            return h.a.x.d.d(new a(bVar));
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18255i;
        }
    }

    m() {
    }

    public static m d() {
        return f18244b;
    }

    @Override // h.a.r
    public r.b a() {
        return new c();
    }

    @Override // h.a.r
    public h.a.x.c b(Runnable runnable) {
        h.a.a0.a.q(runnable).run();
        return h.a.z.a.d.INSTANCE;
    }

    @Override // h.a.r
    public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            h.a.a0.a.q(runnable).run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            h.a.a0.a.o(e2);
        }
        return h.a.z.a.d.INSTANCE;
    }
}
