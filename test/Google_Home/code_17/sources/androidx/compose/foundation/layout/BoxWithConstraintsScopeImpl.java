package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j8, AbstractC3247p abstractC3247p) {
        this(density, j8);
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m548copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i8 & 2) != 0) {
            j8 = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m550copy0kLqBqw(density, j8);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier align(Modifier modifier, Alignment alignment) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(alignment, "alignment");
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m549component2msEJaDk() {
        return this.constraints;
    }

    /* renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m550copy0kLqBqw(Density density, long j8) {
        AbstractC3255y.i(density, "density");
        return new BoxWithConstraintsScopeImpl(density, j8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return AbstractC3255y.d(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m5144equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo543getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo544getMaxHeightD9Ej5fM() {
        Density density = this.density;
        if (Constraints.m5146getHasBoundedHeightimpl(mo543getConstraintsmsEJaDk())) {
            return density.mo450toDpu2uoSUM(Constraints.m5150getMaxHeightimpl(mo543getConstraintsmsEJaDk()));
        }
        return Dp.Companion.m5202getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo545getMaxWidthD9Ej5fM() {
        Density density = this.density;
        if (Constraints.m5147getHasBoundedWidthimpl(mo543getConstraintsmsEJaDk())) {
            return density.mo450toDpu2uoSUM(Constraints.m5151getMaxWidthimpl(mo543getConstraintsmsEJaDk()));
        }
        return Dp.Companion.m5202getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo546getMinHeightD9Ej5fM() {
        return this.density.mo450toDpu2uoSUM(Constraints.m5152getMinHeightimpl(mo543getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo547getMinWidthD9Ej5fM() {
        return this.density.mo450toDpu2uoSUM(Constraints.m5153getMinWidthimpl(mo543getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m5154hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier matchParentSize(Modifier modifier) {
        AbstractC3255y.i(modifier, "<this>");
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m5156toStringimpl(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density, long j8) {
        AbstractC3255y.i(density, "density");
        this.density = density;
        this.constraints = j8;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }
}
