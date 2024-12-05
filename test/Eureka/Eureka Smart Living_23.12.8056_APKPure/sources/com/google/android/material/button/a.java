package com.google.android.material.button;

import a3.b;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.b1;
import c3.g;
import c3.k;
import c3.n;
import m2.j;
import z2.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f4833u;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f4834v;

    /* renamed from: a, reason: collision with root package name */
    private final MaterialButton f4835a;

    /* renamed from: b, reason: collision with root package name */
    private k f4836b;

    /* renamed from: c, reason: collision with root package name */
    private int f4837c;

    /* renamed from: d, reason: collision with root package name */
    private int f4838d;

    /* renamed from: e, reason: collision with root package name */
    private int f4839e;

    /* renamed from: f, reason: collision with root package name */
    private int f4840f;

    /* renamed from: g, reason: collision with root package name */
    private int f4841g;

    /* renamed from: h, reason: collision with root package name */
    private int f4842h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f4843i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f4844j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f4845k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f4846l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f4847m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4851q;

    /* renamed from: s, reason: collision with root package name */
    private LayerDrawable f4853s;

    /* renamed from: t, reason: collision with root package name */
    private int f4854t;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4848n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4849o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4850p = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f4852r = true;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f4833u = true;
        f4834v = i6 <= 22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MaterialButton materialButton, k kVar) {
        this.f4835a = materialButton;
        this.f4836b = kVar;
    }

    private void G(int i6, int i7) {
        int J = b1.J(this.f4835a);
        int paddingTop = this.f4835a.getPaddingTop();
        int I = b1.I(this.f4835a);
        int paddingBottom = this.f4835a.getPaddingBottom();
        int i8 = this.f4839e;
        int i9 = this.f4840f;
        this.f4840f = i7;
        this.f4839e = i6;
        if (!this.f4849o) {
            H();
        }
        b1.E0(this.f4835a, J, (paddingTop + i6) - i8, I, (paddingBottom + i7) - i9);
    }

    private void H() {
        this.f4835a.setInternalBackground(a());
        g f6 = f();
        if (f6 != null) {
            f6.Q(this.f4854t);
            f6.setState(this.f4835a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (f4834v && !this.f4849o) {
            int J = b1.J(this.f4835a);
            int paddingTop = this.f4835a.getPaddingTop();
            int I = b1.I(this.f4835a);
            int paddingBottom = this.f4835a.getPaddingBottom();
            H();
            b1.E0(this.f4835a, J, paddingTop, I, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void J() {
        g f6 = f();
        g n6 = n();
        if (f6 != null) {
            f6.W(this.f4842h, this.f4845k);
            if (n6 != null) {
                n6.V(this.f4842h, this.f4848n ? r2.a.d(this.f4835a, m2.a.f7558l) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f4837c, this.f4839e, this.f4838d, this.f4840f);
    }

    private Drawable a() {
        g gVar = new g(this.f4836b);
        gVar.H(this.f4835a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f4844j);
        PorterDuff.Mode mode = this.f4843i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.W(this.f4842h, this.f4845k);
        g gVar2 = new g(this.f4836b);
        gVar2.setTint(0);
        gVar2.V(this.f4842h, this.f4848n ? r2.a.d(this.f4835a, m2.a.f7558l) : 0);
        if (f4833u) {
            g gVar3 = new g(this.f4836b);
            this.f4847m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.b(this.f4846l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f4847m);
            this.f4853s = rippleDrawable;
            return rippleDrawable;
        }
        a3.a aVar = new a3.a(this.f4836b);
        this.f4847m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, b.b(this.f4846l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f4847m});
        this.f4853s = layerDrawable;
        return K(layerDrawable);
    }

    private g g(boolean z5) {
        LayerDrawable layerDrawable = this.f4853s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f4833u ? (LayerDrawable) ((InsetDrawable) this.f4853s.getDrawable(0)).getDrawable() : this.f4853s).getDrawable(!z5 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(boolean z5) {
        this.f4848n = z5;
        J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        if (this.f4845k != colorStateList) {
            this.f4845k = colorStateList;
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(int i6) {
        if (this.f4842h != i6) {
            this.f4842h = i6;
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(ColorStateList colorStateList) {
        if (this.f4844j != colorStateList) {
            this.f4844j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f4844j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(PorterDuff.Mode mode) {
        if (this.f4843i != mode) {
            this.f4843i = mode;
            if (f() == null || this.f4843i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(f(), this.f4843i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(boolean z5) {
        this.f4852r = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f4841g;
    }

    public int c() {
        return this.f4840f;
    }

    public int d() {
        return this.f4839e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f4853s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.f4853s.getNumberOfLayers() > 2 ? this.f4853s.getDrawable(2) : this.f4853s.getDrawable(1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g f() {
        return g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f4846l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        return this.f4836b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f4845k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f4842h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f4844j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f4843i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f4849o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f4851q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return this.f4852r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(TypedArray typedArray) {
        this.f4837c = typedArray.getDimensionPixelOffset(j.f7703a2, 0);
        this.f4838d = typedArray.getDimensionPixelOffset(j.f7710b2, 0);
        this.f4839e = typedArray.getDimensionPixelOffset(j.f7717c2, 0);
        this.f4840f = typedArray.getDimensionPixelOffset(j.f7724d2, 0);
        if (typedArray.hasValue(j.f7752h2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(j.f7752h2, -1);
            this.f4841g = dimensionPixelSize;
            z(this.f4836b.w(dimensionPixelSize));
            this.f4850p = true;
        }
        this.f4842h = typedArray.getDimensionPixelSize(j.f7822r2, 0);
        this.f4843i = com.google.android.material.internal.n.f(typedArray.getInt(j.f7745g2, -1), PorterDuff.Mode.SRC_IN);
        this.f4844j = c.a(this.f4835a.getContext(), typedArray, j.f7738f2);
        this.f4845k = c.a(this.f4835a.getContext(), typedArray, j.f7815q2);
        this.f4846l = c.a(this.f4835a.getContext(), typedArray, j.f7808p2);
        this.f4851q = typedArray.getBoolean(j.f7731e2, false);
        this.f4854t = typedArray.getDimensionPixelSize(j.f7759i2, 0);
        this.f4852r = typedArray.getBoolean(j.f7828s2, true);
        int J = b1.J(this.f4835a);
        int paddingTop = this.f4835a.getPaddingTop();
        int I = b1.I(this.f4835a);
        int paddingBottom = this.f4835a.getPaddingBottom();
        if (typedArray.hasValue(j.Z1)) {
            t();
        } else {
            H();
        }
        b1.E0(this.f4835a, J + this.f4837c, paddingTop + this.f4839e, I + this.f4838d, paddingBottom + this.f4840f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i6) {
        if (f() != null) {
            f().setTint(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.f4849o = true;
        this.f4835a.setSupportBackgroundTintList(this.f4844j);
        this.f4835a.setSupportBackgroundTintMode(this.f4843i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(boolean z5) {
        this.f4851q = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i6) {
        if (this.f4850p && this.f4841g == i6) {
            return;
        }
        this.f4841g = i6;
        this.f4850p = true;
        z(this.f4836b.w(i6));
    }

    public void w(int i6) {
        G(this.f4839e, i6);
    }

    public void x(int i6) {
        G(i6, this.f4840f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f4846l != colorStateList) {
            this.f4846l = colorStateList;
            boolean z5 = f4833u;
            if (z5 && (this.f4835a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f4835a.getBackground()).setColor(b.b(colorStateList));
            } else {
                if (z5 || !(this.f4835a.getBackground() instanceof a3.a)) {
                    return;
                }
                ((a3.a) this.f4835a.getBackground()).setTintList(b.b(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(k kVar) {
        this.f4836b = kVar;
        I(kVar);
    }
}
