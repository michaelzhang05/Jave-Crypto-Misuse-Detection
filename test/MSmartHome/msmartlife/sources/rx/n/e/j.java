package rx.n.e;

import cm.aptoide.pt.account.AdultContentAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.e;
import rx.h;

/* compiled from: ScalarSynchronousObservable.java */
/* loaded from: classes3.dex */
public final class j<T> extends rx.e<T> {

    /* renamed from: g, reason: collision with root package name */
    static final boolean f23114g = Boolean.valueOf(System.getProperty("rx.just.strong-mode", AdultContentAnalytics.UNLOCK)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    final T f23115h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalarSynchronousObservable.java */
    /* loaded from: classes3.dex */
    public class a implements rx.m.e<rx.m.a, rx.k> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.n.c.b f23116f;

        a(rx.n.c.b bVar) {
            this.f23116f = bVar;
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.k call(rx.m.a aVar) {
            return this.f23116f.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalarSynchronousObservable.java */
    /* loaded from: classes3.dex */
    public class b implements rx.m.e<rx.m.a, rx.k> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.h f23118f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ScalarSynchronousObservable.java */
        /* loaded from: classes3.dex */
        public class a implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.m.a f23120f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h.a f23121g;

            a(rx.m.a aVar, h.a aVar2) {
                this.f23120f = aVar;
                this.f23121g = aVar2;
            }

            @Override // rx.m.a
            public void call() {
                try {
                    this.f23120f.call();
                } finally {
                    this.f23121g.unsubscribe();
                }
            }
        }

        b(rx.h hVar) {
            this.f23118f = hVar;
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.k call(rx.m.a aVar) {
            h.a createWorker = this.f23118f.createWorker();
            createWorker.c(new a(aVar, createWorker));
            return createWorker;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ScalarSynchronousObservable.java */
    /* loaded from: classes3.dex */
    public class c<R> implements e.a<R> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.e f23123f;

        c(rx.m.e eVar) {
            this.f23123f = eVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.j<? super R> jVar) {
            rx.e eVar = (rx.e) this.f23123f.call(j.this.f23115h);
            if (eVar instanceof j) {
                jVar.setProducer(j.g1(jVar, ((j) eVar).f23115h));
            } else {
                eVar.c1(rx.p.f.c(jVar));
            }
        }
    }

    /* compiled from: ScalarSynchronousObservable.java */
    /* loaded from: classes3.dex */
    static final class d<T> implements e.a<T> {

        /* renamed from: f, reason: collision with root package name */
        final T f23125f;

        d(T t) {
            this.f23125f = t;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.j<? super T> jVar) {
            jVar.setProducer(j.g1(jVar, this.f23125f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalarSynchronousObservable.java */
    /* loaded from: classes3.dex */
    public static final class e<T> implements e.a<T> {

        /* renamed from: f, reason: collision with root package name */
        final T f23126f;

        /* renamed from: g, reason: collision with root package name */
        final rx.m.e<rx.m.a, rx.k> f23127g;

        e(T t, rx.m.e<rx.m.a, rx.k> eVar) {
            this.f23126f = t;
            this.f23127g = eVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.j<? super T> jVar) {
            jVar.setProducer(new f(jVar, this.f23126f, this.f23127g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalarSynchronousObservable.java */
    /* loaded from: classes3.dex */
    public static final class f<T> extends AtomicBoolean implements rx.g, rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f23128f;

        /* renamed from: g, reason: collision with root package name */
        final T f23129g;

        /* renamed from: h, reason: collision with root package name */
        final rx.m.e<rx.m.a, rx.k> f23130h;

        public f(rx.j<? super T> jVar, T t, rx.m.e<rx.m.a, rx.k> eVar) {
            this.f23128f = jVar;
            this.f23129g = t;
            this.f23130h = eVar;
        }

        @Override // rx.m.a
        public void call() {
            rx.j<? super T> jVar = this.f23128f;
            if (jVar.isUnsubscribed()) {
                return;
            }
            T t = this.f23129g;
            try {
                jVar.onNext(t);
                if (jVar.isUnsubscribed()) {
                    return;
                }
                jVar.onCompleted();
            } catch (Throwable th) {
                rx.exceptions.a.g(th, jVar, t);
            }
        }

        @Override // rx.g
        public void request(long j2) {
            if (j2 >= 0) {
                if (j2 == 0 || !compareAndSet(false, true)) {
                    return;
                }
                this.f23128f.add(this.f23130h.call(this));
                return;
            }
            throw new IllegalArgumentException("n >= 0 required but it was " + j2);
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.f23129g + ", " + get() + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalarSynchronousObservable.java */
    /* loaded from: classes3.dex */
    public static final class g<T> implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f23131f;

        /* renamed from: g, reason: collision with root package name */
        final T f23132g;

        /* renamed from: h, reason: collision with root package name */
        boolean f23133h;

        public g(rx.j<? super T> jVar, T t) {
            this.f23131f = jVar;
            this.f23132g = t;
        }

        @Override // rx.g
        public void request(long j2) {
            if (this.f23133h) {
                return;
            }
            if (j2 < 0) {
                throw new IllegalStateException("n >= required but it was " + j2);
            }
            if (j2 == 0) {
                return;
            }
            this.f23133h = true;
            rx.j<? super T> jVar = this.f23131f;
            if (jVar.isUnsubscribed()) {
                return;
            }
            T t = this.f23132g;
            try {
                jVar.onNext(t);
                if (jVar.isUnsubscribed()) {
                    return;
                }
                jVar.onCompleted();
            } catch (Throwable th) {
                rx.exceptions.a.g(th, jVar, t);
            }
        }
    }

    protected j(T t) {
        super(rx.q.c.h(new d(t)));
        this.f23115h = t;
    }

    public static <T> j<T> f1(T t) {
        return new j<>(t);
    }

    static <T> rx.g g1(rx.j<? super T> jVar, T t) {
        if (f23114g) {
            return new rx.n.b.c(jVar, t);
        }
        return new g(jVar, t);
    }

    public T h1() {
        return this.f23115h;
    }

    public <R> rx.e<R> i1(rx.m.e<? super T, ? extends rx.e<? extends R>> eVar) {
        return rx.e.b1(new c(eVar));
    }

    public rx.e<T> j1(rx.h hVar) {
        rx.m.e bVar;
        if (hVar instanceof rx.n.c.b) {
            bVar = new a((rx.n.c.b) hVar);
        } else {
            bVar = new b(hVar);
        }
        return rx.e.b1(new e(this.f23115h, bVar));
    }
}
