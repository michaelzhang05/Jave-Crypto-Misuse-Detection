package rx.n.a;

import rx.e;

/* compiled from: OnSubscribeDelaySubscriptionOther.java */
/* loaded from: classes3.dex */
public final class m<T, U> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.e<? extends T> f22696f;

    /* renamed from: g, reason: collision with root package name */
    final rx.e<U> f22697g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeDelaySubscriptionOther.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<U> {

        /* renamed from: f, reason: collision with root package name */
        boolean f22698f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.j f22699g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.t.d f22700h;

        a(rx.j jVar, rx.t.d dVar) {
            this.f22699g = jVar;
            this.f22700h = dVar;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22698f) {
                return;
            }
            this.f22698f = true;
            this.f22700h.b(rx.t.e.c());
            m.this.f22696f.c1(this.f22699g);
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22698f) {
                rx.q.c.j(th);
            } else {
                this.f22698f = true;
                this.f22699g.onError(th);
            }
        }

        @Override // rx.f
        public void onNext(U u) {
            onCompleted();
        }
    }

    public m(rx.e<? extends T> eVar, rx.e<U> eVar2) {
        this.f22696f = eVar;
        this.f22697g = eVar2;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        rx.t.d dVar = new rx.t.d();
        jVar.add(dVar);
        a aVar = new a(rx.p.f.c(jVar), dVar);
        dVar.b(aVar);
        this.f22697g.c1(aVar);
    }
}
