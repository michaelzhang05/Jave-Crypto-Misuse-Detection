package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f1190a;

    /* renamed from: b, reason: collision with root package name */
    private a3 f1191b;

    /* renamed from: c, reason: collision with root package name */
    private a3 f1192c;

    /* renamed from: d, reason: collision with root package name */
    private a3 f1193d;

    /* renamed from: e, reason: collision with root package name */
    private int f1194e = 0;

    public q(ImageView imageView) {
        this.f1190a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1193d == null) {
            this.f1193d = new a3();
        }
        a3 a3Var = this.f1193d;
        a3Var.a();
        ColorStateList a6 = androidx.core.widget.j.a(this.f1190a);
        if (a6 != null) {
            a3Var.f917d = true;
            a3Var.f914a = a6;
        }
        PorterDuff.Mode b6 = androidx.core.widget.j.b(this.f1190a);
        if (b6 != null) {
            a3Var.f916c = true;
            a3Var.f915b = b6;
        }
        if (!a3Var.f917d && !a3Var.f916c) {
            return false;
        }
        k.i(drawable, a3Var, this.f1190a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f1191b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f1190a.getDrawable() != null) {
            this.f1190a.getDrawable().setLevel(this.f1194e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f1190a.getDrawable();
        if (drawable != null) {
            c2.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            a3 a3Var = this.f1192c;
            if (a3Var != null) {
                k.i(drawable, a3Var, this.f1190a.getDrawableState());
                return;
            }
            a3 a3Var2 = this.f1191b;
            if (a3Var2 != null) {
                k.i(drawable, a3Var2, this.f1190a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList d() {
        a3 a3Var = this.f1192c;
        if (a3Var != null) {
            return a3Var.f914a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        a3 a3Var = this.f1192c;
        if (a3Var != null) {
            return a3Var.f915b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return !(this.f1190a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i6) {
        int n6;
        c3 v5 = c3.v(this.f1190a.getContext(), attributeSet, d.j.P, i6, 0);
        ImageView imageView = this.f1190a;
        androidx.core.view.b1.o0(imageView, imageView.getContext(), d.j.P, attributeSet, v5.r(), i6, 0);
        try {
            Drawable drawable = this.f1190a.getDrawable();
            if (drawable == null && (n6 = v5.n(d.j.Q, -1)) != -1 && (drawable = e.a.b(this.f1190a.getContext(), n6)) != null) {
                this.f1190a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c2.b(drawable);
            }
            if (v5.s(d.j.R)) {
                androidx.core.widget.j.c(this.f1190a, v5.c(d.j.R));
            }
            if (v5.s(d.j.S)) {
                androidx.core.widget.j.d(this.f1190a, c2.d(v5.k(d.j.S, -1), null));
            }
        } finally {
            v5.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f1194e = drawable.getLevel();
    }

    public void i(int i6) {
        if (i6 != 0) {
            Drawable b6 = e.a.b(this.f1190a.getContext(), i6);
            if (b6 != null) {
                c2.b(b6);
            }
            this.f1190a.setImageDrawable(b6);
        } else {
            this.f1190a.setImageDrawable(null);
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f1192c == null) {
            this.f1192c = new a3();
        }
        a3 a3Var = this.f1192c;
        a3Var.f914a = colorStateList;
        a3Var.f917d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f1192c == null) {
            this.f1192c = new a3();
        }
        a3 a3Var = this.f1192c;
        a3Var.f915b = mode;
        a3Var.f916c = true;
        c();
    }
}
