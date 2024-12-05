package g.a.a.a;

import rx.k;

/* compiled from: CompletableV1ToCompletableV2.java */
/* loaded from: classes2.dex */
final class a extends h.a.b {
    final rx.b a;

    /* compiled from: CompletableV1ToCompletableV2.java */
    /* renamed from: g.a.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0248a implements rx.c, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.d f17936f;

        /* renamed from: g, reason: collision with root package name */
        k f17937g;

        C0248a(h.a.d dVar) {
            this.f17936f = dVar;
        }

        @Override // rx.c
        public void a(k kVar) {
            this.f17937g = kVar;
            this.f17936f.b(this);
        }

        @Override // h.a.x.c
        public void d() {
            this.f17937g.unsubscribe();
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f17937g.isUnsubscribed();
        }

        @Override // rx.c
        public void onCompleted() {
            this.f17936f.a();
        }

        @Override // rx.c
        public void onError(Throwable th) {
            this.f17936f.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(rx.b bVar) {
        this.a = bVar;
    }

    @Override // h.a.b
    protected void e(h.a.d dVar) {
        this.a.J(new C0248a(dVar));
    }
}
