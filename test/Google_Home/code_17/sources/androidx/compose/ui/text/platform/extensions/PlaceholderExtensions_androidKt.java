package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m4954getSpanUnitR2X_6o(long j8) {
        long m5369getTypeUIouoOA = TextUnit.m5369getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5403getSpUIouoOA())) {
            return 0;
        }
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5402getEmUIouoOA())) {
            return 1;
        }
        return 2;
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m4955getSpanUnitR2X_6o$annotations(long j8) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m4956getSpanVerticalAligndo9XGg(int i8) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m4624equalsimpl0(i8, companion.m4628getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m4624equalsimpl0(i8, companion.m4634getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m4624equalsimpl0(i8, companion.m4629getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m4624equalsimpl0(i8, companion.m4630getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m4624equalsimpl0(i8, companion.m4633getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m4624equalsimpl0(i8, companion.m4631getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m4624equalsimpl0(i8, companion.m4632getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m4957getSpanVerticalAligndo9XGg$annotations(int i8) {
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i8, int i9, Density density) {
        for (Object obj : spannable.getSpans(i8, i9, EmojiSpan.class)) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m5370getValueimpl(placeholder.m4620getWidthXSAIIZE()), m4954getSpanUnitR2X_6o(placeholder.m4620getWidthXSAIIZE()), TextUnit.m5370getValueimpl(placeholder.m4618getHeightXSAIIZE()), m4954getSpanUnitR2X_6o(placeholder.m4618getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m4956getSpanVerticalAligndo9XGg(placeholder.m4619getPlaceholderVerticalAlignJ6kI3mc())), i8, i9);
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            AnnotatedString.Range<Placeholder> range = list.get(i8);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }
}
