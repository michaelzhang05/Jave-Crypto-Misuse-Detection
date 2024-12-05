package rx.n.a;

import rx.e;
import rx.exceptions.OnErrorThrowable;

/* compiled from: OnSubscribeMap.java */
/* loaded from: classes3.dex */
public final class w<T, R> implements e.a<R> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<T> f22887f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.e<? super T, ? extends R> f22888g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeMap.java */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super R> f22889f;

        /* renamed from: g, reason: collision with root package name */
        final rx.m.e<? super T, ? extends R> f22890g;

        /* renamed from: h, reason: collision with root package name */
        boolean f22891h;

        public a(rx.j<? super R> jVar, rx.m.e<? super T, ? extends R> eVar) {
            this.f22889f = jVar;
            this.f22890g = eVar;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22891h) {
                return;
            }
            this.f22889f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22891h) {
                rx.q.c.j(th);
            } else {
                this.f22891h = true;
                this.f22889f.onError(th);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            try {
                this.f22889f.onNext(this.f22890g.call(t));
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                unsubscribe();
                onError(OnErrorThrowable.a(th, t));
            }
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22889f.setProducer(gVar);
        }
    }

    public w(rx.e<T> eVar, rx.m.e<? super T, ? extends R> eVar2) {
        this.f22887f = eVar;
        this.f22888g = eVar2;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super R> jVar) {
        a aVar = new a(jVar, this.f22888g);
        jVar.add(aVar);
        this.f22887f.c1(aVar);
    }
}
