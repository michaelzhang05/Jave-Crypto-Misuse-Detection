package M3;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final float f6565a;

    /* renamed from: b, reason: collision with root package name */
    private final float f6566b;

    public /* synthetic */ M(float f8, float f9, AbstractC3247p abstractC3247p) {
        this(f8, f9);
    }

    public final float a() {
        return this.f6566b;
    }

    public final float b() {
        return this.f6565a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (Dp.m5188equalsimpl0(this.f6565a, m8.f6565a) && Dp.m5188equalsimpl0(this.f6566b, m8.f6566b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Dp.m5189hashCodeimpl(this.f6565a) * 31) + Dp.m5189hashCodeimpl(this.f6566b);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + Dp.m5194toStringimpl(this.f6565a) + ", borderStrokeWidth=" + Dp.m5194toStringimpl(this.f6566b) + ")";
    }

    private M(float f8, float f9) {
        this.f6565a = f8;
        this.f6566b = f9;
    }

    public /* synthetic */ M(float f8, float f9, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Dp.Companion.m5203getUnspecifiedD9Ej5fM() : f8, (i8 & 2) != 0 ? Dp.Companion.m5203getUnspecifiedD9Ej5fM() : f9, null);
    }
}
