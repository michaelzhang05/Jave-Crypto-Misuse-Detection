package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ float $height$inlined;
    final /* synthetic */ float $width$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(float f8, float f9) {
        super(1);
        this.$width$inlined = f8;
        this.$height$inlined = f9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("requiredSize");
        inspectorInfo.getProperties().set("width", Dp.m5181boximpl(this.$width$inlined));
        inspectorInfo.getProperties().set("height", Dp.m5181boximpl(this.$height$inlined));
    }
}