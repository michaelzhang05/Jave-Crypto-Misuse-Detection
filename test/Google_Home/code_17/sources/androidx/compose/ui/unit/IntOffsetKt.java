package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import c6.AbstractC2055a;

/* loaded from: classes.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i8, int i9) {
        return IntOffset.m5301constructorimpl((i9 & 4294967295L) | (i8 << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m5318lerp81ZRxRo(long j8, long j9, float f8) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m5307getXimpl(j8), IntOffset.m5307getXimpl(j9), f8), MathHelpersKt.lerp(IntOffset.m5308getYimpl(j8), IntOffset.m5308getYimpl(j9), f8));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m5319minusNvtHpc(long j8, long j9) {
        return OffsetKt.Offset(Offset.m2740getXimpl(j8) - IntOffset.m5307getXimpl(j9), Offset.m2741getYimpl(j8) - IntOffset.m5308getYimpl(j9));
    }

    @Stable
    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m5320minusoCl6YwE(long j8, long j9) {
        return OffsetKt.Offset(IntOffset.m5307getXimpl(j8) - Offset.m2740getXimpl(j9), IntOffset.m5308getYimpl(j8) - Offset.m2741getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m5321plusNvtHpc(long j8, long j9) {
        return OffsetKt.Offset(Offset.m2740getXimpl(j8) + IntOffset.m5307getXimpl(j9), Offset.m2741getYimpl(j8) + IntOffset.m5308getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m5322plusoCl6YwE(long j8, long j9) {
        return OffsetKt.Offset(IntOffset.m5307getXimpl(j8) + Offset.m2740getXimpl(j9), IntOffset.m5308getYimpl(j8) + Offset.m2741getYimpl(j9));
    }

    @Stable
    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m5323roundk4lQ0M(long j8) {
        return IntOffset(AbstractC2055a.d(Offset.m2740getXimpl(j8)), AbstractC2055a.d(Offset.m2741getYimpl(j8)));
    }

    @Stable
    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m5324toOffsetgyyYBs(long j8) {
        return OffsetKt.Offset(IntOffset.m5307getXimpl(j8), IntOffset.m5308getYimpl(j8));
    }
}
