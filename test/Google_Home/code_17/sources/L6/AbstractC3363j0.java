package l6;

import java.util.concurrent.locks.LockSupport;
import l6.AbstractC3361i0;

/* renamed from: l6.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3363j0 extends AbstractC3359h0 {
    protected abstract Thread Q();

    /* JADX INFO: Access modifiers changed from: protected */
    public void R(long j8, AbstractC3361i0.c cVar) {
        S.f34581g.b0(j8, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S() {
        Thread Q8 = Q();
        if (Thread.currentThread() != Q8) {
            AbstractC3348c.a();
            LockSupport.unpark(Q8);
        }
    }
}
