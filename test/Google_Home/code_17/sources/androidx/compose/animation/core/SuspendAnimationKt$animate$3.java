package androidx.compose.animation.core;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SuspendAnimationKt$animate$3 extends AbstractC3256z implements Function1 {
    final /* synthetic */ InterfaceC1668n $block;
    final /* synthetic */ TwoWayConverter<T, V> $typeConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$3(InterfaceC1668n interfaceC1668n, TwoWayConverter<T, V> twoWayConverter) {
        super(1);
        this.$block = interfaceC1668n;
        this.$typeConverter = twoWayConverter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope) obj);
        return I.f8278a;
    }

    public final void invoke(AnimationScope<T, V> animate) {
        AbstractC3255y.i(animate, "$this$animate");
        this.$block.invoke(animate.getValue(), this.$typeConverter.getConvertFromVector().invoke(animate.getVelocityVector()));
    }
}
