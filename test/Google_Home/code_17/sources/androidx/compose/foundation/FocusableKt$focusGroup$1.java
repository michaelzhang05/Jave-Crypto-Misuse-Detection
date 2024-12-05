package androidx.compose.foundation;

import O5.I;
import androidx.compose.ui.focus.FocusProperties;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class FocusableKt$focusGroup$1 extends AbstractC3256z implements Function1 {
    public static final FocusableKt$focusGroup$1 INSTANCE = new FocusableKt$focusGroup$1();

    FocusableKt$focusGroup$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusProperties) obj);
        return I.f8278a;
    }

    public final void invoke(FocusProperties focusProperties) {
        AbstractC3255y.i(focusProperties, "$this$focusProperties");
        focusProperties.setCanFocus(false);
    }
}
