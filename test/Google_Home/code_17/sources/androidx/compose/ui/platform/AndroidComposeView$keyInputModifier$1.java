package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeView$keyInputModifier$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m4432invokeZmokQxo(((KeyEvent) obj).m3893unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m4432invokeZmokQxo(android.view.KeyEvent keyEvent) {
        FocusDirection mo4403getFocusDirectionP8AzH3I = this.this$0.mo4403getFocusDirectionP8AzH3I(keyEvent);
        if (mo4403getFocusDirectionP8AzH3I != null && KeyEventType.m3897equalsimpl0(KeyEvent_androidKt.m3905getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3901getKeyDownCS__XNY())) {
            return Boolean.valueOf(this.this$0.getFocusOwner().mo2672moveFocus3ESFkO8(mo4403getFocusDirectionP8AzH3I.m2660unboximpl()));
        }
        return Boolean.FALSE;
    }
}
