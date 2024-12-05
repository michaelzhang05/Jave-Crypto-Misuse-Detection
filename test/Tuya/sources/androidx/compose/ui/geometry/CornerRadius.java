package androidx.compose.ui.geometry;

import androidx.collection.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;
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
        public static /* synthetic */ void m2719getZerokKHJgLs$annotations() {
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m2720getZerokKHJgLs() {
            return CornerRadius.Zero;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ CornerRadius(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CornerRadius m2701boximpl(long j8) {
        return new CornerRadius(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2702component1impl(long j8) {
        return m2710getXimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2703component2impl(long j8) {
        return m2711getYimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2704constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m2705copyOHQCggk(long j8, float f8, float f9) {
        return CornerRadiusKt.CornerRadius(f8, f9);
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m2706copyOHQCggk$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m2710getXimpl(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m2711getYimpl(j8);
        }
        return m2705copyOHQCggk(j8, f8, f9);
    }

    @Stable
    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m2707divBz7bX_o(long j8, float f8) {
        return CornerRadiusKt.CornerRadius(m2710getXimpl(j8) / f8, m2711getYimpl(j8) / f8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2708equalsimpl(long j8, Object obj) {
        return (obj instanceof CornerRadius) && j8 == ((CornerRadius) obj).m2718unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2709equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m2710getXimpl(long j8) {
        r rVar = r.f33790a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m2711getYimpl(long j8) {
        r rVar = r.f33790a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2712hashCodeimpl(long j8) {
        return a.a(j8);
    }

    @Stable
    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m2713minusvF7bmM(long j8, long j9) {
        return CornerRadiusKt.CornerRadius(m2710getXimpl(j8) - m2710getXimpl(j9), m2711getYimpl(j8) - m2711getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m2714plusvF7bmM(long j8, long j9) {
        return CornerRadiusKt.CornerRadius(m2710getXimpl(j8) + m2710getXimpl(j9), m2711getYimpl(j8) + m2711getYimpl(j9));
    }

    @Stable
    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m2715timesBz7bX_o(long j8, float f8) {
        return CornerRadiusKt.CornerRadius(m2710getXimpl(j8) * f8, m2711getYimpl(j8) * f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2716toStringimpl(long j8) {
        if (m2710getXimpl(j8) == m2711getYimpl(j8)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(m2710getXimpl(j8), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(m2710getXimpl(j8), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m2711getYimpl(j8), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m2717unaryMinuskKHJgLs(long j8) {
        return CornerRadiusKt.CornerRadius(-m2710getXimpl(j8), -m2711getYimpl(j8));
    }

    public boolean equals(Object obj) {
        return m2708equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2712hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2716toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2718unboximpl() {
        return this.packedValue;
    }
}
