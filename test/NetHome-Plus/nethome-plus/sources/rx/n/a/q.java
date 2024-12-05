package rx.n.a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Single;
import rx.e;

/* compiled from: OnSubscribeFlatMapSingle.java */
/* loaded from: classes3.dex */
public final class q<T, R> implements e.a<R> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<T> f22769f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<? super T, ? extends Single<? extends R>> f22770g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f22771h;

    /* renamed from: i, reason: collision with root package name */
    final int f22772i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeFlatMapSingle.java */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super R> f22773f;

        /* renamed from: g, reason: collision with root package name */
        final rx.m.e<? super T, ? extends Single<? extends R>> f22774g;

        /* renamed from: h, reason: collision with root package name */
        final boolean f22775h;

        /* renamed from: i, reason: collision with root package name */
        final int f22776i;
        final Queue<Object> n;
        volatile boolean p;
        volatile boolean q;

        /* renamed from: j, reason: collision with root package name */
        final AtomicInteger f22777j = new AtomicInteger();
        final AtomicReference<Throwable> m = new AtomicReference<>();
        final a<T, R>.b o = new b();
        final rx.t.b l = new rx.t.b();

        /* renamed from: k, reason: collision with root package name */
        final AtomicInteger f22778k = new AtomicInteger();

        /* compiled from: OnSubscribeFlatMapSingle.java */
        /* renamed from: rx.n.a.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0405a extends rx.i<R> {
            C0405a() {
            }

            @Override // rx.i
            public void c(R r) {
                a.this.e(this, r);
            }

            @Override // rx.i
            public void onError(Throwable th) {
                a.this.d(this, th);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnSubscribeFlatMapSingle.java */
        /* loaded from: classes3.dex */
        public final class b extends AtomicLong implements rx.g, rx.k {
            b() {
            }

            void a(long j2) {
                rx.n.a.a.c(this, j2);
            }

            @Override // rx.k
            public boolean isUnsubscribed() {
                return a.this.q;
            }

            @Override // rx.g
            public void request(long j2) {
                if (j2 > 0) {
                    rx.n.a.a.b(this, j2);
                    a.this.c();
                }
            }

            @Override // rx.k
            public void unsubscribe() {
                a.this.q = true;
                a.this.unsubscribe();
                if (a.this.f22777j.getAndIncrement() == 0) {
                    a.this.n.clear();
                }
            }
        }

        a(rx.j<? super R> jVar, rx.m.e<? super T, ? extends Single<? extends R>> eVar, boolean z, int i2) {
            this.f22773f = jVar;
            this.f22774g = eVar;
            this.f22775h = z;
            this.f22776i = i2;
            if (rx.n.e.o.z.b()) {
                this.n = new rx.n.e.o.i();
            } else {
                this.n = new rx.n.e.n.d();
            }
            request(i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE);
        }

        void c() {
            if (this.f22777j.getAndIncrement() != 0) {
                return;
            }
            rx.j<? super R> jVar = this.f22773f;
            Queue<Object> queue = this.n;
            boolean z = this.f22775h;
            AtomicInteger atomicInteger = this.f22778k;
            int i2 = 1;
            do {
                long j2 = this.o.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (this.q) {
                        queue.clear();
                        return;
                    }
                    boolean z2 = this.p;
                    if (!z && z2 && this.m.get() != null) {
                        queue.clear();
                        jVar.onError(rx.n.e.e.i(this.m));
                        return;
                    }
                    Object poll = queue.poll();
                    boolean z3 = poll == null;
                    if (z2 && atomicInteger.get() == 0 && z3) {
                        if (this.m.get() != null) {
                            jVar.onError(rx.n.e.e.i(this.m));
                            return;
                        } else {
                            jVar.onCompleted();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    jVar.onNext((Object) h.e(poll));
                    j3++;
                }
                if (j3 == j2) {
                    if (this.q) {
                        queue.clear();
                        return;
                    }
                    if (this.p) {
                        if (z) {
                            if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                if (this.m.get() != null) {
                                    jVar.onError(rx.n.e.e.i(this.m));
                                    return;
                                } else {
                                    jVar.onCompleted();
                                    return;
                                }
                            }
                        } else if (this.m.get() != null) {
                            queue.clear();
                            jVar.onError(rx.n.e.e.i(this.m));
                            return;
                        } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                            jVar.onCompleted();
                            return;
                        }
                    }
                }
                if (j3 != 0) {
                    this.o.a(j3);
                    if (!this.p && this.f22776i != Integer.MAX_VALUE) {
                        request(j3);
                    }
                }
                i2 = this.f22777j.addAndGet(-i2);
            } while (i2 != 0);
        }

        void d(a<T, R>.C0405a c0405a, Throwable th) {
            if (this.f22775h) {
                rx.n.e.e.d(this.m, th);
                this.l.d(c0405a);
                if (!this.p && this.f22776i != Integer.MAX_VALUE) {
                    request(1L);
                }
            } else {
                this.l.unsubscribe();
                unsubscribe();
                if (!this.m.compareAndSet(null, th)) {
                    rx.q.c.j(th);
                    return;
                }
                this.p = true;
            }
            this.f22778k.decrementAndGet();
            c();
        }

        void e(a<T, R>.C0405a c0405a, R r) {
            this.n.offer(h.g(r));
            this.l.d(c0405a);
            this.f22778k.decrementAndGet();
            c();
        }

        @Override // rx.f
        public void onCompleted() {
            this.p = true;
            c();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22775h) {
                rx.n.e.e.d(this.m, th);
            } else {
                this.l.unsubscribe();
                if (!this.m.compareAndSet(null, th)) {
                    rx.q.c.j(th);
                    return;
                }
            }
            this.p = true;
            c();
        }

        @Override // rx.f
        public void onNext(T t) {
            try {
                Single<? extends R> call = this.f22774g.call(t);
                if (call != null) {
                    C0405a c0405a = new C0405a();
                    this.l.a(c0405a);
                    this.f22778k.incrementAndGet();
                    call.t(c0405a);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Single");
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public q(rx.e<T> eVar, rx.m.e<? super T, ? extends Single<? extends R>> eVar2, boolean z, int i2) {
        if (eVar2 == null) {
            throw new NullPointerException("mapper is null");
        }
        if (i2 > 0) {
            this.f22769f = eVar;
            this.f22770g = eVar2;
            this.f22771h = z;
            this.f22772i = i2;
            return;
        }
        throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i2);
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super R> jVar) {
        a aVar = new a(jVar, this.f22770g, this.f22771h, this.f22772i);
        jVar.add(aVar.l);
        jVar.add(aVar.o);
        jVar.setProducer(aVar.o);
        this.f22769f.c1(aVar);
    }
}
