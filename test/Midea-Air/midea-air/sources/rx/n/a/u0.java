package rx.n.a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.exceptions.MissingBackpressureException;

/* compiled from: OperatorPublish.java */
/* loaded from: classes3.dex */
public final class u0<T> extends rx.o.b<T> {

    /* renamed from: g, reason: collision with root package name */
    final rx.e<? extends T> f22867g;

    /* renamed from: h, reason: collision with root package name */
    final AtomicReference<c<T>> f22868h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorPublish.java */
    /* loaded from: classes3.dex */
    public static class a implements e.a<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AtomicReference f22869f;

        a(AtomicReference atomicReference) {
            this.f22869f = atomicReference;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.j<? super T> jVar) {
            while (true) {
                c cVar = (c) this.f22869f.get();
                if (cVar == null || cVar.isUnsubscribed()) {
                    c cVar2 = new c(this.f22869f);
                    cVar2.f();
                    if (this.f22869f.compareAndSet(cVar, cVar2)) {
                        cVar = cVar2;
                    } else {
                        continue;
                    }
                }
                b<T> bVar = new b<>(cVar, jVar);
                if (cVar.c(bVar)) {
                    jVar.add(bVar);
                    jVar.setProducer(bVar);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorPublish.java */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AtomicLong implements rx.g, rx.k {

        /* renamed from: f, reason: collision with root package name */
        final c<T> f22870f;

        /* renamed from: g, reason: collision with root package name */
        final rx.j<? super T> f22871g;

        public b(c<T> cVar, rx.j<? super T> jVar) {
            this.f22870f = cVar;
            this.f22871g = jVar;
            lazySet(-4611686018427387904L);
        }

        public long a(long j2) {
            long j3;
            long j4;
            if (j2 <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j3 = get();
                if (j3 == -4611686018427387904L) {
                    throw new IllegalStateException("Produced without request");
                }
                if (j3 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j4 = j3 - j2;
                if (j4 < 0) {
                    throw new IllegalStateException("More produced (" + j2 + ") than requested (" + j3 + ")");
                }
            } while (!compareAndSet(j3, j4));
            return j4;
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.g
        public void request(long j2) {
            long j3;
            long j4;
            if (j2 < 0) {
                return;
            }
            do {
                j3 = get();
                if (j3 == Long.MIN_VALUE) {
                    return;
                }
                if (j3 >= 0 && j2 == 0) {
                    return;
                }
                if (j3 == -4611686018427387904L) {
                    j4 = j2;
                } else {
                    j4 = j3 + j2;
                    if (j4 < 0) {
                        j4 = Long.MAX_VALUE;
                    }
                }
            } while (!compareAndSet(j3, j4));
            this.f22870f.e();
        }

        @Override // rx.k
        public void unsubscribe() {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f22870f.g(this);
            this.f22870f.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorPublish.java */
    /* loaded from: classes3.dex */
    public static final class c<T> extends rx.j<T> implements rx.k {

        /* renamed from: f, reason: collision with root package name */
        static final b[] f22872f = new b[0];

        /* renamed from: g, reason: collision with root package name */
        static final b[] f22873g = new b[0];

        /* renamed from: h, reason: collision with root package name */
        final Queue<Object> f22874h;

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference<c<T>> f22875i;

        /* renamed from: j, reason: collision with root package name */
        volatile Object f22876j;

        /* renamed from: k, reason: collision with root package name */
        final AtomicReference<b[]> f22877k;
        final AtomicBoolean l;
        boolean m;
        boolean n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OperatorPublish.java */
        /* loaded from: classes3.dex */
        public class a implements rx.m.a {
            a() {
            }

            @Override // rx.m.a
            public void call() {
                c.this.f22877k.getAndSet(c.f22873g);
                c<T> cVar = c.this;
                cVar.f22875i.compareAndSet(cVar, null);
            }
        }

        public c(AtomicReference<c<T>> atomicReference) {
            this.f22874h = rx.n.e.o.z.b() ? new rx.n.e.o.s<>(rx.n.e.h.f23108f) : new rx.n.e.n.e<>(rx.n.e.h.f23108f);
            this.f22877k = new AtomicReference<>(f22872f);
            this.f22875i = atomicReference;
            this.l = new AtomicBoolean();
        }

        boolean c(b<T> bVar) {
            b[] bVarArr;
            b[] bVarArr2;
            bVar.getClass();
            do {
                bVarArr = this.f22877k.get();
                if (bVarArr == f22873g) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!this.f22877k.compareAndSet(bVarArr, bVarArr2));
            return true;
        }

        boolean d(Object obj, boolean z) {
            int i2 = 0;
            if (obj != null) {
                if (!h.f(obj)) {
                    Throwable d2 = h.d(obj);
                    this.f22875i.compareAndSet(this, null);
                    try {
                        b[] andSet = this.f22877k.getAndSet(f22873g);
                        int length = andSet.length;
                        while (i2 < length) {
                            andSet[i2].f22871g.onError(d2);
                            i2++;
                        }
                        return true;
                    } finally {
                    }
                }
                if (z) {
                    this.f22875i.compareAndSet(this, null);
                    try {
                        b[] andSet2 = this.f22877k.getAndSet(f22873g);
                        int length2 = andSet2.length;
                        while (i2 < length2) {
                            andSet2[i2].f22871g.onCompleted();
                            i2++;
                        }
                        return true;
                    } finally {
                    }
                }
            }
            return false;
        }

        void e() {
            boolean z;
            long j2;
            synchronized (this) {
                if (this.m) {
                    this.n = true;
                    return;
                }
                this.m = true;
                this.n = false;
                while (true) {
                    try {
                        Object obj = this.f22876j;
                        boolean isEmpty = this.f22874h.isEmpty();
                        if (d(obj, isEmpty)) {
                            return;
                        }
                        if (!isEmpty) {
                            b[] bVarArr = this.f22877k.get();
                            int length = bVarArr.length;
                            long j3 = Long.MAX_VALUE;
                            int i2 = 0;
                            for (b bVar : bVarArr) {
                                long j4 = bVar.get();
                                if (j4 >= 0) {
                                    j3 = Math.min(j3, j4);
                                } else if (j4 == Long.MIN_VALUE) {
                                    i2++;
                                }
                            }
                            if (length != i2) {
                                int i3 = 0;
                                while (true) {
                                    j2 = i3;
                                    if (j2 >= j3) {
                                        break;
                                    }
                                    Object obj2 = this.f22876j;
                                    Object poll = this.f22874h.poll();
                                    boolean z2 = poll == null;
                                    if (d(obj2, z2)) {
                                        return;
                                    }
                                    if (z2) {
                                        isEmpty = z2;
                                        break;
                                    }
                                    Object e2 = h.e(poll);
                                    for (b bVar2 : bVarArr) {
                                        if (bVar2.get() > 0) {
                                            try {
                                                bVar2.f22871g.onNext(e2);
                                                bVar2.a(1L);
                                            } catch (Throwable th) {
                                                bVar2.unsubscribe();
                                                rx.exceptions.a.g(th, bVar2.f22871g, e2);
                                            }
                                        }
                                    }
                                    i3++;
                                    isEmpty = z2;
                                }
                                if (i3 > 0) {
                                    request(j2);
                                }
                                if (j3 != 0 && !isEmpty) {
                                }
                            } else if (d(this.f22876j, this.f22874h.poll() == null)) {
                                return;
                            } else {
                                request(1L);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (!this.n) {
                                    this.m = false;
                                    try {
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = true;
                                        while (true) {
                                            try {
                                                break;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                this.n = false;
                            } catch (Throwable th4) {
                                th = th4;
                                z = false;
                            }
                        }
                        try {
                            break;
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            if (!z) {
                                synchronized (this) {
                                    this.m = false;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z = false;
                    }
                }
            }
        }

        void f() {
            add(rx.t.e.a(new a()));
        }

        void g(b<T> bVar) {
            b[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f22877k.get();
                if (bVarArr == f22872f || bVarArr == f22873g) {
                    return;
                }
                int i2 = -1;
                int length = bVarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (bVarArr[i3].equals(bVar)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = f22872f;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i2);
                    System.arraycopy(bVarArr, i2 + 1, bVarArr3, i2, (length - i2) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!this.f22877k.compareAndSet(bVarArr, bVarArr2));
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22876j == null) {
                this.f22876j = h.b();
                e();
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22876j == null) {
                this.f22876j = h.c(th);
                e();
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            if (!this.f22874h.offer(h.g(t))) {
                onError(new MissingBackpressureException());
            } else {
                e();
            }
        }

        @Override // rx.j
        public void onStart() {
            request(rx.n.e.h.f23108f);
        }
    }

    private u0(e.a<T> aVar, rx.e<? extends T> eVar, AtomicReference<c<T>> atomicReference) {
        super(aVar);
        this.f22867g = eVar;
        this.f22868h = atomicReference;
    }

    public static <T> rx.o.b<T> k1(rx.e<? extends T> eVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new u0(new a(atomicReference), eVar, atomicReference);
    }

    @Override // rx.o.b
    public void i1(rx.m.b<? super rx.k> bVar) {
        c<T> cVar;
        while (true) {
            cVar = this.f22868h.get();
            if (cVar != null && !cVar.isUnsubscribed()) {
                break;
            }
            c<T> cVar2 = new c<>(this.f22868h);
            cVar2.f();
            if (this.f22868h.compareAndSet(cVar, cVar2)) {
                cVar = cVar2;
                break;
            }
        }
        boolean z = !cVar.l.get() && cVar.l.compareAndSet(false, true);
        bVar.call(cVar);
        if (z) {
            this.f22867g.c1(cVar);
        }
    }
}
