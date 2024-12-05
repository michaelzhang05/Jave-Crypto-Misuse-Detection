package androidx.compose.material3.tokens;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class TypographyTokens {
    private static final TextStyle BodyLarge;
    private static final TextStyle BodyMedium;
    private static final TextStyle BodySmall;
    private static final TextStyle DisplayLarge;
    private static final TextStyle DisplayMedium;
    private static final TextStyle DisplaySmall;
    private static final TextStyle HeadlineLarge;
    private static final TextStyle HeadlineMedium;
    private static final TextStyle HeadlineSmall;
    public static final TypographyTokens INSTANCE = new TypographyTokens();
    private static final TextStyle LabelLarge;
    private static final TextStyle LabelMedium;
    private static final TextStyle LabelSmall;
    private static final TextStyle TitleLarge;
    private static final TextStyle TitleMedium;
    private static final TextStyle TitleSmall;

    static {
        TypeScaleTokens typeScaleTokens = TypeScaleTokens.INSTANCE;
        GenericFontFamily bodyLargeFont = typeScaleTokens.getBodyLargeFont();
        BodyLarge = new TextStyle(0L, typeScaleTokens.m2422getBodyLargeSizeXSAIIZE(), typeScaleTokens.getBodyLargeWeight(), (FontStyle) null, (FontSynthesis) null, bodyLargeFont, (String) null, typeScaleTokens.m2423getBodyLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2421getBodyLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily bodyMediumFont = typeScaleTokens.getBodyMediumFont();
        BodyMedium = new TextStyle(0L, typeScaleTokens.m2425getBodyMediumSizeXSAIIZE(), typeScaleTokens.getBodyMediumWeight(), (FontStyle) null, (FontSynthesis) null, bodyMediumFont, (String) null, typeScaleTokens.m2426getBodyMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2424getBodyMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily bodySmallFont = typeScaleTokens.getBodySmallFont();
        BodySmall = new TextStyle(0L, typeScaleTokens.m2428getBodySmallSizeXSAIIZE(), typeScaleTokens.getBodySmallWeight(), (FontStyle) null, (FontSynthesis) null, bodySmallFont, (String) null, typeScaleTokens.m2429getBodySmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2427getBodySmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily displayLargeFont = typeScaleTokens.getDisplayLargeFont();
        DisplayLarge = new TextStyle(0L, typeScaleTokens.m2431getDisplayLargeSizeXSAIIZE(), typeScaleTokens.getDisplayLargeWeight(), (FontStyle) null, (FontSynthesis) null, displayLargeFont, (String) null, typeScaleTokens.m2432getDisplayLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2430getDisplayLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily displayMediumFont = typeScaleTokens.getDisplayMediumFont();
        DisplayMedium = new TextStyle(0L, typeScaleTokens.m2434getDisplayMediumSizeXSAIIZE(), typeScaleTokens.getDisplayMediumWeight(), (FontStyle) null, (FontSynthesis) null, displayMediumFont, (String) null, typeScaleTokens.m2435getDisplayMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2433getDisplayMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily displaySmallFont = typeScaleTokens.getDisplaySmallFont();
        DisplaySmall = new TextStyle(0L, typeScaleTokens.m2437getDisplaySmallSizeXSAIIZE(), typeScaleTokens.getDisplaySmallWeight(), (FontStyle) null, (FontSynthesis) null, displaySmallFont, (String) null, typeScaleTokens.m2438getDisplaySmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2436getDisplaySmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily headlineLargeFont = typeScaleTokens.getHeadlineLargeFont();
        HeadlineLarge = new TextStyle(0L, typeScaleTokens.m2440getHeadlineLargeSizeXSAIIZE(), typeScaleTokens.getHeadlineLargeWeight(), (FontStyle) null, (FontSynthesis) null, headlineLargeFont, (String) null, typeScaleTokens.m2441getHeadlineLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2439getHeadlineLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily headlineMediumFont = typeScaleTokens.getHeadlineMediumFont();
        HeadlineMedium = new TextStyle(0L, typeScaleTokens.m2443getHeadlineMediumSizeXSAIIZE(), typeScaleTokens.getHeadlineMediumWeight(), (FontStyle) null, (FontSynthesis) null, headlineMediumFont, (String) null, typeScaleTokens.m2444getHeadlineMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2442getHeadlineMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily headlineSmallFont = typeScaleTokens.getHeadlineSmallFont();
        HeadlineSmall = new TextStyle(0L, typeScaleTokens.m2446getHeadlineSmallSizeXSAIIZE(), typeScaleTokens.getHeadlineSmallWeight(), (FontStyle) null, (FontSynthesis) null, headlineSmallFont, (String) null, typeScaleTokens.m2447getHeadlineSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2445getHeadlineSmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily labelLargeFont = typeScaleTokens.getLabelLargeFont();
        LabelLarge = new TextStyle(0L, typeScaleTokens.m2449getLabelLargeSizeXSAIIZE(), typeScaleTokens.getLabelLargeWeight(), (FontStyle) null, (FontSynthesis) null, labelLargeFont, (String) null, typeScaleTokens.m2450getLabelLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2448getLabelLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily labelMediumFont = typeScaleTokens.getLabelMediumFont();
        LabelMedium = new TextStyle(0L, typeScaleTokens.m2452getLabelMediumSizeXSAIIZE(), typeScaleTokens.getLabelMediumWeight(), (FontStyle) null, (FontSynthesis) null, labelMediumFont, (String) null, typeScaleTokens.m2453getLabelMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2451getLabelMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily labelSmallFont = typeScaleTokens.getLabelSmallFont();
        LabelSmall = new TextStyle(0L, typeScaleTokens.m2455getLabelSmallSizeXSAIIZE(), typeScaleTokens.getLabelSmallWeight(), (FontStyle) null, (FontSynthesis) null, labelSmallFont, (String) null, typeScaleTokens.m2456getLabelSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2454getLabelSmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily titleLargeFont = typeScaleTokens.getTitleLargeFont();
        TitleLarge = new TextStyle(0L, typeScaleTokens.m2458getTitleLargeSizeXSAIIZE(), typeScaleTokens.getTitleLargeWeight(), (FontStyle) null, (FontSynthesis) null, titleLargeFont, (String) null, typeScaleTokens.m2459getTitleLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2457getTitleLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily titleMediumFont = typeScaleTokens.getTitleMediumFont();
        TitleMedium = new TextStyle(0L, typeScaleTokens.m2461getTitleMediumSizeXSAIIZE(), typeScaleTokens.getTitleMediumWeight(), (FontStyle) null, (FontSynthesis) null, titleMediumFont, (String) null, typeScaleTokens.m2462getTitleMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2460getTitleMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
        GenericFontFamily titleSmallFont = typeScaleTokens.getTitleSmallFont();
        TitleSmall = new TextStyle(0L, typeScaleTokens.m2464getTitleSmallSizeXSAIIZE(), typeScaleTokens.getTitleSmallWeight(), (FontStyle) null, (FontSynthesis) null, titleSmallFont, (String) null, typeScaleTokens.m2465getTitleSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2463getTitleSmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3247p) null);
    }

    private TypographyTokens() {
    }

    public final TextStyle getBodyLarge() {
        return BodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return BodyMedium;
    }

    public final TextStyle getBodySmall() {
        return BodySmall;
    }

    public final TextStyle getDisplayLarge() {
        return DisplayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return DisplayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return DisplaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return HeadlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return HeadlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return HeadlineSmall;
    }

    public final TextStyle getLabelLarge() {
        return LabelLarge;
    }

    public final TextStyle getLabelMedium() {
        return LabelMedium;
    }

    public final TextStyle getLabelSmall() {
        return LabelSmall;
    }

    public final TextStyle getTitleLarge() {
        return TitleLarge;
    }

    public final TextStyle getTitleMedium() {
        return TitleMedium;
    }

    public final TextStyle getTitleSmall() {
        return TitleSmall;
    }
}
