package h.a.z.e.a;

import h.a.u;
import h.a.w;

/* compiled from: CompletableFromSingle.java */
/* loaded from: classes2.dex */
public final class c<T> extends h.a.b {
    final w<T> a;

    /* compiled from: CompletableFromSingle.java */
    /* loaded from: classes2.dex */
    static final class a<T> implements u<T> {

        /* renamed from: f, reason: collision with root package name */
        final h.a.d f17994f;

        a(h.a.d dVar) {
            this.f17994f = dVar;
        }

        @Override // h.a.u
        public void b(h.a.x.c cVar) {
            this.f17994f.b(cVar);
        }

        @Override // h.a.u
        public void onError(Throwable th) {
            this.f17994f.onError(th);
        }

        @Override // h.a.u
        public void onSuccess(T t) {
            this.f17994f.a();
        }
    }

    public c(w<T> wVar) {
        this.a = wVar;
    }

    @Override // h.a.b
    protected void e(h.a.d dVar) {
        this.a.b(new a(dVar));
    }
}
