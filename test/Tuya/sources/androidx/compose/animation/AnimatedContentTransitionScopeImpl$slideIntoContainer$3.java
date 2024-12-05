package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$slideIntoContainer$3 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $initialOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$slideIntoContainer$3(Function1 function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        super(1);
        this.$initialOffset = function1;
        this.this$0 = animatedContentTransitionScopeImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i8) {
        long m151getCurrentSizeYbymL2g;
        long m151getCurrentSizeYbymL2g2;
        long m150calculateOffsetemnUabE;
        Function1 function1 = this.$initialOffset;
        m151getCurrentSizeYbymL2g = this.this$0.m151getCurrentSizeYbymL2g();
        int m5343getHeightimpl = IntSize.m5343getHeightimpl(m151getCurrentSizeYbymL2g);
        AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.this$0;
        long IntSize = IntSizeKt.IntSize(i8, i8);
        m151getCurrentSizeYbymL2g2 = this.this$0.m151getCurrentSizeYbymL2g();
        m150calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m150calculateOffsetemnUabE(IntSize, m151getCurrentSizeYbymL2g2);
        return (Integer) function1.invoke(Integer.valueOf(m5343getHeightimpl - IntOffset.m5303getYimpl(m150calculateOffsetemnUabE)));
    }
}
