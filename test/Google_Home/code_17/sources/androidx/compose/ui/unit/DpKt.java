package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import g6.m;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m5204DpOffsetYgX7TsA(float f8, float f9) {
        return DpOffset.m5239constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m5205DpSizeYgX7TsA(float f8, float f9) {
        return DpSize.m5272constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m5206coerceAtLeastYgX7TsA(float f8, float f9) {
        return Dp.m5183constructorimpl(m.c(f8, f9));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m5207coerceAtMostYgX7TsA(float f8, float f9) {
        return Dp.m5183constructorimpl(m.f(f8, f9));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m5208coerceIn2z7ARbQ(float f8, float f9, float f10) {
        return Dp.m5183constructorimpl(m.j(f8, f9, f10));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m5209getCenterEaSLcWc(long j8) {
        return m5204DpOffsetYgX7TsA(Dp.m5183constructorimpl(DpSize.m5281getWidthD9Ej5fM(j8) / 2.0f), Dp.m5183constructorimpl(DpSize.m5279getHeightD9Ej5fM(j8) / 2.0f));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5210getCenterEaSLcWc$annotations(long j8) {
    }

    public static final float getDp(int i8) {
        return Dp.m5183constructorimpl(i8);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d8) {
    }

    public static final float getHeight(DpRect dpRect) {
        return Dp.m5183constructorimpl(dpRect.m5265getBottomD9Ej5fM() - dpRect.m5268getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(DpRect dpRect) {
        return m5205DpSizeYgX7TsA(Dp.m5183constructorimpl(dpRect.m5267getRightD9Ej5fM() - dpRect.m5266getLeftD9Ej5fM()), Dp.m5183constructorimpl(dpRect.m5265getBottomD9Ej5fM() - dpRect.m5268getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(DpRect dpRect) {
        return Dp.m5183constructorimpl(dpRect.m5267getRightD9Ej5fM() - dpRect.m5266getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m5211isFinite0680j_4(float f8) {
        return !(f8 == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5212isFinite0680j_4$annotations(float f8) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m5213isSpecified0680j_4(float f8) {
        return !Float.isNaN(f8);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5214isSpecified0680j_4$annotations(float f8) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5215isSpecifiedEaSLcWc(long j8) {
        if (j8 != DpSize.Companion.m5290getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5216isSpecifiedEaSLcWc$annotations(long j8) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5217isSpecifiedjoFl9I(long j8) {
        if (j8 != DpOffset.Companion.m5253getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5218isSpecifiedjoFl9I$annotations(long j8) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m5219isUnspecified0680j_4(float f8) {
        return Float.isNaN(f8);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5220isUnspecified0680j_4$annotations(float f8) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5221isUnspecifiedEaSLcWc(long j8) {
        if (j8 == DpSize.Companion.m5290getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5222isUnspecifiedEaSLcWc$annotations(long j8) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5223isUnspecifiedjoFl9I(long j8) {
        if (j8 == DpOffset.Companion.m5253getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5224isUnspecifiedjoFl9I$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m5225lerpIDex15A(long j8, long j9, float f8) {
        return m5205DpSizeYgX7TsA(m5226lerpMdfbLM(DpSize.m5281getWidthD9Ej5fM(j8), DpSize.m5281getWidthD9Ej5fM(j9), f8), m5226lerpMdfbLM(DpSize.m5279getHeightD9Ej5fM(j8), DpSize.m5279getHeightD9Ej5fM(j9), f8));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m5226lerpMdfbLM(float f8, float f9, float f10) {
        return Dp.m5183constructorimpl(MathHelpersKt.lerp(f8, f9, f10));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m5227lerpxhh869w(long j8, long j9, float f8) {
        return m5204DpOffsetYgX7TsA(m5226lerpMdfbLM(DpOffset.m5244getXD9Ej5fM(j8), DpOffset.m5244getXD9Ej5fM(j9), f8), m5226lerpMdfbLM(DpOffset.m5246getYD9Ej5fM(j8), DpOffset.m5246getYD9Ej5fM(j9), f8));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m5228maxYgX7TsA(float f8, float f9) {
        return Dp.m5183constructorimpl(Math.max(f8, f9));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m5229minYgX7TsA(float f8, float f9) {
        return Dp.m5183constructorimpl(Math.min(f8, f9));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m5230takeOrElseD5KLDUw(float f8, Function0 function0) {
        if (!(!Float.isNaN(f8))) {
            return ((Dp) function0.invoke()).m5197unboximpl();
        }
        return f8;
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m5231takeOrElsegVKV90s(long j8, Function0 function0) {
        if (j8 == DpOffset.Companion.m5253getUnspecifiedRKDOV3M()) {
            return ((DpOffset) function0.invoke()).m5252unboximpl();
        }
        return j8;
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m5232takeOrElseitqla9I(long j8, Function0 function0) {
        if (j8 == DpSize.Companion.m5290getUnspecifiedMYxV2XQ()) {
            return ((DpSize) function0.invoke()).m5289unboximpl();
        }
        return j8;
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5234times3ABfNKs(float f8, float f9) {
        return Dp.m5183constructorimpl(f8 * f9);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5237times6HolHcs(int i8, long j8) {
        return DpSize.m5287timesGh9hcWk(j8, i8);
    }

    public static final float getDp(double d8) {
        return Dp.m5183constructorimpl((float) d8);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f8) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5233times3ABfNKs(double d8, float f8) {
        return Dp.m5183constructorimpl(((float) d8) * f8);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5236times6HolHcs(float f8, long j8) {
        return DpSize.m5286timesGh9hcWk(j8, f8);
    }

    public static final float getDp(float f8) {
        return Dp.m5183constructorimpl(f8);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i8) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5235times3ABfNKs(int i8, float f8) {
        return Dp.m5183constructorimpl(i8 * f8);
    }
}
