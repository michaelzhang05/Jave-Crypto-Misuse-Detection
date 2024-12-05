package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i8, int i9) {
        return IntOffset.m5296constructorimpl((i9 & 4294967295L) | (i8 << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m5313lerp81ZRxRo(long j8, long j9, float f8) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m5302getXimpl(j8), IntOffset.m5302getXimpl(j9), f8), MathHelpersKt.lerp(IntOffset.m5303getYimpl(j8), IntOffset.m5303getYimpl(j9), f8));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m5314minusNvtHpc(long j8, long j9) {
        return OffsetKt.Offset(Offset.m2735getXimpl(j8) - IntOffset.m5302getXimpl(j9), Offset.m2736getYimpl(j8) - IntOffset.m5303getYimpl(j9));
    }

    @Stable
    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m5315minusoCl6YwE(long j8, long j9) {
        return OffsetKt.Offset(IntOffset.m5302getXimpl(j8) - Offset.m2735getXimpl(j9), IntOffset.m5303getYimpl(j8) - Offset.m2736getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m5316plusNvtHpc(long j8, long j9) {
        return OffsetKt.Offset(Offset.m2735getXimpl(j8) + IntOffset.m5302getXimpl(j9), Offset.m2736getYimpl(j8) + IntOffset.m5303getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m5317plusoCl6YwE(long j8, long j9) {
        return OffsetKt.Offset(IntOffset.m5302getXimpl(j8) + Offset.m2735getXimpl(j9), IntOffset.m5303getYimpl(j8) + Offset.m2736getYimpl(j9));
    }

    @Stable
    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m5318roundk4lQ0M(long j8) {
        return IntOffset(Z5.a.d(Offset.m2735getXimpl(j8)), Z5.a.d(Offset.m2736getYimpl(j8)));
    }

    @Stable
    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m5319toOffsetgyyYBs(long j8) {
        return OffsetKt.Offset(IntOffset.m5302getXimpl(j8), IntOffset.m5303getYimpl(j8));
    }
}
