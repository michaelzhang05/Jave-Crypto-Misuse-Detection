package androidx.lifecycle;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.M;

/* loaded from: classes3.dex */
public abstract class LifecycleCoroutineScope implements M {
    @Override // l6.M
    public abstract /* synthetic */ S5.g getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final InterfaceC3390x0 launchWhenCreated(InterfaceC1668n block) {
        InterfaceC3390x0 d8;
        AbstractC3255y.i(block, "block");
        d8 = AbstractC3364k.d(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, block, null), 3, null);
        return d8;
    }

    public final InterfaceC3390x0 launchWhenResumed(InterfaceC1668n block) {
        InterfaceC3390x0 d8;
        AbstractC3255y.i(block, "block");
        d8 = AbstractC3364k.d(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, block, null), 3, null);
        return d8;
    }

    public final InterfaceC3390x0 launchWhenStarted(InterfaceC1668n block) {
        InterfaceC3390x0 d8;
        AbstractC3255y.i(block, "block");
        d8 = AbstractC3364k.d(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, block, null), 3, null);
        return d8;
    }
}
