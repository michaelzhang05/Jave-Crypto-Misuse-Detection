package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import l6.I;

/* loaded from: classes3.dex */
public final class PausingDispatcher extends I {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // l6.I
    public void dispatch(S5.g context, Runnable block) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // l6.I
    public boolean isDispatchNeeded(S5.g context) {
        AbstractC3255y.i(context, "context");
        if (C3347b0.c().G().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
