package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class ShadowKt {
    @Stable
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f8) {
        return new Shadow(ColorKt.m3027lerpjxsXWHM(shadow.m3278getColor0d7_KjU(), shadow2.m3278getColor0d7_KjU(), f8), OffsetKt.m2763lerpWko1d7g(shadow.m3279getOffsetF1C5BW0(), shadow2.m3279getOffsetF1C5BW0(), f8), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f8), null);
    }
}
