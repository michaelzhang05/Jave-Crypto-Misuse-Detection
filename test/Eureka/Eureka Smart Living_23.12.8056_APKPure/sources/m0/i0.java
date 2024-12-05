package m0;

import android.view.View;

/* loaded from: classes.dex */
class i0 extends g0 {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f7468f = true;

    @Override // m0.m0
    public void d(View view, int i6, int i7, int i8, int i9) {
        if (f7468f) {
            try {
                view.setLeftTopRightBottom(i6, i7, i8, i9);
            } catch (NoSuchMethodError unused) {
                f7468f = false;
            }
        }
    }
}
