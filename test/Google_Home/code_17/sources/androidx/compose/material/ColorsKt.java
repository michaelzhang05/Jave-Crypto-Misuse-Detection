package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class ColorsKt {
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(ColorsKt$LocalColors$1.INSTANCE);

    /* renamed from: contentColorFor-4WTKRHQ */
    public static final long m1200contentColorFor4WTKRHQ(Colors contentColorFor, long j8) {
        AbstractC3255y.i(contentColorFor, "$this$contentColorFor");
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1183getPrimary0d7_KjU())) {
            return contentColorFor.m1180getOnPrimary0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1184getPrimaryVariant0d7_KjU())) {
            return contentColorFor.m1180getOnPrimary0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1185getSecondary0d7_KjU())) {
            return contentColorFor.m1181getOnSecondary0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1186getSecondaryVariant0d7_KjU())) {
            return contentColorFor.m1181getOnSecondary0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1176getBackground0d7_KjU())) {
            return contentColorFor.m1178getOnBackground0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1187getSurface0d7_KjU())) {
            return contentColorFor.m1182getOnSurface0d7_KjU();
        }
        if (Color.m2977equalsimpl0(j8, contentColorFor.m1177getError0d7_KjU())) {
            return contentColorFor.m1179getOnError0d7_KjU();
        }
        return Color.Companion.m3012getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U */
    public static final long m1201contentColorForek8zF_U(long j8, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i8, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long m1200contentColorFor4WTKRHQ = m1200contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j8);
        if (m1200contentColorFor4WTKRHQ == Color.Companion.m3012getUnspecified0d7_KjU()) {
            m1200contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2986unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1200contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColors-2qZNXz8 */
    public static final Colors m1202darkColors2qZNXz8(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        return new Colors(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, false, null);
    }

    /* renamed from: darkColors-2qZNXz8$default */
    public static /* synthetic */ Colors m1203darkColors2qZNXz8$default(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i8, Object obj) {
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        if ((i8 & 1) != 0) {
            j20 = ColorKt.Color(4290479868L);
        } else {
            j20 = j8;
        }
        if ((i8 & 2) != 0) {
            j21 = ColorKt.Color(4281794739L);
        } else {
            j21 = j9;
        }
        if ((i8 & 4) != 0) {
            j22 = ColorKt.Color(4278442694L);
        } else {
            j22 = j10;
        }
        if ((i8 & 8) != 0) {
            j23 = j22;
        } else {
            j23 = j11;
        }
        if ((i8 & 16) != 0) {
            j24 = ColorKt.Color(4279374354L);
        } else {
            j24 = j12;
        }
        if ((i8 & 32) != 0) {
            j25 = ColorKt.Color(4279374354L);
        } else {
            j25 = j13;
        }
        if ((i8 & 64) != 0) {
            j26 = ColorKt.Color(4291782265L);
        } else {
            j26 = j14;
        }
        if ((i8 & 128) != 0) {
            j27 = Color.Companion.m3002getBlack0d7_KjU();
        } else {
            j27 = j15;
        }
        if ((i8 & 256) != 0) {
            j28 = Color.Companion.m3002getBlack0d7_KjU();
        } else {
            j28 = j16;
        }
        if ((i8 & 512) != 0) {
            j29 = Color.Companion.m3013getWhite0d7_KjU();
        } else {
            j29 = j17;
        }
        if ((i8 & 1024) != 0) {
            j30 = Color.Companion.m3013getWhite0d7_KjU();
        } else {
            j30 = j18;
        }
        if ((i8 & 2048) != 0) {
            j31 = Color.Companion.m3002getBlack0d7_KjU();
        } else {
            j31 = j19;
        }
        return m1202darkColors2qZNXz8(j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31);
    }

    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(Colors colors) {
        AbstractC3255y.i(colors, "<this>");
        if (colors.isLight()) {
            return colors.m1183getPrimary0d7_KjU();
        }
        return colors.m1187getSurface0d7_KjU();
    }

    /* renamed from: lightColors-2qZNXz8 */
    public static final Colors m1204lightColors2qZNXz8(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        return new Colors(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, true, null);
    }

    /* renamed from: lightColors-2qZNXz8$default */
    public static /* synthetic */ Colors m1205lightColors2qZNXz8$default(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i8, Object obj) {
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        if ((i8 & 1) != 0) {
            j20 = ColorKt.Color(4284612846L);
        } else {
            j20 = j8;
        }
        if ((i8 & 2) != 0) {
            j21 = ColorKt.Color(4281794739L);
        } else {
            j21 = j9;
        }
        if ((i8 & 4) != 0) {
            j22 = ColorKt.Color(4278442694L);
        } else {
            j22 = j10;
        }
        if ((i8 & 8) != 0) {
            j23 = ColorKt.Color(4278290310L);
        } else {
            j23 = j11;
        }
        if ((i8 & 16) != 0) {
            j24 = Color.Companion.m3013getWhite0d7_KjU();
        } else {
            j24 = j12;
        }
        if ((i8 & 32) != 0) {
            j25 = Color.Companion.m3013getWhite0d7_KjU();
        } else {
            j25 = j13;
        }
        if ((i8 & 64) != 0) {
            j26 = ColorKt.Color(4289724448L);
        } else {
            j26 = j14;
        }
        if ((i8 & 128) != 0) {
            j27 = Color.Companion.m3013getWhite0d7_KjU();
        } else {
            j27 = j15;
        }
        long j32 = j27;
        if ((i8 & 256) != 0) {
            j28 = Color.Companion.m3002getBlack0d7_KjU();
        } else {
            j28 = j16;
        }
        long j33 = j28;
        if ((i8 & 512) != 0) {
            j29 = Color.Companion.m3002getBlack0d7_KjU();
        } else {
            j29 = j17;
        }
        long j34 = j29;
        if ((i8 & 1024) != 0) {
            j30 = Color.Companion.m3002getBlack0d7_KjU();
        } else {
            j30 = j18;
        }
        if ((i8 & 2048) != 0) {
            j31 = Color.Companion.m3013getWhite0d7_KjU();
        } else {
            j31 = j19;
        }
        return m1204lightColors2qZNXz8(j20, j21, j22, j23, j24, j25, j26, j32, j33, j34, j30, j31);
    }

    public static final void updateColorsFrom(Colors colors, Colors other) {
        AbstractC3255y.i(colors, "<this>");
        AbstractC3255y.i(other, "other");
        colors.m1195setPrimary8_81llA$material_release(other.m1183getPrimary0d7_KjU());
        colors.m1196setPrimaryVariant8_81llA$material_release(other.m1184getPrimaryVariant0d7_KjU());
        colors.m1197setSecondary8_81llA$material_release(other.m1185getSecondary0d7_KjU());
        colors.m1198setSecondaryVariant8_81llA$material_release(other.m1186getSecondaryVariant0d7_KjU());
        colors.m1188setBackground8_81llA$material_release(other.m1176getBackground0d7_KjU());
        colors.m1199setSurface8_81llA$material_release(other.m1187getSurface0d7_KjU());
        colors.m1189setError8_81llA$material_release(other.m1177getError0d7_KjU());
        colors.m1192setOnPrimary8_81llA$material_release(other.m1180getOnPrimary0d7_KjU());
        colors.m1193setOnSecondary8_81llA$material_release(other.m1181getOnSecondary0d7_KjU());
        colors.m1190setOnBackground8_81llA$material_release(other.m1178getOnBackground0d7_KjU());
        colors.m1194setOnSurface8_81llA$material_release(other.m1182getOnSurface0d7_KjU());
        colors.m1191setOnError8_81llA$material_release(other.m1179getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }
}
