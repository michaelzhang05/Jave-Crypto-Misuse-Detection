package m4;

import androidx.compose.material.Shapes;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3437i {

    /* renamed from: a, reason: collision with root package name */
    private final float f35199a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35200b;

    /* renamed from: c, reason: collision with root package name */
    private final Shapes f35201c;

    public /* synthetic */ C3437i(float f8, float f9, Shapes shapes, AbstractC3247p abstractC3247p) {
        this(f8, f9, shapes);
    }

    public final Shapes a() {
        return this.f35201c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3437i)) {
            return false;
        }
        C3437i c3437i = (C3437i) obj;
        if (Dp.m5188equalsimpl0(this.f35199a, c3437i.f35199a) && Dp.m5188equalsimpl0(this.f35200b, c3437i.f35200b) && AbstractC3255y.d(this.f35201c, c3437i.f35201c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Dp.m5189hashCodeimpl(this.f35199a) * 31) + Dp.m5189hashCodeimpl(this.f35200b)) * 31) + this.f35201c.hashCode();
    }

    public String toString() {
        return "StripeComposeShapes(borderStrokeWidth=" + Dp.m5194toStringimpl(this.f35199a) + ", borderStrokeWidthSelected=" + Dp.m5194toStringimpl(this.f35200b) + ", material=" + this.f35201c + ")";
    }

    private C3437i(float f8, float f9, Shapes material) {
        AbstractC3255y.i(material, "material");
        this.f35199a = f8;
        this.f35200b = f9;
        this.f35201c = material;
    }
}
