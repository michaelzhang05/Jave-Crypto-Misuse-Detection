package c.s;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
class g0 extends f0 {

    /* renamed from: i, reason: collision with root package name */
    private static boolean f2985i = true;

    @Override // c.s.i0
    @SuppressLint({"NewApi"})
    public void g(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i2);
        } else if (f2985i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f2985i = false;
            }
        }
    }
}
