package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class IntSize {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m5344constructorimpl(0);
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m5354getZeroYbymL2g() {
            return IntSize.Zero;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ IntSize(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m5341boximpl(long j8) {
        return new IntSize(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m5342component1impl(long j8) {
        return m5349getWidthimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m5343component2impl(long j8) {
        return m5348getHeightimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5344constructorimpl(long j8) {
        return j8;
    }

    @Stable
    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m5345divYEO4UFw(long j8, int i8) {
        return IntSizeKt.IntSize(m5349getWidthimpl(j8) / i8, m5348getHeightimpl(j8) / i8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5346equalsimpl(long j8, Object obj) {
        return (obj instanceof IntSize) && j8 == ((IntSize) obj).m5353unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5347equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m5348getHeightimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m5349getWidthimpl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5350hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    @Stable
    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m5351timesYEO4UFw(long j8, int i8) {
        return IntSizeKt.IntSize(m5349getWidthimpl(j8) * i8, m5348getHeightimpl(j8) * i8);
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5352toStringimpl(long j8) {
        return m5349getWidthimpl(j8) + " x " + m5348getHeightimpl(j8);
    }

    public boolean equals(Object obj) {
        return m5346equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5350hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m5352toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5353unboximpl() {
        return this.packedValue;
    }
}
