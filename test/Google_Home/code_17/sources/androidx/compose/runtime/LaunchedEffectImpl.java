package androidx.compose.runtime;

import a6.InterfaceC1668n;
import androidx.compose.runtime.internal.StabilityInferred;
import l6.AbstractC3364k;
import l6.D0;
import l6.InterfaceC3390x0;
import l6.M;
import l6.N;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    public static final int $stable = 8;
    private InterfaceC3390x0 job;
    private final M scope;
    private final InterfaceC1668n task;

    public LaunchedEffectImpl(S5.g gVar, InterfaceC1668n interfaceC1668n) {
        this.task = interfaceC1668n;
        this.scope = N.a(gVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        InterfaceC3390x0 interfaceC3390x0 = this.job;
        if (interfaceC3390x0 != null) {
            interfaceC3390x0.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        InterfaceC3390x0 interfaceC3390x0 = this.job;
        if (interfaceC3390x0 != null) {
            interfaceC3390x0.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        InterfaceC3390x0 d8;
        InterfaceC3390x0 interfaceC3390x0 = this.job;
        if (interfaceC3390x0 != null) {
            D0.f(interfaceC3390x0, "Old job was still running!", null, 2, null);
        }
        d8 = AbstractC3364k.d(this.scope, null, null, this.task, 3, null);
        this.job = d8;
    }
}
