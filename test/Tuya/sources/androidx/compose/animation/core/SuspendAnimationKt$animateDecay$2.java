package androidx.compose.animation.core;

import L5.I;
import X5.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SuspendAnimationKt$animateDecay$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ n $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animateDecay$2(n nVar) {
        super(1);
        this.$block = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) obj);
        return I.f6487a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animate) {
        AbstractC3159y.i(animate, "$this$animate");
        this.$block.invoke(animate.getValue(), Float.valueOf(animate.getVelocityVector().getValue()));
    }
}
