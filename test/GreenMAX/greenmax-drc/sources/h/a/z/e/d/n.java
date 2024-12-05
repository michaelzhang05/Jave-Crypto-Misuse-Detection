package h.a.z.e.d;

import h.a.r;

/* compiled from: ObservableObserveOn.java */
/* loaded from: classes2.dex */
public final class n<T> extends h.a.z.e.d.a<T, T> {

    /* renamed from: g, reason: collision with root package name */
    final h.a.r f18100g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f18101h;

    /* renamed from: i, reason: collision with root package name */
    final int f18102i;

    /* compiled from: ObservableObserveOn.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends h.a.z.d.a<T> implements h.a.q<T>, Runnable {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super T> f18103f;

        /* renamed from: g, reason: collision with root package name */
        final r.b f18104g;

        /* renamed from: h, reason: collision with root package name */
        final boolean f18105h;

        /* renamed from: i, reason: collision with root package name */
        final int f18106i;

        /* renamed from: j, reason: collision with root package name */
        h.a.z.c.f<T> f18107j;

        /* renamed from: k, reason: collision with root package name */
        h.a.x.c f18108k;
        Throwable l;
        volatile boolean m;
        volatile boolean n;
        int o;
        boolean p;

        a(h.a.q<? super T> qVar, r.b bVar, boolean z, int i2) {
            this.f18103f = qVar;
            this.f18104g = bVar;
            this.f18105h = z;
            this.f18106i = i2;
        }

        @Override // h.a.q
        public void a() {
            if (this.m) {
                return;
            }
            this.m = true;
            h();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18108k, cVar)) {
                this.f18108k = cVar;
                if (cVar instanceof h.a.z.c.b) {
                    h.a.z.c.b bVar = (h.a.z.c.b) cVar;
                    int i2 = bVar.i(7);
                    if (i2 == 1) {
                        this.o = i2;
                        this.f18107j = bVar;
                        this.m = true;
                        this.f18103f.b(this);
                        h();
                        return;
                    }
                    if (i2 == 2) {
                        this.o = i2;
                        this.f18107j = bVar;
                        this.f18103f.b(this);
                        return;
                    }
                }
                this.f18107j = new h.a.z.f.c(this.f18106i);
                this.f18103f.b(this);
            }
        }

        boolean c(boolean z, boolean z2, h.a.q<? super T> qVar) {
            if (this.n) {
                this.f18107j.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.l;
            if (this.f18105h) {
                if (!z2) {
                    return false;
                }
                this.n = true;
                if (th != null) {
                    qVar.onError(th);
                } else {
                    qVar.a();
                }
                this.f18104g.d();
                return true;
            }
            if (th != null) {
                this.n = true;
                this.f18107j.clear();
                qVar.onError(th);
                this.f18104g.d();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.n = true;
            qVar.a();
            this.f18104g.d();
            return true;
        }

        @Override // h.a.z.c.f
        public void clear() {
            this.f18107j.clear();
        }

        @Override // h.a.x.c
        public void d() {
            if (this.n) {
                return;
            }
            this.n = true;
            this.f18108k.d();
            this.f18104g.d();
            if (this.p || getAndIncrement() != 0) {
                return;
            }
            this.f18107j.clear();
        }

        void e() {
            int i2 = 1;
            while (!this.n) {
                boolean z = this.m;
                Throwable th = this.l;
                if (!this.f18105h && z && th != null) {
                    this.n = true;
                    this.f18103f.onError(this.l);
                    this.f18104g.d();
                    return;
                }
                this.f18103f.onNext(null);
                if (z) {
                    this.n = true;
                    Throwable th2 = this.l;
                    if (th2 != null) {
                        this.f18103f.onError(th2);
                    } else {
                        this.f18103f.a();
                    }
                    this.f18104g.d();
                    return;
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.n;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void g() {
            /*
                r7 = this;
                h.a.z.c.f<T> r0 = r7.f18107j
                h.a.q<? super T> r1 = r7.f18103f
                r2 = 1
                r3 = 1
            L6:
                boolean r4 = r7.m
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.c(r4, r5, r1)
                if (r4 == 0) goto L13
                return
            L13:
                boolean r4 = r7.m
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = 1
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.c(r4, r6, r1)
                if (r4 == 0) goto L25
                return
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
                return
            L2f:
                r1.onNext(r5)
                goto L13
            L33:
                r3 = move-exception
                io.reactivex.exceptions.a.a(r3)
                r7.n = r2
                h.a.x.c r2 = r7.f18108k
                r2.d()
                r0.clear()
                r1.onError(r3)
                h.a.r$b r0 = r7.f18104g
                r0.d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a.z.e.d.n.a.g():void");
        }

        void h() {
            if (getAndIncrement() == 0) {
                this.f18104g.b(this);
            }
        }

        @Override // h.a.z.c.c
        public int i(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.p = true;
            return 2;
        }

        @Override // h.a.z.c.f
        public boolean isEmpty() {
            return this.f18107j.isEmpty();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            if (this.m) {
                h.a.a0.a.o(th);
                return;
            }
            this.l = th;
            this.m = true;
            h();
        }

        @Override // h.a.q
        public void onNext(T t) {
            if (this.m) {
                return;
            }
            if (this.o != 2) {
                this.f18107j.offer(t);
            }
            h();
        }

        @Override // h.a.z.c.f
        public T poll() throws Exception {
            return this.f18107j.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.p) {
                e();
            } else {
                g();
            }
        }
    }

    public n(h.a.p<T> pVar, h.a.r rVar, boolean z, int i2) {
        super(pVar);
        this.f18100g = rVar;
        this.f18101h = z;
        this.f18102i = i2;
    }

    @Override // h.a.m
    protected void x(h.a.q<? super T> qVar) {
        h.a.r rVar = this.f18100g;
        if (rVar instanceof h.a.z.g.m) {
            this.f18030f.a(qVar);
        } else {
            this.f18030f.a(new a(qVar, rVar.a(), this.f18101h, this.f18102i));
        }
    }
}
