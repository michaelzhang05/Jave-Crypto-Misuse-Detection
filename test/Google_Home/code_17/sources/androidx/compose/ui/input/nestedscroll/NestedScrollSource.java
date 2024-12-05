package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class NestedScrollSource {
    public static final Companion Companion = new Companion(null);
    private static final int Drag = m3921constructorimpl(1);
    private static final int Fling = m3921constructorimpl(2);
    private static final int Relocate = m3921constructorimpl(3);
    private static final int Wheel = m3921constructorimpl(4);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m3927getRelocateWNlRxjI$annotations() {
        }

        /* renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m3928getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m3929getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m3930getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        /* renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m3931getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ NestedScrollSource(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m3920boximpl(int i8) {
        return new NestedScrollSource(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3921constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3922equalsimpl(int i8, Object obj) {
        return (obj instanceof NestedScrollSource) && i8 == ((NestedScrollSource) obj).m3926unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3923equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3924hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3925toStringimpl(int i8) {
        if (m3923equalsimpl0(i8, Drag)) {
            return "Drag";
        }
        if (m3923equalsimpl0(i8, Fling)) {
            return "Fling";
        }
        if (m3923equalsimpl0(i8, Relocate)) {
            return "Relocate";
        }
        if (m3923equalsimpl0(i8, Wheel)) {
            return "Wheel";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m3922equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3924hashCodeimpl(this.value);
    }

    public String toString() {
        return m3925toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3926unboximpl() {
        return this.value;
    }
}
