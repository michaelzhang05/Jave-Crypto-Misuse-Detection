package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class PointerType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m4075constructorimpl(0);
    private static final int Touch = m4075constructorimpl(1);
    private static final int Mouse = m4075constructorimpl(2);
    private static final int Stylus = m4075constructorimpl(3);
    private static final int Eraser = m4075constructorimpl(4);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m4081getEraserT8wyACA() {
            return PointerType.Eraser;
        }

        /* renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m4082getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m4083getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m4084getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m4085getUnknownT8wyACA() {
            return PointerType.Unknown;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ PointerType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerType m4074boximpl(int i8) {
        return new PointerType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4075constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4076equalsimpl(int i8, Object obj) {
        return (obj instanceof PointerType) && i8 == ((PointerType) obj).m4080unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4077equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4078hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4079toStringimpl(int i8) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return "Unknown";
                    }
                    return "Eraser";
                }
                return "Stylus";
            }
            return "Mouse";
        }
        return "Touch";
    }

    public boolean equals(Object obj) {
        return m4076equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4078hashCodeimpl(this.value);
    }

    public String toString() {
        return m4079toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4080unboximpl() {
        return this.value;
    }
}
