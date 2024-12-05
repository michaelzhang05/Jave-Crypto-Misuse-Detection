package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$3 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $targetOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function1 function1) {
        super(1);
        this.this$0 = animatedContentTransitionScopeImpl;
        this.$targetOffset = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i8) {
        long m150calculateOffsetemnUabE;
        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
        long m5348unboximpl = state != null ? ((IntSize) state.getValue()).m5348unboximpl() : IntSize.Companion.m5349getZeroYbymL2g();
        Function1 function1 = this.$targetOffset;
        m150calculateOffsetemnUabE = this.this$0.m150calculateOffsetemnUabE(IntSizeKt.IntSize(i8, i8), m5348unboximpl);
        return (Integer) function1.invoke(Integer.valueOf((-IntOffset.m5303getYimpl(m150calculateOffsetemnUabE)) - i8));
    }
}
