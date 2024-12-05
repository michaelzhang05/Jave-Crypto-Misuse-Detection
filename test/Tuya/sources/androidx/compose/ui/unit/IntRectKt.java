package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class IntRectKt {
    @Stable
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m5333IntRectE1MhUcY(long j8, long j9) {
        return new IntRect(IntOffset.m5302getXimpl(j8), IntOffset.m5303getYimpl(j8), IntOffset.m5302getXimpl(j9), IntOffset.m5303getYimpl(j9));
    }

    @Stable
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m5334IntRectVbeCjmY(long j8, long j9) {
        return new IntRect(IntOffset.m5302getXimpl(j8), IntOffset.m5303getYimpl(j8), IntOffset.m5302getXimpl(j8) + IntSize.m5344getWidthimpl(j9), IntOffset.m5303getYimpl(j8) + IntSize.m5343getHeightimpl(j9));
    }

    @Stable
    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m5335IntRectar5cAso(long j8, int i8) {
        return new IntRect(IntOffset.m5302getXimpl(j8) - i8, IntOffset.m5303getYimpl(j8) - i8, IntOffset.m5302getXimpl(j8) + i8, IntOffset.m5303getYimpl(j8) + i8);
    }

    @Stable
    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f8) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f8), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f8), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f8), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f8));
    }

    @Stable
    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Z5.a.d(rect.getLeft()), Z5.a.d(rect.getTop()), Z5.a.d(rect.getRight()), Z5.a.d(rect.getBottom()));
    }

    @Stable
    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
