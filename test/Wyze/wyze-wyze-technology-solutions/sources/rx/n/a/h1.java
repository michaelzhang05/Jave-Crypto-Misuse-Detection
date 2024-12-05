package rx.n.a;

import rx.Single;
import rx.exceptions.CompositeException;

/* compiled from: SingleDoOnEvent.java */
/* loaded from: classes3.dex */
public final class h1<T> implements Single.j<T> {

    /* renamed from: f, reason: collision with root package name */
    final Single<T> f22616f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.b<? super T> f22617g;

    /* renamed from: h, reason: collision with root package name */
    final rx.m.b<Throwable> f22618h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleDoOnEvent.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.i<T> {

        /* renamed from: g, reason: collision with root package name */
        final rx.i<? super T> f22619g;

        /* renamed from: h, reason: collision with root package name */
        final rx.m.b<? super T> f22620h;

        /* renamed from: i, reason: collision with root package name */
        final rx.m.b<Throwable> f22621i;

        a(rx.i<? super T> iVar, rx.m.b<? super T> bVar, rx.m.b<Throwable> bVar2) {
            this.f22619g = iVar;
            this.f22620h = bVar;
            this.f22621i = bVar2;
        }

        @Override // rx.i
        public void c(T t) {
            try {
                this.f22620h.call(t);
                this.f22619g.c(t);
            } catch (Throwable th) {
                rx.exceptions.a.i(th, this, t);
            }
        }

        @Override // rx.i
        public void onError(Throwable th) {
            try {
                this.f22621i.call(th);
                this.f22619g.onError(th);
            } catch (Throwable th2) {
                rx.exceptions.a.e(th2);
                this.f22619g.onError(new CompositeException(th, th2));
            }
        }
    }

    public h1(Single<T> single, rx.m.b<? super T> bVar, rx.m.b<Throwable> bVar2) {
        this.f22616f = single;
        this.f22617g = bVar;
        this.f22618h = bVar2;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.i<? super T> iVar) {
        a aVar = new a(iVar, this.f22617g, this.f22618h);
        iVar.b(aVar);
        this.f22616f.t(aVar);
    }
}
