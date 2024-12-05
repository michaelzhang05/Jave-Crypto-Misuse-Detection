package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.g0;
import androidx.core.view.b1;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import m2.i;
import m2.j;

/* loaded from: classes.dex */
class ClockFaceView extends e implements ClockHandView.b {
    private final ClockHandView A;
    private final Rect B;
    private final RectF C;
    private final Rect D;
    private final SparseArray E;
    private final androidx.core.view.a F;
    private final int[] G;
    private final float[] H;
    private final int I;
    private final int J;
    private final int K;
    private final int L;
    private String[] M;
    private float N;
    private final ColorStateList O;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.x(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.A.i()) - ClockFaceView.this.I);
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            super.g(view, g0Var);
            int intValue = ((Integer) view.getTag(m2.e.f7632r)).intValue();
            if (intValue > 0) {
                g0Var.v0((View) ClockFaceView.this.E.get(intValue - 1));
            }
            g0Var.a0(g0.d.a(0, 1, intValue, 1, false, view.isSelected()));
            g0Var.Y(true);
            g0Var.b(g0.a.f2284i);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i6, Bundle bundle) {
            if (i6 != 16) {
                return super.j(view, i6, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.B);
            float centerX = ClockFaceView.this.B.centerX();
            float centerY = ClockFaceView.this.B.centerY();
            ClockFaceView.this.A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            ClockFaceView.this.A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.f7569w);
    }

    private void F() {
        RectF e6 = this.A.e();
        TextView H = H(e6);
        for (int i6 = 0; i6 < this.E.size(); i6++) {
            TextView textView = (TextView) this.E.get(i6);
            if (textView != null) {
                textView.setSelected(textView == H);
                textView.getPaint().setShader(G(e6, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient G(RectF rectF, TextView textView) {
        textView.getHitRect(this.B);
        this.C.set(this.B);
        textView.getLineBounds(0, this.D);
        RectF rectF2 = this.C;
        Rect rect = this.D;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.C)) {
            return new RadialGradient(rectF.centerX() - this.C.left, rectF.centerY() - this.C.top, rectF.width() * 0.5f, this.G, this.H, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView H(RectF rectF) {
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i6 = 0; i6 < this.E.size(); i6++) {
            TextView textView2 = (TextView) this.E.get(i6);
            if (textView2 != null) {
                textView2.getHitRect(this.B);
                this.C.set(this.B);
                this.C.union(rectF);
                float width = this.C.width() * this.C.height();
                if (width < f6) {
                    textView = textView2;
                    f6 = width;
                }
            }
        }
        return textView;
    }

    private static float I(float f6, float f7, float f8) {
        return Math.max(Math.max(f6, f7), f8);
    }

    private void K(int i6) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.E.size();
        boolean z5 = false;
        for (int i7 = 0; i7 < Math.max(this.M.length, size); i7++) {
            TextView textView = (TextView) this.E.get(i7);
            if (i7 >= this.M.length) {
                removeView(textView);
                this.E.remove(i7);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(m2.g.f7646e, (ViewGroup) this, false);
                    this.E.put(i7, textView);
                    addView(textView);
                }
                textView.setText(this.M[i7]);
                textView.setTag(m2.e.f7632r, Integer.valueOf(i7));
                int i8 = (i7 / 12) + 1;
                textView.setTag(m2.e.f7627m, Integer.valueOf(i8));
                if (i8 > 1) {
                    z5 = true;
                }
                b1.q0(textView, this.F);
                textView.setTextColor(this.O);
                if (i6 != 0) {
                    textView.setContentDescription(getResources().getString(i6, this.M[i7]));
                }
            }
        }
        this.A.q(z5);
    }

    public void J(String[] strArr, int i6) {
        this.M = strArr;
        K(i6);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f6, boolean z5) {
        if (Math.abs(this.N - f6) > 0.001f) {
            this.N = f6;
            F();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g0.y0(accessibilityNodeInfo).Z(g0.c.a(1, this.M.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int I = (int) (this.L / I(this.J / displayMetrics.heightPixels, this.K / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(I, 1073741824);
        setMeasuredDimension(I, I);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.e
    public void x(int i6) {
        if (i6 != w()) {
            super.x(i6);
            this.A.m(w());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.timepicker.e
    public void z() {
        super.z();
        for (int i6 = 0; i6 < this.E.size(); i6++) {
            ((TextView) this.E.get(i6)).setVisibility(0);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.B = new Rect();
        this.C = new RectF();
        this.D = new Rect();
        this.E = new SparseArray();
        this.H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.R0, i6, i.f7698o);
        Resources resources = getResources();
        ColorStateList a6 = z2.c.a(context, obtainStyledAttributes, j.T0);
        this.O = a6;
        LayoutInflater.from(context).inflate(m2.g.f7647f, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(m2.e.f7626l);
        this.A = clockHandView;
        this.I = resources.getDimensionPixelSize(m2.c.f7586h);
        int colorForState = a6.getColorForState(new int[]{R.attr.state_selected}, a6.getDefaultColor());
        this.G = new int[]{colorForState, colorForState, a6.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = e.a.a(context, m2.b.f7574b).getDefaultColor();
        ColorStateList a7 = z2.c.a(context, obtainStyledAttributes, j.S0);
        setBackgroundColor(a7 != null ? a7.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.F = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        J(strArr, 0);
        this.J = resources.getDimensionPixelSize(m2.c.f7599u);
        this.K = resources.getDimensionPixelSize(m2.c.f7600v);
        this.L = resources.getDimensionPixelSize(m2.c.f7588j);
    }
}
