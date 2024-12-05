package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S>.SizeModifier this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, AnimatedContentTransitionScopeImpl<S>.SizeModifier sizeModifier) {
        super(1);
        this.this$0 = animatedContentTransitionScopeImpl;
        this.this$1 = sizeModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> animate) {
        FiniteAnimationSpec<IntSize> mo194createAnimationSpecTemP2vQ;
        AbstractC3159y.i(animate, "$this$animate");
        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(animate.getInitialState());
        long m5348unboximpl = state != null ? ((IntSize) state.getValue()).m5348unboximpl() : IntSize.Companion.m5349getZeroYbymL2g();
        State state2 = (State) this.this$0.getTargetSizeMap$animation_release().get(animate.getTargetState());
        long m5348unboximpl2 = state2 != null ? ((IntSize) state2.getValue()).m5348unboximpl() : IntSize.Companion.m5349getZeroYbymL2g();
        SizeTransform value = this.this$1.getSizeTransform().getValue();
        return (value == null || (mo194createAnimationSpecTemP2vQ = value.mo194createAnimationSpecTemP2vQ(m5348unboximpl, m5348unboximpl2)) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : mo194createAnimationSpecTemP2vQ;
    }
}
