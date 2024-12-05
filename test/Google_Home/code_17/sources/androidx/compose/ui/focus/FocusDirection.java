package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class FocusDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Next = m2655constructorimpl(1);
    private static final int Previous = m2655constructorimpl(2);
    private static final int Left = m2655constructorimpl(3);
    private static final int Right = m2655constructorimpl(4);
    private static final int Up = m2655constructorimpl(5);
    private static final int Down = m2655constructorimpl(6);
    private static final int Enter = m2655constructorimpl(7);
    private static final int Exit = m2655constructorimpl(8);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m2661getEnterdhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m2662getExitdhqQ8s$annotations() {
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m2663getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m2664getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m2665getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m2666getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m2667getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m2668getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m2669getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m2670getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ FocusDirection(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m2654boximpl(int i8) {
        return new FocusDirection(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2655constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2656equalsimpl(int i8, Object obj) {
        return (obj instanceof FocusDirection) && i8 == ((FocusDirection) obj).m2660unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2657equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2658hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2659toStringimpl(int i8) {
        if (m2657equalsimpl0(i8, Next)) {
            return "Next";
        }
        if (m2657equalsimpl0(i8, Previous)) {
            return "Previous";
        }
        if (m2657equalsimpl0(i8, Left)) {
            return "Left";
        }
        if (m2657equalsimpl0(i8, Right)) {
            return "Right";
        }
        if (m2657equalsimpl0(i8, Up)) {
            return "Up";
        }
        if (m2657equalsimpl0(i8, Down)) {
            return "Down";
        }
        if (m2657equalsimpl0(i8, Enter)) {
            return "Enter";
        }
        if (m2657equalsimpl0(i8, Exit)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m2656equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2658hashCodeimpl(this.value);
    }

    public String toString() {
        return m2659toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2660unboximpl() {
        return this.value;
    }
}
