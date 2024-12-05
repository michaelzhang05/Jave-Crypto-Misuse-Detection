package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
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
import androidx.core.text.u;
import androidx.core.view.b1;
import androidx.core.view.w;
import com.google.android.material.internal.h;
import z2.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f5041t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final Paint f5042u0 = null;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private z2.a D;
    private z2.a E;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    private final TextPaint V;
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f5043a;

    /* renamed from: a0, reason: collision with root package name */
    private float f5044a0;

    /* renamed from: b, reason: collision with root package name */
    private float f5045b;

    /* renamed from: b0, reason: collision with root package name */
    private float f5046b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5047c;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f5048c0;

    /* renamed from: d, reason: collision with root package name */
    private float f5049d;

    /* renamed from: d0, reason: collision with root package name */
    private float f5050d0;

    /* renamed from: e, reason: collision with root package name */
    private float f5051e;

    /* renamed from: e0, reason: collision with root package name */
    private float f5052e0;

    /* renamed from: f, reason: collision with root package name */
    private int f5053f;

    /* renamed from: f0, reason: collision with root package name */
    private float f5054f0;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f5055g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f5056g0;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f5057h;

    /* renamed from: h0, reason: collision with root package name */
    private float f5058h0;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f5059i;

    /* renamed from: i0, reason: collision with root package name */
    private float f5060i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f5062j0;

    /* renamed from: k0, reason: collision with root package name */
    private StaticLayout f5064k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f5066l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f5068m0;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f5069n;

    /* renamed from: n0, reason: collision with root package name */
    private float f5070n0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f5071o;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f5072o0;

    /* renamed from: p, reason: collision with root package name */
    private int f5073p;

    /* renamed from: q, reason: collision with root package name */
    private float f5075q;

    /* renamed from: r, reason: collision with root package name */
    private float f5077r;

    /* renamed from: s, reason: collision with root package name */
    private float f5079s;

    /* renamed from: t, reason: collision with root package name */
    private float f5081t;

    /* renamed from: u, reason: collision with root package name */
    private float f5082u;

    /* renamed from: v, reason: collision with root package name */
    private float f5083v;

    /* renamed from: w, reason: collision with root package name */
    private Typeface f5084w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f5085x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f5086y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f5087z;

    /* renamed from: j, reason: collision with root package name */
    private int f5061j = 16;

    /* renamed from: k, reason: collision with root package name */
    private int f5063k = 16;

    /* renamed from: l, reason: collision with root package name */
    private float f5065l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f5067m = 15.0f;
    private TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    private boolean J = true;

    /* renamed from: p0, reason: collision with root package name */
    private int f5074p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private float f5076q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    private float f5078r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    private int f5080s0 = h.f5097n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0086a implements a.InterfaceC0153a {
        C0086a() {
        }

        @Override // z2.a.InterfaceC0153a
        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f5043a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f5057h = new Rect();
        this.f5055g = new Rect();
        this.f5059i = new RectF();
        this.f5051e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f5065l);
        textPaint.setTypeface(this.f5087z);
        textPaint.setLetterSpacing(this.f5060i0);
    }

    private void B(float f6) {
        if (this.f5047c) {
            this.f5059i.set(f6 < this.f5051e ? this.f5055g : this.f5057h);
            return;
        }
        this.f5059i.left = G(this.f5055g.left, this.f5057h.left, f6, this.X);
        this.f5059i.top = G(this.f5075q, this.f5077r, f6, this.X);
        this.f5059i.right = G(this.f5055g.right, this.f5057h.right, f6, this.X);
        this.f5059i.bottom = G(this.f5055g.bottom, this.f5057h.bottom, f6, this.X);
    }

    private static boolean C(float f6, float f7) {
        return Math.abs(f6 - f7) < 1.0E-5f;
    }

    private boolean D() {
        return b1.E(this.f5043a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z5) {
        return (z5 ? u.f2253d : u.f2252c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f6, float f7, float f8, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f8 = timeInterpolator.getInterpolation(f8);
        }
        return n2.a.a(f6, f7, f8);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i6, int i7, int i8, int i9) {
        return rect.left == i6 && rect.top == i7 && rect.right == i8 && rect.bottom == i9;
    }

    private void Q(float f6) {
        this.f5068m0 = f6;
        b1.h0(this.f5043a);
    }

    private boolean U(Typeface typeface) {
        z2.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f5086y == typeface) {
            return false;
        }
        this.f5086y = typeface;
        Typeface b6 = z2.i.b(this.f5043a.getContext().getResources().getConfiguration(), typeface);
        this.f5085x = b6;
        if (b6 == null) {
            b6 = this.f5086y;
        }
        this.f5084w = b6;
        return true;
    }

    private void Y(float f6) {
        this.f5070n0 = f6;
        b1.h0(this.f5043a);
    }

    private static int a(int i6, int i7, float f6) {
        float f7 = 1.0f - f6;
        return Color.argb(Math.round((Color.alpha(i6) * f7) + (Color.alpha(i7) * f6)), Math.round((Color.red(i6) * f7) + (Color.red(i7) * f6)), Math.round((Color.green(i6) * f7) + (Color.green(i7) * f6)), Math.round((Color.blue(i6) * f7) + (Color.blue(i7) * f6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(boolean r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.b(boolean):void");
    }

    private boolean b0(Typeface typeface) {
        z2.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface b6 = z2.i.b(this.f5043a.getContext().getResources().getConfiguration(), typeface);
        this.A = b6;
        if (b6 == null) {
            b6 = this.B;
        }
        this.f5087z = b6;
        return true;
    }

    private void c() {
        g(this.f5045b);
    }

    private float d(float f6) {
        float f7 = this.f5051e;
        return f6 <= f7 ? n2.a.b(1.0f, 0.0f, this.f5049d, f7, f6) : n2.a.b(0.0f, 1.0f, f7, 1.0f, f6);
    }

    private void d0(float f6) {
        h(f6);
        boolean z5 = f5041t0 && this.N != 1.0f;
        this.K = z5;
        if (z5) {
            n();
        }
        b1.h0(this.f5043a);
    }

    private float e() {
        float f6 = this.f5049d;
        return f6 + ((1.0f - f6) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean D = D();
        return this.J ? F(charSequence, D) : D;
    }

    private void g(float f6) {
        float f7;
        B(f6);
        if (!this.f5047c) {
            this.f5082u = G(this.f5079s, this.f5081t, f6, this.X);
            this.f5083v = G(this.f5075q, this.f5077r, f6, this.X);
            d0(f6);
            f7 = f6;
        } else if (f6 < this.f5051e) {
            this.f5082u = this.f5079s;
            this.f5083v = this.f5075q;
            d0(0.0f);
            f7 = 0.0f;
        } else {
            this.f5082u = this.f5081t;
            this.f5083v = this.f5077r - Math.max(0, this.f5053f);
            d0(1.0f);
            f7 = 1.0f;
        }
        TimeInterpolator timeInterpolator = n2.a.f7962b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f6, timeInterpolator));
        Y(G(1.0f, 0.0f, f6, timeInterpolator));
        if (this.f5071o != this.f5069n) {
            this.V.setColor(a(v(), t(), f7));
        } else {
            this.V.setColor(t());
        }
        float f8 = this.f5058h0;
        float f9 = this.f5060i0;
        if (f8 != f9) {
            this.V.setLetterSpacing(G(f9, f8, f6, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f8);
        }
        this.P = G(this.f5050d0, this.Z, f6, null);
        this.Q = G(this.f5052e0, this.f5044a0, f6, null);
        this.R = G(this.f5054f0, this.f5046b0, f6, null);
        int a6 = a(u(this.f5056g0), u(this.f5048c0), f6);
        this.S = a6;
        this.V.setShadowLayer(this.P, this.Q, this.R, a6);
        if (this.f5047c) {
            this.V.setAlpha((int) (d(f6) * this.V.getAlpha()));
        }
        b1.h0(this.f5043a);
    }

    private void h(float f6) {
        i(f6, false);
    }

    private void i(float f6, boolean z5) {
        float f7;
        float f8;
        Typeface typeface;
        if (this.G == null) {
            return;
        }
        float width = this.f5057h.width();
        float width2 = this.f5055g.width();
        if (C(f6, 1.0f)) {
            f7 = this.f5067m;
            f8 = this.f5058h0;
            this.N = 1.0f;
            typeface = this.f5084w;
        } else {
            float f9 = this.f5065l;
            float f10 = this.f5060i0;
            Typeface typeface2 = this.f5087z;
            if (C(f6, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = G(this.f5065l, this.f5067m, f6, this.Y) / this.f5065l;
            }
            float f11 = this.f5067m / this.f5065l;
            width = (!z5 && width2 * f11 > width) ? Math.min(width / f11, width2) : width2;
            f7 = f9;
            f8 = f10;
            typeface = typeface2;
        }
        if (width > 0.0f) {
            boolean z6 = this.O != f7;
            boolean z7 = this.f5062j0 != f8;
            boolean z8 = this.C != typeface;
            StaticLayout staticLayout = this.f5064k0;
            boolean z9 = z6 || z7 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z8 || this.U;
            this.O = f7;
            this.f5062j0 = f8;
            this.C = typeface;
            this.U = false;
            this.V.setLinearText(this.N != 1.0f);
            r5 = z9;
        }
        if (this.H == null || r5) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.f5062j0);
            this.I = f(this.G);
            StaticLayout k6 = k(j0() ? this.f5074p0 : 1, width, this.I);
            this.f5064k0 = k6;
            this.H = k6.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private boolean j0() {
        return this.f5074p0 > 1 && (!this.I || this.f5047c) && !this.K;
    }

    private StaticLayout k(int i6, float f6, boolean z5) {
        StaticLayout staticLayout = null;
        try {
            staticLayout = h.c(this.G, this.V, (int) f6).e(this.F).h(z5).d(i6 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).g(false).j(i6).i(this.f5076q0, this.f5078r0).f(this.f5080s0).k(null).a();
        } catch (h.a e6) {
            Log.e("CollapsingTextHelper", e6.getCause().getMessage(), e6);
        }
        return (StaticLayout) androidx.core.util.h.f(staticLayout);
    }

    private void m(Canvas canvas, float f6, float f7) {
        int alpha = this.V.getAlpha();
        canvas.translate(f6, f7);
        float f8 = alpha;
        this.V.setAlpha((int) (this.f5070n0 * f8));
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            TextPaint textPaint = this.V;
            textPaint.setShadowLayer(this.P, this.Q, this.R, r2.a.a(this.S, textPaint.getAlpha()));
        }
        this.f5064k0.draw(canvas);
        this.V.setAlpha((int) (this.f5068m0 * f8));
        if (i6 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, r2.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f5064k0.getLineBaseline(0);
        CharSequence charSequence = this.f5072o0;
        float f9 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f9, this.V);
        if (i6 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.f5047c) {
            return;
        }
        String trim = this.f5072o0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f5064k0.getLineEnd(0), str.length()), 0.0f, f9, (Paint) this.V);
    }

    private void n() {
        if (this.L != null || this.f5055g.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.f5064k0.getWidth();
        int height = this.f5064k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f5064k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    private float r(int i6, int i7) {
        return (i7 == 17 || (i7 & 7) == 1) ? (i6 / 2.0f) - (this.f5066l0 / 2.0f) : ((i7 & 8388613) == 8388613 || (i7 & 5) == 5) ? this.I ? this.f5057h.left : this.f5057h.right - this.f5066l0 : this.I ? this.f5057h.right - this.f5066l0 : this.f5057h.left;
    }

    private float s(RectF rectF, int i6, int i7) {
        return (i7 == 17 || (i7 & 7) == 1) ? (i6 / 2.0f) + (this.f5066l0 / 2.0f) : ((i7 & 8388613) == 8388613 || (i7 & 5) == 5) ? this.I ? rectF.left + this.f5066l0 : this.f5057h.right : this.I ? this.f5057h.right : rectF.left + this.f5066l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f5069n);
    }

    private Layout.Alignment y() {
        int b6 = w.b(this.f5061j, this.I ? 1 : 0) & 7;
        return b6 != 1 ? b6 != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f5067m);
        textPaint.setTypeface(this.f5084w);
        textPaint.setLetterSpacing(this.f5058h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f5071o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f5069n) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f5086y;
            if (typeface != null) {
                this.f5085x = z2.i.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = z2.i.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f5085x;
            if (typeface3 == null) {
                typeface3 = this.f5086y;
            }
            this.f5084w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f5087z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z5) {
        if ((this.f5043a.getHeight() <= 0 || this.f5043a.getWidth() <= 0) && !z5) {
            return;
        }
        b(z5);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f5071o == colorStateList && this.f5069n == colorStateList) {
            return;
        }
        this.f5071o = colorStateList;
        this.f5069n = colorStateList;
        J();
    }

    public void N(int i6, int i7, int i8, int i9) {
        if (L(this.f5057h, i6, i7, i8, i9)) {
            return;
        }
        this.f5057h.set(i6, i7, i8, i9);
        this.U = true;
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i6) {
        z2.d dVar = new z2.d(this.f5043a.getContext(), i6);
        if (dVar.i() != null) {
            this.f5071o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f5067m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f9951c;
        if (colorStateList != null) {
            this.f5048c0 = colorStateList;
        }
        this.f5044a0 = dVar.f9956h;
        this.f5046b0 = dVar.f9957i;
        this.Z = dVar.f9958j;
        this.f5058h0 = dVar.f9960l;
        z2.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new z2.a(new C0086a(), dVar.e());
        dVar.h(this.f5043a.getContext(), this.E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f5071o != colorStateList) {
            this.f5071o = colorStateList;
            J();
        }
    }

    public void S(int i6) {
        if (this.f5063k != i6) {
            this.f5063k = i6;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i6, int i7, int i8, int i9) {
        if (L(this.f5055g, i6, i7, i8, i9)) {
            return;
        }
        this.f5055g.set(i6, i7, i8, i9);
        this.U = true;
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f6) {
        if (this.f5060i0 != f6) {
            this.f5060i0 = f6;
            J();
        }
    }

    public void Z(int i6) {
        if (this.f5061j != i6) {
            this.f5061j = i6;
            J();
        }
    }

    public void a0(float f6) {
        if (this.f5065l != f6) {
            this.f5065l = f6;
            J();
        }
    }

    public void c0(float f6) {
        float a6 = u.a.a(f6, 0.0f, 1.0f);
        if (a6 != this.f5045b) {
            this.f5045b = a6;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean U = U(typeface);
        boolean b02 = b0(typeface);
        if (U || b02) {
            J();
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.H == null || this.f5059i.width() <= 0.0f || this.f5059i.height() <= 0.0f) {
            return;
        }
        this.V.setTextSize(this.O);
        float f6 = this.f5082u;
        float f7 = this.f5083v;
        boolean z5 = this.K && this.L != null;
        float f8 = this.N;
        if (f8 != 1.0f && !this.f5047c) {
            canvas.scale(f8, f8, f6, f7);
        }
        if (z5) {
            canvas.drawBitmap(this.L, f6, f7, this.M);
            canvas.restoreToCount(save);
            return;
        }
        if (!j0() || (this.f5047c && this.f5045b <= this.f5051e)) {
            canvas.translate(f6, f7);
            this.f5064k0.draw(canvas);
        } else {
            m(canvas, this.f5082u - this.f5064k0.getLineStart(0), f7);
        }
        canvas.restoreToCount(save);
    }

    public void o(RectF rectF, int i6, int i7) {
        this.I = f(this.G);
        rectF.left = Math.max(r(i6, i7), this.f5057h.left);
        rectF.top = this.f5057h.top;
        rectF.right = Math.min(s(rectF, i6, i7), this.f5057h.right);
        rectF.bottom = this.f5057h.top + q();
    }

    public ColorStateList p() {
        return this.f5071o;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public int t() {
        return u(this.f5071o);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.f5045b;
    }
}
