package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.d.f;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public class s {
    private final TextView a;

    /* renamed from: b, reason: collision with root package name */
    private o0 f588b;

    /* renamed from: c, reason: collision with root package name */
    private o0 f589c;

    /* renamed from: d, reason: collision with root package name */
    private o0 f590d;

    /* renamed from: e, reason: collision with root package name */
    private o0 f591e;

    /* renamed from: f, reason: collision with root package name */
    private o0 f592f;

    /* renamed from: g, reason: collision with root package name */
    private o0 f593g;

    /* renamed from: h, reason: collision with root package name */
    private o0 f594h;

    /* renamed from: i, reason: collision with root package name */
    private final u f595i;

    /* renamed from: j, reason: collision with root package name */
    private int f596j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f597k = -1;
    private Typeface l;
    private boolean m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class a extends f.c {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f598b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f599c;

        a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.f598b = i3;
            this.f599c = weakReference;
        }

        @Override // androidx.core.content.d.f.c
        public void d(int i2) {
        }

        @Override // androidx.core.content.d.f.c
        public void e(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f598b & 2) != 0);
            }
            s.this.n(this.f599c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(TextView textView) {
        this.a = textView;
        this.f595i = new u(textView);
    }

    private void A(int i2, float f2) {
        this.f595i.y(i2, f2);
    }

    private void B(Context context, q0 q0Var) {
        String o;
        this.f596j = q0Var.k(c.a.j.a3, this.f596j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int k2 = q0Var.k(c.a.j.f3, -1);
            this.f597k = k2;
            if (k2 != -1) {
                this.f596j = (this.f596j & 2) | 0;
            }
        }
        int i3 = c.a.j.e3;
        if (!q0Var.s(i3) && !q0Var.s(c.a.j.g3)) {
            int i4 = c.a.j.Z2;
            if (q0Var.s(i4)) {
                this.m = false;
                int k3 = q0Var.k(i4, 1);
                if (k3 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (k3 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (k3 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = c.a.j.g3;
        if (q0Var.s(i5)) {
            i3 = i5;
        }
        int i6 = this.f597k;
        int i7 = this.f596j;
        if (!context.isRestricted()) {
            try {
                Typeface j2 = q0Var.j(i3, this.f596j, new a(i6, i7, new WeakReference(this.a)));
                if (j2 != null) {
                    if (i2 >= 28 && this.f597k != -1) {
                        this.l = Typeface.create(Typeface.create(j2, 0), this.f597k, (this.f596j & 2) != 0);
                    } else {
                        this.l = j2;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (o = q0Var.o(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.f597k != -1) {
            this.l = Typeface.create(Typeface.create(o, 0), this.f597k, (this.f596j & 2) != 0);
        } else {
            this.l = Typeface.create(o, this.f596j);
        }
    }

    private void a(Drawable drawable, o0 o0Var) {
        if (drawable == null || o0Var == null) {
            return;
        }
        h.i(drawable, o0Var, this.a.getDrawableState());
    }

    private static o0 d(Context context, h hVar, int i2) {
        ColorStateList f2 = hVar.f(context, i2);
        if (f2 == null) {
            return null;
        }
        o0 o0Var = new o0();
        o0Var.f562d = true;
        o0Var.a = f2;
        return o0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (i2 >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        TextView textView3 = this.a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void y() {
        o0 o0Var = this.f594h;
        this.f588b = o0Var;
        this.f589c = o0Var;
        this.f590d = o0Var;
        this.f591e = o0Var;
        this.f592f = o0Var;
        this.f593g = o0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f588b != null || this.f589c != null || this.f590d != null || this.f591e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f588b);
            a(compoundDrawables[1], this.f589c);
            a(compoundDrawables[2], this.f590d);
            a(compoundDrawables[3], this.f591e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f592f == null && this.f593g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f592f);
            a(compoundDrawablesRelative[2], this.f593g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f595i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f595i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f595i.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f595i.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f595i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f595i.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        o0 o0Var = this.f594h;
        if (o0Var != null) {
            return o0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        o0 o0Var = this.f594h;
        if (o0Var != null) {
            return o0Var.f560b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f595i.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e9  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f596j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z, int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.d.a) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i2) {
        String o;
        ColorStateList c2;
        q0 t = q0.t(context, i2, c.a.j.X2);
        int i3 = c.a.j.i3;
        if (t.s(i3)) {
            r(t.a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            int i5 = c.a.j.b3;
            if (t.s(i5) && (c2 = t.c(i5)) != null) {
                this.a.setTextColor(c2);
            }
        }
        int i6 = c.a.j.Y2;
        if (t.s(i6) && t.f(i6, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        B(context, t);
        if (i4 >= 26) {
            int i7 = c.a.j.h3;
            if (t.s(i7) && (o = t.o(i7)) != null) {
                this.a.setFontVariationSettings(o);
            }
        }
        t.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f596j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z) {
        this.a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        this.f595i.u(i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int[] iArr, int i2) throws IllegalArgumentException {
        this.f595i.v(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i2) {
        this.f595i.w(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ColorStateList colorStateList) {
        if (this.f594h == null) {
            this.f594h = new o0();
        }
        o0 o0Var = this.f594h;
        o0Var.a = colorStateList;
        o0Var.f562d = colorStateList != null;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(PorterDuff.Mode mode) {
        if (this.f594h == null) {
            this.f594h = new o0();
        }
        o0 o0Var = this.f594h;
        o0Var.f560b = mode;
        o0Var.f561c = mode != null;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(int i2, float f2) {
        if (androidx.core.widget.d.a || l()) {
            return;
        }
        A(i2, f2);
    }
}
