package androidx.compose.material3;

import O5.I;
import g6.InterfaceC2885e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SliderKt$RangeSlider$onValueChangeState$1$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ InterfaceC2885e $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$onValueChangeState$1$1(InterfaceC2885e interfaceC2885e, Function1 function1) {
        super(1);
        this.$value = interfaceC2885e;
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2885e) obj);
        return I.f8278a;
    }

    public final void invoke(InterfaceC2885e it) {
        AbstractC3255y.i(it, "it");
        if (AbstractC3255y.d(it, this.$value)) {
            return;
        }
        this.$onValueChange.invoke(it);
    }
}
