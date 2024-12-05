package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import g6.InterfaceC2885e;
import g6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$onDrag$1$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ P $maxPx;
    final /* synthetic */ P $minPx;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableFloatState $rawOffsetEnd;
    final /* synthetic */ MutableFloatState $rawOffsetStart;
    final /* synthetic */ InterfaceC2885e $value;
    final /* synthetic */ InterfaceC2885e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$onDrag$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, InterfaceC2885e interfaceC2885e, P p8, P p9, State<? extends Function1> state, InterfaceC2885e interfaceC2885e2) {
        super(2);
        this.$rawOffsetStart = mutableFloatState;
        this.$rawOffsetEnd = mutableFloatState2;
        this.$value = interfaceC2885e;
        this.$minPx = p8;
        this.$maxPx = p9;
        this.$onValueChangeState = state;
        this.$valueRange = interfaceC2885e2;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
        return I.f8278a;
    }

    public final void invoke(boolean z8, float f8) {
        InterfaceC2885e b8;
        InterfaceC2885e invoke$scaleToUserValue;
        if (z8) {
            MutableFloatState mutableFloatState = this.$rawOffsetStart;
            mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f8);
            this.$rawOffsetEnd.setFloatValue(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, ((Number) this.$value.getEndInclusive()).floatValue()));
            float floatValue = this.$rawOffsetEnd.getFloatValue();
            b8 = m.b(m.j(this.$rawOffsetStart.getFloatValue(), this.$minPx.f34159a, floatValue), floatValue);
        } else {
            MutableFloatState mutableFloatState2 = this.$rawOffsetEnd;
            mutableFloatState2.setFloatValue(mutableFloatState2.getFloatValue() + f8);
            this.$rawOffsetStart.setFloatValue(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, ((Number) this.$value.getStart()).floatValue()));
            float floatValue2 = this.$rawOffsetStart.getFloatValue();
            b8 = m.b(floatValue2, m.j(this.$rawOffsetEnd.getFloatValue(), floatValue2, this.$maxPx.f34159a));
        }
        Function1 value = this.$onValueChangeState.getValue();
        invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, b8);
        value.invoke(invoke$scaleToUserValue);
    }
}
