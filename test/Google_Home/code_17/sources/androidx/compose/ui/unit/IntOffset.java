package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import c6.AbstractC2055a;
import kotlin.jvm.internal.AbstractC3247p;

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
        public final long m5317getZeronOccac() {
            return IntOffset.Zero;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ IntOffset(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m5298boximpl(long j8) {
        return new IntOffset(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m5299component1impl(long j8) {
        return m5307getXimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m5300component2impl(long j8) {
        return m5308getYimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5301constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m5302copyiSbpLlY(long j8, int i8, int i9) {
        return IntOffsetKt.IntOffset(i8, i9);
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m5303copyiSbpLlY$default(long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = m5307getXimpl(j8);
        }
        if ((i10 & 2) != 0) {
            i9 = m5308getYimpl(j8);
        }
        return m5302copyiSbpLlY(j8, i8, i9);
    }

    @Stable
    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m5304divBjo55l4(long j8, float f8) {
        return IntOffsetKt.IntOffset(AbstractC2055a.d(m5307getXimpl(j8) / f8), AbstractC2055a.d(m5308getYimpl(j8) / f8));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5305equalsimpl(long j8, Object obj) {
        return (obj instanceof IntOffset) && j8 == ((IntOffset) obj).m5316unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5306equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m5307getXimpl(long j8) {
        return (int) (j8 >> 32);
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m5308getYimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5309hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    @Stable
    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m5310minusqkQi6aY(long j8, long j9) {
        return IntOffsetKt.IntOffset(m5307getXimpl(j8) - m5307getXimpl(j9), m5308getYimpl(j8) - m5308getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m5311plusqkQi6aY(long j8, long j9) {
        return IntOffsetKt.IntOffset(m5307getXimpl(j8) + m5307getXimpl(j9), m5308getYimpl(j8) + m5308getYimpl(j9));
    }

    @Stable
    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m5312remBjo55l4(long j8, int i8) {
        return IntOffsetKt.IntOffset(m5307getXimpl(j8) % i8, m5308getYimpl(j8) % i8);
    }

    @Stable
    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m5313timesBjo55l4(long j8, float f8) {
        return IntOffsetKt.IntOffset(AbstractC2055a.d(m5307getXimpl(j8) * f8), AbstractC2055a.d(m5308getYimpl(j8) * f8));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5314toStringimpl(long j8) {
        return '(' + m5307getXimpl(j8) + ", " + m5308getYimpl(j8) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m5315unaryMinusnOccac(long j8) {
        return IntOffsetKt.IntOffset(-m5307getXimpl(j8), -m5308getYimpl(j8));
    }

    public boolean equals(Object obj) {
        return m5305equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5309hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m5314toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5316unboximpl() {
        return this.packedValue;
    }
}
