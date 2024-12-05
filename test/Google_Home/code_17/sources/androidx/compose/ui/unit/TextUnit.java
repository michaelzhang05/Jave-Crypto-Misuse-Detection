package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.r;

@Immutable
/* loaded from: classes.dex */
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5380getUnspecifiedXSAIIZE$annotations() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m5381getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m5395boximpl(companion.m5404getUnspecifiedUIouoOA()), TextUnitType.m5395boximpl(companion.m5403getSpUIouoOA()), TextUnitType.m5395boximpl(companion.m5402getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m5360boximpl(long j8) {
        return new TextUnit(j8);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m5361compareToR2X_6o(long j8, long j9) {
        TextUnitKt.m5384checkArithmeticNB67dxo(j8, j9);
        return Float.compare(m5370getValueimpl(j8), m5370getValueimpl(j9));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5362constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m5364divkPz2Gy4(long j8, float f8) {
        TextUnitKt.m5383checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5368getRawTypeimpl(j8), m5370getValueimpl(j8) / f8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5366equalsimpl(long j8, Object obj) {
        return (obj instanceof TextUnit) && j8 == ((TextUnit) obj).m5379unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5367equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m5368getRawTypeimpl(long j8) {
        return j8 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m5369getTypeUIouoOA(long j8) {
        return TextUnitTypes[(int) (m5368getRawTypeimpl(j8) >>> 32)].m5401unboximpl();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m5370getValueimpl(long j8) {
        r rVar = r.f34191a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5371hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m5372isEmimpl(long j8) {
        if (m5368getRawTypeimpl(j8) == 8589934592L) {
            return true;
        }
        return false;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m5373isSpimpl(long j8) {
        if (m5368getRawTypeimpl(j8) == 4294967296L) {
            return true;
        }
        return false;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m5375timeskPz2Gy4(long j8, float f8) {
        TextUnitKt.m5383checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5368getRawTypeimpl(j8), m5370getValueimpl(j8) * f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5377toStringimpl(long j8) {
        long m5369getTypeUIouoOA = m5369getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5404getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5403getSpUIouoOA())) {
            return m5370getValueimpl(j8) + ".sp";
        }
        if (TextUnitType.m5398equalsimpl0(m5369getTypeUIouoOA, companion.m5402getEmUIouoOA())) {
            return m5370getValueimpl(j8) + ".em";
        }
        return "Invalid";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m5378unaryMinusXSAIIZE(long j8) {
        TextUnitKt.m5383checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5368getRawTypeimpl(j8), -m5370getValueimpl(j8));
    }

    public boolean equals(Object obj) {
        return m5366equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5371hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5377toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5379unboximpl() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m5363divkPz2Gy4(long j8, double d8) {
        TextUnitKt.m5383checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5368getRawTypeimpl(j8), (float) (m5370getValueimpl(j8) / d8));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m5374timeskPz2Gy4(long j8, double d8) {
        TextUnitKt.m5383checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5368getRawTypeimpl(j8), (float) (m5370getValueimpl(j8) * d8));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m5365divkPz2Gy4(long j8, int i8) {
        TextUnitKt.m5383checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5368getRawTypeimpl(j8), m5370getValueimpl(j8) / i8);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m5376timeskPz2Gy4(long j8, int i8) {
        TextUnitKt.m5383checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5368getRawTypeimpl(j8), m5370getValueimpl(j8) * i8);
    }
}
