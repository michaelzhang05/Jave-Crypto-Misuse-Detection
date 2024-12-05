package androidx.compose.ui.text.platform.extensions;

import a6.InterfaceC1670p;
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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC1670p interfaceC1670p, Density density, boolean z8) {
        Locale locale;
        int m4814getNormal_LCdwA;
        int m4824getAllGVVA2EU;
        long m5369getTypeUIouoOA = TextUnit.m5369getTypeUIouoOA(spanStyle.m4657getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5403getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo452toPxR2X_6o(spanStyle.m4657getFontSizeXSAIIZE()));
        } else if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5402getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m5370getValueimpl(spanStyle.m4657getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m4658getFontStyle4Lr2A7w = spanStyle.m4658getFontStyle4Lr2A7w();
            if (m4658getFontStyle4Lr2A7w != null) {
                m4814getNormal_LCdwA = m4658getFontStyle4Lr2A7w.m4810unboximpl();
            } else {
                m4814getNormal_LCdwA = FontStyle.Companion.m4814getNormal_LCdwA();
            }
            FontStyle m4804boximpl = FontStyle.m4804boximpl(m4814getNormal_LCdwA);
            FontSynthesis m4659getFontSynthesisZQGJjVo = spanStyle.m4659getFontSynthesisZQGJjVo();
            if (m4659getFontSynthesisZQGJjVo != null) {
                m4824getAllGVVA2EU = m4659getFontSynthesisZQGJjVo.m4823unboximpl();
            } else {
                m4824getAllGVVA2EU = FontSynthesis.Companion.m4824getAllGVVA2EU();
            }
            androidTextPaint.setTypeface((Typeface) interfaceC1670p.invoke(fontFamily, fontWeight, m4804boximpl, FontSynthesis.m4815boximpl(m4824getAllGVVA2EU)));
        }
        if (spanStyle.getLocaleList() != null && !AbstractC3255y.d(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
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
        if (spanStyle.getFontFeatureSettings() != null && !AbstractC3255y.d(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !AbstractC3255y.d(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m4952setColor8_81llA(spanStyle.m4656getColor0d7_KjU());
        androidTextPaint.m4951setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m2817getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m5398equalsimpl0(TextUnit.m5369getTypeUIouoOA(spanStyle.m4660getLetterSpacingXSAIIZE()), companion.m5403getSpUIouoOA()) && TextUnit.m5370getValueimpl(spanStyle.m4660getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float mo452toPxR2X_6o = density.mo452toPxR2X_6o(spanStyle.m4660getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(mo452toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m5398equalsimpl0(TextUnit.m5369getTypeUIouoOA(spanStyle.m4660getLetterSpacingXSAIIZE()), companion.m5402getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m5370getValueimpl(spanStyle.m4660getLetterSpacingXSAIIZE()));
        }
        return m4966generateFallbackSpanStyle62GTOB8(spanStyle.m4660getLetterSpacingXSAIIZE(), z8, spanStyle.m4654getBackground0d7_KjU(), spanStyle.m4655getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC1670p interfaceC1670p, Density density, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, interfaceC1670p, density, z8);
    }

    public static final float correctBlurRadius(float f8) {
        if (f8 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f8;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m4966generateFallbackSpanStyle62GTOB8(long j8, boolean z8, long j9, BaselineShift baselineShift) {
        boolean z9;
        boolean z10;
        long m5381getUnspecifiedXSAIIZE;
        BaselineShift baselineShift2;
        long j10 = j9;
        boolean z11 = false;
        if (z8 && TextUnitType.m5398equalsimpl0(TextUnit.m5369getTypeUIouoOA(j8), TextUnitType.Companion.m5403getSpUIouoOA()) && TextUnit.m5370getValueimpl(j8) != 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Color.Companion companion = Color.Companion;
        if (!Color.m2977equalsimpl0(j10, companion.m3012getUnspecified0d7_KjU()) && !Color.m2977equalsimpl0(j10, companion.m3011getTransparent0d7_KjU())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (baselineShift != null) {
            if (!BaselineShift.m4974equalsimpl0(baselineShift.m4977unboximpl(), BaselineShift.Companion.m4981getNoney9eOQZs())) {
                z11 = true;
            }
        }
        if (!z9 && !z10 && !z11) {
            return null;
        }
        if (z9) {
            m5381getUnspecifiedXSAIIZE = j8;
        } else {
            m5381getUnspecifiedXSAIIZE = TextUnit.Companion.m5381getUnspecifiedXSAIIZE();
        }
        if (!z10) {
            j10 = companion.m3012getUnspecified0d7_KjU();
        }
        long j11 = j10;
        if (z11) {
            baselineShift2 = baselineShift;
        } else {
            baselineShift2 = null;
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, m5381getUnspecifiedXSAIIZE, baselineShift2, (TextGeometricTransform) null, (LocaleList) null, j11, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (AbstractC3247p) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        if (spanStyle.getFontFamily() == null && spanStyle.m4658getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) {
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
        int m5115getLinearity4e0Vf04$ui_text_release = textMotion.m5115getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m5119equalsimpl0(m5115getLinearity4e0Vf04$ui_text_release, companion.m5124getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m5119equalsimpl0(m5115getLinearity4e0Vf04$ui_text_release, companion.m5123getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m5119equalsimpl0(m5115getLinearity4e0Vf04$ui_text_release, companion.m5125getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }
}
