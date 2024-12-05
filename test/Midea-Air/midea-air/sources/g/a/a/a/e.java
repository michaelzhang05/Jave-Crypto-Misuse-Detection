package g.a.a.a;

import h.a.s;
import h.a.u;
import rx.Single;
import rx.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingleV1ToSingleV2.java */
/* loaded from: classes2.dex */
public final class e<T> extends s<T> {
    final Single<T> a;

    /* compiled from: SingleV1ToSingleV2.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends i<T> implements h.a.x.c {

        /* renamed from: g, reason: collision with root package name */
        final u<? super T> f17944g;

        a(u<? super T> uVar) {
            this.f17944g = uVar;
        }

        @Override // rx.i
        public void c(T t) {
            if (t == null) {
                this.f17944g.onError(new NullPointerException("The upstream 1.x Single signalled a null value which is not supported in 2.x"));
            } else {
                this.f17944g.onSuccess(t);
            }
        }

        @Override // h.a.x.c
        public void d() {
            unsubscribe();
        }

        @Override // h.a.x.c
        public boolean f() {
            return isUnsubscribed();
        }

        @Override // rx.i
        public void onError(Throwable th) {
            this.f17944g.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Single<T> single) {
        this.a = single;
    }

    @Override // h.a.s
    protected void h(u<? super T> uVar) {
        a aVar = new a(uVar);
        uVar.b(aVar);
        this.a.t(aVar);
    }
}
