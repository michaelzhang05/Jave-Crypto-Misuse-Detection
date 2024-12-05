package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f8, float f9) {
        return Offset.m2732constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m2757isFinitek4lQ0M(long j8) {
        float m2740getXimpl = Offset.m2740getXimpl(j8);
        if (!Float.isInfinite(m2740getXimpl) && !Float.isNaN(m2740getXimpl)) {
            float m2741getYimpl = Offset.m2741getYimpl(j8);
            if (!Float.isInfinite(m2741getYimpl) && !Float.isNaN(m2741getYimpl)) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m2758isFinitek4lQ0M$annotations(long j8) {
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m2759isSpecifiedk4lQ0M(long j8) {
        if (j8 != Offset.Companion.m2755getUnspecifiedF1C5BW0()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m2760isSpecifiedk4lQ0M$annotations(long j8) {
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m2761isUnspecifiedk4lQ0M(long j8) {
        if (j8 == Offset.Companion.m2755getUnspecifiedF1C5BW0()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m2762isUnspecifiedk4lQ0M$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m2763lerpWko1d7g(long j8, long j9, float f8) {
        return Offset(MathHelpersKt.lerp(Offset.m2740getXimpl(j8), Offset.m2740getXimpl(j9), f8), MathHelpersKt.lerp(Offset.m2741getYimpl(j8), Offset.m2741getYimpl(j9), f8));
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m2764takeOrElse3MmeM6k(long j8, Function0 function0) {
        if (!m2759isSpecifiedk4lQ0M(j8)) {
            return ((Offset) function0.invoke()).m2750unboximpl();
        }
        return j8;
    }
}
