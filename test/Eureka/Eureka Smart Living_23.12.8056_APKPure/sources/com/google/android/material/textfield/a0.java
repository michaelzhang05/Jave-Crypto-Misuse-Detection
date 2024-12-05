package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c3;
import androidx.appcompat.widget.k1;
import androidx.core.view.b1;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f5253a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f5254b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f5255c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f5256d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f5257e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f5258f;

    /* renamed from: g, reason: collision with root package name */
    private int f5259g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView.ScaleType f5260h;

    /* renamed from: i, reason: collision with root package name */
    private View.OnLongClickListener f5261i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5262j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(TextInputLayout textInputLayout, c3 c3Var) {
        super(textInputLayout.getContext());
        this.f5253a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(m2.g.f7645d, (ViewGroup) this, false);
        this.f5256d = checkableImageButton;
        u.e(checkableImageButton);
        k1 k1Var = new k1(getContext());
        this.f5254b = k1Var;
        i(c3Var);
        h(c3Var);
        addView(checkableImageButton);
        addView(k1Var);
    }

    private void B() {
        int i6 = (this.f5255c == null || this.f5262j) ? 8 : 0;
        setVisibility(this.f5256d.getVisibility() == 0 || i6 == 0 ? 0 : 8);
        this.f5254b.setVisibility(i6);
        this.f5253a.l0();
    }

    private void h(c3 c3Var) {
        this.f5254b.setVisibility(8);
        this.f5254b.setId(m2.e.P);
        this.f5254b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        b1.s0(this.f5254b, 1);
        n(c3Var.n(m2.j.p6, 0));
        if (c3Var.s(m2.j.q6)) {
            o(c3Var.c(m2.j.q6));
        }
        m(c3Var.p(m2.j.o6));
    }

    private void i(c3 c3Var) {
        if (z2.c.g(getContext())) {
            androidx.core.view.z.c((ViewGroup.MarginLayoutParams) this.f5256d.getLayoutParams(), 0);
        }
        t(null);
        u(null);
        if (c3Var.s(m2.j.w6)) {
            this.f5257e = z2.c.b(getContext(), c3Var, m2.j.w6);
        }
        if (c3Var.s(m2.j.x6)) {
            this.f5258f = com.google.android.material.internal.n.f(c3Var.k(m2.j.x6, -1), null);
        }
        if (c3Var.s(m2.j.t6)) {
            r(c3Var.g(m2.j.t6));
            if (c3Var.s(m2.j.s6)) {
                q(c3Var.p(m2.j.s6));
            }
            p(c3Var.a(m2.j.r6, true));
        }
        s(c3Var.f(m2.j.u6, getResources().getDimensionPixelSize(m2.c.J)));
        if (c3Var.s(m2.j.v6)) {
            v(u.b(c3Var.k(m2.j.v6, -1)));
        }
    }

    void A() {
        EditText editText = this.f5253a.f5201d;
        if (editText == null) {
            return;
        }
        b1.E0(this.f5254b, j() ? 0 : b1.J(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(m2.c.f7598t), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence a() {
        return this.f5255c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f5254b.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextView c() {
        return this.f5254b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence d() {
        return this.f5256d.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable e() {
        return this.f5256d.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f5259g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageView.ScaleType g() {
        return this.f5260h;
    }

    boolean j() {
        return this.f5256d.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(boolean z5) {
        this.f5262j = z5;
        B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        u.d(this.f5253a, this.f5256d, this.f5257e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(CharSequence charSequence) {
        this.f5255c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f5254b.setText(charSequence);
        B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i6) {
        androidx.core.widget.s.n(this.f5254b, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        this.f5254b.setTextColor(colorStateList);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(boolean z5) {
        this.f5256d.setCheckable(z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f5256d.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Drawable drawable) {
        this.f5256d.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f5253a, this.f5256d, this.f5257e, this.f5258f);
            y(true);
            l();
        } else {
            y(false);
            t(null);
            u(null);
            q(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i6 != this.f5259g) {
            this.f5259g = i6;
            u.g(this.f5256d, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(View.OnClickListener onClickListener) {
        u.h(this.f5256d, onClickListener, this.f5261i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(View.OnLongClickListener onLongClickListener) {
        this.f5261i = onLongClickListener;
        u.i(this.f5256d, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ImageView.ScaleType scaleType) {
        this.f5260h = scaleType;
        u.j(this.f5256d, scaleType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f5257e != colorStateList) {
            this.f5257e = colorStateList;
            u.a(this.f5253a, this.f5256d, colorStateList, this.f5258f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f5258f != mode) {
            this.f5258f = mode;
            u.a(this.f5253a, this.f5256d, this.f5257e, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(boolean z5) {
        if (j() != z5) {
            this.f5256d.setVisibility(z5 ? 0 : 8);
            A();
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(androidx.core.view.accessibility.g0 g0Var) {
        View view;
        if (this.f5254b.getVisibility() == 0) {
            g0Var.j0(this.f5254b);
            view = this.f5254b;
        } else {
            view = this.f5256d;
        }
        g0Var.v0(view);
    }
}
