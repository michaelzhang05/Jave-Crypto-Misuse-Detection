package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static float a(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8) {
        if (TextUnitType.m5393equalsimpl0(TextUnit.m5364getTypeUIouoOA(j8), TextUnitType.Companion.m5398getSpUIouoOA())) {
            return Dp.m5178constructorimpl(TextUnit.m5365getValueimpl(j8) * lazyLayoutMeasureScope.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static float b(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f8) {
        return Dp.m5178constructorimpl(f8 / lazyLayoutMeasureScope.getDensity());
    }

    public static float c(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i8) {
        return Dp.m5178constructorimpl(i8 / lazyLayoutMeasureScope.getDensity());
    }

    public static long d(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8) {
        if (j8 != Size.Companion.m2812getUnspecifiedNHjbRc()) {
            return DpKt.m5200DpSizeYgX7TsA(lazyLayoutMeasureScope.mo444toDpu2uoSUM(Size.m2804getWidthimpl(j8)), lazyLayoutMeasureScope.mo444toDpu2uoSUM(Size.m2801getHeightimpl(j8)));
        }
        return DpSize.Companion.m5285getUnspecifiedMYxV2XQ();
    }

    public static long e(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j8) {
        if (j8 != DpSize.Companion.m5285getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(lazyLayoutMeasureScope.mo448toPx0680j_4(DpSize.m5276getWidthD9Ej5fM(j8)), lazyLayoutMeasureScope.mo448toPx0680j_4(DpSize.m5274getHeightD9Ej5fM(j8)));
        }
        return Size.Companion.m2812getUnspecifiedNHjbRc();
    }

    public static long f(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f8) {
        return TextUnitKt.getSp(f8 / lazyLayoutMeasureScope.getFontScale());
    }

    public static long g(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f8) {
        return TextUnitKt.getSp(f8 / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }

    public static long h(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i8) {
        return TextUnitKt.getSp(i8 / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }
}
