package androidx.compose.ui.text.android;

/* loaded from: classes.dex */
public final class VerticalPaddings {
    private final long packedValue;

    private /* synthetic */ VerticalPaddings(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m4739boximpl(long j8) {
        return new VerticalPaddings(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4740constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4741equalsimpl(long j8, Object obj) {
        return (obj instanceof VerticalPaddings) && j8 == ((VerticalPaddings) obj).m4747unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4742equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m4743getBottomPaddingimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m4744getTopPaddingimpl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4745hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4746toStringimpl(long j8) {
        return "VerticalPaddings(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m4741equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4745hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4746toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4747unboximpl() {
        return this.packedValue;
    }
}
