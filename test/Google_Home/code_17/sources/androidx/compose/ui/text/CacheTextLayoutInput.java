package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class CacheTextLayoutInput {
    public static final int $stable = 0;
    private final TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        if (AbstractC3255y.d(textLayoutInput.getText(), cacheTextLayoutInput.textLayoutInput.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle()) && AbstractC3255y.d(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.textLayoutInput.getSoftWrap() && TextOverflow.m5129equalsimpl0(textLayoutInput.m4666getOverflowgIe3tQ8(), cacheTextLayoutInput.textLayoutInput.m4666getOverflowgIe3tQ8()) && AbstractC3255y.d(textLayoutInput.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && Constraints.m5151getMaxWidthimpl(textLayoutInput.m4665getConstraintsmsEJaDk()) == Constraints.m5151getMaxWidthimpl(cacheTextLayoutInput.textLayoutInput.m4665getConstraintsmsEJaDk()) && Constraints.m5150getMaxHeightimpl(textLayoutInput.m4665getConstraintsmsEJaDk()) == Constraints.m5150getMaxHeightimpl(cacheTextLayoutInput.textLayoutInput.m4665getConstraintsmsEJaDk())) {
            return true;
        }
        return false;
    }

    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return (((((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release()) * 31) + textLayoutInput.getPlaceholders().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + androidx.compose.foundation.a.a(textLayoutInput.getSoftWrap())) * 31) + TextOverflow.m5130hashCodeimpl(textLayoutInput.m4666getOverflowgIe3tQ8())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + Constraints.m5151getMaxWidthimpl(textLayoutInput.m4665getConstraintsmsEJaDk())) * 31) + Constraints.m5150getMaxHeightimpl(textLayoutInput.m4665getConstraintsmsEJaDk());
    }
}
