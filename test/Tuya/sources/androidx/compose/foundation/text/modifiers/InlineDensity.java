package androidx.compose.foundation.text.modifiers;

import androidx.collection.a;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class InlineDensity {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m964constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m974getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ InlineDensity(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m963boximpl(long j8) {
        return new InlineDensity(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m965constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m967equalsimpl(long j8, Object obj) {
        return (obj instanceof InlineDensity) && j8 == ((InlineDensity) obj).m973unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m968equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m969getDensityimpl(long j8) {
        r rVar = r.f33790a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m970getFontScaleimpl(long j8) {
        r rVar = r.f33790a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m971hashCodeimpl(long j8) {
        return a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m972toStringimpl(long j8) {
        return "InlineDensity(density=" + m969getDensityimpl(j8) + ", fontScale=" + m970getFontScaleimpl(j8) + ')';
    }

    public boolean equals(Object obj) {
        return m967equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m971hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m972toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m973unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m966constructorimpl(Density density) {
        AbstractC3159y.i(density, "density");
        return m964constructorimpl(density.getDensity(), density.getFontScale());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m964constructorimpl(float f8, float f9) {
        return m965constructorimpl((Float.floatToIntBits(f9) & 4294967295L) | (Float.floatToIntBits(f8) << 32));
    }
}
