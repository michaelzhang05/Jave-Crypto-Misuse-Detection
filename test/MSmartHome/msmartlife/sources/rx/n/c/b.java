package rx.n.c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.h;

/* compiled from: EventLoopsScheduler.java */
/* loaded from: classes3.dex */
public final class b extends rx.h implements k {

    /* renamed from: f, reason: collision with root package name */
    static final int f23000f;

    /* renamed from: g, reason: collision with root package name */
    static final c f23001g;

    /* renamed from: h, reason: collision with root package name */
    static final C0418b f23002h;

    /* renamed from: i, reason: collision with root package name */
    final ThreadFactory f23003i;

    /* renamed from: j, reason: collision with root package name */
    final AtomicReference<C0418b> f23004j = new AtomicReference<>(f23002h);

    /* compiled from: EventLoopsScheduler.java */
    /* loaded from: classes3.dex */
    static final class a extends h.a {

        /* renamed from: f, reason: collision with root package name */
        private final rx.n.e.l f23005f;

        /* renamed from: g, reason: collision with root package name */
        private final rx.t.b f23006g;

        /* renamed from: h, reason: collision with root package name */
        private final rx.n.e.l f23007h;

        /* renamed from: i, reason: collision with root package name */
        private final c f23008i;

        /* compiled from: EventLoopsScheduler.java */
        /* renamed from: rx.n.c.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0416a implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.m.a f23009f;

            C0416a(rx.m.a aVar) {
                this.f23009f = aVar;
            }

            @Override // rx.m.a
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.f23009f.call();
            }
        }

        /* compiled from: EventLoopsScheduler.java */
        /* renamed from: rx.n.c.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0417b implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.m.a f23011f;

            C0417b(rx.m.a aVar) {
                this.f23011f = aVar;
            }

            @Override // rx.m.a
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.f23011f.call();
            }
        }

        a(c cVar) {
            rx.n.e.l lVar = new rx.n.e.l();
            this.f23005f = lVar;
            rx.t.b bVar = new rx.t.b();
            this.f23006g = bVar;
            this.f23007h = new rx.n.e.l(lVar, bVar);
            this.f23008i = cVar;
        }

        @Override // rx.h.a
        public rx.k c(rx.m.a aVar) {
            if (isUnsubscribed()) {
                return rx.t.e.c();
            }
            return this.f23008i.k(new C0416a(aVar), 0L, null, this.f23005f);
        }

        @Override // rx.h.a
        public rx.k d(rx.m.a aVar, long j2, TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return rx.t.e.c();
            }
            return this.f23008i.l(new C0417b(aVar), j2, timeUnit, this.f23006g);
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f23007h.isUnsubscribed();
        }

        @Override // rx.k
        public void unsubscribe() {
            this.f23007h.unsubscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventLoopsScheduler.java */
    /* renamed from: rx.n.c.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0418b {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final c[] f23013b;

        /* renamed from: c, reason: collision with root package name */
        long f23014c;

        C0418b(ThreadFactory threadFactory, int i2) {
            this.a = i2;
            this.f23013b = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f23013b[i3] = new c(threadFactory);
            }
        }

        public c a() {
            int i2 = this.a;
            if (i2 == 0) {
                return b.f23001g;
            }
            c[] cVarArr = this.f23013b;
            long j2 = this.f23014c;
            this.f23014c = 1 + j2;
            return cVarArr[(int) (j2 % i2)];
        }

        public void b() {
            for (c cVar : this.f23013b) {
                cVar.unsubscribe();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventLoopsScheduler.java */
    /* loaded from: classes3.dex */
    public static final class c extends h {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f23000f = intValue;
        c cVar = new c(rx.n.e.i.f23112f);
        f23001g = cVar;
        cVar.unsubscribe();
        f23002h = new C0418b(null, 0);
    }

    public b(ThreadFactory threadFactory) {
        this.f23003i = threadFactory;
        start();
    }

    public rx.k a(rx.m.a aVar) {
        return this.f23004j.get().a().j(aVar, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // rx.h
    public h.a createWorker() {
        return new a(this.f23004j.get().a());
    }

    @Override // rx.n.c.k
    public void shutdown() {
        C0418b c0418b;
        C0418b c0418b2;
        do {
            c0418b = this.f23004j.get();
            c0418b2 = f23002h;
            if (c0418b == c0418b2) {
                return;
            }
        } while (!this.f23004j.compareAndSet(c0418b, c0418b2));
        c0418b.b();
    }

    @Override // rx.n.c.k
    public void start() {
        C0418b c0418b = new C0418b(this.f23003i, f23000f);
        if (this.f23004j.compareAndSet(f23002h, c0418b)) {
            return;
        }
        c0418b.b();
    }
}
