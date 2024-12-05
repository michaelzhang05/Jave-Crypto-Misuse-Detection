package androidx.lifecycle;

import O5.I;
import a6.InterfaceC1668n;
import androidx.lifecycle.Lifecycle;
import l6.N;

/* loaded from: classes3.dex */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        if (state != Lifecycle.State.INITIALIZED) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                return I.f8278a;
            }
            Object e8 = N.e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, interfaceC1668n, null), dVar);
            return e8 == T5.b.e() ? e8 : I.f8278a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC1668n interfaceC1668n, S5.d dVar) {
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, interfaceC1668n, dVar);
        return repeatOnLifecycle == T5.b.e() ? repeatOnLifecycle : I.f8278a;
    }
}
