package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m3968constructorimpl(0);
    private static final int Press = m3968constructorimpl(1);
    private static final int Release = m3968constructorimpl(2);
    private static final int Move = m3968constructorimpl(3);
    private static final int Enter = m3968constructorimpl(4);
    private static final int Exit = m3968constructorimpl(5);
    private static final int Scroll = m3968constructorimpl(6);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m3974getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m3975getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m3976getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m3977getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m3978getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m3979getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m3980getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ PointerEventType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m3967boximpl(int i8) {
        return new PointerEventType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3968constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3969equalsimpl(int i8, Object obj) {
        return (obj instanceof PointerEventType) && i8 == ((PointerEventType) obj).m3973unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3970equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3971hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3972toStringimpl(int i8) {
        if (m3970equalsimpl0(i8, Press)) {
            return "Press";
        }
        if (m3970equalsimpl0(i8, Release)) {
            return "Release";
        }
        if (m3970equalsimpl0(i8, Move)) {
            return "Move";
        }
        if (m3970equalsimpl0(i8, Enter)) {
            return "Enter";
        }
        if (m3970equalsimpl0(i8, Exit)) {
            return "Exit";
        }
        if (m3970equalsimpl0(i8, Scroll)) {
            return "Scroll";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3969equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3971hashCodeimpl(this.value);
    }

    public String toString() {
        return m3972toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3973unboximpl() {
        return this.value;
    }
}
