package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderBehavior.java */
/* loaded from: classes2.dex */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: d, reason: collision with root package name */
    private Runnable f16378d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f16379e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16380f;

    /* renamed from: g, reason: collision with root package name */
    private int f16381g;

    /* renamed from: h, reason: collision with root package name */
    private int f16382h;

    /* renamed from: i, reason: collision with root package name */
    private int f16383i;

    /* renamed from: j, reason: collision with root package name */
    private VelocityTracker f16384j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HeaderBehavior.java */
    /* renamed from: com.google.android.material.appbar.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0186a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final CoordinatorLayout f16385f;

        /* renamed from: g, reason: collision with root package name */
        private final V f16386g;

        RunnableC0186a(CoordinatorLayout coordinatorLayout, V v) {
            this.f16385f = coordinatorLayout;
            this.f16386g = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f16386g == null || (overScroller = a.this.f16379e) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                a aVar = a.this;
                aVar.P(this.f16385f, this.f16386g, aVar.f16379e.getCurrY());
                u.a0(this.f16386g, this);
                return;
            }
            a.this.N(this.f16385f, this.f16386g);
        }
    }

    public a() {
        this.f16381g = -1;
        this.f16383i = -1;
    }

    private void I() {
        if (this.f16384j == null) {
            this.f16384j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f16381g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f16382h = r12
            goto L4c
        L2d:
            int r0 = r11.f16381g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f16382h
            int r7 = r1 - r0
            r11.f16382h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f16384j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f16384j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f16384j
            int r4 = r11.f16381g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f16380f = r3
            r11.f16381g = r1
            android.view.VelocityTracker r13 = r11.f16384j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f16384j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f16384j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f16380f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    abstract boolean H(V v);

    final boolean J(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f2) {
        Runnable runnable = this.f16378d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f16378d = null;
        }
        if (this.f16379e == null) {
            this.f16379e = new OverScroller(v.getContext());
        }
        this.f16379e.fling(0, E(), 0, Math.round(f2), 0, 0, i2, i3);
        if (this.f16379e.computeScrollOffset()) {
            RunnableC0186a runnableC0186a = new RunnableC0186a(coordinatorLayout, v);
            this.f16378d = runnableC0186a;
            u.a0(v, runnableC0186a);
            return true;
        }
        N(coordinatorLayout, v);
        return false;
    }

    abstract int K(V v);

    abstract int L(V v);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, V v);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return Q(coordinatorLayout, v, M() - i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int P(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return Q(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f16383i < 0) {
            this.f16383i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f16380f) {
            int i2 = this.f16381g;
            if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f16382h) > this.f16383i) {
                this.f16382h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f16381g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = H(v) && coordinatorLayout.B(v, x, y2);
            this.f16380f = z;
            if (z) {
                this.f16382h = y2;
                this.f16381g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f16379e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f16379e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f16384j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16381g = -1;
        this.f16383i = -1;
    }
}
