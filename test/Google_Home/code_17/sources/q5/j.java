package q5;

import android.view.animation.Interpolator;

/* loaded from: classes5.dex */
public final class j implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private double f38338a;

    /* renamed from: b, reason: collision with root package name */
    private double f38339b;

    public j(double d8, double d9) {
        this.f38338a = d8;
        this.f38339b = d9;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        return (float) (((-1) * Math.pow(2.718281828459045d, (-f8) / this.f38338a) * Math.cos(this.f38339b * f8)) + 1);
    }
}
