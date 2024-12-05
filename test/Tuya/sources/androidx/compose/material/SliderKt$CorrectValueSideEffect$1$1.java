package androidx.compose.material;

import L5.I;
import androidx.compose.runtime.MutableState;
import d6.InterfaceC2561e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SliderKt$CorrectValueSideEffect$1$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ Function1 $scaleToOffset;
    final /* synthetic */ InterfaceC2561e $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC2561e $valueRange;
    final /* synthetic */ MutableState<Float> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$1$1(InterfaceC2561e interfaceC2561e, Function1 function1, float f8, MutableState<Float> mutableState, InterfaceC2561e interfaceC2561e2) {
        super(0);
        this.$valueRange = interfaceC2561e;
        this.$scaleToOffset = function1;
        this.$value = f8;
        this.$valueState = mutableState;
        this.$trackRange = interfaceC2561e2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1329invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1329invoke() {
        float floatValue = (((Number) this.$valueRange.getEndInclusive()).floatValue() - ((Number) this.$valueRange.getStart()).floatValue()) / 1000;
        float floatValue2 = ((Number) this.$scaleToOffset.invoke(Float.valueOf(this.$value))).floatValue();
        if (Math.abs(floatValue2 - this.$valueState.getValue().floatValue()) <= floatValue || !this.$trackRange.contains(this.$valueState.getValue())) {
            return;
        }
        this.$valueState.setValue(Float.valueOf(floatValue2));
    }
}
