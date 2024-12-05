package androidx.collection;

/* loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m108boximpl(long j8) {
        return new FloatFloatPair(j8);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m109component1impl(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m110component2impl(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m112constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m113equalsimpl(long j8, Object obj) {
        return (obj instanceof FloatFloatPair) && j8 == ((FloatFloatPair) obj).m119unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m114equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m115getFirstimpl(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m116getSecondimpl(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m117hashCodeimpl(long j8) {
        return a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m118toStringimpl(long j8) {
        return '(' + Float.intBitsToFloat((int) (j8 >> 32)) + ", " + Float.intBitsToFloat((int) (j8 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m113equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m117hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m118toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m119unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m111constructorimpl(float f8, float f9) {
        return m112constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }
}
