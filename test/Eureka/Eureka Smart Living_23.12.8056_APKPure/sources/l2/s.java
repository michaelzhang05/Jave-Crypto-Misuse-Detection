package l2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s implements f, e, c, d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7381a;

    /* renamed from: b, reason: collision with root package name */
    private final a f7382b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f7383c;

    public s(Executor executor, a aVar, h0 h0Var) {
        this.f7381a = executor;
        this.f7382b = aVar;
        this.f7383c = h0Var;
    }

    @Override // l2.c
    public final void a() {
        this.f7383c.q();
    }

    @Override // l2.d0
    public final void b(i iVar) {
        this.f7381a.execute(new r(this, iVar));
    }

    @Override // l2.e
    public final void c(Exception exc) {
        this.f7383c.o(exc);
    }

    @Override // l2.f
    public final void d(Object obj) {
        this.f7383c.p(obj);
    }
}
