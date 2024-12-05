package e.g.b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.f;
import rx.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RelaySubscriptionManager.java */
/* loaded from: classes2.dex */
public final class e<T> extends AtomicReference<c<T>> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    volatile Object f17724f;

    /* renamed from: g, reason: collision with root package name */
    boolean f17725g;

    /* renamed from: h, reason: collision with root package name */
    rx.m.b<b<T>> f17726h;

    /* renamed from: i, reason: collision with root package name */
    rx.m.b<b<T>> f17727i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RelaySubscriptionManager.java */
    /* loaded from: classes2.dex */
    public class a implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f17728f;

        a(b bVar) {
            this.f17728f = bVar;
        }

        @Override // rx.m.a
        public void call() {
            e.this.g(this.f17728f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RelaySubscriptionManager.java */
    /* loaded from: classes2.dex */
    public static final class b<T> implements f<T> {

        /* renamed from: f, reason: collision with root package name */
        final f<? super T> f17730f;

        /* renamed from: g, reason: collision with root package name */
        boolean f17731g = true;

        /* renamed from: h, reason: collision with root package name */
        boolean f17732h;

        /* renamed from: i, reason: collision with root package name */
        List<Object> f17733i;

        /* renamed from: j, reason: collision with root package name */
        boolean f17734j;

        b(f<? super T> fVar) {
            this.f17730f = fVar;
        }

        private void a(Object obj) {
            if (obj != null) {
                e.g.b.b.a(this.f17730f, obj);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void c(java.util.List<java.lang.Object> r5, java.lang.Object r6) {
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
                java.util.List<java.lang.Object> r5 = r4.f17733i     // Catch: java.lang.Throwable -> L2e
                r3 = 0
                r4.f17733i = r3     // Catch: java.lang.Throwable -> L2e
                if (r5 != 0) goto L2c
                r4.f17732h = r2     // Catch: java.lang.Throwable -> L2e
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
                r4.f17732h = r2     // Catch: java.lang.Throwable -> L3d
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
            throw new UnsupportedOperationException("Method not decompiled: e.g.b.e.b.c(java.util.List, java.lang.Object):void");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(Object obj) {
            synchronized (this) {
                if (this.f17731g && !this.f17732h) {
                    this.f17731g = false;
                    this.f17732h = obj != null;
                    if (obj != null) {
                        c(null, obj);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d(Object obj) {
            if (!this.f17734j) {
                synchronized (this) {
                    this.f17731g = false;
                    if (this.f17732h) {
                        if (this.f17733i == null) {
                            this.f17733i = new ArrayList();
                        }
                        this.f17733i.add(obj);
                        return;
                    }
                    this.f17734j = true;
                }
            }
            e.g.b.b.a(this.f17730f, obj);
        }

        @Override // rx.f
        public void onCompleted() {
            throw new AssertionError();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            throw new AssertionError();
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f17730f.onNext(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RelaySubscriptionManager.java */
    /* loaded from: classes2.dex */
    public static final class c<T> {
        static final c a = new c(new b[0]);

        /* renamed from: b, reason: collision with root package name */
        final b[] f17735b;

        c(b[] bVarArr) {
            this.f17735b = bVarArr;
        }

        c a(b bVar) {
            b[] bVarArr = this.f17735b;
            int length = bVarArr.length;
            b[] bVarArr2 = new b[length + 1];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar;
            return new c(bVarArr2);
        }

        c b(b bVar) {
            b[] bVarArr = this.f17735b;
            int length = bVarArr.length;
            if (length == 1 && bVarArr[0] == bVar) {
                return a;
            }
            if (length == 0) {
                return this;
            }
            int i2 = length - 1;
            b[] bVarArr2 = new b[i2];
            int i3 = 0;
            for (b bVar2 : bVarArr) {
                if (bVar2 != bVar) {
                    if (i3 == i2) {
                        return this;
                    }
                    bVarArr2[i3] = bVar2;
                    i3++;
                }
            }
            if (i3 == 0) {
                return a;
            }
            if (i3 < i2) {
                b[] bVarArr3 = new b[i3];
                System.arraycopy(bVarArr2, 0, bVarArr3, 0, i3);
                bVarArr2 = bVarArr3;
            }
            return new c(bVarArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        super(c.a);
        this.f17725g = true;
        this.f17726h = rx.m.c.a();
        this.f17727i = rx.m.c.a();
    }

    private void a(b<T> bVar) {
        c<T> cVar;
        do {
            cVar = get();
        } while (!compareAndSet(cVar, cVar.a(bVar)));
        this.f17727i.call(bVar);
    }

    private void b(j<? super T> jVar, b<T> bVar) {
        jVar.add(rx.t.e.a(new a(bVar)));
    }

    @Override // rx.m.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void call(j<? super T> jVar) {
        b<T> bVar = new b<>(jVar);
        b(jVar, bVar);
        this.f17726h.call(bVar);
        if (jVar.isUnsubscribed()) {
            return;
        }
        a(bVar);
        if (jVar.isUnsubscribed()) {
            g(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d() {
        return this.f17724f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b<T>[] e(Object obj) {
        h(obj);
        return get().f17735b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b<T>[] f() {
        return get().f17735b;
    }

    void g(b<T> bVar) {
        c<T> cVar;
        c<T> b2;
        do {
            cVar = get();
            b2 = cVar.b(bVar);
            if (b2 == cVar) {
                return;
            }
        } while (!compareAndSet(cVar, b2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Object obj) {
        this.f17724f = obj;
    }
}
