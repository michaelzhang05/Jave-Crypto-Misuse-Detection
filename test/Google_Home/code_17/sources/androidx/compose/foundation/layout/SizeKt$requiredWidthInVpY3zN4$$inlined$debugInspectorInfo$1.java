package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ float $max$inlined;
    final /* synthetic */ float $min$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(float f8, float f9) {
        super(1);
        this.$min$inlined = f8;
        this.$max$inlined = f9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("requiredWidthIn");
        inspectorInfo.getProperties().set("min", Dp.m5181boximpl(this.$min$inlined));
        inspectorInfo.getProperties().set("max", Dp.m5181boximpl(this.$max$inlined));
    }
}
