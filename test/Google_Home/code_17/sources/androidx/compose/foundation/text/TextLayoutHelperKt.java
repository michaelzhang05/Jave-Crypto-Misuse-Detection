package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m960canReuse7_7YC6M(TextLayoutResult canReuse, AnnotatedString text, TextStyle style, List<AnnotatedString.Range<Placeholder>> placeholders, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long j8) {
        AbstractC3255y.i(canReuse, "$this$canReuse");
        AbstractC3255y.i(text, "text");
        AbstractC3255y.i(style, "style");
        AbstractC3255y.i(placeholders, "placeholders");
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        AbstractC3255y.i(fontFamilyResolver, "fontFamilyResolver");
        TextLayoutInput layoutInput = canReuse.getLayoutInput();
        if (canReuse.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !AbstractC3255y.d(layoutInput.getText(), text) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(style) || !AbstractC3255y.d(layoutInput.getPlaceholders(), placeholders) || layoutInput.getMaxLines() != i8 || layoutInput.getSoftWrap() != z8 || !TextOverflow.m5129equalsimpl0(layoutInput.m4666getOverflowgIe3tQ8(), i9) || !AbstractC3255y.d(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !AbstractC3255y.d(layoutInput.getFontFamilyResolver(), fontFamilyResolver) || Constraints.m5153getMinWidthimpl(j8) != Constraints.m5153getMinWidthimpl(layoutInput.m4665getConstraintsmsEJaDk())) {
            return false;
        }
        if (!z8 && !TextOverflow.m5129equalsimpl0(i9, TextOverflow.Companion.m5137getEllipsisgIe3tQ8())) {
            return true;
        }
        if (Constraints.m5151getMaxWidthimpl(j8) != Constraints.m5151getMaxWidthimpl(layoutInput.m4665getConstraintsmsEJaDk()) || Constraints.m5150getMaxHeightimpl(j8) != Constraints.m5150getMaxHeightimpl(layoutInput.m4665getConstraintsmsEJaDk())) {
            return false;
        }
        return true;
    }
}
