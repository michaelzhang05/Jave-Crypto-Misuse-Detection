package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class PointMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Points = m3252constructorimpl(0);
    private static final int Lines = m3252constructorimpl(1);
    private static final int Polygon = m3252constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m3258getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m3259getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m3260getPolygonr_lszbg() {
            return PointMode.Polygon;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ PointMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m3251boximpl(int i8) {
        return new PointMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3252constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3253equalsimpl(int i8, Object obj) {
        return (obj instanceof PointMode) && i8 == ((PointMode) obj).m3257unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3254equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3255hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3256toStringimpl(int i8) {
        if (m3254equalsimpl0(i8, Points)) {
            return "Points";
        }
        if (m3254equalsimpl0(i8, Lines)) {
            return "Lines";
        }
        if (m3254equalsimpl0(i8, Polygon)) {
            return "Polygon";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3253equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3255hashCodeimpl(this.value);
    }

    public String toString() {
        return m3256toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3257unboximpl() {
        return this.value;
    }
}
