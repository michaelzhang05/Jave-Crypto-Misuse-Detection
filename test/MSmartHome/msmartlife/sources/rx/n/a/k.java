package rx.n.a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.exceptions.MissingBackpressureException;

/* compiled from: OnSubscribeConcatMap.java */
/* loaded from: classes3.dex */
public final class k<T, R> implements e.a<R> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<? extends T> f22646f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<? super T, ? extends rx.e<? extends R>> f22647g;

    /* renamed from: h, reason: collision with root package name */
    final int f22648h;

    /* renamed from: i, reason: collision with root package name */
    final int f22649i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeConcatMap.java */
    /* loaded from: classes3.dex */
    public class a implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f22650f;

        a(d dVar) {
            this.f22650f = dVar;
        }

        @Override // rx.g
        public void request(long j2) {
            this.f22650f.i(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeConcatMap.java */
    /* loaded from: classes3.dex */
    public static final class b<T, R> implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final R f22652f;

        /* renamed from: g, reason: collision with root package name */
        final d<T, R> f22653g;

        /* renamed from: h, reason: collision with root package name */
        boolean f22654h;

        public b(R r, d<T, R> dVar) {
            this.f22652f = r;
            this.f22653g = dVar;
        }

        @Override // rx.g
        public void request(long j2) {
            if (this.f22654h || j2 <= 0) {
                return;
            }
            this.f22654h = true;
            d<T, R> dVar = this.f22653g;
            dVar.g(this.f22652f);
            dVar.e(1L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeConcatMap.java */
    /* loaded from: classes3.dex */
    public static final class c<T, R> extends rx.j<R> {

        /* renamed from: f, reason: collision with root package name */
        final d<T, R> f22655f;

        /* renamed from: g, reason: collision with root package name */
        long f22656g;

        public c(d<T, R> dVar) {
            this.f22655f = dVar;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22655f.e(this.f22656g);
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22655f.f(th, this.f22656g);
        }

        @Override // rx.f
        public void onNext(R r) {
            this.f22656g++;
            this.f22655f.g(r);
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22655f.f22660i.c(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeConcatMap.java */
    /* loaded from: classes3.dex */
    public static final class d<T, R> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super R> f22657f;

        /* renamed from: g, reason: collision with root package name */
        final rx.m.e<? super T, ? extends rx.e<? extends R>> f22658g;

        /* renamed from: h, reason: collision with root package name */
        final int f22659h;

        /* renamed from: j, reason: collision with root package name */
        final Queue<Object> f22661j;
        final rx.t.d m;
        volatile boolean n;
        volatile boolean o;

        /* renamed from: i, reason: collision with root package name */
        final rx.n.b.a f22660i = new rx.n.b.a();

        /* renamed from: k, reason: collision with root package name */
        final AtomicInteger f22662k = new AtomicInteger();
        final AtomicReference<Throwable> l = new AtomicReference<>();

        public d(rx.j<? super R> jVar, rx.m.e<? super T, ? extends rx.e<? extends R>> eVar, int i2, int i3) {
            Queue<Object> eVar2;
            this.f22657f = jVar;
            this.f22658g = eVar;
            this.f22659h = i3;
            if (rx.n.e.o.z.b()) {
                eVar2 = new rx.n.e.o.s<>(i2);
            } else {
                eVar2 = new rx.n.e.n.e<>(i2);
            }
            this.f22661j = eVar2;
            this.m = new rx.t.d();
            request(i2);
        }

        void c() {
            if (this.f22662k.getAndIncrement() != 0) {
                return;
            }
            int i2 = this.f22659h;
            while (!this.f22657f.isUnsubscribed()) {
                if (!this.o) {
                    if (i2 == 1 && this.l.get() != null) {
                        Throwable i3 = rx.n.e.e.i(this.l);
                        if (rx.n.e.e.f(i3)) {
                            return;
                        }
                        this.f22657f.onError(i3);
                        return;
                    }
                    boolean z = this.n;
                    Object poll = this.f22661j.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable i4 = rx.n.e.e.i(this.l);
                        if (i4 == null) {
                            this.f22657f.onCompleted();
                            return;
                        } else {
                            if (rx.n.e.e.f(i4)) {
                                return;
                            }
                            this.f22657f.onError(i4);
                            return;
                        }
                    }
                    if (!z2) {
                        try {
                            rx.e<? extends R> call = this.f22658g.call((Object) h.e(poll));
                            if (call == null) {
                                d(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            }
                            if (call != rx.e.B()) {
                                if (call instanceof rx.n.e.j) {
                                    this.o = true;
                                    this.f22660i.c(new b(((rx.n.e.j) call).h1(), this));
                                } else {
                                    c cVar = new c(this);
                                    this.m.b(cVar);
                                    if (cVar.isUnsubscribed()) {
                                        return;
                                    }
                                    this.o = true;
                                    call.c1(cVar);
                                }
                                request(1L);
                            } else {
                                request(1L);
                            }
                        } catch (Throwable th) {
                            rx.exceptions.a.e(th);
                            d(th);
                            return;
                        }
                    }
                }
                if (this.f22662k.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        void d(Throwable th) {
            unsubscribe();
            if (rx.n.e.e.d(this.l, th)) {
                Throwable i2 = rx.n.e.e.i(this.l);
                if (rx.n.e.e.f(i2)) {
                    return;
                }
                this.f22657f.onError(i2);
                return;
            }
            h(th);
        }

        void e(long j2) {
            if (j2 != 0) {
                this.f22660i.b(j2);
            }
            this.o = false;
            c();
        }

        void f(Throwable th, long j2) {
            if (!rx.n.e.e.d(this.l, th)) {
                h(th);
                return;
            }
            if (this.f22659h == 0) {
                Throwable i2 = rx.n.e.e.i(this.l);
                if (!rx.n.e.e.f(i2)) {
                    this.f22657f.onError(i2);
                }
                unsubscribe();
                return;
            }
            if (j2 != 0) {
                this.f22660i.b(j2);
            }
            this.o = false;
            c();
        }

        void g(R r) {
            this.f22657f.onNext(r);
        }

        void h(Throwable th) {
            rx.q.c.j(th);
        }

        void i(long j2) {
            if (j2 > 0) {
                this.f22660i.request(j2);
            } else {
                if (j2 >= 0) {
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j2);
            }
        }

        @Override // rx.f
        public void onCompleted() {
            this.n = true;
            c();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (rx.n.e.e.d(this.l, th)) {
                this.n = true;
                if (this.f22659h == 0) {
                    Throwable i2 = rx.n.e.e.i(this.l);
                    if (!rx.n.e.e.f(i2)) {
                        this.f22657f.onError(i2);
                    }
                    this.m.unsubscribe();
                    return;
                }
                c();
                return;
            }
            h(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            if (!this.f22661j.offer(h.g(t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
            } else {
                c();
            }
        }
    }

    public k(rx.e<? extends T> eVar, rx.m.e<? super T, ? extends rx.e<? extends R>> eVar2, int i2, int i3) {
        this.f22646f = eVar;
        this.f22647g = eVar2;
        this.f22648h = i2;
        this.f22649i = i3;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super R> jVar) {
        d dVar = new d(this.f22649i == 0 ? new rx.p.e<>(jVar) : jVar, this.f22647g, this.f22648h, this.f22649i);
        jVar.add(dVar);
        jVar.add(dVar.m);
        jVar.setProducer(new a(dVar));
        if (jVar.isUnsubscribed()) {
            return;
        }
        this.f22646f.c1(dVar);
    }
}
