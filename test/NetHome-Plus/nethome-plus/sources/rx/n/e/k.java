package rx.n.e;

import rx.Single;
import rx.h;

/* compiled from: ScalarSynchronousSingle.java */
/* loaded from: classes3.dex */
public final class k<T> extends Single<T> {

    /* renamed from: b, reason: collision with root package name */
    final T f23134b;

    /* compiled from: ScalarSynchronousSingle.java */
    /* loaded from: classes3.dex */
    class a implements Single.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f23135f;

        a(Object obj) {
            this.f23135f = obj;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super T> iVar) {
            iVar.c((Object) this.f23135f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ScalarSynchronousSingle.java */
    /* loaded from: classes3.dex */
    public class b<R> implements Single.j<R> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.e f23136f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ScalarSynchronousSingle.java */
        /* loaded from: classes3.dex */
        public class a extends rx.i<R> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ rx.i f23138g;

            a(rx.i iVar) {
                this.f23138g = iVar;
            }

            @Override // rx.i
            public void c(R r) {
                this.f23138g.c(r);
            }

            @Override // rx.i
            public void onError(Throwable th) {
                this.f23138g.onError(th);
            }
        }

        b(rx.m.e eVar) {
            this.f23136f = eVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super R> iVar) {
            Single single = (Single) this.f23136f.call(k.this.f23134b);
            if (single instanceof k) {
                iVar.c(((k) single).f23134b);
                return;
            }
            a aVar = new a(iVar);
            iVar.b(aVar);
            single.t(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalarSynchronousSingle.java */
    /* loaded from: classes3.dex */
    public static final class c<T> implements Single.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private final rx.n.c.b f23140f;

        /* renamed from: g, reason: collision with root package name */
        private final T f23141g;

        c(rx.n.c.b bVar, T t) {
            this.f23140f = bVar;
            this.f23141g = t;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super T> iVar) {
            iVar.b(this.f23140f.a(new e(iVar, this.f23141g)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalarSynchronousSingle.java */
    /* loaded from: classes3.dex */
    public static final class d<T> implements Single.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private final rx.h f23142f;

        /* renamed from: g, reason: collision with root package name */
        private final T f23143g;

        d(rx.h hVar, T t) {
            this.f23142f = hVar;
            this.f23143g = t;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super T> iVar) {
            h.a createWorker = this.f23142f.createWorker();
            iVar.b(createWorker);
            createWorker.c(new e(iVar, this.f23143g));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalarSynchronousSingle.java */
    /* loaded from: classes3.dex */
    public static final class e<T> implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        private final rx.i<? super T> f23144f;

        /* renamed from: g, reason: collision with root package name */
        private final T f23145g;

        e(rx.i<? super T> iVar, T t) {
            this.f23144f = iVar;
            this.f23145g = t;
        }

        @Override // rx.m.a
        public void call() {
            try {
                this.f23144f.c(this.f23145g);
            } catch (Throwable th) {
                this.f23144f.onError(th);
            }
        }
    }

    protected k(T t) {
        super(new a(t));
        this.f23134b = t;
    }

    public static <T> k<T> D(T t) {
        return new k<>(t);
    }

    public <R> Single<R> E(rx.m.e<? super T, ? extends Single<? extends R>> eVar) {
        return Single.b(new b(eVar));
    }

    public Single<T> F(rx.h hVar) {
        if (hVar instanceof rx.n.c.b) {
            return Single.b(new c((rx.n.c.b) hVar, this.f23134b));
        }
        return Single.b(new d(hVar, this.f23134b));
    }
}
