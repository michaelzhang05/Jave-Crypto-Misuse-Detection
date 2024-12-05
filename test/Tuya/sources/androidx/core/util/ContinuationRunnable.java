package androidx.core.util;

import L5.I;
import L5.s;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final P5.d continuation;

    public ContinuationRunnable(P5.d dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            P5.d dVar = this.continuation;
            s.a aVar = s.f6511b;
            dVar.resumeWith(s.b(I.f6487a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
