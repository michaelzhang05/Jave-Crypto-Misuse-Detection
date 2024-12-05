package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class ClipOp {
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m2958constructorimpl(0);
    private static final int Intersect = m2958constructorimpl(1);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m2964getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m2965getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ ClipOp(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipOp m2957boximpl(int i8) {
        return new ClipOp(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2958constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2959equalsimpl(int i8, Object obj) {
        return (obj instanceof ClipOp) && i8 == ((ClipOp) obj).m2963unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2960equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2961hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2962toStringimpl(int i8) {
        if (m2960equalsimpl0(i8, Difference)) {
            return "Difference";
        }
        if (m2960equalsimpl0(i8, Intersect)) {
            return "Intersect";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m2959equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2961hashCodeimpl(this.value);
    }

    public String toString() {
        return m2962toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2963unboximpl() {
        return this.value;
    }
}
