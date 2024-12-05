package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m571boximpl(long j8) {
        return new OrientationIndependentConstraints(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m573constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m575copyyUG9Ft0(long j8, int i8, int i9, int i10, int i11) {
        return m572constructorimpl(i8, i9, i10, i11);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m576copyyUG9Ft0$default(long j8, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = Constraints.m5153getMinWidthimpl(j8);
        }
        int i13 = i8;
        if ((i12 & 2) != 0) {
            i9 = Constraints.m5151getMaxWidthimpl(j8);
        }
        int i14 = i9;
        if ((i12 & 4) != 0) {
            i10 = Constraints.m5152getMinHeightimpl(j8);
        }
        int i15 = i10;
        if ((i12 & 8) != 0) {
            i11 = Constraints.m5150getMaxHeightimpl(j8);
        }
        return m575copyyUG9Ft0(j8, i13, i14, i15, i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m577equalsimpl(long j8, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m5144equalsimpl0(j8, ((OrientationIndependentConstraints) obj).m589unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m578equalsimpl0(long j8, long j9) {
        return Constraints.m5144equalsimpl0(j8, j9);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m579getCrossAxisMaximpl(long j8) {
        return Constraints.m5150getMaxHeightimpl(j8);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m580getCrossAxisMinimpl(long j8) {
        return Constraints.m5152getMinHeightimpl(j8);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m581getMainAxisMaximpl(long j8) {
        return Constraints.m5151getMaxWidthimpl(j8);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m582getMainAxisMinimpl(long j8) {
        return Constraints.m5153getMinWidthimpl(j8);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m583hashCodeimpl(long j8) {
        return Constraints.m5154hashCodeimpl(j8);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m584maxHeightimpl(long j8, LayoutOrientation orientation) {
        AbstractC3255y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return Constraints.m5150getMaxHeightimpl(j8);
        }
        return Constraints.m5151getMaxWidthimpl(j8);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m585maxWidthimpl(long j8, LayoutOrientation orientation) {
        AbstractC3255y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return Constraints.m5151getMaxWidthimpl(j8);
        }
        return Constraints.m5150getMaxHeightimpl(j8);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m586stretchCrossAxisq4ezo7Y(long j8) {
        int m5152getMinHeightimpl;
        int m5153getMinWidthimpl = Constraints.m5153getMinWidthimpl(j8);
        int m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8);
        if (Constraints.m5150getMaxHeightimpl(j8) != Integer.MAX_VALUE) {
            m5152getMinHeightimpl = Constraints.m5150getMaxHeightimpl(j8);
        } else {
            m5152getMinHeightimpl = Constraints.m5152getMinHeightimpl(j8);
        }
        return m572constructorimpl(m5153getMinWidthimpl, m5151getMaxWidthimpl, m5152getMinHeightimpl, Constraints.m5150getMaxHeightimpl(j8));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m587toBoxConstraintsOenEA2s(long j8, LayoutOrientation orientation) {
        AbstractC3255y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return ConstraintsKt.Constraints(Constraints.m5153getMinWidthimpl(j8), Constraints.m5151getMaxWidthimpl(j8), Constraints.m5152getMinHeightimpl(j8), Constraints.m5150getMaxHeightimpl(j8));
        }
        return ConstraintsKt.Constraints(Constraints.m5152getMinHeightimpl(j8), Constraints.m5150getMaxHeightimpl(j8), Constraints.m5153getMinWidthimpl(j8), Constraints.m5151getMaxWidthimpl(j8));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m588toStringimpl(long j8) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m5156toStringimpl(j8)) + ')';
    }

    public boolean equals(Object obj) {
        return m577equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m583hashCodeimpl(this.value);
    }

    public String toString() {
        return m588toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m589unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m572constructorimpl(int i8, int i9, int i10, int i11) {
        return m573constructorimpl(ConstraintsKt.Constraints(i8, i9, i10, i11));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m574constructorimpl(long j8, LayoutOrientation orientation) {
        AbstractC3255y.i(orientation, "orientation");
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        return m572constructorimpl(orientation == layoutOrientation ? Constraints.m5153getMinWidthimpl(j8) : Constraints.m5152getMinHeightimpl(j8), orientation == layoutOrientation ? Constraints.m5151getMaxWidthimpl(j8) : Constraints.m5150getMaxHeightimpl(j8), orientation == layoutOrientation ? Constraints.m5152getMinHeightimpl(j8) : Constraints.m5153getMinWidthimpl(j8), orientation == layoutOrientation ? Constraints.m5150getMaxHeightimpl(j8) : Constraints.m5151getMaxWidthimpl(j8));
    }
}
