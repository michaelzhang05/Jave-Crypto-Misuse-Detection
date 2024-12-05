package androidx.compose.ui.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m5381getUnspecifiedXSAIIZE();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x003f, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m5367equalsimpl0(r12, r24.m4610getLineHeightXSAIIZE()) != false) goto L14;
     */
    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.ParagraphStyle m4615fastMergej5T8yCg(androidx.compose.ui.text.ParagraphStyle r24, int r25, int r26, long r27, androidx.compose.ui.text.style.TextIndent r29, androidx.compose.ui.text.PlatformParagraphStyle r30, androidx.compose.ui.text.style.LineHeightStyle r31, int r32, int r33, androidx.compose.ui.text.style.TextMotion r34) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyleKt.m4615fastMergej5T8yCg(androidx.compose.ui.text.ParagraphStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion):androidx.compose.ui.text.ParagraphStyle");
    }

    @Stable
    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f8) {
        int m5086unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m5080boximpl(paragraphStyle.m4612getTextAligne0LSkKk()), TextAlign.m5080boximpl(paragraphStyle2.m4612getTextAligne0LSkKk()), f8)).m5086unboximpl();
        int m5100unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m5094boximpl(paragraphStyle.m4614getTextDirections_7Xco()), TextDirection.m5094boximpl(paragraphStyle2.m4614getTextDirections_7Xco()), f8)).m5100unboximpl();
        long m4662lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m4662lerpTextUnitInheritableC3pnCVY(paragraphStyle.m4610getLineHeightXSAIIZE(), paragraphStyle2.m4610getLineHeightXSAIIZE(), f8);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(m5086unboximpl, m5100unboximpl, m4662lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f8), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f8), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f8), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m5000boximpl(paragraphStyle.m4609getLineBreakrAG3T2k()), LineBreak.m5000boximpl(paragraphStyle2.m4609getLineBreakrAG3T2k()), f8)).m5012unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m4990boximpl(paragraphStyle.m4607getHyphensvmbZdU8()), Hyphens.m4990boximpl(paragraphStyle2.m4607getHyphensvmbZdU8()), f8)).m4996unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f8), (AbstractC3247p) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f8) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f8);
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return paragraphStyle.getPlatformStyle();
        }
        return paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        int m4612getTextAligne0LSkKk;
        long m4610getLineHeightXSAIIZE;
        int m4609getLineBreakrAG3T2k;
        int m4607getHyphensvmbZdU8;
        int m4612getTextAligne0LSkKk2 = paragraphStyle.m4612getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m5083equalsimpl0(m4612getTextAligne0LSkKk2, companion.m5093getUnspecifiede0LSkKk())) {
            m4612getTextAligne0LSkKk = companion.m5092getStarte0LSkKk();
        } else {
            m4612getTextAligne0LSkKk = paragraphStyle.m4612getTextAligne0LSkKk();
        }
        int i8 = m4612getTextAligne0LSkKk;
        int m4743resolveTextDirectionIhaHGbI = TextStyleKt.m4743resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m4614getTextDirections_7Xco());
        if (TextUnitKt.m5388isUnspecifiedR2X_6o(paragraphStyle.m4610getLineHeightXSAIIZE())) {
            m4610getLineHeightXSAIIZE = DefaultLineHeight;
        } else {
            m4610getLineHeightXSAIIZE = paragraphStyle.m4610getLineHeightXSAIIZE();
        }
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int m4609getLineBreakrAG3T2k2 = paragraphStyle.m4609getLineBreakrAG3T2k();
        LineBreak.Companion companion2 = LineBreak.Companion;
        if (LineBreak.m5006equalsimpl0(m4609getLineBreakrAG3T2k2, companion2.m5020getUnspecifiedrAG3T2k())) {
            m4609getLineBreakrAG3T2k = companion2.m5019getSimplerAG3T2k();
        } else {
            m4609getLineBreakrAG3T2k = paragraphStyle.m4609getLineBreakrAG3T2k();
        }
        int i9 = m4609getLineBreakrAG3T2k;
        int m4607getHyphensvmbZdU82 = paragraphStyle.m4607getHyphensvmbZdU8();
        Hyphens.Companion companion3 = Hyphens.Companion;
        if (Hyphens.m4993equalsimpl0(m4607getHyphensvmbZdU82, companion3.m4999getUnspecifiedvmbZdU8())) {
            m4607getHyphensvmbZdU8 = companion3.m4998getNonevmbZdU8();
        } else {
            m4607getHyphensvmbZdU8 = paragraphStyle.m4607getHyphensvmbZdU8();
        }
        int i10 = m4607getHyphensvmbZdU8;
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(i8, m4743resolveTextDirectionIhaHGbI, m4610getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, i9, i10, textMotion, (AbstractC3247p) null);
    }
}
