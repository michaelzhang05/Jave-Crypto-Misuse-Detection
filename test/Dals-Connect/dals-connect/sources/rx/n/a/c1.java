package rx.n.a;

import rx.e;

/* compiled from: OperatorTakeUntil.java */
/* loaded from: classes3.dex */
public final class c1<T, E> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    private final rx.e<? extends E> f22523f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorTakeUntil.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.j f22524f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rx.j jVar, boolean z, rx.j jVar2) {
            super(jVar, z);
            this.f22524f = jVar2;
        }

        @Override // rx.f
        public void onCompleted() {
            try {
                this.f22524f.onCompleted();
            } finally {
                this.f22524f.unsubscribe();
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            try {
                this.f22524f.onError(th);
            } finally {
                this.f22524f.unsubscribe();
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f22524f.onNext(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorTakeUntil.java */
    /* loaded from: classes3.dex */
    public class b extends rx.j<E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.j f22526f;

        b(rx.j jVar) {
            this.f22526f = jVar;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22526f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22526f.onError(th);
        }

        @Override // rx.f
        public void onNext(E e2) {
            onCompleted();
        }

        @Override // rx.j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public c1(rx.e<? extends E> eVar) {
        this.f22523f = eVar;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        rx.p.e eVar = new rx.p.e(jVar, false);
        a aVar = new a(eVar, false, eVar);
        b bVar = new b(aVar);
        eVar.add(aVar);
        eVar.add(bVar);
        jVar.add(eVar);
        this.f22523f.c1(bVar);
        return aVar;
    }
}
