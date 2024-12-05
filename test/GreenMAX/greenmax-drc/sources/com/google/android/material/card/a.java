package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.view.u;
import e.e.b.b.d;
import e.e.b.b.f;
import e.e.b.b.l;
import e.e.b.b.w.c;
import e.e.b.b.x.b;
import e.e.b.b.z.e;
import e.e.b.b.z.g;
import e.e.b.b.z.j;
import e.e.b.b.z.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialCardViewHelper.java */
/* loaded from: classes2.dex */
public class a {
    private static final int[] a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final double f16516b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c, reason: collision with root package name */
    private final MaterialCardView f16517c;

    /* renamed from: e, reason: collision with root package name */
    private final g f16519e;

    /* renamed from: f, reason: collision with root package name */
    private final g f16520f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16521g;

    /* renamed from: h, reason: collision with root package name */
    private final int f16522h;

    /* renamed from: i, reason: collision with root package name */
    private int f16523i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f16524j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f16525k;
    private ColorStateList l;
    private ColorStateList m;
    private k n;
    private ColorStateList o;
    private Drawable p;
    private LayerDrawable q;
    private g r;
    private g s;
    private boolean u;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f16518d = new Rect();
    private boolean t = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCardViewHelper.java */
    /* renamed from: com.google.android.material.card.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0189a extends InsetDrawable {
        C0189a(Drawable drawable, int i2, int i3, int i4, int i5) {
            super(drawable, i2, i3, i4, i5);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i2, int i3) {
        this.f16517c = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i2, i3);
        this.f16519e = gVar;
        gVar.N(materialCardView.getContext());
        gVar.c0(-12303292);
        k.b v = gVar.D().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, l.f0, i2, e.e.b.b.k.a);
        int i4 = l.g0;
        if (obtainStyledAttributes.hasValue(i4)) {
            v.o(obtainStyledAttributes.getDimension(i4, 0.0f));
        }
        this.f16520f = new g();
        N(v.m());
        Resources resources = materialCardView.getResources();
        this.f16521g = resources.getDimensionPixelSize(d.x);
        this.f16522h = resources.getDimensionPixelSize(d.y);
        obtainStyledAttributes.recycle();
    }

    private boolean R() {
        return this.f16517c.getPreventCornerOverlap() && !e();
    }

    private boolean S() {
        return this.f16517c.getPreventCornerOverlap() && e() && this.f16517c.getUseCompatPadding();
    }

    private void W(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.f16517c.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.f16517c.getForeground()).setDrawable(drawable);
        } else {
            this.f16517c.setForeground(z(drawable));
        }
    }

    private void Y() {
        Drawable drawable;
        if (b.a && (drawable = this.p) != null) {
            ((RippleDrawable) drawable).setColor(this.l);
            return;
        }
        g gVar = this.r;
        if (gVar != null) {
            gVar.X(this.l);
        }
    }

    private float a() {
        return Math.max(Math.max(b(this.n.q(), this.f16519e.G()), b(this.n.s(), this.f16519e.H())), Math.max(b(this.n.k(), this.f16519e.t()), b(this.n.i(), this.f16519e.s())));
    }

    private float b(e.e.b.b.z.d dVar, float f2) {
        if (dVar instanceof j) {
            double d2 = 1.0d - f16516b;
            double d3 = f2;
            Double.isNaN(d3);
            return (float) (d2 * d3);
        }
        if (dVar instanceof e) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    private float c() {
        return this.f16517c.getMaxCardElevation() + (S() ? a() : 0.0f);
    }

    private float d() {
        return (this.f16517c.getMaxCardElevation() * 1.5f) + (S() ? a() : 0.0f);
    }

    private boolean e() {
        return Build.VERSION.SDK_INT >= 21 && this.f16519e.Q();
    }

    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f16525k;
        if (drawable != null) {
            stateListDrawable.addState(a, drawable);
        }
        return stateListDrawable;
    }

    private Drawable g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g i2 = i();
        this.r = i2;
        i2.X(this.l);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.r);
        return stateListDrawable;
    }

    private Drawable h() {
        if (b.a) {
            this.s = i();
            return new RippleDrawable(this.l, null, this.s);
        }
        return g();
    }

    private g i() {
        return new g(this.n);
    }

    private Drawable p() {
        if (this.p == null) {
            this.p = h();
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.f16520f, f()});
            this.q = layerDrawable;
            layerDrawable.setId(2, f.r);
        }
        return this.q;
    }

    private float r() {
        if (!this.f16517c.getPreventCornerOverlap()) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 21 && !this.f16517c.getUseCompatPadding()) {
            return 0.0f;
        }
        double d2 = 1.0d - f16516b;
        double cardViewRadius = this.f16517c.getCardViewRadius();
        Double.isNaN(cardViewRadius);
        return (float) (d2 * cardViewRadius);
    }

    private Drawable z(Drawable drawable) {
        int ceil;
        int i2;
        if ((Build.VERSION.SDK_INT < 21) || this.f16517c.getUseCompatPadding()) {
            int ceil2 = (int) Math.ceil(d());
            ceil = (int) Math.ceil(c());
            i2 = ceil2;
        } else {
            ceil = 0;
            i2 = 0;
        }
        return new C0189a(drawable, ceil, i2, ceil, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(TypedArray typedArray) {
        ColorStateList a2 = c.a(this.f16517c.getContext(), typedArray, l.o3);
        this.o = a2;
        if (a2 == null) {
            this.o = ColorStateList.valueOf(-1);
        }
        this.f16523i = typedArray.getDimensionPixelSize(l.p3, 0);
        boolean z = typedArray.getBoolean(l.j3, false);
        this.u = z;
        this.f16517c.setLongClickable(z);
        this.m = c.a(this.f16517c.getContext(), typedArray, l.m3);
        I(c.d(this.f16517c.getContext(), typedArray, l.l3));
        ColorStateList a3 = c.a(this.f16517c.getContext(), typedArray, l.n3);
        this.l = a3;
        if (a3 == null) {
            this.l = ColorStateList.valueOf(e.e.b.b.q.a.c(this.f16517c, e.e.b.b.b.f17430k));
        }
        G(c.a(this.f16517c.getContext(), typedArray, l.k3));
        Y();
        V();
        Z();
        this.f16517c.setBackgroundInternal(z(this.f16519e));
        Drawable p = this.f16517c.isClickable() ? p() : this.f16520f;
        this.f16524j = p;
        this.f16517c.setForeground(z(p));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(int i2, int i3) {
        int i4;
        int i5;
        if (this.q != null) {
            int i6 = this.f16521g;
            int i7 = this.f16522h;
            int i8 = (i2 - i6) - i7;
            int i9 = (i3 - i6) - i7;
            if ((Build.VERSION.SDK_INT < 21) || this.f16517c.getUseCompatPadding()) {
                i9 -= (int) Math.ceil(d() * 2.0f);
                i8 -= (int) Math.ceil(c() * 2.0f);
            }
            int i10 = i9;
            int i11 = this.f16521g;
            if (u.y(this.f16517c) == 1) {
                i5 = i8;
                i4 = i11;
            } else {
                i4 = i8;
                i5 = i11;
            }
            this.q.setLayerInset(2, i4, this.f16521g, i5, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(boolean z) {
        this.t = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(ColorStateList colorStateList) {
        this.f16519e.X(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(ColorStateList colorStateList) {
        g gVar = this.f16520f;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.X(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(boolean z) {
        this.u = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(Drawable drawable) {
        this.f16525k = drawable;
        if (drawable != null) {
            Drawable r = androidx.core.graphics.drawable.a.r(drawable.mutate());
            this.f16525k = r;
            androidx.core.graphics.drawable.a.o(r, this.m);
        }
        if (this.q != null) {
            this.q.setDrawableByLayerId(f.r, f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        this.m = colorStateList;
        Drawable drawable = this.f16525k;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(float f2) {
        N(this.n.w(f2));
        this.f16524j.invalidateSelf();
        if (S() || R()) {
            U();
        }
        if (S()) {
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(float f2) {
        this.f16519e.Y(f2);
        g gVar = this.f16520f;
        if (gVar != null) {
            gVar.Y(f2);
        }
        g gVar2 = this.s;
        if (gVar2 != null) {
            gVar2.Y(f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(ColorStateList colorStateList) {
        this.l = colorStateList;
        Y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(k kVar) {
        this.n = kVar;
        this.f16519e.setShapeAppearanceModel(kVar);
        this.f16519e.b0(!r0.Q());
        g gVar = this.f16520f;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        g gVar2 = this.s;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(int i2) {
        if (i2 == this.f16523i) {
            return;
        }
        this.f16523i = i2;
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(int i2, int i3, int i4, int i5) {
        this.f16518d.set(i2, i3, i4, i5);
        U();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T() {
        Drawable drawable = this.f16524j;
        Drawable p = this.f16517c.isClickable() ? p() : this.f16520f;
        this.f16524j = p;
        if (drawable != p) {
            W(p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        int a2 = (int) ((R() || S() ? a() : 0.0f) - r());
        MaterialCardView materialCardView = this.f16517c;
        Rect rect = this.f16518d;
        materialCardView.k(rect.left + a2, rect.top + a2, rect.right + a2, rect.bottom + a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        this.f16519e.W(this.f16517c.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        if (!A()) {
            this.f16517c.setBackgroundInternal(z(this.f16519e));
        }
        this.f16517c.setForeground(z(this.f16524j));
    }

    void Z() {
        this.f16520f.f0(this.f16523i, this.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        Drawable drawable = this.p;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i2 = bounds.bottom;
            this.p.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
            this.p.setBounds(bounds.left, bounds.top, bounds.right, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g k() {
        return this.f16519e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f16519e.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList m() {
        return this.f16520f.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable n() {
        return this.f16525k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList o() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float q() {
        return this.f16519e.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        return this.f16519e.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList t() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k u() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int v() {
        ColorStateList colorStateList = this.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList w() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int x() {
        return this.f16523i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect y() {
        return this.f16518d;
    }
}
