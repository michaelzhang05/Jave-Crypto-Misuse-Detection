package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import c.h.j.j;
import e.e.b.b.z.g;
import e.e.b.b.z.k;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes2.dex */
class c extends b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImplLollipop.java */
    /* loaded from: classes2.dex */
    public static class a extends g {
        a(k kVar) {
            super(kVar);
        }

        @Override // e.e.b.b.z.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(FloatingActionButton floatingActionButton, e.e.b.b.y.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator j0(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.F, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(b.a);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void C() {
        f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void E(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.F.isEnabled()) {
                this.F.setElevation(this.o);
                if (this.F.isPressed()) {
                    this.F.setTranslationZ(this.q);
                    return;
                } else if (!this.F.isFocused() && !this.F.isHovered()) {
                    this.F.setTranslationZ(0.0f);
                    return;
                } else {
                    this.F.setTranslationZ(this.p);
                    return;
                }
            }
            this.F.setElevation(0.0f);
            this.F.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void F(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21) {
            this.F.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.f16631b, j0(f2, f4));
            stateListAnimator.addState(b.f16632c, j0(f2, f3));
            stateListAnimator.addState(b.f16633d, j0(f2, f3));
            stateListAnimator.addState(b.f16634e, j0(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.F, "elevation", f2).setDuration(0L));
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.F;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.a);
            stateListAnimator.addState(b.f16635f, animatorSet);
            stateListAnimator.addState(b.f16636g, j0(0.0f, 0.0f));
            this.F.setStateListAnimator(stateListAnimator);
        }
        if (Z()) {
            f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean K() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f16639j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(e.e.b.b.x.b.d(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean Z() {
        return this.G.c() || !b0();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void d0() {
    }

    com.google.android.material.floatingactionbutton.a i0(int i2, ColorStateList colorStateList) {
        Context context = this.F.getContext();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a((k) j.c(this.f16637h));
        aVar.e(androidx.core.content.a.c(context, e.e.b.b.c.f17435f), androidx.core.content.a.c(context, e.e.b.b.c.f17434e), androidx.core.content.a.c(context, e.e.b.b.c.f17432c), androidx.core.content.a.c(context, e.e.b.b.c.f17433d));
        aVar.d(i2);
        aVar.c(colorStateList);
        return aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    g j() {
        return new a((k) j.c(this.f16637h));
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float n() {
        return this.F.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void s(Rect rect) {
        if (this.G.c()) {
            super.s(rect);
        } else if (!b0()) {
            int sizeDimension = (this.r - this.F.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable drawable;
        g j2 = j();
        this.f16638i = j2;
        j2.setTintList(colorStateList);
        if (mode != null) {
            this.f16638i.setTintMode(mode);
        }
        this.f16638i.N(this.F.getContext());
        if (i2 > 0) {
            this.f16640k = i0(i2, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) j.c(this.f16640k), (Drawable) j.c(this.f16638i)});
        } else {
            this.f16640k = null;
            drawable = this.f16638i;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(e.e.b.b.x.b.d(colorStateList2), drawable, null);
        this.f16639j = rippleDrawable;
        this.l = rippleDrawable;
    }
}
