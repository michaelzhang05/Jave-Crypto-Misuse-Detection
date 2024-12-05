package c3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.s;
import c3.k;
import c3.l;
import c3.m;
import java.util.BitSet;

/* loaded from: classes.dex */
public class g extends Drawable implements s, n {

    /* renamed from: x, reason: collision with root package name */
    private static final String f4025x = "g";

    /* renamed from: y, reason: collision with root package name */
    private static final Paint f4026y;

    /* renamed from: a, reason: collision with root package name */
    private c f4027a;

    /* renamed from: b, reason: collision with root package name */
    private final m.g[] f4028b;

    /* renamed from: c, reason: collision with root package name */
    private final m.g[] f4029c;

    /* renamed from: d, reason: collision with root package name */
    private final BitSet f4030d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4031e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f4032f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f4033g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f4034h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f4035i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f4036j;

    /* renamed from: k, reason: collision with root package name */
    private final Region f4037k;

    /* renamed from: l, reason: collision with root package name */
    private final Region f4038l;

    /* renamed from: m, reason: collision with root package name */
    private k f4039m;

    /* renamed from: n, reason: collision with root package name */
    private final Paint f4040n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f4041o;

    /* renamed from: p, reason: collision with root package name */
    private final b3.a f4042p;

    /* renamed from: q, reason: collision with root package name */
    private final l.b f4043q;

    /* renamed from: r, reason: collision with root package name */
    private final l f4044r;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f4045s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f4046t;

    /* renamed from: u, reason: collision with root package name */
    private int f4047u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f4048v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f4049w;

    /* loaded from: classes.dex */
    class a implements l.b {
        a() {
        }

        @Override // c3.l.b
        public void a(m mVar, Matrix matrix, int i6) {
            g.this.f4030d.set(i6 + 4, mVar.e());
            g.this.f4029c[i6] = mVar.f(matrix);
        }

        @Override // c3.l.b
        public void b(m mVar, Matrix matrix, int i6) {
            g.this.f4030d.set(i6, mVar.e());
            g.this.f4028b[i6] = mVar.f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements k.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f4051a;

        b(float f6) {
            this.f4051a = f6;
        }

        @Override // c3.k.c
        public c3.c a(c3.c cVar) {
            return cVar instanceof i ? cVar : new c3.b(this.f4051a, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public k f4053a;

        /* renamed from: b, reason: collision with root package name */
        public u2.a f4054b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f4055c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f4056d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f4057e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f4058f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f4059g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f4060h;

        /* renamed from: i, reason: collision with root package name */
        public Rect f4061i;

        /* renamed from: j, reason: collision with root package name */
        public float f4062j;

        /* renamed from: k, reason: collision with root package name */
        public float f4063k;

        /* renamed from: l, reason: collision with root package name */
        public float f4064l;

        /* renamed from: m, reason: collision with root package name */
        public int f4065m;

        /* renamed from: n, reason: collision with root package name */
        public float f4066n;

        /* renamed from: o, reason: collision with root package name */
        public float f4067o;

        /* renamed from: p, reason: collision with root package name */
        public float f4068p;

        /* renamed from: q, reason: collision with root package name */
        public int f4069q;

        /* renamed from: r, reason: collision with root package name */
        public int f4070r;

        /* renamed from: s, reason: collision with root package name */
        public int f4071s;

        /* renamed from: t, reason: collision with root package name */
        public int f4072t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f4073u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f4074v;

        public c(c cVar) {
            this.f4056d = null;
            this.f4057e = null;
            this.f4058f = null;
            this.f4059g = null;
            this.f4060h = PorterDuff.Mode.SRC_IN;
            this.f4061i = null;
            this.f4062j = 1.0f;
            this.f4063k = 1.0f;
            this.f4065m = 255;
            this.f4066n = 0.0f;
            this.f4067o = 0.0f;
            this.f4068p = 0.0f;
            this.f4069q = 0;
            this.f4070r = 0;
            this.f4071s = 0;
            this.f4072t = 0;
            this.f4073u = false;
            this.f4074v = Paint.Style.FILL_AND_STROKE;
            this.f4053a = cVar.f4053a;
            this.f4054b = cVar.f4054b;
            this.f4064l = cVar.f4064l;
            this.f4055c = cVar.f4055c;
            this.f4056d = cVar.f4056d;
            this.f4057e = cVar.f4057e;
            this.f4060h = cVar.f4060h;
            this.f4059g = cVar.f4059g;
            this.f4065m = cVar.f4065m;
            this.f4062j = cVar.f4062j;
            this.f4071s = cVar.f4071s;
            this.f4069q = cVar.f4069q;
            this.f4073u = cVar.f4073u;
            this.f4063k = cVar.f4063k;
            this.f4066n = cVar.f4066n;
            this.f4067o = cVar.f4067o;
            this.f4068p = cVar.f4068p;
            this.f4070r = cVar.f4070r;
            this.f4072t = cVar.f4072t;
            this.f4058f = cVar.f4058f;
            this.f4074v = cVar.f4074v;
            if (cVar.f4061i != null) {
                this.f4061i = new Rect(cVar.f4061i);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f4031e = true;
            return gVar;
        }

        public c(k kVar, u2.a aVar) {
            this.f4056d = null;
            this.f4057e = null;
            this.f4058f = null;
            this.f4059g = null;
            this.f4060h = PorterDuff.Mode.SRC_IN;
            this.f4061i = null;
            this.f4062j = 1.0f;
            this.f4063k = 1.0f;
            this.f4065m = 255;
            this.f4066n = 0.0f;
            this.f4067o = 0.0f;
            this.f4068p = 0.0f;
            this.f4069q = 0;
            this.f4070r = 0;
            this.f4071s = 0;
            this.f4072t = 0;
            this.f4073u = false;
            this.f4074v = Paint.Style.FILL_AND_STROKE;
            this.f4053a = kVar;
            this.f4054b = aVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f4026y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float A() {
        if (G()) {
            return this.f4041o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean E() {
        c cVar = this.f4027a;
        int i6 = cVar.f4069q;
        return i6 != 1 && cVar.f4070r > 0 && (i6 == 2 || O());
    }

    private boolean F() {
        Paint.Style style = this.f4027a.f4074v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean G() {
        Paint.Style style = this.f4027a.f4074v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f4041o.getStrokeWidth() > 0.0f;
    }

    private void I() {
        super.invalidateSelf();
    }

    private void L(Canvas canvas) {
        if (E()) {
            canvas.save();
            N(canvas);
            if (this.f4049w) {
                int width = (int) (this.f4048v.width() - getBounds().width());
                int height = (int) (this.f4048v.height() - getBounds().height());
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f4048v.width()) + (this.f4027a.f4070r * 2) + width, ((int) this.f4048v.height()) + (this.f4027a.f4070r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f6 = (getBounds().left - this.f4027a.f4070r) - width;
                float f7 = (getBounds().top - this.f4027a.f4070r) - height;
                canvas2.translate(-f6, -f7);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f6, f7, (Paint) null);
                createBitmap.recycle();
            } else {
                n(canvas);
            }
            canvas.restore();
        }
    }

    private static int M(int i6, int i7) {
        return (i6 * (i7 + (i7 >>> 7))) >>> 8;
    }

    private void N(Canvas canvas) {
        canvas.translate(x(), y());
    }

    private boolean Z(int[] iArr) {
        boolean z5;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4027a.f4056d == null || color2 == (colorForState2 = this.f4027a.f4056d.getColorForState(iArr, (color2 = this.f4040n.getColor())))) {
            z5 = false;
        } else {
            this.f4040n.setColor(colorForState2);
            z5 = true;
        }
        if (this.f4027a.f4057e == null || color == (colorForState = this.f4027a.f4057e.getColorForState(iArr, (color = this.f4041o.getColor())))) {
            return z5;
        }
        this.f4041o.setColor(colorForState);
        return true;
    }

    private boolean a0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4045s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f4046t;
        c cVar = this.f4027a;
        this.f4045s = k(cVar.f4059g, cVar.f4060h, this.f4040n, true);
        c cVar2 = this.f4027a;
        this.f4046t = k(cVar2.f4058f, cVar2.f4060h, this.f4041o, false);
        c cVar3 = this.f4027a;
        if (cVar3.f4073u) {
            this.f4042p.d(cVar3.f4059g.getColorForState(getState(), 0));
        }
        return (androidx.core.util.c.a(porterDuffColorFilter, this.f4045s) && androidx.core.util.c.a(porterDuffColorFilter2, this.f4046t)) ? false : true;
    }

    private void b0() {
        float D = D();
        this.f4027a.f4070r = (int) Math.ceil(0.75f * D);
        this.f4027a.f4071s = (int) Math.ceil(D * 0.25f);
        a0();
        I();
    }

    private PorterDuffColorFilter f(Paint paint, boolean z5) {
        if (!z5) {
            return null;
        }
        int color = paint.getColor();
        int l6 = l(color);
        this.f4047u = l6;
        if (l6 != color) {
            return new PorterDuffColorFilter(l6, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f4027a.f4062j != 1.0f) {
            this.f4032f.reset();
            Matrix matrix = this.f4032f;
            float f6 = this.f4027a.f4062j;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4032f);
        }
        path.computeBounds(this.f4048v, true);
    }

    private void i() {
        k y5 = z().y(new b(-A()));
        this.f4039m = y5;
        this.f4044r.d(y5, this.f4027a.f4063k, t(), this.f4034h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z5) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z5) {
            colorForState = l(colorForState);
        }
        this.f4047u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z5) {
        return (colorStateList == null || mode == null) ? f(paint, z5) : j(colorStateList, mode, z5);
    }

    public static g m(Context context, float f6) {
        int c6 = r2.a.c(context, m2.a.f7558l, g.class.getSimpleName());
        g gVar = new g();
        gVar.H(context);
        gVar.R(ColorStateList.valueOf(c6));
        gVar.Q(f6);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f4030d.cardinality() > 0) {
            Log.w(f4025x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f4027a.f4071s != 0) {
            canvas.drawPath(this.f4033g, this.f4042p.c());
        }
        for (int i6 = 0; i6 < 4; i6++) {
            this.f4028b[i6].b(this.f4042p, this.f4027a.f4070r, canvas);
            this.f4029c[i6].b(this.f4042p, this.f4027a.f4070r, canvas);
        }
        if (this.f4049w) {
            int x5 = x();
            int y5 = y();
            canvas.translate(-x5, -y5);
            canvas.drawPath(this.f4033g, f4026y);
            canvas.translate(x5, y5);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f4040n, this.f4033g, this.f4027a.f4053a, s());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a6 = kVar.t().a(rectF) * this.f4027a.f4063k;
            canvas.drawRoundRect(rectF, a6, a6, paint);
        }
    }

    private RectF t() {
        this.f4036j.set(s());
        float A = A();
        this.f4036j.inset(A, A);
        return this.f4036j;
    }

    public float B() {
        return this.f4027a.f4053a.r().a(s());
    }

    public float C() {
        return this.f4027a.f4068p;
    }

    public float D() {
        return u() + C();
    }

    public void H(Context context) {
        this.f4027a.f4054b = new u2.a(context);
        b0();
    }

    public boolean J() {
        u2.a aVar = this.f4027a.f4054b;
        return aVar != null && aVar.d();
    }

    public boolean K() {
        return this.f4027a.f4053a.u(s());
    }

    public boolean O() {
        return (K() || this.f4033g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void P(c3.c cVar) {
        setShapeAppearanceModel(this.f4027a.f4053a.x(cVar));
    }

    public void Q(float f6) {
        c cVar = this.f4027a;
        if (cVar.f4067o != f6) {
            cVar.f4067o = f6;
            b0();
        }
    }

    public void R(ColorStateList colorStateList) {
        c cVar = this.f4027a;
        if (cVar.f4056d != colorStateList) {
            cVar.f4056d = colorStateList;
            onStateChange(getState());
        }
    }

    public void S(float f6) {
        c cVar = this.f4027a;
        if (cVar.f4063k != f6) {
            cVar.f4063k = f6;
            this.f4031e = true;
            invalidateSelf();
        }
    }

    public void T(int i6, int i7, int i8, int i9) {
        c cVar = this.f4027a;
        if (cVar.f4061i == null) {
            cVar.f4061i = new Rect();
        }
        this.f4027a.f4061i.set(i6, i7, i8, i9);
        invalidateSelf();
    }

    public void U(float f6) {
        c cVar = this.f4027a;
        if (cVar.f4066n != f6) {
            cVar.f4066n = f6;
            b0();
        }
    }

    public void V(float f6, int i6) {
        Y(f6);
        X(ColorStateList.valueOf(i6));
    }

    public void W(float f6, ColorStateList colorStateList) {
        Y(f6);
        X(colorStateList);
    }

    public void X(ColorStateList colorStateList) {
        c cVar = this.f4027a;
        if (cVar.f4057e != colorStateList) {
            cVar.f4057e = colorStateList;
            onStateChange(getState());
        }
    }

    public void Y(float f6) {
        this.f4027a.f4064l = f6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f4040n.setColorFilter(this.f4045s);
        int alpha = this.f4040n.getAlpha();
        this.f4040n.setAlpha(M(alpha, this.f4027a.f4065m));
        this.f4041o.setColorFilter(this.f4046t);
        this.f4041o.setStrokeWidth(this.f4027a.f4064l);
        int alpha2 = this.f4041o.getAlpha();
        this.f4041o.setAlpha(M(alpha2, this.f4027a.f4065m));
        if (this.f4031e) {
            i();
            g(s(), this.f4033g);
            this.f4031e = false;
        }
        L(canvas);
        if (F()) {
            o(canvas);
        }
        if (G()) {
            r(canvas);
        }
        this.f4040n.setAlpha(alpha);
        this.f4041o.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4027a.f4065m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4027a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f4027a.f4069q == 2) {
            return;
        }
        if (K()) {
            outline.setRoundRect(getBounds(), B() * this.f4027a.f4063k);
        } else {
            g(s(), this.f4033g);
            t2.c.e(outline, this.f4033g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f4027a.f4061i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f4037k.set(getBounds());
        g(s(), this.f4033g);
        this.f4038l.setPath(this.f4033g, this.f4037k);
        this.f4037k.op(this.f4038l, Region.Op.DIFFERENCE);
        return this.f4037k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        l lVar = this.f4044r;
        c cVar = this.f4027a;
        lVar.e(cVar.f4053a, cVar.f4063k, rectF, this.f4043q, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f4031e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f4027a.f4059g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f4027a.f4058f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f4027a.f4057e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f4027a.f4056d) != null && colorStateList4.isStateful())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int l(int i6) {
        float D = D() + w();
        u2.a aVar = this.f4027a.f4054b;
        return aVar != null ? aVar.c(i6, D) : i6;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f4027a = new c(this.f4027a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f4031e = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z5 = Z(iArr) || a0();
        if (z5) {
            invalidateSelf();
        }
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f4027a.f4053a, rectF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(Canvas canvas) {
        q(canvas, this.f4041o, this.f4034h, this.f4039m, t());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF s() {
        this.f4035i.set(getBounds());
        return this.f4035i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        c cVar = this.f4027a;
        if (cVar.f4065m != i6) {
            cVar.f4065m = i6;
            I();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4027a.f4055c = colorFilter;
        I();
    }

    @Override // c3.n
    public void setShapeAppearanceModel(k kVar) {
        this.f4027a.f4053a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f4027a.f4059g = colorStateList;
        a0();
        I();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f4027a;
        if (cVar.f4060h != mode) {
            cVar.f4060h = mode;
            a0();
            I();
        }
    }

    public float u() {
        return this.f4027a.f4067o;
    }

    public ColorStateList v() {
        return this.f4027a.f4056d;
    }

    public float w() {
        return this.f4027a.f4066n;
    }

    public int x() {
        c cVar = this.f4027a;
        return (int) (cVar.f4071s * Math.sin(Math.toRadians(cVar.f4072t)));
    }

    public int y() {
        c cVar = this.f4027a;
        return (int) (cVar.f4071s * Math.cos(Math.toRadians(cVar.f4072t)));
    }

    public k z() {
        return this.f4027a.f4053a;
    }

    public g(Context context, AttributeSet attributeSet, int i6, int i7) {
        this(k.e(context, attributeSet, i6, i7).m());
    }

    private g(c cVar) {
        this.f4028b = new m.g[4];
        this.f4029c = new m.g[4];
        this.f4030d = new BitSet(8);
        this.f4032f = new Matrix();
        this.f4033g = new Path();
        this.f4034h = new Path();
        this.f4035i = new RectF();
        this.f4036j = new RectF();
        this.f4037k = new Region();
        this.f4038l = new Region();
        Paint paint = new Paint(1);
        this.f4040n = paint;
        Paint paint2 = new Paint(1);
        this.f4041o = paint2;
        this.f4042p = new b3.a();
        this.f4044r = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.f4048v = new RectF();
        this.f4049w = true;
        this.f4027a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        a0();
        Z(getState());
        this.f4043q = new a();
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }
}
