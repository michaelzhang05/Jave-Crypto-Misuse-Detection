package rx.n.a;

import rx.e;

/* compiled from: OperatorTakeUntilPredicate.java */
/* loaded from: classes3.dex */
public final class d1<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.m.e<? super T, Boolean> f22534f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorTakeUntilPredicate.java */
    /* loaded from: classes3.dex */
    public class a implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f22535f;

        a(b bVar) {
            this.f22535f = bVar;
        }

        @Override // rx.g
        public void request(long j2) {
            this.f22535f.c(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorTakeUntilPredicate.java */
    /* loaded from: classes3.dex */
    public final class b extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private final rx.j<? super T> f22537f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f22538g;

        b(rx.j<? super T> jVar) {
            this.f22537f = jVar;
        }

        void c(long j2) {
            request(j2);
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22538g) {
                return;
            }
            this.f22537f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22538g) {
                return;
            }
            this.f22537f.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22537f.onNext(t);
            try {
                if (d1.this.f22534f.call(t).booleanValue()) {
                    this.f22538g = true;
                    this.f22537f.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.f22538g = true;
                rx.exceptions.a.g(th, this.f22537f, t);
                unsubscribe();
            }
        }
    }

    public d1(rx.m.e<? super T, Boolean> eVar) {
        this.f22534f = eVar;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        b bVar = new b(jVar);
        jVar.add(bVar);
        jVar.setProducer(new a(bVar));
        return bVar;
    }
}
