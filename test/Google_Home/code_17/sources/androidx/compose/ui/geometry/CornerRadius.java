package androidx.compose.ui.geometry;

import androidx.collection.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.r;

@Immutable
/* loaded from: classes.dex */
public final class CornerRadius {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = CornerRadiusKt.CornerRadius$default(0.0f, 0.0f, 2, null);
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m2724getZerokKHJgLs$annotations() {
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m2725getZerokKHJgLs() {
            return CornerRadius.Zero;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ CornerRadius(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CornerRadius m2706boximpl(long j8) {
        return new CornerRadius(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2707component1impl(long j8) {
        return m2715getXimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2708component2impl(long j8) {
        return m2716getYimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2709constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m2710copyOHQCggk(long j8, float f8, float f9) {
        return CornerRadiusKt.CornerRadius(f8, f9);
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m2711copyOHQCggk$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m2715getXimpl(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m2716getYimpl(j8);
        }
        return m2710copyOHQCggk(j8, f8, f9);
    }

    @Stable
    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m2712divBz7bX_o(long j8, float f8) {
        return CornerRadiusKt.CornerRadius(m2715getXimpl(j8) / f8, m2716getYimpl(j8) / f8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2713equalsimpl(long j8, Object obj) {
        return (obj instanceof CornerRadius) && j8 == ((CornerRadius) obj).m2723unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2714equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m2715getXimpl(long j8) {
        r rVar = r.f34191a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m2716getYimpl(long j8) {
        r rVar = r.f34191a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2717hashCodeimpl(long j8) {
        return a.a(j8);
    }

    @Stable
    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m2718minusvF7bmM(long j8, long j9) {
        return CornerRadiusKt.CornerRadius(m2715getXimpl(j8) - m2715getXimpl(j9), m2716getYimpl(j8) - m2716getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m2719plusvF7bmM(long j8, long j9) {
        return CornerRadiusKt.CornerRadius(m2715getXimpl(j8) + m2715getXimpl(j9), m2716getYimpl(j8) + m2716getYimpl(j9));
    }

    @Stable
    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m2720timesBz7bX_o(long j8, float f8) {
        return CornerRadiusKt.CornerRadius(m2715getXimpl(j8) * f8, m2716getYimpl(j8) * f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2721toStringimpl(long j8) {
        if (m2715getXimpl(j8) == m2716getYimpl(j8)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(m2715getXimpl(j8), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(m2715getXimpl(j8), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m2716getYimpl(j8), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m2722unaryMinuskKHJgLs(long j8) {
        return CornerRadiusKt.CornerRadius(-m2715getXimpl(j8), -m2716getYimpl(j8));
    }

    public boolean equals(Object obj) {
        return m2713equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2717hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2721toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2723unboximpl() {
        return this.packedValue;
    }
}
