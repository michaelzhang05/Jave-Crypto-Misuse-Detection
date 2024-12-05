package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
abstract class u extends Drawable implements Drawable.Callback, t, s {

    /* renamed from: g, reason: collision with root package name */
    static final PorterDuff.Mode f2097g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    private int f2098a;

    /* renamed from: b, reason: collision with root package name */
    private PorterDuff.Mode f2099b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2100c;

    /* renamed from: d, reason: collision with root package name */
    w f2101d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2102e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f2103f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Drawable drawable) {
        this.f2101d = d();
        b(drawable);
    }

    private w d() {
        return new w(this.f2101d);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        w wVar = this.f2101d;
        if (wVar == null || (constantState = wVar.f2106b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        w wVar = this.f2101d;
        ColorStateList colorStateList = wVar.f2107c;
        PorterDuff.Mode mode = wVar.f2108d;
        if (colorStateList == null || mode == null) {
            this.f2100c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f2100c || colorForState != this.f2098a || mode != this.f2099b) {
                setColorFilter(colorForState, mode);
                this.f2098a = colorForState;
                this.f2099b = mode;
                this.f2100c = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.t
    public final Drawable a() {
        return this.f2103f;
    }

    @Override // androidx.core.graphics.drawable.t
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f2103f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2103f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            w wVar = this.f2101d;
            if (wVar != null) {
                wVar.f2106b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected abstract boolean c();

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2103f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        w wVar = this.f2101d;
        return changingConfigurations | (wVar != null ? wVar.getChangingConfigurations() : 0) | this.f2103f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        w wVar = this.f2101d;
        if (wVar == null || !wVar.a()) {
            return null;
        }
        this.f2101d.f2105a = getChangingConfigurations();
        return this.f2101d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2103f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2103f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2103f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.f(this.f2103f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2103f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2103f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2103f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2103f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2103f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2103f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.h(this.f2103f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        w wVar;
        ColorStateList colorStateList = (!c() || (wVar = this.f2101d) == null) ? null : wVar.f2107c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2103f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2103f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2102e && super.mutate() == this) {
            this.f2101d = d();
            Drawable drawable = this.f2103f;
            if (drawable != null) {
                drawable.mutate();
            }
            w wVar = this.f2101d;
            if (wVar != null) {
                Drawable drawable2 = this.f2103f;
                wVar.f2106b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2102e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2103f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i6) {
        return a.m(this.f2103f, i6);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i6) {
        return this.f2103f.setLevel(i6);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        scheduleSelf(runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        this.f2103f.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        a.j(this.f2103f, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i6) {
        this.f2103f.setChangingConfigurations(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2103f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z5) {
        this.f2103f.setDither(z5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z5) {
        this.f2103f.setFilterBitmap(z5);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f2103f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2101d.f2107c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2101d.f2108d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        return super.setVisible(z5, z6) || this.f2103f.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(w wVar, Resources resources) {
        this.f2101d = wVar;
        e(resources);
    }
}
