package androidx.compose.foundation.gestures.snapping;

import L5.I;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateDecay$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $onAnimationStep;
    final /* synthetic */ P $previousValue;
    final /* synthetic */ float $targetOffset;
    final /* synthetic */ ScrollScope $this_animateDecay;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehaviorKt$animateDecay$2(float f8, P p8, ScrollScope scrollScope, Function1 function1) {
        super(1);
        this.$targetOffset = f8;
        this.$previousValue = p8;
        this.$this_animateDecay = scrollScope;
        this.$onAnimationStep = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) obj);
        return I.f6487a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animateDecay) {
        float coerceToTarget;
        AbstractC3159y.i(animateDecay, "$this$animateDecay");
        if (Math.abs(animateDecay.getValue().floatValue()) >= Math.abs(this.$targetOffset)) {
            coerceToTarget = SnapFlingBehaviorKt.coerceToTarget(animateDecay.getValue().floatValue(), this.$targetOffset);
            SnapFlingBehaviorKt.animateDecay$consumeDelta(animateDecay, this.$this_animateDecay, this.$onAnimationStep, coerceToTarget - this.$previousValue.f33758a);
            animateDecay.cancelAnimation();
            this.$previousValue.f33758a = coerceToTarget;
            return;
        }
        SnapFlingBehaviorKt.animateDecay$consumeDelta(animateDecay, this.$this_animateDecay, this.$onAnimationStep, animateDecay.getValue().floatValue() - this.$previousValue.f33758a);
        this.$previousValue.f33758a = animateDecay.getValue().floatValue();
    }
}
