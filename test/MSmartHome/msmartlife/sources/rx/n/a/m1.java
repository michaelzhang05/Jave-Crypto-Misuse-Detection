package rx.n.a;

import rx.Single;
import rx.h;

/* compiled from: SingleObserveOn.java */
/* loaded from: classes3.dex */
public final class m1<T> implements Single.j<T> {

    /* renamed from: f, reason: collision with root package name */
    final Single.j<T> f22708f;

    /* renamed from: g, reason: collision with root package name */
    final rx.h f22709g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleObserveOn.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.i<T> implements rx.m.a {

        /* renamed from: g, reason: collision with root package name */
        final rx.i<? super T> f22710g;

        /* renamed from: h, reason: collision with root package name */
        final h.a f22711h;

        /* renamed from: i, reason: collision with root package name */
        T f22712i;

        /* renamed from: j, reason: collision with root package name */
        Throwable f22713j;

        public a(rx.i<? super T> iVar, h.a aVar) {
            this.f22710g = iVar;
            this.f22711h = aVar;
        }

        @Override // rx.i
        public void c(T t) {
            this.f22712i = t;
            this.f22711h.c(this);
        }

        @Override // rx.m.a
        public void call() {
            try {
                Throwable th = this.f22713j;
                if (th != null) {
                    this.f22713j = null;
                    this.f22710g.onError(th);
                } else {
                    T t = this.f22712i;
                    this.f22712i = null;
                    this.f22710g.c(t);
                }
            } finally {
                this.f22711h.unsubscribe();
            }
        }

        @Override // rx.i
        public void onError(Throwable th) {
            this.f22713j = th;
            this.f22711h.c(this);
        }
    }

    public m1(Single.j<T> jVar, rx.h hVar) {
        this.f22708f = jVar;
        this.f22709g = hVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.i<? super T> iVar) {
        h.a createWorker = this.f22709g.createWorker();
        a aVar = new a(iVar, createWorker);
        iVar.b(createWorker);
        iVar.b(aVar);
        this.f22708f.call(aVar);
    }
}
