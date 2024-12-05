package androidx.compose.ui.input;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class InputMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Touch = m3580constructorimpl(1);
    private static final int Keyboard = m3580constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getKeyboard-aOaMEAU, reason: not valid java name */
        public final int m3586getKeyboardaOaMEAU() {
            return InputMode.Keyboard;
        }

        /* renamed from: getTouch-aOaMEAU, reason: not valid java name */
        public final int m3587getTouchaOaMEAU() {
            return InputMode.Touch;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ InputMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputMode m3579boximpl(int i8) {
        return new InputMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3580constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3581equalsimpl(int i8, Object obj) {
        return (obj instanceof InputMode) && i8 == ((InputMode) obj).m3585unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3582equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3583hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3584toStringimpl(int i8) {
        if (m3582equalsimpl0(i8, Touch)) {
            return "Touch";
        }
        if (m3582equalsimpl0(i8, Keyboard)) {
            return "Keyboard";
        }
        return "Error";
    }

    public boolean equals(Object obj) {
        return m3581equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3583hashCodeimpl(this.value);
    }

    public String toString() {
        return m3584toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3585unboximpl() {
        return this.value;
    }
}
