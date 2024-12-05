package androidx.compose.foundation.lazy.staggeredgrid;

/* loaded from: classes.dex */
public final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m795boximpl(long j8) {
        return new SpanRange(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m797constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m798equalsimpl(long j8, Object obj) {
        return (obj instanceof SpanRange) && j8 == ((SpanRange) obj).m805unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m799equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m800getEndimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m801getSizeimpl(long j8) {
        return ((int) (4294967295L & j8)) - ((int) (j8 >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m802getStartimpl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m803hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m804toStringimpl(long j8) {
        return "SpanRange(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m798equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m803hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m804toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m805unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m796constructorimpl(int i8, int i9) {
        return m797constructorimpl(((i9 + i8) & 4294967295L) | (i8 << 32));
    }
}
