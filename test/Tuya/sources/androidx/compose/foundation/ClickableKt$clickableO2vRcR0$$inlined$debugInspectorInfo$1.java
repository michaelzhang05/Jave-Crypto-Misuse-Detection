package androidx.compose.foundation;

import L5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ Indication $indication$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ Function0 $onClick$inlined;
    final /* synthetic */ String $onClickLabel$inlined;
    final /* synthetic */ Role $role$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1(MutableInteractionSource mutableInteractionSource, Indication indication, boolean z8, String str, Role role, Function0 function0) {
        super(1);
        this.$interactionSource$inlined = mutableInteractionSource;
        this.$indication$inlined = indication;
        this.$enabled$inlined = z8;
        this.$onClickLabel$inlined = str;
        this.$role$inlined = role;
        this.$onClick$inlined = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6487a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("clickable");
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("indication", this.$indication$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("onClickLabel", this.$onClickLabel$inlined);
        inspectorInfo.getProperties().set("role", this.$role$inlined);
        inspectorInfo.getProperties().set("onClick", this.$onClick$inlined);
    }
}
