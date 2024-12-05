package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import i6.AbstractC2825i;
import i6.C2812b0;

/* loaded from: classes3.dex */
public final class PausingDispatcherKt {
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, X5.n nVar, P5.d dVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), nVar, dVar);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, X5.n nVar, P5.d dVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), nVar, dVar);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, X5.n nVar, P5.d dVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), nVar, dVar);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, X5.n nVar, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.c().G(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, nVar, null), dVar);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, X5.n nVar, P5.d dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, nVar, dVar);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, X5.n nVar, P5.d dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, nVar, dVar);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, X5.n nVar, P5.d dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, nVar, dVar);
    }
}
