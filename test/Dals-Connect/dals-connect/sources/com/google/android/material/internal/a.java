package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.view.u;
import com.google.android.material.internal.g;
import e.e.b.b.w.a;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes2.dex */
public final class a {
    private static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static final Paint f16664b;
    private CharSequence A;
    private boolean B;
    private boolean C;
    private Bitmap D;
    private Paint E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private final TextPaint J;
    private final TextPaint K;
    private TimeInterpolator L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;
    private StaticLayout V;
    private float W;
    private float X;
    private float Y;
    private CharSequence Z;

    /* renamed from: c, reason: collision with root package name */
    private final View f16665c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16666d;

    /* renamed from: e, reason: collision with root package name */
    private float f16667e;

    /* renamed from: f, reason: collision with root package name */
    private final Rect f16668f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f16669g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f16670h;
    private ColorStateList m;
    private ColorStateList n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private Typeface u;
    private Typeface v;
    private Typeface w;
    private e.e.b.b.w.a x;
    private e.e.b.b.w.a y;
    private CharSequence z;

    /* renamed from: i, reason: collision with root package name */
    private int f16671i = 16;

    /* renamed from: j, reason: collision with root package name */
    private int f16672j = 16;

    /* renamed from: k, reason: collision with root package name */
    private float f16673k = 15.0f;
    private float l = 15.0f;
    private int a0 = 1;

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0194a implements a.InterfaceC0221a {
        C0194a() {
        }

        @Override // e.e.b.b.w.a.InterfaceC0221a
        public void a(Typeface typeface) {
            a.this.S(typeface);
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* loaded from: classes2.dex */
    class b implements a.InterfaceC0221a {
        b() {
        }

        @Override // e.e.b.b.w.a.InterfaceC0221a
        public void a(Typeface typeface) {
            a.this.b0(typeface);
        }
    }

    static {
        a = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        f16664b = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public a(View view) {
        this.f16665c = view;
        TextPaint textPaint = new TextPaint(129);
        this.J = textPaint;
        this.K = new TextPaint(textPaint);
        this.f16669g = new Rect();
        this.f16668f = new Rect();
        this.f16670h = new RectF();
    }

    private void C(TextPaint textPaint) {
        textPaint.setTextSize(this.l);
        textPaint.setTypeface(this.u);
    }

    private void D(TextPaint textPaint) {
        textPaint.setTextSize(this.f16673k);
        textPaint.setTypeface(this.v);
    }

    private void E(float f2) {
        this.f16670h.left = I(this.f16668f.left, this.f16669g.left, f2, this.L);
        this.f16670h.top = I(this.o, this.p, f2, this.L);
        this.f16670h.right = I(this.f16668f.right, this.f16669g.right, f2, this.L);
        this.f16670h.bottom = I(this.f16668f.bottom, this.f16669g.bottom, f2, this.L);
    }

    private static boolean F(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private boolean G() {
        return u.y(this.f16665c) == 1;
    }

    private static float I(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return e.e.b.b.m.a.a(f2, f3, f4);
    }

    private static boolean L(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private void P(float f2) {
        this.W = f2;
        u.Z(this.f16665c);
    }

    private boolean T(Typeface typeface) {
        e.e.b.b.w.a aVar = this.y;
        if (aVar != null) {
            aVar.c();
        }
        if (this.u == typeface) {
            return false;
        }
        this.u = typeface;
        return true;
    }

    private void X(float f2) {
        this.X = f2;
        u.Z(this.f16665c);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i2) * f3) + (Color.alpha(i3) * f2)), (int) ((Color.red(i2) * f3) + (Color.red(i3) * f2)), (int) ((Color.green(i2) * f3) + (Color.green(i3) * f2)), (int) ((Color.blue(i2) * f3) + (Color.blue(i3) * f2)));
    }

    private void b() {
        float centerY;
        float centerY2;
        StaticLayout staticLayout;
        float f2 = this.G;
        g(this.l);
        CharSequence charSequence = this.A;
        if (charSequence != null && (staticLayout = this.V) != null) {
            this.Z = TextUtils.ellipsize(charSequence, this.J, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.Z;
        float measureText = charSequence2 != null ? this.J.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int b2 = androidx.core.view.d.b(this.f16672j, this.B ? 1 : 0);
        float height = this.V != null ? r5.getHeight() : 0.0f;
        int i2 = b2 & 112;
        if (i2 == 48) {
            this.p = this.f16669g.top - this.J.ascent();
        } else if (i2 != 80) {
            float descent = (this.J.descent() - this.J.ascent()) / 2.0f;
            float descent2 = descent - this.J.descent();
            if (l0()) {
                centerY2 = this.f16669g.centerY() - descent;
            } else {
                centerY2 = descent2 + this.f16669g.centerY();
            }
            this.p = centerY2;
        } else {
            this.p = this.f16669g.bottom;
        }
        int i3 = b2 & 8388615;
        if (i3 == 1) {
            this.r = this.f16669g.centerX() - (measureText / 2.0f);
        } else if (i3 != 5) {
            this.r = this.f16669g.left;
        } else {
            this.r = this.f16669g.right - measureText;
        }
        g(this.f16673k);
        CharSequence charSequence3 = this.A;
        float measureText2 = charSequence3 != null ? this.J.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.V;
        if (staticLayout2 != null && this.a0 > 1 && !this.B) {
            measureText2 = staticLayout2.getLineWidth(0);
        }
        StaticLayout staticLayout3 = this.V;
        this.Y = staticLayout3 != null ? staticLayout3.getLineLeft(0) : 0.0f;
        int b3 = androidx.core.view.d.b(this.f16671i, this.B ? 1 : 0);
        int i4 = b3 & 112;
        if (i4 == 48) {
            this.o = this.f16668f.top - this.J.ascent();
        } else if (i4 != 80) {
            float descent3 = ((this.J.descent() - this.J.ascent()) / 2.0f) - this.J.descent();
            if (l0()) {
                centerY = this.f16668f.centerY() - (height / 2.0f);
            } else {
                centerY = descent3 + this.f16668f.centerY();
            }
            this.o = centerY;
        } else {
            this.o = this.f16668f.bottom - (l0() ? height - this.J.descent() : 0.0f);
        }
        int i5 = b3 & 8388615;
        if (i5 == 1) {
            this.q = this.f16668f.centerX() - (measureText2 / 2.0f);
        } else if (i5 != 5) {
            this.q = this.f16668f.left;
        } else {
            this.q = this.f16668f.right - measureText2;
        }
        h();
        e0(f2);
    }

    private boolean c0(Typeface typeface) {
        e.e.b.b.w.a aVar = this.x;
        if (aVar != null) {
            aVar.c();
        }
        if (this.v == typeface) {
            return false;
        }
        this.v = typeface;
        return true;
    }

    private void d() {
        f(this.f16667e);
    }

    private boolean e(CharSequence charSequence) {
        return (G() ? c.h.i.e.f2738d : c.h.i.e.f2737c).a(charSequence, 0, charSequence.length());
    }

    private void e0(float f2) {
        g(f2);
        boolean z = a && this.F != 1.0f;
        this.C = z;
        if (z) {
            l();
        }
        u.Z(this.f16665c);
    }

    private void f(float f2) {
        E(f2);
        this.s = I(this.q, this.r, f2, this.L);
        this.t = I(this.o, this.p, f2, this.L);
        e0(I(this.f16673k, this.l, f2, this.M));
        TimeInterpolator timeInterpolator = e.e.b.b.m.a.f17506b;
        P(1.0f - I(0.0f, 1.0f, 1.0f - f2, timeInterpolator));
        X(I(1.0f, 0.0f, f2, timeInterpolator));
        if (this.n != this.m) {
            this.J.setColor(a(v(), t(), f2));
        } else {
            this.J.setColor(t());
        }
        this.J.setShadowLayer(I(this.R, this.N, f2, null), I(this.S, this.O, f2, null), I(this.T, this.P, f2, null), a(u(this.U), u(this.Q), f2));
        u.Z(this.f16665c);
    }

    private void g(float f2) {
        boolean z;
        float f3;
        boolean z2;
        if (this.z == null) {
            return;
        }
        float width = this.f16669g.width();
        float width2 = this.f16668f.width();
        if (F(f2, this.l)) {
            f3 = this.l;
            this.F = 1.0f;
            Typeface typeface = this.w;
            Typeface typeface2 = this.u;
            if (typeface != typeface2) {
                this.w = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f4 = this.f16673k;
            Typeface typeface3 = this.w;
            Typeface typeface4 = this.v;
            if (typeface3 != typeface4) {
                this.w = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (F(f2, f4)) {
                this.F = 1.0f;
            } else {
                this.F = f2 / this.f16673k;
            }
            float f5 = this.l / this.f16673k;
            width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
            f3 = f4;
            z2 = z;
        }
        if (width > 0.0f) {
            z2 = this.G != f3 || this.I || z2;
            this.G = f3;
            this.I = false;
        }
        if (this.A == null || z2) {
            this.J.setTextSize(this.G);
            this.J.setTypeface(this.w);
            this.J.setLinearText(this.F != 1.0f);
            this.B = e(this.z);
            StaticLayout i2 = i(l0() ? this.a0 : 1, width, this.B);
            this.V = i2;
            this.A = i2.getText();
        }
    }

    private void h() {
        Bitmap bitmap = this.D;
        if (bitmap != null) {
            bitmap.recycle();
            this.D = null;
        }
    }

    private StaticLayout i(int i2, float f2, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = g.c(this.z, this.J, (int) f2).e(TextUtils.TruncateAt.END).g(z).d(Layout.Alignment.ALIGN_NORMAL).f(false).h(i2).a();
        } catch (g.a e2) {
            Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
            staticLayout = null;
        }
        return (StaticLayout) c.h.j.j.c(staticLayout);
    }

    private void k(Canvas canvas, float f2, float f3, float f4, float f5) {
        int alpha = this.J.getAlpha();
        canvas.translate(f2, f4);
        float f6 = alpha;
        this.J.setAlpha((int) (this.X * f6));
        this.V.draw(canvas);
        canvas.translate(f3 - f2, 0.0f);
        this.J.setAlpha((int) (this.W * f6));
        CharSequence charSequence = this.Z;
        float f7 = -f5;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f7 / this.F, this.J);
        String trim = this.Z.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.J.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.V.getLineEnd(0), str.length()), 0.0f, f7 / this.F, (Paint) this.J);
    }

    private void l() {
        if (this.D != null || this.f16668f.isEmpty() || TextUtils.isEmpty(this.A)) {
            return;
        }
        f(0.0f);
        int width = this.V.getWidth();
        int height = this.V.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.D = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.V.draw(new Canvas(this.D));
        if (this.E == null) {
            this.E = new Paint(3);
        }
    }

    private boolean l0() {
        return (this.a0 <= 1 || this.B || this.C) ? false : true;
    }

    private float q(int i2, int i3) {
        if (i3 == 17 || (i3 & 7) == 1) {
            return (i2 / 2.0f) - (c() / 2.0f);
        }
        return ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.B ? this.f16669g.left : this.f16669g.right - c() : this.B ? this.f16669g.right - c() : this.f16669g.left;
    }

    private float r(RectF rectF, int i2, int i3) {
        if (i3 == 17 || (i3 & 7) == 1) {
            return (i2 / 2.0f) + (c() / 2.0f);
        }
        return ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.B ? rectF.left + c() : this.f16669g.right : this.B ? this.f16669g.right : rectF.left + c();
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.m);
    }

    public int A() {
        return this.a0;
    }

    public CharSequence B() {
        return this.z;
    }

    public final boolean H() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.n;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.m) != null && colorStateList.isStateful());
    }

    void J() {
        this.f16666d = this.f16669g.width() > 0 && this.f16669g.height() > 0 && this.f16668f.width() > 0 && this.f16668f.height() > 0;
    }

    public void K() {
        if (this.f16665c.getHeight() <= 0 || this.f16665c.getWidth() <= 0) {
            return;
        }
        b();
        d();
    }

    public void M(int i2, int i3, int i4, int i5) {
        if (L(this.f16669g, i2, i3, i4, i5)) {
            return;
        }
        this.f16669g.set(i2, i3, i4, i5);
        this.I = true;
        J();
    }

    public void N(Rect rect) {
        M(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void O(int i2) {
        e.e.b.b.w.d dVar = new e.e.b.b.w.d(this.f16665c.getContext(), i2);
        ColorStateList colorStateList = dVar.f17537b;
        if (colorStateList != null) {
            this.n = colorStateList;
        }
        float f2 = dVar.a;
        if (f2 != 0.0f) {
            this.l = f2;
        }
        ColorStateList colorStateList2 = dVar.f17544i;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dVar.f17545j;
        this.P = dVar.f17546k;
        this.N = dVar.l;
        e.e.b.b.w.a aVar = this.y;
        if (aVar != null) {
            aVar.c();
        }
        this.y = new e.e.b.b.w.a(new C0194a(), dVar.e());
        dVar.h(this.f16665c.getContext(), this.y);
        K();
    }

    public void Q(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            K();
        }
    }

    public void R(int i2) {
        if (this.f16672j != i2) {
            this.f16672j = i2;
            K();
        }
    }

    public void S(Typeface typeface) {
        if (T(typeface)) {
            K();
        }
    }

    public void U(int i2, int i3, int i4, int i5) {
        if (L(this.f16668f, i2, i3, i4, i5)) {
            return;
        }
        this.f16668f.set(i2, i3, i4, i5);
        this.I = true;
        J();
    }

    public void V(Rect rect) {
        U(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void W(int i2) {
        e.e.b.b.w.d dVar = new e.e.b.b.w.d(this.f16665c.getContext(), i2);
        ColorStateList colorStateList = dVar.f17537b;
        if (colorStateList != null) {
            this.m = colorStateList;
        }
        float f2 = dVar.a;
        if (f2 != 0.0f) {
            this.f16673k = f2;
        }
        ColorStateList colorStateList2 = dVar.f17544i;
        if (colorStateList2 != null) {
            this.U = colorStateList2;
        }
        this.S = dVar.f17545j;
        this.T = dVar.f17546k;
        this.R = dVar.l;
        e.e.b.b.w.a aVar = this.x;
        if (aVar != null) {
            aVar.c();
        }
        this.x = new e.e.b.b.w.a(new b(), dVar.e());
        dVar.h(this.f16665c.getContext(), this.x);
        K();
    }

    public void Y(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            K();
        }
    }

    public void Z(int i2) {
        if (this.f16671i != i2) {
            this.f16671i = i2;
            K();
        }
    }

    public void a0(float f2) {
        if (this.f16673k != f2) {
            this.f16673k = f2;
            K();
        }
    }

    public void b0(Typeface typeface) {
        if (c0(typeface)) {
            K();
        }
    }

    public float c() {
        if (this.z == null) {
            return 0.0f;
        }
        C(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.z;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void d0(float f2) {
        float a2 = c.h.g.a.a(f2, 0.0f, 1.0f);
        if (a2 != this.f16667e) {
            this.f16667e = a2;
            d();
        }
    }

    public void f0(int i2) {
        if (i2 != this.a0) {
            this.a0 = i2;
            h();
            K();
        }
    }

    public void g0(TimeInterpolator timeInterpolator) {
        this.L = timeInterpolator;
        K();
    }

    public final boolean h0(int[] iArr) {
        this.H = iArr;
        if (!H()) {
            return false;
        }
        K();
        return true;
    }

    public void i0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.z, charSequence)) {
            this.z = charSequence;
            this.A = null;
            h();
            K();
        }
    }

    public void j(Canvas canvas) {
        int save = canvas.save();
        if (this.A == null || !this.f16666d) {
            return;
        }
        float lineLeft = (this.s + this.V.getLineLeft(0)) - (this.Y * 2.0f);
        this.J.setTextSize(this.G);
        float f2 = this.s;
        float f3 = this.t;
        boolean z = this.C && this.D != null;
        float lineAscent = this.V.getLineAscent(0);
        float f4 = this.F;
        if (f4 != 1.0f) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (z) {
            canvas.drawBitmap(this.D, f2, f3 + lineAscent, this.E);
            canvas.restoreToCount(save);
            return;
        }
        if (l0()) {
            k(canvas, lineLeft, f2, f3, lineAscent);
        } else {
            canvas.translate(f2, f3 + lineAscent);
            this.V.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public void j0(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        K();
    }

    public void k0(Typeface typeface) {
        boolean T = T(typeface);
        boolean c0 = c0(typeface);
        if (T || c0) {
            K();
        }
    }

    public void m(RectF rectF, int i2, int i3) {
        this.B = e(this.z);
        rectF.left = q(i2, i3);
        rectF.top = this.f16669g.top;
        rectF.right = r(rectF, i2, i3);
        rectF.bottom = this.f16669g.top + p();
    }

    public ColorStateList n() {
        return this.n;
    }

    public int o() {
        return this.f16672j;
    }

    public float p() {
        C(this.K);
        return -this.K.ascent();
    }

    public Typeface s() {
        Typeface typeface = this.u;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int t() {
        return u(this.n);
    }

    public int w() {
        return this.f16671i;
    }

    public float x() {
        D(this.K);
        return -this.K.ascent();
    }

    public Typeface y() {
        Typeface typeface = this.v;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float z() {
        return this.f16667e;
    }
}
