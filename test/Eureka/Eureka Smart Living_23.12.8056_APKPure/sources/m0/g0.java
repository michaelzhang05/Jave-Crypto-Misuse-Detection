package m0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
abstract class g0 extends d0 {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f7464d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f7465e = true;

    @Override // m0.m0
    public void g(View view, Matrix matrix) {
        if (f7464d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f7464d = false;
            }
        }
    }

    @Override // m0.m0
    public void h(View view, Matrix matrix) {
        if (f7465e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f7465e = false;
            }
        }
    }
}
