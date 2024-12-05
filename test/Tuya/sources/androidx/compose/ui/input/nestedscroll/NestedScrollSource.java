package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class NestedScrollSource {
    public static final Companion Companion = new Companion(null);
    private static final int Drag = m3916constructorimpl(1);
    private static final int Fling = m3916constructorimpl(2);
    private static final int Relocate = m3916constructorimpl(3);
    private static final int Wheel = m3916constructorimpl(4);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m3922getRelocateWNlRxjI$annotations() {
        }

        /* renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m3923getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m3924getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m3925getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        /* renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m3926getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ NestedScrollSource(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m3915boximpl(int i8) {
        return new NestedScrollSource(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3916constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3917equalsimpl(int i8, Object obj) {
        return (obj instanceof NestedScrollSource) && i8 == ((NestedScrollSource) obj).m3921unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3918equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3919hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3920toStringimpl(int i8) {
        if (m3918equalsimpl0(i8, Drag)) {
            return "Drag";
        }
        if (m3918equalsimpl0(i8, Fling)) {
            return "Fling";
        }
        if (m3918equalsimpl0(i8, Relocate)) {
            return "Relocate";
        }
        if (m3918equalsimpl0(i8, Wheel)) {
            return "Wheel";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m3917equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3919hashCodeimpl(this.value);
    }

    public String toString() {
        return m3920toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3921unboximpl() {
        return this.value;
    }
}
