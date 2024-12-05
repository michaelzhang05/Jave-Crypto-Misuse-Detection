package androidx.lifecycle;

import a6.InterfaceC1668n;
import androidx.annotation.MainThread;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.M;

/* loaded from: classes3.dex */
public final class BlockRunner<T> {
    private final InterfaceC1668n block;
    private InterfaceC3390x0 cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final Function0 onDone;
    private InterfaceC3390x0 runningJob;
    private final M scope;
    private final long timeoutInMs;

    public BlockRunner(CoroutineLiveData<T> liveData, InterfaceC1668n block, long j8, M scope, Function0 onDone) {
        AbstractC3255y.i(liveData, "liveData");
        AbstractC3255y.i(block, "block");
        AbstractC3255y.i(scope, "scope");
        AbstractC3255y.i(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j8;
        this.scope = scope;
        this.onDone = onDone;
    }

    @MainThread
    public final void cancel() {
        InterfaceC3390x0 d8;
        if (this.cancellationJob == null) {
            d8 = AbstractC3364k.d(this.scope, C3347b0.c().G(), null, new BlockRunner$cancel$1(this, null), 2, null);
            this.cancellationJob = d8;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    @MainThread
    public final void maybeRun() {
        InterfaceC3390x0 d8;
        InterfaceC3390x0 interfaceC3390x0 = this.cancellationJob;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob == null) {
            d8 = AbstractC3364k.d(this.scope, null, null, new BlockRunner$maybeRun$1(this, null), 3, null);
            this.runningJob = d8;
        }
    }
}
