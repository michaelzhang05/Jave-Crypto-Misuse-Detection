package m0;

import android.view.View;

/* loaded from: classes.dex */
abstract class d0 extends m0 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f7449c = true;

    @Override // m0.m0
    public void a(View view) {
    }

    @Override // m0.m0
    public float b(View view) {
        float transitionAlpha;
        if (f7449c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f7449c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // m0.m0
    public void c(View view) {
    }

    @Override // m0.m0
    public void e(View view, float f6) {
        if (f7449c) {
            try {
                view.setTransitionAlpha(f6);
                return;
            } catch (NoSuchMethodError unused) {
                f7449c = false;
            }
        }
        view.setAlpha(f6);
    }
}
