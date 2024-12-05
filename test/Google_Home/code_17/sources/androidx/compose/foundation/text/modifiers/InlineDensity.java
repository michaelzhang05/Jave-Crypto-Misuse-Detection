package androidx.compose.foundation.text.modifiers;

import androidx.collection.a;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class InlineDensity {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m969constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m979getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ InlineDensity(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m968boximpl(long j8) {
        return new InlineDensity(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m970constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m972equalsimpl(long j8, Object obj) {
        return (obj instanceof InlineDensity) && j8 == ((InlineDensity) obj).m978unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m973equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m974getDensityimpl(long j8) {
        r rVar = r.f34191a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m975getFontScaleimpl(long j8) {
        r rVar = r.f34191a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m976hashCodeimpl(long j8) {
        return a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m977toStringimpl(long j8) {
        return "InlineDensity(density=" + m974getDensityimpl(j8) + ", fontScale=" + m975getFontScaleimpl(j8) + ')';
    }

    public boolean equals(Object obj) {
        return m972equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m976hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m977toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m978unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m971constructorimpl(Density density) {
        AbstractC3255y.i(density, "density");
        return m969constructorimpl(density.getDensity(), density.getFontScale());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m969constructorimpl(float f8, float f9) {
        return m970constructorimpl((Float.floatToIntBits(f9) & 4294967295L) | (Float.floatToIntBits(f8) << 32));
    }
}
