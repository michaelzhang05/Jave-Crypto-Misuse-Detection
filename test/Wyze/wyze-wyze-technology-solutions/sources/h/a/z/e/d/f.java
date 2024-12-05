package h.a.z.e.d;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMap.java */
/* loaded from: classes2.dex */
public final class f<T, U> extends h.a.z.e.d.a<T, U> {

    /* renamed from: g, reason: collision with root package name */
    final h.a.y.f<? super T, ? extends h.a.p<? extends U>> f18045g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f18046h;

    /* renamed from: i, reason: collision with root package name */
    final int f18047i;

    /* renamed from: j, reason: collision with root package name */
    final int f18048j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableFlatMap.java */
    /* loaded from: classes2.dex */
    public static final class a<T, U> extends AtomicReference<h.a.x.c> implements h.a.q<U> {

        /* renamed from: f, reason: collision with root package name */
        final long f18049f;

        /* renamed from: g, reason: collision with root package name */
        final b<T, U> f18050g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f18051h;

        /* renamed from: i, reason: collision with root package name */
        volatile h.a.z.c.f<U> f18052i;

        /* renamed from: j, reason: collision with root package name */
        int f18053j;

        a(b<T, U> bVar, long j2) {
            this.f18049f = j2;
            this.f18050g = bVar;
        }

        @Override // h.a.q
        public void a() {
            this.f18051h = true;
            this.f18050g.h();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.C(this, cVar) && (cVar instanceof h.a.z.c.b)) {
                h.a.z.c.b bVar = (h.a.z.c.b) cVar;
                int i2 = bVar.i(7);
                if (i2 == 1) {
                    this.f18053j = i2;
                    this.f18052i = bVar;
                    this.f18051h = true;
                    this.f18050g.h();
                    return;
                }
                if (i2 == 2) {
                    this.f18053j = i2;
                    this.f18052i = bVar;
                }
            }
        }

        public void c() {
            h.a.z.a.c.i(this);
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            if (this.f18050g.o.a(th)) {
                b<T, U> bVar = this.f18050g;
                if (!bVar.f18058j) {
                    bVar.g();
                }
                this.f18051h = true;
                this.f18050g.h();
                return;
            }
            h.a.a0.a.o(th);
        }

        @Override // h.a.q
        public void onNext(U u) {
            if (this.f18053j == 0) {
                this.f18050g.l(u, this);
            } else {
                this.f18050g.h();
            }
        }
    }

    /* compiled from: ObservableFlatMap.java */
    /* loaded from: classes2.dex */
    static final class b<T, U> extends AtomicInteger implements h.a.x.c, h.a.q<T> {

        /* renamed from: f, reason: collision with root package name */
        static final a<?, ?>[] f18054f = new a[0];

        /* renamed from: g, reason: collision with root package name */
        static final a<?, ?>[] f18055g = new a[0];

        /* renamed from: h, reason: collision with root package name */
        final h.a.q<? super U> f18056h;

        /* renamed from: i, reason: collision with root package name */
        final h.a.y.f<? super T, ? extends h.a.p<? extends U>> f18057i;

        /* renamed from: j, reason: collision with root package name */
        final boolean f18058j;

        /* renamed from: k, reason: collision with root package name */
        final int f18059k;
        final int l;
        volatile h.a.z.c.e<U> m;
        volatile boolean n;
        final h.a.z.j.a o = new h.a.z.j.a();
        volatile boolean p;
        final AtomicReference<a<?, ?>[]> q;
        h.a.x.c r;
        long s;
        long t;
        int u;
        Queue<h.a.p<? extends U>> v;
        int w;

        b(h.a.q<? super U> qVar, h.a.y.f<? super T, ? extends h.a.p<? extends U>> fVar, boolean z, int i2, int i3) {
            this.f18056h = qVar;
            this.f18057i = fVar;
            this.f18058j = z;
            this.f18059k = i2;
            this.l = i3;
            if (i2 != Integer.MAX_VALUE) {
                this.v = new ArrayDeque(i2);
            }
            this.q = new AtomicReference<>(f18054f);
        }

        @Override // h.a.q
        public void a() {
            if (this.n) {
                return;
            }
            this.n = true;
            h();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.r, cVar)) {
                this.r = cVar;
                this.f18056h.b(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean c(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.q.get();
                if (aVarArr == f18055g) {
                    aVar.c();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.q.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        @Override // h.a.x.c
        public void d() {
            Throwable b2;
            if (this.p) {
                return;
            }
            this.p = true;
            if (!g() || (b2 = this.o.b()) == null || b2 == h.a.z.j.c.a) {
                return;
            }
            h.a.a0.a.o(b2);
        }

        boolean e() {
            if (this.p) {
                return true;
            }
            Throwable th = this.o.get();
            if (this.f18058j || th == null) {
                return false;
            }
            g();
            Throwable b2 = this.o.b();
            if (b2 != h.a.z.j.c.a) {
                this.f18056h.onError(b2);
            }
            return true;
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.p;
        }

        boolean g() {
            a<?, ?>[] andSet;
            this.r.d();
            a<?, ?>[] aVarArr = this.q.get();
            a<?, ?>[] aVarArr2 = f18055g;
            if (aVarArr == aVarArr2 || (andSet = this.q.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.c();
            }
            return true;
        }

        void h() {
            if (getAndIncrement() == 0) {
                i();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:131:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        
            if (r11 != null) goto L110;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        
            r11 = r10.f18051h;
            r12 = r10.f18052i;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
        
            if (r11 == false) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
        
            if (r12 == null) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
        
            if (r12.isEmpty() == false) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
        
            j(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
        
            if (e() == false) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00eb, code lost:
        
            r4 = r4 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00ea, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
        
            r7 = r7 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
        
            if (r7 != r6) goto L133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:
        
            r7 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00f2, code lost:
        
            r3 = r3 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00a5, code lost:
        
            r12 = r11.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00a9, code lost:
        
            if (r12 != null) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
        
            r0.onNext(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00b3, code lost:
        
            if (e() == false) goto L135;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00b5, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00b6, code lost:
        
            r11 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00b7, code lost:
        
            io.reactivex.exceptions.a.a(r11);
            r10.c();
            r14.o.a(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x00c6, code lost:
        
            if (e() != false) goto L119;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00c9, code lost:
        
            j(r10);
            r4 = r4 + 1;
            r7 = r7 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00d0, code lost:
        
            if (r7 != r6) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x00c8, code lost:
        
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void i() {
            /*
                Method dump skipped, instructions count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a.z.e.d.f.b.i():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        void j(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.q.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
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
                    aVarArr2 = f18054f;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                    System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!this.q.compareAndSet(aVarArr, aVarArr2));
        }

        void k(h.a.p<? extends U> pVar) {
            h.a.p<? extends U> poll;
            while (pVar instanceof Callable) {
                if (!m((Callable) pVar) || this.f18059k == Integer.MAX_VALUE) {
                    return;
                }
                boolean z = false;
                synchronized (this) {
                    poll = this.v.poll();
                    if (poll == null) {
                        this.w--;
                        z = true;
                    }
                }
                if (z) {
                    h();
                    return;
                }
                pVar = poll;
            }
            long j2 = this.s;
            this.s = 1 + j2;
            a<T, U> aVar = new a<>(this, j2);
            if (c(aVar)) {
                pVar.a(aVar);
            }
        }

        void l(U u, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f18056h.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                h.a.z.c.f fVar = aVar.f18052i;
                if (fVar == null) {
                    fVar = new h.a.z.f.c(this.l);
                    aVar.f18052i = fVar;
                }
                fVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            i();
        }

        boolean m(Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f18056h.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    h.a.z.c.e<U> eVar = this.m;
                    if (eVar == null) {
                        if (this.f18059k == Integer.MAX_VALUE) {
                            eVar = new h.a.z.f.c<>(this.l);
                        } else {
                            eVar = new h.a.z.f.b<>(this.f18059k);
                        }
                        this.m = eVar;
                    }
                    if (!eVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                i();
                return true;
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                this.o.a(th);
                h();
                return true;
            }
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            if (this.n) {
                h.a.a0.a.o(th);
            } else if (this.o.a(th)) {
                this.n = true;
                h();
            } else {
                h.a.a0.a.o(th);
            }
        }

        @Override // h.a.q
        public void onNext(T t) {
            if (this.n) {
                return;
            }
            try {
                h.a.p<? extends U> pVar = (h.a.p) h.a.z.b.b.c(this.f18057i.a(t), "The mapper returned a null ObservableSource");
                if (this.f18059k != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i2 = this.w;
                        if (i2 == this.f18059k) {
                            this.v.offer(pVar);
                            return;
                        }
                        this.w = i2 + 1;
                    }
                }
                k(pVar);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                this.r.d();
                onError(th);
            }
        }
    }

    public f(h.a.p<T> pVar, h.a.y.f<? super T, ? extends h.a.p<? extends U>> fVar, boolean z, int i2, int i3) {
        super(pVar);
        this.f18045g = fVar;
        this.f18046h = z;
        this.f18047i = i2;
        this.f18048j = i3;
    }

    @Override // h.a.m
    public void x(h.a.q<? super U> qVar) {
        if (p.b(this.f18030f, qVar, this.f18045g)) {
            return;
        }
        this.f18030f.a(new b(qVar, this.f18045g, this.f18046h, this.f18047i, this.f18048j));
    }
}
