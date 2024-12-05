package androidx.compose.ui.layout;

import L5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class OnRemeasuredModifierKt$onSizeChanged$$inlined$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $onSizeChanged$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnRemeasuredModifierKt$onSizeChanged$$inlined$debugInspectorInfo$1(Function1 function1) {
        super(1);
        this.$onSizeChanged$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6487a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onSizeChanged");
        inspectorInfo.getProperties().set("onSizeChanged", this.$onSizeChanged$inlined);
    }
}
