package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j8, AbstractC3151p abstractC3151p) {
        this(density, j8);
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m543copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i8 & 2) != 0) {
            j8 = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m545copy0kLqBqw(density, j8);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier align(Modifier modifier, Alignment alignment) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(alignment, "alignment");
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m544component2msEJaDk() {
        return this.constraints;
    }

    /* renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m545copy0kLqBqw(Density density, long j8) {
        AbstractC3159y.i(density, "density");
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
        return AbstractC3159y.d(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m5139equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo538getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo539getMaxHeightD9Ej5fM() {
        Density density = this.density;
        if (Constraints.m5141getHasBoundedHeightimpl(mo538getConstraintsmsEJaDk())) {
            return density.mo445toDpu2uoSUM(Constraints.m5145getMaxHeightimpl(mo538getConstraintsmsEJaDk()));
        }
        return Dp.Companion.m5197getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo540getMaxWidthD9Ej5fM() {
        Density density = this.density;
        if (Constraints.m5142getHasBoundedWidthimpl(mo538getConstraintsmsEJaDk())) {
            return density.mo445toDpu2uoSUM(Constraints.m5146getMaxWidthimpl(mo538getConstraintsmsEJaDk()));
        }
        return Dp.Companion.m5197getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo541getMinHeightD9Ej5fM() {
        return this.density.mo445toDpu2uoSUM(Constraints.m5147getMinHeightimpl(mo538getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo542getMinWidthD9Ej5fM() {
        return this.density.mo445toDpu2uoSUM(Constraints.m5148getMinWidthimpl(mo538getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m5149hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier matchParentSize(Modifier modifier) {
        AbstractC3159y.i(modifier, "<this>");
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m5151toStringimpl(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density, long j8) {
        AbstractC3159y.i(density, "density");
        this.density = density;
        this.constraints = j8;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }
}
