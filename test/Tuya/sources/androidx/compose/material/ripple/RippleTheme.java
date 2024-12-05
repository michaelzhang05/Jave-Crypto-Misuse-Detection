package androidx.compose.material.ripple;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes.dex */
public interface RippleTheme {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
        public final RippleAlpha m1445defaultRippleAlphaDxMtmZc(long j8, boolean z8) {
            if (z8) {
                if (ColorKt.m3023luminance8_81llA(j8) > 0.5d) {
                    return RippleThemeKt.access$getLightThemeHighContrastRippleAlpha$p();
                }
                return RippleThemeKt.access$getLightThemeLowContrastRippleAlpha$p();
            }
            return RippleThemeKt.access$getDarkThemeRippleAlpha$p();
        }

        /* renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
        public final long m1446defaultRippleColor5vOe2sY(long j8, boolean z8) {
            float m3023luminance8_81llA = ColorKt.m3023luminance8_81llA(j8);
            if (!z8 && m3023luminance8_81llA < 0.5d) {
                return Color.Companion.m3008getWhite0d7_KjU();
            }
            return j8;
        }
    }

    @Composable
    /* renamed from: defaultColor-WaAFU9c */
    long mo38defaultColorWaAFU9c(Composer composer, int i8);

    @Composable
    RippleAlpha rippleAlpha(Composer composer, int i8);
}
