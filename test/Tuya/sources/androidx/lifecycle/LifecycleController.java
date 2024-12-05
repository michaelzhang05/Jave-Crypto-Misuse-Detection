package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import i6.InterfaceC2855x0;
import kotlin.jvm.internal.AbstractC3159y;

@MainThread
/* loaded from: classes3.dex */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State minState, DispatchQueue dispatchQueue, final InterfaceC2855x0 parentJob) {
        AbstractC3159y.i(lifecycle, "lifecycle");
        AbstractC3159y.i(minState, "minState");
        AbstractC3159y.i(dispatchQueue, "dispatchQueue");
        AbstractC3159y.i(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.h
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(LifecycleController.this, parentJob, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            InterfaceC2855x0.a.a(parentJob, null, 1, null);
            finish();
        } else {
            lifecycle.addObserver(lifecycleEventObserver);
        }
    }

    private final void handleDestroy(InterfaceC2855x0 interfaceC2855x0) {
        InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController this$0, InterfaceC2855x0 parentJob, LifecycleOwner source, Lifecycle.Event event) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(parentJob, "$parentJob");
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(event, "<anonymous parameter 1>");
        if (source.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            InterfaceC2855x0.a.a(parentJob, null, 1, null);
            this$0.finish();
        } else if (source.getLifecycle().getCurrentState().compareTo(this$0.minState) < 0) {
            this$0.dispatchQueue.pause();
        } else {
            this$0.dispatchQueue.resume();
        }
    }

    @MainThread
    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
