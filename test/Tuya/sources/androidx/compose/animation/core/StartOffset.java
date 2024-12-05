package androidx.compose.animation.core;

import L5.p;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m229boximpl(long j8) {
        return new StartOffset(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m231constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m232constructorimpl$default(int i8, int i9, int i10, AbstractC3151p abstractC3151p) {
        if ((i10 & 2) != 0) {
            i9 = StartOffsetType.Companion.m247getDelayEo1U57Q();
        }
        return m230constructorimpl(i8, i9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m233equalsimpl(long j8, Object obj) {
        return (obj instanceof StartOffset) && j8 == ((StartOffset) obj).m239unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m234equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m235getOffsetMillisimpl(long j8) {
        return Math.abs((int) j8);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m236getOffsetTypeEo1U57Q(long j8) {
        boolean z8;
        if (j8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return StartOffsetType.Companion.m248getFastForwardEo1U57Q();
        }
        if (!z8) {
            return StartOffsetType.Companion.m247getDelayEo1U57Q();
        }
        throw new p();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m237hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m238toStringimpl(long j8) {
        return "StartOffset(value=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m233equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m237hashCodeimpl(this.value);
    }

    public String toString() {
        return m238toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m239unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m230constructorimpl(int i8, int i9) {
        return m231constructorimpl(i8 * i9);
    }
}
