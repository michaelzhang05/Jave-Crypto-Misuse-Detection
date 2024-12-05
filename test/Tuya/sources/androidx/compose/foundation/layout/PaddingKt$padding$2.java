package androidx.compose.foundation.layout;

import L5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class PaddingKt$padding$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ float $horizontal;
    final /* synthetic */ float $vertical;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingKt$padding$2(float f8, float f9) {
        super(1);
        this.$horizontal = f8;
        this.$vertical = f9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6487a;
    }

    public final void invoke(InspectorInfo $receiver) {
        AbstractC3159y.i($receiver, "$this$$receiver");
        $receiver.setName("padding");
        $receiver.getProperties().set("horizontal", Dp.m5176boximpl(this.$horizontal));
        $receiver.getProperties().set("vertical", Dp.m5176boximpl(this.$vertical));
    }
}
