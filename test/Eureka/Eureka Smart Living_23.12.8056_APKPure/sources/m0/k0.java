package m0;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class k0 extends i0 {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f7470g = true;

    @Override // m0.m0
    public void f(View view, int i6) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i6);
        } else if (f7470g) {
            try {
                view.setTransitionVisibility(i6);
            } catch (NoSuchMethodError unused) {
                f7470g = false;
            }
        }
    }
}
