package androidx.compose.animation.core;

import L5.I;
import X5.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SuspendAnimationKt$animate$3 extends AbstractC3160z implements Function1 {
    final /* synthetic */ n $block;
    final /* synthetic */ TwoWayConverter<T, V> $typeConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$3(n nVar, TwoWayConverter<T, V> twoWayConverter) {
        super(1);
        this.$block = nVar;
        this.$typeConverter = twoWayConverter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope) obj);
        return I.f6487a;
    }

    public final void invoke(AnimationScope<T, V> animate) {
        AbstractC3159y.i(animate, "$this$animate");
        this.$block.invoke(animate.getValue(), this.$typeConverter.getConvertFromVector().invoke(animate.getVelocityVector()));
    }
}
