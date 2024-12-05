package rx.p;

import rx.n.a.h;

/* compiled from: SerializedObserver.java */
/* loaded from: classes3.dex */
public class d<T> implements rx.f<T> {

    /* renamed from: f, reason: collision with root package name */
    private final rx.f<? super T> f23199f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23200g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f23201h;

    /* renamed from: i, reason: collision with root package name */
    private a f23202i;

    /* compiled from: SerializedObserver.java */
    /* loaded from: classes3.dex */
    static final class a {
        Object[] a;

        /* renamed from: b, reason: collision with root package name */
        int f23203b;

        a() {
        }

        public void a(Object obj) {
            int i2 = this.f23203b;
            Object[] objArr = this.a;
            if (objArr == null) {
                objArr = new Object[16];
                this.a = objArr;
            } else if (i2 == objArr.length) {
                Object[] objArr2 = new Object[(i2 >> 2) + i2];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                this.a = objArr2;
                objArr = objArr2;
            }
            objArr[i2] = obj;
            this.f23203b = i2 + 1;
        }
    }

    public d(rx.f<? super T> fVar) {
        this.f23199f = fVar;
    }

    @Override // rx.f
    public void onCompleted() {
        if (this.f23201h) {
            return;
        }
        synchronized (this) {
            if (this.f23201h) {
                return;
            }
            this.f23201h = true;
            if (this.f23200g) {
                a aVar = this.f23202i;
                if (aVar == null) {
                    aVar = new a();
                    this.f23202i = aVar;
                }
                aVar.a(h.b());
                return;
            }
            this.f23200g = true;
            this.f23199f.onCompleted();
        }
    }

    @Override // rx.f
    public void onError(Throwable th) {
        rx.exceptions.a.e(th);
        if (this.f23201h) {
            return;
        }
        synchronized (this) {
            if (this.f23201h) {
                return;
            }
            this.f23201h = true;
            if (this.f23200g) {
                a aVar = this.f23202i;
                if (aVar == null) {
                    aVar = new a();
                    this.f23202i = aVar;
                }
                aVar.a(h.c(th));
                return;
            }
            this.f23200g = true;
            this.f23199f.onError(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002d, code lost:
    
        continue;
     */
    @Override // rx.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNext(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.f23201h
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r6)
            boolean r0 = r6.f23201h     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto Lc
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            return
        Lc:
            boolean r0 = r6.f23200g     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L24
            rx.p.d$a r0 = r6.f23202i     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L1b
            rx.p.d$a r0 = new rx.p.d$a     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            r6.f23202i = r0     // Catch: java.lang.Throwable -> L6f
        L1b:
            java.lang.Object r7 = rx.n.a.h.g(r7)     // Catch: java.lang.Throwable -> L6f
            r0.a(r7)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            return
        L24:
            r0 = 1
            r6.f23200g = r0     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            rx.f<? super T> r1 = r6.f23199f     // Catch: java.lang.Throwable -> L66
            r1.onNext(r7)     // Catch: java.lang.Throwable -> L66
        L2d:
            monitor-enter(r6)
            rx.p.d$a r1 = r6.f23202i     // Catch: java.lang.Throwable -> L63
            r2 = 0
            if (r1 != 0) goto L37
            r6.f23200g = r2     // Catch: java.lang.Throwable -> L63
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            return
        L37:
            r3 = 0
            r6.f23202i = r3     // Catch: java.lang.Throwable -> L63
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r1 = r1.a
            int r3 = r1.length
        L3e:
            if (r2 >= r3) goto L2d
            r4 = r1[r2]
            if (r4 != 0) goto L45
            goto L2d
        L45:
            rx.f<? super T> r5 = r6.f23199f     // Catch: java.lang.Throwable -> L53
            boolean r4 = rx.n.a.h.a(r5, r4)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L50
            r6.f23201h = r0     // Catch: java.lang.Throwable -> L53
            return
        L50:
            int r2 = r2 + 1
            goto L3e
        L53:
            r1 = move-exception
            r6.f23201h = r0
            rx.exceptions.a.e(r1)
            rx.f<? super T> r0 = r6.f23199f
            java.lang.Throwable r7 = rx.exceptions.OnErrorThrowable.a(r1, r7)
            r0.onError(r7)
            return
        L63:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            throw r7
        L66:
            r1 = move-exception
            r6.f23201h = r0
            rx.f<? super T> r0 = r6.f23199f
            rx.exceptions.a.g(r1, r0, r7)
            return
        L6f:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            goto L73
        L72:
            throw r7
        L73:
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.p.d.onNext(java.lang.Object):void");
    }
}
