package androidx.compose.animation;

import X5.o;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$scale$2 extends AbstractC3160z implements o {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$scale$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(3);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment<EnterExitState>) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> animateFloat, Composer composer, int i8) {
        FiniteAnimationSpec<Float> finiteAnimationSpec;
        AbstractC3159y.i(animateFloat, "$this$animateFloat");
        composer.startReplaceableGroup(-53984035);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53984035, i8, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:883)");
        }
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (animateFloat.isTransitioningTo(enterExitState, enterExitState2)) {
            Scale scale = this.$enter.getData$animation_release().getScale();
            if (scale == null || (finiteAnimationSpec = scale.getAnimationSpec()) == null) {
                finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            }
        } else if (!animateFloat.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
        } else {
            Scale scale2 = this.$exit.getData$animation_release().getScale();
            if (scale2 == null || (finiteAnimationSpec = scale2.getAnimationSpec()) == null) {
                finiteAnimationSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return finiteAnimationSpec;
    }
}
