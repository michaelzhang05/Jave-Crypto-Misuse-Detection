package e.e.b.b.m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator.java */
/* loaded from: classes2.dex */
public class g implements TypeEvaluator<Matrix> {
    private final float[] a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f17511b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f17512c = new Matrix();

    public Matrix a(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.f17511b);
        for (int i2 = 0; i2 < 9; i2++) {
            float[] fArr = this.f17511b;
            float f3 = fArr[i2];
            float[] fArr2 = this.a;
            fArr[i2] = fArr2[i2] + ((f3 - fArr2[i2]) * f2);
        }
        this.f17512c.setValues(this.f17511b);
        return this.f17512c;
    }
}
