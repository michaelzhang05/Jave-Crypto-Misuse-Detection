package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.u;
import com.google.android.material.textfield.TextInputLayout;
import e.e.b.b.z.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes2.dex */
public class d extends com.google.android.material.textfield.e {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f16762d;

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f16763e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f16764f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.e f16765g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.f f16766h;

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.g f16767i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16768j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16769k;
    private long l;
    private StateListDrawable m;
    private e.e.b.b.z.g n;
    private AccessibilityManager o;
    private ValueAnimator p;
    private ValueAnimator q;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class a implements TextWatcher {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0197a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f16771f;

            RunnableC0197a(AutoCompleteTextView autoCompleteTextView) {
                this.f16771f = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f16771f.isPopupShowing();
                d.this.C(isPopupShowing);
                d.this.f16768j = isPopupShowing;
            }
        }

        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView x = dVar.x(dVar.a.getEditText());
            x.post(new RunnableC0197a(x));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f16779c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            d.this.C(false);
            d.this.f16768j = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0198d extends TextInputLayout.e {
        C0198d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.a
        public void g(View view, androidx.core.view.d0.c cVar) {
            super.g(view, cVar);
            cVar.Y(Spinner.class.getName());
            if (cVar.K()) {
                cVar.j0(null);
            }
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView x = dVar.x(dVar.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.o.isTouchExplorationEnabled()) {
                d.this.F(x);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class e implements TextInputLayout.f {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView x = d.this.x(textInputLayout.getEditText());
            d.this.D(x);
            d.this.u(x);
            d.this.E(x);
            x.setThreshold(0);
            x.removeTextChangedListener(d.this.f16763e);
            x.addTextChangedListener(d.this.f16763e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f16765g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class f implements TextInputLayout.g {
        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i2 != 3) {
                return;
            }
            autoCompleteTextView.removeTextChangedListener(d.this.f16763e);
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f16764f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.f16762d) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.F((AutoCompleteTextView) d.this.a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    public class h implements View.OnTouchListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f16776f;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f16776f = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.B()) {
                    d.this.f16768j = false;
                }
                d.this.F(this.f16776f);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    public class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.f16768j = true;
            d.this.l = System.currentTimeMillis();
            d.this.C(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    public class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f16779c.setChecked(dVar.f16769k);
            d.this.q.start();
        }
    }

    static {
        f16762d = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f16763e = new a();
        this.f16764f = new c();
        this.f16765g = new C0198d(this.a);
        this.f16766h = new e();
        this.f16767i = new f();
        this.f16768j = false;
        this.f16769k = false;
        this.l = Long.MAX_VALUE;
    }

    private void A() {
        this.q = y(67, 0.0f, 1.0f);
        ValueAnimator y = y(50, 1.0f, 0.0f);
        this.p = y;
        y.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B() {
        long currentTimeMillis = System.currentTimeMillis() - this.l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(boolean z) {
        if (this.f16769k != z) {
            this.f16769k = z;
            this.q.cancel();
            this.p.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(AutoCompleteTextView autoCompleteTextView) {
        if (f16762d) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void E(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f16764f);
        if (f16762d) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (B()) {
            this.f16768j = false;
        }
        if (!this.f16768j) {
            if (f16762d) {
                C(!this.f16769k);
            } else {
                this.f16769k = !this.f16769k;
                this.f16779c.toggle();
            }
            if (this.f16769k) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.f16768j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.a.getBoxBackgroundMode();
        e.e.b.b.z.g boxBackground = this.a.getBoxBackground();
        int c2 = e.e.b.b.q.a.c(autoCompleteTextView, e.e.b.b.b.f17430k);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            w(autoCompleteTextView, c2, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            v(autoCompleteTextView, c2, iArr, boxBackground);
        }
    }

    private void v(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, e.e.b.b.z.g gVar) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {e.e.b.b.q.a.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f16762d) {
            u.m0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        e.e.b.b.z.g gVar2 = new e.e.b.b.z.g(gVar.D());
        gVar2.X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int D = u.D(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int C = u.C(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        u.m0(autoCompleteTextView, layerDrawable);
        u.w0(autoCompleteTextView, D, paddingTop, C, paddingBottom);
    }

    private void w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, e.e.b.b.z.g gVar) {
        LayerDrawable layerDrawable;
        int c2 = e.e.b.b.q.a.c(autoCompleteTextView, e.e.b.b.b.o);
        e.e.b.b.z.g gVar2 = new e.e.b.b.z.g(gVar.D());
        int f2 = e.e.b.b.q.a.f(i2, c2, 0.1f);
        gVar2.X(new ColorStateList(iArr, new int[]{f2, 0}));
        if (f16762d) {
            gVar2.setTint(c2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f2, c2});
            e.e.b.b.z.g gVar3 = new e.e.b.b.z.g(gVar.D());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        u.m0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AutoCompleteTextView x(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator y(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(e.e.b.b.m.a.a);
        ofFloat.setDuration(i2);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private e.e.b.b.z.g z(float f2, float f3, float f4, int i2) {
        k m = k.a().z(f2).D(f2).r(f3).v(f3).m();
        e.e.b.b.z.g m2 = e.e.b.b.z.g.m(this.f16778b, f4);
        m2.setShapeAppearanceModel(m);
        m2.Z(0, i2, 0, i2);
        return m2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = this.f16778b.getResources().getDimensionPixelOffset(e.e.b.b.d.D);
        float dimensionPixelOffset2 = this.f16778b.getResources().getDimensionPixelOffset(e.e.b.b.d.A);
        int dimensionPixelOffset3 = this.f16778b.getResources().getDimensionPixelOffset(e.e.b.b.d.B);
        e.e.b.b.z.g z = z(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        e.e.b.b.z.g z2 = z(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.n = z;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.m = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, z);
        this.m.addState(new int[0], z2);
        this.a.setEndIconDrawable(c.a.k.a.a.d(this.f16778b, f16762d ? e.e.b.b.e.f17451c : e.e.b.b.e.f17452d));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(e.e.b.b.j.f17480f));
        this.a.setEndIconOnClickListener(new g());
        this.a.addOnEditTextAttachedListener(this.f16766h);
        this.a.addOnEndIconChangedListener(this.f16767i);
        A();
        u.t0(this.f16779c, 2);
        this.o = (AccessibilityManager) this.f16778b.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean b(int i2) {
        return i2 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean d() {
        return true;
    }
}
