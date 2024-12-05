package rx.s;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.exceptions.MissingBackpressureException;
import rx.f;
import rx.g;
import rx.j;
import rx.k;

/* compiled from: PublishSubject.java */
/* loaded from: classes3.dex */
public final class b<T> extends d<T, T> {

    /* renamed from: g, reason: collision with root package name */
    final C0428b<T> f23230g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PublishSubject.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicLong implements g, k, f<T> {

        /* renamed from: f, reason: collision with root package name */
        final C0428b<T> f23231f;

        /* renamed from: g, reason: collision with root package name */
        final j<? super T> f23232g;

        /* renamed from: h, reason: collision with root package name */
        long f23233h;

        public a(C0428b<T> c0428b, j<? super T> jVar) {
            this.f23231f = c0428b;
            this.f23232g = jVar;
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.f
        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.f23232g.onCompleted();
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f23232g.onError(th);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            long j2 = get();
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.f23233h;
                if (j2 != j3) {
                    this.f23233h = j3 + 1;
                    this.f23232g.onNext(t);
                } else {
                    unsubscribe();
                    this.f23232g.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
                }
            }
        }

        @Override // rx.g
        public void request(long j2) {
            long j3;
            if (!rx.n.a.a.d(j2)) {
                return;
            }
            do {
                j3 = get();
                if (j3 == Long.MIN_VALUE) {
                    return;
                }
            } while (!compareAndSet(j3, rx.n.a.a.a(j3, j2)));
        }

        @Override // rx.k
        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f23231f.c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PublishSubject.java */
    /* renamed from: rx.s.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0428b<T> extends AtomicReference<a<T>[]> implements e.a<T>, f<T> {

        /* renamed from: f, reason: collision with root package name */
        static final a[] f23234f = new a[0];

        /* renamed from: g, reason: collision with root package name */
        static final a[] f23235g = new a[0];

        /* renamed from: h, reason: collision with root package name */
        Throwable f23236h;

        public C0428b() {
            lazySet(f23234f);
        }

        boolean a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == f23235g) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        @Override // rx.m.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(j<? super T> jVar) {
            a<T> aVar = new a<>(this, jVar);
            jVar.add(aVar);
            jVar.setProducer(aVar);
            if (a(aVar)) {
                if (aVar.isUnsubscribed()) {
                    c(aVar);
                }
            } else {
                Throwable th = this.f23236h;
                if (th != null) {
                    jVar.onError(th);
                } else {
                    jVar.onCompleted();
                }
            }
        }

        void c(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == f23235g || aVarArr == f23234f) {
                    return;
                }
                int length = aVarArr.length;
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (aVarArr[i3] == aVar) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f23234f;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                    System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // rx.f
        public void onCompleted() {
            for (a<T> aVar : getAndSet(f23235g)) {
                aVar.onCompleted();
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f23236h = th;
            ArrayList arrayList = null;
            for (a<T> aVar : getAndSet(f23235g)) {
                try {
                    aVar.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th2);
                }
            }
            rx.exceptions.a.d(arrayList);
        }

        @Override // rx.f
        public void onNext(T t) {
            for (a<T> aVar : get()) {
                aVar.onNext(t);
            }
        }
    }

    protected b(C0428b<T> c0428b) {
        super(c0428b);
        this.f23230g = c0428b;
    }

    public static <T> b<T> g1() {
        return new b<>(new C0428b());
    }

    @Override // rx.f
    public void onCompleted() {
        this.f23230g.onCompleted();
    }

    @Override // rx.f
    public void onError(Throwable th) {
        this.f23230g.onError(th);
    }

    @Override // rx.f
    public void onNext(T t) {
        this.f23230g.onNext(t);
    }
}
