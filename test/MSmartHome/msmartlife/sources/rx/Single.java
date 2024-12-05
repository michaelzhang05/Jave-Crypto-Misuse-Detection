package rx;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.h;
import rx.n.a.h1;
import rx.n.a.i1;
import rx.n.a.j1;
import rx.n.a.m1;
import rx.n.a.n1;
import rx.n.a.o1;
import rx.n.a.p1;
import rx.n.a.q1;
import rx.n.a.r1;
import rx.n.a.s1;
import rx.n.a.t1;
import rx.n.e.m;
import rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class Single<T> {
    final j<T> a;

    /* loaded from: classes2.dex */
    class a extends rx.i<T> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.m.b f22348g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.m.b f22349h;

        a(rx.m.b bVar, rx.m.b bVar2) {
            this.f22348g = bVar;
            this.f22349h = bVar2;
        }

        @Override // rx.i
        public final void c(T t) {
            try {
                this.f22349h.call(t);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.i
        public final void onError(Throwable th) {
            try {
                this.f22348g.call(th);
            } finally {
                unsubscribe();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.h f22351f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ rx.i f22353f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h.a f22354g;

            /* renamed from: rx.Single$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C0387a extends rx.i<T> {
                C0387a() {
                }

                @Override // rx.i
                public void c(T t) {
                    try {
                        a.this.f22353f.c(t);
                    } finally {
                        a.this.f22354g.unsubscribe();
                    }
                }

                @Override // rx.i
                public void onError(Throwable th) {
                    try {
                        a.this.f22353f.onError(th);
                    } finally {
                        a.this.f22354g.unsubscribe();
                    }
                }
            }

            a(rx.i iVar, h.a aVar) {
                this.f22353f = iVar;
                this.f22354g = aVar;
            }

            @Override // rx.m.a
            public void call() {
                C0387a c0387a = new C0387a();
                this.f22353f.b(c0387a);
                Single.this.t(c0387a);
            }
        }

        b(rx.h hVar) {
            this.f22351f = hVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super T> iVar) {
            h.a createWorker = this.f22351f.createWorker();
            iVar.b(createWorker);
            createWorker.c(new a(iVar, createWorker));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements rx.m.d<Single<T>> {
        c() {
        }

        @Override // rx.m.d, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Single<T> call() {
            return Single.h(new TimeoutException());
        }
    }

    /* loaded from: classes2.dex */
    class d implements rx.m.b<Throwable> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.b f22358f;

        d(rx.m.b bVar) {
            this.f22358f = bVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            this.f22358f.call(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class e implements j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Callable f22360f;

        e(Callable callable) {
            this.f22360f = callable;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super T> iVar) {
            try {
                ((Single) this.f22360f.call()).t(iVar);
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                iVar.onError(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class f implements j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Throwable f22361f;

        f(Throwable th) {
            this.f22361f = th;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super T> iVar) {
            iVar.onError(this.f22361f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class g implements j<T> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a extends rx.i<Single<? extends T>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ rx.i f22363g;

            a(rx.i iVar) {
                this.f22363g = iVar;
            }

            @Override // rx.i
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public void c(Single<? extends T> single) {
                single.t(this.f22363g);
            }

            @Override // rx.i
            public void onError(Throwable th) {
                this.f22363g.onError(th);
            }
        }

        g() {
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super T> iVar) {
            a aVar = new a(iVar);
            iVar.b(aVar);
            Single.this.t(aVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes2.dex */
    static class h<R> implements rx.m.h<R> {
        final /* synthetic */ rx.m.f a;

        h(rx.m.f fVar) {
            this.a = fVar;
        }

        @Override // rx.m.h
        public R call(Object... objArr) {
            return (R) this.a.a(objArr[0], objArr[1]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes2.dex */
    static class i<R> implements rx.m.h<R> {
        final /* synthetic */ rx.m.g a;

        i(rx.m.g gVar) {
            this.a = gVar;
        }

        @Override // rx.m.h
        public R call(Object... objArr) {
            return (R) this.a.a(objArr[0], objArr[1], objArr[2]);
        }
    }

    /* loaded from: classes2.dex */
    public interface j<T> extends rx.m.b<rx.i<? super T>> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Single(j<T> jVar) {
        this.a = rx.q.c.i(jVar);
    }

    public static <T1, T2, T3, R> Single<R> B(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, rx.m.g<? super T1, ? super T2, ? super T3, ? extends R> gVar) {
        return r1.a(new Single[]{single, single2, single3}, new i(gVar));
    }

    public static <T1, T2, R> Single<R> C(Single<? extends T1> single, Single<? extends T2> single2, rx.m.f<? super T1, ? super T2, ? extends R> fVar) {
        return r1.a(new Single[]{single, single2}, new h(fVar));
    }

    private static <T> rx.e<T> a(Single<T> single) {
        return rx.e.b1(new t1(single.a));
    }

    public static <T> Single<T> b(j<T> jVar) {
        return new Single<>(jVar);
    }

    public static <T> Single<T> c(Callable<Single<T>> callable) {
        return b(new e(callable));
    }

    public static <T> Single<T> h(Throwable th) {
        return b(new f(th));
    }

    public static <T> Single<T> l(Callable<? extends T> callable) {
        return b(new j1(callable));
    }

    public static <T> Single<T> m(T t) {
        return rx.n.e.k.D(t);
    }

    public static <T> Single<T> o(Single<? extends Single<? extends T>> single) {
        if (single instanceof rx.n.e.k) {
            return ((rx.n.e.k) single).E(m.b());
        }
        return b(new g());
    }

    public final rx.e<T> A() {
        return a(this);
    }

    public final Single<T> d(rx.e<?> eVar) {
        eVar.getClass();
        return b(new o1(this, eVar));
    }

    public final Single<T> e(rx.m.b<Throwable> bVar) {
        if (bVar != null) {
            return b(new h1(this, rx.m.c.a(), new d(bVar)));
        }
        throw new IllegalArgumentException("onError is null");
    }

    public final Single<T> f(rx.m.a aVar) {
        return b(new i1(this.a, aVar));
    }

    public final Single<T> g(rx.m.b<? super T> bVar) {
        if (bVar != null) {
            return b(new h1(this, bVar, rx.m.c.a()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Single<R> i(rx.m.e<? super T, ? extends Single<? extends R>> eVar) {
        if (this instanceof rx.n.e.k) {
            return ((rx.n.e.k) this).E(eVar);
        }
        return o(n(eVar));
    }

    public final rx.b j(rx.m.e<? super T, ? extends rx.b> eVar) {
        return rx.b.h(new rx.n.a.c(this, eVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> rx.e<R> k(rx.m.e<? super T, ? extends rx.e<? extends R>> eVar) {
        return rx.e.Z(a(n(eVar)));
    }

    public final <R> Single<R> n(rx.m.e<? super T, ? extends R> eVar) {
        return b(new p1(this, eVar));
    }

    public final Single<T> p(rx.h hVar) {
        if (this instanceof rx.n.e.k) {
            return ((rx.n.e.k) this).F(hVar);
        }
        if (hVar != null) {
            return b(new m1(this.a, hVar));
        }
        throw new NullPointerException("scheduler is null");
    }

    public final Single<T> q(rx.m.e<Throwable, ? extends Single<? extends T>> eVar) {
        return new Single<>(q1.b(this, eVar));
    }

    public final Single<T> r(rx.m.e<Throwable, ? extends T> eVar) {
        return b(new n1(this.a, eVar));
    }

    public final Single<T> s(rx.m.e<rx.e<? extends Throwable>, ? extends rx.e<?>> eVar) {
        return A().t0(eVar).Z0();
    }

    public final k t(rx.i<? super T> iVar) {
        if (iVar != null) {
            try {
                rx.q.c.t(this, this.a).call(iVar);
                return rx.q.c.s(iVar);
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                try {
                    iVar.onError(rx.q.c.r(th));
                    return rx.t.e.b();
                } catch (Throwable th2) {
                    rx.exceptions.a.e(th2);
                    RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    rx.q.c.r(runtimeException);
                    throw runtimeException;
                }
            }
        }
        throw new IllegalArgumentException("te is null");
    }

    public final k u(rx.m.b<? super T> bVar, rx.m.b<Throwable> bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if (bVar2 != null) {
            return t(new a(bVar2, bVar));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public final Single<T> v(rx.h hVar) {
        if (this instanceof rx.n.e.k) {
            return ((rx.n.e.k) this).F(hVar);
        }
        return b(new b(hVar));
    }

    public final Single<T> w(long j2, TimeUnit timeUnit) {
        return x(j2, timeUnit, null, Schedulers.computation());
    }

    public final Single<T> x(long j2, TimeUnit timeUnit, Single<? extends T> single, rx.h hVar) {
        if (single == null) {
            single = c(new c());
        }
        return b(new s1(this.a, j2, timeUnit, hVar, single.a));
    }

    public final rx.r.a<T> y() {
        return rx.r.a.a(this);
    }

    public final rx.b z() {
        return rx.b.w(this);
    }
}
