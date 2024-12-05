package l2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class a0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7350a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7351b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private f f7352c;

    public a0(Executor executor, f fVar) {
        this.f7350a = executor;
        this.f7352c = fVar;
    }

    @Override // l2.d0
    public final void b(i iVar) {
        if (iVar.m()) {
            synchronized (this.f7351b) {
                if (this.f7352c == null) {
                    return;
                }
                this.f7350a.execute(new z(this, iVar));
            }
        }
    }
}
