package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class RoundRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m2789RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m2720getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ RoundRect(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11, AbstractC3151p abstractC3151p) {
        this(f8, f9, f10, f11, j8, j9, j10, j11);
    }

    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f8, float f9, float f10, float f11) {
        float f12 = f9 + f10;
        if (f12 > f11 && f12 != 0.0f) {
            return Math.min(f8, f11 / f12);
        }
        return f8;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect == null) {
            float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m2711getYimpl(this.bottomLeftCornerRadius), CornerRadius.m2711getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m2710getXimpl(this.topLeftCornerRadius), CornerRadius.m2710getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m2711getYimpl(this.topRightCornerRadius), CornerRadius.m2711getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m2710getXimpl(this.bottomRightCornerRadius), CornerRadius.m2710getXimpl(this.bottomLeftCornerRadius), getWidth());
            RoundRect roundRect2 = new RoundRect(this.left * minRadius, this.top * minRadius, this.right * minRadius, this.bottom * minRadius, CornerRadiusKt.CornerRadius(CornerRadius.m2710getXimpl(this.topLeftCornerRadius) * minRadius, CornerRadius.m2711getYimpl(this.topLeftCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2710getXimpl(this.topRightCornerRadius) * minRadius, CornerRadius.m2711getYimpl(this.topRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2710getXimpl(this.bottomRightCornerRadius) * minRadius, CornerRadius.m2711getYimpl(this.bottomRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m2710getXimpl(this.bottomLeftCornerRadius) * minRadius, CornerRadius.m2711getYimpl(this.bottomLeftCornerRadius) * minRadius), null);
            this._scaledRadiiRect = roundRect2;
            return roundRect2;
        }
        return roundRect;
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m2777component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m2778component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m2779component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m2780component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2781containsk4lQ0M(long j8) {
        float m2735getXimpl;
        float m2736getYimpl;
        float m2710getXimpl;
        float m2711getYimpl;
        if (Offset.m2735getXimpl(j8) < this.left || Offset.m2735getXimpl(j8) >= this.right || Offset.m2736getYimpl(j8) < this.top || Offset.m2736getYimpl(j8) >= this.bottom) {
            return false;
        }
        RoundRect scaledRadiiRect = scaledRadiiRect();
        if (Offset.m2735getXimpl(j8) < this.left + CornerRadius.m2710getXimpl(scaledRadiiRect.topLeftCornerRadius) && Offset.m2736getYimpl(j8) < this.top + CornerRadius.m2711getYimpl(scaledRadiiRect.topLeftCornerRadius)) {
            m2735getXimpl = (Offset.m2735getXimpl(j8) - this.left) - CornerRadius.m2710getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m2736getYimpl = (Offset.m2736getYimpl(j8) - this.top) - CornerRadius.m2711getYimpl(scaledRadiiRect.topLeftCornerRadius);
            m2710getXimpl = CornerRadius.m2710getXimpl(scaledRadiiRect.topLeftCornerRadius);
            m2711getYimpl = CornerRadius.m2711getYimpl(scaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m2735getXimpl(j8) > this.right - CornerRadius.m2710getXimpl(scaledRadiiRect.topRightCornerRadius) && Offset.m2736getYimpl(j8) < this.top + CornerRadius.m2711getYimpl(scaledRadiiRect.topRightCornerRadius)) {
            m2735getXimpl = (Offset.m2735getXimpl(j8) - this.right) + CornerRadius.m2710getXimpl(scaledRadiiRect.topRightCornerRadius);
            m2736getYimpl = (Offset.m2736getYimpl(j8) - this.top) - CornerRadius.m2711getYimpl(scaledRadiiRect.topRightCornerRadius);
            m2710getXimpl = CornerRadius.m2710getXimpl(scaledRadiiRect.topRightCornerRadius);
            m2711getYimpl = CornerRadius.m2711getYimpl(scaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m2735getXimpl(j8) > this.right - CornerRadius.m2710getXimpl(scaledRadiiRect.bottomRightCornerRadius) && Offset.m2736getYimpl(j8) > this.bottom - CornerRadius.m2711getYimpl(scaledRadiiRect.bottomRightCornerRadius)) {
            m2735getXimpl = (Offset.m2735getXimpl(j8) - this.right) + CornerRadius.m2710getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m2736getYimpl = (Offset.m2736getYimpl(j8) - this.bottom) + CornerRadius.m2711getYimpl(scaledRadiiRect.bottomRightCornerRadius);
            m2710getXimpl = CornerRadius.m2710getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            m2711getYimpl = CornerRadius.m2711getYimpl(scaledRadiiRect.bottomRightCornerRadius);
        } else {
            if (Offset.m2735getXimpl(j8) >= this.left + CornerRadius.m2710getXimpl(scaledRadiiRect.bottomLeftCornerRadius) || Offset.m2736getYimpl(j8) <= this.bottom - CornerRadius.m2711getYimpl(scaledRadiiRect.bottomLeftCornerRadius)) {
                return true;
            }
            m2735getXimpl = (Offset.m2735getXimpl(j8) - this.left) - CornerRadius.m2710getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m2736getYimpl = (Offset.m2736getYimpl(j8) - this.bottom) + CornerRadius.m2711getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m2710getXimpl = CornerRadius.m2710getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            m2711getYimpl = CornerRadius.m2711getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
        }
        float f8 = m2735getXimpl / m2710getXimpl;
        float f9 = m2736getYimpl / m2711getYimpl;
        if ((f8 * f8) + (f9 * f9) > 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m2782copyMDFrsts(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11) {
        return new RoundRect(f8, f9, f10, f11, j8, j9, j10, j11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m2709equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m2709equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m2709equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m2709equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2783getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2784getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2785getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2786getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom)) * 31) + CornerRadius.m2712hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m2712hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m2712hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m2712hashCodeimpl(this.bottomLeftCornerRadius);
    }

    public String toString() {
        long j8 = this.topLeftCornerRadius;
        long j9 = this.topRightCornerRadius;
        long j10 = this.bottomRightCornerRadius;
        long j11 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (CornerRadius.m2709equalsimpl0(j8, j9) && CornerRadius.m2709equalsimpl0(j9, j10) && CornerRadius.m2709equalsimpl0(j10, j11)) {
            if (CornerRadius.m2710getXimpl(j8) == CornerRadius.m2711getYimpl(j8)) {
                return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2710getXimpl(j8), 1) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2710getXimpl(j8), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m2711getYimpl(j8), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m2716toStringimpl(j8)) + ", topRight=" + ((Object) CornerRadius.m2716toStringimpl(j9)) + ", bottomRight=" + ((Object) CornerRadius.m2716toStringimpl(j10)) + ", bottomLeft=" + ((Object) CornerRadius.m2716toStringimpl(j11)) + ')';
    }

    private RoundRect(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11) {
        this.left = f8;
        this.top = f9;
        this.right = f10;
        this.bottom = f11;
        this.topLeftCornerRadius = j8;
        this.topRightCornerRadius = j9;
        this.bottomRightCornerRadius = j10;
        this.bottomLeftCornerRadius = j11;
    }

    public /* synthetic */ RoundRect(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11, int i8, AbstractC3151p abstractC3151p) {
        this(f8, f9, f10, f11, (i8 & 16) != 0 ? CornerRadius.Companion.m2720getZerokKHJgLs() : j8, (i8 & 32) != 0 ? CornerRadius.Companion.m2720getZerokKHJgLs() : j9, (i8 & 64) != 0 ? CornerRadius.Companion.m2720getZerokKHJgLs() : j10, (i8 & 128) != 0 ? CornerRadius.Companion.m2720getZerokKHJgLs() : j11, null);
    }
}
