package l2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class u implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7385a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7386b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private c f7387c;

    public u(Executor executor, c cVar) {
        this.f7385a = executor;
        this.f7387c = cVar;
    }

    @Override // l2.d0
    public final void b(i iVar) {
        if (iVar.k()) {
            synchronized (this.f7386b) {
                if (this.f7387c == null) {
                    return;
                }
                this.f7385a.execute(new t(this));
            }
        }
    }
}
