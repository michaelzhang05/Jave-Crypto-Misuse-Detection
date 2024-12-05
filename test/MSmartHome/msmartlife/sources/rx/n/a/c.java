package rx.n.a;

import rx.Single;
import rx.b;

/* compiled from: CompletableFlatMapSingleToCompletable.java */
/* loaded from: classes3.dex */
public final class c<T> implements b.w {

    /* renamed from: f, reason: collision with root package name */
    final Single<T> f22509f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<? super T, ? extends rx.b> f22510g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompletableFlatMapSingleToCompletable.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.i<T> implements rx.c {

        /* renamed from: g, reason: collision with root package name */
        final rx.c f22511g;

        /* renamed from: h, reason: collision with root package name */
        final rx.m.e<? super T, ? extends rx.b> f22512h;

        public a(rx.c cVar, rx.m.e<? super T, ? extends rx.b> eVar) {
            this.f22511g = cVar;
            this.f22512h = eVar;
        }

        @Override // rx.c
        public void a(rx.k kVar) {
            b(kVar);
        }

        @Override // rx.i
        public void c(T t) {
            try {
                rx.b call = this.f22512h.call(t);
                if (call == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    call.J(this);
                }
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                onError(th);
            }
        }

        @Override // rx.c
        public void onCompleted() {
            this.f22511g.onCompleted();
        }

        @Override // rx.i
        public void onError(Throwable th) {
            this.f22511g.onError(th);
        }
    }

    public c(Single<T> single, rx.m.e<? super T, ? extends rx.b> eVar) {
        this.f22509f = single;
        this.f22510g = eVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.c cVar) {
        a aVar = new a(cVar, this.f22510g);
        cVar.a(aVar);
        this.f22509f.t(aVar);
    }
}
