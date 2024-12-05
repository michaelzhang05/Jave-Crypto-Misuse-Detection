package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m3963constructorimpl(0);
    private static final int Press = m3963constructorimpl(1);
    private static final int Release = m3963constructorimpl(2);
    private static final int Move = m3963constructorimpl(3);
    private static final int Enter = m3963constructorimpl(4);
    private static final int Exit = m3963constructorimpl(5);
    private static final int Scroll = m3963constructorimpl(6);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m3969getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m3970getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m3971getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m3972getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m3973getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m3974getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m3975getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ PointerEventType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m3962boximpl(int i8) {
        return new PointerEventType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3963constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3964equalsimpl(int i8, Object obj) {
        return (obj instanceof PointerEventType) && i8 == ((PointerEventType) obj).m3968unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3965equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3966hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3967toStringimpl(int i8) {
        if (m3965equalsimpl0(i8, Press)) {
            return "Press";
        }
        if (m3965equalsimpl0(i8, Release)) {
            return "Release";
        }
        if (m3965equalsimpl0(i8, Move)) {
            return "Move";
        }
        if (m3965equalsimpl0(i8, Enter)) {
            return "Enter";
        }
        if (m3965equalsimpl0(i8, Exit)) {
            return "Exit";
        }
        if (m3965equalsimpl0(i8, Scroll)) {
            return "Scroll";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3964equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3966hashCodeimpl(this.value);
    }

    public String toString() {
        return m3967toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3968unboximpl() {
        return this.value;
    }
}
