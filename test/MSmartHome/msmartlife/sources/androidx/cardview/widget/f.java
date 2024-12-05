package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
class f extends Drawable {
    private float a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f652c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f653d;

    /* renamed from: e, reason: collision with root package name */
    private float f654e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f657h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f658i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f659j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f655f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f656g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f660k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f651b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(ColorStateList colorStateList, float f2) {
        this.a = f2;
        e(colorStateList);
        this.f652c = new RectF();
        this.f653d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f657h = colorStateList;
        this.f651b.setColor(colorStateList.getColorForState(getState(), this.f657h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f652c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f653d.set(rect);
        if (this.f655f) {
            this.f653d.inset((int) Math.ceil(g.c(this.f654e, this.a, this.f656g)), (int) Math.ceil(g.d(this.f654e, this.a, this.f656g)));
            this.f652c.set(this.f653d);
        }
    }

    public ColorStateList b() {
        return this.f657h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f654e;
    }

    public float d() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f651b;
        if (this.f658i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f658i);
            z = true;
        }
        RectF rectF = this.f652c;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f2, boolean z, boolean z2) {
        if (f2 == this.f654e && this.f655f == z && this.f656g == z2) {
            return;
        }
        this.f654e = f2;
        this.f655f = z;
        this.f656g = z2;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f653d, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f2) {
        if (f2 == this.a) {
            return;
        }
        this.a = f2;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f659j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f657h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f657h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f651b.getColor();
        if (z) {
            this.f651b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f659j;
        if (colorStateList2 == null || (mode = this.f660k) == null) {
            return z;
        }
        this.f658i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f651b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f651b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f659j = colorStateList;
        this.f658i = a(colorStateList, this.f660k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f660k = mode;
        this.f658i = a(this.f659j, mode);
        invalidateSelf();
    }
}
