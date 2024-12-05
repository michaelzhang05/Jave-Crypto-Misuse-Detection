package rx.n.a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;

/* compiled from: OnSubscribeFlatMapCompletable.java */
/* loaded from: classes3.dex */
public final class p<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<T> f22738f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<? super T, ? extends rx.b> f22739g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f22740h;

    /* renamed from: i, reason: collision with root package name */
    final int f22741i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeFlatMapCompletable.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f22742f;

        /* renamed from: g, reason: collision with root package name */
        final rx.m.e<? super T, ? extends rx.b> f22743g;

        /* renamed from: h, reason: collision with root package name */
        final boolean f22744h;

        /* renamed from: i, reason: collision with root package name */
        final int f22745i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f22746j = new AtomicInteger(1);
        final AtomicReference<Throwable> l = new AtomicReference<>();

        /* renamed from: k, reason: collision with root package name */
        final rx.t.b f22747k = new rx.t.b();

        /* compiled from: OnSubscribeFlatMapCompletable.java */
        /* renamed from: rx.n.a.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0404a extends AtomicReference<rx.k> implements rx.c, rx.k {
            C0404a() {
            }

            @Override // rx.c
            public void a(rx.k kVar) {
                if (compareAndSet(null, kVar)) {
                    return;
                }
                kVar.unsubscribe();
                if (get() != this) {
                    rx.q.c.j(new IllegalStateException("Subscription already set!"));
                }
            }

            @Override // rx.k
            public boolean isUnsubscribed() {
                return get() == this;
            }

            @Override // rx.c
            public void onCompleted() {
                a.this.d(this);
            }

            @Override // rx.c
            public void onError(Throwable th) {
                a.this.e(this, th);
            }

            @Override // rx.k
            public void unsubscribe() {
                rx.k andSet = getAndSet(this);
                if (andSet == null || andSet == this) {
                    return;
                }
                andSet.unsubscribe();
            }
        }

        a(rx.j<? super T> jVar, rx.m.e<? super T, ? extends rx.b> eVar, boolean z, int i2) {
            this.f22742f = jVar;
            this.f22743g = eVar;
            this.f22744h = z;
            this.f22745i = i2;
            request(i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE);
        }

        boolean c() {
            if (this.f22746j.decrementAndGet() != 0) {
                return false;
            }
            Throwable i2 = rx.n.e.e.i(this.l);
            if (i2 != null) {
                this.f22742f.onError(i2);
                return true;
            }
            this.f22742f.onCompleted();
            return true;
        }

        public void d(a<T>.C0404a c0404a) {
            this.f22747k.d(c0404a);
            if (c() || this.f22745i == Integer.MAX_VALUE) {
                return;
            }
            request(1L);
        }

        public void e(a<T>.C0404a c0404a, Throwable th) {
            this.f22747k.d(c0404a);
            if (this.f22744h) {
                rx.n.e.e.d(this.l, th);
                if (c() || this.f22745i == Integer.MAX_VALUE) {
                    return;
                }
                request(1L);
                return;
            }
            this.f22747k.unsubscribe();
            unsubscribe();
            if (this.l.compareAndSet(null, th)) {
                this.f22742f.onError(rx.n.e.e.i(this.l));
            } else {
                rx.q.c.j(th);
            }
        }

        @Override // rx.f
        public void onCompleted() {
            c();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22744h) {
                rx.n.e.e.d(this.l, th);
                onCompleted();
                return;
            }
            this.f22747k.unsubscribe();
            if (this.l.compareAndSet(null, th)) {
                this.f22742f.onError(rx.n.e.e.i(this.l));
            } else {
                rx.q.c.j(th);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            try {
                rx.b call = this.f22743g.call(t);
                if (call != null) {
                    C0404a c0404a = new C0404a();
                    this.f22747k.a(c0404a);
                    this.f22746j.getAndIncrement();
                    call.P(c0404a);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Completable");
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public p(rx.e<T> eVar, rx.m.e<? super T, ? extends rx.b> eVar2, boolean z, int i2) {
        if (eVar2 == null) {
            throw new NullPointerException("mapper is null");
        }
        if (i2 > 0) {
            this.f22738f = eVar;
            this.f22739g = eVar2;
            this.f22740h = z;
            this.f22741i = i2;
            return;
        }
        throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i2);
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        a aVar = new a(jVar, this.f22739g, this.f22740h, this.f22741i);
        jVar.add(aVar);
        jVar.add(aVar.f22747k);
        this.f22738f.c1(aVar);
    }
}
