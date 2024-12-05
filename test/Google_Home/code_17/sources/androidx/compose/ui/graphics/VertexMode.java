package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class VertexMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Triangles = m3346constructorimpl(0);
    private static final int TriangleStrip = m3346constructorimpl(1);
    private static final int TriangleFan = m3346constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getTriangleFan-c2xauaI, reason: not valid java name */
        public final int m3352getTriangleFanc2xauaI() {
            return VertexMode.TriangleFan;
        }

        /* renamed from: getTriangleStrip-c2xauaI, reason: not valid java name */
        public final int m3353getTriangleStripc2xauaI() {
            return VertexMode.TriangleStrip;
        }

        /* renamed from: getTriangles-c2xauaI, reason: not valid java name */
        public final int m3354getTrianglesc2xauaI() {
            return VertexMode.Triangles;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ VertexMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VertexMode m3345boximpl(int i8) {
        return new VertexMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3346constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3347equalsimpl(int i8, Object obj) {
        return (obj instanceof VertexMode) && i8 == ((VertexMode) obj).m3351unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3348equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3349hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3350toStringimpl(int i8) {
        if (m3348equalsimpl0(i8, Triangles)) {
            return "Triangles";
        }
        if (m3348equalsimpl0(i8, TriangleStrip)) {
            return "TriangleStrip";
        }
        if (m3348equalsimpl0(i8, TriangleFan)) {
            return "TriangleFan";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3347equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3349hashCodeimpl(this.value);
    }

    public String toString() {
        return m3350toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3351unboximpl() {
        return this.value;
    }
}
