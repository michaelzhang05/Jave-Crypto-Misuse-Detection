package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class CornerRadiusKt {
    @Stable
    public static final long CornerRadius(float f8, float f9) {
        return CornerRadius.m2704constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = f8;
        }
        return CornerRadius(f8, f9);
    }

    @Stable
    /* renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m2721lerp3Ry4LBc(long j8, long j9, float f8) {
        return CornerRadius(MathHelpersKt.lerp(CornerRadius.m2710getXimpl(j8), CornerRadius.m2710getXimpl(j9), f8), MathHelpersKt.lerp(CornerRadius.m2711getYimpl(j8), CornerRadius.m2711getYimpl(j9), f8));
    }
}
