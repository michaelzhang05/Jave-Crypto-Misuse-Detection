package rx.n.a;

import java.util.NoSuchElementException;
import rx.Single;
import rx.e;

/* compiled from: SingleFromObservable.java */
/* loaded from: classes3.dex */
public final class k1<T> implements Single.j<T> {

    /* renamed from: f, reason: collision with root package name */
    final e.a<T> f22678f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleFromObservable.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.i<? super T> f22679f;

        /* renamed from: g, reason: collision with root package name */
        T f22680g;

        /* renamed from: h, reason: collision with root package name */
        int f22681h;

        a(rx.i<? super T> iVar) {
            this.f22679f = iVar;
        }

        @Override // rx.f
        public void onCompleted() {
            int i2 = this.f22681h;
            if (i2 == 0) {
                this.f22679f.onError(new NoSuchElementException());
            } else if (i2 == 1) {
                this.f22681h = 2;
                T t = this.f22680g;
                this.f22680g = null;
                this.f22679f.c(t);
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22681h == 2) {
                rx.q.c.j(th);
            } else {
                this.f22680g = null;
                this.f22679f.onError(th);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            int i2 = this.f22681h;
            if (i2 == 0) {
                this.f22681h = 1;
                this.f22680g = t;
            } else if (i2 == 1) {
                this.f22681h = 2;
                this.f22679f.onError(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public k1(e.a<T> aVar) {
        this.f22678f = aVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.i<? super T> iVar) {
        a aVar = new a(iVar);
        iVar.b(aVar);
        this.f22678f.call(aVar);
    }
}
