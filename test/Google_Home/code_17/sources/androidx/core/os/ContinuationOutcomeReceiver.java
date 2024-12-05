package androidx.core.os;

import O5.s;
import O5.t;
import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(31)
/* loaded from: classes3.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final S5.d continuation;

    public ContinuationOutcomeReceiver(S5.d dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e8) {
        if (compareAndSet(false, true)) {
            S5.d dVar = this.continuation;
            s.a aVar = s.f8302b;
            dVar.resumeWith(s.b(t.a(e8)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r8) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(s.b(r8));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
