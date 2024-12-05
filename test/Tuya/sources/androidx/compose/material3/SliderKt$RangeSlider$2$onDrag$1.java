package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import d6.InterfaceC2561e;
import d6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$onDrag$1 extends AbstractC3160z implements n {
    final /* synthetic */ P $maxPx;
    final /* synthetic */ P $minPx;
    final /* synthetic */ State<Function1> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    final /* synthetic */ MutableState<Float> $rawOffsetStart;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ InterfaceC2561e $value;
    final /* synthetic */ InterfaceC2561e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$onDrag$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, InterfaceC2561e interfaceC2561e, P p8, float[] fArr, P p9, State<? extends Function1> state, InterfaceC2561e interfaceC2561e2) {
        super(2);
        this.$rawOffsetStart = mutableState;
        this.$rawOffsetEnd = mutableState2;
        this.$value = interfaceC2561e;
        this.$minPx = p8;
        this.$tickFractions = fArr;
        this.$maxPx = p9;
        this.$onValueChangeState = state;
        this.$valueRange = interfaceC2561e2;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Number) obj2).floatValue());
        return I.f6487a;
    }

    public final void invoke(boolean z8, float f8) {
        float snapValueToTick;
        InterfaceC2561e b8;
        InterfaceC2561e invoke$scaleToUserValue;
        float snapValueToTick2;
        if (z8) {
            MutableState<Float> mutableState = this.$rawOffsetStart;
            mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f8));
            this.$rawOffsetEnd.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, ((Number) this.$value.getEndInclusive()).floatValue())));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            snapValueToTick2 = SliderKt.snapValueToTick(m.j(this.$rawOffsetStart.getValue().floatValue(), this.$minPx.f33758a, floatValue), this.$tickFractions, this.$minPx.f33758a, this.$maxPx.f33758a);
            b8 = m.b(snapValueToTick2, floatValue);
        } else {
            MutableState<Float> mutableState2 = this.$rawOffsetEnd;
            mutableState2.setValue(Float.valueOf(mutableState2.getValue().floatValue() + f8));
            this.$rawOffsetStart.setValue(Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, ((Number) this.$value.getStart()).floatValue())));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            snapValueToTick = SliderKt.snapValueToTick(m.j(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, this.$maxPx.f33758a), this.$tickFractions, this.$minPx.f33758a, this.$maxPx.f33758a);
            b8 = m.b(floatValue2, snapValueToTick);
        }
        Function1 value = this.$onValueChangeState.getValue();
        invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, b8);
        value.invoke(invoke$scaleToUserValue);
    }
}
