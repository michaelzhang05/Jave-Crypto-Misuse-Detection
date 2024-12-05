package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.b1;
import com.google.android.material.internal.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m2.i;
import m2.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    private final int f5391a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f5392b;

    /* renamed from: c, reason: collision with root package name */
    private final ValueAnimator f5393c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5394d;

    /* renamed from: e, reason: collision with root package name */
    private float f5395e;

    /* renamed from: f, reason: collision with root package name */
    private float f5396f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5397g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5398h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5399i;

    /* renamed from: j, reason: collision with root package name */
    private final List f5400j;

    /* renamed from: k, reason: collision with root package name */
    private final int f5401k;

    /* renamed from: l, reason: collision with root package name */
    private final float f5402l;

    /* renamed from: m, reason: collision with root package name */
    private final Paint f5403m;

    /* renamed from: n, reason: collision with root package name */
    private final RectF f5404n;

    /* renamed from: o, reason: collision with root package name */
    private final int f5405o;

    /* renamed from: p, reason: collision with root package name */
    private float f5406p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5407q;

    /* renamed from: r, reason: collision with root package name */
    private double f5408r;

    /* renamed from: s, reason: collision with root package name */
    private int f5409s;

    /* renamed from: t, reason: collision with root package name */
    private int f5410t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f6, boolean z5);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.f7569w);
    }

    private void c(float f6, float f7) {
        this.f5410t = w2.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f6, f7) > ((float) h(2)) + n.b(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f6 = width;
        float h6 = h(this.f5410t);
        float cos = (((float) Math.cos(this.f5408r)) * h6) + f6;
        float f7 = height;
        float sin = (h6 * ((float) Math.sin(this.f5408r))) + f7;
        this.f5403m.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f5401k, this.f5403m);
        double sin2 = Math.sin(this.f5408r);
        double cos2 = Math.cos(this.f5408r);
        this.f5403m.setStrokeWidth(this.f5405o);
        canvas.drawLine(f6, f7, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.f5403m);
        canvas.drawCircle(f6, f7, this.f5402l, this.f5403m);
    }

    private int f(float f6, float f7) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f7 - (getHeight() / 2), f6 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private int h(int i6) {
        return i6 == 2 ? Math.round(this.f5409s * 0.66f) : this.f5409s;
    }

    private Pair j(float f6) {
        float g6 = g();
        if (Math.abs(g6 - f6) > 180.0f) {
            if (g6 > 180.0f && f6 < 180.0f) {
                f6 += 360.0f;
            }
            if (g6 < 180.0f && f6 > 180.0f) {
                g6 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(g6), Float.valueOf(f6));
    }

    private boolean k(float f6, float f7, boolean z5, boolean z6, boolean z7) {
        float f8 = f(f6, f7);
        boolean z8 = false;
        boolean z9 = g() != f8;
        if (z6 && z9) {
            return true;
        }
        if (!z9 && !z5) {
            return false;
        }
        if (z7 && this.f5394d) {
            z8 = true;
        }
        o(f8, z8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f6, boolean z5) {
        float f7 = f6 % 360.0f;
        this.f5406p = f7;
        this.f5408r = Math.toRadians(f7 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float h6 = h(this.f5410t);
        float cos = width + (((float) Math.cos(this.f5408r)) * h6);
        float sin = height + (h6 * ((float) Math.sin(this.f5408r)));
        RectF rectF = this.f5404n;
        int i6 = this.f5401k;
        rectF.set(cos - i6, sin - i6, cos + i6, sin + i6);
        Iterator it = this.f5400j.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f7, z5);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f5400j.add(bVar);
    }

    public RectF e() {
        return this.f5404n;
    }

    public float g() {
        return this.f5406p;
    }

    public int i() {
        return this.f5401k;
    }

    public void m(int i6) {
        this.f5409s = i6;
        invalidate();
    }

    public void n(float f6) {
        o(f6, false);
    }

    public void o(float f6, boolean z5) {
        ValueAnimator valueAnimator = this.f5393c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z5) {
            p(f6, false);
            return;
        }
        Pair j6 = j(f6);
        this.f5393c.setFloatValues(((Float) j6.first).floatValue(), ((Float) j6.second).floatValue());
        this.f5393c.setDuration(this.f5391a);
        this.f5393c.setInterpolator(this.f5392b);
        this.f5393c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.l(valueAnimator2);
            }
        });
        this.f5393c.addListener(new a());
        this.f5393c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        if (this.f5393c.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f5395e = x5;
            this.f5396f = y5;
            this.f5397g = true;
            this.f5407q = false;
            z5 = false;
            z6 = true;
        } else {
            if (actionMasked == 1 || actionMasked == 2) {
                int i6 = (int) (x5 - this.f5395e);
                int i7 = (int) (y5 - this.f5396f);
                this.f5397g = (i6 * i6) + (i7 * i7) > this.f5398h;
                z5 = this.f5407q;
                boolean z8 = actionMasked == 1;
                if (this.f5399i) {
                    c(x5, y5);
                }
                z7 = z8;
                z6 = false;
                this.f5407q |= k(x5, y5, z5, z6, z7);
                return true;
            }
            z5 = false;
            z6 = false;
        }
        z7 = false;
        this.f5407q |= k(x5, y5, z5, z6, z7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z5) {
        if (this.f5399i && !z5) {
            this.f5410t = 1;
        }
        this.f5399i = z5;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f5393c = new ValueAnimator();
        this.f5400j = new ArrayList();
        Paint paint = new Paint();
        this.f5403m = paint;
        this.f5404n = new RectF();
        this.f5410t = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.U0, i6, i.f7698o);
        this.f5391a = x2.a.f(context, m2.a.f7571y, 200);
        this.f5392b = x2.a.g(context, m2.a.E, n2.a.f7962b);
        this.f5409s = obtainStyledAttributes.getDimensionPixelSize(j.W0, 0);
        this.f5401k = obtainStyledAttributes.getDimensionPixelSize(j.X0, 0);
        this.f5405o = getResources().getDimensionPixelSize(m2.c.f7587i);
        this.f5402l = r7.getDimensionPixelSize(m2.c.f7585g);
        int color = obtainStyledAttributes.getColor(j.V0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f5398h = ViewConfiguration.get(context).getScaledTouchSlop();
        b1.A0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
