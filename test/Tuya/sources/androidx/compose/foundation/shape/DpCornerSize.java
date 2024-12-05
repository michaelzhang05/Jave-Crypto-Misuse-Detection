package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.K;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import f6.InterfaceC2680g;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public /* synthetic */ DpCornerSize(float f8, AbstractC3151p abstractC3151p) {
        this(f8);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m848component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ DpCornerSize m849copy0680j_4$default(DpCornerSize dpCornerSize, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = dpCornerSize.size;
        }
        return dpCornerSize.m850copy0680j_4(f8);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final DpCornerSize m850copy0680j_4(float f8) {
        return new DpCornerSize(f8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.m5183equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ InterfaceC2680g getInspectableElements() {
        return K.a(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ String getNameFallback() {
        return K.b(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return Dp.m5176boximpl(m851getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m851getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return Dp.m5184hashCodeimpl(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo843toPxTmRCtEA(long j8, Density density) {
        AbstractC3159y.i(density, "density");
        return density.mo448toPx0680j_4(this.size);
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    private DpCornerSize(float f8) {
        this.size = f8;
    }
}
