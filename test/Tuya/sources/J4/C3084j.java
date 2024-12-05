package j4;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

/* renamed from: j4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3084j {

    /* renamed from: a, reason: collision with root package name */
    private final float f33226a;

    /* renamed from: b, reason: collision with root package name */
    private final float f33227b;

    /* renamed from: c, reason: collision with root package name */
    private final float f33228c;

    public C3084j(float f8, float f9, float f10) {
        this.f33226a = f8;
        this.f33227b = f9;
        this.f33228c = f10;
    }

    public static /* synthetic */ C3084j b(C3084j c3084j, float f8, float f9, float f10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = c3084j.f33226a;
        }
        if ((i8 & 2) != 0) {
            f9 = c3084j.f33227b;
        }
        if ((i8 & 4) != 0) {
            f10 = c3084j.f33228c;
        }
        return c3084j.a(f8, f9, f10);
    }

    public final C3084j a(float f8, float f9, float f10) {
        return new C3084j(f8, f9, f10);
    }

    public final float c() {
        return this.f33227b;
    }

    public final float d() {
        return this.f33228c;
    }

    public final float e() {
        return this.f33226a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3084j)) {
            return false;
        }
        C3084j c3084j = (C3084j) obj;
        if (Float.compare(this.f33226a, c3084j.f33226a) == 0 && Float.compare(this.f33227b, c3084j.f33227b) == 0 && Float.compare(this.f33228c, c3084j.f33228c) == 0) {
            return true;
        }
        return false;
    }

    public final Shape f() {
        return RoundedCornerShapeKt.m852RoundedCornerShape0680j_4(Dp.m5178constructorimpl(this.f33226a));
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f33226a) * 31) + Float.floatToIntBits(this.f33227b)) * 31) + Float.floatToIntBits(this.f33228c);
    }

    public String toString() {
        return "StripeShapes(cornerRadius=" + this.f33226a + ", borderStrokeWidth=" + this.f33227b + ", borderStrokeWidthSelected=" + this.f33228c + ")";
    }
}
