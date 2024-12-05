package rx.n.a;

import rx.e;

/* compiled from: OperatorAny.java */
/* loaded from: classes3.dex */
public final class h0<T> implements e.b<Boolean, T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.m.e<? super T, Boolean> f22609f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f22610g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorAny.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        boolean f22611f;

        /* renamed from: g, reason: collision with root package name */
        boolean f22612g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.n.b.b f22613h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ rx.j f22614i;

        a(rx.n.b.b bVar, rx.j jVar) {
            this.f22613h = bVar;
            this.f22614i = jVar;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22612g) {
                return;
            }
            this.f22612g = true;
            if (this.f22611f) {
                this.f22613h.b(Boolean.FALSE);
            } else {
                this.f22613h.b(Boolean.valueOf(h0.this.f22610g));
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (!this.f22612g) {
                this.f22612g = true;
                this.f22614i.onError(th);
            } else {
                rx.q.c.j(th);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            if (this.f22612g) {
                return;
            }
            this.f22611f = true;
            try {
                if (h0.this.f22609f.call(t).booleanValue()) {
                    this.f22612g = true;
                    this.f22613h.b(Boolean.valueOf(true ^ h0.this.f22610g));
                    unsubscribe();
                }
            } catch (Throwable th) {
                rx.exceptions.a.g(th, this, t);
            }
        }
    }

    public h0(rx.m.e<? super T, Boolean> eVar, boolean z) {
        this.f22609f = eVar;
        this.f22610g = z;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super Boolean> jVar) {
        rx.n.b.b bVar = new rx.n.b.b(jVar);
        a aVar = new a(bVar, jVar);
        jVar.add(aVar);
        jVar.setProducer(bVar);
        return aVar;
    }
}
