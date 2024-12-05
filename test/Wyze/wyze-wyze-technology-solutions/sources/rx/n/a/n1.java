package rx.n.a;

import rx.Single;

/* compiled from: SingleOnErrorReturn.java */
/* loaded from: classes3.dex */
public final class n1<T> implements Single.j<T> {

    /* renamed from: f, reason: collision with root package name */
    final Single.j<T> f22720f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<Throwable, ? extends T> f22721g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleOnErrorReturn.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.i<T> {

        /* renamed from: g, reason: collision with root package name */
        final rx.i<? super T> f22722g;

        /* renamed from: h, reason: collision with root package name */
        final rx.m.e<Throwable, ? extends T> f22723h;

        public a(rx.i<? super T> iVar, rx.m.e<Throwable, ? extends T> eVar) {
            this.f22722g = iVar;
            this.f22723h = eVar;
        }

        @Override // rx.i
        public void c(T t) {
            this.f22722g.c(t);
        }

        @Override // rx.i
        public void onError(Throwable th) {
            try {
                this.f22722g.c(this.f22723h.call(th));
            } catch (Throwable th2) {
                rx.exceptions.a.e(th2);
                this.f22722g.onError(th2);
            }
        }
    }

    public n1(Single.j<T> jVar, rx.m.e<Throwable, ? extends T> eVar) {
        this.f22720f = jVar;
        this.f22721g = eVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.i<? super T> iVar) {
        a aVar = new a(iVar, this.f22721g);
        iVar.b(aVar);
        this.f22720f.call(aVar);
    }
}
