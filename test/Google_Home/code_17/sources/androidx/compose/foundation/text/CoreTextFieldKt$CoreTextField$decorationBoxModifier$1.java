package androidx.compose.foundation.text;

import O5.I;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(TextFieldState textFieldState) {
        super(1);
        this.$state = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return I.f8278a;
    }

    public final void invoke(LayoutCoordinates it) {
        AbstractC3255y.i(it, "it");
        TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        layoutResult.setDecorationBoxCoordinates(it);
    }
}
