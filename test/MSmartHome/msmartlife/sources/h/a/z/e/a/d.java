package h.a.z.e.a;

import h.a.f;
import h.a.r;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableSubscribeOn.java */
/* loaded from: classes2.dex */
public final class d extends h.a.b {
    final f a;

    /* renamed from: b, reason: collision with root package name */
    final r f17995b;

    /* compiled from: CompletableSubscribeOn.java */
    /* loaded from: classes2.dex */
    static final class a extends AtomicReference<h.a.x.c> implements h.a.d, h.a.x.c, Runnable {

        /* renamed from: f, reason: collision with root package name */
        final h.a.d f17996f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.z.a.f f17997g = new h.a.z.a.f();

        /* renamed from: h, reason: collision with root package name */
        final f f17998h;

        a(h.a.d dVar, f fVar) {
            this.f17996f = dVar;
            this.f17998h = fVar;
        }

        @Override // h.a.d
        public void a() {
            this.f17996f.a();
        }

        @Override // h.a.d
        public void b(h.a.x.c cVar) {
            h.a.z.a.c.C(this, cVar);
        }

        @Override // h.a.x.c
        public void d() {
            h.a.z.a.c.i(this);
            this.f17997g.d();
        }

        @Override // h.a.x.c
        public boolean f() {
            return h.a.z.a.c.n(get());
        }

        @Override // h.a.d
        public void onError(Throwable th) {
            this.f17996f.onError(th);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17998h.b(this);
        }
    }

    public d(f fVar, r rVar) {
        this.a = fVar;
        this.f17995b = rVar;
    }

    @Override // h.a.b
    protected void e(h.a.d dVar) {
        a aVar = new a(dVar, this.a);
        dVar.b(aVar);
        aVar.f17997g.a(this.f17995b.b(aVar));
    }
}
