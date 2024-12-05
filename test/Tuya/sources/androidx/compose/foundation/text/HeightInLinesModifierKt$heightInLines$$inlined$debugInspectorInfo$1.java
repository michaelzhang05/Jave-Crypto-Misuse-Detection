package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ int $maxLines$inlined;
    final /* synthetic */ int $minLines$inlined;
    final /* synthetic */ TextStyle $textStyle$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1(int i8, int i9, TextStyle textStyle) {
        super(1);
        this.$minLines$inlined = i8;
        this.$maxLines$inlined = i9;
        this.$textStyle$inlined = textStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6487a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("heightInLines");
        inspectorInfo.getProperties().set("minLines", Integer.valueOf(this.$minLines$inlined));
        inspectorInfo.getProperties().set("maxLines", Integer.valueOf(this.$maxLines$inlined));
        inspectorInfo.getProperties().set("textStyle", this.$textStyle$inlined);
    }
}
