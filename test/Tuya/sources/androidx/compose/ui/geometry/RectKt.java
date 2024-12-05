package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class RectKt {
    @Stable
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m2773Rect0a9Yr6o(long j8, long j9) {
        return new Rect(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8), Offset.m2735getXimpl(j9), Offset.m2736getYimpl(j9));
    }

    @Stable
    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m2774Rect3MmeM6k(long j8, float f8) {
        return new Rect(Offset.m2735getXimpl(j8) - f8, Offset.m2736getYimpl(j8) - f8, Offset.m2735getXimpl(j8) + f8, Offset.m2736getYimpl(j8) + f8);
    }

    @Stable
    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m2775Recttz77jQw(long j8, long j9) {
        return new Rect(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8), Offset.m2735getXimpl(j8) + Size.m2804getWidthimpl(j9), Offset.m2736getYimpl(j8) + Size.m2801getHeightimpl(j9));
    }

    @Stable
    public static final Rect lerp(Rect rect, Rect rect2, float f8) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f8), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f8), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f8), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f8));
    }
}
