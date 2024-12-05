package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes.dex */
abstract class h extends c3.g {

    /* renamed from: z, reason: collision with root package name */
    protected final RectF f5278z;

    /* loaded from: classes.dex */
    private static class b extends h {
        b(c3.k kVar) {
            super(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c3.g
        public void r(Canvas canvas) {
            if (this.f5278z.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f5278z);
            } else {
                canvas.clipRect(this.f5278z, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    private h(c3.k kVar) {
        super(kVar == null ? new c3.k() : kVar);
        this.f5278z = new RectF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h c0(c3.k kVar) {
        return new b(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d0() {
        return !this.f5278z.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0() {
        f0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void f0(float f6, float f7, float f8, float f9) {
        RectF rectF = this.f5278z;
        if (f6 == rectF.left && f7 == rectF.top && f8 == rectF.right && f9 == rectF.bottom) {
            return;
        }
        rectF.set(f6, f7, f8, f9);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(RectF rectF) {
        f0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
