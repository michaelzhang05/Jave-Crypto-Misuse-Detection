package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.t;
import androidx.core.view.u;
import androidx.core.widget.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndicatorViewController.java */
/* loaded from: classes2.dex */
public final class f {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputLayout f16780b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f16781c;

    /* renamed from: d, reason: collision with root package name */
    private int f16782d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f16783e;

    /* renamed from: f, reason: collision with root package name */
    private int f16784f;

    /* renamed from: g, reason: collision with root package name */
    private Animator f16785g;

    /* renamed from: h, reason: collision with root package name */
    private final float f16786h;

    /* renamed from: i, reason: collision with root package name */
    private int f16787i;

    /* renamed from: j, reason: collision with root package name */
    private int f16788j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f16789k;
    private boolean l;
    private TextView m;
    private CharSequence n;
    private int o;
    private ColorStateList p;
    private CharSequence q;
    private boolean r;
    private TextView s;
    private int t;
    private ColorStateList u;
    private Typeface v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f16790b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f16791c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f16792d;

        a(int i2, TextView textView, int i3, TextView textView2) {
            this.a = i2;
            this.f16790b = textView;
            this.f16791c = i3;
            this.f16792d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f16787i = this.a;
            f.this.f16785g = null;
            TextView textView = this.f16790b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f16791c == 1 && f.this.m != null) {
                    f.this.m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f16792d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f16792d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f16792d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        this.a = textInputLayout.getContext();
        this.f16780b = textInputLayout;
        this.f16786h = r0.getResources().getDimensionPixelSize(e.e.b.b.d.p);
    }

    private void B(int i2, int i3) {
        TextView l;
        TextView l2;
        if (i2 == i3) {
            return;
        }
        if (i3 != 0 && (l2 = l(i3)) != null) {
            l2.setVisibility(0);
            l2.setAlpha(1.0f);
        }
        if (i2 != 0 && (l = l(i2)) != null) {
            l.setVisibility(4);
            if (i2 == 1) {
                l.setText((CharSequence) null);
            }
        }
        this.f16787i = i3;
    }

    private void J(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void L(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean M(TextView textView, CharSequence charSequence) {
        return u.O(this.f16780b) && this.f16780b.isEnabled() && !(this.f16788j == this.f16787i && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void P(int i2, int i3, boolean z) {
        if (i2 == i3) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f16785g = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.r, this.s, 2, i2, i3);
            h(arrayList, this.l, this.m, 1, i2, i3);
            e.e.b.b.m.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i3, l(i2), i2, l(i3)));
            animatorSet.start();
        } else {
            B(i2, i3);
        }
        this.f16780b.updateEditTextBackground();
        this.f16780b.updateLabelState(z);
        this.f16780b.updateTextInputBoxState();
    }

    private boolean f() {
        return (this.f16781c == null || this.f16780b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            list.add(i(textView, i4 == i2));
            if (i4 == i2) {
                list.add(j(textView));
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(e.e.b.b.m.a.a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f16786h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(e.e.b.b.m.a.f17508d);
        return ofFloat;
    }

    private TextView l(int i2) {
        if (i2 == 1) {
            return this.m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.s;
    }

    private boolean v(int i2) {
        return (i2 != 1 || this.m == null || TextUtils.isEmpty(this.f16789k)) ? false : true;
    }

    private boolean w(int i2) {
        return (i2 != 2 || this.s == null || TextUtils.isEmpty(this.q)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.f16781c == null) {
            return;
        }
        if (x(i2) && (frameLayout = this.f16783e) != null) {
            int i3 = this.f16784f - 1;
            this.f16784f = i3;
            L(frameLayout, i3);
            this.f16783e.removeView(textView);
        } else {
            this.f16781c.removeView(textView);
        }
        int i4 = this.f16782d - 1;
        this.f16782d = i4;
        L(this.f16781c, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(CharSequence charSequence) {
        this.n = charSequence;
        TextView textView = this.m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(boolean z) {
        if (this.l == z) {
            return;
        }
        g();
        if (z) {
            t tVar = new t(this.a);
            this.m = tVar;
            tVar.setId(e.e.b.b.f.z);
            if (Build.VERSION.SDK_INT >= 17) {
                this.m.setTextAlignment(5);
            }
            Typeface typeface = this.v;
            if (typeface != null) {
                this.m.setTypeface(typeface);
            }
            E(this.o);
            F(this.p);
            C(this.n);
            this.m.setVisibility(4);
            u.k0(this.m, 1);
            d(this.m, 0);
        } else {
            t();
            A(this.m, 0);
            this.m = null;
            this.f16780b.updateEditTextBackground();
            this.f16780b.updateTextInputBoxState();
        }
        this.l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(int i2) {
        this.o = i2;
        TextView textView = this.m;
        if (textView != null) {
            this.f16780b.setTextAppearanceCompatWithErrorFallback(textView, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(int i2) {
        this.t = i2;
        TextView textView = this.s;
        if (textView != null) {
            k.n(textView, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(boolean z) {
        if (this.r == z) {
            return;
        }
        g();
        if (z) {
            t tVar = new t(this.a);
            this.s = tVar;
            tVar.setId(e.e.b.b.f.A);
            if (Build.VERSION.SDK_INT >= 17) {
                this.s.setTextAlignment(5);
            }
            Typeface typeface = this.v;
            if (typeface != null) {
                this.s.setTypeface(typeface);
            }
            this.s.setVisibility(4);
            u.k0(this.s, 1);
            G(this.t);
            I(this.u);
            d(this.s, 1);
        } else {
            u();
            A(this.s, 1);
            this.s = null;
            this.f16780b.updateEditTextBackground();
            this.f16780b.updateTextInputBoxState();
        }
        this.r = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        this.u = colorStateList;
        TextView textView = this.s;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(Typeface typeface) {
        if (typeface != this.v) {
            this.v = typeface;
            J(this.m, typeface);
            J(this.s, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(CharSequence charSequence) {
        g();
        this.f16789k = charSequence;
        this.m.setText(charSequence);
        int i2 = this.f16787i;
        if (i2 != 1) {
            this.f16788j = 1;
        }
        P(i2, this.f16788j, M(this.m, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(CharSequence charSequence) {
        g();
        this.q = charSequence;
        this.s.setText(charSequence);
        int i2 = this.f16787i;
        if (i2 != 2) {
            this.f16788j = 2;
        }
        P(i2, this.f16788j, M(this.s, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(TextView textView, int i2) {
        if (this.f16781c == null && this.f16783e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.f16781c = linearLayout;
            linearLayout.setOrientation(0);
            this.f16780b.addView(this.f16781c, -1, -2);
            this.f16783e = new FrameLayout(this.a);
            this.f16781c.addView(this.f16783e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f16780b.getEditText() != null) {
                e();
            }
        }
        if (x(i2)) {
            this.f16783e.setVisibility(0);
            this.f16783e.addView(textView);
            this.f16784f++;
        } else {
            this.f16781c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f16781c.setVisibility(0);
        this.f16782d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (f()) {
            u.w0(this.f16781c, u.D(this.f16780b.getEditText()), 0, u.C(this.f16780b.getEditText()), 0);
        }
    }

    void g() {
        Animator animator = this.f16785g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return v(this.f16788j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence m() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence n() {
        return this.f16789k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList p() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence q() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        TextView textView = this.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        return w(this.f16787i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.f16789k = null;
        g();
        if (this.f16787i == 1) {
            if (this.r && !TextUtils.isEmpty(this.q)) {
                this.f16788j = 2;
            } else {
                this.f16788j = 0;
            }
        }
        P(this.f16787i, this.f16788j, M(this.m, null));
    }

    void u() {
        g();
        int i2 = this.f16787i;
        if (i2 == 2) {
            this.f16788j = 0;
        }
        P(i2, this.f16788j, M(this.s, null));
    }

    boolean x(int i2) {
        return i2 == 0 || i2 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.r;
    }
}
