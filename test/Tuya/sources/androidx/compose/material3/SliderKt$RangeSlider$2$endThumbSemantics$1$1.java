package androidx.compose.material3;

import L5.I;
import androidx.compose.runtime.State;
import d6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SliderKt$RangeSlider$2$endThumbSemantics$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ float $coercedStart;
    final /* synthetic */ State<Function1> $onValueChangeState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$endThumbSemantics$1$1(State<? extends Function1> state, float f8) {
        super(1);
        this.$onValueChangeState = state;
        this.$coercedStart = f8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return I.f6487a;
    }

    public final void invoke(float f8) {
        this.$onValueChangeState.getValue().invoke(m.b(this.$coercedStart, f8));
    }
}
