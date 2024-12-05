package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeView$keyInputModifier$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m4427invokeZmokQxo(((KeyEvent) obj).m3888unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m4427invokeZmokQxo(android.view.KeyEvent keyEvent) {
        FocusDirection mo4398getFocusDirectionP8AzH3I = this.this$0.mo4398getFocusDirectionP8AzH3I(keyEvent);
        if (mo4398getFocusDirectionP8AzH3I != null && KeyEventType.m3892equalsimpl0(KeyEvent_androidKt.m3900getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3896getKeyDownCS__XNY())) {
            return Boolean.valueOf(this.this$0.getFocusOwner().mo2667moveFocus3ESFkO8(mo4398getFocusDirectionP8AzH3I.m2655unboximpl()));
        }
        return Boolean.FALSE;
    }
}
