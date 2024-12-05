package d0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f6383a;

    /* renamed from: b, reason: collision with root package name */
    private final float f6384b;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(float[] fArr) {
        this.f6383a = fArr;
        this.f6384b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f6383a;
        int min = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f7 = this.f6384b;
        float f8 = (f6 - (min * f7)) / f7;
        float[] fArr2 = this.f6383a;
        float f9 = fArr2[min];
        return f9 + (f8 * (fArr2[min + 1] - f9));
    }
}
