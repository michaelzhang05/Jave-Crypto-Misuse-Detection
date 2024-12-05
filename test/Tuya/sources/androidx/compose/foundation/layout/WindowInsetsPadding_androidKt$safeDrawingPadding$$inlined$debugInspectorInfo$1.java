package androidx.compose.foundation.layout;

import L5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    public WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6487a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("safeDrawingPadding");
    }
}
