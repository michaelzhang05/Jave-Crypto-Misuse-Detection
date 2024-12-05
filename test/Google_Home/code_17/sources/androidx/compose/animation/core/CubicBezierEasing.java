package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name */
    private final float f14549a;

    /* renamed from: b, reason: collision with root package name */
    private final float f14550b;

    /* renamed from: c, reason: collision with root package name */
    private final float f14551c;

    /* renamed from: d, reason: collision with root package name */
    private final float f14552d;

    public CubicBezierEasing(float f8, float f9, float f10, float f11) {
        this.f14549a = f8;
        this.f14550b = f9;
        this.f14551c = f10;
        this.f14552d = f11;
        if (!Float.isNaN(f8) && !Float.isNaN(f9) && !Float.isNaN(f10) && !Float.isNaN(f11)) {
            return;
        }
        throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f8 + ", " + f9 + ", " + f10 + ", " + f11 + '.').toString());
    }

    private final float evaluateCubic(float f8, float f9, float f10) {
        float f11 = 3;
        float f12 = 1 - f10;
        return (f8 * f11 * f12 * f12 * f10) + (f11 * f9 * f12 * f10 * f10) + (f10 * f10 * f10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
            if (this.f14549a == cubicBezierEasing.f14549a && this.f14550b == cubicBezierEasing.f14550b && this.f14551c == cubicBezierEasing.f14551c && this.f14552d == cubicBezierEasing.f14552d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f14549a) * 31) + Float.floatToIntBits(this.f14550b)) * 31) + Float.floatToIntBits(this.f14551c)) * 31) + Float.floatToIntBits(this.f14552d);
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f8) {
        float f9 = 0.0f;
        if (f8 > 0.0f) {
            float f10 = 1.0f;
            if (f8 < 1.0f) {
                while (true) {
                    float f11 = (f9 + f10) / 2;
                    float evaluateCubic = evaluateCubic(this.f14549a, this.f14551c, f11);
                    if (Math.abs(f8 - evaluateCubic) < 0.001f) {
                        return evaluateCubic(this.f14550b, this.f14552d, f11);
                    }
                    if (evaluateCubic < f8) {
                        f9 = f11;
                    } else {
                        f10 = f11;
                    }
                }
            }
        }
        return f8;
    }
}
