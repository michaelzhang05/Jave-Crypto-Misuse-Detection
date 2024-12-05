package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m5183constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m1444getRippleEndRadiuscSwnlzA(Density getRippleEndRadius, boolean z8, long j8) {
        AbstractC3255y.i(getRippleEndRadius, "$this$getRippleEndRadius");
        float m2738getDistanceimpl = Offset.m2738getDistanceimpl(OffsetKt.Offset(Size.m2809getWidthimpl(j8), Size.m2806getHeightimpl(j8))) / 2.0f;
        if (z8) {
            return m2738getDistanceimpl + getRippleEndRadius.mo453toPx0680j_4(BoundedRippleExtraRadius);
        }
        return m2738getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m1445getRippleStartRadiusuvyYCjk(long j8) {
        return Math.max(Size.m2809getWidthimpl(j8), Size.m2806getHeightimpl(j8)) * 0.3f;
    }
}
