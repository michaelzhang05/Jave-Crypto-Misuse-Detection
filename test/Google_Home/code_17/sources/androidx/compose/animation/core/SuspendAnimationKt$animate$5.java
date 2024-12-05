package androidx.compose.animation.core;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$5 extends AbstractC3256z implements Function1 {
    public static final SuspendAnimationKt$animate$5 INSTANCE = new SuspendAnimationKt$animate$5();

    SuspendAnimationKt$animate$5() {
        super(1);
    }

    public final void invoke(AnimationScope animationScope) {
        AbstractC3255y.i(animationScope, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope) obj);
        return I.f8278a;
    }
}
