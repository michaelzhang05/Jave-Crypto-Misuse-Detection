package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import d6.m;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m5199DpOffsetYgX7TsA(float f8, float f9) {
        return DpOffset.m5234constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m5200DpSizeYgX7TsA(float f8, float f9) {
        return DpSize.m5267constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m5201coerceAtLeastYgX7TsA(float f8, float f9) {
        return Dp.m5178constructorimpl(m.c(f8, f9));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m5202coerceAtMostYgX7TsA(float f8, float f9) {
        return Dp.m5178constructorimpl(m.f(f8, f9));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m5203coerceIn2z7ARbQ(float f8, float f9, float f10) {
        return Dp.m5178constructorimpl(m.j(f8, f9, f10));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m5204getCenterEaSLcWc(long j8) {
        return m5199DpOffsetYgX7TsA(Dp.m5178constructorimpl(DpSize.m5276getWidthD9Ej5fM(j8) / 2.0f), Dp.m5178constructorimpl(DpSize.m5274getHeightD9Ej5fM(j8) / 2.0f));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5205getCenterEaSLcWc$annotations(long j8) {
    }

    public static final float getDp(int i8) {
        return Dp.m5178constructorimpl(i8);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d8) {
    }

    public static final float getHeight(DpRect dpRect) {
        return Dp.m5178constructorimpl(dpRect.m5260getBottomD9Ej5fM() - dpRect.m5263getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(DpRect dpRect) {
        return m5200DpSizeYgX7TsA(Dp.m5178constructorimpl(dpRect.m5262getRightD9Ej5fM() - dpRect.m5261getLeftD9Ej5fM()), Dp.m5178constructorimpl(dpRect.m5260getBottomD9Ej5fM() - dpRect.m5263getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(DpRect dpRect) {
        return Dp.m5178constructorimpl(dpRect.m5262getRightD9Ej5fM() - dpRect.m5261getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m5206isFinite0680j_4(float f8) {
        return !(f8 == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5207isFinite0680j_4$annotations(float f8) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m5208isSpecified0680j_4(float f8) {
        return !Float.isNaN(f8);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5209isSpecified0680j_4$annotations(float f8) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5210isSpecifiedEaSLcWc(long j8) {
        if (j8 != DpSize.Companion.m5285getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5211isSpecifiedEaSLcWc$annotations(long j8) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5212isSpecifiedjoFl9I(long j8) {
        if (j8 != DpOffset.Companion.m5248getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5213isSpecifiedjoFl9I$annotations(long j8) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m5214isUnspecified0680j_4(float f8) {
        return Float.isNaN(f8);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5215isUnspecified0680j_4$annotations(float f8) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5216isUnspecifiedEaSLcWc(long j8) {
        if (j8 == DpSize.Companion.m5285getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5217isUnspecifiedEaSLcWc$annotations(long j8) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5218isUnspecifiedjoFl9I(long j8) {
        if (j8 == DpOffset.Companion.m5248getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5219isUnspecifiedjoFl9I$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m5220lerpIDex15A(long j8, long j9, float f8) {
        return m5200DpSizeYgX7TsA(m5221lerpMdfbLM(DpSize.m5276getWidthD9Ej5fM(j8), DpSize.m5276getWidthD9Ej5fM(j9), f8), m5221lerpMdfbLM(DpSize.m5274getHeightD9Ej5fM(j8), DpSize.m5274getHeightD9Ej5fM(j9), f8));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m5221lerpMdfbLM(float f8, float f9, float f10) {
        return Dp.m5178constructorimpl(MathHelpersKt.lerp(f8, f9, f10));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m5222lerpxhh869w(long j8, long j9, float f8) {
        return m5199DpOffsetYgX7TsA(m5221lerpMdfbLM(DpOffset.m5239getXD9Ej5fM(j8), DpOffset.m5239getXD9Ej5fM(j9), f8), m5221lerpMdfbLM(DpOffset.m5241getYD9Ej5fM(j8), DpOffset.m5241getYD9Ej5fM(j9), f8));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m5223maxYgX7TsA(float f8, float f9) {
        return Dp.m5178constructorimpl(Math.max(f8, f9));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m5224minYgX7TsA(float f8, float f9) {
        return Dp.m5178constructorimpl(Math.min(f8, f9));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m5225takeOrElseD5KLDUw(float f8, Function0 function0) {
        if (!(!Float.isNaN(f8))) {
            return ((Dp) function0.invoke()).m5192unboximpl();
        }
        return f8;
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m5226takeOrElsegVKV90s(long j8, Function0 function0) {
        if (j8 == DpOffset.Companion.m5248getUnspecifiedRKDOV3M()) {
            return ((DpOffset) function0.invoke()).m5247unboximpl();
        }
        return j8;
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m5227takeOrElseitqla9I(long j8, Function0 function0) {
        if (j8 == DpSize.Companion.m5285getUnspecifiedMYxV2XQ()) {
            return ((DpSize) function0.invoke()).m5284unboximpl();
        }
        return j8;
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5229times3ABfNKs(float f8, float f9) {
        return Dp.m5178constructorimpl(f8 * f9);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5232times6HolHcs(int i8, long j8) {
        return DpSize.m5282timesGh9hcWk(j8, i8);
    }

    public static final float getDp(double d8) {
        return Dp.m5178constructorimpl((float) d8);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f8) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5228times3ABfNKs(double d8, float f8) {
        return Dp.m5178constructorimpl(((float) d8) * f8);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5231times6HolHcs(float f8, long j8) {
        return DpSize.m5281timesGh9hcWk(j8, f8);
    }

    public static final float getDp(float f8) {
        return Dp.m5178constructorimpl(f8);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i8) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5230times3ABfNKs(int i8, float f8) {
        return Dp.m5178constructorimpl(i8 * f8);
    }
}
