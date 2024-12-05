package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldState$onValueChange$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldState$onValueChange$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return I.f6487a;
    }

    public final void invoke(TextFieldValue it) {
        Function1 function1;
        AbstractC3159y.i(it, "it");
        String text = it.getText();
        AnnotatedString untransformedText = this.this$0.getUntransformedText();
        if (!AbstractC3159y.d(text, untransformedText != null ? untransformedText.getText() : null)) {
            this.this$0.setHandleState(HandleState.None);
        }
        function1 = this.this$0.onValueChangeOriginal;
        function1.invoke(it);
        this.this$0.getRecomposeScope().invalidate();
    }
}
