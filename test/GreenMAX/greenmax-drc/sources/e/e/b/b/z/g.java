package e.e.b.b.z;

import android.annotation.TargetApi;
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
import android.util.AttributeSet;
import android.util.Log;
import e.e.b.b.z.k;
import e.e.b.b.z.l;
import e.e.b.b.z.m;
import java.util.BitSet;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes2.dex */
public class g extends Drawable implements androidx.core.graphics.drawable.b, n {

    /* renamed from: f, reason: collision with root package name */
    private static final String f17573f = g.class.getSimpleName();

    /* renamed from: g, reason: collision with root package name */
    private static final Paint f17574g = new Paint(1);
    private PorterDuffColorFilter A;
    private final RectF B;
    private boolean C;

    /* renamed from: h, reason: collision with root package name */
    private c f17575h;

    /* renamed from: i, reason: collision with root package name */
    private final m.g[] f17576i;

    /* renamed from: j, reason: collision with root package name */
    private final m.g[] f17577j;

    /* renamed from: k, reason: collision with root package name */
    private final BitSet f17578k;
    private boolean l;
    private final Matrix m;
    private final Path n;
    private final Path o;
    private final RectF p;
    private final RectF q;
    private final Region r;
    private final Region s;
    private k t;
    private final Paint u;
    private final Paint v;
    private final e.e.b.b.y.a w;
    private final l.a x;
    private final l y;
    private PorterDuffColorFilter z;

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes2.dex */
    class a implements l.a {
        a() {
        }

        @Override // e.e.b.b.z.l.a
        public void a(m mVar, Matrix matrix, int i2) {
            g.this.f17578k.set(i2, mVar.e());
            g.this.f17576i[i2] = mVar.f(matrix);
        }

        @Override // e.e.b.b.z.l.a
        public void b(m mVar, Matrix matrix, int i2) {
            g.this.f17578k.set(i2 + 4, mVar.e());
            g.this.f17577j[i2] = mVar.f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes2.dex */
    public class b implements k.c {
        final /* synthetic */ float a;

        b(float f2) {
            this.a = f2;
        }

        @Override // e.e.b.b.z.k.c
        public e.e.b.b.z.c a(e.e.b.b.z.c cVar) {
            return cVar instanceof i ? cVar : new e.e.b.b.z.b(this.a, cVar);
        }
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    private float E() {
        if (M()) {
            return this.v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean K() {
        c cVar = this.f17575h;
        int i2 = cVar.q;
        return i2 != 1 && cVar.r > 0 && (i2 == 2 || U());
    }

    private boolean L() {
        Paint.Style style = this.f17575h.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean M() {
        Paint.Style style = this.f17575h.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.v.getStrokeWidth() > 0.0f;
    }

    private void O() {
        super.invalidateSelf();
    }

    private void R(Canvas canvas) {
        if (K()) {
            canvas.save();
            T(canvas);
            if (!this.C) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.B.width() - getBounds().width());
            int height = (int) (this.B.height() - getBounds().height());
            if (width >= 0 && height >= 0) {
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.B.width()) + (this.f17575h.r * 2) + width, ((int) this.B.height()) + (this.f17575h.r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f2 = (getBounds().left - this.f17575h.r) - width;
                float f3 = (getBounds().top - this.f17575h.r) - height;
                canvas2.translate(-f2, -f3);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
                return;
            }
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
    }

    private static int S(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private void T(Canvas canvas) {
        int A = A();
        int B = B();
        if (Build.VERSION.SDK_INT < 21 && this.C) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f17575h.r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(A, B);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(A, B);
    }

    private PorterDuffColorFilter f(Paint paint, boolean z) {
        int color;
        int l;
        if (!z || (l = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f17575h.f17588j != 1.0f) {
            this.m.reset();
            Matrix matrix = this.m;
            float f2 = this.f17575h.f17588j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.m);
        }
        path.computeBounds(this.B, true);
    }

    private void i() {
        k x = D().x(new b(-E()));
        this.t = x;
        this.y.d(x, this.f17575h.f17589k, v(), this.o);
    }

    private boolean i0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f17575h.f17582d == null || color2 == (colorForState2 = this.f17575h.f17582d.getColorForState(iArr, (color2 = this.u.getColor())))) {
            z = false;
        } else {
            this.u.setColor(colorForState2);
            z = true;
        }
        if (this.f17575h.f17583e == null || color == (colorForState = this.f17575h.f17583e.getColorForState(iArr, (color = this.v.getColor())))) {
            return z;
        }
        this.v.setColor(colorForState);
        return true;
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private boolean j0() {
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.A;
        c cVar = this.f17575h;
        this.z = k(cVar.f17585g, cVar.f17586h, this.u, true);
        c cVar2 = this.f17575h;
        this.A = k(cVar2.f17584f, cVar2.f17586h, this.v, false);
        c cVar3 = this.f17575h;
        if (cVar3.u) {
            this.w.d(cVar3.f17585g.getColorForState(getState(), 0));
        }
        return (c.h.j.e.a(porterDuffColorFilter, this.z) && c.h.j.e.a(porterDuffColorFilter2, this.A)) ? false : true;
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return j(colorStateList, mode, z);
        }
        return f(paint, z);
    }

    private void k0() {
        float J = J();
        this.f17575h.r = (int) Math.ceil(0.75f * J);
        this.f17575h.s = (int) Math.ceil(J * 0.25f);
        j0();
        O();
    }

    private int l(int i2) {
        float J = J() + z();
        e.e.b.b.s.a aVar = this.f17575h.f17580b;
        return aVar != null ? aVar.c(i2, J) : i2;
    }

    public static g m(Context context, float f2) {
        int b2 = e.e.b.b.q.a.b(context, e.e.b.b.b.o, g.class.getSimpleName());
        g gVar = new g();
        gVar.N(context);
        gVar.X(ColorStateList.valueOf(b2));
        gVar.W(f2);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f17578k.cardinality() > 0) {
            Log.w(f17573f, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f17575h.s != 0) {
            canvas.drawPath(this.n, this.w.c());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f17576i[i2].b(this.w, this.f17575h.r, canvas);
            this.f17577j[i2].b(this.w, this.f17575h.r, canvas);
        }
        if (this.C) {
            int A = A();
            int B = B();
            canvas.translate(-A, -B);
            canvas.drawPath(this.n, f17574g);
            canvas.translate(A, B);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.u, this.n, this.f17575h.a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a2 = kVar.t().a(rectF) * this.f17575h.f17589k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    private void r(Canvas canvas) {
        q(canvas, this.v, this.o, this.t, v());
    }

    private RectF v() {
        this.q.set(u());
        float E = E();
        this.q.inset(E, E);
        return this.q;
    }

    public int A() {
        double d2 = this.f17575h.s;
        double sin = Math.sin(Math.toRadians(r0.t));
        Double.isNaN(d2);
        return (int) (d2 * sin);
    }

    public int B() {
        double d2 = this.f17575h.s;
        double cos = Math.cos(Math.toRadians(r0.t));
        Double.isNaN(d2);
        return (int) (d2 * cos);
    }

    public int C() {
        return this.f17575h.r;
    }

    public k D() {
        return this.f17575h.a;
    }

    public ColorStateList F() {
        return this.f17575h.f17585g;
    }

    public float G() {
        return this.f17575h.a.r().a(u());
    }

    public float H() {
        return this.f17575h.a.t().a(u());
    }

    public float I() {
        return this.f17575h.p;
    }

    public float J() {
        return w() + I();
    }

    public void N(Context context) {
        this.f17575h.f17580b = new e.e.b.b.s.a(context);
        k0();
    }

    public boolean P() {
        e.e.b.b.s.a aVar = this.f17575h.f17580b;
        return aVar != null && aVar.d();
    }

    public boolean Q() {
        return this.f17575h.a.u(u());
    }

    public boolean U() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 21 || !(Q() || this.n.isConvex() || i2 >= 29);
    }

    public void V(float f2) {
        setShapeAppearanceModel(this.f17575h.a.w(f2));
    }

    public void W(float f2) {
        c cVar = this.f17575h;
        if (cVar.o != f2) {
            cVar.o = f2;
            k0();
        }
    }

    public void X(ColorStateList colorStateList) {
        c cVar = this.f17575h;
        if (cVar.f17582d != colorStateList) {
            cVar.f17582d = colorStateList;
            onStateChange(getState());
        }
    }

    public void Y(float f2) {
        c cVar = this.f17575h;
        if (cVar.f17589k != f2) {
            cVar.f17589k = f2;
            this.l = true;
            invalidateSelf();
        }
    }

    public void Z(int i2, int i3, int i4, int i5) {
        c cVar = this.f17575h;
        if (cVar.f17587i == null) {
            cVar.f17587i = new Rect();
        }
        this.f17575h.f17587i.set(i2, i3, i4, i5);
        invalidateSelf();
    }

    public void a0(float f2) {
        c cVar = this.f17575h;
        if (cVar.n != f2) {
            cVar.n = f2;
            k0();
        }
    }

    public void b0(boolean z) {
        this.C = z;
    }

    public void c0(int i2) {
        this.w.d(i2);
        this.f17575h.u = false;
        O();
    }

    public void d0(int i2) {
        c cVar = this.f17575h;
        if (cVar.t != i2) {
            cVar.t = i2;
            O();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.u.setColorFilter(this.z);
        int alpha = this.u.getAlpha();
        this.u.setAlpha(S(alpha, this.f17575h.m));
        this.v.setColorFilter(this.A);
        this.v.setStrokeWidth(this.f17575h.l);
        int alpha2 = this.v.getAlpha();
        this.v.setAlpha(S(alpha2, this.f17575h.m));
        if (this.l) {
            i();
            g(u(), this.n);
            this.l = false;
        }
        R(canvas);
        if (L()) {
            o(canvas);
        }
        if (M()) {
            r(canvas);
        }
        this.u.setAlpha(alpha);
        this.v.setAlpha(alpha2);
    }

    public void e0(float f2, int i2) {
        h0(f2);
        g0(ColorStateList.valueOf(i2));
    }

    public void f0(float f2, ColorStateList colorStateList) {
        h0(f2);
        g0(colorStateList);
    }

    public void g0(ColorStateList colorStateList) {
        c cVar = this.f17575h;
        if (cVar.f17583e != colorStateList) {
            cVar.f17583e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f17575h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f17575h.q == 2) {
            return;
        }
        if (Q()) {
            outline.setRoundRect(getBounds(), G() * this.f17575h.f17589k);
            return;
        }
        g(u(), this.n);
        if (this.n.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.n);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f17575h.f17587i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.r.set(getBounds());
        g(u(), this.n);
        this.s.setPath(this.n, this.r);
        this.r.op(this.s, Region.Op.DIFFERENCE);
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        l lVar = this.y;
        c cVar = this.f17575h;
        lVar.e(cVar.a, cVar.f17589k, rectF, this.x, path);
    }

    public void h0(float f2) {
        this.f17575h.l = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f17575h.f17585g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f17575h.f17584f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f17575h.f17583e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f17575h.f17582d) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f17575h = new c(this.f17575h);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.l = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        boolean z = i0(iArr) || j0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f17575h.a, rectF);
    }

    public float s() {
        return this.f17575h.a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        c cVar = this.f17575h;
        if (cVar.m != i2) {
            cVar.m = i2;
            O();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17575h.f17581c = colorFilter;
        O();
    }

    @Override // e.e.b.b.z.n
    public void setShapeAppearanceModel(k kVar) {
        this.f17575h.a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f17575h.f17585g = colorStateList;
        j0();
        O();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f17575h;
        if (cVar.f17586h != mode) {
            cVar.f17586h = mode;
            j0();
            O();
        }
    }

    public float t() {
        return this.f17575h.a.l().a(u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF u() {
        this.p.set(getBounds());
        return this.p;
    }

    public float w() {
        return this.f17575h.o;
    }

    public ColorStateList x() {
        return this.f17575h.f17582d;
    }

    public float y() {
        return this.f17575h.f17589k;
    }

    public float z() {
        return this.f17575h.n;
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(k.e(context, attributeSet, i2, i3).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private g(c cVar) {
        this.f17576i = new m.g[4];
        this.f17577j = new m.g[4];
        this.f17578k = new BitSet(8);
        this.m = new Matrix();
        this.n = new Path();
        this.o = new Path();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new Region();
        this.s = new Region();
        Paint paint = new Paint(1);
        this.u = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.w = new e.e.b.b.y.a();
        this.y = new l();
        this.B = new RectF();
        this.C = true;
        this.f17575h = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f17574g;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        j0();
        i0(getState());
        this.x = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes2.dex */
    public static final class c extends Drawable.ConstantState {
        public k a;

        /* renamed from: b, reason: collision with root package name */
        public e.e.b.b.s.a f17580b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f17581c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f17582d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f17583e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f17584f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f17585g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f17586h;

        /* renamed from: i, reason: collision with root package name */
        public Rect f17587i;

        /* renamed from: j, reason: collision with root package name */
        public float f17588j;

        /* renamed from: k, reason: collision with root package name */
        public float f17589k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(k kVar, e.e.b.b.s.a aVar) {
            this.f17582d = null;
            this.f17583e = null;
            this.f17584f = null;
            this.f17585g = null;
            this.f17586h = PorterDuff.Mode.SRC_IN;
            this.f17587i = null;
            this.f17588j = 1.0f;
            this.f17589k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = kVar;
            this.f17580b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.l = true;
            return gVar;
        }

        public c(c cVar) {
            this.f17582d = null;
            this.f17583e = null;
            this.f17584f = null;
            this.f17585g = null;
            this.f17586h = PorterDuff.Mode.SRC_IN;
            this.f17587i = null;
            this.f17588j = 1.0f;
            this.f17589k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.f17580b = cVar.f17580b;
            this.l = cVar.l;
            this.f17581c = cVar.f17581c;
            this.f17582d = cVar.f17582d;
            this.f17583e = cVar.f17583e;
            this.f17586h = cVar.f17586h;
            this.f17585g = cVar.f17585g;
            this.m = cVar.m;
            this.f17588j = cVar.f17588j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.f17589k = cVar.f17589k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f17584f = cVar.f17584f;
            this.v = cVar.v;
            if (cVar.f17587i != null) {
                this.f17587i = new Rect(cVar.f17587i);
            }
        }
    }
}
