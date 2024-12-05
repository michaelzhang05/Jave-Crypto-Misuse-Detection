package rx.n.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.exceptions.CompositeException;

/* compiled from: OnSubscribeCombineLatest.java */
/* loaded from: classes3.dex */
public final class j<T, R> implements e.a<R> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<? extends T>[] f22627f;

    /* renamed from: g, reason: collision with root package name */
    final Iterable<? extends rx.e<? extends T>> f22628g;

    /* renamed from: h, reason: collision with root package name */
    final rx.m.h<? extends R> f22629h;

    /* renamed from: i, reason: collision with root package name */
    final int f22630i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f22631j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeCombineLatest.java */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final b<T, R> f22632f;

        /* renamed from: g, reason: collision with root package name */
        final int f22633g;

        /* renamed from: h, reason: collision with root package name */
        boolean f22634h;

        public a(b<T, R> bVar, int i2) {
            this.f22632f = bVar;
            this.f22633g = i2;
            request(bVar.f22639j);
        }

        public void c(long j2) {
            request(j2);
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22634h) {
                return;
            }
            this.f22634h = true;
            this.f22632f.c(null, this.f22633g);
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22634h) {
                rx.q.c.j(th);
                return;
            }
            this.f22632f.e(th);
            this.f22634h = true;
            this.f22632f.c(null, this.f22633g);
        }

        @Override // rx.f
        public void onNext(T t) {
            if (this.f22634h) {
                return;
            }
            this.f22632f.c(h.g(t), this.f22633g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeCombineLatest.java */
    /* loaded from: classes3.dex */
    public static final class b<T, R> extends AtomicInteger implements rx.g, rx.k {

        /* renamed from: f, reason: collision with root package name */
        static final Object f22635f = new Object();

        /* renamed from: g, reason: collision with root package name */
        final rx.j<? super R> f22636g;

        /* renamed from: h, reason: collision with root package name */
        final rx.m.h<? extends R> f22637h;

        /* renamed from: i, reason: collision with root package name */
        final a<T, R>[] f22638i;

        /* renamed from: j, reason: collision with root package name */
        final int f22639j;

        /* renamed from: k, reason: collision with root package name */
        final Object[] f22640k;
        final rx.n.e.n.g<Object> l;
        final boolean m;
        volatile boolean n;
        volatile boolean o;
        final AtomicLong p;
        final AtomicReference<Throwable> q;
        int r;
        int s;

        public b(rx.j<? super R> jVar, rx.m.h<? extends R> hVar, int i2, int i3, boolean z) {
            this.f22636g = jVar;
            this.f22637h = hVar;
            this.f22639j = i3;
            this.m = z;
            Object[] objArr = new Object[i2];
            this.f22640k = objArr;
            Arrays.fill(objArr, f22635f);
            this.f22638i = new a[i2];
            this.l = new rx.n.e.n.g<>(i3);
            this.p = new AtomicLong();
            this.q = new AtomicReference<>();
        }

        void a(Queue<?> queue) {
            queue.clear();
            for (a<T, R> aVar : this.f22638i) {
                aVar.unsubscribe();
            }
        }

        boolean b(boolean z, boolean z2, rx.j<?> jVar, Queue<?> queue, boolean z3) {
            if (this.n) {
                a(queue);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.q.get();
                if (th != null) {
                    jVar.onError(th);
                } else {
                    jVar.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.q.get();
            if (th2 != null) {
                a(queue);
                jVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            jVar.onCompleted();
            return true;
        }

        void c(Object obj, int i2) {
            boolean z;
            a<T, R> aVar = this.f22638i[i2];
            synchronized (this) {
                Object[] objArr = this.f22640k;
                int length = objArr.length;
                Object obj2 = objArr[i2];
                int i3 = this.r;
                Object obj3 = f22635f;
                if (obj2 == obj3) {
                    i3++;
                    this.r = i3;
                }
                int i4 = this.s;
                if (obj == null) {
                    i4++;
                    this.s = i4;
                } else {
                    objArr[i2] = h.e(obj);
                }
                boolean z2 = false;
                z = i3 == length;
                if (i4 == length || (obj == null && obj2 == obj3)) {
                    z2 = true;
                }
                if (z2) {
                    this.o = true;
                } else if (obj != null && z) {
                    this.l.M(aVar, this.f22640k.clone());
                } else if (obj == null && this.q.get() != null && (obj2 == obj3 || !this.m)) {
                    this.o = true;
                }
            }
            if (!z && obj != null) {
                aVar.c(1L);
            } else {
                d();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        
            if (r3 == 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
        
            if (r13 == Long.MAX_VALUE) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        
            rx.n.a.a.c(r10, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        
            r12 = addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
        
            if (r12 != 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void d() {
            /*
                r19 = this;
                r7 = r19
                int r0 = r19.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                rx.n.e.n.g<java.lang.Object> r8 = r7.l
                rx.j<? super R> r9 = r7.f22636g
                boolean r0 = r7.m
                java.util.concurrent.atomic.AtomicLong r10 = r7.p
                r11 = 1
                r12 = 1
            L13:
                boolean r2 = r7.o
                boolean r3 = r8.isEmpty()
                r1 = r19
                r4 = r9
                r5 = r8
                r6 = r0
                boolean r1 = r1.b(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L25
                return
            L25:
                long r13 = r10.get()
                r5 = 0
            L2b:
                int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r1 == 0) goto L8e
                boolean r2 = r7.o
                java.lang.Object r1 = r8.peek()
                r4 = r1
                rx.n.a.j$a r4 = (rx.n.a.j.a) r4
                if (r4 != 0) goto L3d
                r16 = 1
                goto L40
            L3d:
                r1 = 0
                r16 = 0
            L40:
                r1 = r19
                r3 = r16
                r15 = r4
                r4 = r9
                r17 = r5
                r5 = r8
                r6 = r0
                boolean r1 = r1.b(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L51
                return
            L51:
                if (r16 == 0) goto L56
                r3 = r17
                goto L8f
            L56:
                r8.poll()
                java.lang.Object r1 = r8.poll()
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                if (r1 != 0) goto L71
                r7.n = r11
                r7.a(r8)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Broken queue?! Sender received but not the array."
                r0.<init>(r1)
                r9.onError(r0)
                return
            L71:
                rx.m.h<? extends R> r2 = r7.f22637h     // Catch: java.lang.Throwable -> L84
                java.lang.Object r1 = r2.call(r1)     // Catch: java.lang.Throwable -> L84
                r9.onNext(r1)
                r1 = 1
                r15.c(r1)
                r3 = r17
                long r5 = r3 + r1
                goto L2b
            L84:
                r0 = move-exception
                r7.n = r11
                r7.a(r8)
                r9.onError(r0)
                return
            L8e:
                r3 = r5
            L8f:
                r1 = 0
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 == 0) goto La1
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r5 == 0) goto La1
                rx.n.a.a.c(r10, r3)
            La1:
                int r1 = -r12
                int r12 = r7.addAndGet(r1)
                if (r12 != 0) goto L13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.n.a.j.b.d():void");
        }

        void e(Throwable th) {
            Throwable th2;
            Throwable th3;
            AtomicReference<Throwable> atomicReference = this.q;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    th3 = th;
                } else if (th2 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th2).b());
                    arrayList.add(th);
                    th3 = new CompositeException(arrayList);
                } else {
                    th3 = new CompositeException(Arrays.asList(th2, th));
                }
            } while (!atomicReference.compareAndSet(th2, th3));
        }

        public void f(rx.e<? extends T>[] eVarArr) {
            a<T, R>[] aVarArr = this.f22638i;
            int length = aVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                aVarArr[i2] = new a<>(this, i2);
            }
            lazySet(0);
            this.f22636g.add(this);
            this.f22636g.setProducer(this);
            for (int i3 = 0; i3 < length && !this.n; i3++) {
                eVarArr[i3].E0(aVarArr[i3]);
            }
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.n;
        }

        @Override // rx.g
        public void request(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j2);
            }
            if (j2 != 0) {
                rx.n.a.a.b(this.p, j2);
                d();
            }
        }

        @Override // rx.k
        public void unsubscribe() {
            if (this.n) {
                return;
            }
            this.n = true;
            if (getAndIncrement() == 0) {
                a(this.l);
            }
        }
    }

    public j(Iterable<? extends rx.e<? extends T>> iterable, rx.m.h<? extends R> hVar) {
        this(null, iterable, hVar, rx.n.e.h.f23108f, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void call(rx.j<? super R> r9) {
        /*
            r8 = this;
            rx.e<? extends T>[] r0 = r8.f22627f
            if (r0 != 0) goto L45
            java.lang.Iterable<? extends rx.e<? extends T>> r0 = r8.f22628g
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1a
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            rx.e[] r1 = new rx.e[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            rx.e[] r0 = (rx.e[]) r0
            int r1 = r0.length
            goto L46
        L1a:
            r1 = 8
            rx.e[] r1 = new rx.e[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L24:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r0.next()
            rx.e r4 = (rx.e) r4
            int r5 = r1.length
            if (r3 != r5) goto L3c
            int r5 = r3 >> 2
            int r5 = r5 + r3
            rx.e[] r5 = new rx.e[r5]
            java.lang.System.arraycopy(r1, r2, r5, r2, r3)
            r1 = r5
        L3c:
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L24
        L42:
            r0 = r1
            r4 = r3
            goto L47
        L45:
            int r1 = r0.length
        L46:
            r4 = r1
        L47:
            if (r4 != 0) goto L4d
            r9.onCompleted()
            return
        L4d:
            rx.n.a.j$b r7 = new rx.n.a.j$b
            rx.m.h<? extends R> r3 = r8.f22629h
            int r5 = r8.f22630i
            boolean r6 = r8.f22631j
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.n.a.j.call(rx.j):void");
    }

    public j(rx.e<? extends T>[] eVarArr, Iterable<? extends rx.e<? extends T>> iterable, rx.m.h<? extends R> hVar, int i2, boolean z) {
        this.f22627f = eVarArr;
        this.f22628g = iterable;
        this.f22629h = hVar;
        this.f22630i = i2;
        this.f22631j = z;
    }
}
