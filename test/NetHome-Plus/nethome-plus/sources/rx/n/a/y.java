package rx.n.a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.e;
import rx.h;
import rx.schedulers.Schedulers;

/* compiled from: OnSubscribeRedo.java */
/* loaded from: classes3.dex */
public final class y<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    static final rx.m.e<rx.e<? extends rx.d<?>>, rx.e<?>> f22909f = new a();

    /* renamed from: g, reason: collision with root package name */
    final rx.e<T> f22910g;

    /* renamed from: h, reason: collision with root package name */
    private final rx.m.e<? super rx.e<? extends rx.d<?>>, ? extends rx.e<?>> f22911h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f22912i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f22913j;

    /* renamed from: k, reason: collision with root package name */
    private final rx.h f22914k;

    /* compiled from: OnSubscribeRedo.java */
    /* loaded from: classes3.dex */
    static class a implements rx.m.e<rx.e<? extends rx.d<?>>, rx.e<?>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnSubscribeRedo.java */
        /* renamed from: rx.n.a.y$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0409a implements rx.m.e<rx.d<?>, rx.d<?>> {
            C0409a() {
            }

            @Override // rx.m.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public rx.d<?> call(rx.d<?> dVar) {
                return rx.d.c(null);
            }
        }

        a() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.e<?> call(rx.e<? extends rx.d<?>> eVar) {
            return eVar.X(new C0409a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeRedo.java */
    /* loaded from: classes3.dex */
    public class b implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.j f22916f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.s.d f22917g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.n.b.a f22918h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AtomicLong f22919i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ rx.t.d f22920j;

        /* compiled from: OnSubscribeRedo.java */
        /* loaded from: classes3.dex */
        class a extends rx.j<T> {

            /* renamed from: f, reason: collision with root package name */
            boolean f22922f;

            a() {
            }

            private void c() {
                long j2;
                do {
                    j2 = b.this.f22919i.get();
                    if (j2 == Long.MAX_VALUE) {
                        return;
                    }
                } while (!b.this.f22919i.compareAndSet(j2, j2 - 1));
            }

            @Override // rx.f
            public void onCompleted() {
                if (this.f22922f) {
                    return;
                }
                this.f22922f = true;
                unsubscribe();
                b.this.f22917g.onNext(rx.d.a());
            }

            @Override // rx.f
            public void onError(Throwable th) {
                if (this.f22922f) {
                    return;
                }
                this.f22922f = true;
                unsubscribe();
                b.this.f22917g.onNext(rx.d.b(th));
            }

            @Override // rx.f
            public void onNext(T t) {
                if (this.f22922f) {
                    return;
                }
                b.this.f22916f.onNext(t);
                c();
                b.this.f22918h.b(1L);
            }

            @Override // rx.j
            public void setProducer(rx.g gVar) {
                b.this.f22918h.c(gVar);
            }
        }

        b(rx.j jVar, rx.s.d dVar, rx.n.b.a aVar, AtomicLong atomicLong, rx.t.d dVar2) {
            this.f22916f = jVar;
            this.f22917g = dVar;
            this.f22918h = aVar;
            this.f22919i = atomicLong;
            this.f22920j = dVar2;
        }

        @Override // rx.m.a
        public void call() {
            if (this.f22916f.isUnsubscribed()) {
                return;
            }
            a aVar = new a();
            this.f22920j.b(aVar);
            y.this.f22910g.c1(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeRedo.java */
    /* loaded from: classes3.dex */
    public class c implements e.b<rx.d<?>, rx.d<?>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnSubscribeRedo.java */
        /* loaded from: classes3.dex */
        public class a extends rx.j<rx.d<?>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.j f22925f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(rx.j jVar, rx.j jVar2) {
                super(jVar);
                this.f22925f = jVar2;
            }

            @Override // rx.f
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onNext(rx.d<?> dVar) {
                if (dVar.i() && y.this.f22912i) {
                    this.f22925f.onCompleted();
                } else if (dVar.j() && y.this.f22913j) {
                    this.f22925f.onError(dVar.e());
                } else {
                    this.f22925f.onNext(dVar);
                }
            }

            @Override // rx.f
            public void onCompleted() {
                this.f22925f.onCompleted();
            }

            @Override // rx.f
            public void onError(Throwable th) {
                this.f22925f.onError(th);
            }

            @Override // rx.j
            public void setProducer(rx.g gVar) {
                gVar.request(Long.MAX_VALUE);
            }
        }

        c() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.j<? super rx.d<?>> call(rx.j<? super rx.d<?>> jVar) {
            return new a(jVar, jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeRedo.java */
    /* loaded from: classes3.dex */
    public class d implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.e f22927f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.j f22928g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AtomicLong f22929h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h.a f22930i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ rx.m.a f22931j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f22932k;

        /* compiled from: OnSubscribeRedo.java */
        /* loaded from: classes3.dex */
        class a extends rx.j<Object> {
            a(rx.j jVar) {
                super(jVar);
            }

            @Override // rx.f
            public void onCompleted() {
                d.this.f22928g.onCompleted();
            }

            @Override // rx.f
            public void onError(Throwable th) {
                d.this.f22928g.onError(th);
            }

            @Override // rx.f
            public void onNext(Object obj) {
                if (d.this.f22928g.isUnsubscribed()) {
                    return;
                }
                if (d.this.f22929h.get() > 0) {
                    d dVar = d.this;
                    dVar.f22930i.c(dVar.f22931j);
                } else {
                    d.this.f22932k.compareAndSet(false, true);
                }
            }

            @Override // rx.j
            public void setProducer(rx.g gVar) {
                gVar.request(Long.MAX_VALUE);
            }
        }

        d(rx.e eVar, rx.j jVar, AtomicLong atomicLong, h.a aVar, rx.m.a aVar2, AtomicBoolean atomicBoolean) {
            this.f22927f = eVar;
            this.f22928g = jVar;
            this.f22929h = atomicLong;
            this.f22930i = aVar;
            this.f22931j = aVar2;
            this.f22932k = atomicBoolean;
        }

        @Override // rx.m.a
        public void call() {
            this.f22927f.c1(new a(this.f22928g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeRedo.java */
    /* loaded from: classes3.dex */
    public class e implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AtomicLong f22934f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.n.b.a f22935g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f22936h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h.a f22937i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ rx.m.a f22938j;

        e(AtomicLong atomicLong, rx.n.b.a aVar, AtomicBoolean atomicBoolean, h.a aVar2, rx.m.a aVar3) {
            this.f22934f = atomicLong;
            this.f22935g = aVar;
            this.f22936h = atomicBoolean;
            this.f22937i = aVar2;
            this.f22938j = aVar3;
        }

        @Override // rx.g
        public void request(long j2) {
            if (j2 > 0) {
                rx.n.a.a.b(this.f22934f, j2);
                this.f22935g.request(j2);
                if (this.f22936h.compareAndSet(true, false)) {
                    this.f22937i.c(this.f22938j);
                }
            }
        }
    }

    private y(rx.e<T> eVar, rx.m.e<? super rx.e<? extends rx.d<?>>, ? extends rx.e<?>> eVar2, boolean z, boolean z2, rx.h hVar) {
        this.f22910g = eVar;
        this.f22911h = eVar2;
        this.f22912i = z;
        this.f22913j = z2;
        this.f22914k = hVar;
    }

    public static <T> rx.e<T> b(rx.e<T> eVar) {
        return c(eVar, f22909f);
    }

    public static <T> rx.e<T> c(rx.e<T> eVar, rx.m.e<? super rx.e<? extends rx.d<?>>, ? extends rx.e<?>> eVar2) {
        return rx.e.b1(new y(eVar, eVar2, true, false, Schedulers.trampoline()));
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        h.a createWorker = this.f22914k.createWorker();
        jVar.add(createWorker);
        rx.t.d dVar = new rx.t.d();
        jVar.add(dVar);
        rx.s.c<T, T> f1 = rx.s.a.g1().f1();
        f1.E0(rx.p.f.a());
        rx.n.b.a aVar = new rx.n.b.a();
        b bVar = new b(jVar, f1, aVar, atomicLong, dVar);
        createWorker.c(new d(this.f22911h.call(f1.W(new c())), jVar, atomicLong, createWorker, bVar, atomicBoolean));
        jVar.setProducer(new e(atomicLong, aVar, atomicBoolean, createWorker, bVar));
    }
}
