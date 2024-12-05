package rx.n.a;

import java.util.Arrays;
import rx.e;
import rx.exceptions.CompositeException;

/* compiled from: OnSubscribeDoOnEach.java */
/* loaded from: classes3.dex */
public class n<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    private final rx.f<? super T> f22714f;

    /* renamed from: g, reason: collision with root package name */
    private final rx.e<T> f22715g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OnSubscribeDoOnEach.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private final rx.j<? super T> f22716f;

        /* renamed from: g, reason: collision with root package name */
        private final rx.f<? super T> f22717g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f22718h;

        a(rx.j<? super T> jVar, rx.f<? super T> fVar) {
            super(jVar);
            this.f22716f = jVar;
            this.f22717g = fVar;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22718h) {
                return;
            }
            try {
                this.f22717g.onCompleted();
                this.f22718h = true;
                this.f22716f.onCompleted();
            } catch (Throwable th) {
                rx.exceptions.a.f(th, this);
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22718h) {
                rx.q.c.j(th);
                return;
            }
            this.f22718h = true;
            try {
                this.f22717g.onError(th);
                this.f22716f.onError(th);
            } catch (Throwable th2) {
                rx.exceptions.a.e(th2);
                this.f22716f.onError(new CompositeException(Arrays.asList(th, th2)));
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            if (this.f22718h) {
                return;
            }
            try {
                this.f22717g.onNext(t);
                this.f22716f.onNext(t);
            } catch (Throwable th) {
                rx.exceptions.a.g(th, this, t);
            }
        }
    }

    public n(rx.e<T> eVar, rx.f<? super T> fVar) {
        this.f22715g = eVar;
        this.f22714f = fVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        this.f22715g.c1(new a(jVar, this.f22714f));
    }
}
