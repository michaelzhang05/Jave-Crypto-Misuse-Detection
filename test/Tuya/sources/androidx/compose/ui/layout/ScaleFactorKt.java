package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f8, float f9) {
        return ScaleFactor.m4182constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m4196divUQTWf7w(long j8, long j9) {
        return SizeKt.Size(Size.m2804getWidthimpl(j8) / ScaleFactor.m4188getScaleXimpl(j9), Size.m2801getHeightimpl(j8) / ScaleFactor.m4189getScaleYimpl(j9));
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m4197isSpecifiedFK8aYYs(long j8) {
        if (j8 != ScaleFactor.Companion.m4195getUnspecified_hLwfpc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m4198isSpecifiedFK8aYYs$annotations(long j8) {
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m4199isUnspecifiedFK8aYYs(long j8) {
        if (j8 == ScaleFactor.Companion.m4195getUnspecified_hLwfpc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m4200isUnspecifiedFK8aYYs$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m4201lerpbDIf60(long j8, long j9, float f8) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m4188getScaleXimpl(j8), ScaleFactor.m4188getScaleXimpl(j9), f8), MathHelpersKt.lerp(ScaleFactor.m4189getScaleYimpl(j8), ScaleFactor.m4189getScaleYimpl(j9), f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f8) {
        float f9 = 10;
        float f10 = f8 * f9;
        int i8 = (int) f10;
        if (f10 - i8 >= 0.5f) {
            i8++;
        }
        return i8 / f9;
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m4202takeOrElseoyDd2qo(long j8, Function0 function0) {
        if (j8 == ScaleFactor.Companion.m4195getUnspecified_hLwfpc()) {
            return ((ScaleFactor) function0.invoke()).m4193unboximpl();
        }
        return j8;
    }

    @Stable
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m4203timesUQTWf7w(long j8, long j9) {
        return SizeKt.Size(Size.m2804getWidthimpl(j8) * ScaleFactor.m4188getScaleXimpl(j9), Size.m2801getHeightimpl(j8) * ScaleFactor.m4189getScaleYimpl(j9));
    }

    @Stable
    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m4204timesmw2e94(long j8, long j9) {
        return m4203timesUQTWf7w(j9, j8);
    }
}
