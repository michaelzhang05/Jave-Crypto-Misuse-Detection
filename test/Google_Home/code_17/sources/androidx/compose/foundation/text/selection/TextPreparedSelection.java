package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class TextPreparedSelection extends BaseTextPreparedSelection<TextPreparedSelection> {
    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j8, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, AbstractC3247p abstractC3247p) {
        this(annotatedString, j8, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j8, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, int i8, AbstractC3247p abstractC3247p) {
        this(annotatedString, j8, (i8 & 4) != 0 ? null : textLayoutResult, (i8 & 8) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i8 & 16) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private TextPreparedSelection(AnnotatedString originalText, long j8, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState state) {
        super(originalText, j8, textLayoutResult, offsetMapping, state, null);
        AbstractC3255y.i(originalText, "originalText");
        AbstractC3255y.i(offsetMapping, "offsetMapping");
        AbstractC3255y.i(state, "state");
    }
}