package h.a.z.e.e;

import h.a.m;
import h.a.q;
import h.a.u;
import h.a.w;

/* compiled from: SingleToObservable.java */
/* loaded from: classes2.dex */
public final class f<T> extends m<T> {

    /* renamed from: f, reason: collision with root package name */
    final w<? extends T> f18148f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleToObservable.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends h.a.z.d.c<T> implements u<T> {

        /* renamed from: h, reason: collision with root package name */
        h.a.x.c f18149h;

        a(q<? super T> qVar) {
            super(qVar);
        }

        @Override // h.a.u
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18149h, cVar)) {
                this.f18149h = cVar;
                this.f17991f.b(this);
            }
        }

        @Override // h.a.z.d.c, h.a.x.c
        public void d() {
            super.d();
            this.f18149h.d();
        }

        @Override // h.a.u
        public void onError(Throwable th) {
            e(th);
        }

        @Override // h.a.u
        public void onSuccess(T t) {
            c(t);
        }
    }

    public f(w<? extends T> wVar) {
        this.f18148f = wVar;
    }

    public static <T> u<T> E(q<? super T> qVar) {
        return new a(qVar);
    }

    @Override // h.a.m
    public void x(q<? super T> qVar) {
        this.f18148f.b(E(qVar));
    }
}
