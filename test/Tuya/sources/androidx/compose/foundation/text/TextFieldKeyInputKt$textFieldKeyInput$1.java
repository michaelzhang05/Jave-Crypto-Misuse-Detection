package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextFieldKeyInputKt$textFieldKeyInput$1 extends AbstractC3160z implements Function1 {
    public static final TextFieldKeyInputKt$textFieldKeyInput$1 INSTANCE = new TextFieldKeyInputKt$textFieldKeyInput$1();

    TextFieldKeyInputKt$textFieldKeyInput$1() {
        super(1);
    }

    public final void invoke(TextFieldValue it) {
        AbstractC3159y.i(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return I.f6487a;
    }
}
