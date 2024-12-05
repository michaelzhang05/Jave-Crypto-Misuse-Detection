package androidx.collection;

/* loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m115boximpl(long j8) {
        return new IntIntPair(j8);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m116component1impl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m117component2impl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m119constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m120equalsimpl(long j8, Object obj) {
        return (obj instanceof IntIntPair) && j8 == ((IntIntPair) obj).m126unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m121equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m122getFirstimpl(long j8) {
        return (int) (j8 >> 32);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m123getSecondimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m124hashCodeimpl(long j8) {
        return a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m125toStringimpl(long j8) {
        return '(' + m122getFirstimpl(j8) + ", " + m123getSecondimpl(j8) + ')';
    }

    public boolean equals(Object obj) {
        return m120equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m124hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m125toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m126unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m118constructorimpl(int i8, int i9) {
        return m119constructorimpl((i9 & 4294967295L) | (i8 << 32));
    }
}
