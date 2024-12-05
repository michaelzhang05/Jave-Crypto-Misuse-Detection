package androidx.compose.ui.text.input;

import M5.AbstractC1246t;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextFieldValue$Companion$Saver$1 extends AbstractC3160z implements X5.n {
    public static final TextFieldValue$Companion$Saver$1 INSTANCE = new TextFieldValue$Companion$Saver$1();

    TextFieldValue$Companion$Saver$1() {
        super(2);
    }

    @Override // X5.n
    public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
        return AbstractC1246t.g(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m4680boximpl(textFieldValue.m4929getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope));
    }
}
