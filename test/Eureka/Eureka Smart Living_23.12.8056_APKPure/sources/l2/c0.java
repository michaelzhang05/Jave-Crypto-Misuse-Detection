package l2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class c0 implements f, e, c, d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7355a;

    /* renamed from: b, reason: collision with root package name */
    private final h f7356b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f7357c;

    public c0(Executor executor, h hVar, h0 h0Var) {
        this.f7355a = executor;
        this.f7356b = hVar;
        this.f7357c = h0Var;
    }

    @Override // l2.c
    public final void a() {
        this.f7357c.q();
    }

    @Override // l2.d0
    public final void b(i iVar) {
        this.f7355a.execute(new b0(this, iVar));
    }

    @Override // l2.e
    public final void c(Exception exc) {
        this.f7357c.o(exc);
    }

    @Override // l2.f
    public final void d(Object obj) {
        this.f7357c.p(obj);
    }
}
