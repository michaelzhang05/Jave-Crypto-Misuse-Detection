package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;
    private final CornerSize bottomEnd;
    private final CornerSize bottomStart;
    private final CornerSize topEnd;
    private final CornerSize topStart;

    public CornerBasedShape(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        AbstractC3159y.i(topStart, "topStart");
        AbstractC3159y.i(topEnd, "topEnd");
        AbstractC3159y.i(bottomEnd, "bottomEnd");
        AbstractC3159y.i(bottomStart, "bottomStart");
        this.topStart = topStart;
        this.topEnd = topEnd;
        this.bottomEnd = bottomEnd;
        this.bottomStart = bottomStart;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                cornerSize = cornerBasedShape.topStart;
            }
            if ((i8 & 2) != 0) {
                cornerSize2 = cornerBasedShape.topEnd;
            }
            if ((i8 & 4) != 0) {
                cornerSize3 = cornerBasedShape.bottomEnd;
            }
            if ((i8 & 8) != 0) {
                cornerSize4 = cornerBasedShape.bottomStart;
            }
            return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final CornerBasedShape copy(CornerSize all) {
        AbstractC3159y.i(all, "all");
        return copy(all, all, all, all);
    }

    public abstract CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo835createOutlineLjSzlW0(long j8, float f8, float f9, float f10, float f11, LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo331createOutlinePq9zytI(long j8, LayoutDirection layoutDirection, Density density) {
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        AbstractC3159y.i(density, "density");
        float mo843toPxTmRCtEA = this.topStart.mo843toPxTmRCtEA(j8, density);
        float mo843toPxTmRCtEA2 = this.topEnd.mo843toPxTmRCtEA(j8, density);
        float mo843toPxTmRCtEA3 = this.bottomEnd.mo843toPxTmRCtEA(j8, density);
        float mo843toPxTmRCtEA4 = this.bottomStart.mo843toPxTmRCtEA(j8, density);
        float m2803getMinDimensionimpl = Size.m2803getMinDimensionimpl(j8);
        float f8 = mo843toPxTmRCtEA + mo843toPxTmRCtEA4;
        if (f8 > m2803getMinDimensionimpl) {
            float f9 = m2803getMinDimensionimpl / f8;
            mo843toPxTmRCtEA *= f9;
            mo843toPxTmRCtEA4 *= f9;
        }
        float f10 = mo843toPxTmRCtEA4;
        float f11 = mo843toPxTmRCtEA2 + mo843toPxTmRCtEA3;
        if (f11 > m2803getMinDimensionimpl) {
            float f12 = m2803getMinDimensionimpl / f11;
            mo843toPxTmRCtEA2 *= f12;
            mo843toPxTmRCtEA3 *= f12;
        }
        if (mo843toPxTmRCtEA >= 0.0f && mo843toPxTmRCtEA2 >= 0.0f && mo843toPxTmRCtEA3 >= 0.0f && f10 >= 0.0f) {
            return mo835createOutlineLjSzlW0(j8, mo843toPxTmRCtEA, mo843toPxTmRCtEA2, mo843toPxTmRCtEA3, f10, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + mo843toPxTmRCtEA + ", topEnd = " + mo843toPxTmRCtEA2 + ", bottomEnd = " + mo843toPxTmRCtEA3 + ", bottomStart = " + f10 + ")!").toString());
    }

    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
