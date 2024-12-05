package androidx.compose.foundation.layout;

import O5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ PaddingValues $paddingValues$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2(PaddingValues paddingValues) {
        super(1);
        this.$paddingValues$inlined = paddingValues;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("consumeWindowInsets");
        inspectorInfo.getProperties().set("paddingValues", this.$paddingValues$inlined);
    }
}
