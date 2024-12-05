package l2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7395a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7396b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private e f7397c;

    public y(Executor executor, e eVar) {
        this.f7395a = executor;
        this.f7397c = eVar;
    }

    @Override // l2.d0
    public final void b(i iVar) {
        if (iVar.m() || iVar.k()) {
            return;
        }
        synchronized (this.f7396b) {
            if (this.f7397c == null) {
                return;
            }
            this.f7395a.execute(new x(this, iVar));
        }
    }
}
