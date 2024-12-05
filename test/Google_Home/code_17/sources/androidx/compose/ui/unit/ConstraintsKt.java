package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import g6.m;

/* loaded from: classes.dex */
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i8, int i9, int i10, int i11) {
        if (i9 >= i8) {
            if (i11 >= i10) {
                if (i8 >= 0 && i10 >= 0) {
                    return Constraints.Companion.m5158createConstraintsZbe2FdA$ui_unit_release(i8, i9, i10, i11);
                }
                throw new IllegalArgumentException(("minWidth(" + i8 + ") and minHeight(" + i10 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i11 + ") must be >= than minHeight(" + i10 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i9 + ") must be >= than minWidth(" + i8 + ')').toString());
    }

    public static /* synthetic */ long Constraints$default(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = 0;
        }
        if ((i12 & 2) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return Constraints(i8, i9, i10, i11);
    }

    private static final int addMaxWithMinimum(int i8, int i9) {
        if (i8 != Integer.MAX_VALUE) {
            return m.d(i8 + i9, 0);
        }
        return i8;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m5162constrain4WqzIAM(long j8, long j9) {
        return IntSizeKt.IntSize(m.k(IntSize.m5349getWidthimpl(j9), Constraints.m5153getMinWidthimpl(j8), Constraints.m5151getMaxWidthimpl(j8)), m.k(IntSize.m5348getHeightimpl(j9), Constraints.m5152getMinHeightimpl(j8), Constraints.m5150getMaxHeightimpl(j8)));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m5163constrainN9IONVI(long j8, long j9) {
        return Constraints(m.k(Constraints.m5153getMinWidthimpl(j9), Constraints.m5153getMinWidthimpl(j8), Constraints.m5151getMaxWidthimpl(j8)), m.k(Constraints.m5151getMaxWidthimpl(j9), Constraints.m5153getMinWidthimpl(j8), Constraints.m5151getMaxWidthimpl(j8)), m.k(Constraints.m5152getMinHeightimpl(j9), Constraints.m5152getMinHeightimpl(j8), Constraints.m5150getMaxHeightimpl(j8)), m.k(Constraints.m5150getMaxHeightimpl(j9), Constraints.m5152getMinHeightimpl(j8), Constraints.m5150getMaxHeightimpl(j8)));
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m5164constrainHeightK40F9xA(long j8, int i8) {
        return m.k(i8, Constraints.m5152getMinHeightimpl(j8), Constraints.m5150getMaxHeightimpl(j8));
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m5165constrainWidthK40F9xA(long j8, int i8) {
        return m.k(i8, Constraints.m5153getMinWidthimpl(j8), Constraints.m5151getMaxWidthimpl(j8));
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m5166isSatisfiedBy4WqzIAM(long j8, long j9) {
        int m5153getMinWidthimpl = Constraints.m5153getMinWidthimpl(j8);
        int m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8);
        int m5349getWidthimpl = IntSize.m5349getWidthimpl(j9);
        if (m5153getMinWidthimpl <= m5349getWidthimpl && m5349getWidthimpl <= m5151getMaxWidthimpl) {
            int m5152getMinHeightimpl = Constraints.m5152getMinHeightimpl(j8);
            int m5150getMaxHeightimpl = Constraints.m5150getMaxHeightimpl(j8);
            int m5348getHeightimpl = IntSize.m5348getHeightimpl(j9);
            if (m5152getMinHeightimpl <= m5348getHeightimpl && m5348getHeightimpl <= m5150getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m5167offsetNN6EwU(long j8, int i8, int i9) {
        return Constraints(m.d(Constraints.m5153getMinWidthimpl(j8) + i8, 0), addMaxWithMinimum(Constraints.m5151getMaxWidthimpl(j8), i8), m.d(Constraints.m5152getMinHeightimpl(j8) + i9, 0), addMaxWithMinimum(Constraints.m5150getMaxHeightimpl(j8), i9));
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m5168offsetNN6EwU$default(long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return m5167offsetNN6EwU(j8, i8, i9);
    }
}
