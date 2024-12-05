package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m5178constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m1439getRippleEndRadiuscSwnlzA(Density getRippleEndRadius, boolean z8, long j8) {
        AbstractC3159y.i(getRippleEndRadius, "$this$getRippleEndRadius");
        float m2733getDistanceimpl = Offset.m2733getDistanceimpl(OffsetKt.Offset(Size.m2804getWidthimpl(j8), Size.m2801getHeightimpl(j8))) / 2.0f;
        if (z8) {
            return m2733getDistanceimpl + getRippleEndRadius.mo448toPx0680j_4(BoundedRippleExtraRadius);
        }
        return m2733getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m1440getRippleStartRadiusuvyYCjk(long j8) {
        return Math.max(Size.m2804getWidthimpl(j8), Size.m2801getHeightimpl(j8)) * 0.3f;
    }
}
