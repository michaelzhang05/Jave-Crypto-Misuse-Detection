package androidx.compose.material3;

import O5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class TouchTargetKt$minimumTouchTargetSize$$inlined$debugInspectorInfo$1 extends AbstractC3256z implements Function1 {
    public TouchTargetKt$minimumTouchTargetSize$$inlined$debugInspectorInfo$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("minimumTouchTargetSize");
        inspectorInfo.getProperties().set("README", "Adds outer padding to measure at least 48.dp (default) in size to disambiguate touch interactions if the element would measure smaller");
    }
}
