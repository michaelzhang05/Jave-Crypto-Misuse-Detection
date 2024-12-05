package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.k1;
import androidx.core.view.b1;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: y0, reason: collision with root package name */
    private static final int f5193y0 = m2.i.f7689f;

    /* renamed from: z0, reason: collision with root package name */
    private static final int[][] f5194z0 = {new int[]{R.attr.state_pressed}, new int[0]};
    private boolean A;
    private CharSequence B;
    private boolean C;
    private c3.g D;
    private c3.g E;
    private StateListDrawable F;
    private boolean G;
    private c3.g H;
    private c3.g I;
    private c3.k J;
    private boolean K;
    private final int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private final Rect T;
    private final Rect U;
    private final RectF V;
    private Typeface W;

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f5195a;

    /* renamed from: a0, reason: collision with root package name */
    private Drawable f5196a0;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f5197b;

    /* renamed from: b0, reason: collision with root package name */
    private int f5198b0;

    /* renamed from: c, reason: collision with root package name */
    private final s f5199c;

    /* renamed from: c0, reason: collision with root package name */
    private final LinkedHashSet f5200c0;

    /* renamed from: d, reason: collision with root package name */
    EditText f5201d;

    /* renamed from: d0, reason: collision with root package name */
    private Drawable f5202d0;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f5203e;

    /* renamed from: e0, reason: collision with root package name */
    private int f5204e0;

    /* renamed from: f, reason: collision with root package name */
    private int f5205f;

    /* renamed from: f0, reason: collision with root package name */
    private Drawable f5206f0;

    /* renamed from: g, reason: collision with root package name */
    private int f5207g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f5208g0;

    /* renamed from: h, reason: collision with root package name */
    private int f5209h;

    /* renamed from: h0, reason: collision with root package name */
    private ColorStateList f5210h0;

    /* renamed from: i, reason: collision with root package name */
    private int f5211i;

    /* renamed from: i0, reason: collision with root package name */
    private int f5212i0;

    /* renamed from: j, reason: collision with root package name */
    private final v f5213j;

    /* renamed from: j0, reason: collision with root package name */
    private int f5214j0;

    /* renamed from: k, reason: collision with root package name */
    boolean f5215k;

    /* renamed from: k0, reason: collision with root package name */
    private int f5216k0;

    /* renamed from: l, reason: collision with root package name */
    private int f5217l;

    /* renamed from: l0, reason: collision with root package name */
    private ColorStateList f5218l0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5219m;

    /* renamed from: m0, reason: collision with root package name */
    private int f5220m0;

    /* renamed from: n, reason: collision with root package name */
    private f f5221n;

    /* renamed from: n0, reason: collision with root package name */
    private int f5222n0;

    /* renamed from: o, reason: collision with root package name */
    private TextView f5223o;

    /* renamed from: o0, reason: collision with root package name */
    private int f5224o0;

    /* renamed from: p, reason: collision with root package name */
    private int f5225p;

    /* renamed from: p0, reason: collision with root package name */
    private int f5226p0;

    /* renamed from: q, reason: collision with root package name */
    private int f5227q;

    /* renamed from: q0, reason: collision with root package name */
    private int f5228q0;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f5229r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f5230r0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f5231s;

    /* renamed from: s0, reason: collision with root package name */
    final com.google.android.material.internal.a f5232s0;

    /* renamed from: t, reason: collision with root package name */
    private TextView f5233t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f5234t0;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f5235u;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f5236u0;

    /* renamed from: v, reason: collision with root package name */
    private int f5237v;

    /* renamed from: v0, reason: collision with root package name */
    private ValueAnimator f5238v0;

    /* renamed from: w, reason: collision with root package name */
    private m0.d f5239w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f5240w0;

    /* renamed from: x, reason: collision with root package name */
    private m0.d f5241x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f5242x0;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f5243y;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f5244z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.q0(!r0.f5242x0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f5215k) {
                textInputLayout.h0(editable);
            }
            if (TextInputLayout.this.f5231s) {
                TextInputLayout.this.u0(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f5199c.h();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f5201d.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f5232s0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f5249d;

        public e(TextInputLayout textInputLayout) {
            this.f5249d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
        
            if (r3 != null) goto L26;
         */
        @Override // androidx.core.view.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void g(android.view.View r14, androidx.core.view.accessibility.g0 r15) {
            /*
                r13 = this;
                super.g(r14, r15)
                com.google.android.material.textfield.TextInputLayout r0 = r13.f5249d
                android.widget.EditText r0 = r0.getEditText()
                if (r0 == 0) goto L10
                android.text.Editable r0 = r0.getText()
                goto L11
            L10:
                r0 = 0
            L11:
                com.google.android.material.textfield.TextInputLayout r1 = r13.f5249d
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.f5249d
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.f5249d
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.f5249d
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.f5249d
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                r6 = r6 ^ r7
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r8 = r8 ^ r7
                com.google.android.material.textfield.TextInputLayout r9 = r13.f5249d
                boolean r9 = r9.O()
                r9 = r9 ^ r7
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                r10 = r10 ^ r7
                if (r10 != 0) goto L51
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L4f
                goto L51
            L4f:
                r11 = 0
                goto L52
            L51:
                r11 = 1
            L52:
                if (r8 == 0) goto L59
                java.lang.String r1 = r1.toString()
                goto L5b
            L59:
                java.lang.String r1 = ""
            L5b:
                com.google.android.material.textfield.TextInputLayout r8 = r13.f5249d
                com.google.android.material.textfield.a0 r8 = com.google.android.material.textfield.TextInputLayout.f(r8)
                r8.z(r15)
                java.lang.String r8 = ", "
                if (r6 == 0) goto L6c
                r15.u0(r0)
                goto L91
            L6c:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L8c
                r15.u0(r1)
                if (r9 == 0) goto L91
                if (r3 == 0) goto L91
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r1)
                r9.append(r8)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                goto L8e
            L8c:
                if (r3 == 0) goto L91
            L8e:
                r15.u0(r3)
            L91:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto Lbd
                int r3 = android.os.Build.VERSION.SDK_INT
                r9 = 26
                if (r3 < r9) goto La1
                r15.i0(r1)
                goto Lb8
            La1:
                if (r6 == 0) goto Lb5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r8)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            Lb5:
                r15.u0(r1)
            Lb8:
                r1 = r6 ^ 1
                r15.r0(r1)
            Lbd:
                if (r0 == 0) goto Lc6
                int r0 = r0.length()
                if (r0 != r4) goto Lc6
                goto Lc7
            Lc6:
                r4 = -1
            Lc7:
                r15.k0(r4)
                if (r11 == 0) goto Ld3
                if (r10 == 0) goto Lcf
                goto Ld0
            Lcf:
                r2 = r5
            Ld0:
                r15.e0(r2)
            Ld3:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f5249d
                com.google.android.material.textfield.v r0 = com.google.android.material.textfield.TextInputLayout.g(r0)
                android.view.View r0 = r0.t()
                if (r0 == 0) goto Le2
                r15.j0(r0)
            Le2:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f5249d
                com.google.android.material.textfield.s r0 = com.google.android.material.textfield.TextInputLayout.e(r0)
                com.google.android.material.textfield.t r0 = r0.m()
                r0.o(r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.g(android.view.View, androidx.core.view.accessibility.g0):void");
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f5249d.f5199c.m().p(view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        int a(Editable editable);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends x.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        CharSequence f5250c;

        /* renamed from: d, reason: collision with root package name */
        boolean f5251d;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i6) {
                return new h[i6];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5250c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5251d = parcel.readInt() == 1;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f5250c) + "}";
        }

        @Override // x.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            TextUtils.writeToParcel(this.f5250c, parcel, i6);
            parcel.writeInt(this.f5251d ? 1 : 0);
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.M);
    }

    private boolean A() {
        return this.A && !TextUtils.isEmpty(this.B) && (this.D instanceof com.google.android.material.textfield.h);
    }

    private void B() {
        Iterator it = this.f5200c0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
    }

    private void C(Canvas canvas) {
        c3.g gVar;
        if (this.I == null || (gVar = this.H) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f5201d.isFocused()) {
            Rect bounds = this.I.getBounds();
            Rect bounds2 = this.H.getBounds();
            float x5 = this.f5232s0.x();
            int centerX = bounds2.centerX();
            bounds.left = n2.a.c(centerX, bounds2.left, x5);
            bounds.right = n2.a.c(centerX, bounds2.right, x5);
            this.I.draw(canvas);
        }
    }

    private void D(Canvas canvas) {
        if (this.A) {
            this.f5232s0.l(canvas);
        }
    }

    private void E(boolean z5) {
        ValueAnimator valueAnimator = this.f5238v0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5238v0.cancel();
        }
        if (z5 && this.f5236u0) {
            k(0.0f);
        } else {
            this.f5232s0.c0(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.h) this.D).d0()) {
            x();
        }
        this.f5230r0 = true;
        K();
        this.f5197b.k(true);
        this.f5199c.G(true);
    }

    private c3.g F(boolean z5) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(m2.c.K);
        float f6 = z5 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f5201d;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(m2.c.f7584f);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(m2.c.I);
        c3.k m6 = c3.k.a().A(f6).E(f6).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        c3.g m7 = c3.g.m(getContext(), popupElevation);
        m7.setShapeAppearanceModel(m6);
        m7.T(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m7;
    }

    private static Drawable G(c3.g gVar, int i6, int i7, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{r2.a.j(i7, i6, 0.1f), i6}), gVar, gVar);
    }

    private int H(int i6, boolean z5) {
        int compoundPaddingLeft = i6 + this.f5201d.getCompoundPaddingLeft();
        return (getPrefixText() == null || z5) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int I(int i6, boolean z5) {
        int compoundPaddingRight = i6 - this.f5201d.getCompoundPaddingRight();
        return (getPrefixText() == null || !z5) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private static Drawable J(Context context, c3.g gVar, int i6, int[][] iArr) {
        int c6 = r2.a.c(context, m2.a.f7558l, "TextInputLayout");
        c3.g gVar2 = new c3.g(gVar.z());
        int j6 = r2.a.j(i6, c6, 0.1f);
        gVar2.R(new ColorStateList(iArr, new int[]{j6, 0}));
        gVar2.setTint(c6);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{j6, c6});
        c3.g gVar3 = new c3.g(gVar.z());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void K() {
        TextView textView = this.f5233t;
        if (textView == null || !this.f5231s) {
            return;
        }
        textView.setText((CharSequence) null);
        m0.n.a(this.f5195a, this.f5241x);
        this.f5233t.setVisibility(4);
    }

    private boolean Q() {
        return this.M == 1 && this.f5201d.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int R(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private void S() {
        o();
        n0();
        w0();
        e0();
        j();
        if (this.M != 0) {
            p0();
        }
        Y();
    }

    private void T() {
        if (A()) {
            RectF rectF = this.V;
            this.f5232s0.o(rectF, this.f5201d.getWidth(), this.f5201d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            n(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.O);
            ((com.google.android.material.textfield.h) this.D).g0(rectF);
        }
    }

    private void U() {
        if (!A() || this.f5230r0) {
            return;
        }
        x();
        T();
    }

    private static void V(ViewGroup viewGroup, boolean z5) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            childAt.setEnabled(z5);
            if (childAt instanceof ViewGroup) {
                V((ViewGroup) childAt, z5);
            }
        }
    }

    private void X() {
        TextView textView = this.f5233t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Y() {
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText = this.f5201d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i6 = this.M;
                if (i6 == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i6 != 1) {
                    return;
                } else {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    private boolean b0() {
        return (this.f5199c.F() || ((this.f5199c.z() && L()) || this.f5199c.w() != null)) && this.f5199c.getMeasuredWidth() > 0;
    }

    private boolean c0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f5197b.getMeasuredWidth() > 0;
    }

    private void d0() {
        if (this.f5233t == null || !this.f5231s || TextUtils.isEmpty(this.f5229r)) {
            return;
        }
        this.f5233t.setText(this.f5229r);
        m0.n.a(this.f5195a, this.f5239w);
        this.f5233t.setVisibility(0);
        this.f5233t.bringToFront();
        announceForAccessibility(this.f5229r);
    }

    private void e0() {
        Resources resources;
        int i6;
        if (this.M == 1) {
            if (z2.c.h(getContext())) {
                resources = getResources();
                i6 = m2.c.f7594p;
            } else {
                if (!z2.c.g(getContext())) {
                    return;
                }
                resources = getResources();
                i6 = m2.c.f7593o;
            }
            this.N = resources.getDimensionPixelSize(i6);
        }
    }

    private void f0(Rect rect) {
        c3.g gVar = this.H;
        if (gVar != null) {
            int i6 = rect.bottom;
            gVar.setBounds(rect.left, i6 - this.P, rect.right, i6);
        }
        c3.g gVar2 = this.I;
        if (gVar2 != null) {
            int i7 = rect.bottom;
            gVar2.setBounds(rect.left, i7 - this.Q, rect.right, i7);
        }
    }

    private void g0() {
        if (this.f5223o != null) {
            EditText editText = this.f5201d;
            h0(editText == null ? null : editText.getText());
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f5201d;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.D;
        }
        int d6 = r2.a.d(this.f5201d, m2.a.f7553g);
        int i6 = this.M;
        if (i6 == 2) {
            return J(getContext(), this.D, d6, f5194z0);
        }
        if (i6 == 1) {
            return G(this.D, this.S, d6, f5194z0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.F == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.F = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.F.addState(new int[0], F(false));
        }
        return this.F;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.E == null) {
            this.E = F(true);
        }
        return this.E;
    }

    private void i() {
        TextView textView = this.f5233t;
        if (textView != null) {
            this.f5195a.addView(textView);
            this.f5233t.setVisibility(0);
        }
    }

    private static void i0(Context context, TextView textView, int i6, int i7, boolean z5) {
        textView.setContentDescription(context.getString(z5 ? m2.h.f7663c : m2.h.f7662b, Integer.valueOf(i6), Integer.valueOf(i7)));
    }

    private void j() {
        EditText editText;
        int J;
        int dimensionPixelSize;
        int I;
        Resources resources;
        int i6;
        if (this.f5201d == null || this.M != 1) {
            return;
        }
        if (z2.c.h(getContext())) {
            editText = this.f5201d;
            J = b1.J(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(m2.c.f7592n);
            I = b1.I(this.f5201d);
            resources = getResources();
            i6 = m2.c.f7591m;
        } else {
            if (!z2.c.g(getContext())) {
                return;
            }
            editText = this.f5201d;
            J = b1.J(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(m2.c.f7590l);
            I = b1.I(this.f5201d);
            resources = getResources();
            i6 = m2.c.f7589k;
        }
        b1.E0(editText, J, dimensionPixelSize, I, resources.getDimensionPixelSize(i6));
    }

    private void j0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f5223o;
        if (textView != null) {
            Z(textView, this.f5219m ? this.f5225p : this.f5227q);
            if (!this.f5219m && (colorStateList2 = this.f5243y) != null) {
                this.f5223o.setTextColor(colorStateList2);
            }
            if (!this.f5219m || (colorStateList = this.f5244z) == null) {
                return;
            }
            this.f5223o.setTextColor(colorStateList);
        }
    }

    private void k0(boolean z5) {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList g6 = r2.a.g(getContext(), m2.a.f7552f);
        EditText editText = this.f5201d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null || g6 == null) {
                return;
            }
            textCursorDrawable2 = this.f5201d.getTextCursorDrawable();
            if (z5) {
                ColorStateList colorStateList = this.f5218l0;
                if (colorStateList == null) {
                    colorStateList = ColorStateList.valueOf(this.R);
                }
                g6 = colorStateList;
            }
            androidx.core.graphics.drawable.a.o(textCursorDrawable2, g6);
        }
    }

    private void l() {
        c3.g gVar = this.D;
        if (gVar == null) {
            return;
        }
        c3.k z5 = gVar.z();
        c3.k kVar = this.J;
        if (z5 != kVar) {
            this.D.setShapeAppearanceModel(kVar);
        }
        if (v()) {
            this.D.V(this.O, this.R);
        }
        int p6 = p();
        this.S = p6;
        this.D.R(ColorStateList.valueOf(p6));
        m();
        n0();
    }

    private void m() {
        if (this.H == null || this.I == null) {
            return;
        }
        if (w()) {
            this.H.R(ColorStateList.valueOf(this.f5201d.isFocused() ? this.f5212i0 : this.R));
            this.I.R(ColorStateList.valueOf(this.R));
        }
        invalidate();
    }

    private void n(RectF rectF) {
        float f6 = rectF.left;
        int i6 = this.L;
        rectF.left = f6 - i6;
        rectF.right += i6;
    }

    private void o() {
        int i6 = this.M;
        if (i6 == 0) {
            this.D = null;
        } else if (i6 == 1) {
            this.D = new c3.g(this.J);
            this.H = new c3.g();
            this.I = new c3.g();
            return;
        } else {
            if (i6 != 2) {
                throw new IllegalArgumentException(this.M + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.D = (!this.A || (this.D instanceof com.google.android.material.textfield.h)) ? new c3.g(this.J) : com.google.android.material.textfield.h.c0(this.J);
        }
        this.H = null;
        this.I = null;
    }

    private boolean o0() {
        int max;
        if (this.f5201d == null || this.f5201d.getMeasuredHeight() >= (max = Math.max(this.f5199c.getMeasuredHeight(), this.f5197b.getMeasuredHeight()))) {
            return false;
        }
        this.f5201d.setMinimumHeight(max);
        return true;
    }

    private int p() {
        return this.M == 1 ? r2.a.i(r2.a.e(this, m2.a.f7558l, 0), this.S) : this.S;
    }

    private void p0() {
        if (this.M != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5195a.getLayoutParams();
            int u5 = u();
            if (u5 != layoutParams.topMargin) {
                layoutParams.topMargin = u5;
                this.f5195a.requestLayout();
            }
        }
    }

    private Rect q(Rect rect) {
        int i6;
        int i7;
        if (this.f5201d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.U;
        boolean e6 = com.google.android.material.internal.n.e(this);
        rect2.bottom = rect.bottom;
        int i8 = this.M;
        if (i8 == 1) {
            rect2.left = H(rect.left, e6);
            i6 = rect.top + this.N;
        } else {
            if (i8 == 2) {
                rect2.left = rect.left + this.f5201d.getPaddingLeft();
                rect2.top = rect.top - u();
                i7 = rect.right - this.f5201d.getPaddingRight();
                rect2.right = i7;
                return rect2;
            }
            rect2.left = H(rect.left, e6);
            i6 = getPaddingTop();
        }
        rect2.top = i6;
        i7 = I(rect.right, e6);
        rect2.right = i7;
        return rect2;
    }

    private int r(Rect rect, Rect rect2, float f6) {
        return Q() ? (int) (rect2.top + f6) : rect.bottom - this.f5201d.getCompoundPaddingBottom();
    }

    private void r0(boolean z5, boolean z6) {
        ColorStateList colorStateList;
        TextView textView;
        com.google.android.material.internal.a aVar;
        ColorStateList textColors;
        boolean isEnabled = isEnabled();
        EditText editText = this.f5201d;
        boolean z7 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f5201d;
        boolean z8 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f5208g0;
        if (colorStateList2 != null) {
            this.f5232s0.M(colorStateList2);
        }
        if (isEnabled) {
            if (a0()) {
                this.f5232s0.M(this.f5213j.r());
            } else if (this.f5219m && (textView = this.f5223o) != null) {
                aVar = this.f5232s0;
                textColors = textView.getTextColors();
            } else if (z8 && (colorStateList = this.f5210h0) != null) {
                this.f5232s0.R(colorStateList);
            }
            if (z7 && this.f5234t0 && (!isEnabled() || !z8)) {
                if (z6 || !this.f5230r0) {
                    E(z5);
                    return;
                }
                return;
            }
            if (!z6 || this.f5230r0) {
                y(z5);
            }
            return;
        }
        ColorStateList colorStateList3 = this.f5208g0;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f5228q0) : this.f5228q0;
        aVar = this.f5232s0;
        textColors = ColorStateList.valueOf(colorForState);
        aVar.M(textColors);
        if (z7) {
        }
        if (z6) {
        }
        y(z5);
    }

    private int s(Rect rect, float f6) {
        return Q() ? (int) (rect.centerY() - (f6 / 2.0f)) : rect.top + this.f5201d.getCompoundPaddingTop();
    }

    private void s0() {
        EditText editText;
        if (this.f5233t == null || (editText = this.f5201d) == null) {
            return;
        }
        this.f5233t.setGravity(editText.getGravity());
        this.f5233t.setPadding(this.f5201d.getCompoundPaddingLeft(), this.f5201d.getCompoundPaddingTop(), this.f5201d.getCompoundPaddingRight(), this.f5201d.getCompoundPaddingBottom());
    }

    private void setEditText(EditText editText) {
        if (this.f5201d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f5201d = editText;
        int i6 = this.f5205f;
        if (i6 != -1) {
            setMinEms(i6);
        } else {
            setMinWidth(this.f5209h);
        }
        int i7 = this.f5207g;
        if (i7 != -1) {
            setMaxEms(i7);
        } else {
            setMaxWidth(this.f5211i);
        }
        this.G = false;
        S();
        setTextInputAccessibilityDelegate(new e(this));
        this.f5232s0.i0(this.f5201d.getTypeface());
        this.f5232s0.a0(this.f5201d.getTextSize());
        this.f5232s0.X(this.f5201d.getLetterSpacing());
        int gravity = this.f5201d.getGravity();
        this.f5232s0.S((gravity & (-113)) | 48);
        this.f5232s0.Z(gravity);
        this.f5201d.addTextChangedListener(new a());
        if (this.f5208g0 == null) {
            this.f5208g0 = this.f5201d.getHintTextColors();
        }
        if (this.A) {
            if (TextUtils.isEmpty(this.B)) {
                CharSequence hint = this.f5201d.getHint();
                this.f5203e = hint;
                setHint(hint);
                this.f5201d.setHint((CharSequence) null);
            }
            this.C = true;
        }
        if (this.f5223o != null) {
            h0(this.f5201d.getText());
        }
        m0();
        this.f5213j.f();
        this.f5197b.bringToFront();
        this.f5199c.bringToFront();
        B();
        this.f5199c.w0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        r0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.B)) {
            return;
        }
        this.B = charSequence;
        this.f5232s0.g0(charSequence);
        if (this.f5230r0) {
            return;
        }
        T();
    }

    private void setPlaceholderTextEnabled(boolean z5) {
        if (this.f5231s == z5) {
            return;
        }
        if (z5) {
            i();
        } else {
            X();
            this.f5233t = null;
        }
        this.f5231s = z5;
    }

    private Rect t(Rect rect) {
        if (this.f5201d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.U;
        float w5 = this.f5232s0.w();
        rect2.left = rect.left + this.f5201d.getCompoundPaddingLeft();
        rect2.top = s(rect, w5);
        rect2.right = rect.right - this.f5201d.getCompoundPaddingRight();
        rect2.bottom = r(rect, rect2, w5);
        return rect2;
    }

    private void t0() {
        EditText editText = this.f5201d;
        u0(editText == null ? null : editText.getText());
    }

    private int u() {
        float q6;
        if (!this.A) {
            return 0;
        }
        int i6 = this.M;
        if (i6 == 0) {
            q6 = this.f5232s0.q();
        } else {
            if (i6 != 2) {
                return 0;
            }
            q6 = this.f5232s0.q() / 2.0f;
        }
        return (int) q6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(Editable editable) {
        if (this.f5221n.a(editable) != 0 || this.f5230r0) {
            K();
        } else {
            d0();
        }
    }

    private boolean v() {
        return this.M == 2 && w();
    }

    private void v0(boolean z5, boolean z6) {
        int defaultColor = this.f5218l0.getDefaultColor();
        int colorForState = this.f5218l0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f5218l0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z5) {
            this.R = colorForState2;
        } else if (z6) {
            this.R = colorForState;
        } else {
            this.R = defaultColor;
        }
    }

    private boolean w() {
        return this.O > -1 && this.R != 0;
    }

    private void x() {
        if (A()) {
            ((com.google.android.material.textfield.h) this.D).e0();
        }
    }

    private void y(boolean z5) {
        ValueAnimator valueAnimator = this.f5238v0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5238v0.cancel();
        }
        if (z5 && this.f5236u0) {
            k(1.0f);
        } else {
            this.f5232s0.c0(1.0f);
        }
        this.f5230r0 = false;
        if (A()) {
            T();
        }
        t0();
        this.f5197b.k(false);
        this.f5199c.G(false);
    }

    private m0.d z() {
        m0.d dVar = new m0.d();
        dVar.V(x2.a.f(getContext(), m2.a.A, 87));
        dVar.X(x2.a.g(getContext(), m2.a.F, n2.a.f7961a));
        return dVar;
    }

    public boolean L() {
        return this.f5199c.E();
    }

    public boolean M() {
        return this.f5213j.A();
    }

    public boolean N() {
        return this.f5213j.B();
    }

    final boolean O() {
        return this.f5230r0;
    }

    public boolean P() {
        return this.C;
    }

    public void W() {
        this.f5197b.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.s.n(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = m2.i.f7684a
            androidx.core.widget.s.n(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = m2.b.f7573a
            int r4 = androidx.core.content.a.c(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Z(android.widget.TextView, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a0() {
        return this.f5213j.l();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i6, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f5195a.addView(view, layoutParams2);
        this.f5195a.setLayoutParams(layoutParams);
        p0();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i6) {
        ViewStructure newChild;
        EditText editText = this.f5201d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i6);
            return;
        }
        if (this.f5203e != null) {
            boolean z5 = this.C;
            this.C = false;
            CharSequence hint = editText.getHint();
            this.f5201d.setHint(this.f5203e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i6);
                return;
            } finally {
                this.f5201d.setHint(hint);
                this.C = z5;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i6);
        onProvideAutofillVirtualStructure(viewStructure, i6);
        viewStructure.setChildCount(this.f5195a.getChildCount());
        for (int i7 = 0; i7 < this.f5195a.getChildCount(); i7++) {
            View childAt = this.f5195a.getChildAt(i7);
            newChild = viewStructure.newChild(i7);
            childAt.dispatchProvideAutofillStructure(newChild, i6);
            if (childAt == this.f5201d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f5242x0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f5242x0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        D(canvas);
        C(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f5240w0) {
            return;
        }
        this.f5240w0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f5232s0;
        boolean f02 = aVar != null ? aVar.f0(drawableState) | false : false;
        if (this.f5201d != null) {
            q0(b1.U(this) && isEnabled());
        }
        m0();
        w0();
        if (f02) {
            invalidate();
        }
        this.f5240w0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f5201d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + u() : super.getBaseline();
    }

    c3.g getBoxBackground() {
        int i6 = this.M;
        if (i6 == 1 || i6 == 2) {
            return this.D;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.S;
    }

    public int getBoxBackgroundMode() {
        return this.M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (com.google.android.material.internal.n.e(this) ? this.J.j() : this.J.l()).a(this.V);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (com.google.android.material.internal.n.e(this) ? this.J.l() : this.J.j()).a(this.V);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (com.google.android.material.internal.n.e(this) ? this.J.r() : this.J.t()).a(this.V);
    }

    public float getBoxCornerRadiusTopStart() {
        return (com.google.android.material.internal.n.e(this) ? this.J.t() : this.J.r()).a(this.V);
    }

    public int getBoxStrokeColor() {
        return this.f5216k0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f5218l0;
    }

    public int getBoxStrokeWidth() {
        return this.P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.Q;
    }

    public int getCounterMaxLength() {
        return this.f5217l;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f5215k && this.f5219m && (textView = this.f5223o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f5244z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f5243y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f5208g0;
    }

    public EditText getEditText() {
        return this.f5201d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f5199c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f5199c.n();
    }

    public int getEndIconMinSize() {
        return this.f5199c.o();
    }

    public int getEndIconMode() {
        return this.f5199c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f5199c.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f5199c.r();
    }

    public CharSequence getError() {
        if (this.f5213j.A()) {
            return this.f5213j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f5213j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f5213j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f5213j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f5199c.s();
    }

    public CharSequence getHelperText() {
        if (this.f5213j.B()) {
            return this.f5213j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f5213j.u();
    }

    public CharSequence getHint() {
        if (this.A) {
            return this.B;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f5232s0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f5232s0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f5210h0;
    }

    public f getLengthCounter() {
        return this.f5221n;
    }

    public int getMaxEms() {
        return this.f5207g;
    }

    public int getMaxWidth() {
        return this.f5211i;
    }

    public int getMinEms() {
        return this.f5205f;
    }

    public int getMinWidth() {
        return this.f5209h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f5199c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f5199c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f5231s) {
            return this.f5229r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f5237v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f5235u;
    }

    public CharSequence getPrefixText() {
        return this.f5197b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f5197b.b();
    }

    public TextView getPrefixTextView() {
        return this.f5197b.c();
    }

    public c3.k getShapeAppearanceModel() {
        return this.J;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f5197b.d();
    }

    public Drawable getStartIconDrawable() {
        return this.f5197b.e();
    }

    public int getStartIconMinSize() {
        return this.f5197b.f();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f5197b.g();
    }

    public CharSequence getSuffixText() {
        return this.f5199c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f5199c.x();
    }

    public TextView getSuffixTextView() {
        return this.f5199c.y();
    }

    public Typeface getTypeface() {
        return this.W;
    }

    public void h(g gVar) {
        this.f5200c0.add(gVar);
        if (this.f5201d != null) {
            gVar.a(this);
        }
    }

    void h0(Editable editable) {
        int a6 = this.f5221n.a(editable);
        boolean z5 = this.f5219m;
        int i6 = this.f5217l;
        if (i6 == -1) {
            this.f5223o.setText(String.valueOf(a6));
            this.f5223o.setContentDescription(null);
            this.f5219m = false;
        } else {
            this.f5219m = a6 > i6;
            i0(getContext(), this.f5223o, a6, this.f5217l, this.f5219m);
            if (z5 != this.f5219m) {
                j0();
            }
            this.f5223o.setText(androidx.core.text.a.c().j(getContext().getString(m2.h.f7664d, Integer.valueOf(a6), Integer.valueOf(this.f5217l))));
        }
        if (this.f5201d == null || z5 == this.f5219m) {
            return;
        }
        q0(false);
        w0();
        m0();
    }

    void k(float f6) {
        if (this.f5232s0.x() == f6) {
            return;
        }
        if (this.f5238v0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5238v0 = valueAnimator;
            valueAnimator.setInterpolator(x2.a.g(getContext(), m2.a.E, n2.a.f7962b));
            this.f5238v0.setDuration(x2.a.f(getContext(), m2.a.f7572z, 167));
            this.f5238v0.addUpdateListener(new d());
        }
        this.f5238v0.setFloatValues(this.f5232s0.x(), f6);
        this.f5238v0.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l0() {
        boolean z5;
        Drawable drawable;
        EditText editText;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        if (this.f5201d == null) {
            return false;
        }
        boolean z6 = true;
        if (c0()) {
            int measuredWidth = this.f5197b.getMeasuredWidth() - this.f5201d.getPaddingLeft();
            if (this.f5196a0 == null || this.f5198b0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f5196a0 = colorDrawable;
                this.f5198b0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a6 = androidx.core.widget.s.a(this.f5201d);
            Drawable drawable5 = a6[0];
            Drawable drawable6 = this.f5196a0;
            if (drawable5 != drawable6) {
                androidx.core.widget.s.i(this.f5201d, drawable6, a6[1], a6[2], a6[3]);
                z5 = true;
            }
            z5 = false;
        } else {
            if (this.f5196a0 != null) {
                Drawable[] a7 = androidx.core.widget.s.a(this.f5201d);
                androidx.core.widget.s.i(this.f5201d, null, a7[1], a7[2], a7[3]);
                this.f5196a0 = null;
                z5 = true;
            }
            z5 = false;
        }
        if (b0()) {
            int measuredWidth2 = this.f5199c.y().getMeasuredWidth() - this.f5201d.getPaddingRight();
            CheckableImageButton k6 = this.f5199c.k();
            if (k6 != null) {
                measuredWidth2 = measuredWidth2 + k6.getMeasuredWidth() + androidx.core.view.z.b((ViewGroup.MarginLayoutParams) k6.getLayoutParams());
            }
            Drawable[] a8 = androidx.core.widget.s.a(this.f5201d);
            Drawable drawable7 = this.f5202d0;
            if (drawable7 == null || this.f5204e0 == measuredWidth2) {
                if (drawable7 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f5202d0 = colorDrawable2;
                    this.f5204e0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable8 = a8[2];
                drawable = this.f5202d0;
                if (drawable8 != drawable) {
                    this.f5206f0 = drawable8;
                    editText = this.f5201d;
                    drawable2 = a8[0];
                    drawable3 = a8[1];
                    drawable4 = a8[3];
                } else {
                    z6 = z5;
                }
            } else {
                this.f5204e0 = measuredWidth2;
                drawable7.setBounds(0, 0, measuredWidth2, 1);
                editText = this.f5201d;
                drawable2 = a8[0];
                drawable3 = a8[1];
                drawable = this.f5202d0;
                drawable4 = a8[3];
            }
            androidx.core.widget.s.i(editText, drawable2, drawable3, drawable, drawable4);
        } else {
            if (this.f5202d0 == null) {
                return z5;
            }
            Drawable[] a9 = androidx.core.widget.s.a(this.f5201d);
            if (a9[2] == this.f5202d0) {
                androidx.core.widget.s.i(this.f5201d, a9[0], a9[1], this.f5206f0, a9[3]);
            } else {
                z6 = z5;
            }
            this.f5202d0 = null;
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f5201d;
        if (editText == null || this.M != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (c2.a(background)) {
            background = background.mutate();
        }
        if (a0()) {
            currentTextColor = getErrorCurrentTextColors();
        } else {
            if (!this.f5219m || (textView = this.f5223o) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f5201d.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.k.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n0() {
        EditText editText = this.f5201d;
        if (editText == null || this.D == null) {
            return;
        }
        if ((this.G || editText.getBackground() == null) && this.M != 0) {
            b1.u0(this.f5201d, getEditTextBoxBackground());
            this.G = true;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5232s0.H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        EditText editText = this.f5201d;
        if (editText != null) {
            Rect rect = this.T;
            com.google.android.material.internal.b.a(this, editText, rect);
            f0(rect);
            if (this.A) {
                this.f5232s0.a0(this.f5201d.getTextSize());
                int gravity = this.f5201d.getGravity();
                this.f5232s0.S((gravity & (-113)) | 48);
                this.f5232s0.Z(gravity);
                this.f5232s0.O(q(rect));
                this.f5232s0.W(t(rect));
                this.f5232s0.J();
                if (!A() || this.f5230r0) {
                    return;
                }
                T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        boolean o02 = o0();
        boolean l02 = l0();
        if (o02 || l02) {
            this.f5201d.post(new c());
        }
        s0();
        this.f5199c.w0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f5250c);
        if (hVar.f5251d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        boolean z5 = i6 == 1;
        if (z5 != this.K) {
            float a6 = this.J.r().a(this.V);
            float a7 = this.J.t().a(this.V);
            c3.k m6 = c3.k.a().z(this.J.s()).D(this.J.q()).r(this.J.k()).v(this.J.i()).A(a7).E(a6).s(this.J.l().a(this.V)).w(this.J.j().a(this.V)).m();
            this.K = z5;
            setShapeAppearanceModel(m6);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (a0()) {
            hVar.f5250c = getError();
        }
        hVar.f5251d = this.f5199c.D();
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0(boolean z5) {
        r0(z5, false);
    }

    public void setBoxBackgroundColor(int i6) {
        if (this.S != i6) {
            this.S = i6;
            this.f5220m0 = i6;
            this.f5224o0 = i6;
            this.f5226p0 = i6;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i6) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i6));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f5220m0 = defaultColor;
        this.S = defaultColor;
        this.f5222n0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f5224o0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f5226p0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i6) {
        if (i6 == this.M) {
            return;
        }
        this.M = i6;
        if (this.f5201d != null) {
            S();
        }
    }

    public void setBoxCollapsedPaddingTop(int i6) {
        this.N = i6;
    }

    public void setBoxCornerFamily(int i6) {
        this.J = this.J.v().y(i6, this.J.r()).C(i6, this.J.t()).q(i6, this.J.j()).u(i6, this.J.l()).m();
        l();
    }

    public void setBoxStrokeColor(int i6) {
        if (this.f5216k0 != i6) {
            this.f5216k0 = i6;
            w0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f5216k0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            w0();
        } else {
            this.f5212i0 = colorStateList.getDefaultColor();
            this.f5228q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f5214j0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.f5216k0 = defaultColor;
        w0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f5218l0 != colorStateList) {
            this.f5218l0 = colorStateList;
            w0();
        }
    }

    public void setBoxStrokeWidth(int i6) {
        this.P = i6;
        w0();
    }

    public void setBoxStrokeWidthFocused(int i6) {
        this.Q = i6;
        w0();
    }

    public void setBoxStrokeWidthFocusedResource(int i6) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i6));
    }

    public void setBoxStrokeWidthResource(int i6) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i6));
    }

    public void setCounterEnabled(boolean z5) {
        if (this.f5215k != z5) {
            if (z5) {
                k1 k1Var = new k1(getContext());
                this.f5223o = k1Var;
                k1Var.setId(m2.e.L);
                Typeface typeface = this.W;
                if (typeface != null) {
                    this.f5223o.setTypeface(typeface);
                }
                this.f5223o.setMaxLines(1);
                this.f5213j.e(this.f5223o, 2);
                androidx.core.view.z.d((ViewGroup.MarginLayoutParams) this.f5223o.getLayoutParams(), getResources().getDimensionPixelOffset(m2.c.P));
                j0();
                g0();
            } else {
                this.f5213j.C(this.f5223o, 2);
                this.f5223o = null;
            }
            this.f5215k = z5;
        }
    }

    public void setCounterMaxLength(int i6) {
        if (this.f5217l != i6) {
            if (i6 <= 0) {
                i6 = -1;
            }
            this.f5217l = i6;
            if (this.f5215k) {
                g0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i6) {
        if (this.f5225p != i6) {
            this.f5225p = i6;
            j0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f5244z != colorStateList) {
            this.f5244z = colorStateList;
            j0();
        }
    }

    public void setCounterTextAppearance(int i6) {
        if (this.f5227q != i6) {
            this.f5227q = i6;
            j0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f5243y != colorStateList) {
            this.f5243y = colorStateList;
            j0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f5208g0 = colorStateList;
        this.f5210h0 = colorStateList;
        if (this.f5201d != null) {
            q0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        V(this, z5);
        super.setEnabled(z5);
    }

    public void setEndIconActivated(boolean z5) {
        this.f5199c.M(z5);
    }

    public void setEndIconCheckable(boolean z5) {
        this.f5199c.N(z5);
    }

    public void setEndIconContentDescription(int i6) {
        this.f5199c.O(i6);
    }

    public void setEndIconDrawable(int i6) {
        this.f5199c.Q(i6);
    }

    public void setEndIconMinSize(int i6) {
        this.f5199c.S(i6);
    }

    public void setEndIconMode(int i6) {
        this.f5199c.T(i6);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5199c.U(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5199c.V(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f5199c.W(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f5199c.X(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f5199c.Y(mode);
    }

    public void setEndIconVisible(boolean z5) {
        this.f5199c.Z(z5);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f5213j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f5213j.w();
        } else {
            this.f5213j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i6) {
        this.f5213j.E(i6);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f5213j.F(charSequence);
    }

    public void setErrorEnabled(boolean z5) {
        this.f5213j.G(z5);
    }

    public void setErrorIconDrawable(int i6) {
        this.f5199c.a0(i6);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5199c.c0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5199c.d0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f5199c.e0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f5199c.f0(mode);
    }

    public void setErrorTextAppearance(int i6) {
        this.f5213j.H(i6);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f5213j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z5) {
        if (this.f5234t0 != z5) {
            this.f5234t0 = z5;
            q0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (N()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!N()) {
                setHelperTextEnabled(true);
            }
            this.f5213j.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f5213j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z5) {
        this.f5213j.K(z5);
    }

    public void setHelperTextTextAppearance(int i6) {
        this.f5213j.J(i6);
    }

    public void setHint(int i6) {
        setHint(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setHintAnimationEnabled(boolean z5) {
        this.f5236u0 = z5;
    }

    public void setHintEnabled(boolean z5) {
        if (z5 != this.A) {
            this.A = z5;
            if (z5) {
                CharSequence hint = this.f5201d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.B)) {
                        setHint(hint);
                    }
                    this.f5201d.setHint((CharSequence) null);
                }
                this.C = true;
            } else {
                this.C = false;
                if (!TextUtils.isEmpty(this.B) && TextUtils.isEmpty(this.f5201d.getHint())) {
                    this.f5201d.setHint(this.B);
                }
                setHintInternal(null);
            }
            if (this.f5201d != null) {
                p0();
            }
        }
    }

    public void setHintTextAppearance(int i6) {
        this.f5232s0.P(i6);
        this.f5210h0 = this.f5232s0.p();
        if (this.f5201d != null) {
            q0(false);
            p0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f5210h0 != colorStateList) {
            if (this.f5208g0 == null) {
                this.f5232s0.R(colorStateList);
            }
            this.f5210h0 = colorStateList;
            if (this.f5201d != null) {
                q0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f5221n = fVar;
    }

    public void setMaxEms(int i6) {
        this.f5207g = i6;
        EditText editText = this.f5201d;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxEms(i6);
    }

    public void setMaxWidth(int i6) {
        this.f5211i = i6;
        EditText editText = this.f5201d;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxWidth(i6);
    }

    public void setMaxWidthResource(int i6) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setMinEms(int i6) {
        this.f5205f = i6;
        EditText editText = this.f5201d;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinEms(i6);
    }

    public void setMinWidth(int i6) {
        this.f5209h = i6;
        EditText editText = this.f5201d;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinWidth(i6);
    }

    public void setMinWidthResource(int i6) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i6) {
        this.f5199c.h0(i6);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i6) {
        this.f5199c.j0(i6);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z5) {
        this.f5199c.l0(z5);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f5199c.m0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f5199c.n0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f5233t == null) {
            k1 k1Var = new k1(getContext());
            this.f5233t = k1Var;
            k1Var.setId(m2.e.O);
            b1.A0(this.f5233t, 2);
            m0.d z5 = z();
            this.f5239w = z5;
            z5.a0(67L);
            this.f5241x = z();
            setPlaceholderTextAppearance(this.f5237v);
            setPlaceholderTextColor(this.f5235u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f5231s) {
                setPlaceholderTextEnabled(true);
            }
            this.f5229r = charSequence;
        }
        t0();
    }

    public void setPlaceholderTextAppearance(int i6) {
        this.f5237v = i6;
        TextView textView = this.f5233t;
        if (textView != null) {
            androidx.core.widget.s.n(textView, i6);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f5235u != colorStateList) {
            this.f5235u = colorStateList;
            TextView textView = this.f5233t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f5197b.m(charSequence);
    }

    public void setPrefixTextAppearance(int i6) {
        this.f5197b.n(i6);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f5197b.o(colorStateList);
    }

    public void setShapeAppearanceModel(c3.k kVar) {
        c3.g gVar = this.D;
        if (gVar == null || gVar.z() == kVar) {
            return;
        }
        this.J = kVar;
        l();
    }

    public void setStartIconCheckable(boolean z5) {
        this.f5197b.p(z5);
    }

    public void setStartIconContentDescription(int i6) {
        setStartIconContentDescription(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setStartIconDrawable(int i6) {
        setStartIconDrawable(i6 != 0 ? e.a.b(getContext(), i6) : null);
    }

    public void setStartIconMinSize(int i6) {
        this.f5197b.s(i6);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5197b.t(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5197b.u(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f5197b.v(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f5197b.w(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f5197b.x(mode);
    }

    public void setStartIconVisible(boolean z5) {
        this.f5197b.y(z5);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f5199c.o0(charSequence);
    }

    public void setSuffixTextAppearance(int i6) {
        this.f5199c.p0(i6);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f5199c.q0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f5201d;
        if (editText != null) {
            b1.q0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.W) {
            this.W = typeface;
            this.f5232s0.i0(typeface);
            this.f5213j.N(typeface);
            TextView textView = this.f5223o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w0() {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.w0():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f5199c.P(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f5199c.R(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f5199c.b0(drawable);
    }

    public void setHint(CharSequence charSequence) {
        if (this.A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f5199c.i0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f5199c.k0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f5197b.q(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f5197b.r(drawable);
    }
}
