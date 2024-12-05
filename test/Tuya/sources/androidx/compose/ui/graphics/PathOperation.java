package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m3234constructorimpl(0);
    private static final int Intersect = m3234constructorimpl(1);
    private static final int Union = m3234constructorimpl(2);
    private static final int Xor = m3234constructorimpl(3);
    private static final int ReverseDifference = m3234constructorimpl(4);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m3240getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m3241getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m3242getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m3243getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m3244getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ PathOperation(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m3233boximpl(int i8) {
        return new PathOperation(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3234constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3235equalsimpl(int i8, Object obj) {
        return (obj instanceof PathOperation) && i8 == ((PathOperation) obj).m3239unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3236equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3237hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3238toStringimpl(int i8) {
        if (m3236equalsimpl0(i8, Difference)) {
            return "Difference";
        }
        if (m3236equalsimpl0(i8, Intersect)) {
            return "Intersect";
        }
        if (m3236equalsimpl0(i8, Union)) {
            return "Union";
        }
        if (m3236equalsimpl0(i8, Xor)) {
            return "Xor";
        }
        if (m3236equalsimpl0(i8, ReverseDifference)) {
            return "ReverseDifference";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3235equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3237hashCodeimpl(this.value);
    }

    public String toString() {
        return m3238toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3239unboximpl() {
        return this.value;
    }
}
