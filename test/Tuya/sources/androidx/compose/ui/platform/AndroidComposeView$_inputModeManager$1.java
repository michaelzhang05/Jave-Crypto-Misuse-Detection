package androidx.compose.ui.platform;

import androidx.compose.ui.input.InputMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeView$_inputModeManager$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m4425invokeiuPiT84(((InputMode) obj).m3580unboximpl());
    }

    /* renamed from: invoke-iuPiT84, reason: not valid java name */
    public final Boolean m4425invokeiuPiT84(int i8) {
        boolean z8;
        InputMode.Companion companion = InputMode.Companion;
        if (InputMode.m3577equalsimpl0(i8, companion.m3582getTouchaOaMEAU())) {
            z8 = this.this$0.isInTouchMode();
        } else if (InputMode.m3577equalsimpl0(i8, companion.m3581getKeyboardaOaMEAU())) {
            if (this.this$0.isInTouchMode()) {
                z8 = this.this$0.requestFocusFromTouch();
            } else {
                z8 = true;
            }
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
