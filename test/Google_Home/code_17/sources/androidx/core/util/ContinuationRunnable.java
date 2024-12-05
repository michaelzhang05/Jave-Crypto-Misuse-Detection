package androidx.core.util;

import O5.I;
import O5.s;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final S5.d continuation;

    public ContinuationRunnable(S5.d dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            S5.d dVar = this.continuation;
            s.a aVar = s.f8302b;
            dVar.resumeWith(s.b(I.f8278a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
