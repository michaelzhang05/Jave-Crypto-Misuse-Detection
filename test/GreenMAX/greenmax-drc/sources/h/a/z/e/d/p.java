package h.a.z.e.d;

import android.R;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableScalarXMap.java */
/* loaded from: classes2.dex */
public final class p {

    /* compiled from: ObservableScalarXMap.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicInteger implements h.a.z.c.b<T>, Runnable {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super T> f18113f;

        /* renamed from: g, reason: collision with root package name */
        final T f18114g;

        public a(h.a.q<? super T> qVar, T t) {
            this.f18113f = qVar;
            this.f18114g = t;
        }

        @Override // h.a.z.c.f
        public void clear() {
            lazySet(3);
        }

        @Override // h.a.x.c
        public void d() {
            set(3);
        }

        @Override // h.a.x.c
        public boolean f() {
            return get() == 3;
        }

        @Override // h.a.z.c.c
        public int i(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // h.a.z.c.f
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // h.a.z.c.f
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // h.a.z.c.f
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f18114g;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f18113f.onNext(this.f18114g);
                if (get() == 2) {
                    lazySet(3);
                    this.f18113f.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableScalarXMap.java */
    /* loaded from: classes2.dex */
    public static final class b<T, R> extends h.a.m<R> {

        /* renamed from: f, reason: collision with root package name */
        final T f18115f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.y.f<? super T, ? extends h.a.p<? extends R>> f18116g;

        b(T t, h.a.y.f<? super T, ? extends h.a.p<? extends R>> fVar) {
            this.f18115f = t;
            this.f18116g = fVar;
        }

        @Override // h.a.m
        public void x(h.a.q<? super R> qVar) {
            try {
                h.a.p pVar = (h.a.p) h.a.z.b.b.c(this.f18116g.a(this.f18115f), "The mapper returned a null ObservableSource");
                if (pVar instanceof Callable) {
                    try {
                        Object call = ((Callable) pVar).call();
                        if (call == null) {
                            h.a.z.a.d.o(qVar);
                            return;
                        }
                        a aVar = new a(qVar, call);
                        qVar.b(aVar);
                        aVar.run();
                        return;
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.a(th);
                        h.a.z.a.d.r(th, qVar);
                        return;
                    }
                }
                pVar.a(qVar);
            } catch (Throwable th2) {
                h.a.z.a.d.r(th2, qVar);
            }
        }
    }

    public static <T, U> h.a.m<U> a(T t, h.a.y.f<? super T, ? extends h.a.p<? extends U>> fVar) {
        return h.a.a0.a.m(new b(t, fVar));
    }

    public static <T, R> boolean b(h.a.p<T> pVar, h.a.q<? super R> qVar, h.a.y.f<? super T, ? extends h.a.p<? extends R>> fVar) {
        if (!(pVar instanceof Callable)) {
            return false;
        }
        try {
            R.attr attrVar = (Object) ((Callable) pVar).call();
            if (attrVar == null) {
                h.a.z.a.d.o(qVar);
                return true;
            }
            try {
                h.a.p pVar2 = (h.a.p) h.a.z.b.b.c(fVar.a(attrVar), "The mapper returned a null ObservableSource");
                if (pVar2 instanceof Callable) {
                    try {
                        Object call = ((Callable) pVar2).call();
                        if (call == null) {
                            h.a.z.a.d.o(qVar);
                            return true;
                        }
                        a aVar = new a(qVar, call);
                        qVar.b(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.a(th);
                        h.a.z.a.d.r(th, qVar);
                        return true;
                    }
                } else {
                    pVar2.a(qVar);
                }
                return true;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.a(th2);
                h.a.z.a.d.r(th2, qVar);
                return true;
            }
        } catch (Throwable th3) {
            io.reactivex.exceptions.a.a(th3);
            h.a.z.a.d.r(th3, qVar);
            return true;
        }
    }
}
