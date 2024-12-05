package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b1;

/* loaded from: classes.dex */
abstract class a extends c {

    /* renamed from: d, reason: collision with root package name */
    private Runnable f4662d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f4663e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4664f;

    /* renamed from: g, reason: collision with root package name */
    private int f4665g;

    /* renamed from: h, reason: collision with root package name */
    private int f4666h;

    /* renamed from: i, reason: collision with root package name */
    private int f4667i;

    /* renamed from: j, reason: collision with root package name */
    private VelocityTracker f4668j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0080a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f4669a;

        /* renamed from: b, reason: collision with root package name */
        private final View f4670b;

        RunnableC0080a(CoordinatorLayout coordinatorLayout, View view) {
            this.f4669a = coordinatorLayout;
            this.f4670b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f4670b == null || (overScroller = a.this.f4663e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.M(this.f4669a, this.f4670b);
                return;
            }
            a aVar = a.this;
            aVar.O(this.f4669a, this.f4670b, aVar.f4663e.getCurrY());
            b1.i0(this.f4670b, this);
        }
    }

    public a() {
        this.f4665g = -1;
        this.f4667i = -1;
    }

    private void H() {
        if (this.f4668j == null) {
            this.f4668j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
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
            r11.f4665g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f4666h = r12
            goto L4c
        L2d:
            int r0 = r11.f4665g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f4666h
            int r7 = r1 - r0
            r11.f4666h = r0
            int r8 = r11.J(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.N(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f4668j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f4668j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f4668j
            int r4 = r11.f4665g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.K(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.I(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f4664f = r3
            r11.f4665g = r1
            android.view.VelocityTracker r13 = r11.f4668j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f4668j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f4668j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f4664f
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

    abstract boolean G(View view);

    final boolean I(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, float f6) {
        Runnable runnable = this.f4662d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f4662d = null;
        }
        if (this.f4663e == null) {
            this.f4663e = new OverScroller(view.getContext());
        }
        this.f4663e.fling(0, E(), 0, Math.round(f6), 0, 0, i6, i7);
        if (!this.f4663e.computeScrollOffset()) {
            M(coordinatorLayout, view);
            return false;
        }
        RunnableC0080a runnableC0080a = new RunnableC0080a(coordinatorLayout, view);
        this.f4662d = runnableC0080a;
        b1.i0(view, runnableC0080a);
        return true;
    }

    abstract int J(View view);

    abstract int K(View view);

    abstract int L();

    abstract void M(CoordinatorLayout coordinatorLayout, View view);

    final int N(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        return P(coordinatorLayout, view, L() - i6, i7, i8);
    }

    int O(CoordinatorLayout coordinatorLayout, View view, int i6) {
        return P(coordinatorLayout, view, i6, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int P(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f4667i < 0) {
            this.f4667i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f4664f) {
            int i6 = this.f4665g;
            if (i6 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                return false;
            }
            int y5 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y5 - this.f4666h) > this.f4667i) {
                this.f4666h = y5;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f4665g = -1;
            int x5 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            boolean z5 = G(view) && coordinatorLayout.A(view, x5, y6);
            this.f4664f = z5;
            if (z5) {
                this.f4666h = y6;
                this.f4665g = motionEvent.getPointerId(0);
                H();
                OverScroller overScroller = this.f4663e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f4663e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f4668j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4665g = -1;
        this.f4667i = -1;
    }
}
