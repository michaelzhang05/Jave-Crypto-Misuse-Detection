package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerShape(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        AbstractC3255y.i(topStart, "topStart");
        AbstractC3255y.i(topEnd, "topEnd");
        AbstractC3255y.i(bottomEnd, "bottomEnd");
        AbstractC3255y.i(bottomStart, "bottomStart");
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo840createOutlineLjSzlW0(long j8, float f8, float f9, float f10, float f11, LayoutDirection layoutDirection) {
        float f12;
        float f13;
        float f14;
        float f15;
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        if (f8 + f9 + f10 + f11 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m2830toRectuvyYCjk(j8));
        }
        Rect m2830toRectuvyYCjk = SizeKt.m2830toRectuvyYCjk(j8);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            f12 = f8;
        } else {
            f12 = f9;
        }
        long CornerRadius$default = CornerRadiusKt.CornerRadius$default(f12, 0.0f, 2, null);
        if (layoutDirection == layoutDirection2) {
            f13 = f9;
        } else {
            f13 = f8;
        }
        long CornerRadius$default2 = CornerRadiusKt.CornerRadius$default(f13, 0.0f, 2, null);
        if (layoutDirection == layoutDirection2) {
            f14 = f10;
        } else {
            f14 = f11;
        }
        long CornerRadius$default3 = CornerRadiusKt.CornerRadius$default(f14, 0.0f, 2, null);
        if (layoutDirection == layoutDirection2) {
            f15 = f11;
        } else {
            f15 = f10;
        }
        return new Outline.Rounded(RoundRectKt.m2792RoundRectZAM2FJo(m2830toRectuvyYCjk, CornerRadius$default, CornerRadius$default2, CornerRadius$default3, CornerRadiusKt.CornerRadius$default(f15, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        if (AbstractC3255y.d(getTopStart(), roundedCornerShape.getTopStart()) && AbstractC3255y.d(getTopEnd(), roundedCornerShape.getTopEnd()) && AbstractC3255y.d(getBottomEnd(), roundedCornerShape.getBottomEnd()) && AbstractC3255y.d(getBottomStart(), roundedCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public RoundedCornerShape copy(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        AbstractC3255y.i(topStart, "topStart");
        AbstractC3255y.i(topEnd, "topEnd");
        AbstractC3255y.i(bottomEnd, "bottomEnd");
        AbstractC3255y.i(bottomStart, "bottomStart");
        return new RoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }
}
