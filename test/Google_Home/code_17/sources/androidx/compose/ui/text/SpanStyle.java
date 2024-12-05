package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class SpanStyle {
    public static final int $stable = 0;
    private final long background;
    private final BaselineShift baselineShift;
    private final DrawStyle drawStyle;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final LocaleList localeList;
    private final PlatformSpanStyle platformStyle;
    private final Shadow shadow;
    private final TextDecoration textDecoration;
    private final TextForegroundStyle textForegroundStyle;
    private final TextGeometricTransform textGeometricTransform;

    public /* synthetic */ SpanStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, AbstractC3247p abstractC3247p) {
        this(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    /* renamed from: copy-2BkPm_w$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m4646copy2BkPm_w$default(SpanStyle spanStyle, long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i8, Object obj) {
        long j12;
        long j13;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        FontFamily fontFamily2;
        String str2;
        long j14;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j15;
        TextDecoration textDecoration2;
        Shadow shadow2;
        PlatformSpanStyle platformSpanStyle2;
        if ((i8 & 1) != 0) {
            j12 = spanStyle.m4656getColor0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i8 & 2) != 0) {
            j13 = spanStyle.fontSize;
        } else {
            j13 = j9;
        }
        if ((i8 & 4) != 0) {
            fontWeight2 = spanStyle.fontWeight;
        } else {
            fontWeight2 = fontWeight;
        }
        if ((i8 & 8) != 0) {
            fontStyle2 = spanStyle.fontStyle;
        } else {
            fontStyle2 = fontStyle;
        }
        if ((i8 & 16) != 0) {
            fontSynthesis2 = spanStyle.fontSynthesis;
        } else {
            fontSynthesis2 = fontSynthesis;
        }
        if ((i8 & 32) != 0) {
            fontFamily2 = spanStyle.fontFamily;
        } else {
            fontFamily2 = fontFamily;
        }
        if ((i8 & 64) != 0) {
            str2 = spanStyle.fontFeatureSettings;
        } else {
            str2 = str;
        }
        if ((i8 & 128) != 0) {
            j14 = spanStyle.letterSpacing;
        } else {
            j14 = j10;
        }
        if ((i8 & 256) != 0) {
            baselineShift2 = spanStyle.baselineShift;
        } else {
            baselineShift2 = baselineShift;
        }
        if ((i8 & 512) != 0) {
            textGeometricTransform2 = spanStyle.textGeometricTransform;
        } else {
            textGeometricTransform2 = textGeometricTransform;
        }
        if ((i8 & 1024) != 0) {
            localeList2 = spanStyle.localeList;
        } else {
            localeList2 = localeList;
        }
        LocaleList localeList3 = localeList2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        if ((i8 & 2048) != 0) {
            j15 = spanStyle.background;
        } else {
            j15 = j11;
        }
        long j16 = j15;
        if ((i8 & 4096) != 0) {
            textDecoration2 = spanStyle.textDecoration;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i8 & 8192) != 0) {
            shadow2 = spanStyle.shadow;
        } else {
            shadow2 = shadow;
        }
        if ((i8 & 16384) != 0) {
            platformSpanStyle2 = spanStyle.platformStyle;
        } else {
            platformSpanStyle2 = platformSpanStyle;
        }
        return spanStyle.m4650copy2BkPm_w(j12, j13, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j14, baselineShift2, textGeometricTransform3, localeList3, j16, textDecoration2, shadow2, platformSpanStyle2);
    }

    /* renamed from: copy-GSF8kmg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m4647copyGSF8kmg$default(SpanStyle spanStyle, long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i8, Object obj) {
        long j12;
        long j13;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        FontFamily fontFamily2;
        String str2;
        long j14;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j15;
        TextDecoration textDecoration2;
        Shadow shadow2;
        PlatformSpanStyle platformSpanStyle2;
        DrawStyle drawStyle2;
        if ((i8 & 1) != 0) {
            j12 = spanStyle.m4656getColor0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i8 & 2) != 0) {
            j13 = spanStyle.fontSize;
        } else {
            j13 = j9;
        }
        if ((i8 & 4) != 0) {
            fontWeight2 = spanStyle.fontWeight;
        } else {
            fontWeight2 = fontWeight;
        }
        if ((i8 & 8) != 0) {
            fontStyle2 = spanStyle.fontStyle;
        } else {
            fontStyle2 = fontStyle;
        }
        if ((i8 & 16) != 0) {
            fontSynthesis2 = spanStyle.fontSynthesis;
        } else {
            fontSynthesis2 = fontSynthesis;
        }
        if ((i8 & 32) != 0) {
            fontFamily2 = spanStyle.fontFamily;
        } else {
            fontFamily2 = fontFamily;
        }
        if ((i8 & 64) != 0) {
            str2 = spanStyle.fontFeatureSettings;
        } else {
            str2 = str;
        }
        if ((i8 & 128) != 0) {
            j14 = spanStyle.letterSpacing;
        } else {
            j14 = j10;
        }
        if ((i8 & 256) != 0) {
            baselineShift2 = spanStyle.baselineShift;
        } else {
            baselineShift2 = baselineShift;
        }
        if ((i8 & 512) != 0) {
            textGeometricTransform2 = spanStyle.textGeometricTransform;
        } else {
            textGeometricTransform2 = textGeometricTransform;
        }
        if ((i8 & 1024) != 0) {
            localeList2 = spanStyle.localeList;
        } else {
            localeList2 = localeList;
        }
        LocaleList localeList3 = localeList2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        if ((i8 & 2048) != 0) {
            j15 = spanStyle.background;
        } else {
            j15 = j11;
        }
        long j16 = j15;
        if ((i8 & 4096) != 0) {
            textDecoration2 = spanStyle.textDecoration;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i8 & 8192) != 0) {
            shadow2 = spanStyle.shadow;
        } else {
            shadow2 = shadow;
        }
        Shadow shadow3 = shadow2;
        if ((i8 & 16384) != 0) {
            platformSpanStyle2 = spanStyle.platformStyle;
        } else {
            platformSpanStyle2 = platformSpanStyle;
        }
        if ((i8 & 32768) != 0) {
            drawStyle2 = spanStyle.drawStyle;
        } else {
            drawStyle2 = drawStyle;
        }
        return spanStyle.m4651copyGSF8kmg(j12, j13, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j14, baselineShift2, textGeometricTransform3, localeList3, j16, textDecoration2, shadow3, platformSpanStyle2, drawStyle2);
    }

    /* renamed from: copy-IuqyXdg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m4648copyIuqyXdg$default(SpanStyle spanStyle, long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, int i8, Object obj) {
        long j12;
        long j13;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        FontFamily fontFamily2;
        String str2;
        long j14;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j15;
        TextDecoration textDecoration2;
        Shadow shadow2;
        if ((i8 & 1) != 0) {
            j12 = spanStyle.m4656getColor0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i8 & 2) != 0) {
            j13 = spanStyle.fontSize;
        } else {
            j13 = j9;
        }
        if ((i8 & 4) != 0) {
            fontWeight2 = spanStyle.fontWeight;
        } else {
            fontWeight2 = fontWeight;
        }
        if ((i8 & 8) != 0) {
            fontStyle2 = spanStyle.fontStyle;
        } else {
            fontStyle2 = fontStyle;
        }
        if ((i8 & 16) != 0) {
            fontSynthesis2 = spanStyle.fontSynthesis;
        } else {
            fontSynthesis2 = fontSynthesis;
        }
        if ((i8 & 32) != 0) {
            fontFamily2 = spanStyle.fontFamily;
        } else {
            fontFamily2 = fontFamily;
        }
        if ((i8 & 64) != 0) {
            str2 = spanStyle.fontFeatureSettings;
        } else {
            str2 = str;
        }
        if ((i8 & 128) != 0) {
            j14 = spanStyle.letterSpacing;
        } else {
            j14 = j10;
        }
        if ((i8 & 256) != 0) {
            baselineShift2 = spanStyle.baselineShift;
        } else {
            baselineShift2 = baselineShift;
        }
        if ((i8 & 512) != 0) {
            textGeometricTransform2 = spanStyle.textGeometricTransform;
        } else {
            textGeometricTransform2 = textGeometricTransform;
        }
        if ((i8 & 1024) != 0) {
            localeList2 = spanStyle.localeList;
        } else {
            localeList2 = localeList;
        }
        LocaleList localeList3 = localeList2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        if ((i8 & 2048) != 0) {
            j15 = spanStyle.background;
        } else {
            j15 = j11;
        }
        long j16 = j15;
        if ((i8 & 4096) != 0) {
            textDecoration2 = spanStyle.textDecoration;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i8 & 8192) != 0) {
            shadow2 = spanStyle.shadow;
        } else {
            shadow2 = shadow;
        }
        return spanStyle.m4652copyIuqyXdg(j12, j13, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j14, baselineShift2, textGeometricTransform3, localeList3, j16, textDecoration2, shadow2);
    }

    /* renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m4649copyNcG25M8$default(SpanStyle spanStyle, Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i8, Object obj) {
        Shadow shadow2;
        PlatformSpanStyle platformSpanStyle2;
        float alpha = (i8 & 2) != 0 ? spanStyle.getAlpha() : f8;
        long j11 = (i8 & 4) != 0 ? spanStyle.fontSize : j8;
        FontWeight fontWeight2 = (i8 & 8) != 0 ? spanStyle.fontWeight : fontWeight;
        FontStyle fontStyle2 = (i8 & 16) != 0 ? spanStyle.fontStyle : fontStyle;
        FontSynthesis fontSynthesis2 = (i8 & 32) != 0 ? spanStyle.fontSynthesis : fontSynthesis;
        FontFamily fontFamily2 = (i8 & 64) != 0 ? spanStyle.fontFamily : fontFamily;
        String str2 = (i8 & 128) != 0 ? spanStyle.fontFeatureSettings : str;
        long j12 = (i8 & 256) != 0 ? spanStyle.letterSpacing : j9;
        BaselineShift baselineShift2 = (i8 & 512) != 0 ? spanStyle.baselineShift : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i8 & 1024) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        LocaleList localeList2 = (i8 & 2048) != 0 ? spanStyle.localeList : localeList;
        long j13 = (i8 & 4096) != 0 ? spanStyle.background : j10;
        TextDecoration textDecoration2 = (i8 & 8192) != 0 ? spanStyle.textDecoration : textDecoration;
        Shadow shadow3 = (i8 & 16384) != 0 ? spanStyle.shadow : shadow;
        if ((i8 & 32768) != 0) {
            shadow2 = shadow3;
            platformSpanStyle2 = spanStyle.platformStyle;
        } else {
            shadow2 = shadow3;
            platformSpanStyle2 = platformSpanStyle;
        }
        return spanStyle.m4653copyNcG25M8(brush, alpha, j11, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j12, baselineShift2, textGeometricTransform2, localeList2, j13, textDecoration2, shadow2, platformSpanStyle2, (i8 & 65536) != 0 ? spanStyle.drawStyle : drawStyle);
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    /* renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ SpanStyle m4650copy2BkPm_w(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        TextForegroundStyle m5108from8_81llA;
        if (Color.m2977equalsimpl0(j8, m4656getColor0d7_KjU())) {
            m5108from8_81llA = this.textForegroundStyle;
        } else {
            m5108from8_81llA = TextForegroundStyle.Companion.m5108from8_81llA(j8);
        }
        return new SpanStyle(m5108from8_81llA, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (AbstractC3247p) null);
    }

    /* renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m4651copyGSF8kmg(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        TextForegroundStyle m5108from8_81llA;
        if (Color.m2977equalsimpl0(j8, m4656getColor0d7_KjU())) {
            m5108from8_81llA = this.textForegroundStyle;
        } else {
            m5108from8_81llA = TextForegroundStyle.Companion.m5108from8_81llA(j8);
        }
        return new SpanStyle(m5108from8_81llA, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, drawStyle, (AbstractC3247p) null);
    }

    /* renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ SpanStyle m4652copyIuqyXdg(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow) {
        TextForegroundStyle m5108from8_81llA;
        if (Color.m2977equalsimpl0(j8, m4656getColor0d7_KjU())) {
            m5108from8_81llA = this.textForegroundStyle;
        } else {
            m5108from8_81llA = TextForegroundStyle.Companion.m5108from8_81llA(j8);
        }
        return new SpanStyle(m5108from8_81llA, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, this.platformStyle, this.drawStyle, (AbstractC3247p) null);
    }

    /* renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m4653copyNcG25M8(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush, f8), j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformSpanStyle, drawStyle, (AbstractC3247p) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        if (hasSameLayoutAffectingAttributes$ui_text_release(spanStyle) && hasSameNonLayoutAttributes$ui_text_release(spanStyle)) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m4654getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m4655getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4656getColor0d7_KjU() {
        return this.textForegroundStyle.mo4985getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m4657getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m4658getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m4659getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m4660getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final TextForegroundStyle getTextForegroundStyle$ui_text_release() {
        return this.textForegroundStyle;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        if (TextUnit.m5367equalsimpl0(this.fontSize, spanStyle.fontSize) && AbstractC3255y.d(this.fontWeight, spanStyle.fontWeight) && AbstractC3255y.d(this.fontStyle, spanStyle.fontStyle) && AbstractC3255y.d(this.fontSynthesis, spanStyle.fontSynthesis) && AbstractC3255y.d(this.fontFamily, spanStyle.fontFamily) && AbstractC3255y.d(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.m5367equalsimpl0(this.letterSpacing, spanStyle.letterSpacing) && AbstractC3255y.d(this.baselineShift, spanStyle.baselineShift) && AbstractC3255y.d(this.textGeometricTransform, spanStyle.textGeometricTransform) && AbstractC3255y.d(this.localeList, spanStyle.localeList) && Color.m2977equalsimpl0(this.background, spanStyle.background) && AbstractC3255y.d(this.platformStyle, spanStyle.platformStyle)) {
            return true;
        }
        return false;
    }

    public final boolean hasSameNonLayoutAttributes$ui_text_release(SpanStyle spanStyle) {
        if (!AbstractC3255y.d(this.textForegroundStyle, spanStyle.textForegroundStyle) || !AbstractC3255y.d(this.textDecoration, spanStyle.textDecoration) || !AbstractC3255y.d(this.shadow, spanStyle.shadow) || !AbstractC3255y.d(this.drawStyle, spanStyle.drawStyle)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int m2983hashCodeimpl = Color.m2983hashCodeimpl(m4656getColor0d7_KjU()) * 31;
        Brush brush = getBrush();
        int i20 = 0;
        if (brush != null) {
            i8 = brush.hashCode();
        } else {
            i8 = 0;
        }
        int floatToIntBits = (((((m2983hashCodeimpl + i8) * 31) + Float.floatToIntBits(getAlpha())) * 31) + TextUnit.m5371hashCodeimpl(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        if (fontWeight != null) {
            i9 = fontWeight.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (floatToIntBits + i9) * 31;
        FontStyle fontStyle = this.fontStyle;
        if (fontStyle != null) {
            i10 = FontStyle.m4808hashCodeimpl(fontStyle.m4810unboximpl());
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        if (fontSynthesis != null) {
            i11 = FontSynthesis.m4819hashCodeimpl(fontSynthesis.m4823unboximpl());
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 31;
        FontFamily fontFamily = this.fontFamily;
        if (fontFamily != null) {
            i12 = fontFamily.hashCode();
        } else {
            i12 = 0;
        }
        int i24 = (i23 + i12) * 31;
        String str = this.fontFeatureSettings;
        if (str != null) {
            i13 = str.hashCode();
        } else {
            i13 = 0;
        }
        int m5371hashCodeimpl = (((i24 + i13) * 31) + TextUnit.m5371hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        if (baselineShift != null) {
            i14 = BaselineShift.m4975hashCodeimpl(baselineShift.m4977unboximpl());
        } else {
            i14 = 0;
        }
        int i25 = (m5371hashCodeimpl + i14) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        if (textGeometricTransform != null) {
            i15 = textGeometricTransform.hashCode();
        } else {
            i15 = 0;
        }
        int i26 = (i25 + i15) * 31;
        LocaleList localeList = this.localeList;
        if (localeList != null) {
            i16 = localeList.hashCode();
        } else {
            i16 = 0;
        }
        int m2983hashCodeimpl2 = (((i26 + i16) * 31) + Color.m2983hashCodeimpl(this.background)) * 31;
        TextDecoration textDecoration = this.textDecoration;
        if (textDecoration != null) {
            i17 = textDecoration.hashCode();
        } else {
            i17 = 0;
        }
        int i27 = (m2983hashCodeimpl2 + i17) * 31;
        Shadow shadow = this.shadow;
        if (shadow != null) {
            i18 = shadow.hashCode();
        } else {
            i18 = 0;
        }
        int i28 = (i27 + i18) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        if (platformSpanStyle != null) {
            i19 = platformSpanStyle.hashCode();
        } else {
            i19 = 0;
        }
        int i29 = (i28 + i19) * 31;
        DrawStyle drawStyle = this.drawStyle;
        if (drawStyle != null) {
            i20 = drawStyle.hashCode();
        }
        return i29 + i20;
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int m5371hashCodeimpl = TextUnit.m5371hashCodeimpl(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int i16 = 0;
        if (fontWeight != null) {
            i8 = fontWeight.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (m5371hashCodeimpl + i8) * 31;
        FontStyle fontStyle = this.fontStyle;
        if (fontStyle != null) {
            i9 = FontStyle.m4808hashCodeimpl(fontStyle.m4810unboximpl());
        } else {
            i9 = 0;
        }
        int i18 = (i17 + i9) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        if (fontSynthesis != null) {
            i10 = FontSynthesis.m4819hashCodeimpl(fontSynthesis.m4823unboximpl());
        } else {
            i10 = 0;
        }
        int i19 = (i18 + i10) * 31;
        FontFamily fontFamily = this.fontFamily;
        if (fontFamily != null) {
            i11 = fontFamily.hashCode();
        } else {
            i11 = 0;
        }
        int i20 = (i19 + i11) * 31;
        String str = this.fontFeatureSettings;
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        int m5371hashCodeimpl2 = (((i20 + i12) * 31) + TextUnit.m5371hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        if (baselineShift != null) {
            i13 = BaselineShift.m4975hashCodeimpl(baselineShift.m4977unboximpl());
        } else {
            i13 = 0;
        }
        int i21 = (m5371hashCodeimpl2 + i13) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        if (textGeometricTransform != null) {
            i14 = textGeometricTransform.hashCode();
        } else {
            i14 = 0;
        }
        int i22 = (i21 + i14) * 31;
        LocaleList localeList = this.localeList;
        if (localeList != null) {
            i15 = localeList.hashCode();
        } else {
            i15 = 0;
        }
        int m2983hashCodeimpl = (((i22 + i15) * 31) + Color.m2983hashCodeimpl(this.background)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        if (platformSpanStyle != null) {
            i16 = platformSpanStyle.hashCode();
        }
        return m2983hashCodeimpl + i16;
    }

    @Stable
    public final SpanStyle merge(SpanStyle spanStyle) {
        if (spanStyle == null) {
            return this;
        }
        return SpanStyleKt.m4661fastMergedSHsh3o(this, spanStyle.textForegroundStyle.mo4985getColor0d7_KjU(), spanStyle.textForegroundStyle.getBrush(), spanStyle.textForegroundStyle.getAlpha(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.background, spanStyle.textDecoration, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    @Stable
    public final SpanStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.m2984toStringimpl(m4656getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m5377toStringimpl(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) TextUnit.m5377toStringimpl(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.m2984toStringimpl(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    public /* synthetic */ SpanStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, AbstractC3247p abstractC3247p) {
        this(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle);
    }

    public /* synthetic */ SpanStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, AbstractC3247p abstractC3247p) {
        this(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, AbstractC3247p abstractC3247p) {
        this(brush, f8, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, AbstractC3247p abstractC3247p) {
        this(textForegroundStyle, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j8;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j9;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j10;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i8, AbstractC3247p abstractC3247p) {
        this(textForegroundStyle, (i8 & 2) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j8, (i8 & 4) != 0 ? null : fontWeight, (i8 & 8) != 0 ? null : fontStyle, (i8 & 16) != 0 ? null : fontSynthesis, (i8 & 32) != 0 ? null : fontFamily, (i8 & 64) != 0 ? null : str, (i8 & 128) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j9, (i8 & 256) != 0 ? null : baselineShift, (i8 & 512) != 0 ? null : textGeometricTransform, (i8 & 1024) != 0 ? null : localeList, (i8 & 2048) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j10, (i8 & 4096) != 0 ? null : textDecoration, (i8 & 8192) != 0 ? null : shadow, (i8 & 16384) != 0 ? null : platformSpanStyle, (i8 & 32768) != 0 ? null : drawStyle, (AbstractC3247p) null);
    }

    public /* synthetic */ SpanStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j9, (i8 & 4) != 0 ? null : fontWeight, (i8 & 8) != 0 ? null : fontStyle, (i8 & 16) != 0 ? null : fontSynthesis, (i8 & 32) != 0 ? null : fontFamily, (i8 & 64) != 0 ? null : str, (i8 & 128) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j10, (i8 & 256) != 0 ? null : baselineShift, (i8 & 512) != 0 ? null : textGeometricTransform, (i8 & 1024) != 0 ? null : localeList, (i8 & 2048) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j11, (i8 & 4096) != 0 ? null : textDecoration, (i8 & 8192) != 0 ? null : shadow, (AbstractC3247p) null);
    }

    private SpanStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow) {
        this(TextForegroundStyle.Companion.m5108from8_81llA(j8), j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, 32768, (AbstractC3247p) null);
    }

    public /* synthetic */ SpanStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j9, (i8 & 4) != 0 ? null : fontWeight, (i8 & 8) != 0 ? null : fontStyle, (i8 & 16) != 0 ? null : fontSynthesis, (i8 & 32) != 0 ? null : fontFamily, (i8 & 64) != 0 ? null : str, (i8 & 128) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j10, (i8 & 256) != 0 ? null : baselineShift, (i8 & 512) != 0 ? null : textGeometricTransform, (i8 & 1024) != 0 ? null : localeList, (i8 & 2048) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j11, (i8 & 4096) != 0 ? null : textDecoration, (i8 & 8192) != 0 ? null : shadow, (i8 & 16384) != 0 ? null : platformSpanStyle, (AbstractC3247p) null);
    }

    private SpanStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.m5108from8_81llA(j8), j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (AbstractC3247p) null);
    }

    public /* synthetic */ SpanStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j9, (i8 & 4) != 0 ? null : fontWeight, (i8 & 8) != 0 ? null : fontStyle, (i8 & 16) != 0 ? null : fontSynthesis, (i8 & 32) != 0 ? null : fontFamily, (i8 & 64) != 0 ? null : str, (i8 & 128) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j10, (i8 & 256) != 0 ? null : baselineShift, (i8 & 512) != 0 ? null : textGeometricTransform, (i8 & 1024) != 0 ? null : localeList, (i8 & 2048) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j11, (i8 & 4096) != 0 ? null : textDecoration, (i8 & 8192) != 0 ? null : shadow, (i8 & 16384) != 0 ? null : platformSpanStyle, (i8 & 32768) != 0 ? null : drawStyle, (AbstractC3247p) null);
    }

    private SpanStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.m5108from8_81llA(j8), j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, drawStyle, (AbstractC3247p) null);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i8, AbstractC3247p abstractC3247p) {
        this(brush, (i8 & 2) != 0 ? Float.NaN : f8, (i8 & 4) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j8, (i8 & 8) != 0 ? null : fontWeight, (i8 & 16) != 0 ? null : fontStyle, (i8 & 32) != 0 ? null : fontSynthesis, (i8 & 64) != 0 ? null : fontFamily, (i8 & 128) != 0 ? null : str, (i8 & 256) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j9, (i8 & 512) != 0 ? null : baselineShift, (i8 & 1024) != 0 ? null : textGeometricTransform, (i8 & 2048) != 0 ? null : localeList, (i8 & 4096) != 0 ? Color.Companion.m3012getUnspecified0d7_KjU() : j10, (i8 & 8192) != 0 ? null : textDecoration, (i8 & 16384) != 0 ? null : shadow, (32768 & i8) != 0 ? null : platformSpanStyle, (i8 & 65536) != 0 ? null : drawStyle, (AbstractC3247p) null);
    }

    private SpanStyle(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.from(brush, f8), j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformSpanStyle, drawStyle, (AbstractC3247p) null);
    }
}
