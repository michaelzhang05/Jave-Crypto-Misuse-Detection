package androidx.compose.foundation.text;

import O5.I;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TextFieldKeyInputKt$textFieldKeyInput$1 extends AbstractC3256z implements Function1 {
    public static final TextFieldKeyInputKt$textFieldKeyInput$1 INSTANCE = new TextFieldKeyInputKt$textFieldKeyInput$1();

    TextFieldKeyInputKt$textFieldKeyInput$1() {
        super(1);
    }

    public final void invoke(TextFieldValue it) {
        AbstractC3255y.i(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return I.f8278a;
    }
}
