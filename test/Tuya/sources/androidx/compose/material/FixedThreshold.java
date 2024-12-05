package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@Immutable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class FixedThreshold implements ThresholdConfig {
    public static final int $stable = 0;
    private final float offset;

    public /* synthetic */ FixedThreshold(float f8, AbstractC3151p abstractC3151p) {
        this(f8);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m1258component1D9Ej5fM() {
        return this.offset;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ FixedThreshold m1259copy0680j_4$default(FixedThreshold fixedThreshold, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = fixedThreshold.offset;
        }
        return fixedThreshold.m1260copy0680j_4(f8);
    }

    @Override // androidx.compose.material.ThresholdConfig
    public float computeThreshold(Density density, float f8, float f9) {
        AbstractC3159y.i(density, "<this>");
        return f8 + (density.mo448toPx0680j_4(this.offset) * Math.signum(f9 - f8));
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final FixedThreshold m1260copy0680j_4(float f8) {
        return new FixedThreshold(f8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && Dp.m5183equalsimpl0(this.offset, ((FixedThreshold) obj).offset);
    }

    public int hashCode() {
        return Dp.m5184hashCodeimpl(this.offset);
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) Dp.m5189toStringimpl(this.offset)) + ')';
    }

    private FixedThreshold(float f8) {
        this.offset = f8;
    }
}
