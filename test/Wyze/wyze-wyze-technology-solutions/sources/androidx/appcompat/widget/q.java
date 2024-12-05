package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
class q extends o {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f565d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f566e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f567f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f568g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f569h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f570i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(SeekBar seekBar) {
        super(seekBar);
        this.f567f = null;
        this.f568g = null;
        this.f569h = false;
        this.f570i = false;
        this.f565d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f566e;
        if (drawable != null) {
            if (this.f569h || this.f570i) {
                Drawable r = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f566e = r;
                if (this.f569h) {
                    androidx.core.graphics.drawable.a.o(r, this.f567f);
                }
                if (this.f570i) {
                    androidx.core.graphics.drawable.a.p(this.f566e, this.f568g);
                }
                if (this.f566e.isStateful()) {
                    this.f566e.setState(this.f565d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.o
    public void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        Context context = this.f565d.getContext();
        int[] iArr = c.a.j.V;
        q0 v = q0.v(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f565d;
        androidx.core.view.u.g0(seekBar, seekBar.getContext(), iArr, attributeSet, v.r(), i2, 0);
        Drawable h2 = v.h(c.a.j.W);
        if (h2 != null) {
            this.f565d.setThumb(h2);
        }
        j(v.g(c.a.j.X));
        int i3 = c.a.j.Z;
        if (v.s(i3)) {
            this.f568g = y.e(v.k(i3, -1), this.f568g);
            this.f570i = true;
        }
        int i4 = c.a.j.Y;
        if (v.s(i4)) {
            this.f567f = v.c(i4);
            this.f569h = true;
        }
        v.w();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f566e != null) {
            int max = this.f565d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f566e.getIntrinsicWidth();
                int intrinsicHeight = this.f566e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f566e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f565d.getWidth() - this.f565d.getPaddingLeft()) - this.f565d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f565d.getPaddingLeft(), this.f565d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f566e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f566e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f565d.getDrawableState())) {
            this.f565d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f566e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f566e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f566e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f565d);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.view.u.y(this.f565d));
            if (drawable.isStateful()) {
                drawable.setState(this.f565d.getDrawableState());
            }
            f();
        }
        this.f565d.invalidate();
    }
}
