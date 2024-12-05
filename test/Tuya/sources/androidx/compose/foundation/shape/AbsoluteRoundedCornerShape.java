package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsoluteRoundedCornerShape(CornerSize topLeft, CornerSize topRight, CornerSize bottomRight, CornerSize bottomLeft) {
        super(topLeft, topRight, bottomRight, bottomLeft);
        AbstractC3159y.i(topLeft, "topLeft");
        AbstractC3159y.i(topRight, "topRight");
        AbstractC3159y.i(bottomRight, "bottomRight");
        AbstractC3159y.i(bottomLeft, "bottomLeft");
    }

    /* renamed from: toRadius-Bz7bX_o, reason: not valid java name */
    private final long m839toRadiusBz7bX_o(float f8) {
        return CornerRadiusKt.CornerRadius$default(f8, 0.0f, 2, null);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo835createOutlineLjSzlW0(long j8, float f8, float f9, float f10, float f11, LayoutDirection layoutDirection) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        if (f8 + f9 + f10 + f11 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m2825toRectuvyYCjk(j8));
        }
        return new Outline.Rounded(RoundRectKt.m2787RoundRectZAM2FJo(SizeKt.m2825toRectuvyYCjk(j8), CornerRadiusKt.CornerRadius$default(f8, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f9, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f10, 0.0f, 2, null), CornerRadiusKt.CornerRadius$default(f11, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        if (AbstractC3159y.d(getTopStart(), absoluteRoundedCornerShape.getTopStart()) && AbstractC3159y.d(getTopEnd(), absoluteRoundedCornerShape.getTopEnd()) && AbstractC3159y.d(getBottomEnd(), absoluteRoundedCornerShape.getBottomEnd()) && AbstractC3159y.d(getBottomStart(), absoluteRoundedCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public AbsoluteRoundedCornerShape copy(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        AbstractC3159y.i(topStart, "topStart");
        AbstractC3159y.i(topEnd, "topEnd");
        AbstractC3159y.i(bottomEnd, "bottomEnd");
        AbstractC3159y.i(bottomStart, "bottomStart");
        return new AbsoluteRoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }
}
