package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class StartOffsetType {
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m246constructorimpl(-1);
    private static final int FastForward = m246constructorimpl(1);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m252getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m253getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ StartOffsetType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m245boximpl(int i8) {
        return new StartOffsetType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m246constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m247equalsimpl(int i8, Object obj) {
        return (obj instanceof StartOffsetType) && i8 == ((StartOffsetType) obj).m251unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m248equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m249hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m250toStringimpl(int i8) {
        return "StartOffsetType(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m247equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m249hashCodeimpl(this.value);
    }

    public String toString() {
        return m250toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m251unboximpl() {
        return this.value;
    }
}
