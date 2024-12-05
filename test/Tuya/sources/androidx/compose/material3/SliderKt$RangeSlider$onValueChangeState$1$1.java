package androidx.compose.material3;

import L5.I;
import d6.InterfaceC2561e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SliderKt$RangeSlider$onValueChangeState$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ InterfaceC2561e $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$onValueChangeState$1$1(InterfaceC2561e interfaceC2561e, Function1 function1) {
        super(1);
        this.$value = interfaceC2561e;
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2561e) obj);
        return I.f6487a;
    }

    public final void invoke(InterfaceC2561e it) {
        AbstractC3159y.i(it, "it");
        if (AbstractC3159y.d(it, this.$value)) {
            return;
        }
        this.$onValueChange.invoke(it);
    }
}
