package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(Density density, long j8) {
        return Z5.a.d(density.mo447toPxR2X_6o(j8));
    }

    public static int b(Density density, float f8) {
        float mo448toPx0680j_4 = density.mo448toPx0680j_4(f8);
        if (Float.isInfinite(mo448toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Z5.a.d(mo448toPx0680j_4);
    }

    public static float c(Density density, float f8) {
        return Dp.m5178constructorimpl(f8 / density.getDensity());
    }

    public static float d(Density density, int i8) {
        return Dp.m5178constructorimpl(i8 / density.getDensity());
    }

    public static long e(Density density, long j8) {
        if (j8 != Size.Companion.m2812getUnspecifiedNHjbRc()) {
            return DpKt.m5200DpSizeYgX7TsA(density.mo444toDpu2uoSUM(Size.m2804getWidthimpl(j8)), density.mo444toDpu2uoSUM(Size.m2801getHeightimpl(j8)));
        }
        return DpSize.Companion.m5285getUnspecifiedMYxV2XQ();
    }

    public static float f(Density density, long j8) {
        if (TextUnitType.m5393equalsimpl0(TextUnit.m5364getTypeUIouoOA(j8), TextUnitType.Companion.m5398getSpUIouoOA())) {
            return density.mo448toPx0680j_4(density.mo443toDpGaN1DYA(j8));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static float g(Density density, float f8) {
        return f8 * density.getDensity();
    }

    public static Rect h(Density density, DpRect dpRect) {
        return new Rect(density.mo448toPx0680j_4(dpRect.m5261getLeftD9Ej5fM()), density.mo448toPx0680j_4(dpRect.m5263getTopD9Ej5fM()), density.mo448toPx0680j_4(dpRect.m5262getRightD9Ej5fM()), density.mo448toPx0680j_4(dpRect.m5260getBottomD9Ej5fM()));
    }

    public static long i(Density density, long j8) {
        if (j8 != DpSize.Companion.m5285getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(density.mo448toPx0680j_4(DpSize.m5276getWidthD9Ej5fM(j8)), density.mo448toPx0680j_4(DpSize.m5274getHeightD9Ej5fM(j8)));
        }
        return Size.Companion.m2812getUnspecifiedNHjbRc();
    }

    public static long j(Density density, float f8) {
        return density.mo450toSp0xMU5do(density.mo444toDpu2uoSUM(f8));
    }

    public static long k(Density density, int i8) {
        return density.mo450toSp0xMU5do(density.mo445toDpu2uoSUM(i8));
    }
}
