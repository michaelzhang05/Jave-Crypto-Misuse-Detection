package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class MBRotationView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    Runnable f18441a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f18442b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f18443c;

    /* renamed from: d, reason: collision with root package name */
    private int f18444d;

    /* renamed from: e, reason: collision with root package name */
    private int f18445e;

    /* renamed from: f, reason: collision with root package name */
    private int f18446f;

    /* renamed from: g, reason: collision with root package name */
    private int f18447g;

    /* renamed from: h, reason: collision with root package name */
    private int f18448h;

    /* renamed from: i, reason: collision with root package name */
    private int f18449i;

    /* renamed from: j, reason: collision with root package name */
    private int f18450j;

    /* renamed from: k, reason: collision with root package name */
    private int f18451k;

    /* renamed from: l, reason: collision with root package name */
    private float f18452l;

    /* renamed from: m, reason: collision with root package name */
    private float f18453m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18454n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18455o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18456p;

    public MBRotationView(Context context) {
        super(context);
        this.f18446f = 40;
        this.f18447g = 20;
        this.f18448h = 0;
        this.f18449i = 0;
        this.f18451k = 0;
        this.f18452l = 0.5f;
        this.f18453m = 0.9f;
        this.f18454n = true;
        this.f18455o = false;
        this.f18456p = false;
        this.f18441a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f18442b = new Camera();
        this.f18443c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(int i8, int i9, int i10) {
        if (i10 == 0) {
            float f8 = (-i8) / 2;
            this.f18442b.translate(f8, 0.0f, 0.0f);
            float f9 = -i9;
            this.f18442b.rotateY(f9);
            this.f18442b.translate(f8, 0.0f, 0.0f);
            this.f18442b.translate(f8, 0.0f, 0.0f);
            this.f18442b.rotateY(f9);
            this.f18442b.translate(f8, 0.0f, 0.0f);
            return;
        }
        if (i10 == 1) {
            float f10 = i8 / 2;
            this.f18442b.translate(f10, 0.0f, 0.0f);
            this.f18442b.rotateY(i9);
            this.f18442b.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f18442b.rotateY(0.0f);
        } else {
            float f11 = (-i8) / 2;
            this.f18442b.translate(f11, 0.0f, 0.0f);
            this.f18442b.rotateY(-i9);
            this.f18442b.translate(f11, 0.0f, 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f18455o) {
            int height = getHeight() / 2;
            int i8 = ((this.f18448h * this.f18444d) / 2) / this.f18446f;
            a(canvas, i8, height, 0);
            a(canvas, i8, height, 1);
            if (Math.abs(this.f18448h) > this.f18446f / 2) {
                a(canvas, i8, height, 3);
                a(canvas, i8, height, 2);
                return;
            } else {
                a(canvas, i8, height, 2);
                a(canvas, i8, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i9 = ((this.f18448h * this.f18445e) / 2) / this.f18446f;
        b(canvas, i9, width, 0);
        b(canvas, i9, width, 1);
        if (Math.abs(this.f18448h) > this.f18446f / 2) {
            b(canvas, i9, width, 3);
            b(canvas, i9, width, 2);
        } else {
            b(canvas, i9, width, 2);
            b(canvas, i9, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int i12 = i10 - i8;
        float f8 = i12;
        float f9 = this.f18452l;
        int i13 = (int) (((1.0f - f9) * f8) / 2.0f);
        int i14 = i11 - i9;
        float f10 = i14;
        float f11 = this.f18453m;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        this.f18444d = (int) (f10 * f11);
        this.f18445e = (int) (f8 * f9);
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            childAt.layout(i13, i15, i12 - i13, i14 - i15);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i17 = layoutParams.width;
            int i18 = this.f18445e;
            if (i17 != i18) {
                layoutParams.width = i18;
                layoutParams.height = this.f18444d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z8) {
        if (z8) {
            postDelayed(this.f18441a, 1000 / this.f18447g);
        }
        this.f18454n = z8;
    }

    public void setHeightRatio(float f8) {
        this.f18453m = f8;
    }

    public void setRotateV(boolean z8) {
        this.f18455o = z8;
        invalidate();
    }

    public void setWidthRatio(float f8) {
        this.f18452l = f8;
    }

    private void a(int i8, int i9, int i10) {
        float f8 = (-i8) / 2.0f;
        if (i10 == 0) {
            this.f18442b.translate(0.0f, f8, 0.0f);
            float f9 = -i9;
            this.f18442b.rotateX(f9);
            this.f18442b.translate(0.0f, f8, 0.0f);
            this.f18442b.translate(0.0f, f8, 0.0f);
            this.f18442b.rotateX(f9);
            this.f18442b.translate(0.0f, f8, 0.0f);
            return;
        }
        if (i10 == 1) {
            this.f18442b.translate(0.0f, f8, 0.0f);
            this.f18442b.rotateX(i9);
            this.f18442b.translate(0.0f, f8, 0.0f);
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f18442b.rotateX(0.0f);
        } else {
            this.f18442b.translate(0.0f, f8, 0.0f);
            this.f18442b.rotateX(-i9);
            this.f18442b.translate(0.0f, f8, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18446f = 40;
        this.f18447g = 20;
        this.f18448h = 0;
        this.f18449i = 0;
        this.f18451k = 0;
        this.f18452l = 0.5f;
        this.f18453m = 0.9f;
        this.f18454n = true;
        this.f18455o = false;
        this.f18456p = false;
        this.f18441a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void b(Canvas canvas, int i8, int i9, int i10) {
        canvas.save();
        this.f18442b.save();
        this.f18443c.reset();
        float f8 = i8;
        this.f18442b.translate(f8, 0.0f, 0.0f);
        this.f18442b.rotateY(this.f18448h);
        this.f18442b.translate(f8, 0.0f, 0.0f);
        if (i8 == 0) {
            if (this.f18456p) {
                b(this.f18445e, this.f18446f, i10);
            } else {
                b(-this.f18445e, -this.f18446f, i10);
            }
        } else if (i8 > 0) {
            b(this.f18445e, this.f18446f, i10);
        } else if (i8 < 0) {
            b(-this.f18445e, -this.f18446f, i10);
        }
        this.f18442b.getMatrix(this.f18443c);
        this.f18442b.restore();
        this.f18443c.preTranslate(-i9, (-getHeight()) / 2);
        this.f18443c.postTranslate(i9, getHeight() / 2);
        canvas.concat(this.f18443c);
        View childAt = getChildAt(a(i10));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(Canvas canvas, int i8, int i9, int i10) {
        canvas.save();
        this.f18442b.save();
        this.f18443c.reset();
        float f8 = i8;
        this.f18442b.translate(0.0f, f8, 0.0f);
        this.f18442b.rotateX(this.f18448h);
        this.f18442b.translate(0.0f, f8, 0.0f);
        if (i8 == 0) {
            if (this.f18456p) {
                a(this.f18444d, this.f18446f, i10);
            } else {
                a(-this.f18444d, -this.f18446f, i10);
            }
        } else if (i8 > 0) {
            a(this.f18444d, this.f18446f, i10);
        } else if (i8 < 0) {
            a(-this.f18444d, -this.f18446f, i10);
        }
        this.f18442b.getMatrix(this.f18443c);
        this.f18442b.restore();
        this.f18443c.preTranslate((-getWidth()) / 2, -i9);
        this.f18443c.postTranslate(getWidth() / 2, i9);
        canvas.concat(this.f18443c);
        View childAt = getChildAt(a(i10));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18446f = 40;
        this.f18447g = 20;
        this.f18448h = 0;
        this.f18449i = 0;
        this.f18451k = 0;
        this.f18452l = 0.5f;
        this.f18453m = 0.9f;
        this.f18454n = true;
        this.f18455o = false;
        this.f18456p = false;
        this.f18441a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private int a(int i8) {
        int i9;
        int i10;
        int i11;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    i9 = i8 != 3 ? 0 : this.f18449i;
                } else if (this.f18456p) {
                    i10 = this.f18449i;
                    i9 = i10 - 1;
                } else {
                    i11 = this.f18449i;
                    i9 = i11 + 1;
                }
            } else if (this.f18456p) {
                i11 = this.f18449i;
                i9 = i11 + 1;
            } else {
                i10 = this.f18449i;
                i9 = i10 - 1;
            }
        } else if (this.f18456p) {
            i9 = this.f18449i - 2;
        } else {
            i9 = this.f18449i + 2;
        }
        int childCount = i9 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    static /* synthetic */ void a(MBRotationView mBRotationView) {
        int a8;
        if (mBRotationView.getChildCount() == 0) {
            return;
        }
        int i8 = mBRotationView.f18448h - 1;
        mBRotationView.f18448h = i8;
        int i9 = mBRotationView.f18449i;
        mBRotationView.f18450j = i9;
        int i10 = mBRotationView.f18446f;
        int i11 = i9 - (i8 / i10);
        int i12 = i8 % i10;
        mBRotationView.f18448h = i12;
        mBRotationView.f18449i = i11;
        if (Math.abs(i12) > mBRotationView.f18446f / 2) {
            a8 = mBRotationView.a(2);
        } else {
            a8 = mBRotationView.a(3);
        }
        if (mBRotationView.f18451k != a8) {
            mBRotationView.f18451k = a8;
        }
        mBRotationView.invalidate();
        if (mBRotationView.f18454n) {
            mBRotationView.postDelayed(mBRotationView.f18441a, 1000 / mBRotationView.f18447g);
        }
    }
}
