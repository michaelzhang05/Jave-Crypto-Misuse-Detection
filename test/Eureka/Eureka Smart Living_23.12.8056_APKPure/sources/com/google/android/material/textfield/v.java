package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.k1;
import androidx.core.view.b1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v {
    private ColorStateList A;
    private Typeface B;

    /* renamed from: a, reason: collision with root package name */
    private final int f5336a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5337b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5338c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f5339d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f5340e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f5341f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f5342g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f5343h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f5344i;

    /* renamed from: j, reason: collision with root package name */
    private int f5345j;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f5346k;

    /* renamed from: l, reason: collision with root package name */
    private Animator f5347l;

    /* renamed from: m, reason: collision with root package name */
    private final float f5348m;

    /* renamed from: n, reason: collision with root package name */
    private int f5349n;

    /* renamed from: o, reason: collision with root package name */
    private int f5350o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f5351p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5352q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f5353r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f5354s;

    /* renamed from: t, reason: collision with root package name */
    private int f5355t;

    /* renamed from: u, reason: collision with root package name */
    private int f5356u;

    /* renamed from: v, reason: collision with root package name */
    private ColorStateList f5357v;

    /* renamed from: w, reason: collision with root package name */
    private CharSequence f5358w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f5359x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f5360y;

    /* renamed from: z, reason: collision with root package name */
    private int f5361z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f5363b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5364c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f5365d;

        a(int i6, TextView textView, int i7, TextView textView2) {
            this.f5362a = i6;
            this.f5363b = textView;
            this.f5364c = i7;
            this.f5365d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            v.this.f5349n = this.f5362a;
            v.this.f5347l = null;
            TextView textView = this.f5363b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f5364c == 1 && v.this.f5353r != null) {
                    v.this.f5353r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f5365d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f5365d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f5365d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f5365d.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = v.this.f5343h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5342g = context;
        this.f5343h = textInputLayout;
        this.f5348m = context.getResources().getDimensionPixelSize(m2.c.f7583e);
        this.f5336a = x2.a.f(context, m2.a.C, 217);
        this.f5337b = x2.a.f(context, m2.a.f7572z, 167);
        this.f5338c = x2.a.f(context, m2.a.C, 167);
        this.f5339d = x2.a.g(context, m2.a.D, n2.a.f7964d);
        int i6 = m2.a.D;
        TimeInterpolator timeInterpolator = n2.a.f7961a;
        this.f5340e = x2.a.g(context, i6, timeInterpolator);
        this.f5341f = x2.a.g(context, m2.a.F, timeInterpolator);
    }

    private void D(int i6, int i7) {
        TextView m6;
        TextView m7;
        if (i6 == i7) {
            return;
        }
        if (i7 != 0 && (m7 = m(i7)) != null) {
            m7.setVisibility(0);
            m7.setAlpha(1.0f);
        }
        if (i6 != 0 && (m6 = m(i6)) != null) {
            m6.setVisibility(4);
            if (i6 == 1) {
                m6.setText((CharSequence) null);
            }
        }
        this.f5349n = i7;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i6) {
        if (i6 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return b1.U(this.f5343h) && this.f5343h.isEnabled() && !(this.f5350o == this.f5349n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i6, int i7, boolean z5) {
        if (i6 == i7) {
            return;
        }
        if (z5) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5347l = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f5359x, this.f5360y, 2, i6, i7);
            i(arrayList, this.f5352q, this.f5353r, 1, i6, i7);
            n2.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i7, m(i6), i6, m(i7)));
            animatorSet.start();
        } else {
            D(i6, i7);
        }
        this.f5343h.m0();
        this.f5343h.q0(z5);
        this.f5343h.w0();
    }

    private boolean g() {
        return (this.f5344i == null || this.f5343h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z5, TextView textView, int i6, int i7, int i8) {
        if (textView == null || !z5) {
            return;
        }
        boolean z6 = false;
        if (i6 == i8 || i6 == i7) {
            ObjectAnimator j6 = j(textView, i8 == i6);
            if (i6 == i8 && i7 != 0) {
                z6 = true;
            }
            if (z6) {
                j6.setStartDelay(this.f5338c);
            }
            list.add(j6);
            if (i8 != i6 || i7 == 0) {
                return;
            }
            ObjectAnimator k6 = k(textView);
            k6.setStartDelay(this.f5338c);
            list.add(k6);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z5) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z5 ? 1.0f : 0.0f);
        ofFloat.setDuration(z5 ? this.f5337b : this.f5338c);
        ofFloat.setInterpolator(z5 ? this.f5340e : this.f5341f);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f5348m, 0.0f);
        ofFloat.setDuration(this.f5336a);
        ofFloat.setInterpolator(this.f5339d);
        return ofFloat;
    }

    private TextView m(int i6) {
        if (i6 == 1) {
            return this.f5353r;
        }
        if (i6 != 2) {
            return null;
        }
        return this.f5360y;
    }

    private int v(boolean z5, int i6, int i7) {
        return z5 ? this.f5342g.getResources().getDimensionPixelSize(i6) : i7;
    }

    private boolean y(int i6) {
        return (i6 != 1 || this.f5353r == null || TextUtils.isEmpty(this.f5351p)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f5352q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B() {
        return this.f5359x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(TextView textView, int i6) {
        ViewGroup viewGroup;
        if (this.f5344i == null) {
            return;
        }
        if (!z(i6) || (viewGroup = this.f5346k) == null) {
            viewGroup = this.f5344i;
        }
        viewGroup.removeView(textView);
        int i7 = this.f5345j - 1;
        this.f5345j = i7;
        O(this.f5344i, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(int i6) {
        this.f5355t = i6;
        TextView textView = this.f5353r;
        if (textView != null) {
            b1.s0(textView, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(CharSequence charSequence) {
        this.f5354s = charSequence;
        TextView textView = this.f5353r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(boolean z5) {
        if (this.f5352q == z5) {
            return;
        }
        h();
        if (z5) {
            k1 k1Var = new k1(this.f5342g);
            this.f5353r = k1Var;
            k1Var.setId(m2.e.M);
            this.f5353r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f5353r.setTypeface(typeface);
            }
            H(this.f5356u);
            I(this.f5357v);
            F(this.f5354s);
            E(this.f5355t);
            this.f5353r.setVisibility(4);
            e(this.f5353r, 0);
        } else {
            w();
            C(this.f5353r, 0);
            this.f5353r = null;
            this.f5343h.m0();
            this.f5343h.w0();
        }
        this.f5352q = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i6) {
        this.f5356u = i6;
        TextView textView = this.f5353r;
        if (textView != null) {
            this.f5343h.Z(textView, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        this.f5357v = colorStateList;
        TextView textView = this.f5353r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(int i6) {
        this.f5361z = i6;
        TextView textView = this.f5360y;
        if (textView != null) {
            androidx.core.widget.s.n(textView, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(boolean z5) {
        if (this.f5359x == z5) {
            return;
        }
        h();
        if (z5) {
            k1 k1Var = new k1(this.f5342g);
            this.f5360y = k1Var;
            k1Var.setId(m2.e.N);
            this.f5360y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f5360y.setTypeface(typeface);
            }
            this.f5360y.setVisibility(4);
            b1.s0(this.f5360y, 1);
            J(this.f5361z);
            L(this.A);
            e(this.f5360y, 1);
            this.f5360y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f5360y, 1);
            this.f5360y = null;
            this.f5343h.m0();
            this.f5343h.w0();
        }
        this.f5359x = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f5360y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f5353r, typeface);
            M(this.f5360y, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        h();
        this.f5351p = charSequence;
        this.f5353r.setText(charSequence);
        int i6 = this.f5349n;
        if (i6 != 1) {
            this.f5350o = 1;
        }
        S(i6, this.f5350o, P(this.f5353r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(CharSequence charSequence) {
        h();
        this.f5358w = charSequence;
        this.f5360y.setText(charSequence);
        int i6 = this.f5349n;
        if (i6 != 2) {
            this.f5350o = 2;
        }
        S(i6, this.f5350o, P(this.f5360y, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(TextView textView, int i6) {
        if (this.f5344i == null && this.f5346k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f5342g);
            this.f5344i = linearLayout;
            linearLayout.setOrientation(0);
            this.f5343h.addView(this.f5344i, -1, -2);
            this.f5346k = new FrameLayout(this.f5342g);
            this.f5344i.addView(this.f5346k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f5343h.getEditText() != null) {
                f();
            }
        }
        if (z(i6)) {
            this.f5346k.setVisibility(0);
            this.f5346k.addView(textView);
        } else {
            this.f5344i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5344i.setVisibility(0);
        this.f5345j++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f5343h.getEditText();
            boolean g6 = z2.c.g(this.f5342g);
            b1.E0(this.f5344i, v(g6, m2.c.f7596r, b1.J(editText)), v(g6, m2.c.f7597s, this.f5342g.getResources().getDimensionPixelSize(m2.c.f7595q)), v(g6, m2.c.f7596r, b1.I(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f5347l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return y(this.f5350o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f5355t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f5354s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f5351p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.f5353r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList r() {
        TextView textView = this.f5353r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence s() {
        return this.f5358w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View t() {
        return this.f5360y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        TextView textView = this.f5360y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.f5351p = null;
        h();
        if (this.f5349n == 1) {
            this.f5350o = (!this.f5359x || TextUtils.isEmpty(this.f5358w)) ? 0 : 2;
        }
        S(this.f5349n, this.f5350o, P(this.f5353r, ""));
    }

    void x() {
        h();
        int i6 = this.f5349n;
        if (i6 == 2) {
            this.f5350o = 0;
        }
        S(i6, this.f5350o, P(this.f5360y, ""));
    }

    boolean z(int i6) {
        return i6 == 0 || i6 == 1;
    }
}
