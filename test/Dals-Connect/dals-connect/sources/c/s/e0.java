package c.s;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
class e0 extends d0 {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f2982f = true;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f2983g = true;

    @Override // c.s.i0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f2982f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2982f = false;
            }
        }
    }

    @Override // c.s.i0
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f2983g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2983g = false;
            }
        }
    }
}
