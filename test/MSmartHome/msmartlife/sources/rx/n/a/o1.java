package rx.n.a;

import rx.Single;

/* compiled from: SingleOnSubscribeDelaySubscriptionOther.java */
/* loaded from: classes3.dex */
public final class o1<T> implements Single.j<T> {

    /* renamed from: f, reason: collision with root package name */
    final Single<? extends T> f22730f;

    /* renamed from: g, reason: collision with root package name */
    final rx.e<?> f22731g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleOnSubscribeDelaySubscriptionOther.java */
    /* loaded from: classes3.dex */
    public class a extends rx.i<T> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.i f22732g;

        a(rx.i iVar) {
            this.f22732g = iVar;
        }

        @Override // rx.i
        public void c(T t) {
            this.f22732g.c(t);
        }

        @Override // rx.i
        public void onError(Throwable th) {
            this.f22732g.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleOnSubscribeDelaySubscriptionOther.java */
    /* loaded from: classes3.dex */
    public class b extends rx.j<Object> {

        /* renamed from: f, reason: collision with root package name */
        boolean f22734f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.i f22735g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.t.d f22736h;

        b(rx.i iVar, rx.t.d dVar) {
            this.f22735g = iVar;
            this.f22736h = dVar;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22734f) {
                return;
            }
            this.f22734f = true;
            this.f22736h.b(this.f22735g);
            o1.this.f22730f.t(this.f22735g);
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22734f) {
                rx.q.c.j(th);
            } else {
                this.f22734f = true;
                this.f22735g.onError(th);
            }
        }

        @Override // rx.f
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public o1(Single<? extends T> single, rx.e<?> eVar) {
        this.f22730f = single;
        this.f22731g = eVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.i<? super T> iVar) {
        a aVar = new a(iVar);
        rx.t.d dVar = new rx.t.d();
        iVar.b(dVar);
        b bVar = new b(aVar, dVar);
        dVar.b(bVar);
        this.f22731g.E0(bVar);
    }
}
