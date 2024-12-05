package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldState$onImeActionPerformed$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldState$onImeActionPerformed$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m954invokeKlQnJC8(((ImeAction) obj).m4858unboximpl());
        return I.f6487a;
    }

    /* renamed from: invoke-KlQnJC8, reason: not valid java name */
    public final void m954invokeKlQnJC8(int i8) {
        KeyboardActionRunner keyboardActionRunner;
        keyboardActionRunner = this.this$0.keyboardActionRunner;
        keyboardActionRunner.m881runActionKlQnJC8(i8);
    }
}
