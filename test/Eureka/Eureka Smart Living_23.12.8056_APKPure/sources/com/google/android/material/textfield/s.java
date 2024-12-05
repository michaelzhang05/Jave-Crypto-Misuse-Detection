package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c3;
import androidx.appcompat.widget.k1;
import androidx.core.view.accessibility.c;
import androidx.core.view.b1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f5302a;

    /* renamed from: b, reason: collision with root package name */
    private final FrameLayout f5303b;

    /* renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f5304c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f5305d;

    /* renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f5306e;

    /* renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f5307f;

    /* renamed from: g, reason: collision with root package name */
    private final CheckableImageButton f5308g;

    /* renamed from: h, reason: collision with root package name */
    private final d f5309h;

    /* renamed from: i, reason: collision with root package name */
    private int f5310i;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashSet f5311j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f5312k;

    /* renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f5313l;

    /* renamed from: m, reason: collision with root package name */
    private int f5314m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView.ScaleType f5315n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f5316o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f5317p;

    /* renamed from: q, reason: collision with root package name */
    private final TextView f5318q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f5319r;

    /* renamed from: s, reason: collision with root package name */
    private EditText f5320s;

    /* renamed from: t, reason: collision with root package name */
    private final AccessibilityManager f5321t;

    /* renamed from: u, reason: collision with root package name */
    private c.b f5322u;

    /* renamed from: v, reason: collision with root package name */
    private final TextWatcher f5323v;

    /* renamed from: w, reason: collision with root package name */
    private final TextInputLayout.g f5324w;

    /* loaded from: classes.dex */
    class a extends com.google.android.material.internal.k {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            s.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.k, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            s.this.m().b(charSequence, i6, i7, i8);
        }
    }

    /* loaded from: classes.dex */
    class b implements TextInputLayout.g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (s.this.f5320s == textInputLayout.getEditText()) {
                return;
            }
            if (s.this.f5320s != null) {
                s.this.f5320s.removeTextChangedListener(s.this.f5323v);
                if (s.this.f5320s.getOnFocusChangeListener() == s.this.m().e()) {
                    s.this.f5320s.setOnFocusChangeListener(null);
                }
            }
            s.this.f5320s = textInputLayout.getEditText();
            if (s.this.f5320s != null) {
                s.this.f5320s.addTextChangedListener(s.this.f5323v);
            }
            s.this.m().n(s.this.f5320s);
            s sVar = s.this;
            sVar.g0(sVar.m());
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            s.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            s.this.L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f5328a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        private final s f5329b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5330c;

        /* renamed from: d, reason: collision with root package name */
        private final int f5331d;

        d(s sVar, c3 c3Var) {
            this.f5329b = sVar;
            this.f5330c = c3Var.n(m2.j.J5, 0);
            this.f5331d = c3Var.n(m2.j.h6, 0);
        }

        private t b(int i6) {
            if (i6 == -1) {
                return new g(this.f5329b);
            }
            if (i6 == 0) {
                return new x(this.f5329b);
            }
            if (i6 == 1) {
                return new z(this.f5329b, this.f5331d);
            }
            if (i6 == 2) {
                return new f(this.f5329b);
            }
            if (i6 == 3) {
                return new q(this.f5329b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i6);
        }

        t c(int i6) {
            t tVar = (t) this.f5328a.get(i6);
            if (tVar != null) {
                return tVar;
            }
            t b6 = b(i6);
            this.f5328a.append(i6, b6);
            return b6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(TextInputLayout textInputLayout, c3 c3Var) {
        super(textInputLayout.getContext());
        this.f5310i = 0;
        this.f5311j = new LinkedHashSet();
        this.f5323v = new a();
        b bVar = new b();
        this.f5324w = bVar;
        this.f5321t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f5302a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f5303b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i6 = i(this, from, m2.e.K);
        this.f5304c = i6;
        CheckableImageButton i7 = i(frameLayout, from, m2.e.J);
        this.f5308g = i7;
        this.f5309h = new d(this, c3Var);
        k1 k1Var = new k1(getContext());
        this.f5318q = k1Var;
        B(c3Var);
        A(c3Var);
        C(c3Var);
        frameLayout.addView(i7);
        addView(k1Var);
        addView(frameLayout);
        addView(i6);
        textInputLayout.h(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void A(c3 c3Var) {
        if (!c3Var.s(m2.j.i6)) {
            if (c3Var.s(m2.j.N5)) {
                this.f5312k = z2.c.b(getContext(), c3Var, m2.j.N5);
            }
            if (c3Var.s(m2.j.O5)) {
                this.f5313l = com.google.android.material.internal.n.f(c3Var.k(m2.j.O5, -1), null);
            }
        }
        if (c3Var.s(m2.j.L5)) {
            T(c3Var.k(m2.j.L5, 0));
            if (c3Var.s(m2.j.I5)) {
                P(c3Var.p(m2.j.I5));
            }
            N(c3Var.a(m2.j.H5, true));
        } else if (c3Var.s(m2.j.i6)) {
            if (c3Var.s(m2.j.j6)) {
                this.f5312k = z2.c.b(getContext(), c3Var, m2.j.j6);
            }
            if (c3Var.s(m2.j.k6)) {
                this.f5313l = com.google.android.material.internal.n.f(c3Var.k(m2.j.k6, -1), null);
            }
            T(c3Var.a(m2.j.i6, false) ? 1 : 0);
            P(c3Var.p(m2.j.g6));
        }
        S(c3Var.f(m2.j.K5, getResources().getDimensionPixelSize(m2.c.J)));
        if (c3Var.s(m2.j.M5)) {
            W(u.b(c3Var.k(m2.j.M5, -1)));
        }
    }

    private void B(c3 c3Var) {
        if (c3Var.s(m2.j.T5)) {
            this.f5305d = z2.c.b(getContext(), c3Var, m2.j.T5);
        }
        if (c3Var.s(m2.j.U5)) {
            this.f5306e = com.google.android.material.internal.n.f(c3Var.k(m2.j.U5, -1), null);
        }
        if (c3Var.s(m2.j.S5)) {
            b0(c3Var.g(m2.j.S5));
        }
        this.f5304c.setContentDescription(getResources().getText(m2.h.f7666f));
        b1.A0(this.f5304c, 2);
        this.f5304c.setClickable(false);
        this.f5304c.setPressable(false);
        this.f5304c.setFocusable(false);
    }

    private void C(c3 c3Var) {
        this.f5318q.setVisibility(8);
        this.f5318q.setId(m2.e.Q);
        this.f5318q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        b1.s0(this.f5318q, 1);
        p0(c3Var.n(m2.j.z6, 0));
        if (c3Var.s(m2.j.A6)) {
            q0(c3Var.c(m2.j.A6));
        }
        o0(c3Var.p(m2.j.y6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        AccessibilityManager accessibilityManager;
        c.b bVar = this.f5322u;
        if (bVar == null || (accessibilityManager = this.f5321t) == null) {
            return;
        }
        androidx.core.view.accessibility.c.b(accessibilityManager, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f5322u == null || this.f5321t == null || !b1.T(this)) {
            return;
        }
        androidx.core.view.accessibility.c.a(this.f5321t, this.f5322u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(t tVar) {
        if (this.f5320s == null) {
            return;
        }
        if (tVar.e() != null) {
            this.f5320s.setOnFocusChangeListener(tVar.e());
        }
        if (tVar.g() != null) {
            this.f5308g.setOnFocusChangeListener(tVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i6) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(m2.g.f7644c, viewGroup, false);
        checkableImageButton.setId(i6);
        u.e(checkableImageButton);
        if (z2.c.g(getContext())) {
            androidx.core.view.z.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i6) {
        Iterator it = this.f5311j.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.f0.a(it.next());
            throw null;
        }
    }

    private void r0(t tVar) {
        tVar.s();
        this.f5322u = tVar.h();
        g();
    }

    private void s0(t tVar) {
        L();
        this.f5322u = null;
        tVar.u();
    }

    private int t(t tVar) {
        int i6 = this.f5309h.f5330c;
        return i6 == 0 ? tVar.d() : i6;
    }

    private void t0(boolean z5) {
        if (!z5 || n() == null) {
            u.a(this.f5302a, this.f5308g, this.f5312k, this.f5313l);
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(n()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.f5302a.getErrorCurrentTextColors());
        this.f5308g.setImageDrawable(mutate);
    }

    private void u0() {
        this.f5303b.setVisibility((this.f5308g.getVisibility() != 0 || F()) ? 8 : 0);
        setVisibility(E() || F() || ((this.f5317p == null || this.f5319r) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    private void v0() {
        this.f5304c.setVisibility(s() != null && this.f5302a.M() && this.f5302a.a0() ? 0 : 8);
        u0();
        w0();
        if (z()) {
            return;
        }
        this.f5302a.l0();
    }

    private void x0() {
        int visibility = this.f5318q.getVisibility();
        int i6 = (this.f5317p == null || this.f5319r) ? 8 : 0;
        if (visibility != i6) {
            m().q(i6 == 0);
        }
        u0();
        this.f5318q.setVisibility(i6);
        this.f5302a.l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        return z() && this.f5308g.isChecked();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E() {
        return this.f5303b.getVisibility() == 0 && this.f5308g.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F() {
        return this.f5304c.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(boolean z5) {
        this.f5319r = z5;
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        v0();
        J();
        I();
        if (m().t()) {
            t0(this.f5302a.a0());
        }
    }

    void I() {
        u.d(this.f5302a, this.f5308g, this.f5312k);
    }

    void J() {
        u.d(this.f5302a, this.f5304c, this.f5305d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(boolean z5) {
        boolean z6;
        boolean isActivated;
        boolean isChecked;
        t m6 = m();
        boolean z7 = true;
        if (!m6.l() || (isChecked = this.f5308g.isChecked()) == m6.m()) {
            z6 = false;
        } else {
            this.f5308g.setChecked(!isChecked);
            z6 = true;
        }
        if (!m6.j() || (isActivated = this.f5308g.isActivated()) == m6.k()) {
            z7 = z6;
        } else {
            M(!isActivated);
        }
        if (z5 || z7) {
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(boolean z5) {
        this.f5308g.setActivated(z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(boolean z5) {
        this.f5308g.setCheckable(z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i6) {
        P(i6 != 0 ? getResources().getText(i6) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f5308g.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(int i6) {
        R(i6 != 0 ? e.a.b(getContext(), i6) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(Drawable drawable) {
        this.f5308g.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f5302a, this.f5308g, this.f5312k, this.f5313l);
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i6 != this.f5314m) {
            this.f5314m = i6;
            u.g(this.f5308g, i6);
            u.g(this.f5304c, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i6) {
        if (this.f5310i == i6) {
            return;
        }
        s0(m());
        int i7 = this.f5310i;
        this.f5310i = i6;
        j(i7);
        Z(i6 != 0);
        t m6 = m();
        Q(t(m6));
        O(m6.c());
        N(m6.l());
        if (!m6.i(this.f5302a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f5302a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i6);
        }
        r0(m6);
        U(m6.f());
        EditText editText = this.f5320s;
        if (editText != null) {
            m6.n(editText);
            g0(m6);
        }
        u.a(this.f5302a, this.f5308g, this.f5312k, this.f5313l);
        K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(View.OnClickListener onClickListener) {
        u.h(this.f5308g, onClickListener, this.f5316o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(View.OnLongClickListener onLongClickListener) {
        this.f5316o = onLongClickListener;
        u.i(this.f5308g, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(ImageView.ScaleType scaleType) {
        this.f5315n = scaleType;
        u.j(this.f5308g, scaleType);
        u.j(this.f5304c, scaleType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(ColorStateList colorStateList) {
        if (this.f5312k != colorStateList) {
            this.f5312k = colorStateList;
            u.a(this.f5302a, this.f5308g, colorStateList, this.f5313l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(PorterDuff.Mode mode) {
        if (this.f5313l != mode) {
            this.f5313l = mode;
            u.a(this.f5302a, this.f5308g, this.f5312k, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(boolean z5) {
        if (E() != z5) {
            this.f5308g.setVisibility(z5 ? 0 : 8);
            u0();
            w0();
            this.f5302a.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(int i6) {
        b0(i6 != 0 ? e.a.b(getContext(), i6) : null);
        J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(Drawable drawable) {
        this.f5304c.setImageDrawable(drawable);
        v0();
        u.a(this.f5302a, this.f5304c, this.f5305d, this.f5306e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(View.OnClickListener onClickListener) {
        u.h(this.f5304c, onClickListener, this.f5307f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(View.OnLongClickListener onLongClickListener) {
        this.f5307f = onLongClickListener;
        u.i(this.f5304c, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(ColorStateList colorStateList) {
        if (this.f5305d != colorStateList) {
            this.f5305d = colorStateList;
            u.a(this.f5302a, this.f5304c, colorStateList, this.f5306e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(PorterDuff.Mode mode) {
        if (this.f5306e != mode) {
            this.f5306e = mode;
            u.a(this.f5302a, this.f5304c, this.f5305d, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.f5308g.performClick();
        this.f5308g.jumpDrawablesToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0(int i6) {
        i0(i6 != 0 ? getResources().getText(i6) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i0(CharSequence charSequence) {
        this.f5308g.setContentDescription(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0(int i6) {
        k0(i6 != 0 ? e.a.b(getContext(), i6) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton k() {
        if (F()) {
            return this.f5304c;
        }
        if (z() && E()) {
            return this.f5308g;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k0(Drawable drawable) {
        this.f5308g.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence l() {
        return this.f5308g.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l0(boolean z5) {
        if (z5 && this.f5310i != 1) {
            T(1);
        } else {
            if (z5) {
                return;
            }
            T(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t m() {
        return this.f5309h.c(this.f5310i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m0(ColorStateList colorStateList) {
        this.f5312k = colorStateList;
        u.a(this.f5302a, this.f5308g, colorStateList, this.f5313l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable n() {
        return this.f5308g.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n0(PorterDuff.Mode mode) {
        this.f5313l = mode;
        u.a(this.f5302a, this.f5308g, this.f5312k, mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f5314m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o0(CharSequence charSequence) {
        this.f5317p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f5318q.setText(charSequence);
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f5310i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p0(int i6) {
        androidx.core.widget.s.n(this.f5318q, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageView.ScaleType q() {
        return this.f5315n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0(ColorStateList colorStateList) {
        this.f5318q.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton r() {
        return this.f5308g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable s() {
        return this.f5304c.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence u() {
        return this.f5308g.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable v() {
        return this.f5308g.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence w() {
        return this.f5317p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w0() {
        if (this.f5302a.f5201d == null) {
            return;
        }
        b1.E0(this.f5318q, getContext().getResources().getDimensionPixelSize(m2.c.f7598t), this.f5302a.f5201d.getPaddingTop(), (E() || F()) ? 0 : b1.I(this.f5302a.f5201d), this.f5302a.f5201d.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f5318q.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextView y() {
        return this.f5318q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.f5310i != 0;
    }
}
