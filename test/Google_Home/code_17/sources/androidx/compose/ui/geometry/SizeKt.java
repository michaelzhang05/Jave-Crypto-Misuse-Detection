package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SizeKt {
    @Stable
    public static final long Size(float f8, float f9) {
        return Size.m2800constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m2819getCenteruvyYCjk(long j8) {
        return OffsetKt.Offset(Size.m2809getWidthimpl(j8) / 2.0f, Size.m2806getHeightimpl(j8) / 2.0f);
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m2820getCenteruvyYCjk$annotations(long j8) {
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m2821isSpecifieduvyYCjk(long j8) {
        if (j8 != Size.Companion.m2817getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m2822isSpecifieduvyYCjk$annotations(long j8) {
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m2823isUnspecifieduvyYCjk(long j8) {
        if (j8 == Size.Companion.m2817getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m2824isUnspecifieduvyYCjk$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m2825lerpVgWVRYQ(long j8, long j9, float f8) {
        return Size(MathHelpersKt.lerp(Size.m2809getWidthimpl(j8), Size.m2809getWidthimpl(j9), f8), MathHelpersKt.lerp(Size.m2806getHeightimpl(j8), Size.m2806getHeightimpl(j9), f8));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m2826takeOrElseTmRCtEA(long j8, Function0 function0) {
        if (j8 == Size.Companion.m2817getUnspecifiedNHjbRc()) {
            return ((Size) function0.invoke()).m2814unboximpl();
        }
        return j8;
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m2829timesd16Qtg0(int i8, long j8) {
        return Size.m2812times7Ah8Wj8(j8, i8);
    }

    @Stable
    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m2830toRectuvyYCjk(long j8) {
        return RectKt.m2780Recttz77jQw(Offset.Companion.m2756getZeroF1C5BW0(), j8);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m2827timesd16Qtg0(double d8, long j8) {
        return Size.m2812times7Ah8Wj8(j8, (float) d8);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m2828timesd16Qtg0(float f8, long j8) {
        return Size.m2812times7Ah8Wj8(j8, f8);
    }
}
