package h.a.z.g;

import h.a.r;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComputationScheduler.java */
/* loaded from: classes2.dex */
public final class b extends r {

    /* renamed from: b, reason: collision with root package name */
    static final C0259b f18169b;

    /* renamed from: c, reason: collision with root package name */
    static final h f18170c;

    /* renamed from: d, reason: collision with root package name */
    static final int f18171d = d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: e, reason: collision with root package name */
    static final c f18172e;

    /* renamed from: f, reason: collision with root package name */
    final ThreadFactory f18173f;

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference<C0259b> f18174g;

    /* compiled from: ComputationScheduler.java */
    /* loaded from: classes2.dex */
    static final class a extends r.b {

        /* renamed from: f, reason: collision with root package name */
        private final h.a.z.a.e f18175f;

        /* renamed from: g, reason: collision with root package name */
        private final h.a.x.b f18176g;

        /* renamed from: h, reason: collision with root package name */
        private final h.a.z.a.e f18177h;

        /* renamed from: i, reason: collision with root package name */
        private final c f18178i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f18179j;

        a(c cVar) {
            this.f18178i = cVar;
            h.a.z.a.e eVar = new h.a.z.a.e();
            this.f18175f = eVar;
            h.a.x.b bVar = new h.a.x.b();
            this.f18176g = bVar;
            h.a.z.a.e eVar2 = new h.a.z.a.e();
            this.f18177h = eVar2;
            eVar2.b(eVar);
            eVar2.b(bVar);
        }

        @Override // h.a.r.b
        public h.a.x.c b(Runnable runnable) {
            if (this.f18179j) {
                return h.a.z.a.d.INSTANCE;
            }
            return this.f18178i.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f18175f);
        }

        @Override // h.a.r.b
        public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.f18179j) {
                return h.a.z.a.d.INSTANCE;
            }
            return this.f18178i.e(runnable, j2, timeUnit, this.f18176g);
        }

        @Override // h.a.x.c
        public void d() {
            if (this.f18179j) {
                return;
            }
            this.f18179j = true;
            this.f18177h.d();
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18179j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputationScheduler.java */
    /* renamed from: h.a.z.g.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0259b {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final c[] f18180b;

        /* renamed from: c, reason: collision with root package name */
        long f18181c;

        C0259b(int i2, ThreadFactory threadFactory) {
            this.a = i2;
            this.f18180b = new c[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f18180b[i3] = new c(threadFactory);
            }
        }

        public c a() {
            int i2 = this.a;
            if (i2 == 0) {
                return b.f18172e;
            }
            c[] cVarArr = this.f18180b;
            long j2 = this.f18181c;
            this.f18181c = 1 + j2;
            return cVarArr[(int) (j2 % i2)];
        }

        public void b() {
            for (c cVar : this.f18180b) {
                cVar.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputationScheduler.java */
    /* loaded from: classes2.dex */
    public static final class c extends g {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new h("RxComputationShutdown"));
        f18172e = cVar;
        cVar.d();
        h hVar = new h("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f18170c = hVar;
        C0259b c0259b = new C0259b(0, hVar);
        f18169b = c0259b;
        c0259b.b();
    }

    public b() {
        this(f18170c);
    }

    static int d(int i2, int i3) {
        return (i3 <= 0 || i3 > i2) ? i2 : i3;
    }

    @Override // h.a.r
    public r.b a() {
        return new a(this.f18174g.get().a());
    }

    @Override // h.a.r
    public h.a.x.c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f18174g.get().a().g(runnable, j2, timeUnit);
    }

    public void e() {
        C0259b c0259b = new C0259b(f18171d, this.f18173f);
        if (this.f18174g.compareAndSet(f18169b, c0259b)) {
            return;
        }
        c0259b.b();
    }

    public b(ThreadFactory threadFactory) {
        this.f18173f = threadFactory;
        this.f18174g = new AtomicReference<>(f18169b);
        e();
    }
}
