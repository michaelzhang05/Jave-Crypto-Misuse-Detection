package androidx.compose.material3;

import L5.p;
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
import kotlin.jvm.internal.AbstractC3159y;

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
    public static final long m1565applyTonalElevationHht5A8o(ColorScheme applyTonalElevation, long j8, float f8) {
        AbstractC3159y.i(applyTonalElevation, "$this$applyTonalElevation");
        if (Color.m2972equalsimpl0(j8, applyTonalElevation.m1531getSurface0d7_KjU())) {
            return m1572surfaceColorAtElevation3ABfNKs(applyTonalElevation, f8);
        }
        return j8;
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1566contentColorFor4WTKRHQ(ColorScheme contentColorFor, long j8) {
        AbstractC3159y.i(contentColorFor, "$this$contentColorFor");
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1526getPrimary0d7_KjU())) {
            return contentColorFor.m1516getOnPrimary0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1529getSecondary0d7_KjU())) {
            return contentColorFor.m1518getOnSecondary0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1534getTertiary0d7_KjU())) {
            return contentColorFor.m1522getOnTertiary0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1507getBackground0d7_KjU())) {
            return contentColorFor.m1513getOnBackground0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1508getError0d7_KjU())) {
            return contentColorFor.m1514getOnError0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1531getSurface0d7_KjU())) {
            return contentColorFor.m1520getOnSurface0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1533getSurfaceVariant0d7_KjU())) {
            return contentColorFor.m1521getOnSurfaceVariant0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1527getPrimaryContainer0d7_KjU())) {
            return contentColorFor.m1517getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1530getSecondaryContainer0d7_KjU())) {
            return contentColorFor.m1519getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1535getTertiaryContainer0d7_KjU())) {
            return contentColorFor.m1523getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1509getErrorContainer0d7_KjU())) {
            return contentColorFor.m1515getOnErrorContainer0d7_KjU();
        }
        if (Color.m2972equalsimpl0(j8, contentColorFor.m1512getInverseSurface0d7_KjU())) {
            return contentColorFor.m1510getInverseOnSurface0d7_KjU();
        }
        return Color.Companion.m3007getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1567contentColorForek8zF_U(long j8, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i8, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long m1566contentColorFor4WTKRHQ = m1566contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j8);
        if (m1566contentColorFor4WTKRHQ == Color.Companion.m3007getUnspecified0d7_KjU()) {
            m1566contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2981unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1566contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1568darkColorSchemeG1PFcw(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1569darkColorSchemeG1PFcw$default(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i8, Object obj) {
        long m2016getPrimary0d7_KjU = (i8 & 1) != 0 ? ColorDarkTokens.INSTANCE.m2016getPrimary0d7_KjU() : j8;
        return m1568darkColorSchemeG1PFcw(m2016getPrimary0d7_KjU, (i8 & 2) != 0 ? ColorDarkTokens.INSTANCE.m2006getOnPrimary0d7_KjU() : j9, (i8 & 4) != 0 ? ColorDarkTokens.INSTANCE.m2017getPrimaryContainer0d7_KjU() : j10, (i8 & 8) != 0 ? ColorDarkTokens.INSTANCE.m2007getOnPrimaryContainer0d7_KjU() : j11, (i8 & 16) != 0 ? ColorDarkTokens.INSTANCE.m2001getInversePrimary0d7_KjU() : j12, (i8 & 32) != 0 ? ColorDarkTokens.INSTANCE.m2019getSecondary0d7_KjU() : j13, (i8 & 64) != 0 ? ColorDarkTokens.INSTANCE.m2008getOnSecondary0d7_KjU() : j14, (i8 & 128) != 0 ? ColorDarkTokens.INSTANCE.m2020getSecondaryContainer0d7_KjU() : j15, (i8 & 256) != 0 ? ColorDarkTokens.INSTANCE.m2009getOnSecondaryContainer0d7_KjU() : j16, (i8 & 512) != 0 ? ColorDarkTokens.INSTANCE.m2024getTertiary0d7_KjU() : j17, (i8 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m2012getOnTertiary0d7_KjU() : j18, (i8 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m2025getTertiaryContainer0d7_KjU() : j19, (i8 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m2013getOnTertiaryContainer0d7_KjU() : j20, (i8 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m1997getBackground0d7_KjU() : j21, (i8 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m2003getOnBackground0d7_KjU() : j22, (i8 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m2021getSurface0d7_KjU() : j23, (i8 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m2010getOnSurface0d7_KjU() : j24, (i8 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m2023getSurfaceVariant0d7_KjU() : j25, (i8 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m2011getOnSurfaceVariant0d7_KjU() : j26, (i8 & 524288) != 0 ? m2016getPrimary0d7_KjU : j27, (i8 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m2002getInverseSurface0d7_KjU() : j28, (i8 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m2000getInverseOnSurface0d7_KjU() : j29, (i8 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m1998getError0d7_KjU() : j30, (i8 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m2004getOnError0d7_KjU() : j31, (i8 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m1999getErrorContainer0d7_KjU() : j32, (i8 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m2005getOnErrorContainer0d7_KjU() : j33, (i8 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m2014getOutline0d7_KjU() : j34, (i8 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m2015getOutlineVariant0d7_KjU() : j35, (i8 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m2018getScrim0d7_KjU() : j36);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens value) {
        AbstractC3159y.i(colorScheme, "<this>");
        AbstractC3159y.i(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return colorScheme.m1507getBackground0d7_KjU();
            case 2:
                return colorScheme.m1508getError0d7_KjU();
            case 3:
                return colorScheme.m1509getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m1510getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m1511getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m1512getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m1513getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m1514getOnError0d7_KjU();
            case 9:
                return colorScheme.m1515getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m1516getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m1517getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m1518getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m1519getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m1520getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m1521getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m1532getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m1522getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m1523getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m1524getOutline0d7_KjU();
            case 20:
                return colorScheme.m1525getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m1526getPrimary0d7_KjU();
            case 22:
                return colorScheme.m1527getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m1528getScrim0d7_KjU();
            case 24:
                return colorScheme.m1529getSecondary0d7_KjU();
            case 25:
                return colorScheme.m1530getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m1531getSurface0d7_KjU();
            case 27:
                return colorScheme.m1533getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m1534getTertiary0d7_KjU();
            case 29:
                return colorScheme.m1535getTertiaryContainer0d7_KjU();
            default:
                throw new p();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m1570lightColorSchemeG1PFcw(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1571lightColorSchemeG1PFcw$default(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i8, Object obj) {
        long m2045getPrimary0d7_KjU = (i8 & 1) != 0 ? ColorLightTokens.INSTANCE.m2045getPrimary0d7_KjU() : j8;
        return m1570lightColorSchemeG1PFcw(m2045getPrimary0d7_KjU, (i8 & 2) != 0 ? ColorLightTokens.INSTANCE.m2035getOnPrimary0d7_KjU() : j9, (i8 & 4) != 0 ? ColorLightTokens.INSTANCE.m2046getPrimaryContainer0d7_KjU() : j10, (i8 & 8) != 0 ? ColorLightTokens.INSTANCE.m2036getOnPrimaryContainer0d7_KjU() : j11, (i8 & 16) != 0 ? ColorLightTokens.INSTANCE.m2030getInversePrimary0d7_KjU() : j12, (i8 & 32) != 0 ? ColorLightTokens.INSTANCE.m2048getSecondary0d7_KjU() : j13, (i8 & 64) != 0 ? ColorLightTokens.INSTANCE.m2037getOnSecondary0d7_KjU() : j14, (i8 & 128) != 0 ? ColorLightTokens.INSTANCE.m2049getSecondaryContainer0d7_KjU() : j15, (i8 & 256) != 0 ? ColorLightTokens.INSTANCE.m2038getOnSecondaryContainer0d7_KjU() : j16, (i8 & 512) != 0 ? ColorLightTokens.INSTANCE.m2053getTertiary0d7_KjU() : j17, (i8 & 1024) != 0 ? ColorLightTokens.INSTANCE.m2041getOnTertiary0d7_KjU() : j18, (i8 & 2048) != 0 ? ColorLightTokens.INSTANCE.m2054getTertiaryContainer0d7_KjU() : j19, (i8 & 4096) != 0 ? ColorLightTokens.INSTANCE.m2042getOnTertiaryContainer0d7_KjU() : j20, (i8 & 8192) != 0 ? ColorLightTokens.INSTANCE.m2026getBackground0d7_KjU() : j21, (i8 & 16384) != 0 ? ColorLightTokens.INSTANCE.m2032getOnBackground0d7_KjU() : j22, (i8 & 32768) != 0 ? ColorLightTokens.INSTANCE.m2050getSurface0d7_KjU() : j23, (i8 & 65536) != 0 ? ColorLightTokens.INSTANCE.m2039getOnSurface0d7_KjU() : j24, (i8 & 131072) != 0 ? ColorLightTokens.INSTANCE.m2052getSurfaceVariant0d7_KjU() : j25, (i8 & 262144) != 0 ? ColorLightTokens.INSTANCE.m2040getOnSurfaceVariant0d7_KjU() : j26, (i8 & 524288) != 0 ? m2045getPrimary0d7_KjU : j27, (i8 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m2031getInverseSurface0d7_KjU() : j28, (i8 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m2029getInverseOnSurface0d7_KjU() : j29, (i8 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m2027getError0d7_KjU() : j30, (i8 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m2033getOnError0d7_KjU() : j31, (i8 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m2028getErrorContainer0d7_KjU() : j32, (i8 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m2034getOnErrorContainer0d7_KjU() : j33, (i8 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m2043getOutline0d7_KjU() : j34, (i8 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m2044getOutlineVariant0d7_KjU() : j35, (i8 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m2047getScrim0d7_KjU() : j36);
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m1572surfaceColorAtElevation3ABfNKs(ColorScheme surfaceColorAtElevation, float f8) {
        AbstractC3159y.i(surfaceColorAtElevation, "$this$surfaceColorAtElevation");
        if (Dp.m5183equalsimpl0(f8, Dp.m5178constructorimpl(0))) {
            return surfaceColorAtElevation.m1531getSurface0d7_KjU();
        }
        return ColorKt.m3016compositeOverOWjLjI(Color.m2970copywmQWz5c$default(surfaceColorAtElevation.m1532getSurfaceTint0d7_KjU(), ((((float) Math.log(f8 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), surfaceColorAtElevation.m1531getSurface0d7_KjU());
    }

    @Composable
    @ReadOnlyComposable
    public static final long toColor(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i8) {
        AbstractC3159y.i(colorSchemeKeyTokens, "<this>");
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
        AbstractC3159y.i(colorScheme, "<this>");
        AbstractC3159y.i(other, "other");
        colorScheme.m1555setPrimary8_81llA$material3_release(other.m1526getPrimary0d7_KjU());
        colorScheme.m1545setOnPrimary8_81llA$material3_release(other.m1516getOnPrimary0d7_KjU());
        colorScheme.m1556setPrimaryContainer8_81llA$material3_release(other.m1527getPrimaryContainer0d7_KjU());
        colorScheme.m1546setOnPrimaryContainer8_81llA$material3_release(other.m1517getOnPrimaryContainer0d7_KjU());
        colorScheme.m1540setInversePrimary8_81llA$material3_release(other.m1511getInversePrimary0d7_KjU());
        colorScheme.m1558setSecondary8_81llA$material3_release(other.m1529getSecondary0d7_KjU());
        colorScheme.m1547setOnSecondary8_81llA$material3_release(other.m1518getOnSecondary0d7_KjU());
        colorScheme.m1559setSecondaryContainer8_81llA$material3_release(other.m1530getSecondaryContainer0d7_KjU());
        colorScheme.m1548setOnSecondaryContainer8_81llA$material3_release(other.m1519getOnSecondaryContainer0d7_KjU());
        colorScheme.m1563setTertiary8_81llA$material3_release(other.m1534getTertiary0d7_KjU());
        colorScheme.m1551setOnTertiary8_81llA$material3_release(other.m1522getOnTertiary0d7_KjU());
        colorScheme.m1564setTertiaryContainer8_81llA$material3_release(other.m1535getTertiaryContainer0d7_KjU());
        colorScheme.m1552setOnTertiaryContainer8_81llA$material3_release(other.m1523getOnTertiaryContainer0d7_KjU());
        colorScheme.m1536setBackground8_81llA$material3_release(other.m1507getBackground0d7_KjU());
        colorScheme.m1542setOnBackground8_81llA$material3_release(other.m1513getOnBackground0d7_KjU());
        colorScheme.m1560setSurface8_81llA$material3_release(other.m1531getSurface0d7_KjU());
        colorScheme.m1549setOnSurface8_81llA$material3_release(other.m1520getOnSurface0d7_KjU());
        colorScheme.m1562setSurfaceVariant8_81llA$material3_release(other.m1533getSurfaceVariant0d7_KjU());
        colorScheme.m1550setOnSurfaceVariant8_81llA$material3_release(other.m1521getOnSurfaceVariant0d7_KjU());
        colorScheme.m1561setSurfaceTint8_81llA$material3_release(other.m1532getSurfaceTint0d7_KjU());
        colorScheme.m1541setInverseSurface8_81llA$material3_release(other.m1512getInverseSurface0d7_KjU());
        colorScheme.m1539setInverseOnSurface8_81llA$material3_release(other.m1510getInverseOnSurface0d7_KjU());
        colorScheme.m1537setError8_81llA$material3_release(other.m1508getError0d7_KjU());
        colorScheme.m1543setOnError8_81llA$material3_release(other.m1514getOnError0d7_KjU());
        colorScheme.m1538setErrorContainer8_81llA$material3_release(other.m1509getErrorContainer0d7_KjU());
        colorScheme.m1544setOnErrorContainer8_81llA$material3_release(other.m1515getOnErrorContainer0d7_KjU());
        colorScheme.m1553setOutline8_81llA$material3_release(other.m1524getOutline0d7_KjU());
        colorScheme.m1554setOutlineVariant8_81llA$material3_release(other.m1525getOutlineVariant0d7_KjU());
        colorScheme.m1557setScrim8_81llA$material3_release(other.m1528getScrim0d7_KjU());
    }
}
