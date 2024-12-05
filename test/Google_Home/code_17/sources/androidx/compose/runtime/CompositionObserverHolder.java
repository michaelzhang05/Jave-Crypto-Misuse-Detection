package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserver;
import kotlin.jvm.internal.AbstractC3247p;

@StabilityInferred(parameters = 0)
@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public final class CompositionObserverHolder {
    public static final int $stable = 8;
    private CompositionObserver observer;
    private boolean root;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionObserverHolder() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final CompositionObserver getObserver() {
        return this.observer;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setObserver(CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public final void setRoot(boolean z8) {
        this.root = z8;
    }

    public CompositionObserverHolder(CompositionObserver compositionObserver, boolean z8) {
        this.observer = compositionObserver;
        this.root = z8;
    }

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : compositionObserver, (i8 & 2) != 0 ? false : z8);
    }
}
