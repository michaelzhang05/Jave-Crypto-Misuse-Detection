package l2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class w implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7390a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7391b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private d f7392c;

    public w(Executor executor, d dVar) {
        this.f7390a = executor;
        this.f7392c = dVar;
    }

    @Override // l2.d0
    public final void b(i iVar) {
        synchronized (this.f7391b) {
            if (this.f7392c == null) {
                return;
            }
            this.f7390a.execute(new v(this, iVar));
        }
    }
}
