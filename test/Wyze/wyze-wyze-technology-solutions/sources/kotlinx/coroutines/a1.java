package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.z0;

/* compiled from: EventLoop.kt */
/* loaded from: classes2.dex */
public abstract class a1 extends y0 {
    protected abstract Thread D0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E0(long j2, z0.b bVar) {
        if (l0.a()) {
            if (!(this != n0.l)) {
                throw new AssertionError();
            }
        }
        n0.l.Q0(j2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F0() {
        Thread D0 = D0();
        if (Thread.currentThread() != D0) {
            if (e.a() != null) {
                throw null;
            }
            LockSupport.unpark(D0);
        }
    }
}
