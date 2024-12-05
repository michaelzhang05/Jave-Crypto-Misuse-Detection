package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class Dp implements Comparable<Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m5178constructorimpl(0.0f);
    private static final float Infinity = m5178constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m5178constructorimpl(Float.NaN);
    private final float value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m5193getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m5194getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m5195getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m5196getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m5197getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m5198getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ Dp(float f8) {
        this.value = f8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m5176boximpl(float f8) {
        return new Dp(f8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m5178constructorimpl(float f8) {
        return f8;
    }

    @Stable
    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m5179div0680j_4(float f8, float f9) {
        return f8 / f9;
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m5180divu2uoSUM(float f8, float f9) {
        return m5178constructorimpl(f8 / f9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5182equalsimpl(float f8, Object obj) {
        return (obj instanceof Dp) && Float.compare(f8, ((Dp) obj).m5192unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5183equalsimpl0(float f8, float f9) {
        return Float.compare(f8, f9) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5184hashCodeimpl(float f8) {
        return Float.floatToIntBits(f8);
    }

    @Stable
    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m5185minus5rwHm24(float f8, float f9) {
        return m5178constructorimpl(f8 - f9);
    }

    @Stable
    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m5186plus5rwHm24(float f8, float f9) {
        return m5178constructorimpl(f8 + f9);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m5187timesu2uoSUM(float f8, float f9) {
        return m5178constructorimpl(f8 * f9);
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5189toStringimpl(float f8) {
        if (Float.isNaN(f8)) {
            return "Dp.Unspecified";
        }
        return f8 + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m5190unaryMinusD9Ej5fM(float f8) {
        return m5178constructorimpl(-f8);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m5191compareTo0680j_4(dp.m5192unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m5191compareTo0680j_4(float f8) {
        return m5177compareTo0680j_4(this.value, f8);
    }

    public boolean equals(Object obj) {
        return m5182equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m5184hashCodeimpl(this.value);
    }

    @Stable
    public String toString() {
        return m5189toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m5192unboximpl() {
        return this.value;
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m5177compareTo0680j_4(float f8, float f9) {
        return Float.compare(f8, f9);
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m5181divu2uoSUM(float f8, int i8) {
        return m5178constructorimpl(f8 / i8);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m5188timesu2uoSUM(float f8, int i8) {
        return m5178constructorimpl(f8 * i8);
    }
}
