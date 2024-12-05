package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b1;

/* loaded from: classes.dex */
public class d extends n0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f7445a;

        a(View view) {
            this.f7445a = view;
        }

        @Override // m0.l.f
        public void d(l lVar) {
            a0.g(this.f7445a, 1.0f);
            a0.a(this.f7445a);
            lVar.Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f7447a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f7448b = false;

        b(View view) {
            this.f7447a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0.g(this.f7447a, 1.0f);
            if (this.f7448b) {
                this.f7447a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (b1.Q(this.f7447a) && this.f7447a.getLayerType() == 0) {
                this.f7448b = true;
                this.f7447a.setLayerType(2, null);
            }
        }
    }

    public d() {
    }

    public d(int i6) {
        j0(i6);
    }

    private Animator k0(View view, float f6, float f7) {
        if (f6 == f7) {
            return null;
        }
        a0.g(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) a0.f7417b, f7);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float l0(s sVar, float f6) {
        Float f7;
        return (sVar == null || (f7 = (Float) sVar.f7537a.get("android:fade:transitionAlpha")) == null) ? f6 : f7.floatValue();
    }

    @Override // m0.n0
    public Animator f0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float l02 = l0(sVar, 0.0f);
        return k0(view, l02 != 1.0f ? l02 : 0.0f, 1.0f);
    }

    @Override // m0.n0
    public Animator h0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        a0.e(view);
        return k0(view, l0(sVar, 1.0f), 0.0f);
    }

    @Override // m0.n0, m0.l
    public void k(s sVar) {
        super.k(sVar);
        sVar.f7537a.put("android:fade:transitionAlpha", Float.valueOf(a0.c(sVar.f7538b)));
    }
}
