package m0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class l0 extends k0 {
    @Override // m0.d0, m0.m0
    public float b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // m0.i0, m0.m0
    public void d(View view, int i6, int i7, int i8, int i9) {
        view.setLeftTopRightBottom(i6, i7, i8, i9);
    }

    @Override // m0.d0, m0.m0
    public void e(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // m0.k0, m0.m0
    public void f(View view, int i6) {
        view.setTransitionVisibility(i6);
    }

    @Override // m0.g0, m0.m0
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // m0.g0, m0.m0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
