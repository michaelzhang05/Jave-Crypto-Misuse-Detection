package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.u;
import e.e.b.b.b;
import e.e.b.b.l;
import e.e.b.b.w.c;
import e.e.b.b.z.g;
import e.e.b.b.z.k;
import e.e.b.b.z.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes2.dex */
public class a {
    private static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final MaterialButton f16506b;

    /* renamed from: c, reason: collision with root package name */
    private k f16507c;

    /* renamed from: d, reason: collision with root package name */
    private int f16508d;

    /* renamed from: e, reason: collision with root package name */
    private int f16509e;

    /* renamed from: f, reason: collision with root package name */
    private int f16510f;

    /* renamed from: g, reason: collision with root package name */
    private int f16511g;

    /* renamed from: h, reason: collision with root package name */
    private int f16512h;

    /* renamed from: i, reason: collision with root package name */
    private int f16513i;

    /* renamed from: j, reason: collision with root package name */
    private PorterDuff.Mode f16514j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f16515k;
    private ColorStateList l;
    private ColorStateList m;
    private Drawable n;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r;
    private LayerDrawable s;

    static {
        a = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MaterialButton materialButton, k kVar) {
        this.f16506b = materialButton;
        this.f16507c = kVar;
    }

    private void A(k kVar) {
        if (d() != null) {
            d().setShapeAppearanceModel(kVar);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(kVar);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
    }

    private void C() {
        g d2 = d();
        g l = l();
        if (d2 != null) {
            d2.f0(this.f16513i, this.l);
            if (l != null) {
                l.e0(this.f16513i, this.o ? e.e.b.b.q.a.c(this.f16506b, b.o) : 0);
            }
        }
    }

    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f16508d, this.f16510f, this.f16509e, this.f16511g);
    }

    private Drawable a() {
        g gVar = new g(this.f16507c);
        gVar.N(this.f16506b.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f16515k);
        PorterDuff.Mode mode = this.f16514j;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.f0(this.f16513i, this.l);
        g gVar2 = new g(this.f16507c);
        gVar2.setTint(0);
        gVar2.e0(this.f16513i, this.o ? e.e.b.b.q.a.c(this.f16506b, b.o) : 0);
        if (a) {
            g gVar3 = new g(this.f16507c);
            this.n = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(e.e.b.b.x.b.d(this.m), D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.n);
            this.s = rippleDrawable;
            return rippleDrawable;
        }
        e.e.b.b.x.a aVar = new e.e.b.b.x.a(this.f16507c);
        this.n = aVar;
        androidx.core.graphics.drawable.a.o(aVar, e.e.b.b.x.b.d(this.m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.n});
        this.s = layerDrawable;
        return D(layerDrawable);
    }

    private g e(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (a) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (g) this.s.getDrawable(!z ? 1 : 0);
    }

    private g l() {
        return e(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(int i2, int i3) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(this.f16508d, this.f16510f, i3 - this.f16509e, i2 - this.f16511g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f16512h;
    }

    public n c() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.s.getNumberOfLayers() > 2) {
            return (n) this.s.getDrawable(2);
        }
        return (n) this.s.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g d() {
        return e(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k g() {
        return this.f16507c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f16513i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f16515k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        return this.f16514j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(TypedArray typedArray) {
        this.f16508d = typedArray.getDimensionPixelOffset(l.v2, 0);
        this.f16509e = typedArray.getDimensionPixelOffset(l.w2, 0);
        this.f16510f = typedArray.getDimensionPixelOffset(l.x2, 0);
        this.f16511g = typedArray.getDimensionPixelOffset(l.y2, 0);
        int i2 = l.C2;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.f16512h = dimensionPixelSize;
            u(this.f16507c.w(dimensionPixelSize));
            this.q = true;
        }
        this.f16513i = typedArray.getDimensionPixelSize(l.M2, 0);
        this.f16514j = com.google.android.material.internal.k.e(typedArray.getInt(l.B2, -1), PorterDuff.Mode.SRC_IN);
        this.f16515k = c.a(this.f16506b.getContext(), typedArray, l.A2);
        this.l = c.a(this.f16506b.getContext(), typedArray, l.L2);
        this.m = c.a(this.f16506b.getContext(), typedArray, l.K2);
        this.r = typedArray.getBoolean(l.z2, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(l.D2, 0);
        int D = u.D(this.f16506b);
        int paddingTop = this.f16506b.getPaddingTop();
        int C = u.C(this.f16506b);
        int paddingBottom = this.f16506b.getPaddingBottom();
        if (typedArray.hasValue(l.u2)) {
            q();
        } else {
            this.f16506b.setInternalBackground(a());
            g d2 = d();
            if (d2 != null) {
                d2.W(dimensionPixelSize2);
            }
        }
        u.w0(this.f16506b, D + this.f16508d, paddingTop + this.f16510f, C + this.f16509e, paddingBottom + this.f16511g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i2) {
        if (d() != null) {
            d().setTint(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.p = true;
        this.f16506b.setSupportBackgroundTintList(this.f16515k);
        this.f16506b.setSupportBackgroundTintMode(this.f16514j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z) {
        this.r = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i2) {
        if (this.q && this.f16512h == i2) {
            return;
        }
        this.f16512h = i2;
        this.q = true;
        u(this.f16507c.w(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            boolean z = a;
            if (z && (this.f16506b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f16506b.getBackground()).setColor(e.e.b.b.x.b.d(colorStateList));
            } else {
                if (z || !(this.f16506b.getBackground() instanceof e.e.b.b.x.a)) {
                    return;
                }
                ((e.e.b.b.x.a) this.f16506b.getBackground()).setTintList(e.e.b.b.x.b.d(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(k kVar) {
        this.f16507c = kVar;
        A(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(boolean z) {
        this.o = z;
        C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(int i2) {
        if (this.f16513i != i2) {
            this.f16513i = i2;
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f16515k != colorStateList) {
            this.f16515k = colorStateList;
            if (d() != null) {
                androidx.core.graphics.drawable.a.o(d(), this.f16515k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(PorterDuff.Mode mode) {
        if (this.f16514j != mode) {
            this.f16514j = mode;
            if (d() == null || this.f16514j == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(d(), this.f16514j);
        }
    }
}
