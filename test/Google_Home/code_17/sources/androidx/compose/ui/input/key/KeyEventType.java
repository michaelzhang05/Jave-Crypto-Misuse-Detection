package androidx.compose.ui.input.key;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class KeyEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m3895constructorimpl(0);
    private static final int KeyUp = m3895constructorimpl(1);
    private static final int KeyDown = m3895constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m3901getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m3902getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m3903getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ KeyEventType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEventType m3894boximpl(int i8) {
        return new KeyEventType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3895constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3896equalsimpl(int i8, Object obj) {
        return (obj instanceof KeyEventType) && i8 == ((KeyEventType) obj).m3900unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3897equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3898hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3899toStringimpl(int i8) {
        if (m3897equalsimpl0(i8, KeyUp)) {
            return "KeyUp";
        }
        if (m3897equalsimpl0(i8, KeyDown)) {
            return "KeyDown";
        }
        if (m3897equalsimpl0(i8, Unknown)) {
            return "Unknown";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m3896equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3898hashCodeimpl(this.value);
    }

    public String toString() {
        return m3899toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3900unboximpl() {
        return this.value;
    }
}