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
    Runnable f19496a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f19497b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f19498c;

    /* renamed from: d, reason: collision with root package name */
    private int f19499d;

    /* renamed from: e, reason: collision with root package name */
    private int f19500e;

    /* renamed from: f, reason: collision with root package name */
    private int f19501f;

    /* renamed from: g, reason: collision with root package name */
    private int f19502g;

    /* renamed from: h, reason: collision with root package name */
    private int f19503h;

    /* renamed from: i, reason: collision with root package name */
    private int f19504i;

    /* renamed from: j, reason: collision with root package name */
    private int f19505j;

    /* renamed from: k, reason: collision with root package name */
    private int f19506k;

    /* renamed from: l, reason: collision with root package name */
    private float f19507l;

    /* renamed from: m, reason: collision with root package name */
    private float f19508m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19509n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19510o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19511p;

    public MBRotationView(Context context) {
        super(context);
        this.f19501f = 40;
        this.f19502g = 20;
        this.f19503h = 0;
        this.f19504i = 0;
        this.f19506k = 0;
        this.f19507l = 0.5f;
        this.f19508m = 0.9f;
        this.f19509n = true;
        this.f19510o = false;
        this.f19511p = false;
        this.f19496a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f19497b = new Camera();
        this.f19498c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(int i8, int i9, int i10) {
        if (i10 == 0) {
            float f8 = (-i8) / 2;
            this.f19497b.translate(f8, 0.0f, 0.0f);
            float f9 = -i9;
            this.f19497b.rotateY(f9);
            this.f19497b.translate(f8, 0.0f, 0.0f);
            this.f19497b.translate(f8, 0.0f, 0.0f);
            this.f19497b.rotateY(f9);
            this.f19497b.translate(f8, 0.0f, 0.0f);
            return;
        }
        if (i10 == 1) {
            float f10 = i8 / 2;
            this.f19497b.translate(f10, 0.0f, 0.0f);
            this.f19497b.rotateY(i9);
            this.f19497b.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f19497b.rotateY(0.0f);
        } else {
            float f11 = (-i8) / 2;
            this.f19497b.translate(f11, 0.0f, 0.0f);
            this.f19497b.rotateY(-i9);
            this.f19497b.translate(f11, 0.0f, 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f19510o) {
            int height = getHeight() / 2;
            int i8 = ((this.f19503h * this.f19499d) / 2) / this.f19501f;
            a(canvas, i8, height, 0);
            a(canvas, i8, height, 1);
            if (Math.abs(this.f19503h) > this.f19501f / 2) {
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
        int i9 = ((this.f19503h * this.f19500e) / 2) / this.f19501f;
        b(canvas, i9, width, 0);
        b(canvas, i9, width, 1);
        if (Math.abs(this.f19503h) > this.f19501f / 2) {
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
        float f9 = this.f19507l;
        int i13 = (int) (((1.0f - f9) * f8) / 2.0f);
        int i14 = i11 - i9;
        float f10 = i14;
        float f11 = this.f19508m;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        this.f19499d = (int) (f10 * f11);
        this.f19500e = (int) (f8 * f9);
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            childAt.layout(i13, i15, i12 - i13, i14 - i15);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i17 = layoutParams.width;
            int i18 = this.f19500e;
            if (i17 != i18) {
                layoutParams.width = i18;
                layoutParams.height = this.f19499d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z8) {
        if (z8) {
            postDelayed(this.f19496a, 1000 / this.f19502g);
        }
        this.f19509n = z8;
    }

    public void setHeightRatio(float f8) {
        this.f19508m = f8;
    }

    public void setRotateV(boolean z8) {
        this.f19510o = z8;
        invalidate();
    }

    public void setWidthRatio(float f8) {
        this.f19507l = f8;
    }

    private void a(int i8, int i9, int i10) {
        float f8 = (-i8) / 2.0f;
        if (i10 == 0) {
            this.f19497b.translate(0.0f, f8, 0.0f);
            float f9 = -i9;
            this.f19497b.rotateX(f9);
            this.f19497b.translate(0.0f, f8, 0.0f);
            this.f19497b.translate(0.0f, f8, 0.0f);
            this.f19497b.rotateX(f9);
            this.f19497b.translate(0.0f, f8, 0.0f);
            return;
        }
        if (i10 == 1) {
            this.f19497b.translate(0.0f, f8, 0.0f);
            this.f19497b.rotateX(i9);
            this.f19497b.translate(0.0f, f8, 0.0f);
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f19497b.rotateX(0.0f);
        } else {
            this.f19497b.translate(0.0f, f8, 0.0f);
            this.f19497b.rotateX(-i9);
            this.f19497b.translate(0.0f, f8, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19501f = 40;
        this.f19502g = 20;
        this.f19503h = 0;
        this.f19504i = 0;
        this.f19506k = 0;
        this.f19507l = 0.5f;
        this.f19508m = 0.9f;
        this.f19509n = true;
        this.f19510o = false;
        this.f19511p = false;
        this.f19496a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void b(Canvas canvas, int i8, int i9, int i10) {
        canvas.save();
        this.f19497b.save();
        this.f19498c.reset();
        float f8 = i8;
        this.f19497b.translate(f8, 0.0f, 0.0f);
        this.f19497b.rotateY(this.f19503h);
        this.f19497b.translate(f8, 0.0f, 0.0f);
        if (i8 == 0) {
            if (this.f19511p) {
                b(this.f19500e, this.f19501f, i10);
            } else {
                b(-this.f19500e, -this.f19501f, i10);
            }
        } else if (i8 > 0) {
            b(this.f19500e, this.f19501f, i10);
        } else if (i8 < 0) {
            b(-this.f19500e, -this.f19501f, i10);
        }
        this.f19497b.getMatrix(this.f19498c);
        this.f19497b.restore();
        this.f19498c.preTranslate(-i9, (-getHeight()) / 2);
        this.f19498c.postTranslate(i9, getHeight() / 2);
        canvas.concat(this.f19498c);
        View childAt = getChildAt(a(i10));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(Canvas canvas, int i8, int i9, int i10) {
        canvas.save();
        this.f19497b.save();
        this.f19498c.reset();
        float f8 = i8;
        this.f19497b.translate(0.0f, f8, 0.0f);
        this.f19497b.rotateX(this.f19503h);
        this.f19497b.translate(0.0f, f8, 0.0f);
        if (i8 == 0) {
            if (this.f19511p) {
                a(this.f19499d, this.f19501f, i10);
            } else {
                a(-this.f19499d, -this.f19501f, i10);
            }
        } else if (i8 > 0) {
            a(this.f19499d, this.f19501f, i10);
        } else if (i8 < 0) {
            a(-this.f19499d, -this.f19501f, i10);
        }
        this.f19497b.getMatrix(this.f19498c);
        this.f19497b.restore();
        this.f19498c.preTranslate((-getWidth()) / 2, -i9);
        this.f19498c.postTranslate(getWidth() / 2, i9);
        canvas.concat(this.f19498c);
        View childAt = getChildAt(a(i10));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19501f = 40;
        this.f19502g = 20;
        this.f19503h = 0;
        this.f19504i = 0;
        this.f19506k = 0;
        this.f19507l = 0.5f;
        this.f19508m = 0.9f;
        this.f19509n = true;
        this.f19510o = false;
        this.f19511p = false;
        this.f19496a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
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
                    i9 = i8 != 3 ? 0 : this.f19504i;
                } else if (this.f19511p) {
                    i10 = this.f19504i;
                    i9 = i10 - 1;
                } else {
                    i11 = this.f19504i;
                    i9 = i11 + 1;
                }
            } else if (this.f19511p) {
                i11 = this.f19504i;
                i9 = i11 + 1;
            } else {
                i10 = this.f19504i;
                i9 = i10 - 1;
            }
        } else if (this.f19511p) {
            i9 = this.f19504i - 2;
        } else {
            i9 = this.f19504i + 2;
        }
        int childCount = i9 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    static /* synthetic */ void a(MBRotationView mBRotationView) {
        int a8;
        if (mBRotationView.getChildCount() == 0) {
            return;
        }
        int i8 = mBRotationView.f19503h - 1;
        mBRotationView.f19503h = i8;
        int i9 = mBRotationView.f19504i;
        mBRotationView.f19505j = i9;
        int i10 = mBRotationView.f19501f;
        int i11 = i9 - (i8 / i10);
        int i12 = i8 % i10;
        mBRotationView.f19503h = i12;
        mBRotationView.f19504i = i11;
        if (Math.abs(i12) > mBRotationView.f19501f / 2) {
            a8 = mBRotationView.a(2);
        } else {
            a8 = mBRotationView.a(3);
        }
        if (mBRotationView.f19506k != a8) {
            mBRotationView.f19506k = a8;
        }
        mBRotationView.invalidate();
        if (mBRotationView.f19509n) {
            mBRotationView.postDelayed(mBRotationView.f19496a, 1000 / mBRotationView.f19502g);
        }
    }
}
