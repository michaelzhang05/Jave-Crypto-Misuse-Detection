package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ boolean $matchHeightConstraintsFirst$inlined;
    final /* synthetic */ float $ratio$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(float f8, boolean z8) {
        super(1);
        this.$ratio$inlined = f8;
        this.$matchHeightConstraintsFirst$inlined = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("aspectRatio");
        inspectorInfo.getProperties().set("ratio", Float.valueOf(this.$ratio$inlined));
        inspectorInfo.getProperties().set("matchHeightConstraintsFirst", Boolean.valueOf(this.$matchHeightConstraintsFirst$inlined));
    }
}
