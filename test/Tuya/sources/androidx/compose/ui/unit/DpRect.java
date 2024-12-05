package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;

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

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ DpRect(float f8, float f9, float f10, float f11, AbstractC3151p abstractC3151p) {
        this(f8, f9, f10, f11);
    }

    /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m5250copya9UjIt4$default(DpRect dpRect, float f8, float f9, float f10, float f11, int i8, Object obj) {
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
        return dpRect.m5259copya9UjIt4(f8, f9, f10, f11);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5251getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5252getLeftD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5253getRightD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5254getTopD9Ej5fM$annotations() {
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m5255component1D9Ej5fM() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m5256component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m5257component3D9Ej5fM() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m5258component4D9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m5259copya9UjIt4(float f8, float f9, float f10, float f11) {
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
        return Dp.m5183equalsimpl0(this.left, dpRect.left) && Dp.m5183equalsimpl0(this.top, dpRect.top) && Dp.m5183equalsimpl0(this.right, dpRect.right) && Dp.m5183equalsimpl0(this.bottom, dpRect.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m5260getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m5261getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m5262getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m5263getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m5184hashCodeimpl(this.left) * 31) + Dp.m5184hashCodeimpl(this.top)) * 31) + Dp.m5184hashCodeimpl(this.right)) * 31) + Dp.m5184hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "DpRect(left=" + ((Object) Dp.m5189toStringimpl(this.left)) + ", top=" + ((Object) Dp.m5189toStringimpl(this.top)) + ", right=" + ((Object) Dp.m5189toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m5189toStringimpl(this.bottom)) + ')';
    }

    public /* synthetic */ DpRect(long j8, long j9, AbstractC3151p abstractC3151p) {
        this(j8, j9);
    }

    private DpRect(float f8, float f9, float f10, float f11) {
        this.left = f8;
        this.top = f9;
        this.right = f10;
        this.bottom = f11;
    }

    private DpRect(long j8, long j9) {
        this(DpOffset.m5239getXD9Ej5fM(j8), DpOffset.m5241getYD9Ej5fM(j8), Dp.m5178constructorimpl(DpOffset.m5239getXD9Ej5fM(j8) + DpSize.m5276getWidthD9Ej5fM(j9)), Dp.m5178constructorimpl(DpOffset.m5241getYD9Ej5fM(j8) + DpSize.m5274getHeightD9Ej5fM(j9)), null);
    }
}
