package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class Dp implements Comparable<Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m5183constructorimpl(0.0f);
    private static final float Infinity = m5183constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m5183constructorimpl(Float.NaN);
    private final float value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m5198getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m5199getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m5200getUnspecifiedD9Ej5fM$annotations() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m5201getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m5202getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m5203getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ Dp(float f8) {
        this.value = f8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m5181boximpl(float f8) {
        return new Dp(f8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m5183constructorimpl(float f8) {
        return f8;
    }

    @Stable
    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m5184div0680j_4(float f8, float f9) {
        return f8 / f9;
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m5185divu2uoSUM(float f8, float f9) {
        return m5183constructorimpl(f8 / f9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5187equalsimpl(float f8, Object obj) {
        return (obj instanceof Dp) && Float.compare(f8, ((Dp) obj).m5197unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5188equalsimpl0(float f8, float f9) {
        return Float.compare(f8, f9) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5189hashCodeimpl(float f8) {
        return Float.floatToIntBits(f8);
    }

    @Stable
    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m5190minus5rwHm24(float f8, float f9) {
        return m5183constructorimpl(f8 - f9);
    }

    @Stable
    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m5191plus5rwHm24(float f8, float f9) {
        return m5183constructorimpl(f8 + f9);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m5192timesu2uoSUM(float f8, float f9) {
        return m5183constructorimpl(f8 * f9);
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5194toStringimpl(float f8) {
        if (Float.isNaN(f8)) {
            return "Dp.Unspecified";
        }
        return f8 + ".dp";
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m5195unaryMinusD9Ej5fM(float f8) {
        return m5183constructorimpl(-f8);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m5196compareTo0680j_4(dp.m5197unboximpl());
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m5196compareTo0680j_4(float f8) {
        return m5182compareTo0680j_4(this.value, f8);
    }

    public boolean equals(Object obj) {
        return m5187equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m5189hashCodeimpl(this.value);
    }

    @Stable
    public String toString() {
        return m5194toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m5197unboximpl() {
        return this.value;
    }

    @Stable
    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m5182compareTo0680j_4(float f8, float f9) {
        return Float.compare(f8, f9);
    }

    @Stable
    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m5186divu2uoSUM(float f8, int i8) {
        return m5183constructorimpl(f8 / i8);
    }

    @Stable
    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m5193timesu2uoSUM(float f8, int i8) {
        return m5183constructorimpl(f8 * i8);
    }
}
