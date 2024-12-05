package androidx.compose.foundation;

import L5.I;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d6.InterfaceC2561e;
import d6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ProgressSemanticsKt$progressSemantics$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ int $steps;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC2561e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressSemanticsKt$progressSemantics$1(float f8, InterfaceC2561e interfaceC2561e, int i8) {
        super(1);
        this.$value = f8;
        this.$valueRange = interfaceC2561e;
        this.$steps = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f6487a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3159y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, new ProgressBarRangeInfo(((Number) m.o(Float.valueOf(this.$value), this.$valueRange)).floatValue(), this.$valueRange, this.$steps));
    }
}
