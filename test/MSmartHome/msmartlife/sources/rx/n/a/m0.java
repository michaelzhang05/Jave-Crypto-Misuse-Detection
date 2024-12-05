package rx.n.a;

import rx.e;

/* compiled from: OperatorDistinctUntilChanged.java */
/* loaded from: classes3.dex */
public final class m0<T, U> implements e.b<T, T>, rx.m.f<U, U, Boolean> {

    /* renamed from: f, reason: collision with root package name */
    final rx.m.e<? super T, ? extends U> f22702f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.f<? super U, ? super U, Boolean> f22703g = this;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorDistinctUntilChanged.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        U f22704f;

        /* renamed from: g, reason: collision with root package name */
        boolean f22705g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.j f22706h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rx.j jVar, rx.j jVar2) {
            super(jVar);
            this.f22706h = jVar2;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f22706h.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22706h.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            try {
                U call = m0.this.f22702f.call(t);
                U u = this.f22704f;
                this.f22704f = call;
                if (this.f22705g) {
                    try {
                        if (!m0.this.f22703g.a(u, call).booleanValue()) {
                            this.f22706h.onNext(t);
                            return;
                        } else {
                            request(1L);
                            return;
                        }
                    } catch (Throwable th) {
                        rx.exceptions.a.g(th, this.f22706h, call);
                        return;
                    }
                }
                this.f22705g = true;
                this.f22706h.onNext(t);
            } catch (Throwable th2) {
                rx.exceptions.a.g(th2, this.f22706h, t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorDistinctUntilChanged.java */
    /* loaded from: classes3.dex */
    public static final class b {
        static final m0<?, ?> a = new m0<>(rx.n.e.m.b());
    }

    public m0(rx.m.e<? super T, ? extends U> eVar) {
        this.f22702f = eVar;
    }

    public static <T> m0<T, T> d() {
        return (m0<T, T>) b.a;
    }

    @Override // rx.m.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean a(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    @Override // rx.m.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        return new a(jVar, jVar);
    }
}
