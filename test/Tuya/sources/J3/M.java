package J3;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final float f4859a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4860b;

    public /* synthetic */ M(float f8, float f9, AbstractC3151p abstractC3151p) {
        this(f8, f9);
    }

    public final float a() {
        return this.f4860b;
    }

    public final float b() {
        return this.f4859a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (Dp.m5183equalsimpl0(this.f4859a, m8.f4859a) && Dp.m5183equalsimpl0(this.f4860b, m8.f4860b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Dp.m5184hashCodeimpl(this.f4859a) * 31) + Dp.m5184hashCodeimpl(this.f4860b);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + Dp.m5189toStringimpl(this.f4859a) + ", borderStrokeWidth=" + Dp.m5189toStringimpl(this.f4860b) + ")";
    }

    private M(float f8, float f9) {
        this.f4859a = f8;
        this.f4860b = f9;
    }

    public /* synthetic */ M(float f8, float f9, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? Dp.Companion.m5198getUnspecifiedD9Ej5fM() : f8, (i8 & 2) != 0 ? Dp.Companion.m5198getUnspecifiedD9Ej5fM() : f9, null);
    }
}
