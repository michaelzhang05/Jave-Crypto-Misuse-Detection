package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BasicTextFieldKt$BasicTextField$8$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$8$1(TextFieldValue textFieldValue, Function1 function1) {
        super(1);
        this.$value = textFieldValue;
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return I.f6487a;
    }

    public final void invoke(TextFieldValue it) {
        AbstractC3159y.i(it, "it");
        if (AbstractC3159y.d(this.$value, it)) {
            return;
        }
        this.$onValueChange.invoke(it);
    }
}
