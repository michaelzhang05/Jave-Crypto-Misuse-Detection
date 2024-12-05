package androidx.lifecycle;

import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public abstract class LifecycleCoroutineScope implements M {
    @Override // i6.M
    public abstract /* synthetic */ P5.g getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final InterfaceC2855x0 launchWhenCreated(X5.n block) {
        InterfaceC2855x0 d8;
        AbstractC3159y.i(block, "block");
        d8 = AbstractC2829k.d(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, block, null), 3, null);
        return d8;
    }

    public final InterfaceC2855x0 launchWhenResumed(X5.n block) {
        InterfaceC2855x0 d8;
        AbstractC3159y.i(block, "block");
        d8 = AbstractC2829k.d(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, block, null), 3, null);
        return d8;
    }

    public final InterfaceC2855x0 launchWhenStarted(X5.n block) {
        InterfaceC2855x0 d8;
        AbstractC3159y.i(block, "block");
        d8 = AbstractC2829k.d(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, block, null), 3, null);
        return d8;
    }
}
