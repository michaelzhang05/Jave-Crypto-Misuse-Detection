package androidx.compose.animation.core;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SuspendAnimationKt$animateDecay$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ InterfaceC1668n $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animateDecay$2(InterfaceC1668n interfaceC1668n) {
        super(1);
        this.$block = interfaceC1668n;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) obj);
        return I.f8278a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animate) {
        AbstractC3255y.i(animate, "$this$animate");
        this.$block.invoke(animate.getValue(), Float.valueOf(animate.getVelocityVector().getValue()));
    }
}
