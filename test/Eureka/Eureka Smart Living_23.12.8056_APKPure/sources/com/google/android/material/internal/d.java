package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.i2;

/* loaded from: classes.dex */
public abstract class d extends i2 {

    /* renamed from: p, reason: collision with root package name */
    private Drawable f5091p;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f5092q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f5093r;

    /* renamed from: s, reason: collision with root package name */
    private int f5094s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f5095t;

    /* renamed from: u, reason: collision with root package name */
    boolean f5096u;

    public d(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f5092q = new Rect();
        this.f5093r = new Rect();
        this.f5094s = 119;
        this.f5095t = true;
        this.f5096u = false;
        TypedArray i7 = l.i(context, attributeSet, m2.j.f7845v1, i6, 0, new int[0]);
        this.f5094s = i7.getInt(m2.j.f7857x1, this.f5094s);
        Drawable drawable = i7.getDrawable(m2.j.f7851w1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f5095t = i7.getBoolean(m2.j.f7863y1, true);
        i7.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f5091p;
        if (drawable != null) {
            if (this.f5096u) {
                this.f5096u = false;
                Rect rect = this.f5092q;
                Rect rect2 = this.f5093r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f5095t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f5094s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f6, float f7) {
        super.drawableHotspotChanged(f6, f7);
        Drawable drawable = this.f5091p;
        if (drawable != null) {
            drawable.setHotspot(f6, f7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5091p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f5091p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f5091p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f5094s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5091p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i2, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        this.f5096u = z5 | this.f5096u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        this.f5096u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f5091p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f5091p);
            }
            this.f5091p = drawable;
            this.f5096u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f5094s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i6) {
        if (this.f5094s != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.f5094s = i6;
            if (i6 == 119 && this.f5091p != null) {
                this.f5091p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5091p;
    }
}
