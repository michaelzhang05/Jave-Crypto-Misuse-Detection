package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ float $maxHeight$inlined;
    final /* synthetic */ float $maxWidth$inlined;
    final /* synthetic */ float $minHeight$inlined;
    final /* synthetic */ float $minWidth$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(float f8, float f9, float f10, float f11) {
        super(1);
        this.$minWidth$inlined = f8;
        this.$minHeight$inlined = f9;
        this.$maxWidth$inlined = f10;
        this.$maxHeight$inlined = f11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("requiredSizeIn");
        inspectorInfo.getProperties().set("minWidth", Dp.m5181boximpl(this.$minWidth$inlined));
        inspectorInfo.getProperties().set("minHeight", Dp.m5181boximpl(this.$minHeight$inlined));
        inspectorInfo.getProperties().set("maxWidth", Dp.m5181boximpl(this.$maxWidth$inlined));
        inspectorInfo.getProperties().set("maxHeight", Dp.m5181boximpl(this.$maxHeight$inlined));
    }
}
