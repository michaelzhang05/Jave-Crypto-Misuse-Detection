package androidx.compose.foundation.text.modifiers;

import M5.AbstractC1246t;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
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
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private TextLayoutResult layoutCache;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i8, boolean z8, int i9, int i10, List list, AbstractC3151p abstractC3151p) {
        this(annotatedString, textStyle, resolver, i8, z8, i9, i10, list);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m980layoutTextK40F9xA(long j8, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return new MultiParagraph(layoutDirection2, LayoutUtilsKt.m975finalConstraintstfFHcEY(j8, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m976finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), TextOverflow.m5124equalsimpl0(this.overflow, TextOverflow.Companion.m5132getEllipsisgIe3tQ8()), null);
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
    }

    /* renamed from: maxWidth-BRTryo0, reason: not valid java name */
    private final int m981maxWidthBRTryo0(long j8) {
        boolean z8 = this.softWrap;
        int i8 = this.overflow;
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        AbstractC3159y.f(multiParagraphIntrinsics);
        return LayoutUtilsKt.m977finalMaxWidthtfFHcEY(j8, z8, i8, multiParagraphIntrinsics.getMaxIntrinsicWidth());
    }

    /* renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m982newLayoutWillBeDifferentVKLhPVY(TextLayoutResult textLayoutResult, long j8, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m5139equalsimpl0(j8, textLayoutResult.getLayoutInput().m4660getConstraintsmsEJaDk())) {
            return false;
        }
        if (Constraints.m5146getMaxWidthimpl(j8) != Constraints.m5146getMaxWidthimpl(textLayoutResult.getLayoutInput().m4660getConstraintsmsEJaDk()) || Constraints.m5145getMaxHeightimpl(j8) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
            return true;
        }
        return false;
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            AbstractC3159y.f(density);
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
            if (list == null) {
                list = AbstractC1246t.m();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, resolveDefaults, list, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    private final TextLayoutResult m983textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j8, MultiParagraph multiParagraph) {
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        if (list == null) {
            list = AbstractC1246t.m();
        }
        int i8 = this.maxLines;
        boolean z8 = this.softWrap;
        int i9 = this.overflow;
        Density density = this.density;
        AbstractC3159y.f(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i8, z8, i9, density, layoutDirection, this.fontFamilyResolver, j8, (AbstractC3151p) null), multiParagraph, ConstraintsKt.m5157constrain4WqzIAM(j8, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(multiParagraph.getWidth()), TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()))), null);
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final TextLayoutResult getLayoutOrNull() {
        return this.layoutCache;
    }

    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int intrinsicHeight(int i8, LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        int i9 = this.cachedIntrinsicHeightInputWidth;
        int i10 = this.cachedIntrinsicHeight;
        if (i8 == i9 && i9 != -1) {
            return i10;
        }
        int ceilToIntPx = TextDelegateKt.ceilToIntPx(m980layoutTextK40F9xA(ConstraintsKt.Constraints(0, i8, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = i8;
        this.cachedIntrinsicHeight = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m984layoutWithConstraintsK40F9xA(long j8, LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
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
        if (!m982newLayoutWillBeDifferentVKLhPVY(this.layoutCache, j8, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            AbstractC3159y.f(textLayoutResult);
            if (Constraints.m5139equalsimpl0(j8, textLayoutResult.getLayoutInput().m4660getConstraintsmsEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            AbstractC3159y.f(textLayoutResult2);
            this.layoutCache = m983textLayoutResultVKLhPVY(layoutDirection, j8, textLayoutResult2.getMultiParagraph());
            return true;
        }
        this.layoutCache = m983textLayoutResultVKLhPVY(layoutDirection, j8, m980layoutTextK40F9xA(j8, layoutDirection));
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

    /* renamed from: update-ZNqEYIc, reason: not valid java name */
    public final void m985updateZNqEYIc(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i8, boolean z8, int i9, int i10, List<AnnotatedString.Range<Placeholder>> list) {
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
        this.placeholders = list;
        markDirty();
    }

    private MultiParagraphLayoutCache(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i8, boolean z8, int i9, int i10, List<AnnotatedString.Range<Placeholder>> list) {
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
        this.placeholders = list;
        this.lastDensity = InlineDensity.Companion.m974getUnspecifiedL26CHvs();
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i8, boolean z8, int i9, int i10, List list, int i11, AbstractC3151p abstractC3151p) {
        this(annotatedString, textStyle, resolver, (i11 & 8) != 0 ? TextOverflow.Companion.m5131getClipgIe3tQ8() : i8, (i11 & 16) != 0 ? true : z8, (i11 & 32) != 0 ? Integer.MAX_VALUE : i9, (i11 & 64) != 0 ? 1 : i10, (i11 & 128) != 0 ? null : list, null);
    }
}
