package i6;

import i6.AbstractC2826i0;
import java.util.concurrent.locks.LockSupport;

/* renamed from: i6.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2828j0 extends AbstractC2824h0 {
    protected abstract Thread Q();

    /* JADX INFO: Access modifiers changed from: protected */
    public void R(long j8, AbstractC2826i0.c cVar) {
        S.f31729g.b0(j8, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S() {
        Thread Q8 = Q();
        if (Thread.currentThread() != Q8) {
            AbstractC2813c.a();
            LockSupport.unpark(Q8);
        }
    }
}
