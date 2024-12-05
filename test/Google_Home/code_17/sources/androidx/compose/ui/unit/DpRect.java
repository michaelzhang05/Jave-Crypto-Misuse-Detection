package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class DpRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ DpRect(float f8, float f9, float f10, float f11, AbstractC3247p abstractC3247p) {
        this(f8, f9, f10, f11);
    }

    /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m5255copya9UjIt4$default(DpRect dpRect, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = dpRect.left;
        }
        if ((i8 & 2) != 0) {
            f9 = dpRect.top;
        }
        if ((i8 & 4) != 0) {
            f10 = dpRect.right;
        }
        if ((i8 & 8) != 0) {
            f11 = dpRect.bottom;
        }
        return dpRect.m5264copya9UjIt4(f8, f9, f10, f11);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5256getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5257getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5258getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5259getTopD9Ej5fM$annotations() {
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m5260component1D9Ej5fM() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m5261component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m5262component3D9Ej5fM() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m5263component4D9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m5264copya9UjIt4(float f8, float f9, float f10, float f11) {
        return new DpRect(f8, f9, f10, f11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        return Dp.m5188equalsimpl0(this.left, dpRect.left) && Dp.m5188equalsimpl0(this.top, dpRect.top) && Dp.m5188equalsimpl0(this.right, dpRect.right) && Dp.m5188equalsimpl0(this.bottom, dpRect.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m5265getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m5266getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m5267getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m5268getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m5189hashCodeimpl(this.left) * 31) + Dp.m5189hashCodeimpl(this.top)) * 31) + Dp.m5189hashCodeimpl(this.right)) * 31) + Dp.m5189hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "DpRect(left=" + ((Object) Dp.m5194toStringimpl(this.left)) + ", top=" + ((Object) Dp.m5194toStringimpl(this.top)) + ", right=" + ((Object) Dp.m5194toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m5194toStringimpl(this.bottom)) + ')';
    }

    public /* synthetic */ DpRect(long j8, long j9, AbstractC3247p abstractC3247p) {
        this(j8, j9);
    }

    private DpRect(float f8, float f9, float f10, float f11) {
        this.left = f8;
        this.top = f9;
        this.right = f10;
        this.bottom = f11;
    }

    private DpRect(long j8, long j9) {
        this(DpOffset.m5244getXD9Ej5fM(j8), DpOffset.m5246getYD9Ej5fM(j8), Dp.m5183constructorimpl(DpOffset.m5244getXD9Ej5fM(j8) + DpSize.m5281getWidthD9Ej5fM(j9)), Dp.m5183constructorimpl(DpOffset.m5246getYD9Ej5fM(j8) + DpSize.m5279getHeightD9Ej5fM(j9)), null);
    }
}
