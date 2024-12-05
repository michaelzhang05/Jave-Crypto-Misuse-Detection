package androidx.lifecycle;

import L5.I;
import androidx.lifecycle.Lifecycle;
import i6.N;

/* loaded from: classes3.dex */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, X5.n nVar, P5.d dVar) {
        if (state != Lifecycle.State.INITIALIZED) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                return I.f6487a;
            }
            Object e8 = N.e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, nVar, null), dVar);
            return e8 == Q5.b.e() ? e8 : I.f6487a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, X5.n nVar, P5.d dVar) {
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, nVar, dVar);
        return repeatOnLifecycle == Q5.b.e() ? repeatOnLifecycle : I.f6487a;
    }
}
