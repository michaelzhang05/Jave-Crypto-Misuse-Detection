package rx.s;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.f;
import rx.j;
import rx.n.a.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubjectSubscriptionManager.java */
/* loaded from: classes3.dex */
public final class e<T> extends AtomicReference<b<T>> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    volatile Object f23240f;

    /* renamed from: g, reason: collision with root package name */
    boolean f23241g;

    /* renamed from: h, reason: collision with root package name */
    rx.m.b<c<T>> f23242h;

    /* renamed from: i, reason: collision with root package name */
    rx.m.b<c<T>> f23243i;

    /* renamed from: j, reason: collision with root package name */
    rx.m.b<c<T>> f23244j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubjectSubscriptionManager.java */
    /* loaded from: classes3.dex */
    public class a implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f23245f;

        a(c cVar) {
            this.f23245f = cVar;
        }

        @Override // rx.m.a
        public void call() {
            e.this.f(this.f23245f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: SubjectSubscriptionManager.java */
    /* loaded from: classes3.dex */
    public static final class b<T> {
        static final c[] a;

        /* renamed from: b, reason: collision with root package name */
        static final b f23247b;

        /* renamed from: c, reason: collision with root package name */
        static final b f23248c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f23249d;

        /* renamed from: e, reason: collision with root package name */
        final c[] f23250e;

        static {
            c[] cVarArr = new c[0];
            a = cVarArr;
            f23247b = new b(true, cVarArr);
            f23248c = new b(false, cVarArr);
        }

        public b(boolean z, c[] cVarArr) {
            this.f23249d = z;
            this.f23250e = cVarArr;
        }

        public b a(c cVar) {
            c[] cVarArr = this.f23250e;
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            return new b(this.f23249d, cVarArr2);
        }

        public b b(c cVar) {
            c[] cVarArr = this.f23250e;
            int length = cVarArr.length;
            if (length == 1 && cVarArr[0] == cVar) {
                return f23248c;
            }
            if (length == 0) {
                return this;
            }
            int i2 = length - 1;
            c[] cVarArr2 = new c[i2];
            int i3 = 0;
            for (c cVar2 : cVarArr) {
                if (cVar2 != cVar) {
                    if (i3 == i2) {
                        return this;
                    }
                    cVarArr2[i3] = cVar2;
                    i3++;
                }
            }
            if (i3 == 0) {
                return f23248c;
            }
            if (i3 < i2) {
                c[] cVarArr3 = new c[i3];
                System.arraycopy(cVarArr2, 0, cVarArr3, 0, i3);
                cVarArr2 = cVarArr3;
            }
            return new b(this.f23249d, cVarArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: SubjectSubscriptionManager.java */
    /* loaded from: classes3.dex */
    public static final class c<T> implements f<T> {

        /* renamed from: f, reason: collision with root package name */
        final j<? super T> f23251f;

        /* renamed from: g, reason: collision with root package name */
        boolean f23252g = true;

        /* renamed from: h, reason: collision with root package name */
        boolean f23253h;

        /* renamed from: i, reason: collision with root package name */
        List<Object> f23254i;

        /* renamed from: j, reason: collision with root package name */
        boolean f23255j;

        public c(j<? super T> jVar) {
            this.f23251f = jVar;
        }

        void a(Object obj) {
            if (obj != null) {
                h.a(this.f23251f, obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(Object obj) {
            synchronized (this) {
                if (this.f23252g && !this.f23253h) {
                    this.f23252g = false;
                    this.f23253h = obj != null;
                    if (obj != null) {
                        c(null, obj);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void c(java.util.List<java.lang.Object> r5, java.lang.Object r6) {
            /*
                r4 = this;
                r0 = 1
                r1 = 1
            L2:
                r2 = 0
                if (r5 == 0) goto L1a
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L17
            L9:
                boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r3 == 0) goto L1a
                java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L17
                r4.a(r3)     // Catch: java.lang.Throwable -> L17
                goto L9
            L17:
                r5 = move-exception
                r0 = 0
                goto L36
            L1a:
                if (r1 == 0) goto L20
                r4.a(r6)     // Catch: java.lang.Throwable -> L17
                r1 = 0
            L20:
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L17
                java.util.List<java.lang.Object> r5 = r4.f23254i     // Catch: java.lang.Throwable -> L2e
                r3 = 0
                r4.f23254i = r3     // Catch: java.lang.Throwable -> L2e
                if (r5 != 0) goto L2c
                r4.f23253h = r2     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
                return
            L2c:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
                goto L2
            L2e:
                r5 = move-exception
                r0 = 0
            L30:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
                throw r5     // Catch: java.lang.Throwable -> L32
            L32:
                r5 = move-exception
                goto L36
            L34:
                r5 = move-exception
                goto L30
            L36:
                if (r0 != 0) goto L40
                monitor-enter(r4)
                r4.f23253h = r2     // Catch: java.lang.Throwable -> L3d
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                goto L40
            L3d:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                throw r5
            L40:
                goto L42
            L41:
                throw r5
            L42:
                goto L41
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.s.e.c.c(java.util.List, java.lang.Object):void");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d(Object obj) {
            if (!this.f23255j) {
                synchronized (this) {
                    this.f23252g = false;
                    if (this.f23253h) {
                        if (this.f23254i == null) {
                            this.f23254i = new ArrayList();
                        }
                        this.f23254i.add(obj);
                        return;
                    }
                    this.f23255j = true;
                }
            }
            h.a(this.f23251f, obj);
        }

        @Override // rx.f
        public void onCompleted() {
            this.f23251f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f23251f.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f23251f.onNext(t);
        }
    }

    public e() {
        super(b.f23248c);
        this.f23241g = true;
        this.f23242h = rx.m.c.a();
        this.f23243i = rx.m.c.a();
        this.f23244j = rx.m.c.a();
    }

    boolean a(c<T> cVar) {
        b<T> bVar;
        do {
            bVar = get();
            if (bVar.f23249d) {
                this.f23244j.call(cVar);
                return false;
            }
        } while (!compareAndSet(bVar, bVar.a(cVar)));
        this.f23243i.call(cVar);
        return true;
    }

    void b(j<? super T> jVar, c<T> cVar) {
        jVar.add(rx.t.e.a(new a(cVar)));
    }

    @Override // rx.m.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void call(j<? super T> jVar) {
        c<T> cVar = new c<>(jVar);
        b(jVar, cVar);
        this.f23242h.call(cVar);
        if (!jVar.isUnsubscribed() && a(cVar) && jVar.isUnsubscribed()) {
            f(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d() {
        return this.f23240f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<T>[] e(Object obj) {
        g(obj);
        return get().f23250e;
    }

    void f(c<T> cVar) {
        b<T> bVar;
        b<T> b2;
        do {
            bVar = get();
            if (bVar.f23249d || (b2 = bVar.b(cVar)) == bVar) {
                return;
            }
        } while (!compareAndSet(bVar, b2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Object obj) {
        this.f23240f = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<T>[] h(Object obj) {
        g(obj);
        this.f23241g = false;
        if (get().f23249d) {
            return b.a;
        }
        return getAndSet(b.f23247b).f23250e;
    }
}
