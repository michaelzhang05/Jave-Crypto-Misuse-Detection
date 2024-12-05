package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.D0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final P5.g coroutineContext;
    private final Lifecycle lifecycle;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, P5.g coroutineContext) {
        AbstractC3159y.i(lifecycle, "lifecycle");
        AbstractC3159y.i(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() == Lifecycle.State.DESTROYED) {
            D0.e(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, i6.M
    public P5.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            D0.e(getCoroutineContext(), null, 1, null);
        }
    }

    public final void register() {
        AbstractC2829k.d(this, C2812b0.c().G(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2, null);
    }
}
