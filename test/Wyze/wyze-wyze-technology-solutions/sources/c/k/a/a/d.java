package c.k.a.a;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
abstract class d implements Interpolator {
    private final float[] a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2780b;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(float[] fArr) {
        this.a = fArr;
        this.f2780b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f2780b;
        float f4 = (f2 - (min * f3)) / f3;
        float[] fArr2 = this.a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
