package androidx.compose.material;

import L5.I;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import d6.InterfaceC2561e;
import d6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$Slider$3$draggableState$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ P $maxPx;
    final /* synthetic */ P $minPx;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableFloatState $pressOffset;
    final /* synthetic */ MutableFloatState $rawOffset;
    final /* synthetic */ InterfaceC2561e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3$draggableState$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, P p8, P p9, State<? extends Function1> state, InterfaceC2561e interfaceC2561e) {
        super(1);
        this.$rawOffset = mutableFloatState;
        this.$pressOffset = mutableFloatState2;
        this.$minPx = p8;
        this.$maxPx = p9;
        this.$onValueChangeState = state;
        this.$valueRange = interfaceC2561e;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f6487a;
    }

    public final void invoke(float f8) {
        float invoke$scaleToUserValue;
        MutableFloatState mutableFloatState = this.$rawOffset;
        mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f8 + this.$pressOffset.getFloatValue());
        this.$pressOffset.setFloatValue(0.0f);
        float j8 = m.j(this.$rawOffset.getFloatValue(), this.$minPx.f33758a, this.$maxPx.f33758a);
        Function1 value = this.$onValueChangeState.getValue();
        invoke$scaleToUserValue = SliderKt$Slider$3.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, j8);
        value.invoke(Float.valueOf(invoke$scaleToUserValue));
    }
}
