package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f8, float f9) {
        return Offset.m2727constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m2752isFinitek4lQ0M(long j8) {
        float m2735getXimpl = Offset.m2735getXimpl(j8);
        if (!Float.isInfinite(m2735getXimpl) && !Float.isNaN(m2735getXimpl)) {
            float m2736getYimpl = Offset.m2736getYimpl(j8);
            if (!Float.isInfinite(m2736getYimpl) && !Float.isNaN(m2736getYimpl)) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m2753isFinitek4lQ0M$annotations(long j8) {
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m2754isSpecifiedk4lQ0M(long j8) {
        if (j8 != Offset.Companion.m2750getUnspecifiedF1C5BW0()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m2755isSpecifiedk4lQ0M$annotations(long j8) {
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m2756isUnspecifiedk4lQ0M(long j8) {
        if (j8 == Offset.Companion.m2750getUnspecifiedF1C5BW0()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m2757isUnspecifiedk4lQ0M$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m2758lerpWko1d7g(long j8, long j9, float f8) {
        return Offset(MathHelpersKt.lerp(Offset.m2735getXimpl(j8), Offset.m2735getXimpl(j9), f8), MathHelpersKt.lerp(Offset.m2736getYimpl(j8), Offset.m2736getYimpl(j9), f8));
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m2759takeOrElse3MmeM6k(long j8, Function0 function0) {
        if (!m2754isSpecifiedk4lQ0M(j8)) {
            return ((Offset) function0.invoke()).m2745unboximpl();
        }
        return j8;
    }
}
