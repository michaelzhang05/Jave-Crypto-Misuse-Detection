package j4;

import androidx.compose.material.Shapes;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3083i {

    /* renamed from: a, reason: collision with root package name */
    private final float f33223a;

    /* renamed from: b, reason: collision with root package name */
    private final float f33224b;

    /* renamed from: c, reason: collision with root package name */
    private final Shapes f33225c;

    public /* synthetic */ C3083i(float f8, float f9, Shapes shapes, AbstractC3151p abstractC3151p) {
        this(f8, f9, shapes);
    }

    public final Shapes a() {
        return this.f33225c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3083i)) {
            return false;
        }
        C3083i c3083i = (C3083i) obj;
        if (Dp.m5183equalsimpl0(this.f33223a, c3083i.f33223a) && Dp.m5183equalsimpl0(this.f33224b, c3083i.f33224b) && AbstractC3159y.d(this.f33225c, c3083i.f33225c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Dp.m5184hashCodeimpl(this.f33223a) * 31) + Dp.m5184hashCodeimpl(this.f33224b)) * 31) + this.f33225c.hashCode();
    }

    public String toString() {
        return "StripeComposeShapes(borderStrokeWidth=" + Dp.m5189toStringimpl(this.f33223a) + ", borderStrokeWidthSelected=" + Dp.m5189toStringimpl(this.f33224b) + ", material=" + this.f33225c + ")";
    }

    private C3083i(float f8, float f9, Shapes material) {
        AbstractC3159y.i(material, "material");
        this.f33223a = f8;
        this.f33224b = f9;
        this.f33225c = material;
    }
}
