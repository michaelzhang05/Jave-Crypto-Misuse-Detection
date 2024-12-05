package l2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class q implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7376a;

    /* renamed from: b, reason: collision with root package name */
    private final a f7377b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f7378c;

    public q(Executor executor, a aVar, h0 h0Var) {
        this.f7376a = executor;
        this.f7377b = aVar;
        this.f7378c = h0Var;
    }

    @Override // l2.d0
    public final void b(i iVar) {
        this.f7376a.execute(new p(this, iVar));
    }
}
