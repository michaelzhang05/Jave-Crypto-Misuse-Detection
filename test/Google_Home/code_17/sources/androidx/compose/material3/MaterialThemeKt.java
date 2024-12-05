package androidx.compose.material3;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class MaterialThemeKt {
    private static final RippleAlpha DefaultRippleAlpha = new RippleAlpha(0.16f, 0.12f, 0.08f, 0.12f);
    public static final float TextSelectionBackgroundOpacity = 0.4f;

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        if ((r84 & 4) != 0) goto L64;
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MaterialTheme(androidx.compose.material3.ColorScheme r78, androidx.compose.material3.Shapes r79, androidx.compose.material3.Typography r80, a6.InterfaceC1668n r81, androidx.compose.runtime.Composer r82, int r83, int r84) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.MaterialTheme(androidx.compose.material3.ColorScheme, androidx.compose.material3.Shapes, androidx.compose.material3.Typography, a6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final TextSelectionColors rememberTextSelectionColors(ColorScheme colorScheme, Composer composer, int i8) {
        AbstractC3255y.i(colorScheme, "colorScheme");
        composer.startReplaceableGroup(1866455512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1866455512, i8, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:132)");
        }
        long m1531getPrimary0d7_KjU = colorScheme.m1531getPrimary0d7_KjU();
        Color m2966boximpl = Color.m2966boximpl(m1531getPrimary0d7_KjU);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m2966boximpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextSelectionColors(m1531getPrimary0d7_KjU, Color.m2975copywmQWz5c$default(m1531getPrimary0d7_KjU, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
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
