package androidx.compose.animation.core;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m216boximpl(long j8) {
        return new Motion(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m217constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-XB9eQnU, reason: not valid java name */
    public static final long m218copyXB9eQnU(long j8, float f8, float f9) {
        return SpringSimulationKt.Motion(f8, f9);
    }

    /* renamed from: copy-XB9eQnU$default, reason: not valid java name */
    public static /* synthetic */ long m219copyXB9eQnU$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m222getValueimpl(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m223getVelocityimpl(j8);
        }
        return m218copyXB9eQnU(j8, f8, f9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m220equalsimpl(long j8, Object obj) {
        return (obj instanceof Motion) && j8 == ((Motion) obj).m226unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m221equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m222getValueimpl(long j8) {
        r rVar = r.f33790a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m223getVelocityimpl(long j8) {
        r rVar = r.f33790a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m224hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m225toStringimpl(long j8) {
        return "Motion(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m220equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m224hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m225toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m226unboximpl() {
        return this.packedValue;
    }
}
