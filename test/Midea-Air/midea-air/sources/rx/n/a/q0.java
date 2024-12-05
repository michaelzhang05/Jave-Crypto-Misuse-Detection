package rx.n.a;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.e;
import rx.exceptions.CompositeException;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;

/* compiled from: OperatorMerge.java */
/* loaded from: classes3.dex */
public final class q0<T> implements e.b<T, rx.e<? extends T>> {

    /* renamed from: f, reason: collision with root package name */
    final boolean f22781f;

    /* renamed from: g, reason: collision with root package name */
    final int f22782g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorMerge.java */
    /* loaded from: classes3.dex */
    public static final class a {
        static final q0<Object> a = new q0<>(true, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorMerge.java */
    /* loaded from: classes3.dex */
    public static final class b {
        static final q0<Object> a = new q0<>(false, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorMerge.java */
    /* loaded from: classes3.dex */
    public static final class c<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        static final int f22783f = rx.n.e.h.f23108f / 4;

        /* renamed from: g, reason: collision with root package name */
        final e<T> f22784g;

        /* renamed from: h, reason: collision with root package name */
        final long f22785h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f22786i;

        /* renamed from: j, reason: collision with root package name */
        volatile rx.n.e.h f22787j;

        /* renamed from: k, reason: collision with root package name */
        int f22788k;

        public c(e<T> eVar, long j2) {
            this.f22784g = eVar;
            this.f22785h = j2;
        }

        public void c(long j2) {
            int i2 = this.f22788k - ((int) j2);
            if (i2 > f22783f) {
                this.f22788k = i2;
                return;
            }
            int i3 = rx.n.e.h.f23108f;
            this.f22788k = i3;
            int i4 = i3 - i2;
            if (i4 > 0) {
                request(i4);
            }
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22786i = true;
            this.f22784g.e();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22784g.k().offer(th);
            this.f22786i = true;
            this.f22784g.e();
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22784g.s(this, t);
        }

        @Override // rx.j
        public void onStart() {
            int i2 = rx.n.e.h.f23108f;
            this.f22788k = i2;
            request(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorMerge.java */
    /* loaded from: classes3.dex */
    public static final class d<T> extends AtomicLong implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final e<T> f22789f;

        public d(e<T> eVar) {
            this.f22789f = eVar;
        }

        public long a(int i2) {
            return addAndGet(-i2);
        }

        @Override // rx.g
        public void request(long j2) {
            if (j2 <= 0) {
                if (j2 < 0) {
                    throw new IllegalArgumentException("n >= 0 required");
                }
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                rx.n.a.a.b(this, j2);
                this.f22789f.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorMerge.java */
    /* loaded from: classes3.dex */
    public static final class e<T> extends rx.j<rx.e<? extends T>> {

        /* renamed from: f, reason: collision with root package name */
        static final c<?>[] f22790f = new c[0];

        /* renamed from: g, reason: collision with root package name */
        final rx.j<? super T> f22791g;

        /* renamed from: h, reason: collision with root package name */
        final boolean f22792h;

        /* renamed from: i, reason: collision with root package name */
        final int f22793i;

        /* renamed from: j, reason: collision with root package name */
        d<T> f22794j;

        /* renamed from: k, reason: collision with root package name */
        volatile Queue<Object> f22795k;
        volatile rx.t.b l;
        volatile ConcurrentLinkedQueue<Throwable> m;
        volatile boolean n;
        boolean o;
        boolean p;
        final Object q = new Object();
        volatile c<?>[] r = f22790f;
        long s;
        long t;
        int u;
        final int v;
        int w;

        public e(rx.j<? super T> jVar, boolean z, int i2) {
            this.f22791g = jVar;
            this.f22792h = z;
            this.f22793i = i2;
            if (i2 == Integer.MAX_VALUE) {
                this.v = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
            } else {
                this.v = Math.max(1, i2 >> 1);
                request(i2);
            }
        }

        private void p() {
            ArrayList arrayList = new ArrayList(this.m);
            if (arrayList.size() == 1) {
                this.f22791g.onError((Throwable) arrayList.get(0));
            } else {
                this.f22791g.onError(new CompositeException(arrayList));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void c(c<T> cVar) {
            j().a(cVar);
            synchronized (this.q) {
                c<?>[] cVarArr = this.r;
                int length = cVarArr.length;
                c<?>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.r = cVarArr2;
            }
        }

        boolean d() {
            if (this.f22791g.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.m;
            if (this.f22792h || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                p();
                return true;
            } finally {
                unsubscribe();
            }
        }

        void e() {
            synchronized (this) {
                if (this.o) {
                    this.p = true;
                } else {
                    this.o = true;
                    g();
                }
            }
        }

        void f() {
            int i2 = this.w + 1;
            if (i2 == this.v) {
                this.w = 0;
                q(i2);
            } else {
                this.w = i2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x019d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void g() {
            /*
                Method dump skipped, instructions count: 424
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.n.a.q0.e.g():void");
        }

        protected void h(T t, long j2) {
            boolean z = true;
            try {
                try {
                    try {
                        this.f22791g.onNext(t);
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.o = false;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (!this.f22792h) {
                        rx.exceptions.a.e(th2);
                        unsubscribe();
                        onError(th2);
                        return;
                    }
                    k().offer(th2);
                }
                if (j2 != Long.MAX_VALUE) {
                    this.f22794j.a(1);
                }
                int i2 = this.w + 1;
                if (i2 == this.v) {
                    this.w = 0;
                    q(i2);
                } else {
                    this.w = i2;
                }
                synchronized (this) {
                    if (!this.p) {
                        this.o = false;
                    } else {
                        this.p = false;
                        g();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void i(rx.n.a.q0.c<T> r5, T r6, long r7) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                rx.j<? super T> r2 = r4.f22791g     // Catch: java.lang.Throwable -> L8
                r2.onNext(r6)     // Catch: java.lang.Throwable -> L8
                goto L20
            L8:
                r6 = move-exception
                boolean r2 = r4.f22792h     // Catch: java.lang.Throwable -> L46
                if (r2 != 0) goto L19
                rx.exceptions.a.e(r6)     // Catch: java.lang.Throwable -> L46
                r5.unsubscribe()     // Catch: java.lang.Throwable -> L17
                r5.onError(r6)     // Catch: java.lang.Throwable -> L17
                return
            L17:
                r5 = move-exception
                goto L48
            L19:
                java.util.Queue r2 = r4.k()     // Catch: java.lang.Throwable -> L46
                r2.offer(r6)     // Catch: java.lang.Throwable -> L46
            L20:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r6 == 0) goto L2e
                rx.n.a.q0$d<T> r6 = r4.f22794j     // Catch: java.lang.Throwable -> L46
                r6.a(r0)     // Catch: java.lang.Throwable -> L46
            L2e:
                r6 = 1
                r5.c(r6)     // Catch: java.lang.Throwable -> L46
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L46
                boolean r5 = r4.p     // Catch: java.lang.Throwable -> L43
                if (r5 != 0) goto L3c
                r4.o = r1     // Catch: java.lang.Throwable -> L43
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
                return
            L3c:
                r4.p = r1     // Catch: java.lang.Throwable -> L43
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
                r4.g()
                return
            L43:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
                throw r5     // Catch: java.lang.Throwable -> L17
            L46:
                r5 = move-exception
                r0 = 0
            L48:
                if (r0 != 0) goto L52
                monitor-enter(r4)
                r4.o = r1     // Catch: java.lang.Throwable -> L4f
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
                goto L52
            L4f:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
                throw r5
            L52:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.n.a.q0.e.i(rx.n.a.q0$c, java.lang.Object, long):void");
        }

        rx.t.b j() {
            rx.t.b bVar;
            rx.t.b bVar2 = this.l;
            if (bVar2 != null) {
                return bVar2;
            }
            boolean z = false;
            synchronized (this) {
                bVar = this.l;
                if (bVar == null) {
                    rx.t.b bVar3 = new rx.t.b();
                    this.l = bVar3;
                    bVar = bVar3;
                    z = true;
                }
            }
            if (z) {
                add(bVar);
            }
            return bVar;
        }

        Queue<Throwable> k() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.m;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.m;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.m = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.f
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.e<? extends T> eVar) {
            if (eVar == null) {
                return;
            }
            if (eVar == rx.e.B()) {
                f();
                return;
            }
            if (eVar instanceof rx.n.e.j) {
                r(((rx.n.e.j) eVar).h1());
                return;
            }
            long j2 = this.s;
            this.s = 1 + j2;
            c cVar = new c(this, j2);
            c(cVar);
            eVar.c1(cVar);
            e();
        }

        protected void m(T t) {
            Queue<Object> fVar;
            Queue<Object> queue = this.f22795k;
            if (queue == null) {
                int i2 = this.f22793i;
                if (i2 == Integer.MAX_VALUE) {
                    queue = new rx.n.e.n.h<>(rx.n.e.h.f23108f);
                } else {
                    if (rx.n.e.o.j.a(i2)) {
                        if (rx.n.e.o.z.b()) {
                            fVar = new rx.n.e.o.s<>(i2);
                        } else {
                            fVar = new rx.n.e.n.e<>(i2);
                        }
                    } else {
                        fVar = new rx.n.e.n.f<>(i2);
                    }
                    queue = fVar;
                }
                this.f22795k = queue;
            }
            if (queue.offer(h.g(t))) {
                return;
            }
            unsubscribe();
            onError(OnErrorThrowable.a(new MissingBackpressureException(), t));
        }

        protected void n(c<T> cVar, T t) {
            rx.n.e.h hVar = cVar.f22787j;
            if (hVar == null) {
                hVar = rx.n.e.h.b();
                cVar.add(hVar);
                cVar.f22787j = hVar;
            }
            try {
                hVar.g(h.g(t));
            } catch (IllegalStateException e2) {
                if (cVar.isUnsubscribed()) {
                    return;
                }
                cVar.unsubscribe();
                cVar.onError(e2);
            } catch (MissingBackpressureException e3) {
                cVar.unsubscribe();
                cVar.onError(e3);
            }
        }

        void o(c<T> cVar) {
            rx.n.e.h hVar = cVar.f22787j;
            if (hVar != null) {
                hVar.j();
            }
            this.l.d(cVar);
            synchronized (this.q) {
                c<?>[] cVarArr = this.r;
                int length = cVarArr.length;
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (cVar.equals(cVarArr[i3])) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    this.r = f22790f;
                    return;
                }
                c<?>[] cVarArr2 = new c[length - 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, i2);
                System.arraycopy(cVarArr, i2 + 1, cVarArr2, i2, (length - i2) - 1);
                this.r = cVarArr2;
            }
        }

        @Override // rx.f
        public void onCompleted() {
            this.n = true;
            e();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            k().offer(th);
            this.n = true;
            e();
        }

        public void q(long j2) {
            request(j2);
        }

        void r(T t) {
            long j2 = this.f22794j.get();
            boolean z = false;
            if (j2 != 0) {
                synchronized (this) {
                    j2 = this.f22794j.get();
                    if (!this.o && j2 != 0) {
                        this.o = true;
                        z = true;
                    }
                }
            }
            if (z) {
                Queue<Object> queue = this.f22795k;
                if (queue != null && !queue.isEmpty()) {
                    m(t);
                    g();
                    return;
                } else {
                    h(t, j2);
                    return;
                }
            }
            m(t);
            e();
        }

        void s(c<T> cVar, T t) {
            long j2 = this.f22794j.get();
            boolean z = false;
            if (j2 != 0) {
                synchronized (this) {
                    j2 = this.f22794j.get();
                    if (!this.o && j2 != 0) {
                        this.o = true;
                        z = true;
                    }
                }
            }
            if (z) {
                rx.n.e.h hVar = cVar.f22787j;
                if (hVar != null && !hVar.e()) {
                    n(cVar, t);
                    g();
                    return;
                } else {
                    i(cVar, t, j2);
                    return;
                }
            }
            n(cVar, t);
            e();
        }
    }

    q0(boolean z, int i2) {
        this.f22781f = z;
        this.f22782g = i2;
    }

    public static <T> q0<T> b(boolean z) {
        if (z) {
            return (q0<T>) a.a;
        }
        return (q0<T>) b.a;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<rx.e<? extends T>> call(rx.j<? super T> jVar) {
        e eVar = new e(jVar, this.f22781f, this.f22782g);
        d<T> dVar = new d<>(eVar);
        eVar.f22794j = dVar;
        jVar.add(eVar);
        jVar.setProducer(dVar);
        return eVar;
    }
}
