package androidx.compose.foundation;

import O5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class FocusableKt$focusableInNonTouchMode$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusableInNonTouchMode$1(boolean z8, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$enabled = z8;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo inspectable) {
        AbstractC3255y.i(inspectable, "$this$inspectable");
        inspectable.setName("focusableInNonTouchMode");
        inspectable.getProperties().set("enabled", Boolean.valueOf(this.$enabled));
        inspectable.getProperties().set("interactionSource", this.$interactionSource);
    }
}
