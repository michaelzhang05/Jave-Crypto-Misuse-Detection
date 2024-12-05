package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class TransferParameters {

    /* renamed from: a, reason: collision with root package name */
    private final double f14591a;

    /* renamed from: b, reason: collision with root package name */
    private final double f14592b;

    /* renamed from: c, reason: collision with root package name */
    private final double f14593c;

    /* renamed from: d, reason: collision with root package name */
    private final double f14594d;

    /* renamed from: e, reason: collision with root package name */
    private final double f14595e;

    /* renamed from: f, reason: collision with root package name */
    private final double f14596f;
    private final double gamma;

    public TransferParameters(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.gamma = d8;
        this.f14591a = d9;
        this.f14592b = d10;
        this.f14593c = d11;
        this.f14594d = d12;
        this.f14595e = d13;
        this.f14596f = d14;
        if (Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d8)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d9 == 0.0d || d8 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d9 == 0.0d || d8 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d9 < 0.0d || d8 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f14591a;
    }

    public final double component3() {
        return this.f14592b;
    }

    public final double component4() {
        return this.f14593c;
    }

    public final double component5() {
        return this.f14594d;
    }

    public final double component6() {
        return this.f14595e;
    }

    public final double component7() {
        return this.f14596f;
    }

    public final TransferParameters copy(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        return new TransferParameters(d8, d9, d10, d11, d12, d13, d14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.f14591a, transferParameters.f14591a) == 0 && Double.compare(this.f14592b, transferParameters.f14592b) == 0 && Double.compare(this.f14593c, transferParameters.f14593c) == 0 && Double.compare(this.f14594d, transferParameters.f14594d) == 0 && Double.compare(this.f14595e, transferParameters.f14595e) == 0 && Double.compare(this.f14596f, transferParameters.f14596f) == 0;
    }

    public final double getA() {
        return this.f14591a;
    }

    public final double getB() {
        return this.f14592b;
    }

    public final double getC() {
        return this.f14593c;
    }

    public final double getD() {
        return this.f14594d;
    }

    public final double getE() {
        return this.f14595e;
    }

    public final double getF() {
        return this.f14596f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((androidx.compose.animation.core.b.a(this.gamma) * 31) + androidx.compose.animation.core.b.a(this.f14591a)) * 31) + androidx.compose.animation.core.b.a(this.f14592b)) * 31) + androidx.compose.animation.core.b.a(this.f14593c)) * 31) + androidx.compose.animation.core.b.a(this.f14594d)) * 31) + androidx.compose.animation.core.b.a(this.f14595e)) * 31) + androidx.compose.animation.core.b.a(this.f14596f);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f14591a + ", b=" + this.f14592b + ", c=" + this.f14593c + ", d=" + this.f14594d + ", e=" + this.f14595e + ", f=" + this.f14596f + ')';
    }

    public /* synthetic */ TransferParameters(double d8, double d9, double d10, double d11, double d12, double d13, double d14, int i8, AbstractC3247p abstractC3247p) {
        this(d8, d9, d10, d11, d12, (i8 & 32) != 0 ? 0.0d : d13, (i8 & 64) != 0 ? 0.0d : d14);
    }
}
