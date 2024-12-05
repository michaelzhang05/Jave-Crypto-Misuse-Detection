package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
class d1 {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f957a;

    /* renamed from: b, reason: collision with root package name */
    private a3 f958b;

    /* renamed from: c, reason: collision with root package name */
    private a3 f959c;

    /* renamed from: d, reason: collision with root package name */
    private a3 f960d;

    /* renamed from: e, reason: collision with root package name */
    private a3 f961e;

    /* renamed from: f, reason: collision with root package name */
    private a3 f962f;

    /* renamed from: g, reason: collision with root package name */
    private a3 f963g;

    /* renamed from: h, reason: collision with root package name */
    private a3 f964h;

    /* renamed from: i, reason: collision with root package name */
    private final l1 f965i;

    /* renamed from: j, reason: collision with root package name */
    private int f966j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f967k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f968l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f969m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f970a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f971b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f972c;

        a(int i6, int i7, WeakReference weakReference) {
            this.f970a = i6;
            this.f971b = i7;
            this.f972c = weakReference;
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: h */
        public void f(int i6) {
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i6;
            if (Build.VERSION.SDK_INT >= 28 && (i6 = this.f970a) != -1) {
                typeface = g.a(typeface, i6, (this.f971b & 2) != 0);
            }
            d1.this.n(this.f972c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f976c;

        b(TextView textView, Typeface typeface, int i6) {
            this.f974a = textView;
            this.f975b = typeface;
            this.f976c = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f974a.setTypeface(this.f975b, this.f976c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* loaded from: classes.dex */
    static class d {
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* loaded from: classes.dex */
    static class e {
        static LocaleList a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* loaded from: classes.dex */
    static class f {
        static int a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        static void b(TextView textView, int i6, int i7, int i8, int i9) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
        }

        static void c(TextView textView, int[] iArr, int i6) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
        }

        static boolean d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g {
        static Typeface a(Typeface typeface, int i6, boolean z5) {
            Typeface create;
            create = Typeface.create(typeface, i6, z5);
            return create;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(TextView textView) {
        this.f957a = textView;
        this.f965i = new l1(textView);
    }

    private void B(int i6, float f6) {
        this.f965i.t(i6, f6);
    }

    private void C(Context context, c3 c3Var) {
        String o6;
        Typeface create;
        Typeface typeface;
        this.f966j = c3Var.k(d.j.H2, this.f966j);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            int k6 = c3Var.k(d.j.M2, -1);
            this.f967k = k6;
            if (k6 != -1) {
                this.f966j = (this.f966j & 2) | 0;
            }
        }
        if (!c3Var.s(d.j.L2) && !c3Var.s(d.j.N2)) {
            if (c3Var.s(d.j.G2)) {
                this.f969m = false;
                int k7 = c3Var.k(d.j.G2, 1);
                if (k7 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (k7 == 2) {
                    typeface = Typeface.SERIF;
                } else if (k7 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f968l = typeface;
                return;
            }
            return;
        }
        this.f968l = null;
        int i7 = c3Var.s(d.j.N2) ? d.j.N2 : d.j.L2;
        int i8 = this.f967k;
        int i9 = this.f966j;
        if (!context.isRestricted()) {
            try {
                Typeface j6 = c3Var.j(i7, this.f966j, new a(i8, i9, new WeakReference(this.f957a)));
                if (j6 != null) {
                    if (i6 >= 28 && this.f967k != -1) {
                        j6 = g.a(Typeface.create(j6, 0), this.f967k, (this.f966j & 2) != 0);
                    }
                    this.f968l = j6;
                }
                this.f969m = this.f968l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f968l != null || (o6 = c3Var.o(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f967k == -1) {
            create = Typeface.create(o6, this.f966j);
        } else {
            create = g.a(Typeface.create(o6, 0), this.f967k, (this.f966j & 2) != 0);
        }
        this.f968l = create;
    }

    private void a(Drawable drawable, a3 a3Var) {
        if (drawable == null || a3Var == null) {
            return;
        }
        k.i(drawable, a3Var, this.f957a.getDrawableState());
    }

    private static a3 d(Context context, k kVar, int i6) {
        ColorStateList f6 = kVar.f(context, i6);
        if (f6 == null) {
            return null;
        }
        a3 a3Var = new a3();
        a3Var.f917d = true;
        a3Var.f914a = f6;
        return a3Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a6 = c.a(this.f957a);
            TextView textView = this.f957a;
            if (drawable5 == null) {
                drawable5 = a6[0];
            }
            if (drawable2 == null) {
                drawable2 = a6[1];
            }
            if (drawable6 == null) {
                drawable6 = a6[2];
            }
            if (drawable4 == null) {
                drawable4 = a6[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] a7 = c.a(this.f957a);
        Drawable drawable7 = a7[0];
        if (drawable7 != null || a7[2] != null) {
            TextView textView2 = this.f957a;
            if (drawable2 == null) {
                drawable2 = a7[1];
            }
            Drawable drawable8 = a7[2];
            if (drawable4 == null) {
                drawable4 = a7[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f957a.getCompoundDrawables();
        TextView textView3 = this.f957a;
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

    private void z() {
        a3 a3Var = this.f964h;
        this.f958b = a3Var;
        this.f959c = a3Var;
        this.f960d = a3Var;
        this.f961e = a3Var;
        this.f962f = a3Var;
        this.f963g = a3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(int i6, float f6) {
        if (p3.f1189b || l()) {
            return;
        }
        B(i6, f6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f958b != null || this.f959c != null || this.f960d != null || this.f961e != null) {
            Drawable[] compoundDrawables = this.f957a.getCompoundDrawables();
            a(compoundDrawables[0], this.f958b);
            a(compoundDrawables[1], this.f959c);
            a(compoundDrawables[2], this.f960d);
            a(compoundDrawables[3], this.f961e);
        }
        if (this.f962f == null && this.f963g == null) {
            return;
        }
        Drawable[] a6 = c.a(this.f957a);
        a(a6[0], this.f962f);
        a(a6[2], this.f963g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f965i.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f965i.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f965i.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f965i.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f965i.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f965i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        a3 a3Var = this.f964h;
        if (a3Var != null) {
            return a3Var.f914a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        a3 a3Var = this.f964h;
        if (a3Var != null) {
            return a3Var.f915b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f965i.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:152:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d1.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f969m) {
            this.f968l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (androidx.core.view.b1.T(textView)) {
                    textView.post(new b(textView, typeface, this.f966j));
                } else {
                    textView.setTypeface(typeface, this.f966j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z5, int i6, int i7, int i8, int i9) {
        if (p3.f1189b) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i6) {
        String o6;
        ColorStateList c6;
        ColorStateList c7;
        ColorStateList c8;
        c3 t5 = c3.t(context, i6, d.j.E2);
        if (t5.s(d.j.P2)) {
            s(t5.a(d.j.P2, false));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 23) {
            if (t5.s(d.j.I2) && (c8 = t5.c(d.j.I2)) != null) {
                this.f957a.setTextColor(c8);
            }
            if (t5.s(d.j.K2) && (c7 = t5.c(d.j.K2)) != null) {
                this.f957a.setLinkTextColor(c7);
            }
            if (t5.s(d.j.J2) && (c6 = t5.c(d.j.J2)) != null) {
                this.f957a.setHintTextColor(c6);
            }
        }
        if (t5.s(d.j.F2) && t5.f(d.j.F2, -1) == 0) {
            this.f957a.setTextSize(0, 0.0f);
        }
        C(context, t5);
        if (i7 >= 26 && t5.s(d.j.O2) && (o6 = t5.o(d.j.O2)) != null) {
            f.d(this.f957a, o6);
        }
        t5.w();
        Typeface typeface = this.f968l;
        if (typeface != null) {
            this.f957a.setTypeface(typeface, this.f966j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        v.d.f(editorInfo, textView.getText());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z5) {
        this.f957a.setAllCaps(z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i6, int i7, int i8, int i9) {
        this.f965i.p(i6, i7, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int[] iArr, int i6) {
        this.f965i.q(iArr, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i6) {
        this.f965i.r(i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f964h == null) {
            this.f964h = new a3();
        }
        a3 a3Var = this.f964h;
        a3Var.f914a = colorStateList;
        a3Var.f917d = colorStateList != null;
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f964h == null) {
            this.f964h = new a3();
        }
        a3 a3Var = this.f964h;
        a3Var.f915b = mode;
        a3Var.f916c = mode != null;
        z();
    }
}
