package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingValuesImpl(float f8, float f9, float f10, float f11, AbstractC3247p abstractC3247p) {
        this(f8, f9, f10, f11);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m622getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m623getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m624getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m625getTopD9Ej5fM$annotations() {
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo555calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo556calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.start;
        }
        return this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo557calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.end;
        }
        return this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo558calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        if (!Dp.m5188equalsimpl0(this.start, paddingValuesImpl.start) || !Dp.m5188equalsimpl0(this.top, paddingValuesImpl.top) || !Dp.m5188equalsimpl0(this.end, paddingValuesImpl.end) || !Dp.m5188equalsimpl0(this.bottom, paddingValuesImpl.bottom)) {
            return false;
        }
        return true;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m626getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m627getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m628getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m629getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m5189hashCodeimpl(this.start) * 31) + Dp.m5189hashCodeimpl(this.top)) * 31) + Dp.m5189hashCodeimpl(this.end)) * 31) + Dp.m5189hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) Dp.m5194toStringimpl(this.start)) + ", top=" + ((Object) Dp.m5194toStringimpl(this.top)) + ", end=" + ((Object) Dp.m5194toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m5194toStringimpl(this.bottom)) + ')';
    }

    private PaddingValuesImpl(float f8, float f9, float f10, float f11) {
        this.start = f8;
        this.top = f9;
        this.end = f10;
        this.bottom = f11;
    }

    public /* synthetic */ PaddingValuesImpl(float f8, float f9, float f10, float f11, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Dp.m5183constructorimpl(0) : f8, (i8 & 2) != 0 ? Dp.m5183constructorimpl(0) : f9, (i8 & 4) != 0 ? Dp.m5183constructorimpl(0) : f10, (i8 & 8) != 0 ? Dp.m5183constructorimpl(0) : f11, null);
    }
}
