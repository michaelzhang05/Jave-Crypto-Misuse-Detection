package rx.n.a;

import java.util.concurrent.atomic.AtomicLong;
import rx.e;
import rx.exceptions.MissingBackpressureException;

/* compiled from: OperatorZip.java */
/* loaded from: classes3.dex */
public final class g1<R> implements e.b<R, rx.e<?>[]> {

    /* renamed from: f, reason: collision with root package name */
    final rx.m.h<? extends R> f22592f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorZip.java */
    /* loaded from: classes3.dex */
    public static final class a<R> extends AtomicLong {

        /* renamed from: f, reason: collision with root package name */
        static final int f22593f;

        /* renamed from: g, reason: collision with root package name */
        final rx.f<? super R> f22594g;

        /* renamed from: h, reason: collision with root package name */
        private final rx.m.h<? extends R> f22595h;

        /* renamed from: i, reason: collision with root package name */
        private final rx.t.b f22596i;

        /* renamed from: j, reason: collision with root package name */
        int f22597j;

        /* renamed from: k, reason: collision with root package name */
        private volatile Object[] f22598k;
        private AtomicLong l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OperatorZip.java */
        /* renamed from: rx.n.a.g1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0401a extends rx.j {

            /* renamed from: f, reason: collision with root package name */
            final rx.n.e.h f22599f = rx.n.e.h.a();

            C0401a() {
            }

            public void c(long j2) {
                request(j2);
            }

            @Override // rx.f
            public void onCompleted() {
                this.f22599f.f();
                a.this.b();
            }

            @Override // rx.f
            public void onError(Throwable th) {
                a.this.f22594g.onError(th);
            }

            @Override // rx.f
            public void onNext(Object obj) {
                try {
                    this.f22599f.g(obj);
                } catch (MissingBackpressureException e2) {
                    onError(e2);
                }
                a.this.b();
            }

            @Override // rx.j
            public void onStart() {
                request(rx.n.e.h.f23108f);
            }
        }

        static {
            double d2 = rx.n.e.h.f23108f;
            Double.isNaN(d2);
            f22593f = (int) (d2 * 0.7d);
        }

        public a(rx.j<? super R> jVar, rx.m.h<? extends R> hVar) {
            rx.t.b bVar = new rx.t.b();
            this.f22596i = bVar;
            this.f22594g = jVar;
            this.f22595h = hVar;
            jVar.add(bVar);
        }

        public void a(rx.e[] eVarArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[eVarArr.length];
            for (int i2 = 0; i2 < eVarArr.length; i2++) {
                C0401a c0401a = new C0401a();
                objArr[i2] = c0401a;
                this.f22596i.a(c0401a);
            }
            this.l = atomicLong;
            this.f22598k = objArr;
            for (int i3 = 0; i3 < eVarArr.length; i3++) {
                eVarArr[i3].c1((C0401a) objArr[i3]);
            }
        }

        void b() {
            Object[] objArr = this.f22598k;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            rx.f<? super R> fVar = this.f22594g;
            AtomicLong atomicLong = this.l;
            while (true) {
                Object[] objArr2 = new Object[length];
                boolean z = true;
                for (int i2 = 0; i2 < length; i2++) {
                    rx.n.e.h hVar = ((C0401a) objArr[i2]).f22599f;
                    Object h2 = hVar.h();
                    if (h2 == null) {
                        z = false;
                    } else {
                        if (hVar.d(h2)) {
                            fVar.onCompleted();
                            this.f22596i.unsubscribe();
                            return;
                        }
                        objArr2[i2] = hVar.c(h2);
                    }
                }
                if (z && atomicLong.get() > 0) {
                    try {
                        fVar.onNext(this.f22595h.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.f22597j++;
                        for (Object obj : objArr) {
                            rx.n.e.h hVar2 = ((C0401a) obj).f22599f;
                            hVar2.i();
                            if (hVar2.d(hVar2.h())) {
                                fVar.onCompleted();
                                this.f22596i.unsubscribe();
                                return;
                            }
                        }
                        if (this.f22597j > f22593f) {
                            for (Object obj2 : objArr) {
                                ((C0401a) obj2).c(this.f22597j);
                            }
                            this.f22597j = 0;
                        }
                    } catch (Throwable th) {
                        rx.exceptions.a.g(th, fVar, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorZip.java */
    /* loaded from: classes3.dex */
    public static final class b<R> extends AtomicLong implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final a<R> f22601f;

        public b(a<R> aVar) {
            this.f22601f = aVar;
        }

        @Override // rx.g
        public void request(long j2) {
            rx.n.a.a.b(this, j2);
            this.f22601f.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorZip.java */
    /* loaded from: classes3.dex */
    public final class c extends rx.j<rx.e[]> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super R> f22602f;

        /* renamed from: g, reason: collision with root package name */
        final a<R> f22603g;

        /* renamed from: h, reason: collision with root package name */
        final b<R> f22604h;

        /* renamed from: i, reason: collision with root package name */
        boolean f22605i;

        public c(rx.j<? super R> jVar, a<R> aVar, b<R> bVar) {
            this.f22602f = jVar;
            this.f22603g = aVar;
            this.f22604h = bVar;
        }

        @Override // rx.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.e[] eVarArr) {
            if (eVarArr != null && eVarArr.length != 0) {
                this.f22605i = true;
                this.f22603g.a(eVarArr, this.f22604h);
            } else {
                this.f22602f.onCompleted();
            }
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22605i) {
                return;
            }
            this.f22602f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22602f.onError(th);
        }
    }

    public g1(rx.m.f fVar) {
        this.f22592f = rx.m.i.a(fVar);
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super rx.e[]> call(rx.j<? super R> jVar) {
        a aVar = new a(jVar, this.f22592f);
        b bVar = new b(aVar);
        c cVar = new c(jVar, aVar, bVar);
        jVar.add(cVar);
        jVar.setProducer(bVar);
        return cVar;
    }
}
