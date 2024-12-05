package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends t {

    /* renamed from: e, reason: collision with root package name */
    private final int f5267e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5268f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f5269g;

    /* renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f5270h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f5271i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f5272j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f5273k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f5274l;

    /* renamed from: m, reason: collision with root package name */
    private ValueAnimator f5275m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f5333b.Z(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f5333b.Z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(s sVar) {
        super(sVar);
        this.f5272j = new View.OnClickListener() { // from class: com.google.android.material.textfield.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.G(view);
            }
        };
        this.f5273k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z5) {
                f.this.H(view, z5);
            }
        };
        this.f5267e = x2.a.f(sVar.getContext(), m2.a.B, 100);
        this.f5268f = x2.a.f(sVar.getContext(), m2.a.B, 150);
        this.f5269g = x2.a.g(sVar.getContext(), m2.a.F, n2.a.f7961a);
        this.f5270h = x2.a.g(sVar.getContext(), m2.a.E, n2.a.f7964d);
    }

    private void A(boolean z5) {
        boolean z6 = this.f5333b.E() == z5;
        if (z5 && !this.f5274l.isRunning()) {
            this.f5275m.cancel();
            this.f5274l.start();
            if (z6) {
                this.f5274l.end();
                return;
            }
            return;
        }
        if (z5) {
            return;
        }
        this.f5274l.cancel();
        this.f5275m.start();
        if (z6) {
            this.f5275m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f5269g);
        ofFloat.setDuration(this.f5267e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.E(valueAnimator);
            }
        });
        return ofFloat;
    }

    private ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f5270h);
        ofFloat.setDuration(this.f5268f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.F(valueAnimator);
            }
        });
        return ofFloat;
    }

    private void D() {
        ValueAnimator C = C();
        ValueAnimator B = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5274l = animatorSet;
        animatorSet.playTogether(C, B);
        this.f5274l.addListener(new a());
        ValueAnimator B2 = B(1.0f, 0.0f);
        this.f5275m = B2;
        B2.addListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f5335d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5335d.setScaleX(floatValue);
        this.f5335d.setScaleY(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f5271i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z5) {
        A(J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f5271i;
        return editText != null && (editText.hasFocus() || this.f5335d.hasFocus()) && this.f5271i.getText().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void a(Editable editable) {
        if (this.f5333b.w() != null) {
            return;
        }
        A(J());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public int c() {
        return m2.h.f7665e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public int d() {
        return m2.d.f7613i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public View.OnFocusChangeListener e() {
        return this.f5273k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public View.OnClickListener f() {
        return this.f5272j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public View.OnFocusChangeListener g() {
        return this.f5273k;
    }

    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f5271i = editText;
        this.f5332a.setEndIconVisible(J());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void q(boolean z5) {
        if (this.f5333b.w() == null) {
            return;
        }
        A(z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void s() {
        D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void u() {
        EditText editText = this.f5271i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.a
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.I();
                }
            });
        }
    }
}
