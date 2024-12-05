package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
class g extends Drawable {
    private static final double a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    static a f661b;

    /* renamed from: c, reason: collision with root package name */
    private final int f662c;

    /* renamed from: e, reason: collision with root package name */
    private Paint f664e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f665f;

    /* renamed from: g, reason: collision with root package name */
    private final RectF f666g;

    /* renamed from: h, reason: collision with root package name */
    private float f667h;

    /* renamed from: i, reason: collision with root package name */
    private Path f668i;

    /* renamed from: j, reason: collision with root package name */
    private float f669j;

    /* renamed from: k, reason: collision with root package name */
    private float f670k;
    private float l;
    private ColorStateList m;
    private final int o;
    private final int p;
    private boolean n = true;
    private boolean q = true;
    private boolean r = false;

    /* renamed from: d, reason: collision with root package name */
    private Paint f663d = new Paint(5);

    /* compiled from: RoundRectDrawableWithShadow.java */
    /* loaded from: classes.dex */
    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.o = resources.getColor(c.d.b.f2381d);
        this.p = resources.getColor(c.d.b.f2380c);
        this.f662c = resources.getDimensionPixelSize(c.d.c.a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f664e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f667h = (int) (f2 + 0.5f);
        this.f666g = new RectF();
        Paint paint2 = new Paint(this.f664e);
        this.f665f = paint2;
        paint2.setAntiAlias(false);
        s(f3, f4);
    }

    private void a(Rect rect) {
        float f2 = this.f669j;
        float f3 = 1.5f * f2;
        this.f666g.set(rect.left + f2, rect.top + f3, rect.right - f2, rect.bottom - f3);
        b();
    }

    private void b() {
        float f2 = this.f667h;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f670k;
        rectF2.inset(-f3, -f3);
        Path path = this.f668i;
        if (path == null) {
            this.f668i = new Path();
        } else {
            path.reset();
        }
        this.f668i.setFillType(Path.FillType.EVEN_ODD);
        this.f668i.moveTo(-this.f667h, 0.0f);
        this.f668i.rLineTo(-this.f670k, 0.0f);
        this.f668i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f668i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f668i.close();
        float f4 = this.f667h;
        float f5 = f4 / (this.f670k + f4);
        Paint paint = this.f664e;
        float f6 = this.f667h + this.f670k;
        int i2 = this.o;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.p}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f665f;
        float f7 = this.f667h;
        float f8 = this.f670k;
        int i3 = this.o;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f665f.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        double d2 = f2;
        double d3 = 1.0d - a;
        double d4 = f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(float f2, float f3, boolean z) {
        if (!z) {
            return f2 * 1.5f;
        }
        double d2 = f2 * 1.5f;
        double d3 = 1.0d - a;
        double d4 = f3;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    private void e(Canvas canvas) {
        float f2 = this.f667h;
        float f3 = (-f2) - this.f670k;
        float f4 = f2 + this.f662c + (this.l / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f666g.width() - f5 > 0.0f;
        boolean z2 = this.f666g.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f666g;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f668i, this.f664e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f666g.width() - f5, -this.f667h, this.f665f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f666g;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f668i, this.f664e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f666g.width() - f5, (-this.f667h) + this.f670k, this.f665f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f666g;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f668i, this.f664e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f666g.height() - f5, -this.f667h, this.f665f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f666g;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f668i, this.f664e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f666g.height() - f5, -this.f667h, this.f665f);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.m = colorStateList;
        this.f663d.setColor(colorStateList.getColorForState(getState(), this.m.getDefaultColor()));
    }

    private void s(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        }
        if (f3 >= 0.0f) {
            float t = t(f2);
            float t2 = t(f3);
            if (t > t2) {
                if (!this.r) {
                    this.r = true;
                }
                t = t2;
            }
            if (this.l == t && this.f669j == t2) {
                return;
            }
            this.l = t;
            this.f669j = t2;
            this.f670k = (int) ((t * 1.5f) + this.f662c + 0.5f);
            this.n = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
    }

    private int t(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.n) {
            a(getBounds());
            this.n = false;
        }
        canvas.translate(0.0f, this.l / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.l) / 2.0f);
        f661b.a(canvas, this.f666g, this.f667h, this.f663d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f667h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.f669j, this.f667h, this.q));
        int ceil2 = (int) Math.ceil(c(this.f669j, this.f667h, this.q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f669j;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        float f2 = this.f669j;
        return (Math.max(f2, this.f667h + this.f662c + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f669j * 1.5f) + this.f662c) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        float f2 = this.f669j;
        return (Math.max(f2, this.f667h + this.f662c + (f2 / 2.0f)) * 2.0f) + ((this.f669j + this.f662c) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z) {
        this.q = z;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f663d.getColor() == colorForState) {
            return false;
        }
        this.f663d.setColor(colorForState);
        this.n = true;
        invalidateSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (this.f667h == f3) {
            return;
        }
        this.f667h = f3;
        this.n = true;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(float f2) {
        s(this.l, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(float f2) {
        s(f2, this.f669j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f663d.setAlpha(i2);
        this.f664e.setAlpha(i2);
        this.f665f.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f663d.setColorFilter(colorFilter);
    }
}
