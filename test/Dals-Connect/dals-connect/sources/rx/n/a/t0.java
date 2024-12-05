package rx.n.a;

import rx.e;

/* compiled from: OperatorOnErrorResumeNextViaFunction.java */
/* loaded from: classes3.dex */
public final class t0<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.m.e<? super Throwable, ? extends rx.e<? extends T>> f22853f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
    /* loaded from: classes3.dex */
    public static class a implements rx.m.e<Throwable, rx.e<? extends T>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.e f22854f;

        a(rx.m.e eVar) {
            this.f22854f = eVar;
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.e<? extends T> call(Throwable th) {
            return rx.e.S(this.f22854f.call(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
    /* loaded from: classes3.dex */
    public static class b implements rx.m.e<Throwable, rx.e<? extends T>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.e f22855f;

        b(rx.e eVar) {
            this.f22855f = eVar;
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.e<? extends T> call(Throwable th) {
            return this.f22855f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
    /* loaded from: classes3.dex */
    public class c extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private boolean f22856f;

        /* renamed from: g, reason: collision with root package name */
        long f22857g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.j f22858h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ rx.n.b.a f22859i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ rx.t.d f22860j;

        /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
        /* loaded from: classes3.dex */
        class a extends rx.j<T> {
            a() {
            }

            @Override // rx.f
            public void onCompleted() {
                c.this.f22858h.onCompleted();
            }

            @Override // rx.f
            public void onError(Throwable th) {
                c.this.f22858h.onError(th);
            }

            @Override // rx.f
            public void onNext(T t) {
                c.this.f22858h.onNext(t);
            }

            @Override // rx.j
            public void setProducer(rx.g gVar) {
                c.this.f22859i.c(gVar);
            }
        }

        c(rx.j jVar, rx.n.b.a aVar, rx.t.d dVar) {
            this.f22858h = jVar;
            this.f22859i = aVar;
            this.f22860j = dVar;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22856f) {
                return;
            }
            this.f22856f = true;
            this.f22858h.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22856f) {
                rx.exceptions.a.e(th);
                rx.q.c.j(th);
                return;
            }
            this.f22856f = true;
            try {
                unsubscribe();
                a aVar = new a();
                this.f22860j.b(aVar);
                long j2 = this.f22857g;
                if (j2 != 0) {
                    this.f22859i.b(j2);
                }
                t0.this.f22853f.call(th).c1(aVar);
            } catch (Throwable th2) {
                rx.exceptions.a.f(th2, this.f22858h);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            if (this.f22856f) {
                return;
            }
            this.f22857g++;
            this.f22858h.onNext(t);
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22859i.c(gVar);
        }
    }

    public t0(rx.m.e<? super Throwable, ? extends rx.e<? extends T>> eVar) {
        this.f22853f = eVar;
    }

    public static <T> t0<T> b(rx.e<? extends T> eVar) {
        return new t0<>(new b(eVar));
    }

    public static <T> t0<T> c(rx.m.e<? super Throwable, ? extends T> eVar) {
        return new t0<>(new a(eVar));
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        rx.n.b.a aVar = new rx.n.b.a();
        rx.t.d dVar = new rx.t.d();
        c cVar = new c(jVar, aVar, dVar);
        dVar.b(cVar);
        jVar.add(dVar);
        jVar.setProducer(aVar);
        return cVar;
    }
}
