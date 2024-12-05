package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.c;
import androidx.core.view.b1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q extends t {

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f5286s = true;

    /* renamed from: e, reason: collision with root package name */
    private final int f5287e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5288f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f5289g;

    /* renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f5290h;

    /* renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f5291i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f5292j;

    /* renamed from: k, reason: collision with root package name */
    private final c.b f5293k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5294l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5295m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5296n;

    /* renamed from: o, reason: collision with root package name */
    private long f5297o;

    /* renamed from: p, reason: collision with root package name */
    private AccessibilityManager f5298p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f5299q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f5300r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f5300r.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(s sVar) {
        super(sVar);
        this.f5291i = new View.OnClickListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.this.J(view);
            }
        };
        this.f5292j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z5) {
                q.this.K(view, z5);
            }
        };
        this.f5293k = new c.b() { // from class: com.google.android.material.textfield.l
            @Override // androidx.core.view.accessibility.c.b
            public final void onTouchExplorationStateChanged(boolean z5) {
                q.this.L(z5);
            }
        };
        this.f5297o = Long.MAX_VALUE;
        this.f5288f = x2.a.f(sVar.getContext(), m2.a.B, 67);
        this.f5287e = x2.a.f(sVar.getContext(), m2.a.B, 50);
        this.f5289g = x2.a.g(sVar.getContext(), m2.a.F, n2.a.f7961a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i6, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f5289g);
        ofFloat.setDuration(i6);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q.this.I(valueAnimator);
            }
        });
        return ofFloat;
    }

    private void F() {
        this.f5300r = E(this.f5288f, 0.0f, 1.0f);
        ValueAnimator E = E(this.f5287e, 1.0f, 0.0f);
        this.f5299q = E;
        E.addListener(new a());
    }

    private boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5297o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean isPopupShowing = this.f5290h.isPopupShowing();
        O(isPopupShowing);
        this.f5295m = isPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f5335d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z5) {
        this.f5294l = z5;
        r();
        if (z5) {
            return;
        }
        O(false);
        this.f5295m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z5) {
        AutoCompleteTextView autoCompleteTextView = this.f5290h;
        if (autoCompleteTextView == null || r.a(autoCompleteTextView)) {
            return;
        }
        b1.A0(this.f5335d, z5 ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f5295m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z5) {
        if (this.f5296n != z5) {
            this.f5296n = z5;
            this.f5300r.cancel();
            this.f5299q.start();
        }
    }

    private void P() {
        this.f5290h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean M;
                M = q.this.M(view, motionEvent);
                return M;
            }
        });
        if (f5286s) {
            this.f5290h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.p
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    q.this.N();
                }
            });
        }
        this.f5290h.setThreshold(0);
    }

    private void Q() {
        if (this.f5290h == null) {
            return;
        }
        if (G()) {
            this.f5295m = false;
        }
        if (this.f5295m) {
            this.f5295m = false;
            return;
        }
        if (f5286s) {
            O(!this.f5296n);
        } else {
            this.f5296n = !this.f5296n;
            r();
        }
        if (!this.f5296n) {
            this.f5290h.dismissDropDown();
        } else {
            this.f5290h.requestFocus();
            this.f5290h.showDropDown();
        }
    }

    private void R() {
        this.f5295m = true;
        this.f5297o = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.t
    public void a(Editable editable) {
        if (this.f5298p.isTouchExplorationEnabled() && r.a(this.f5290h) && !this.f5335d.hasFocus()) {
            this.f5290h.dismissDropDown();
        }
        this.f5290h.post(new Runnable() { // from class: com.google.android.material.textfield.n
            @Override // java.lang.Runnable
            public final void run() {
                q.this.H();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public int c() {
        return m2.h.f7667g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public int d() {
        return f5286s ? m2.d.f7611g : m2.d.f7612h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public View.OnFocusChangeListener e() {
        return this.f5292j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public View.OnClickListener f() {
        return this.f5291i;
    }

    @Override // com.google.android.material.textfield.t
    public c.b h() {
        return this.f5293k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public boolean i(int i6) {
        return i6 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public boolean k() {
        return this.f5294l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public boolean l() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public boolean m() {
        return this.f5296n;
    }

    @Override // com.google.android.material.textfield.t
    public void n(EditText editText) {
        this.f5290h = D(editText);
        P();
        this.f5332a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f5298p.isTouchExplorationEnabled()) {
            b1.A0(this.f5335d, 2);
        }
        this.f5332a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.t
    public void o(View view, androidx.core.view.accessibility.g0 g0Var) {
        if (!r.a(this.f5290h)) {
            g0Var.X(Spinner.class.getName());
        }
        if (g0Var.K()) {
            g0Var.i0(null);
        }
    }

    @Override // com.google.android.material.textfield.t
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f5298p.isEnabled() && !r.a(this.f5290h)) {
            Q();
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void s() {
        F();
        this.f5298p = (AccessibilityManager) this.f5334c.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public boolean t() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.t
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f5290h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f5286s) {
                this.f5290h.setOnDismissListener(null);
            }
        }
    }
}
