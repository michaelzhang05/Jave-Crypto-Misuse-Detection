package com.airbnb.lottie.v;

import android.view.Choreographer;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes.dex */
public class c extends a implements Choreographer.FrameCallback {
    private com.airbnb.lottie.d o;

    /* renamed from: h, reason: collision with root package name */
    private float f8259h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8260i = false;

    /* renamed from: j, reason: collision with root package name */
    private long f8261j = 0;

    /* renamed from: k, reason: collision with root package name */
    private float f8262k = 0.0f;
    private int l = 0;
    private float m = -2.1474836E9f;
    private float n = 2.1474836E9f;
    protected boolean p = false;

    private void E() {
        if (this.o == null) {
            return;
        }
        float f2 = this.f8262k;
        if (f2 < this.m || f2 > this.n) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.m), Float.valueOf(this.n), Float.valueOf(this.f8262k)));
        }
    }

    private float l() {
        com.airbnb.lottie.d dVar = this.o;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.h()) / Math.abs(this.f8259h);
    }

    private boolean p() {
        return o() < 0.0f;
    }

    public void A(int i2, int i3) {
        com.airbnb.lottie.d dVar = this.o;
        float m = dVar == null ? -3.4028235E38f : dVar.m();
        com.airbnb.lottie.d dVar2 = this.o;
        float f2 = dVar2 == null ? Float.MAX_VALUE : dVar2.f();
        float f3 = i2;
        this.m = e.b(f3, m, f2);
        float f4 = i3;
        this.n = e.b(f4, m, f2);
        x((int) e.b(this.f8262k, f3, f4));
    }

    public void B(int i2) {
        A(i2, (int) this.n);
    }

    public void C(float f2) {
        this.f8259h = f2;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        s();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        r();
        if (this.o == null || !isRunning()) {
            return;
        }
        long nanoTime = System.nanoTime();
        float l = ((float) (nanoTime - this.f8261j)) / l();
        float f2 = this.f8262k;
        if (p()) {
            l = -l;
        }
        float f3 = f2 + l;
        this.f8262k = f3;
        boolean z = !e.d(f3, n(), m());
        this.f8262k = e.b(this.f8262k, n(), m());
        this.f8261j = nanoTime;
        g();
        if (z) {
            if (getRepeatCount() != -1 && this.l >= getRepeatCount()) {
                this.f8262k = m();
                s();
                c(p());
            } else {
                d();
                this.l++;
                if (getRepeatMode() == 2) {
                    this.f8260i = !this.f8260i;
                    u();
                } else {
                    this.f8262k = p() ? m() : n();
                }
                this.f8261j = nanoTime;
            }
        }
        E();
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float n;
        float m;
        float n2;
        if (this.o == null) {
            return 0.0f;
        }
        if (p()) {
            n = m() - this.f8262k;
            m = m();
            n2 = n();
        } else {
            n = this.f8262k - n();
            m = m();
            n2 = n();
        }
        return n / (m - n2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        if (this.o == null) {
            return 0L;
        }
        return r0.d();
    }

    public void h() {
        this.o = null;
        this.m = -2.1474836E9f;
        this.n = 2.1474836E9f;
    }

    public void i() {
        s();
        c(p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.p;
    }

    public float j() {
        com.airbnb.lottie.d dVar = this.o;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.f8262k - dVar.m()) / (this.o.f() - this.o.m());
    }

    public float k() {
        return this.f8262k;
    }

    public float m() {
        com.airbnb.lottie.d dVar = this.o;
        if (dVar == null) {
            return 0.0f;
        }
        float f2 = this.n;
        return f2 == 2.1474836E9f ? dVar.f() : f2;
    }

    public float n() {
        com.airbnb.lottie.d dVar = this.o;
        if (dVar == null) {
            return 0.0f;
        }
        float f2 = this.m;
        return f2 == -2.1474836E9f ? dVar.m() : f2;
    }

    public float o() {
        return this.f8259h;
    }

    public void q() {
        this.p = true;
        e(p());
        x((int) (p() ? m() : n()));
        this.f8261j = System.nanoTime();
        this.l = 0;
        r();
    }

    protected void r() {
        if (isRunning()) {
            t(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void s() {
        t(true);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 == 2 || !this.f8260i) {
            return;
        }
        this.f8260i = false;
        u();
    }

    protected void t(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.p = false;
        }
    }

    public void u() {
        C(-o());
    }

    public void v(com.airbnb.lottie.d dVar) {
        boolean z = this.o == null;
        this.o = dVar;
        if (z) {
            A((int) Math.max(this.m, dVar.m()), (int) Math.min(this.n, dVar.f()));
        } else {
            A((int) dVar.m(), (int) dVar.f());
        }
        x((int) this.f8262k);
        this.f8261j = System.nanoTime();
    }

    public void x(int i2) {
        float f2 = i2;
        if (this.f8262k == f2) {
            return;
        }
        this.f8262k = e.b(f2, n(), m());
        this.f8261j = System.nanoTime();
        g();
    }

    public void y(int i2) {
        A((int) this.m, i2);
    }
}
