package androidx.compose.ui.text.input;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TextFieldValue$Companion$Saver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final TextFieldValue$Companion$Saver$1 INSTANCE = new TextFieldValue$Companion$Saver$1();

    TextFieldValue$Companion$Saver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
        return AbstractC1378t.g(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m4685boximpl(textFieldValue.m4934getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope));
    }
}
