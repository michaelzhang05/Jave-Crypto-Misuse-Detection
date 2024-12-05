package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m4697getZerod9O1mEE() {
            return TextRange.Zero;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ TextRange(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m4680boximpl(long j8) {
        return new TextRange(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4681constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m4682contains5zctL8(long j8, long j9) {
        if (m4690getMinimpl(j8) <= m4690getMinimpl(j9) && m4689getMaximpl(j9) <= m4689getMaximpl(j8)) {
            return true;
        }
        return false;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m4683containsimpl(long j8, int i8) {
        int m4690getMinimpl = m4690getMinimpl(j8);
        if (i8 >= m4689getMaximpl(j8) || m4690getMinimpl > i8) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4684equalsimpl(long j8, Object obj) {
        return (obj instanceof TextRange) && j8 == ((TextRange) obj).m4696unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4685equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m4686getCollapsedimpl(long j8) {
        if (m4692getStartimpl(j8) == m4687getEndimpl(j8)) {
            return true;
        }
        return false;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m4687getEndimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m4688getLengthimpl(long j8) {
        return m4689getMaximpl(j8) - m4690getMinimpl(j8);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m4689getMaximpl(long j8) {
        if (m4692getStartimpl(j8) > m4687getEndimpl(j8)) {
            return m4692getStartimpl(j8);
        }
        return m4687getEndimpl(j8);
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m4690getMinimpl(long j8) {
        if (m4692getStartimpl(j8) > m4687getEndimpl(j8)) {
            return m4687getEndimpl(j8);
        }
        return m4692getStartimpl(j8);
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m4691getReversedimpl(long j8) {
        if (m4692getStartimpl(j8) > m4687getEndimpl(j8)) {
            return true;
        }
        return false;
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m4692getStartimpl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4693hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m4694intersects5zctL8(long j8, long j9) {
        if (m4690getMinimpl(j8) < m4689getMaximpl(j9) && m4690getMinimpl(j9) < m4689getMaximpl(j8)) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4695toStringimpl(long j8) {
        return "TextRange(" + m4692getStartimpl(j8) + ", " + m4687getEndimpl(j8) + ')';
    }

    public boolean equals(Object obj) {
        return m4684equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4693hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4695toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4696unboximpl() {
        return this.packedValue;
    }
}
