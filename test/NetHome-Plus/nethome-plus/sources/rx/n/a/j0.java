package rx.n.a;

import rx.e;
import rx.exceptions.OnErrorThrowable;

/* compiled from: OperatorCast.java */
/* loaded from: classes3.dex */
public class j0<T, R> implements e.b<R, T> {

    /* renamed from: f, reason: collision with root package name */
    final Class<R> f22641f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorCast.java */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super R> f22642f;

        /* renamed from: g, reason: collision with root package name */
        final Class<R> f22643g;

        /* renamed from: h, reason: collision with root package name */
        boolean f22644h;

        public a(rx.j<? super R> jVar, Class<R> cls) {
            this.f22642f = jVar;
            this.f22643g = cls;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22644h) {
                return;
            }
            this.f22642f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22644h) {
                rx.q.c.j(th);
            } else {
                this.f22644h = true;
                this.f22642f.onError(th);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            try {
                this.f22642f.onNext(this.f22643g.cast(t));
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                unsubscribe();
                onError(OnErrorThrowable.a(th, t));
            }
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22642f.setProducer(gVar);
        }
    }

    public j0(Class<R> cls) {
        this.f22641f = cls;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super R> jVar) {
        a aVar = new a(jVar, this.f22641f);
        jVar.add(aVar);
        return aVar;
    }
}
