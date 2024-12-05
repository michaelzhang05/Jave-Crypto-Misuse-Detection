package androidx.compose.foundation.text.modifiers;

import L5.I;
import M5.AbstractC1246t;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private boolean didOverflow;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private Paragraph paragraph;
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i8, boolean z8, int i9, int i10, AbstractC3151p abstractC3151p) {
        this(str, textStyle, resolver, i8, z8, i9, i10);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final Paragraph m986layoutTextK40F9xA(long j8, LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m4585Paragraph_EkL_Y(layoutDirection2, LayoutUtilsKt.m975finalConstraintstfFHcEY(j8, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m976finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m5124equalsimpl0(this.overflow, TextOverflow.Companion.m5132getEllipsisgIe3tQ8()));
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m5154fixedJhjzzOo(0, 0);
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.didOverflow = false;
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m987newLayoutWillBeDifferentK40F9xA(long j8, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.m5139equalsimpl0(j8, this.prevConstraints)) {
            return false;
        }
        if (Constraints.m5146getMaxWidthimpl(j8) != Constraints.m5146getMaxWidthimpl(this.prevConstraints) || Constraints.m5145getMaxHeightimpl(j8) < paragraph.getHeight() || paragraph.getDidExceedMaxLines()) {
            return true;
        }
        return false;
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || paragraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            AbstractC3159y.f(density);
            paragraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, resolveDefaults, (List) null, (List) null, density, this.fontFamilyResolver, 12, (Object) null);
        }
        this.paragraphIntrinsics = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.didOverflow;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m988getLayoutSizeYbymL2g$foundation_release() {
        return this.layoutSize;
    }

    public final I getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return I.f6487a;
    }

    public final Paragraph getParagraph$foundation_release() {
        return this.paragraph;
    }

    public final int intrinsicHeight(int i8, LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        int i9 = this.cachedIntrinsicHeightInputWidth;
        int i10 = this.cachedIntrinsicHeight;
        if (i8 == i9 && i9 != -1) {
            return i10;
        }
        int ceilToIntPx = TextDelegateKt.ceilToIntPx(m986layoutTextK40F9xA(ConstraintsKt.Constraints(0, i8, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = i8;
        this.cachedIntrinsicHeight = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m989layoutWithConstraintsK40F9xA(long j8, LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        boolean z8 = true;
        if (this.minLines > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
            MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            Density density = this.density;
            AbstractC3159y.f(density);
            MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
            this.mMinLinesConstrainer = from;
            j8 = from.m978coerceMinLinesOh53vG4$foundation_release(j8, this.minLines);
        }
        boolean z9 = false;
        if (!m987newLayoutWillBeDifferentK40F9xA(j8, layoutDirection)) {
            if (!Constraints.m5139equalsimpl0(j8, this.prevConstraints)) {
                Paragraph paragraph = this.paragraph;
                AbstractC3159y.f(paragraph);
                this.layoutSize = ConstraintsKt.m5157constrain4WqzIAM(j8, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraph.getWidth()), TextDelegateKt.ceilToIntPx(paragraph.getHeight())));
                if (TextOverflow.m5124equalsimpl0(this.overflow, TextOverflow.Companion.m5133getVisiblegIe3tQ8()) || (IntSize.m5344getWidthimpl(r9) >= paragraph.getWidth() && IntSize.m5343getHeightimpl(r9) >= paragraph.getHeight())) {
                    z8 = false;
                }
                this.didOverflow = z8;
            }
            return false;
        }
        Paragraph m986layoutTextK40F9xA = m986layoutTextK40F9xA(j8, layoutDirection);
        this.prevConstraints = j8;
        this.layoutSize = ConstraintsKt.m5157constrain4WqzIAM(j8, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m986layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(m986layoutTextK40F9xA.getHeight())));
        if (!TextOverflow.m5124equalsimpl0(this.overflow, TextOverflow.Companion.m5133getVisiblegIe3tQ8()) && (IntSize.m5344getWidthimpl(r9) < m986layoutTextK40F9xA.getWidth() || IntSize.m5343getHeightimpl(r9) < m986layoutTextK40F9xA.getHeight())) {
            z9 = true;
        }
        this.didOverflow = z9;
        this.paragraph = m986layoutTextK40F9xA;
        return true;
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(Density density) {
        long m974getUnspecifiedL26CHvs;
        Density density2 = this.density;
        if (density != null) {
            m974getUnspecifiedL26CHvs = InlineDensity.m966constructorimpl(density);
        } else {
            m974getUnspecifiedL26CHvs = InlineDensity.Companion.m974getUnspecifiedL26CHvs();
        }
        if (density2 == null) {
            this.density = density;
            this.lastDensity = m974getUnspecifiedL26CHvs;
        } else if (density == null || !InlineDensity.m968equalsimpl0(this.lastDensity, m974getUnspecifiedL26CHvs)) {
            this.density = density;
            this.lastDensity = m974getUnspecifiedL26CHvs;
            markDirty();
        }
    }

    public final void setDidOverflow$foundation_release(boolean z8) {
        this.didOverflow = z8;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m990setLayoutSizeozmzZPI$foundation_release(long j8) {
        this.layoutSize = j8;
    }

    public final void setParagraph$foundation_release(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public final TextLayoutResult slowCreateTextLayoutResultOrNull() {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long m5137copyZbe2FdA$default = Constraints.m5137copyZbe2FdA$default(this.prevConstraints, 0, 0, 0, 0, 10, null);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, this.style, AbstractC1246t.m(), this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, m5137copyZbe2FdA$default, (AbstractC3151p) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, this.style, (List<AnnotatedString.Range<Placeholder>>) AbstractC1246t.m(), density, this.fontFamilyResolver), m5137copyZbe2FdA$default, this.maxLines, TextOverflow.m5124equalsimpl0(this.overflow, TextOverflow.Companion.m5132getEllipsisgIe3tQ8()), null), this.layoutSize, null);
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m991updateL6sJoHM(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i8, boolean z8, int i9, int i10) {
        AbstractC3159y.i(text, "text");
        AbstractC3159y.i(style, "style");
        AbstractC3159y.i(fontFamilyResolver, "fontFamilyResolver");
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = i8;
        this.softWrap = z8;
        this.maxLines = i9;
        this.minLines = i10;
        markDirty();
    }

    private ParagraphLayoutCache(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i8, boolean z8, int i9, int i10) {
        AbstractC3159y.i(text, "text");
        AbstractC3159y.i(style, "style");
        AbstractC3159y.i(fontFamilyResolver, "fontFamilyResolver");
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = i8;
        this.softWrap = z8;
        this.maxLines = i9;
        this.minLines = i10;
        this.lastDensity = InlineDensity.Companion.m974getUnspecifiedL26CHvs();
        this.layoutSize = IntSizeKt.IntSize(0, 0);
        this.prevConstraints = Constraints.Companion.m5154fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i8, boolean z8, int i9, int i10, int i11, AbstractC3151p abstractC3151p) {
        this(str, textStyle, resolver, (i11 & 8) != 0 ? TextOverflow.Companion.m5131getClipgIe3tQ8() : i8, (i11 & 16) != 0 ? true : z8, (i11 & 32) != 0 ? Integer.MAX_VALUE : i9, (i11 & 64) != 0 ? 1 : i10, null);
    }
}
