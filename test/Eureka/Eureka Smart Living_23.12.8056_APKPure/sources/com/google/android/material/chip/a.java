package com.google.android.material.chip;

import a3.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import c3.g;
import com.google.android.material.internal.j;
import com.google.android.material.internal.n;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n2.c;
import z2.d;

/* loaded from: classes.dex */
public class a extends g implements Drawable.Callback, j.b {
    private static final int[] J0 = {R.attr.state_enabled};
    private static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    private ColorStateList A;
    private PorterDuff.Mode A0;
    private float B;
    private int[] B0;
    private float C;
    private boolean C0;
    private ColorStateList D;
    private ColorStateList D0;
    private float E;
    private WeakReference E0;
    private ColorStateList F;
    private TextUtils.TruncateAt F0;
    private CharSequence G;
    private boolean G0;
    private boolean H;
    private int H0;
    private Drawable I;
    private boolean I0;
    private ColorStateList J;
    private float K;
    private boolean L;
    private boolean M;
    private Drawable N;
    private Drawable O;
    private ColorStateList P;
    private float Q;
    private CharSequence R;
    private boolean S;
    private boolean T;
    private Drawable U;
    private ColorStateList V;
    private c W;
    private c X;
    private float Y;
    private float Z;

    /* renamed from: a0, reason: collision with root package name */
    private float f4880a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f4881b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f4882c0;

    /* renamed from: d0, reason: collision with root package name */
    private float f4883d0;

    /* renamed from: e0, reason: collision with root package name */
    private float f4884e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f4885f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Context f4886g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Paint f4887h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Paint f4888i0;

    /* renamed from: j0, reason: collision with root package name */
    private final Paint.FontMetrics f4889j0;

    /* renamed from: k0, reason: collision with root package name */
    private final RectF f4890k0;

    /* renamed from: l0, reason: collision with root package name */
    private final PointF f4891l0;

    /* renamed from: m0, reason: collision with root package name */
    private final Path f4892m0;

    /* renamed from: n0, reason: collision with root package name */
    private final j f4893n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f4894o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f4895p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f4896q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f4897r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f4898s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f4899t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f4900u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f4901v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f4902w0;

    /* renamed from: x0, reason: collision with root package name */
    private ColorFilter f4903x0;

    /* renamed from: y0, reason: collision with root package name */
    private PorterDuffColorFilter f4904y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f4905z;

    /* renamed from: z0, reason: collision with root package name */
    private ColorStateList f4906z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0083a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.C = -1.0f;
        this.f4887h0 = new Paint(1);
        this.f4889j0 = new Paint.FontMetrics();
        this.f4890k0 = new RectF();
        this.f4891l0 = new PointF();
        this.f4892m0 = new Path();
        this.f4902w0 = 255;
        this.A0 = PorterDuff.Mode.SRC_IN;
        this.E0 = new WeakReference(null);
        H(context);
        this.f4886g0 = context;
        j jVar = new j(this);
        this.f4893n0 = jVar;
        this.G = "";
        jVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f4888i0 = null;
        int[] iArr = J0;
        setState(iArr);
        d2(iArr);
        this.G0 = true;
        if (b.f39a) {
            K0.setTint(-1);
        }
    }

    private boolean F2() {
        return this.T && this.U != null && this.f4900u0;
    }

    private boolean G2() {
        return this.H && this.I != null;
    }

    private boolean H2() {
        return this.M && this.N != null;
    }

    private void I2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void J2() {
        this.D0 = this.C0 ? b.b(this.F) : null;
    }

    private void K2() {
        this.O = new RippleDrawable(b.b(X0()), this.N, K0);
    }

    private float R0() {
        Drawable drawable = this.f4900u0 ? this.U : this.I;
        float f6 = this.K;
        if (f6 <= 0.0f && drawable != null) {
            f6 = (float) Math.ceil(n.b(this.f4886g0, 24));
            if (drawable.getIntrinsicHeight() <= f6) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f6;
    }

    private float S0() {
        Drawable drawable = this.f4900u0 ? this.U : this.I;
        float f6 = this.K;
        return (f6 > 0.0f || drawable == null) ? f6 : drawable.getIntrinsicWidth();
    }

    private void T1(ColorStateList colorStateList) {
        if (this.f4905z != colorStateList) {
            this.f4905z = colorStateList;
            onStateChange(getState());
        }
    }

    private void c0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(O0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            androidx.core.graphics.drawable.a.o(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void d0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (G2() || F2()) {
            float f6 = this.Y + this.Z;
            float S0 = S0();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f7 = rect.left + f6;
                rectF.left = f7;
                rectF.right = f7 + S0;
            } else {
                float f8 = rect.right - f6;
                rectF.right = f8;
                rectF.left = f8 - S0;
            }
            float R0 = R0();
            float exactCenterY = rect.exactCenterY() - (R0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + R0;
        }
    }

    private ColorFilter d1() {
        ColorFilter colorFilter = this.f4903x0;
        return colorFilter != null ? colorFilter : this.f4904y0;
    }

    private void f0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (H2()) {
            float f6 = this.f4885f0 + this.f4884e0 + this.Q + this.f4883d0 + this.f4882c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f6;
            } else {
                rectF.left = rect.left + f6;
            }
        }
    }

    private static boolean f1(int[] iArr, int i6) {
        if (iArr == null) {
            return false;
        }
        for (int i7 : iArr) {
            if (i7 == i6) {
                return true;
            }
        }
        return false;
    }

    private void g0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (H2()) {
            float f6 = this.f4885f0 + this.f4884e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f7 = rect.right - f6;
                rectF.right = f7;
                rectF.left = f7 - this.Q;
            } else {
                float f8 = rect.left + f6;
                rectF.left = f8;
                rectF.right = f8 + this.Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f9 = this.Q;
            float f10 = exactCenterY - (f9 / 2.0f);
            rectF.top = f10;
            rectF.bottom = f10 + f9;
        }
    }

    private void h0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (H2()) {
            float f6 = this.f4885f0 + this.f4884e0 + this.Q + this.f4883d0 + this.f4882c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f7 = rect.right;
                rectF.right = f7;
                rectF.left = f7 - f6;
            } else {
                int i6 = rect.left;
                rectF.left = i6;
                rectF.right = i6 + f6;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.G != null) {
            float e02 = this.Y + e0() + this.f4881b0;
            float i02 = this.f4885f0 + i0() + this.f4882c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + e02;
                rectF.right = rect.right - i02;
            } else {
                rectF.left = rect.left + i02;
                rectF.right = rect.right - e02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean j1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float k0() {
        this.f4893n0.e().getFontMetrics(this.f4889j0);
        Paint.FontMetrics fontMetrics = this.f4889j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean k1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean l1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private boolean m0() {
        return this.T && this.U != null && this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.m1(android.util.AttributeSet, int, int):void");
    }

    public static a n0(Context context, AttributeSet attributeSet, int i6, int i7) {
        a aVar = new a(context, attributeSet, i6, i7);
        aVar.m1(attributeSet, i6, i7);
        return aVar;
    }

    private void o0(Canvas canvas, Rect rect) {
        if (F2()) {
            d0(rect, this.f4890k0);
            RectF rectF = this.f4890k0;
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas.translate(f6, f7);
            this.U.setBounds(0, 0, (int) this.f4890k0.width(), (int) this.f4890k0.height());
            this.U.draw(canvas);
            canvas.translate(-f6, -f7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean o1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.o1(int[], int[]):boolean");
    }

    private void p0(Canvas canvas, Rect rect) {
        if (this.I0) {
            return;
        }
        this.f4887h0.setColor(this.f4895p0);
        this.f4887h0.setStyle(Paint.Style.FILL);
        this.f4887h0.setColorFilter(d1());
        this.f4890k0.set(rect);
        canvas.drawRoundRect(this.f4890k0, A0(), A0(), this.f4887h0);
    }

    private void q0(Canvas canvas, Rect rect) {
        if (G2()) {
            d0(rect, this.f4890k0);
            RectF rectF = this.f4890k0;
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas.translate(f6, f7);
            this.I.setBounds(0, 0, (int) this.f4890k0.width(), (int) this.f4890k0.height());
            this.I.draw(canvas);
            canvas.translate(-f6, -f7);
        }
    }

    private void r0(Canvas canvas, Rect rect) {
        if (this.E <= 0.0f || this.I0) {
            return;
        }
        this.f4887h0.setColor(this.f4897r0);
        this.f4887h0.setStyle(Paint.Style.STROKE);
        if (!this.I0) {
            this.f4887h0.setColorFilter(d1());
        }
        RectF rectF = this.f4890k0;
        float f6 = rect.left;
        float f7 = this.E;
        rectF.set(f6 + (f7 / 2.0f), rect.top + (f7 / 2.0f), rect.right - (f7 / 2.0f), rect.bottom - (f7 / 2.0f));
        float f8 = this.C - (this.E / 2.0f);
        canvas.drawRoundRect(this.f4890k0, f8, f8, this.f4887h0);
    }

    private void s0(Canvas canvas, Rect rect) {
        if (this.I0) {
            return;
        }
        this.f4887h0.setColor(this.f4894o0);
        this.f4887h0.setStyle(Paint.Style.FILL);
        this.f4890k0.set(rect);
        canvas.drawRoundRect(this.f4890k0, A0(), A0(), this.f4887h0);
    }

    private void t0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (H2()) {
            g0(rect, this.f4890k0);
            RectF rectF = this.f4890k0;
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas.translate(f6, f7);
            this.N.setBounds(0, 0, (int) this.f4890k0.width(), (int) this.f4890k0.height());
            if (b.f39a) {
                this.O.setBounds(this.N.getBounds());
                this.O.jumpToCurrentState();
                drawable = this.O;
            } else {
                drawable = this.N;
            }
            drawable.draw(canvas);
            canvas.translate(-f6, -f7);
        }
    }

    private void u0(Canvas canvas, Rect rect) {
        this.f4887h0.setColor(this.f4898s0);
        this.f4887h0.setStyle(Paint.Style.FILL);
        this.f4890k0.set(rect);
        if (!this.I0) {
            canvas.drawRoundRect(this.f4890k0, A0(), A0(), this.f4887h0);
        } else {
            h(new RectF(rect), this.f4892m0);
            super.p(canvas, this.f4887h0, this.f4892m0, s());
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        Paint paint = this.f4888i0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.j(-16777216, 127));
            canvas.drawRect(rect, this.f4888i0);
            if (G2() || F2()) {
                d0(rect, this.f4890k0);
                canvas.drawRect(this.f4890k0, this.f4888i0);
            }
            if (this.G != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f4888i0);
            }
            if (H2()) {
                g0(rect, this.f4890k0);
                canvas.drawRect(this.f4890k0, this.f4888i0);
            }
            this.f4888i0.setColor(androidx.core.graphics.a.j(-65536, 127));
            f0(rect, this.f4890k0);
            canvas.drawRect(this.f4890k0, this.f4888i0);
            this.f4888i0.setColor(androidx.core.graphics.a.j(-16711936, 127));
            h0(rect, this.f4890k0);
            canvas.drawRect(this.f4890k0, this.f4888i0);
        }
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.G != null) {
            Paint.Align l02 = l0(rect, this.f4891l0);
            j0(rect, this.f4890k0);
            if (this.f4893n0.d() != null) {
                this.f4893n0.e().drawableState = getState();
                this.f4893n0.j(this.f4886g0);
            }
            this.f4893n0.e().setTextAlign(l02);
            int i6 = 0;
            boolean z5 = Math.round(this.f4893n0.f(Z0().toString())) > Math.round(this.f4890k0.width());
            if (z5) {
                i6 = canvas.save();
                canvas.clipRect(this.f4890k0);
            }
            CharSequence charSequence = this.G;
            if (z5 && this.F0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f4893n0.e(), this.f4890k0.width(), this.F0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f4891l0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f4893n0.e());
            if (z5) {
                canvas.restoreToCount(i6);
            }
        }
    }

    public float A0() {
        return this.I0 ? B() : this.C;
    }

    public void A1(int i6) {
        z1(this.f4886g0.getResources().getDimension(i6));
    }

    public void A2(float f6) {
        d a12 = a1();
        if (a12 != null) {
            a12.l(f6);
            this.f4893n0.e().setTextSize(f6);
            a();
        }
    }

    public float B0() {
        return this.f4885f0;
    }

    public void B1(float f6) {
        if (this.f4885f0 != f6) {
            this.f4885f0 = f6;
            invalidateSelf();
            n1();
        }
    }

    public void B2(float f6) {
        if (this.f4881b0 != f6) {
            this.f4881b0 = f6;
            invalidateSelf();
            n1();
        }
    }

    public Drawable C0() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void C1(int i6) {
        B1(this.f4886g0.getResources().getDimension(i6));
    }

    public void C2(int i6) {
        B2(this.f4886g0.getResources().getDimension(i6));
    }

    public float D0() {
        return this.K;
    }

    public void D1(Drawable drawable) {
        Drawable C0 = C0();
        if (C0 != drawable) {
            float e02 = e0();
            this.I = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float e03 = e0();
            I2(C0);
            if (G2()) {
                c0(this.I);
            }
            invalidateSelf();
            if (e02 != e03) {
                n1();
            }
        }
    }

    public void D2(boolean z5) {
        if (this.C0 != z5) {
            this.C0 = z5;
            J2();
            onStateChange(getState());
        }
    }

    public ColorStateList E0() {
        return this.J;
    }

    public void E1(int i6) {
        D1(e.a.b(this.f4886g0, i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E2() {
        return this.G0;
    }

    public float F0() {
        return this.B;
    }

    public void F1(float f6) {
        if (this.K != f6) {
            float e02 = e0();
            this.K = f6;
            float e03 = e0();
            invalidateSelf();
            if (e02 != e03) {
                n1();
            }
        }
    }

    public float G0() {
        return this.Y;
    }

    public void G1(int i6) {
        F1(this.f4886g0.getResources().getDimension(i6));
    }

    public ColorStateList H0() {
        return this.D;
    }

    public void H1(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (G2()) {
                androidx.core.graphics.drawable.a.o(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float I0() {
        return this.E;
    }

    public void I1(int i6) {
        H1(e.a.a(this.f4886g0, i6));
    }

    public Drawable J0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void J1(int i6) {
        K1(this.f4886g0.getResources().getBoolean(i6));
    }

    public CharSequence K0() {
        return this.R;
    }

    public void K1(boolean z5) {
        if (this.H != z5) {
            boolean G2 = G2();
            this.H = z5;
            boolean G22 = G2();
            if (G2 != G22) {
                if (G22) {
                    c0(this.I);
                } else {
                    I2(this.I);
                }
                invalidateSelf();
                n1();
            }
        }
    }

    public float L0() {
        return this.f4884e0;
    }

    public void L1(float f6) {
        if (this.B != f6) {
            this.B = f6;
            invalidateSelf();
            n1();
        }
    }

    public float M0() {
        return this.Q;
    }

    public void M1(int i6) {
        L1(this.f4886g0.getResources().getDimension(i6));
    }

    public float N0() {
        return this.f4883d0;
    }

    public void N1(float f6) {
        if (this.Y != f6) {
            this.Y = f6;
            invalidateSelf();
            n1();
        }
    }

    public int[] O0() {
        return this.B0;
    }

    public void O1(int i6) {
        N1(this.f4886g0.getResources().getDimension(i6));
    }

    public ColorStateList P0() {
        return this.P;
    }

    public void P1(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.I0) {
                X(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Q0(RectF rectF) {
        h0(getBounds(), rectF);
    }

    public void Q1(int i6) {
        P1(e.a.a(this.f4886g0, i6));
    }

    public void R1(float f6) {
        if (this.E != f6) {
            this.E = f6;
            this.f4887h0.setStrokeWidth(f6);
            if (this.I0) {
                super.Y(f6);
            }
            invalidateSelf();
        }
    }

    public void S1(int i6) {
        R1(this.f4886g0.getResources().getDimension(i6));
    }

    public TextUtils.TruncateAt T0() {
        return this.F0;
    }

    public c U0() {
        return this.X;
    }

    public void U1(Drawable drawable) {
        Drawable J02 = J0();
        if (J02 != drawable) {
            float i02 = i0();
            this.N = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (b.f39a) {
                K2();
            }
            float i03 = i0();
            I2(J02);
            if (H2()) {
                c0(this.N);
            }
            invalidateSelf();
            if (i02 != i03) {
                n1();
            }
        }
    }

    public float V0() {
        return this.f4880a0;
    }

    public void V1(CharSequence charSequence) {
        if (this.R != charSequence) {
            this.R = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float W0() {
        return this.Z;
    }

    public void W1(float f6) {
        if (this.f4884e0 != f6) {
            this.f4884e0 = f6;
            invalidateSelf();
            if (H2()) {
                n1();
            }
        }
    }

    public ColorStateList X0() {
        return this.F;
    }

    public void X1(int i6) {
        W1(this.f4886g0.getResources().getDimension(i6));
    }

    public c Y0() {
        return this.W;
    }

    public void Y1(int i6) {
        U1(e.a.b(this.f4886g0, i6));
    }

    public CharSequence Z0() {
        return this.G;
    }

    public void Z1(float f6) {
        if (this.Q != f6) {
            this.Q = f6;
            invalidateSelf();
            if (H2()) {
                n1();
            }
        }
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        n1();
        invalidateSelf();
    }

    public d a1() {
        return this.f4893n0.d();
    }

    public void a2(int i6) {
        Z1(this.f4886g0.getResources().getDimension(i6));
    }

    public float b1() {
        return this.f4882c0;
    }

    public void b2(float f6) {
        if (this.f4883d0 != f6) {
            this.f4883d0 = f6;
            invalidateSelf();
            if (H2()) {
                n1();
            }
        }
    }

    public float c1() {
        return this.f4881b0;
    }

    public void c2(int i6) {
        b2(this.f4886g0.getResources().getDimension(i6));
    }

    public boolean d2(int[] iArr) {
        if (Arrays.equals(this.B0, iArr)) {
            return false;
        }
        this.B0 = iArr;
        if (H2()) {
            return o1(getState(), iArr);
        }
        return false;
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i6 = this.f4902w0;
        int a6 = i6 < 255 ? o2.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i6) : 0;
        s0(canvas, bounds);
        p0(canvas, bounds);
        if (this.I0) {
            super.draw(canvas);
        }
        r0(canvas, bounds);
        u0(canvas, bounds);
        q0(canvas, bounds);
        o0(canvas, bounds);
        if (this.G0) {
            w0(canvas, bounds);
        }
        t0(canvas, bounds);
        v0(canvas, bounds);
        if (this.f4902w0 < 255) {
            canvas.restoreToCount(a6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e0() {
        if (G2() || F2()) {
            return this.Z + S0() + this.f4880a0;
        }
        return 0.0f;
    }

    public boolean e1() {
        return this.C0;
    }

    public void e2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (H2()) {
                androidx.core.graphics.drawable.a.o(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void f2(int i6) {
        e2(e.a.a(this.f4886g0, i6));
    }

    public boolean g1() {
        return this.S;
    }

    public void g2(boolean z5) {
        if (this.M != z5) {
            boolean H2 = H2();
            this.M = z5;
            boolean H22 = H2();
            if (H2 != H22) {
                if (H22) {
                    c0(this.N);
                } else {
                    I2(this.N);
                }
                invalidateSelf();
                n1();
            }
        }
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4902w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f4903x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Y + e0() + this.f4881b0 + this.f4893n0.f(Z0().toString()) + this.f4882c0 + i0() + this.f4885f0), this.H0);
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public boolean h1() {
        return k1(this.N);
    }

    public void h2(InterfaceC0083a interfaceC0083a) {
        this.E0 = new WeakReference(interfaceC0083a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i0() {
        if (H2()) {
            return this.f4883d0 + this.Q + this.f4884e0;
        }
        return 0.0f;
    }

    public boolean i1() {
        return this.M;
    }

    public void i2(TextUtils.TruncateAt truncateAt) {
        this.F0 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return j1(this.f4905z) || j1(this.A) || j1(this.D) || (this.C0 && j1(this.D0)) || l1(this.f4893n0.d()) || m0() || k1(this.I) || k1(this.U) || j1(this.f4906z0);
    }

    public void j2(c cVar) {
        this.X = cVar;
    }

    public void k2(int i6) {
        j2(c.c(this.f4886g0, i6));
    }

    Paint.Align l0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.G != null) {
            float e02 = this.Y + e0() + this.f4881b0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + e02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - e02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - k0();
        }
        return align;
    }

    public void l2(float f6) {
        if (this.f4880a0 != f6) {
            float e02 = e0();
            this.f4880a0 = f6;
            float e03 = e0();
            invalidateSelf();
            if (e02 != e03) {
                n1();
            }
        }
    }

    public void m2(int i6) {
        l2(this.f4886g0.getResources().getDimension(i6));
    }

    protected void n1() {
        InterfaceC0083a interfaceC0083a = (InterfaceC0083a) this.E0.get();
        if (interfaceC0083a != null) {
            interfaceC0083a.a();
        }
    }

    public void n2(float f6) {
        if (this.Z != f6) {
            float e02 = e0();
            this.Z = f6;
            float e03 = e0();
            invalidateSelf();
            if (e02 != e03) {
                n1();
            }
        }
    }

    public void o2(int i6) {
        n2(this.f4886g0.getResources().getDimension(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i6) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i6);
        if (G2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.I, i6);
        }
        if (F2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.U, i6);
        }
        if (H2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.N, i6);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i6) {
        boolean onLevelChange = super.onLevelChange(i6);
        if (G2()) {
            onLevelChange |= this.I.setLevel(i6);
        }
        if (F2()) {
            onLevelChange |= this.U.setLevel(i6);
        }
        if (H2()) {
            onLevelChange |= this.N.setLevel(i6);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return o1(iArr, O0());
    }

    public void p1(boolean z5) {
        if (this.S != z5) {
            this.S = z5;
            float e02 = e0();
            if (!z5 && this.f4900u0) {
                this.f4900u0 = false;
            }
            float e03 = e0();
            invalidateSelf();
            if (e02 != e03) {
                n1();
            }
        }
    }

    public void p2(int i6) {
        this.H0 = i6;
    }

    public void q1(int i6) {
        p1(this.f4886g0.getResources().getBoolean(i6));
    }

    public void q2(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            J2();
            onStateChange(getState());
        }
    }

    public void r1(Drawable drawable) {
        if (this.U != drawable) {
            float e02 = e0();
            this.U = drawable;
            float e03 = e0();
            I2(this.U);
            c0(this.U);
            invalidateSelf();
            if (e02 != e03) {
                n1();
            }
        }
    }

    public void r2(int i6) {
        q2(e.a.a(this.f4886g0, i6));
    }

    public void s1(int i6) {
        r1(e.a.b(this.f4886g0, i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s2(boolean z5) {
        this.G0 = z5;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        if (this.f4902w0 != i6) {
            this.f4902w0 = i6;
            invalidateSelf();
        }
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f4903x0 != colorFilter) {
            this.f4903x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f4906z0 != colorStateList) {
            this.f4906z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // c3.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.f4904y0 = t2.c.f(this, this.f4906z0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        if (G2()) {
            visible |= this.I.setVisible(z5, z6);
        }
        if (F2()) {
            visible |= this.U.setVisible(z5, z6);
        }
        if (H2()) {
            visible |= this.N.setVisible(z5, z6);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (m0()) {
                androidx.core.graphics.drawable.a.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void t2(c cVar) {
        this.W = cVar;
    }

    public void u1(int i6) {
        t1(e.a.a(this.f4886g0, i6));
    }

    public void u2(int i6) {
        t2(c.c(this.f4886g0, i6));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(int i6) {
        w1(this.f4886g0.getResources().getBoolean(i6));
    }

    public void v2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.f4893n0.i(true);
        invalidateSelf();
        n1();
    }

    public void w1(boolean z5) {
        if (this.T != z5) {
            boolean F2 = F2();
            this.T = z5;
            boolean F22 = F2();
            if (F2 != F22) {
                if (F22) {
                    c0(this.U);
                } else {
                    I2(this.U);
                }
                invalidateSelf();
                n1();
            }
        }
    }

    public void w2(d dVar) {
        this.f4893n0.h(dVar, this.f4886g0);
    }

    public Drawable x0() {
        return this.U;
    }

    public void x1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    public void x2(int i6) {
        w2(new d(this.f4886g0, i6));
    }

    public ColorStateList y0() {
        return this.V;
    }

    public void y1(int i6) {
        x1(e.a.a(this.f4886g0, i6));
    }

    public void y2(float f6) {
        if (this.f4882c0 != f6) {
            this.f4882c0 = f6;
            invalidateSelf();
            n1();
        }
    }

    public ColorStateList z0() {
        return this.A;
    }

    public void z1(float f6) {
        if (this.C != f6) {
            this.C = f6;
            setShapeAppearanceModel(z().w(f6));
        }
    }

    public void z2(int i6) {
        y2(this.f4886g0.getResources().getDimension(i6));
    }
}
