package androidx.core.util;

import O5.s;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    private final S5.d continuation;

    public AndroidXContinuationConsumer(S5.d dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // androidx.core.util.Consumer
    public void accept(T t8) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(s.b(t8));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
