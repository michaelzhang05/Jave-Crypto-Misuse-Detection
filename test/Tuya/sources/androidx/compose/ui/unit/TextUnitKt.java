package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m5377TextUnitanM5pPY(float f8, long j8) {
        return pack(j8, f8);
    }

    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m5378checkArithmeticR2X_6o(long j8) {
        if (!m5383isUnspecifiedR2X_6o(j8)) {
        } else {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m5379checkArithmeticNB67dxo(long j8, long j9) {
        if (!m5383isUnspecifiedR2X_6o(j8) && !m5383isUnspecifiedR2X_6o(j9)) {
            if (TextUnitType.m5393equalsimpl0(TextUnit.m5364getTypeUIouoOA(j8), TextUnit.m5364getTypeUIouoOA(j9))) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m5395toStringimpl(TextUnit.m5364getTypeUIouoOA(j8))) + " and " + ((Object) TextUnitType.m5395toStringimpl(TextUnit.m5364getTypeUIouoOA(j9)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m5380checkArithmeticvU0ePk(long j8, long j9, long j10) {
        if (!m5383isUnspecifiedR2X_6o(j8) && !m5383isUnspecifiedR2X_6o(j9) && !m5383isUnspecifiedR2X_6o(j10)) {
            if (TextUnitType.m5393equalsimpl0(TextUnit.m5364getTypeUIouoOA(j8), TextUnit.m5364getTypeUIouoOA(j9)) && TextUnitType.m5393equalsimpl0(TextUnit.m5364getTypeUIouoOA(j9), TextUnit.m5364getTypeUIouoOA(j10))) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m5395toStringimpl(TextUnit.m5364getTypeUIouoOA(j8))) + " and " + ((Object) TextUnitType.m5395toStringimpl(TextUnit.m5364getTypeUIouoOA(j9)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    public static final long getEm(float f8) {
        return pack(UNIT_TYPE_EM, f8);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d8) {
    }

    public static final long getSp(float f8) {
        return pack(UNIT_TYPE_SP, f8);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d8) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m5381isSpecifiedR2X_6o(long j8) {
        return !m5383isUnspecifiedR2X_6o(j8);
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m5382isSpecifiedR2X_6o$annotations(long j8) {
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m5383isUnspecifiedR2X_6o(long j8) {
        if (TextUnit.m5363getRawTypeimpl(j8) == 0) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m5384isUnspecifiedR2X_6o$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m5385lerpC3pnCVY(long j8, long j9, float f8) {
        m5379checkArithmeticNB67dxo(j8, j9);
        return pack(TextUnit.m5363getRawTypeimpl(j8), MathHelpersKt.lerp(TextUnit.m5365getValueimpl(j8), TextUnit.m5365getValueimpl(j9), f8));
    }

    public static final long pack(long j8, float f8) {
        return TextUnit.m5357constructorimpl(j8 | (Float.floatToIntBits(f8) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m5386takeOrElseeAf_CNQ(long j8, Function0 function0) {
        if (!(!m5383isUnspecifiedR2X_6o(j8))) {
            return ((TextUnit) function0.invoke()).m5374unboximpl();
        }
        return j8;
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m5388timesmpE4wyQ(float f8, long j8) {
        m5378checkArithmeticR2X_6o(j8);
        return pack(TextUnit.m5363getRawTypeimpl(j8), f8 * TextUnit.m5365getValueimpl(j8));
    }

    public static final long getEm(double d8) {
        return pack(UNIT_TYPE_EM, (float) d8);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f8) {
    }

    public static final long getSp(double d8) {
        return pack(UNIT_TYPE_SP, (float) d8);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f8) {
    }

    public static final long getEm(int i8) {
        return pack(UNIT_TYPE_EM, i8);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i8) {
    }

    public static final long getSp(int i8) {
        return pack(UNIT_TYPE_SP, i8);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i8) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m5387timesmpE4wyQ(double d8, long j8) {
        m5378checkArithmeticR2X_6o(j8);
        return pack(TextUnit.m5363getRawTypeimpl(j8), ((float) d8) * TextUnit.m5365getValueimpl(j8));
    }

    @Stable
    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m5389timesmpE4wyQ(int i8, long j8) {
        m5378checkArithmeticR2X_6o(j8);
        return pack(TextUnit.m5363getRawTypeimpl(j8), i8 * TextUnit.m5365getValueimpl(j8));
    }
}
