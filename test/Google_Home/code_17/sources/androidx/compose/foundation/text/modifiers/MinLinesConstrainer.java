package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c6.AbstractC2055a;
import g6.m;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class MinLinesConstrainer {
    public static final Companion Companion = new Companion(null);
    private static MinLinesConstrainer last;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final TextStyle inputTextStyle;
    private final LayoutDirection layoutDirection;
    private float lineHeightCache;
    private float oneLineHeightCache;
    private final TextStyle resolvedStyle;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final MinLinesConstrainer from(MinLinesConstrainer minLinesConstrainer, LayoutDirection layoutDirection, TextStyle paramStyle, Density density, FontFamily.Resolver fontFamilyResolver) {
            AbstractC3255y.i(layoutDirection, "layoutDirection");
            AbstractC3255y.i(paramStyle, "paramStyle");
            AbstractC3255y.i(density, "density");
            AbstractC3255y.i(fontFamilyResolver, "fontFamilyResolver");
            if (minLinesConstrainer == null || layoutDirection != minLinesConstrainer.getLayoutDirection() || !AbstractC3255y.d(paramStyle, minLinesConstrainer.getInputTextStyle()) || density.getDensity() != minLinesConstrainer.getDensity().getDensity() || fontFamilyResolver != minLinesConstrainer.getFontFamilyResolver()) {
                MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.last;
                if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.getLayoutDirection() && AbstractC3255y.d(paramStyle, minLinesConstrainer2.getInputTextStyle()) && density.getDensity() == minLinesConstrainer2.getDensity().getDensity() && fontFamilyResolver == minLinesConstrainer2.getFontFamilyResolver()) {
                    return minLinesConstrainer2;
                }
                MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(paramStyle, layoutDirection), density, fontFamilyResolver, null);
                MinLinesConstrainer.last = minLinesConstrainer3;
                return minLinesConstrainer3;
            }
            return minLinesConstrainer;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver, AbstractC3247p abstractC3247p) {
        this(layoutDirection, textStyle, density, resolver);
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation_release, reason: not valid java name */
    public final long m983coerceMinLinesOh53vG4$foundation_release(long j8, int i8) {
        String str;
        String str2;
        int m5152getMinHeightimpl;
        float f8 = this.oneLineHeightCache;
        float f9 = this.lineHeightCache;
        if (Float.isNaN(f8) || Float.isNaN(f9)) {
            str = MinLinesConstrainerKt.EmptyTextReplacement;
            f8 = ParagraphKt.m4589ParagraphUdtVg6A$default(str, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 1, false, 96, null).getHeight();
            str2 = MinLinesConstrainerKt.TwoLineTextReplacement;
            f9 = ParagraphKt.m4589ParagraphUdtVg6A$default(str2, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 2, false, 96, null).getHeight() - f8;
            this.oneLineHeightCache = f8;
            this.lineHeightCache = f9;
        }
        if (i8 != 1) {
            m5152getMinHeightimpl = m.g(m.d(AbstractC2055a.d(f8 + (f9 * (i8 - 1))), 0), Constraints.m5150getMaxHeightimpl(j8));
        } else {
            m5152getMinHeightimpl = Constraints.m5152getMinHeightimpl(j8);
        }
        return ConstraintsKt.Constraints(Constraints.m5153getMinWidthimpl(j8), Constraints.m5151getMaxWidthimpl(j8), m5152getMinHeightimpl, Constraints.m5150getMaxHeightimpl(j8));
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    private MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
        this.lineHeightCache = Float.NaN;
        this.oneLineHeightCache = Float.NaN;
    }
}
