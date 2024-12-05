package androidx.compose.ui.window;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class PopupLayout$Companion$onCommitAffectingPopupPosition$1 extends AbstractC3160z implements Function1 {
    public static final PopupLayout$Companion$onCommitAffectingPopupPosition$1 INSTANCE = new PopupLayout$Companion$onCommitAffectingPopupPosition$1();

    PopupLayout$Companion$onCommitAffectingPopupPosition$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PopupLayout) obj);
        return I.f6487a;
    }

    public final void invoke(PopupLayout popupLayout) {
        if (popupLayout.isAttachedToWindow()) {
            popupLayout.updatePosition();
        }
    }
}
