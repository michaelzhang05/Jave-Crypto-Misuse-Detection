package androidx.compose.material3;

import O5.I;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$settleAppBar$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ P $lastValue;
    final /* synthetic */ P $remainingVelocity;
    final /* synthetic */ TopAppBarState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$settleAppBar$2(P p8, TopAppBarState topAppBarState, P p9) {
        super(1);
        this.$lastValue = p8;
        this.$state = topAppBarState;
        this.$remainingVelocity = p9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) obj);
        return I.f8278a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animateDecay) {
        AbstractC3255y.i(animateDecay, "$this$animateDecay");
        float floatValue = animateDecay.getValue().floatValue() - this.$lastValue.f34159a;
        float heightOffset = this.$state.getHeightOffset();
        this.$state.setHeightOffset(heightOffset + floatValue);
        float abs = Math.abs(heightOffset - this.$state.getHeightOffset());
        this.$lastValue.f34159a = animateDecay.getValue().floatValue();
        this.$remainingVelocity.f34159a = animateDecay.getVelocity().floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animateDecay.cancelAnimation();
        }
    }
}