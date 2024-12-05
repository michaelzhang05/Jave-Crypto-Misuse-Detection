package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m1271binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j8, long j9, long j10) {
        float f8 = 0.2f;
        float f9 = 0.4f;
        float f10 = 0.4f;
        for (int i8 = 0; i8 < 7; i8++) {
            float m1273calculateContrastRationb2GgbA = (m1273calculateContrastRationb2GgbA(j8, f9, j9, j10) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= m1273calculateContrastRationb2GgbA && m1273calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (m1273calculateContrastRationb2GgbA < 0.0f) {
                f10 = f9;
            } else {
                f8 = f9;
            }
            f9 = (f10 + f8) / 2.0f;
        }
        return f9;
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m1272calculateContrastRatioOWjLjI(long j8, long j9) {
        float m3023luminance8_81llA = ColorKt.m3023luminance8_81llA(j8) + 0.05f;
        float m3023luminance8_81llA2 = ColorKt.m3023luminance8_81llA(j9) + 0.05f;
        return Math.max(m3023luminance8_81llA, m3023luminance8_81llA2) / Math.min(m3023luminance8_81llA, m3023luminance8_81llA2);
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m1273calculateContrastRationb2GgbA(long j8, float f8, long j9, long j10) {
        long m3016compositeOverOWjLjI = ColorKt.m3016compositeOverOWjLjI(Color.m2970copywmQWz5c$default(j8, f8, 0.0f, 0.0f, 0.0f, 14, null), j10);
        return m1272calculateContrastRatioOWjLjI(ColorKt.m3016compositeOverOWjLjI(j9, m3016compositeOverOWjLjI), m3016compositeOverOWjLjI);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m1274calculateSelectionBackgroundColorysEtTa8(long j8, long j9, long j10) {
        float m1271binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float m1273calculateContrastRationb2GgbA = m1273calculateContrastRationb2GgbA(j8, 0.4f, j9, j10);
        float m1273calculateContrastRationb2GgbA2 = m1273calculateContrastRationb2GgbA(j8, 0.2f, j9, j10);
        if (m1273calculateContrastRationb2GgbA >= DesiredContrastRatio) {
            m1271binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.4f;
        } else if (m1273calculateContrastRationb2GgbA2 < DesiredContrastRatio) {
            m1271binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.2f;
        } else {
            m1271binarySearchForAccessibleSelectionColorAlphaysEtTa8 = m1271binarySearchForAccessibleSelectionColorAlphaysEtTa8(j8, j9, j10);
        }
        return Color.m2970copywmQWz5c$default(j8, m1271binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    public static final TextSelectionColors rememberTextSelectionColors(Colors colors, Composer composer, int i8) {
        AbstractC3159y.i(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i8, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m1178getPrimary0d7_KjU = colors.m1178getPrimary0d7_KjU();
        long m1171getBackground0d7_KjU = colors.m1171getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long m1195contentColorFor4WTKRHQ = ColorsKt.m1195contentColorFor4WTKRHQ(colors, m1171getBackground0d7_KjU);
        if (m1195contentColorFor4WTKRHQ == Color.Companion.m3007getUnspecified0d7_KjU()) {
            m1195contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2981unboximpl();
        }
        long j8 = m1195contentColorFor4WTKRHQ;
        composer.endReplaceableGroup();
        long m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color m2961boximpl = Color.m2961boximpl(m1178getPrimary0d7_KjU);
        Color m2961boximpl2 = Color.m2961boximpl(m1171getBackground0d7_KjU);
        Color m2961boximpl3 = Color.m2961boximpl(m2970copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m2961boximpl) | composer.changed(m2961boximpl2) | composer.changed(m2961boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextSelectionColors(colors.m1178getPrimary0d7_KjU(), m1274calculateSelectionBackgroundColorysEtTa8(m1178getPrimary0d7_KjU, m2970copywmQWz5c$default, m1171getBackground0d7_KjU), null);
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
