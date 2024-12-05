package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m1276binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j8, long j9, long j10) {
        float f8 = 0.2f;
        float f9 = 0.4f;
        float f10 = 0.4f;
        for (int i8 = 0; i8 < 7; i8++) {
            float m1278calculateContrastRationb2GgbA = (m1278calculateContrastRationb2GgbA(j8, f9, j9, j10) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= m1278calculateContrastRationb2GgbA && m1278calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (m1278calculateContrastRationb2GgbA < 0.0f) {
                f10 = f9;
            } else {
                f8 = f9;
            }
            f9 = (f10 + f8) / 2.0f;
        }
        return f9;
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m1277calculateContrastRatioOWjLjI(long j8, long j9) {
        float m3028luminance8_81llA = ColorKt.m3028luminance8_81llA(j8) + 0.05f;
        float m3028luminance8_81llA2 = ColorKt.m3028luminance8_81llA(j9) + 0.05f;
        return Math.max(m3028luminance8_81llA, m3028luminance8_81llA2) / Math.min(m3028luminance8_81llA, m3028luminance8_81llA2);
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m1278calculateContrastRationb2GgbA(long j8, float f8, long j9, long j10) {
        long m3021compositeOverOWjLjI = ColorKt.m3021compositeOverOWjLjI(Color.m2975copywmQWz5c$default(j8, f8, 0.0f, 0.0f, 0.0f, 14, null), j10);
        return m1277calculateContrastRatioOWjLjI(ColorKt.m3021compositeOverOWjLjI(j9, m3021compositeOverOWjLjI), m3021compositeOverOWjLjI);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m1279calculateSelectionBackgroundColorysEtTa8(long j8, long j9, long j10) {
        float m1276binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float m1278calculateContrastRationb2GgbA = m1278calculateContrastRationb2GgbA(j8, 0.4f, j9, j10);
        float m1278calculateContrastRationb2GgbA2 = m1278calculateContrastRationb2GgbA(j8, 0.2f, j9, j10);
        if (m1278calculateContrastRationb2GgbA >= DesiredContrastRatio) {
            m1276binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.4f;
        } else if (m1278calculateContrastRationb2GgbA2 < DesiredContrastRatio) {
            m1276binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.2f;
        } else {
            m1276binarySearchForAccessibleSelectionColorAlphaysEtTa8 = m1276binarySearchForAccessibleSelectionColorAlphaysEtTa8(j8, j9, j10);
        }
        return Color.m2975copywmQWz5c$default(j8, m1276binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    public static final TextSelectionColors rememberTextSelectionColors(Colors colors, Composer composer, int i8) {
        AbstractC3255y.i(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i8, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m1183getPrimary0d7_KjU = colors.m1183getPrimary0d7_KjU();
        long m1176getBackground0d7_KjU = colors.m1176getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long m1200contentColorFor4WTKRHQ = ColorsKt.m1200contentColorFor4WTKRHQ(colors, m1176getBackground0d7_KjU);
        if (m1200contentColorFor4WTKRHQ == Color.Companion.m3012getUnspecified0d7_KjU()) {
            m1200contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2986unboximpl();
        }
        long j8 = m1200contentColorFor4WTKRHQ;
        composer.endReplaceableGroup();
        long m2975copywmQWz5c$default = Color.m2975copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color m2966boximpl = Color.m2966boximpl(m1183getPrimary0d7_KjU);
        Color m2966boximpl2 = Color.m2966boximpl(m1176getBackground0d7_KjU);
        Color m2966boximpl3 = Color.m2966boximpl(m2975copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m2966boximpl) | composer.changed(m2966boximpl2) | composer.changed(m2966boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextSelectionColors(colors.m1183getPrimary0d7_KjU(), m1279calculateSelectionBackgroundColorysEtTa8(m1183getPrimary0d7_KjU, m2975copywmQWz5c$default, m1176getBackground0d7_KjU), null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextSelectionColors textSelectionColors = (TextSelectionColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }
}
