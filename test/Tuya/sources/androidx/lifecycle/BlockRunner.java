package androidx.lifecycle;

import androidx.annotation.MainThread;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class BlockRunner<T> {
    private final X5.n block;
    private InterfaceC2855x0 cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final Function0 onDone;
    private InterfaceC2855x0 runningJob;
    private final M scope;
    private final long timeoutInMs;

    public BlockRunner(CoroutineLiveData<T> liveData, X5.n block, long j8, M scope, Function0 onDone) {
        AbstractC3159y.i(liveData, "liveData");
        AbstractC3159y.i(block, "block");
        AbstractC3159y.i(scope, "scope");
        AbstractC3159y.i(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j8;
        this.scope = scope;
        this.onDone = onDone;
    }

    @MainThread
    public final void cancel() {
        InterfaceC2855x0 d8;
        if (this.cancellationJob == null) {
            d8 = AbstractC2829k.d(this.scope, C2812b0.c().G(), null, new BlockRunner$cancel$1(this, null), 2, null);
            this.cancellationJob = d8;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    @MainThread
    public final void maybeRun() {
        InterfaceC2855x0 d8;
        InterfaceC2855x0 interfaceC2855x0 = this.cancellationJob;
        if (interfaceC2855x0 != null) {
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob == null) {
            d8 = AbstractC2829k.d(this.scope, null, null, new BlockRunner$maybeRun$1(this, null), 3, null);
            this.runningJob = d8;
        }
    }
}
