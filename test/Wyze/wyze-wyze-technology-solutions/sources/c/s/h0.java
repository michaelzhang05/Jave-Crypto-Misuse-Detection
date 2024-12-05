package c.s;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
class h0 extends g0 {
    @Override // c.s.d0, c.s.i0
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // c.s.f0, c.s.i0
    public void e(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // c.s.d0, c.s.i0
    public void f(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // c.s.g0, c.s.i0
    public void g(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // c.s.e0, c.s.i0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // c.s.e0, c.s.i0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
