package androidx.compose.material3;

import O5.p;
import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(ColorSchemeKt$LocalColorScheme$1.INSTANCE);

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: applyTonalElevation-Hht5A8o, reason: not valid java name */
    public static final long m1570applyTonalElevationHht5A8o(ColorScheme applyTonalElevation, long j8, float f8) {
        AbstractC3255y.i(applyTonalElevation, "$this$applyTonalElevation");
        if (Color.m2977equalsimpl0(j8, applyTonalElevation.m1536getSurface0d7_KjU())) {
            return m1577surfaceColorAtElevation3ABfNKs(applyTonalElevation, f8);
        }
        return j8;
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1571contentColorFor4WTKRHQ(ColorScheme contentColorFor, long j8) {
        AbstractC3255y.i(contentColorFor, "$this$contentColorFor");
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1531getPrimary0d7_KjU())) {
            return contentColorFor.m1521getOnPrimary0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1534getSecondary0d7_KjU())) {
            return contentColorFor.m1523getOnSecondary0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1539getTertiary0d7_KjU())) {
            return contentColorFor.m1527getOnTertiary0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1512getBackground0d7_KjU())) {
            return contentColorFor.m1518getOnBackground0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1513getError0d7_KjU())) {
            return contentColorFor.m1519getOnError0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1536getSurface0d7_KjU())) {
            return contentColorFor.m1525getOnSurface0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1538getSurfaceVariant0d7_KjU())) {
            return contentColorFor.m1526getOnSurfaceVariant0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1532getPrimaryContainer0d7_KjU())) {
            return contentColorFor.m1522getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1535getSecondaryContainer0d7_KjU())) {
            return contentColorFor.m1524getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1540getTertiaryContainer0d7_KjU())) {
            return contentColorFor.m1528getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1514getErrorContainer0d7_KjU())) {
            return contentColorFor.m1520getOnErrorContainer0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1517getInverseSurface0d7_KjU())) {
            return contentColorFor.m1515getInverseOnSurface0d7_KjU();
        }
        return Color.Companion.m3012getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1572contentColorForek8zF_U(long j8, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i8, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long m1571contentColorFor4WTKRHQ = m1571contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j8);
        if (m1571contentColorFor4WTKRHQ == Color.Companion.m3012getUnspecified0d7_KjU()) {
            m1571contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2986unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1571contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1573darkColorSchemeG1PFcw(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1574darkColorSchemeG1PFcw$default(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i8, Object obj) {
        long m2021getPrimary0d7_KjU = (i8 & 1) != 0 ? ColorDarkTokens.INSTANCE.m2021getPrimary0d7_KjU() : j8;
        return m1573darkColorSchemeG1PFcw(m2021getPrimary0d7_KjU, (i8 & 2) != 0 ? ColorDarkTokens.INSTANCE.m2011getOnPrimary0d7_KjU() : j9, (i8 & 4) != 0 ? ColorDarkTokens.INSTANCE.m2022getPrimaryContainer0d7_KjU() : j10, (i8 & 8) != 0 ? ColorDarkTokens.INSTANCE.m2012getOnPrimaryContainer0d7_KjU() : j11, (i8 & 16) != 0 ? ColorDarkTokens.INSTANCE.m2006getInversePrimary0d7_KjU() : j12, (i8 & 32) != 0 ? ColorDarkTokens.INSTANCE.m2024getSecondary0d7_KjU() : j13, (i8 & 64) != 0 ? ColorDarkTokens.INSTANCE.m2013getOnSecondary0d7_KjU() : j14, (i8 & 128) != 0 ? ColorDarkTokens.INSTANCE.m2025getSecondaryContainer0d7_KjU() : j15, (i8 & 256) != 0 ? ColorDarkTokens.INSTANCE.m2014getOnSecondaryContainer0d7_KjU() : j16, (i8 & 512) != 0 ? ColorDarkTokens.INSTANCE.m2029getTertiary0d7_KjU() : j17, (i8 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m2017getOnTertiary0d7_KjU() : j18, (i8 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m2030getTertiaryContainer0d7_KjU() : j19, (i8 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m2018getOnTertiaryContainer0d7_KjU() : j20, (i8 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m2002getBackground0d7_KjU() : j21, (i8 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m2008getOnBackground0d7_KjU() : j22, (i8 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m2026getSurface0d7_KjU() : j23, (i8 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m2015getOnSurface0d7_KjU() : j24, (i8 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m2028getSurfaceVariant0d7_KjU() : j25, (i8 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m2016getOnSurfaceVariant0d7_KjU() : j26, (i8 & 524288) != 0 ? m2021getPrimary0d7_KjU : j27, (i8 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m2007getInverseSurface0d7_KjU() : j28, (i8 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m2005getInverseOnSurface0d7_KjU() : j29, (i8 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m2003getError0d7_KjU() : j30, (i8 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m2009getOnError0d7_KjU() : j31, (i8 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m2004getErrorContainer0d7_KjU() : j32, (i8 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m2010getOnErrorContainer0d7_KjU() : j33, (i8 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m2019getOutline0d7_KjU() : j34, (i8 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m2020getOutlineVariant0d7_KjU() : j35, (i8 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m2023getScrim0d7_KjU() : j36);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens value) {
        AbstractC3255y.i(colorScheme, "<this>");
        AbstractC3255y.i(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return colorScheme.m1512getBackground0d7_KjU();
            case 2:
                return colorScheme.m1513getError0d7_KjU();
            case 3:
                return colorScheme.m1514getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m1515getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m1516getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m1517getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m1518getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m1519getOnError0d7_KjU();
            case 9:
                return colorScheme.m1520getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m1521getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m1522getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m1523getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m1524getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m1525getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m1526getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m1537getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m1527getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m1528getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m1529getOutline0d7_KjU();
            case 20:
                return colorScheme.m1530getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m1531getPrimary0d7_KjU();
            case 22:
                return colorScheme.m1532getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m1533getScrim0d7_KjU();
            case 24:
                return colorScheme.m1534getSecondary0d7_KjU();
            case 25:
                return colorScheme.m1535getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m1536getSurface0d7_KjU();
            case 27:
                return colorScheme.m1538getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m1539getTertiary0d7_KjU();
            case 29:
                return colorScheme.m1540getTertiaryContainer0d7_KjU();
            default:
                throw new p();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1575lightColorSchemeG1PFcw(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1576lightColorSchemeG1PFcw$default(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i8, Object obj) {
        long m2050getPrimary0d7_KjU = (i8 & 1) != 0 ? ColorLightTokens.INSTANCE.m2050getPrimary0d7_KjU() : j8;
        return m1575lightColorSchemeG1PFcw(m2050getPrimary0d7_KjU, (i8 & 2) != 0 ? ColorLightTokens.INSTANCE.m2040getOnPrimary0d7_KjU() : j9, (i8 & 4) != 0 ? ColorLightTokens.INSTANCE.m2051getPrimaryContainer0d7_KjU() : j10, (i8 & 8) != 0 ? ColorLightTokens.INSTANCE.m2041getOnPrimaryContainer0d7_KjU() : j11, (i8 & 16) != 0 ? ColorLightTokens.INSTANCE.m2035getInversePrimary0d7_KjU() : j12, (i8 & 32) != 0 ? ColorLightTokens.INSTANCE.m2053getSecondary0d7_KjU() : j13, (i8 & 64) != 0 ? ColorLightTokens.INSTANCE.m2042getOnSecondary0d7_KjU() : j14, (i8 & 128) != 0 ? ColorLightTokens.INSTANCE.m2054getSecondaryContainer0d7_KjU() : j15, (i8 & 256) != 0 ? ColorLightTokens.INSTANCE.m2043getOnSecondaryContainer0d7_KjU() : j16, (i8 & 512) != 0 ? ColorLightTokens.INSTANCE.m2058getTertiary0d7_KjU() : j17, (i8 & 1024) != 0 ? ColorLightTokens.INSTANCE.m2046getOnTertiary0d7_KjU() : j18, (i8 & 2048) != 0 ? ColorLightTokens.INSTANCE.m2059getTertiaryContainer0d7_KjU() : j19, (i8 & 4096) != 0 ? ColorLightTokens.INSTANCE.m2047getOnTertiaryContainer0d7_KjU() : j20, (i8 & 8192) != 0 ? ColorLightTokens.INSTANCE.m2031getBackground0d7_KjU() : j21, (i8 & 16384) != 0 ? ColorLightTokens.INSTANCE.m2037getOnBackground0d7_KjU() : j22, (i8 & 32768) != 0 ? ColorLightTokens.INSTANCE.m2055getSurface0d7_KjU() : j23, (i8 & 65536) != 0 ? ColorLightTokens.INSTANCE.m2044getOnSurface0d7_KjU() : j24, (i8 & 131072) != 0 ? ColorLightTokens.INSTANCE.m2057getSurfaceVariant0d7_KjU() : j25, (i8 & 262144) != 0 ? ColorLightTokens.INSTANCE.m2045getOnSurfaceVariant0d7_KjU() : j26, (i8 & 524288) != 0 ? m2050getPrimary0d7_KjU : j27, (i8 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m2036getInverseSurface0d7_KjU() : j28, (i8 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m2034getInverseOnSurface0d7_KjU() : j29, (i8 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m2032getError0d7_KjU() : j30, (i8 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m2038getOnError0d7_KjU() : j31, (i8 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m2033getErrorContainer0d7_KjU() : j32, (i8 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m2039getOnErrorContainer0d7_KjU() : j33, (i8 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m2048getOutline0d7_KjU() : j34, (i8 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m2049getOutlineVariant0d7_KjU() : j35, (i8 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m2052getScrim0d7_KjU() : j36);
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m1577surfaceColorAtElevation3ABfNKs(ColorScheme surfaceColorAtElevation, float f8) {
        AbstractC3255y.i(surfaceColorAtElevation, "$this$surfaceColorAtElevation");
        if (Dp.m5188equalsimpl0(f8, Dp.m5183constructorimpl(0))) {
            return surfaceColorAtElevation.m1536getSurface0d7_KjU();
        }
        return ColorKt.m3021compositeOverOWjLjI(Color.m2975copywmQWz5c$default(surfaceColorAtElevation.m1537getSurfaceTint0d7_KjU(), ((((float) Math.log(f8 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), surfaceColorAtElevation.m1536getSurface0d7_KjU());
    }

    @Composable
    @ReadOnlyComposable
    public static final long toColor(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i8) {
        AbstractC3255y.i(colorSchemeKeyTokens, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330949347, i8, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    public static final void updateColorSchemeFrom(ColorScheme colorScheme, ColorScheme other) {
        AbstractC3255y.i(colorScheme, "<this>");
        AbstractC3255y.i(other, "other");
        colorScheme.m1560setPrimary8_81llA$material3_release(other.m1531getPrimary0d7_KjU());
        colorScheme.m1550setOnPrimary8_81llA$material3_release(other.m1521getOnPrimary0d7_KjU());
        colorScheme.m1561setPrimaryContainer8_81llA$material3_release(other.m1532getPrimaryContainer0d7_KjU());
        colorScheme.m1551setOnPrimaryContainer8_81llA$material3_release(other.m1522getOnPrimaryContainer0d7_KjU());
        colorScheme.m1545setInversePrimary8_81llA$material3_release(other.m1516getInversePrimary0d7_KjU());
        colorScheme.m1563setSecondary8_81llA$material3_release(other.m1534getSecondary0d7_KjU());
        colorScheme.m1552setOnSecondary8_81llA$material3_release(other.m1523getOnSecondary0d7_KjU());
        colorScheme.m1564setSecondaryContainer8_81llA$material3_release(other.m1535getSecondaryContainer0d7_KjU());
        colorScheme.m1553setOnSecondaryContainer8_81llA$material3_release(other.m1524getOnSecondaryContainer0d7_KjU());
        colorScheme.m1568setTertiary8_81llA$material3_release(other.m1539getTertiary0d7_KjU());
        colorScheme.m1556setOnTertiary8_81llA$material3_release(other.m1527getOnTertiary0d7_KjU());
        colorScheme.m1569setTertiaryContainer8_81llA$material3_release(other.m1540getTertiaryContainer0d7_KjU());
        colorScheme.m1557setOnTertiaryContainer8_81llA$material3_release(other.m1528getOnTertiaryContainer0d7_KjU());
        colorScheme.m1541setBackground8_81llA$material3_release(other.m1512getBackground0d7_KjU());
        colorScheme.m1547setOnBackground8_81llA$material3_release(other.m1518getOnBackground0d7_KjU());
        colorScheme.m1565setSurface8_81llA$material3_release(other.m1536getSurface0d7_KjU());
        colorScheme.m1554setOnSurface8_81llA$material3_release(other.m1525getOnSurface0d7_KjU());
        colorScheme.m1567setSurfaceVariant8_81llA$material3_release(other.m1538getSurfaceVariant0d7_KjU());
        colorScheme.m1555setOnSurfaceVariant8_81llA$material3_release(other.m1526getOnSurfaceVariant0d7_KjU());
        colorScheme.m1566setSurfaceTint8_81llA$material3_release(other.m1537getSurfaceTint0d7_KjU());
        colorScheme.m1546setInverseSurface8_81llA$material3_release(other.m1517getInverseSurface0d7_KjU());
        colorScheme.m1544setInverseOnSurface8_81llA$material3_release(other.m1515getInverseOnSurface0d7_KjU());
        colorScheme.m1542setError8_81llA$material3_release(other.m1513getError0d7_KjU());
        colorScheme.m1548setOnError8_81llA$material3_release(other.m1519getOnError0d7_KjU());
        colorScheme.m1543setErrorContainer8_81llA$material3_release(other.m1514getErrorContainer0d7_KjU());
        colorScheme.m1549setOnErrorContainer8_81llA$material3_release(other.m1520getOnErrorContainer0d7_KjU());
        colorScheme.m1558setOutline8_81llA$material3_release(other.m1529getOutline0d7_KjU());
        colorScheme.m1559setOutlineVariant8_81llA$material3_release(other.m1530getOutlineVariant0d7_KjU());
        colorScheme.m1562setScrim8_81llA$material3_release(other.m1533getScrim0d7_KjU());
    }
}
