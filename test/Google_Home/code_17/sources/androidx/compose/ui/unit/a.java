package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import c6.AbstractC2055a;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(Density density, long j8) {
        return AbstractC2055a.d(density.mo452toPxR2X_6o(j8));
    }

    public static int b(Density density, float f8) {
        float mo453toPx0680j_4 = density.mo453toPx0680j_4(f8);
        if (Float.isInfinite(mo453toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return AbstractC2055a.d(mo453toPx0680j_4);
    }

    public static float c(Density density, float f8) {
        return Dp.m5183constructorimpl(f8 / density.getDensity());
    }

    public static float d(Density density, int i8) {
        return Dp.m5183constructorimpl(i8 / density.getDensity());
    }

    public static long e(Density density, long j8) {
        if (j8 != Size.Companion.m2817getUnspecifiedNHjbRc()) {
            return DpKt.m5205DpSizeYgX7TsA(density.mo449toDpu2uoSUM(Size.m2809getWidthimpl(j8)), density.mo449toDpu2uoSUM(Size.m2806getHeightimpl(j8)));
        }
        return DpSize.Companion.m5290getUnspecifiedMYxV2XQ();
    }

    public static float f(Density density, long j8) {
        if (TextUnitType.m5398equalsimpl0(TextUnit.m5369getTypeUIouoOA(j8), TextUnitType.Companion.m5403getSpUIouoOA())) {
            return density.mo453toPx0680j_4(density.mo448toDpGaN1DYA(j8));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static float g(Density density, float f8) {
        return f8 * density.getDensity();
    }

    public static Rect h(Density density, DpRect dpRect) {
        return new Rect(density.mo453toPx0680j_4(dpRect.m5266getLeftD9Ej5fM()), density.mo453toPx0680j_4(dpRect.m5268getTopD9Ej5fM()), density.mo453toPx0680j_4(dpRect.m5267getRightD9Ej5fM()), density.mo453toPx0680j_4(dpRect.m5265getBottomD9Ej5fM()));
    }

    public static long i(Density density, long j8) {
        if (j8 != DpSize.Companion.m5290getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(density.mo453toPx0680j_4(DpSize.m5281getWidthD9Ej5fM(j8)), density.mo453toPx0680j_4(DpSize.m5279getHeightD9Ej5fM(j8)));
        }
        return Size.Companion.m2817getUnspecifiedNHjbRc();
    }

    public static long j(Density density, float f8) {
        return density.mo455toSp0xMU5do(density.mo449toDpu2uoSUM(f8));
    }

    public static long k(Density density, int i8) {
        return density.mo455toSp0xMU5do(density.mo450toDpu2uoSUM(i8));
    }
}
