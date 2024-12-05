package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
class s0 extends m0 {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f1207d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1208e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f1209f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1210g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1211h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1212i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(SeekBar seekBar) {
        super(seekBar);
        this.f1209f = null;
        this.f1210g = null;
        this.f1211h = false;
        this.f1212i = false;
        this.f1207d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1208e;
        if (drawable != null) {
            if (this.f1211h || this.f1212i) {
                Drawable r5 = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f1208e = r5;
                if (this.f1211h) {
                    androidx.core.graphics.drawable.a.o(r5, this.f1209f);
                }
                if (this.f1212i) {
                    androidx.core.graphics.drawable.a.p(this.f1208e, this.f1210g);
                }
                if (this.f1208e.isStateful()) {
                    this.f1208e.setState(this.f1207d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.m0
    public void c(AttributeSet attributeSet, int i6) {
        super.c(attributeSet, i6);
        c3 v5 = c3.v(this.f1207d.getContext(), attributeSet, d.j.T, i6, 0);
        SeekBar seekBar = this.f1207d;
        androidx.core.view.b1.o0(seekBar, seekBar.getContext(), d.j.T, attributeSet, v5.r(), i6, 0);
        Drawable h6 = v5.h(d.j.U);
        if (h6 != null) {
            this.f1207d.setThumb(h6);
        }
        j(v5.g(d.j.V));
        if (v5.s(d.j.X)) {
            this.f1210g = c2.d(v5.k(d.j.X, -1), this.f1210g);
            this.f1212i = true;
        }
        if (v5.s(d.j.W)) {
            this.f1209f = v5.c(d.j.W);
            this.f1211h = true;
        }
        v5.w();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1208e != null) {
            int max = this.f1207d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1208e.getIntrinsicWidth();
                int intrinsicHeight = this.f1208e.getIntrinsicHeight();
                int i6 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i7 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1208e.setBounds(-i6, -i7, i6, i7);
                float width = ((this.f1207d.getWidth() - this.f1207d.getPaddingLeft()) - this.f1207d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1207d.getPaddingLeft(), this.f1207d.getHeight() / 2);
                for (int i8 = 0; i8 <= max; i8++) {
                    this.f1208e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1208e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1207d.getDrawableState())) {
            this.f1207d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1208e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1208e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1208e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1207d);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.view.b1.E(this.f1207d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1207d.getDrawableState());
            }
            f();
        }
        this.f1207d.invalidate();
    }
}
