package androidx.compose.foundation;

import O5.I;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import g6.InterfaceC2885e;
import g6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ProgressSemanticsKt$progressSemantics$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ int $steps;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC2885e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressSemanticsKt$progressSemantics$1(float f8, InterfaceC2885e interfaceC2885e, int i8) {
        super(1);
        this.$value = f8;
        this.$valueRange = interfaceC2885e;
        this.$steps = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8278a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3255y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, new ProgressBarRangeInfo(((Number) m.o(Float.valueOf(this.$value), this.$valueRange)).floatValue(), this.$valueRange, this.$steps));
    }
}
