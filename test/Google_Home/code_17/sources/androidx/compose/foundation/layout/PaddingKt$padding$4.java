package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class PaddingKt$padding$4 extends AbstractC3256z implements Function1 {
    final /* synthetic */ PaddingValues $paddingValues;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingKt$padding$4(PaddingValues paddingValues) {
        super(1);
        this.$paddingValues = paddingValues;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo $receiver) {
        AbstractC3255y.i($receiver, "$this$$receiver");
        $receiver.setName("padding");
        $receiver.getProperties().set("paddingValues", this.$paddingValues);
    }
}
