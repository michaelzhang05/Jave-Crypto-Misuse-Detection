package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;

/* loaded from: classes.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m4563subSequence5zctL8(textFieldValue.m4934getSelectiond9O1mEE());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i8) {
        return textFieldValue.getAnnotatedString().subSequence(TextRange.m4694getMaximpl(textFieldValue.m4934getSelectiond9O1mEE()), Math.min(TextRange.m4694getMaximpl(textFieldValue.m4934getSelectiond9O1mEE()) + i8, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i8) {
        return textFieldValue.getAnnotatedString().subSequence(Math.max(0, TextRange.m4695getMinimpl(textFieldValue.m4934getSelectiond9O1mEE()) - i8), TextRange.m4695getMinimpl(textFieldValue.m4934getSelectiond9O1mEE()));
    }
}
