package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class TextFieldSelectionDelegateKt {
    /* renamed from: getTextFieldSelection-bb3KNj8, reason: not valid java name */
    public static final long m1079getTextFieldSelectionbb3KNj8(TextLayoutResult textLayoutResult, int i8, int i9, TextRange textRange, boolean z8, SelectionAdjustment adjustment) {
        AbstractC3255y.i(adjustment, "adjustment");
        if (textLayoutResult != null) {
            long TextRange = TextRangeKt.TextRange(i8, i9);
            if (textRange == null && AbstractC3255y.d(adjustment, SelectionAdjustment.Companion.getCharacter())) {
                return TextRange;
            }
            return adjustment.mo1025adjustZXO7KMw(textLayoutResult, TextRange, -1, z8, textRange);
        }
        return TextRangeKt.TextRange(0, 0);
    }
}
