package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class InspectableValueKt$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $definitions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectableValueKt$debugInspectorInfo$1(Function1 function1) {
        super(1);
        this.$definitions = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return L5.I.f6487a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        this.$definitions.invoke(inspectorInfo);
    }
}
