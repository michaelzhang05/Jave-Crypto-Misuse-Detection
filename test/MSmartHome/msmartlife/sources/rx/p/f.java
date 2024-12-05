package rx.p;

import rx.j;

/* compiled from: Subscribers.java */
/* loaded from: classes3.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Subscribers.java */
    /* loaded from: classes3.dex */
    public static class a<T> extends j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.f f23205f;

        a(rx.f fVar) {
            this.f23205f = fVar;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f23205f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f23205f.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f23205f.onNext(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Subscribers.java */
    /* loaded from: classes3.dex */
    static class b<T> extends j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f23206f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar, j jVar2) {
            super(jVar);
            this.f23206f = jVar2;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f23206f.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f23206f.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f23206f.onNext(t);
        }
    }

    public static <T> j<T> a() {
        return b(rx.p.a.a());
    }

    public static <T> j<T> b(rx.f<? super T> fVar) {
        return new a(fVar);
    }

    public static <T> j<T> c(j<? super T> jVar) {
        return new b(jVar, jVar);
    }
}
