package androidx.compose.animation.core;

import O5.p;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m234boximpl(long j8) {
        return new StartOffset(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m236constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m237constructorimpl$default(int i8, int i9, int i10, AbstractC3247p abstractC3247p) {
        if ((i10 & 2) != 0) {
            i9 = StartOffsetType.Companion.m252getDelayEo1U57Q();
        }
        return m235constructorimpl(i8, i9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m238equalsimpl(long j8, Object obj) {
        return (obj instanceof StartOffset) && j8 == ((StartOffset) obj).m244unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m239equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m240getOffsetMillisimpl(long j8) {
        return Math.abs((int) j8);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m241getOffsetTypeEo1U57Q(long j8) {
        boolean z8;
        if (j8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return StartOffsetType.Companion.m253getFastForwardEo1U57Q();
        }
        if (!z8) {
            return StartOffsetType.Companion.m252getDelayEo1U57Q();
        }
        throw new p();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m242hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m243toStringimpl(long j8) {
        return "StartOffset(value=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m238equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m242hashCodeimpl(this.value);
    }

    public String toString() {
        return m243toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m244unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m235constructorimpl(int i8, int i9) {
        return m236constructorimpl(i8 * i9);
    }
}
