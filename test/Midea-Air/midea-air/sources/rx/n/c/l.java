package rx.n.c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.b;
import rx.h;

/* compiled from: SchedulerWhen.java */
/* loaded from: classes3.dex */
public class l extends rx.h implements rx.k {

    /* renamed from: f, reason: collision with root package name */
    static final rx.k f23055f = new c();

    /* renamed from: g, reason: collision with root package name */
    static final rx.k f23056g = rx.t.e.c();

    /* renamed from: h, reason: collision with root package name */
    private final rx.h f23057h;

    /* renamed from: i, reason: collision with root package name */
    private final rx.f<rx.e<rx.b>> f23058i;

    /* renamed from: j, reason: collision with root package name */
    private final rx.k f23059j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SchedulerWhen.java */
    /* loaded from: classes3.dex */
    public class a implements rx.m.e<g, rx.b> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h.a f23060f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SchedulerWhen.java */
        /* renamed from: rx.n.c.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0420a implements b.w {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f23062f;

            C0420a(g gVar) {
                this.f23062f = gVar;
            }

            @Override // rx.m.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(rx.c cVar) {
                cVar.a(this.f23062f);
                this.f23062f.b(a.this.f23060f, cVar);
            }
        }

        a(h.a aVar) {
            this.f23060f = aVar;
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.b call(g gVar) {
            return rx.b.h(new C0420a(gVar));
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: classes3.dex */
    class b extends h.a {

        /* renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f23064f = new AtomicBoolean();

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.a f23065g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.f f23066h;

        b(h.a aVar, rx.f fVar) {
            this.f23065g = aVar;
            this.f23066h = fVar;
        }

        @Override // rx.h.a
        public rx.k c(rx.m.a aVar) {
            e eVar = new e(aVar);
            this.f23066h.onNext(eVar);
            return eVar;
        }

        @Override // rx.h.a
        public rx.k d(rx.m.a aVar, long j2, TimeUnit timeUnit) {
            d dVar = new d(aVar, j2, timeUnit);
            this.f23066h.onNext(dVar);
            return dVar;
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f23064f.get();
        }

        @Override // rx.k
        public void unsubscribe() {
            if (this.f23064f.compareAndSet(false, true)) {
                this.f23065g.unsubscribe();
                this.f23066h.onCompleted();
            }
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: classes3.dex */
    static class c implements rx.k {
        c() {
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // rx.k
        public void unsubscribe() {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: classes3.dex */
    static class d extends g {

        /* renamed from: f, reason: collision with root package name */
        private final rx.m.a f23068f;

        /* renamed from: g, reason: collision with root package name */
        private final long f23069g;

        /* renamed from: h, reason: collision with root package name */
        private final TimeUnit f23070h;

        public d(rx.m.a aVar, long j2, TimeUnit timeUnit) {
            this.f23068f = aVar;
            this.f23069g = j2;
            this.f23070h = timeUnit;
        }

        @Override // rx.n.c.l.g
        protected rx.k c(h.a aVar, rx.c cVar) {
            return aVar.d(new f(this.f23068f, cVar), this.f23069g, this.f23070h);
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: classes3.dex */
    static class e extends g {

        /* renamed from: f, reason: collision with root package name */
        private final rx.m.a f23071f;

        public e(rx.m.a aVar) {
            this.f23071f = aVar;
        }

        @Override // rx.n.c.l.g
        protected rx.k c(h.a aVar, rx.c cVar) {
            return aVar.c(new f(this.f23071f, cVar));
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: classes3.dex */
    static class f implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        private rx.c f23072f;

        /* renamed from: g, reason: collision with root package name */
        private rx.m.a f23073g;

        public f(rx.m.a aVar, rx.c cVar) {
            this.f23073g = aVar;
            this.f23072f = cVar;
        }

        @Override // rx.m.a
        public void call() {
            try {
                this.f23073g.call();
            } finally {
                this.f23072f.onCompleted();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SchedulerWhen.java */
    /* loaded from: classes3.dex */
    public static abstract class g extends AtomicReference<rx.k> implements rx.k {
        public g() {
            super(l.f23055f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(h.a aVar, rx.c cVar) {
            rx.k kVar;
            rx.k kVar2 = get();
            if (kVar2 != l.f23056g && kVar2 == (kVar = l.f23055f)) {
                rx.k c2 = c(aVar, cVar);
                if (compareAndSet(kVar, c2)) {
                    return;
                }
                c2.unsubscribe();
            }
        }

        protected abstract rx.k c(h.a aVar, rx.c cVar);

        @Override // rx.k
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // rx.k
        public void unsubscribe() {
            rx.k kVar;
            rx.k kVar2 = l.f23056g;
            do {
                kVar = get();
                if (kVar == l.f23056g) {
                    return;
                }
            } while (!compareAndSet(kVar, kVar2));
            if (kVar != l.f23055f) {
                kVar.unsubscribe();
            }
        }
    }

    public l(rx.m.e<rx.e<rx.e<rx.b>>, rx.b> eVar, rx.h hVar) {
        this.f23057h = hVar;
        rx.s.b g1 = rx.s.b.g1();
        this.f23058i = new rx.p.d(g1);
        this.f23059j = eVar.call(g1.m0()).H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rx.h
    public h.a createWorker() {
        h.a createWorker = this.f23057h.createWorker();
        rx.n.a.b g1 = rx.n.a.b.g1();
        rx.p.d dVar = new rx.p.d(g1);
        Object X = g1.X(new a(createWorker));
        b bVar = new b(createWorker, dVar);
        this.f23058i.onNext(X);
        return bVar;
    }

    @Override // rx.k
    public boolean isUnsubscribed() {
        return this.f23059j.isUnsubscribed();
    }

    @Override // rx.k
    public void unsubscribe() {
        this.f23059j.unsubscribe();
    }
}
