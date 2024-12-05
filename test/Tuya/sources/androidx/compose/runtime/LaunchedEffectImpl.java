package androidx.compose.runtime;

import X5.n;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.AbstractC2829k;
import i6.D0;
import i6.InterfaceC2855x0;
import i6.M;
import i6.N;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    public static final int $stable = 8;
    private InterfaceC2855x0 job;
    private final M scope;
    private final n task;

    public LaunchedEffectImpl(P5.g gVar, n nVar) {
        this.task = nVar;
        this.scope = N.a(gVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        InterfaceC2855x0 interfaceC2855x0 = this.job;
        if (interfaceC2855x0 != null) {
            interfaceC2855x0.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        InterfaceC2855x0 interfaceC2855x0 = this.job;
        if (interfaceC2855x0 != null) {
            interfaceC2855x0.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        InterfaceC2855x0 d8;
        InterfaceC2855x0 interfaceC2855x0 = this.job;
        if (interfaceC2855x0 != null) {
            D0.f(interfaceC2855x0, "Old job was still running!", null, 2, null);
        }
        d8 = AbstractC2829k.d(this.scope, null, null, this.task, 3, null);
        this.job = d8;
    }
}
