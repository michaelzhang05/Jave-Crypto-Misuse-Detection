package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class StartOffsetType {
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m241constructorimpl(-1);
    private static final int FastForward = m241constructorimpl(1);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m247getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m248getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ StartOffsetType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m240boximpl(int i8) {
        return new StartOffsetType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m241constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m242equalsimpl(int i8, Object obj) {
        return (obj instanceof StartOffsetType) && i8 == ((StartOffsetType) obj).m246unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m243equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m244hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m245toStringimpl(int i8) {
        return "StartOffsetType(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m242equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m244hashCodeimpl(this.value);
    }

    public String toString() {
        return m245toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m246unboximpl() {
        return this.value;
    }
}
