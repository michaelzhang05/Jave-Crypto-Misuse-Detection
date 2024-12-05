package androidx.compose.ui.input;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class InputMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Touch = m3575constructorimpl(1);
    private static final int Keyboard = m3575constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getKeyboard-aOaMEAU, reason: not valid java name */
        public final int m3581getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU, reason: not valid java name */
        public final int m3582getTouchaOaMEAU() {
            return InputMode.Touch;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ InputMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputMode m3574boximpl(int i8) {
        return new InputMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3575constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3576equalsimpl(int i8, Object obj) {
        return (obj instanceof InputMode) && i8 == ((InputMode) obj).m3580unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3577equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3578hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3579toStringimpl(int i8) {
        if (m3577equalsimpl0(i8, Touch)) {
            return "Touch";
        }
        if (m3577equalsimpl0(i8, Keyboard)) {
            return "Keyboard";
        }
        return "Error";
    }

    public boolean equals(Object obj) {
        return m3576equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3578hashCodeimpl(this.value);
    }

    public String toString() {
        return m3579toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3580unboximpl() {
        return this.value;
    }
}
