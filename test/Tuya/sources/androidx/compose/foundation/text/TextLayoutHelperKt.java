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
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m955canReuse7_7YC6M(TextLayoutResult canReuse, AnnotatedString text, TextStyle style, List<AnnotatedString.Range<Placeholder>> placeholders, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long j8) {
        AbstractC3159y.i(canReuse, "$this$canReuse");
        AbstractC3159y.i(text, "text");
        AbstractC3159y.i(style, "style");
        AbstractC3159y.i(placeholders, "placeholders");
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        AbstractC3159y.i(fontFamilyResolver, "fontFamilyResolver");
        TextLayoutInput layoutInput = canReuse.getLayoutInput();
        if (canReuse.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !AbstractC3159y.d(layoutInput.getText(), text) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(style) || !AbstractC3159y.d(layoutInput.getPlaceholders(), placeholders) || layoutInput.getMaxLines() != i8 || layoutInput.getSoftWrap() != z8 || !TextOverflow.m5124equalsimpl0(layoutInput.m4661getOverflowgIe3tQ8(), i9) || !AbstractC3159y.d(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !AbstractC3159y.d(layoutInput.getFontFamilyResolver(), fontFamilyResolver) || Constraints.m5148getMinWidthimpl(j8) != Constraints.m5148getMinWidthimpl(layoutInput.m4660getConstraintsmsEJaDk())) {
            return false;
        }
        if (!z8 && !TextOverflow.m5124equalsimpl0(i9, TextOverflow.Companion.m5132getEllipsisgIe3tQ8())) {
            return true;
        }
        if (Constraints.m5146getMaxWidthimpl(j8) != Constraints.m5146getMaxWidthimpl(layoutInput.m4660getConstraintsmsEJaDk()) || Constraints.m5145getMaxHeightimpl(j8) != Constraints.m5145getMaxHeightimpl(layoutInput.m4660getConstraintsmsEJaDk())) {
            return false;
        }
        return true;
    }
}
