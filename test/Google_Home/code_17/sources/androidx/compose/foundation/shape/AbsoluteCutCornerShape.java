package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsoluteCutCornerShape(CornerSize topLeft, CornerSize topRight, CornerSize bottomRight, CornerSize bottomLeft) {
        super(topLeft, topRight, bottomRight, bottomLeft);
        AbstractC3255y.i(topLeft, "topLeft");
        AbstractC3255y.i(topRight, "topRight");
        AbstractC3255y.i(bottomRight, "bottomRight");
        AbstractC3255y.i(bottomLeft, "bottomLeft");
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0, reason: not valid java name */
    public Outline mo840createOutlineLjSzlW0(long j8, float f8, float f9, float f10, float f11, LayoutDirection layoutDirection) {
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        if (f8 + f9 + f11 + f10 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m2830toRectuvyYCjk(j8));
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, f8);
        Path.lineTo(f8, 0.0f);
        Path.lineTo(Size.m2809getWidthimpl(j8) - f9, 0.0f);
        Path.lineTo(Size.m2809getWidthimpl(j8), f9);
        Path.lineTo(Size.m2809getWidthimpl(j8), Size.m2806getHeightimpl(j8) - f10);
        Path.lineTo(Size.m2809getWidthimpl(j8) - f10, Size.m2806getHeightimpl(j8));
        Path.lineTo(f11, Size.m2806getHeightimpl(j8));
        Path.lineTo(0.0f, Size.m2806getHeightimpl(j8) - f11);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        AbsoluteCutCornerShape absoluteCutCornerShape = (AbsoluteCutCornerShape) obj;
        if (AbstractC3255y.d(getTopStart(), absoluteCutCornerShape.getTopStart()) && AbstractC3255y.d(getTopEnd(), absoluteCutCornerShape.getTopEnd()) && AbstractC3255y.d(getBottomEnd(), absoluteCutCornerShape.getBottomEnd()) && AbstractC3255y.d(getBottomStart(), absoluteCutCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public AbsoluteCutCornerShape copy(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        AbstractC3255y.i(topStart, "topStart");
        AbstractC3255y.i(topEnd, "topEnd");
        AbstractC3255y.i(bottomEnd, "bottomEnd");
        AbstractC3255y.i(bottomStart, "bottomStart");
        return new AbsoluteCutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }
}
