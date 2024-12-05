package androidx.compose.ui.text.platform.extensions;

import X5.p;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, p pVar, Density density, boolean z8) {
        Locale locale;
        int m4809getNormal_LCdwA;
        int m4819getAllGVVA2EU;
        long m5364getTypeUIouoOA = TextUnit.m5364getTypeUIouoOA(spanStyle.m4652getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5393equalsimpl0(m5364getTypeUIouoOA, companion.m5398getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo447toPxR2X_6o(spanStyle.m4652getFontSizeXSAIIZE()));
        } else if (TextUnitType.m5393equalsimpl0(m5364getTypeUIouoOA, companion.m5397getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m5365getValueimpl(spanStyle.m4652getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m4653getFontStyle4Lr2A7w = spanStyle.m4653getFontStyle4Lr2A7w();
            if (m4653getFontStyle4Lr2A7w != null) {
                m4809getNormal_LCdwA = m4653getFontStyle4Lr2A7w.m4805unboximpl();
            } else {
                m4809getNormal_LCdwA = FontStyle.Companion.m4809getNormal_LCdwA();
            }
            FontStyle m4799boximpl = FontStyle.m4799boximpl(m4809getNormal_LCdwA);
            FontSynthesis m4654getFontSynthesisZQGJjVo = spanStyle.m4654getFontSynthesisZQGJjVo();
            if (m4654getFontSynthesisZQGJjVo != null) {
                m4819getAllGVVA2EU = m4654getFontSynthesisZQGJjVo.m4818unboximpl();
            } else {
                m4819getAllGVVA2EU = FontSynthesis.Companion.m4819getAllGVVA2EU();
            }
            androidTextPaint.setTypeface((Typeface) pVar.invoke(fontFamily, fontWeight, m4799boximpl, FontSynthesis.m4810boximpl(m4819getAllGVVA2EU)));
        }
        if (spanStyle.getLocaleList() != null && !AbstractC3159y.d(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
            } else {
                if (spanStyle.getLocaleList().isEmpty()) {
                    locale = Locale.Companion.getCurrent();
                } else {
                    locale = spanStyle.getLocaleList().get(0);
                }
                androidTextPaint.setTextLocale(LocaleExtensions_androidKt.toJavaLocale(locale));
            }
        }
        if (spanStyle.getFontFeatureSettings() != null && !AbstractC3159y.d(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !AbstractC3159y.d(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m4947setColor8_81llA(spanStyle.m4651getColor0d7_KjU());
        androidTextPaint.m4946setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m2812getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m5393equalsimpl0(TextUnit.m5364getTypeUIouoOA(spanStyle.m4655getLetterSpacingXSAIIZE()), companion.m5398getSpUIouoOA()) && TextUnit.m5365getValueimpl(spanStyle.m4655getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float mo447toPxR2X_6o = density.mo447toPxR2X_6o(spanStyle.m4655getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(mo447toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m5393equalsimpl0(TextUnit.m5364getTypeUIouoOA(spanStyle.m4655getLetterSpacingXSAIIZE()), companion.m5397getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m5365getValueimpl(spanStyle.m4655getLetterSpacingXSAIIZE()));
        }
        return m4961generateFallbackSpanStyle62GTOB8(spanStyle.m4655getLetterSpacingXSAIIZE(), z8, spanStyle.m4649getBackground0d7_KjU(), spanStyle.m4650getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, p pVar, Density density, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, pVar, density, z8);
    }

    public static final float correctBlurRadius(float f8) {
        if (f8 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f8;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m4961generateFallbackSpanStyle62GTOB8(long j8, boolean z8, long j9, BaselineShift baselineShift) {
        boolean z9;
        boolean z10;
        long m5376getUnspecifiedXSAIIZE;
        BaselineShift baselineShift2;
        long j10 = j9;
        boolean z11 = false;
        if (z8 && TextUnitType.m5393equalsimpl0(TextUnit.m5364getTypeUIouoOA(j8), TextUnitType.Companion.m5398getSpUIouoOA()) && TextUnit.m5365getValueimpl(j8) != 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Color.Companion companion = Color.Companion;
        if (!Color.m2972equalsimpl0(j10, companion.m3007getUnspecified0d7_KjU()) && !Color.m2972equalsimpl0(j10, companion.m3006getTransparent0d7_KjU())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (baselineShift != null) {
            if (!BaselineShift.m4969equalsimpl0(baselineShift.m4972unboximpl(), BaselineShift.Companion.m4976getNoney9eOQZs())) {
                z11 = true;
            }
        }
        if (!z9 && !z10 && !z11) {
            return null;
        }
        if (z9) {
            m5376getUnspecifiedXSAIIZE = j8;
        } else {
            m5376getUnspecifiedXSAIIZE = TextUnit.Companion.m5376getUnspecifiedXSAIIZE();
        }
        if (!z10) {
            j10 = companion.m3007getUnspecified0d7_KjU();
        }
        long j11 = j10;
        if (z11) {
            baselineShift2 = baselineShift;
        } else {
            baselineShift2 = null;
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, m5376getUnspecifiedXSAIIZE, baselineShift2, (TextGeometricTransform) null, (LocaleList) null, j11, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (AbstractC3151p) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        if (spanStyle.getFontFamily() == null && spanStyle.m4653getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) {
            return false;
        }
        return true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        int flags;
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning$ui_text_release()) {
            flags = androidTextPaint.getFlags() | 128;
        } else {
            flags = androidTextPaint.getFlags() & (-129);
        }
        androidTextPaint.setFlags(flags);
        int m5110getLinearity4e0Vf04$ui_text_release = textMotion.m5110getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m5114equalsimpl0(m5110getLinearity4e0Vf04$ui_text_release, companion.m5119getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m5114equalsimpl0(m5110getLinearity4e0Vf04$ui_text_release, companion.m5118getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m5114equalsimpl0(m5110getLinearity4e0Vf04$ui_text_release, companion.m5120getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }
}
