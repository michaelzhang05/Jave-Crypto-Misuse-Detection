package androidx.lifecycle;

import i6.C2812b0;
import i6.I;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class PausingDispatcher extends I {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // i6.I
    public void dispatch(P5.g context, Runnable block) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // i6.I
    public boolean isDispatchNeeded(P5.g context) {
        AbstractC3159y.i(context, "context");
        if (C2812b0.c().G().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
