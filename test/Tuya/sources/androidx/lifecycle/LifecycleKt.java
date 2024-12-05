package androidx.lifecycle;

import i6.C2812b0;
import i6.U0;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;

/* loaded from: classes3.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        AbstractC3159y.i(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, U0.b(null, 1, null).plus(C2812b0.c().G()));
        } while (!androidx.compose.animation.core.d.a(lifecycle.getInternalScopeRef(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final InterfaceC3358f getEventFlow(Lifecycle lifecycle) {
        AbstractC3159y.i(lifecycle, "<this>");
        return AbstractC3360h.A(AbstractC3360h.e(new LifecycleKt$eventFlow$1(lifecycle, null)), C2812b0.c().G());
    }
}
