package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public class d {
    private final View a;

    /* renamed from: d, reason: collision with root package name */
    private o0 f464d;

    /* renamed from: e, reason: collision with root package name */
    private o0 f465e;

    /* renamed from: f, reason: collision with root package name */
    private o0 f466f;

    /* renamed from: c, reason: collision with root package name */
    private int f463c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final h f462b = h.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(View view) {
        this.a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f466f == null) {
            this.f466f = new o0();
        }
        o0 o0Var = this.f466f;
        o0Var.a();
        ColorStateList p = androidx.core.view.u.p(this.a);
        if (p != null) {
            o0Var.f562d = true;
            o0Var.a = p;
        }
        PorterDuff.Mode q = androidx.core.view.u.q(this.a);
        if (q != null) {
            o0Var.f561c = true;
            o0Var.f560b = q;
        }
        if (!o0Var.f562d && !o0Var.f561c) {
            return false;
        }
        h.i(drawable, o0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f464d != null : i2 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            o0 o0Var = this.f465e;
            if (o0Var != null) {
                h.i(background, o0Var, this.a.getDrawableState());
                return;
            }
            o0 o0Var2 = this.f464d;
            if (o0Var2 != null) {
                h.i(background, o0Var2, this.a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        o0 o0Var = this.f465e;
        if (o0Var != null) {
            return o0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        o0 o0Var = this.f465e;
        if (o0Var != null) {
            return o0Var.f560b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i2) {
        Context context = this.a.getContext();
        int[] iArr = c.a.j.R3;
        q0 v = q0.v(context, attributeSet, iArr, i2, 0);
        View view = this.a;
        androidx.core.view.u.g0(view, view.getContext(), iArr, attributeSet, v.r(), i2, 0);
        try {
            int i3 = c.a.j.S3;
            if (v.s(i3)) {
                this.f463c = v.n(i3, -1);
                ColorStateList f2 = this.f462b.f(this.a.getContext(), this.f463c);
                if (f2 != null) {
                    h(f2);
                }
            }
            int i4 = c.a.j.T3;
            if (v.s(i4)) {
                androidx.core.view.u.n0(this.a, v.c(i4));
            }
            int i5 = c.a.j.U3;
            if (v.s(i5)) {
                androidx.core.view.u.o0(this.a, y.e(v.k(i5, -1), null));
            }
        } finally {
            v.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f463c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i2) {
        this.f463c = i2;
        h hVar = this.f462b;
        h(hVar != null ? hVar.f(this.a.getContext(), i2) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f464d == null) {
                this.f464d = new o0();
            }
            o0 o0Var = this.f464d;
            o0Var.a = colorStateList;
            o0Var.f562d = true;
        } else {
            this.f464d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f465e == null) {
            this.f465e = new o0();
        }
        o0 o0Var = this.f465e;
        o0Var.a = colorStateList;
        o0Var.f562d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f465e == null) {
            this.f465e = new o0();
        }
        o0 o0Var = this.f465e;
        o0Var.f560b = mode;
        o0Var.f561c = true;
        b();
    }
}
