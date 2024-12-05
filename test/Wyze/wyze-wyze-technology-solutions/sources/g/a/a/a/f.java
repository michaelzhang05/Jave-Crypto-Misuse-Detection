package g.a.a.a;

import h.a.u;
import h.a.w;
import java.util.concurrent.atomic.AtomicReference;
import rx.Single;
import rx.i;
import rx.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingleV2ToSingleV1.java */
/* loaded from: classes2.dex */
public final class f<T> implements Single.j<T> {

    /* renamed from: f, reason: collision with root package name */
    final w<T> f17945f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleV2ToSingleV1.java */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<h.a.x.c> implements u<T>, k {

        /* renamed from: f, reason: collision with root package name */
        final i<? super T> f17946f;

        a(i<? super T> iVar) {
            this.f17946f = iVar;
        }

        @Override // h.a.u
        public void b(h.a.x.c cVar) {
            h.a.z.a.c.C(this, cVar);
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return h.a.z.a.c.n(get());
        }

        @Override // h.a.u
        public void onError(Throwable th) {
            this.f17946f.onError(th);
        }

        @Override // h.a.u
        public void onSuccess(T t) {
            this.f17946f.c(t);
        }

        @Override // rx.k
        public void unsubscribe() {
            h.a.z.a.c.i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(w<T> wVar) {
        this.f17945f = wVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(i<? super T> iVar) {
        a aVar = new a(iVar);
        iVar.b(aVar);
        this.f17945f.b(aVar);
    }
}
