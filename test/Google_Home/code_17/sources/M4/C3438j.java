package m4;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

/* renamed from: m4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3438j {

    /* renamed from: a, reason: collision with root package name */
    private final float f35202a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35203b;

    /* renamed from: c, reason: collision with root package name */
    private final float f35204c;

    public C3438j(float f8, float f9, float f10) {
        this.f35202a = f8;
        this.f35203b = f9;
        this.f35204c = f10;
    }

    public static /* synthetic */ C3438j b(C3438j c3438j, float f8, float f9, float f10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = c3438j.f35202a;
        }
        if ((i8 & 2) != 0) {
            f9 = c3438j.f35203b;
        }
        if ((i8 & 4) != 0) {
            f10 = c3438j.f35204c;
        }
        return c3438j.a(f8, f9, f10);
    }

    public final C3438j a(float f8, float f9, float f10) {
        return new C3438j(f8, f9, f10);
    }

    public final float c() {
        return this.f35203b;
    }

    public final float d() {
        return this.f35204c;
    }

    public final float e() {
        return this.f35202a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3438j)) {
            return false;
        }
        C3438j c3438j = (C3438j) obj;
        if (Float.compare(this.f35202a, c3438j.f35202a) == 0 && Float.compare(this.f35203b, c3438j.f35203b) == 0 && Float.compare(this.f35204c, c3438j.f35204c) == 0) {
            return true;
        }
        return false;
    }

    public final Shape f() {
        return RoundedCornerShapeKt.m857RoundedCornerShape0680j_4(Dp.m5183constructorimpl(this.f35202a));
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f35202a) * 31) + Float.floatToIntBits(this.f35203b)) * 31) + Float.floatToIntBits(this.f35204c);
    }

    public String toString() {
        return "StripeShapes(cornerRadius=" + this.f35202a + ", borderStrokeWidth=" + this.f35203b + ", borderStrokeWidthSelected=" + this.f35204c + ")";
    }
}
