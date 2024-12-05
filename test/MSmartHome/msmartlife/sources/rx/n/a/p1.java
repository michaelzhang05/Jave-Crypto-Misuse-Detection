package rx.n.a;

import rx.Single;
import rx.exceptions.OnErrorThrowable;

/* compiled from: SingleOnSubscribeMap.java */
/* loaded from: classes3.dex */
public final class p1<T, R> implements Single.j<R> {

    /* renamed from: f, reason: collision with root package name */
    final Single<T> f22764f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<? super T, ? extends R> f22765g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleOnSubscribeMap.java */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends rx.i<T> {

        /* renamed from: g, reason: collision with root package name */
        final rx.i<? super R> f22766g;

        /* renamed from: h, reason: collision with root package name */
        final rx.m.e<? super T, ? extends R> f22767h;

        /* renamed from: i, reason: collision with root package name */
        boolean f22768i;

        public a(rx.i<? super R> iVar, rx.m.e<? super T, ? extends R> eVar) {
            this.f22766g = iVar;
            this.f22767h = eVar;
        }

        @Override // rx.i
        public void c(T t) {
            try {
                this.f22766g.c(this.f22767h.call(t));
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                unsubscribe();
                onError(OnErrorThrowable.a(th, t));
            }
        }

        @Override // rx.i
        public void onError(Throwable th) {
            if (this.f22768i) {
                rx.q.c.j(th);
            } else {
                this.f22768i = true;
                this.f22766g.onError(th);
            }
        }
    }

    public p1(Single<T> single, rx.m.e<? super T, ? extends R> eVar) {
        this.f22764f = single;
        this.f22765g = eVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.i<? super R> iVar) {
        a aVar = new a(iVar, this.f22765g);
        iVar.b(aVar);
        this.f22764f.t(aVar);
    }
}
