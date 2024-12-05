package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class StrokeCap {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Butt = m3300constructorimpl(0);
    private static final int Round = m3300constructorimpl(1);
    private static final int Square = m3300constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m3306getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m3307getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m3308getSquareKaPHkGw() {
            return StrokeCap.Square;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ StrokeCap(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeCap m3299boximpl(int i8) {
        return new StrokeCap(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3300constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3301equalsimpl(int i8, Object obj) {
        return (obj instanceof StrokeCap) && i8 == ((StrokeCap) obj).m3305unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3302equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3303hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3304toStringimpl(int i8) {
        if (m3302equalsimpl0(i8, Butt)) {
            return "Butt";
        }
        if (m3302equalsimpl0(i8, Round)) {
            return "Round";
        }
        if (m3302equalsimpl0(i8, Square)) {
            return "Square";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3301equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3303hashCodeimpl(this.value);
    }

    public String toString() {
        return m3304toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3305unboximpl() {
        return this.value;
    }
}
