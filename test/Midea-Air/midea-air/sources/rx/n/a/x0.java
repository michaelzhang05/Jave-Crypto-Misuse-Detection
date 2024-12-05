package rx.n.a;

import rx.e;

/* compiled from: OperatorSkip.java */
/* loaded from: classes3.dex */
public final class x0<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    final int f22905f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorSkip.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        int f22906f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.j f22907g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rx.j jVar, rx.j jVar2) {
            super(jVar);
            this.f22907g = jVar2;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22907g.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22907g.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            int i2 = this.f22906f;
            if (i2 >= x0.this.f22905f) {
                this.f22907g.onNext(t);
            } else {
                this.f22906f = i2 + 1;
            }
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22907g.setProducer(gVar);
            gVar.request(x0.this.f22905f);
        }
    }

    public x0(int i2) {
        if (i2 >= 0) {
            this.f22905f = i2;
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + i2);
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        return new a(jVar, jVar);
    }
}
