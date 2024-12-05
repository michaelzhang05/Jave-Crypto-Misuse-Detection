package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d6.InterfaceC2561e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$CorrectValueSideEffect$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1 $scaleToOffset;
    final /* synthetic */ InterfaceC2561e $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC2561e $valueRange;
    final /* synthetic */ MutableState<Float> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$CorrectValueSideEffect$2(Function1 function1, InterfaceC2561e interfaceC2561e, InterfaceC2561e interfaceC2561e2, MutableState<Float> mutableState, float f8, int i8) {
        super(2);
        this.$scaleToOffset = function1;
        this.$valueRange = interfaceC2561e;
        this.$trackRange = interfaceC2561e2;
        this.$valueState = mutableState;
        this.$value = f8;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.CorrectValueSideEffect(this.$scaleToOffset, this.$valueRange, this.$trackRange, this.$valueState, this.$value, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
