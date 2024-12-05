package androidx.compose.ui.graphics;

import j6.AbstractC3202a;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m3084constructorimpl((short) 5120);
    private static final short LowestValue = m3084constructorimpl((short) -1025);
    private static final short MaxValue = m3084constructorimpl((short) 31743);
    private static final short MinNormal = m3084constructorimpl((short) 1024);
    private static final short MinValue = m3084constructorimpl((short) 1);
    private static final short NaN = m3084constructorimpl((short) 32256);
    private static final short NegativeInfinity = m3084constructorimpl((short) -1024);
    private static final short NegativeZero = m3084constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m3084constructorimpl((short) 31744);
    private static final short PositiveZero = m3084constructorimpl((short) 0);
    private static final short One = m3083constructorimpl(1.0f);
    private static final short NegativeOne = m3083constructorimpl(-1.0f);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f8) {
            int i8;
            int floatToRawIntBits = Float.floatToRawIntBits(f8);
            int i9 = floatToRawIntBits >>> 31;
            int i10 = (floatToRawIntBits >>> 23) & 255;
            int i11 = Float16.FP32_SIGNIFICAND_MASK & floatToRawIntBits;
            int i12 = 31;
            int i13 = 0;
            if (i10 == 255) {
                if (i11 != 0) {
                    i13 = 512;
                }
            } else {
                int i14 = i10 - 112;
                if (i14 >= 31) {
                    i12 = 49;
                } else if (i14 <= 0) {
                    if (i14 >= -10) {
                        int i15 = (8388608 | i11) >> (1 - i14);
                        if ((i15 & 4096) != 0) {
                            i15 += 8192;
                        }
                        i13 = i15 >> 13;
                    }
                    i12 = 0;
                } else {
                    i13 = i11 >> 13;
                    if ((floatToRawIntBits & 4096) != 0) {
                        i8 = (((i14 << 10) | i13) + 1) | (i9 << 15);
                        return (short) i8;
                    }
                    i12 = i14;
                }
            }
            i8 = (i9 << 15) | (i12 << 10) | i13;
            return (short) i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short s8) {
            return (s8 & 32768) != 0 ? 32768 - (s8 & 65535) : s8 & 65535;
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m3111getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m3112getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m3113getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m3114getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m3115getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m3116getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m3117getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m3118getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m3119getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m3120getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        kotlin.jvm.internal.r rVar = kotlin.jvm.internal.r.f34191a;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    }

    private /* synthetic */ Float16(short s8) {
        this.halfValue = s8;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m3078absoluteValueslo4al4(short s8) {
        return m3084constructorimpl((short) (s8 & Short.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m3079boximpl(short s8) {
        return new Float16(s8);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m3080ceilslo4al4(short s8) {
        int i8 = 65535 & s8;
        int i9 = s8 & Short.MAX_VALUE;
        int i10 = 1;
        if (i9 < 15360) {
            int i11 = s8 & 32768;
            int i12 = ~(i8 >> 15);
            if (i9 == 0) {
                i10 = 0;
            }
            i8 = ((-(i12 & i10)) & 15360) | i11;
        } else if (i9 < 25600) {
            int i13 = (1 << (25 - (i9 >> 10))) - 1;
            i8 = (i8 + (((i8 >> 15) - 1) & i13)) & (~i13);
        }
        return m3084constructorimpl((short) i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m3084constructorimpl(short s8) {
        return s8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3085equalsimpl(short s8, Object obj) {
        return (obj instanceof Float16) && s8 == ((Float16) obj).m3110unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3086equalsimpl0(short s8, short s9) {
        return s8 == s9;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m3087floorslo4al4(short s8) {
        int i8 = 65535;
        int i9 = s8 & 65535;
        int i10 = s8 & Short.MAX_VALUE;
        if (i10 < 15360) {
            int i11 = s8 & 32768;
            if (i9 <= 32768) {
                i8 = 0;
            }
            i9 = i11 | (i8 & 15360);
        } else if (i10 < 25600) {
            int i12 = (1 << (25 - (i10 >> 10))) - 1;
            i9 = (i9 + ((-(i9 >> 15)) & i12)) & (~i12);
        }
        return m3084constructorimpl((short) i9);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m3088getExponentimpl(short s8) {
        return ((s8 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m3089getSignslo4al4(short s8) {
        if (m3094isNaNimpl(s8)) {
            return NaN;
        }
        if (m3081compareTo41bOqos(s8, NegativeZero) < 0) {
            return NegativeOne;
        }
        if (m3081compareTo41bOqos(s8, PositiveZero) > 0) {
            return One;
        }
        return s8;
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m3090getSignificandimpl(short s8) {
        return s8 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3091hashCodeimpl(short s8) {
        return s8;
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m3092isFiniteimpl(short s8) {
        return (s8 & Short.MAX_VALUE) != FP16_EXPONENT_MAX;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m3093isInfiniteimpl(short s8) {
        return (s8 & Short.MAX_VALUE) == FP16_EXPONENT_MAX;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m3094isNaNimpl(short s8) {
        return (s8 & Short.MAX_VALUE) > FP16_EXPONENT_MAX;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m3095isNormalizedimpl(short s8) {
        int i8 = s8 & FP16_EXPONENT_MAX;
        return (i8 == 0 || i8 == FP16_EXPONENT_MAX) ? false : true;
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m3096roundslo4al4(short s8) {
        int i8 = 65535;
        int i9 = s8 & 65535;
        int i10 = s8 & Short.MAX_VALUE;
        if (i10 < 15360) {
            int i11 = s8 & 32768;
            if (i10 < 14336) {
                i8 = 0;
            }
            i9 = i11 | (i8 & 15360);
        } else if (i10 < 25600) {
            int i12 = i10 >> 10;
            i9 = (i9 + (1 << (24 - i12))) & (~((1 << (25 - i12)) - 1));
        }
        return m3084constructorimpl((short) i9);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m3097toBitsimpl(short s8) {
        if (m3094isNaNimpl(s8)) {
            return NaN;
        }
        return s8 & 65535;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m3098toByteimpl(short s8) {
        return (byte) m3100toFloatimpl(s8);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m3099toDoubleimpl(short s8) {
        return m3100toFloatimpl(s8);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m3100toFloatimpl(short s8) {
        int i8;
        int i9;
        int i10 = 32768 & s8;
        int i11 = ((65535 & s8) >>> 10) & 31;
        int i12 = s8 & 1023;
        if (i11 == 0) {
            if (i12 != 0) {
                kotlin.jvm.internal.r rVar = kotlin.jvm.internal.r.f34191a;
                float intBitsToFloat = Float.intBitsToFloat(i12 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
                if (i10 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        } else {
            int i13 = i12 << 13;
            if (i11 == 31) {
                if (i13 != 0) {
                    i13 |= 4194304;
                }
                i8 = i13;
                i9 = 255;
            } else {
                int i14 = i11 + 112;
                i8 = i13;
                i9 = i14;
            }
        }
        int i15 = (i9 << 23) | (i10 << 16) | i8;
        kotlin.jvm.internal.r rVar2 = kotlin.jvm.internal.r.f34191a;
        return Float.intBitsToFloat(i15);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m3101toHexStringimpl(short s8) {
        StringBuilder sb = new StringBuilder();
        int i8 = 65535 & s8;
        int i9 = i8 >>> 15;
        int i10 = (i8 >>> 10) & 31;
        int i11 = s8 & 1023;
        if (i10 == 31) {
            if (i11 == 0) {
                if (i9 != 0) {
                    sb.append('-');
                }
                sb.append("Infinity");
            } else {
                sb.append("NaN");
            }
        } else {
            if (i9 == 1) {
                sb.append('-');
            }
            if (i10 == 0) {
                if (i11 == 0) {
                    sb.append("0x0.0p0");
                } else {
                    sb.append("0x0.");
                    String num = Integer.toString(i11, AbstractC3202a.a(16));
                    AbstractC3255y.h(num, "toString(this, checkRadix(radix))");
                    sb.append(new j6.j("0{2,}$").h(num, ""));
                    sb.append("p-14");
                }
            } else {
                sb.append("0x1.");
                String num2 = Integer.toString(i11, AbstractC3202a.a(16));
                AbstractC3255y.h(num2, "toString(this, checkRadix(radix))");
                sb.append(new j6.j("0{2,}$").h(num2, ""));
                sb.append('p');
                sb.append(String.valueOf(i10 - 15));
            }
        }
        return sb.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m3102toIntimpl(short s8) {
        return (int) m3100toFloatimpl(s8);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m3103toLongimpl(short s8) {
        return m3100toFloatimpl(s8);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m3104toRawBitsimpl(short s8) {
        return s8 & 65535;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m3105toShortimpl(short s8) {
        return (short) m3100toFloatimpl(s8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3106toStringimpl(short s8) {
        return String.valueOf(m3100toFloatimpl(s8));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m3107truncslo4al4(short s8) {
        int i8 = 65535 & s8;
        int i9 = s8 & Short.MAX_VALUE;
        if (i9 < 15360) {
            i8 = 32768 & s8;
        } else if (i9 < 25600) {
            i8 &= ~((1 << (25 - (i9 >> 10))) - 1);
        }
        return m3084constructorimpl((short) i8);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m3108withSignqCeQghg(short s8, short s9) {
        return m3084constructorimpl((short) ((s8 & Short.MAX_VALUE) | (s9 & 32768)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m3109compareTo41bOqos(float16.m3110unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m3109compareTo41bOqos(short s8) {
        return m3081compareTo41bOqos(this.halfValue, s8);
    }

    public boolean equals(Object obj) {
        return m3085equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m3091hashCodeimpl(this.halfValue);
    }

    public String toString() {
        return m3106toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m3110unboximpl() {
        return this.halfValue;
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m3081compareTo41bOqos(short s8, short s9) {
        if (m3094isNaNimpl(s8)) {
            return !m3094isNaNimpl(s9) ? 1 : 0;
        }
        if (m3094isNaNimpl(s9)) {
            return -1;
        }
        Companion companion = Companion;
        return AbstractC3255y.k(companion.toCompareValue(s8), companion.toCompareValue(s9));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m3083constructorimpl(float f8) {
        return m3084constructorimpl(Companion.floatToHalf(f8));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m3082constructorimpl(double d8) {
        return m3083constructorimpl((float) d8);
    }
}
