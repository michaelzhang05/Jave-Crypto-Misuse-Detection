package androidx.compose.ui.text.platform.extensions;

import P5.AbstractC1371l;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import c6.AbstractC2055a;
import j6.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m4958createLetterSpacingSpaneAf_CNQ(long j8, Density density) {
        long m5369getTypeUIouoOA = TextUnit.m5369getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5403getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo452toPxR2X_6o(j8));
        }
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5402getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m5370getValueimpl(j8));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, InterfaceC1669o interfaceC1669o) {
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                interfaceC1669o.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = list.size();
        int i8 = size * 2;
        Integer[] numArr = new Integer[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            numArr[i9] = 0;
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i10);
            numArr[i10] = Integer.valueOf(range.getStart());
            numArr[i10 + size] = Integer.valueOf(range.getEnd());
        }
        AbstractC1371l.J(numArr);
        int intValue = ((Number) AbstractC1371l.c0(numArr)).intValue();
        for (int i11 = 0; i11 < i8; i11++) {
            Integer num = numArr[i11];
            int intValue2 = num.intValue();
            if (intValue2 != intValue) {
                int size3 = list.size();
                SpanStyle spanStyle2 = spanStyle;
                for (int i12 = 0; i12 < size3; i12++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i12);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(intValue, intValue2, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = merge(spanStyle2, range2.getItem());
                    }
                }
                if (spanStyle2 != null) {
                    interfaceC1669o.invoke(spanStyle2, Integer.valueOf(intValue), num);
                }
                intValue = intValue2;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long m5369getTypeUIouoOA = TextUnit.m5369getTypeUIouoOA(spanStyle.m4660getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (!TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5403getSpUIouoOA()) && !TextUnitType.m5398equalsimpl0(TextUnit.m5369getTypeUIouoOA(spanStyle.m4660getLetterSpacingXSAIIZE()), companion.m5402getEmUIouoOA())) {
            return false;
        }
        return true;
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        if (!TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) && textStyle.m4730getFontSynthesisZQGJjVo() == null) {
            return false;
        }
        return true;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        if (density.getFontScale() > 1.05d) {
            return true;
        }
        return false;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        if (spanStyle == null) {
            return spanStyle2;
        }
        return spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m4959resolveLineHeightInPxo2QH7mI(long j8, float f8, Density density) {
        float m5370getValueimpl;
        long m5369getTypeUIouoOA = TextUnit.m5369getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5403getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo452toPxR2X_6o(j8);
            }
            m5370getValueimpl = TextUnit.m5370getValueimpl(j8) / TextUnit.m5370getValueimpl(density.mo456toSpkPz2Gy4(f8));
        } else if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5402getEmUIouoOA())) {
            m5370getValueimpl = TextUnit.m5370getValueimpl(j8);
        } else {
            return Float.NaN;
        }
        return m5370getValueimpl * f8;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m4960setBackgroundRPmYEkk(Spannable spannable, long j8, int i8, int i9) {
        if (j8 != Color.Companion.m3012getUnspecified0d7_KjU()) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m3030toArgb8_81llA(j8)), i8, i9);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m4961setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i8, int i9) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m4977unboximpl()), i8, i9);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f8, int i8, int i9) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m4962setColorRPmYEkk(spannable, ((SolidColor) brush).m3288getValue0d7_KjU(), i8, i9);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f8), i8, i9);
            }
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m4962setColorRPmYEkk(Spannable spannable, long j8, int i8, int i9) {
        if (j8 != Color.Companion.m3012getUnspecified0d7_KjU()) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m3030toArgb8_81llA(j8)), i8, i9);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i8, int i9) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i8, i9);
        }
    }

    private static final void setFontAttributes(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, InterfaceC1670p interfaceC1670p) {
        SpanStyle spanStyle;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i8);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().m4659getFontSynthesisZQGJjVo() != null) {
                arrayList.add(range);
            }
        }
        if (hasFontAttributes(textStyle)) {
            spanStyle = new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m4729getFontStyle4Lr2A7w(), textStyle.m4730getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (AbstractC3247p) null);
        } else {
            spanStyle = null;
        }
        flattenFontStylesAndApply(spanStyle, arrayList, new SpannableExtensions_androidKt$setFontAttributes$1(spannable, interfaceC1670p));
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i8, int i9) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i8, i9);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m4963setFontSizeKmRG4DE(Spannable spannable, long j8, Density density, int i8, int i9) {
        long m5369getTypeUIouoOA = TextUnit.m5369getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5403getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(AbstractC2055a.d(density.mo452toPxR2X_6o(j8)), false), i8, i9);
        } else if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5402getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m5370getValueimpl(j8)), i8, i9);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i8, int i9) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i8, i9);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i8, i9);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m4964setLineHeightKmRG4DE(Spannable spannable, long j8, float f8, Density density, LineHeightStyle lineHeightStyle) {
        int length;
        float m4959resolveLineHeightInPxo2QH7mI = m4959resolveLineHeightInPxo2QH7mI(j8, f8, density);
        if (!Float.isNaN(m4959resolveLineHeightInPxo2QH7mI)) {
            if (spannable.length() == 0 || n.R0(spannable) == '\n') {
                length = spannable.length() + 1;
            } else {
                length = spannable.length();
            }
            setSpan(spannable, new LineHeightStyleSpan(m4959resolveLineHeightInPxo2QH7mI, 0, length, LineHeightStyle.Trim.m5072isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m5055getTrimEVpEnUU()), LineHeightStyle.Trim.m5073isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m5055getTrimEVpEnUU()), lineHeightStyle.m5054getAlignmentPIaL0Z0()), 0, spannable.length());
        }
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m4965setLineHeightr9BaKPg(Spannable spannable, long j8, float f8, Density density) {
        float m4959resolveLineHeightInPxo2QH7mI = m4959resolveLineHeightInPxo2QH7mI(j8, f8, density);
        if (!Float.isNaN(m4959resolveLineHeightInPxo2QH7mI)) {
            setSpan(spannable, new LineHeightSpan(m4959resolveLineHeightInPxo2QH7mI), 0, spannable.length());
        }
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i8, int i9) {
        Locale locale;
        Object localeSpan;
        if (localeList != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = LocaleListHelperMethods.INSTANCE.localeSpan(localeList);
            } else {
                if (localeList.isEmpty()) {
                    locale = Locale.Companion.getCurrent();
                } else {
                    locale = localeList.get(0);
                }
                localeSpan = new LocaleSpan(LocaleExtensions_androidKt.toJavaLocale(locale));
            }
            setSpan(spannable, localeSpan, i8, i9);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i8, int i9) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m3030toArgb8_81llA(shadow.m3278getColor0d7_KjU()), Offset.m2740getXimpl(shadow.m3279getOffsetF1C5BW0()), Offset.m2741getYimpl(shadow.m3279getOffsetF1C5BW0()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i8, i9);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i8, int i9) {
        spannable.setSpan(obj, i8, i9, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m4961setBaselineShift0ocSgnM(spannable, item.m4655getBaselineShift5SSeXJ0(), start, end);
        m4962setColorRPmYEkk(spannable, item.m4656getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m4963setFontSizeKmRG4DE(spannable, item.m4657getFontSizeXSAIIZE(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m4960setBackgroundRPmYEkk(spannable, item.m4654getBackground0d7_KjU(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, Density density, InterfaceC1670p interfaceC1670p) {
        MetricAffectingSpan m4958createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, interfaceC1670p);
        int size = list.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i8);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density);
                if (getNeedsLetterSpacingSpan(range.getItem())) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                AnnotatedString.Range<SpanStyle> range2 = list.get(i9);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle item = range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (m4958createLetterSpacingSpaneAf_CNQ = m4958createLetterSpacingSpaneAf_CNQ(item.m4660getLetterSpacingXSAIIZE(), density)) != null) {
                    setSpan(spannable, m4958createLetterSpacingSpaneAf_CNQ, start2, end2);
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i8, int i9) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i8, i9);
        }
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f8, Density density) {
        float f9;
        if (textIndent != null) {
            if ((!TextUnit.m5367equalsimpl0(textIndent.m5111getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) || !TextUnit.m5367equalsimpl0(textIndent.m5112getRestLineXSAIIZE(), TextUnitKt.getSp(0))) && !TextUnitKt.m5388isUnspecifiedR2X_6o(textIndent.m5111getFirstLineXSAIIZE()) && !TextUnitKt.m5388isUnspecifiedR2X_6o(textIndent.m5112getRestLineXSAIIZE())) {
                long m5369getTypeUIouoOA = TextUnit.m5369getTypeUIouoOA(textIndent.m5111getFirstLineXSAIIZE());
                TextUnitType.Companion companion = TextUnitType.Companion;
                float f10 = 0.0f;
                if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5403getSpUIouoOA())) {
                    f9 = density.mo452toPxR2X_6o(textIndent.m5111getFirstLineXSAIIZE());
                } else if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5402getEmUIouoOA())) {
                    f9 = TextUnit.m5370getValueimpl(textIndent.m5111getFirstLineXSAIIZE()) * f8;
                } else {
                    f9 = 0.0f;
                }
                long m5369getTypeUIouoOA2 = TextUnit.m5369getTypeUIouoOA(textIndent.m5112getRestLineXSAIIZE());
                if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA2, companion.m5403getSpUIouoOA())) {
                    f10 = density.mo452toPxR2X_6o(textIndent.m5112getRestLineXSAIIZE());
                } else if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA2, companion.m5402getEmUIouoOA())) {
                    f10 = TextUnit.m5370getValueimpl(textIndent.m5112getRestLineXSAIIZE()) * f8;
                }
                setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(f9), (int) Math.ceil(f10)), 0, spannable.length());
            }
        }
    }
}
