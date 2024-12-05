package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.r;

@Immutable
/* loaded from: classes.dex */
public final class ScaleFactor {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = ScaleFactorKt.ScaleFactor(Float.NaN, Float.NaN);
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4199getUnspecified_hLwfpc$annotations() {
        }

        /* renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m4200getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ ScaleFactor(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m4184boximpl(long j8) {
        return new ScaleFactor(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m4185component1impl(long j8) {
        return m4193getScaleXimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4186component2impl(long j8) {
        return m4194getScaleYimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4187constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m4188copy8GGzs04(long j8, float f8, float f9) {
        return ScaleFactorKt.ScaleFactor(f8, f9);
    }

    /* renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m4189copy8GGzs04$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m4193getScaleXimpl(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m4194getScaleYimpl(j8);
        }
        return m4188copy8GGzs04(j8, f8, f9);
    }

    @Stable
    /* renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m4190div44nBxM0(long j8, float f8) {
        return ScaleFactorKt.ScaleFactor(m4193getScaleXimpl(j8) / f8, m4194getScaleYimpl(j8) / f8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4191equalsimpl(long j8, Object obj) {
        return (obj instanceof ScaleFactor) && j8 == ((ScaleFactor) obj).m4198unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4192equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getScaleX$annotations() {
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m4193getScaleXimpl(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f34191a;
            return Float.intBitsToFloat((int) (j8 >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    @Stable
    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m4194getScaleYimpl(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f34191a;
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4195hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    @Stable
    /* renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m4196times44nBxM0(long j8, float f8) {
        return ScaleFactorKt.ScaleFactor(m4193getScaleXimpl(j8) * f8, m4194getScaleYimpl(j8) * f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4197toStringimpl(long j8) {
        float roundToTenths;
        float roundToTenths2;
        StringBuilder sb = new StringBuilder();
        sb.append("ScaleFactor(");
        roundToTenths = ScaleFactorKt.roundToTenths(m4193getScaleXimpl(j8));
        sb.append(roundToTenths);
        sb.append(", ");
        roundToTenths2 = ScaleFactorKt.roundToTenths(m4194getScaleYimpl(j8));
        sb.append(roundToTenths2);
        sb.append(')');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return m4191equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4195hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4197toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4198unboximpl() {
        return this.packedValue;
    }
}
