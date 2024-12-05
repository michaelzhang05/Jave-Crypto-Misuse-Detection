package androidx.lifecycle;

import a6.InterfaceC1668n;
import androidx.lifecycle.Lifecycle;
import l6.AbstractC3360i;
import l6.C3347b0;

/* loaded from: classes3.dex */
public final class PausingDispatcherKt {
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), interfaceC1668n, dVar);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), interfaceC1668n, dVar);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), interfaceC1668n, dVar);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.c().G(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, interfaceC1668n, null), dVar);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, interfaceC1668n, dVar);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, interfaceC1668n, dVar);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, interfaceC1668n, dVar);
    }
}
