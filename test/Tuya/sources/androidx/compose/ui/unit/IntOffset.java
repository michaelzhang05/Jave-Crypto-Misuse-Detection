package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class IntOffset {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = IntOffsetKt.IntOffset(0, 0);
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m5312getZeronOccac() {
            return IntOffset.Zero;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ IntOffset(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m5293boximpl(long j8) {
        return new IntOffset(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m5294component1impl(long j8) {
        return m5302getXimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m5295component2impl(long j8) {
        return m5303getYimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5296constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m5297copyiSbpLlY(long j8, int i8, int i9) {
        return IntOffsetKt.IntOffset(i8, i9);
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m5298copyiSbpLlY$default(long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = m5302getXimpl(j8);
        }
        if ((i10 & 2) != 0) {
            i9 = m5303getYimpl(j8);
        }
        return m5297copyiSbpLlY(j8, i8, i9);
    }

    @Stable
    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m5299divBjo55l4(long j8, float f8) {
        return IntOffsetKt.IntOffset(Z5.a.d(m5302getXimpl(j8) / f8), Z5.a.d(m5303getYimpl(j8) / f8));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5300equalsimpl(long j8, Object obj) {
        return (obj instanceof IntOffset) && j8 == ((IntOffset) obj).m5311unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5301equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m5302getXimpl(long j8) {
        return (int) (j8 >> 32);
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m5303getYimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5304hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    @Stable
    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m5305minusqkQi6aY(long j8, long j9) {
        return IntOffsetKt.IntOffset(m5302getXimpl(j8) - m5302getXimpl(j9), m5303getYimpl(j8) - m5303getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m5306plusqkQi6aY(long j8, long j9) {
        return IntOffsetKt.IntOffset(m5302getXimpl(j8) + m5302getXimpl(j9), m5303getYimpl(j8) + m5303getYimpl(j9));
    }

    @Stable
    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m5307remBjo55l4(long j8, int i8) {
        return IntOffsetKt.IntOffset(m5302getXimpl(j8) % i8, m5303getYimpl(j8) % i8);
    }

    @Stable
    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m5308timesBjo55l4(long j8, float f8) {
        return IntOffsetKt.IntOffset(Z5.a.d(m5302getXimpl(j8) * f8), Z5.a.d(m5303getYimpl(j8) * f8));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5309toStringimpl(long j8) {
        return '(' + m5302getXimpl(j8) + ", " + m5303getYimpl(j8) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m5310unaryMinusnOccac(long j8) {
        return IntOffsetKt.IntOffset(-m5302getXimpl(j8), -m5303getYimpl(j8));
    }

    public boolean equals(Object obj) {
        return m5300equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5304hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m5309toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5311unboximpl() {
        return this.packedValue;
    }
}
