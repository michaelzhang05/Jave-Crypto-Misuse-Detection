package androidx.compose.ui.input.pointer;

/* loaded from: classes.dex */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m3995boximpl(long j8) {
        return new PointerId(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3996constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3997equalsimpl(long j8, Object obj) {
        return (obj instanceof PointerId) && j8 == ((PointerId) obj).m4001unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3998equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3999hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4000toStringimpl(long j8) {
        return "PointerId(value=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m3997equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3999hashCodeimpl(this.value);
    }

    public String toString() {
        return m4000toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4001unboximpl() {
        return this.value;
    }
}
