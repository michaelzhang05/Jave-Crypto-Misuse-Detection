package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m3006getTransparent0d7_KjU();
        DefaultColor = companion.m2997getBlack0d7_KjU();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m5362equalsimpl0(r26, r21.m4652getFontSizeXSAIIZE()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0059, code lost:
    
        if (androidx.compose.ui.graphics.Color.m2972equalsimpl0(r22, r21.getTextForegroundStyle$ui_text_release().mo4980getColor0d7_KjU()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0065, code lost:
    
        if (kotlin.jvm.internal.AbstractC3159y.d(r6, r21.m4653getFontStyle4Lr2A7w()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0071, code lost:
    
        if (kotlin.jvm.internal.AbstractC3159y.d(r5, r21.getFontWeight()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0079, code lost:
    
        if (r31 != r21.getFontFamily()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x008d, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m5362equalsimpl0(r33, r21.m4655getLetterSpacingXSAIIZE()) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.SpanStyle m4656fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle r21, long r22, androidx.compose.ui.graphics.Brush r24, float r25, long r26, androidx.compose.ui.text.font.FontWeight r28, androidx.compose.ui.text.font.FontStyle r29, androidx.compose.ui.text.font.FontSynthesis r30, androidx.compose.ui.text.font.FontFamily r31, java.lang.String r32, long r33, androidx.compose.ui.text.style.BaselineShift r35, androidx.compose.ui.text.style.TextGeometricTransform r36, androidx.compose.ui.text.intl.LocaleList r37, long r38, androidx.compose.ui.text.style.TextDecoration r40, androidx.compose.ui.graphics.Shadow r41, androidx.compose.ui.text.PlatformSpanStyle r42, androidx.compose.ui.graphics.drawscope.DrawStyle r43) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyleKt.m4656fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f8) {
        float m4967constructorimpl;
        float m4967constructorimpl2;
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text_release(), spanStyle2.getTextForegroundStyle$ui_text_release(), f8);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f8);
        long m4657lerpTextUnitInheritableC3pnCVY = m4657lerpTextUnitInheritableC3pnCVY(spanStyle.m4652getFontSizeXSAIIZE(), spanStyle2.m4652getFontSizeXSAIIZE(), f8);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f8);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m4653getFontStyle4Lr2A7w(), spanStyle2.m4653getFontStyle4Lr2A7w(), f8);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m4654getFontSynthesisZQGJjVo(), spanStyle2.m4654getFontSynthesisZQGJjVo(), f8);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f8);
        long m4657lerpTextUnitInheritableC3pnCVY2 = m4657lerpTextUnitInheritableC3pnCVY(spanStyle.m4655getLetterSpacingXSAIIZE(), spanStyle2.m4655getLetterSpacingXSAIIZE(), f8);
        BaselineShift m4650getBaselineShift5SSeXJ0 = spanStyle.m4650getBaselineShift5SSeXJ0();
        if (m4650getBaselineShift5SSeXJ0 != null) {
            m4967constructorimpl = m4650getBaselineShift5SSeXJ0.m4972unboximpl();
        } else {
            m4967constructorimpl = BaselineShift.m4967constructorimpl(0.0f);
        }
        BaselineShift m4650getBaselineShift5SSeXJ02 = spanStyle2.m4650getBaselineShift5SSeXJ0();
        if (m4650getBaselineShift5SSeXJ02 != null) {
            m4967constructorimpl2 = m4650getBaselineShift5SSeXJ02.m4972unboximpl();
        } else {
            m4967constructorimpl2 = BaselineShift.m4967constructorimpl(0.0f);
        }
        float m4979lerpjWV1Mfo = BaselineShiftKt.m4979lerpjWV1Mfo(m4967constructorimpl, m4967constructorimpl2, f8);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f8);
        LocaleList localeList = (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f8);
        long m3022lerpjxsXWHM = ColorKt.m3022lerpjxsXWHM(spanStyle.m4649getBackground0d7_KjU(), spanStyle2.m4649getBackground0d7_KjU(), f8);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f8);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lerp, m4657lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m4657lerpTextUnitInheritableC3pnCVY2, BaselineShift.m4966boximpl(m4979lerpjWV1Mfo), lerp3, localeList, m3022lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f8), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f8), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f8), (AbstractC3151p) null);
    }

    public static final <T> T lerpDiscrete(T t8, T t9, float f8) {
        return ((double) f8) < 0.5d ? t8 : t9;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f8) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f8);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m4657lerpTextUnitInheritableC3pnCVY(long j8, long j9, float f8) {
        if (!TextUnitKt.m5383isUnspecifiedR2X_6o(j8) && !TextUnitKt.m5383isUnspecifiedR2X_6o(j9)) {
            return TextUnitKt.m5385lerpC3pnCVY(j8, j9, f8);
        }
        return ((TextUnit) lerpDiscrete(TextUnit.m5355boximpl(j8), TextUnit.m5355boximpl(j9), f8)).m5374unboximpl();
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        long m4652getFontSizeXSAIIZE;
        int m4809getNormal_LCdwA;
        int m4819getAllGVVA2EU;
        long m4655getLetterSpacingXSAIIZE;
        float m4976getNoney9eOQZs;
        TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle$ui_text_release().takeOrElse(SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE);
        if (TextUnitKt.m5383isUnspecifiedR2X_6o(spanStyle.m4652getFontSizeXSAIIZE())) {
            m4652getFontSizeXSAIIZE = DefaultFontSize;
        } else {
            m4652getFontSizeXSAIIZE = spanStyle.m4652getFontSizeXSAIIZE();
        }
        long j8 = m4652getFontSizeXSAIIZE;
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
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
        FontSynthesis m4810boximpl = FontSynthesis.m4810boximpl(m4819getAllGVVA2EU);
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (TextUnitKt.m5383isUnspecifiedR2X_6o(spanStyle.m4655getLetterSpacingXSAIIZE())) {
            m4655getLetterSpacingXSAIIZE = DefaultLetterSpacing;
        } else {
            m4655getLetterSpacingXSAIIZE = spanStyle.m4655getLetterSpacingXSAIIZE();
        }
        long j9 = m4655getLetterSpacingXSAIIZE;
        BaselineShift m4650getBaselineShift5SSeXJ0 = spanStyle.m4650getBaselineShift5SSeXJ0();
        if (m4650getBaselineShift5SSeXJ0 != null) {
            m4976getNoney9eOQZs = m4650getBaselineShift5SSeXJ0.m4972unboximpl();
        } else {
            m4976getNoney9eOQZs = BaselineShift.Companion.m4976getNoney9eOQZs();
        }
        BaselineShift m4966boximpl = BaselineShift.m4966boximpl(m4976getNoney9eOQZs);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m4649getBackground0d7_KjU = spanStyle.m4649getBackground0d7_KjU();
        if (m4649getBackground0d7_KjU == Color.Companion.m3007getUnspecified0d7_KjU()) {
            m4649getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j10 = m4649getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, j8, fontWeight2, m4799boximpl, m4810boximpl, fontFamily2, str, j9, m4966boximpl, textGeometricTransform2, localeList2, j10, textDecoration2, shadow2, platformStyle, drawStyle, (AbstractC3151p) null);
    }
}
