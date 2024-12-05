package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class OffsetKt$offset$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ float $x;
    final /* synthetic */ float $y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetKt$offset$1(float f8, float f9) {
        super(1);
        this.$x = f8;
        this.$y = f9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo $receiver) {
        AbstractC3255y.i($receiver, "$this$$receiver");
        $receiver.setName(TypedValues.CycleType.S_WAVE_OFFSET);
        $receiver.getProperties().set("x", Dp.m5181boximpl(this.$x));
        $receiver.getProperties().set("y", Dp.m5181boximpl(this.$y));
    }
}
