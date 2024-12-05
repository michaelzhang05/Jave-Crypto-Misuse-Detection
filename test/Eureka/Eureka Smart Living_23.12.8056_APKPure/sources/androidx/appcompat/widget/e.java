package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f999a;

    /* renamed from: d, reason: collision with root package name */
    private a3 f1002d;

    /* renamed from: e, reason: collision with root package name */
    private a3 f1003e;

    /* renamed from: f, reason: collision with root package name */
    private a3 f1004f;

    /* renamed from: c, reason: collision with root package name */
    private int f1001c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final k f1000b = k.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.f999a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1004f == null) {
            this.f1004f = new a3();
        }
        a3 a3Var = this.f1004f;
        a3Var.a();
        ColorStateList u5 = androidx.core.view.b1.u(this.f999a);
        if (u5 != null) {
            a3Var.f917d = true;
            a3Var.f914a = u5;
        }
        PorterDuff.Mode v5 = androidx.core.view.b1.v(this.f999a);
        if (v5 != null) {
            a3Var.f916c = true;
            a3Var.f915b = v5;
        }
        if (!a3Var.f917d && !a3Var.f916c) {
            return false;
        }
        k.i(drawable, a3Var, this.f999a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1002d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f999a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            a3 a3Var = this.f1003e;
            if (a3Var != null) {
                k.i(background, a3Var, this.f999a.getDrawableState());
                return;
            }
            a3 a3Var2 = this.f1002d;
            if (a3Var2 != null) {
                k.i(background, a3Var2, this.f999a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        a3 a3Var = this.f1003e;
        if (a3Var != null) {
            return a3Var.f914a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        a3 a3Var = this.f1003e;
        if (a3Var != null) {
            return a3Var.f915b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i6) {
        c3 v5 = c3.v(this.f999a.getContext(), attributeSet, d.j.f6374y3, i6, 0);
        View view = this.f999a;
        androidx.core.view.b1.o0(view, view.getContext(), d.j.f6374y3, attributeSet, v5.r(), i6, 0);
        try {
            if (v5.s(d.j.f6379z3)) {
                this.f1001c = v5.n(d.j.f6379z3, -1);
                ColorStateList f6 = this.f1000b.f(this.f999a.getContext(), this.f1001c);
                if (f6 != null) {
                    h(f6);
                }
            }
            if (v5.s(d.j.A3)) {
                androidx.core.view.b1.v0(this.f999a, v5.c(d.j.A3));
            }
            if (v5.s(d.j.B3)) {
                androidx.core.view.b1.w0(this.f999a, c2.d(v5.k(d.j.B3, -1), null));
            }
        } finally {
            v5.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f1001c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i6) {
        this.f1001c = i6;
        k kVar = this.f1000b;
        h(kVar != null ? kVar.f(this.f999a.getContext(), i6) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1002d == null) {
                this.f1002d = new a3();
            }
            a3 a3Var = this.f1002d;
            a3Var.f914a = colorStateList;
            a3Var.f917d = true;
        } else {
            this.f1002d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f1003e == null) {
            this.f1003e = new a3();
        }
        a3 a3Var = this.f1003e;
        a3Var.f914a = colorStateList;
        a3Var.f917d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f1003e == null) {
            this.f1003e = new a3();
        }
        a3 a3Var = this.f1003e;
        a3Var.f915b = mode;
        a3Var.f916c = true;
        b();
    }
}
