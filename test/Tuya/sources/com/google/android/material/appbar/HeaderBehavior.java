package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;

    @Nullable
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;

    @Nullable
    private VelocityTracker velocityTracker;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class FlingRunnable implements Runnable {
        private final V layout;
        private final CoordinatorLayout parent;

        FlingRunnable(CoordinatorLayout coordinatorLayout, V v8) {
            this.parent = coordinatorLayout;
            this.layout = v8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.layout != null && (overScroller = HeaderBehavior.this.scroller) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
                    ViewCompat.postOnAnimation(this.layout, this);
                    return;
                }
                HeaderBehavior.this.onFlingFinished(this.parent, this.layout);
            }
        }
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    boolean canDragView(V v8) {
        return false;
    }

    final boolean fling(CoordinatorLayout coordinatorLayout, @NonNull V v8, int i8, int i9, float f8) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v8.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v8.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f8), 0, 0, i8, i9);
        if (this.scroller.computeScrollOffset()) {
            FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, v8);
            this.flingRunnable = flingRunnable;
            ViewCompat.postOnAnimation(v8, flingRunnable);
            return true;
        }
        onFlingFinished(coordinatorLayout, v8);
        return false;
    }

    int getMaxDragOffset(@NonNull V v8) {
        return -v8.getHeight();
    }

    int getScrollRangeForDragFling(@NonNull V v8) {
        return v8.getHeight();
    }

    int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    void onFlingFinished(CoordinatorLayout coordinatorLayout, V v8) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        boolean z8;
        int findPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i8 = this.activePointerId;
            if (i8 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i8)) == -1) {
                return false;
            }
            int y8 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y8 - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y8;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x8 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (canDragView(v8) && coordinatorLayout.isPointInChildBounds(v8, x8, y9)) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.isBeingDragged = z8;
            if (z8) {
                this.lastMotionY = y9;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.NonNull V r13, @androidx.annotation.NonNull android.view.MotionEvent r14) {
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
            r11.activePointerId = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.lastMotionY = r12
            goto L4c
        L2d:
            int r0 = r11.activePointerId
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.lastMotionY
            int r7 = r1 - r0
            r11.lastMotionY = r0
            int r8 = r11.getMaxDragOffset(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.scroll(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.velocityTracker
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.velocityTracker
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.velocityTracker
            int r4 = r11.activePointerId
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.getScrollRangeForDragFling(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.fling(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.isBeingDragged = r3
            r11.activePointerId = r1
            android.view.VelocityTracker r13 = r11.velocityTracker
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.velocityTracker = r13
        L81:
            android.view.VelocityTracker r13 = r11.velocityTracker
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.isBeingDragged
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int scroll(CoordinatorLayout coordinatorLayout, V v8, int i8, int i9, int i10) {
        return setHeaderTopBottomOffset(coordinatorLayout, v8, getTopBottomOffsetForScrollingSibling() - i8, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v8, int i8) {
        return setHeaderTopBottomOffset(coordinatorLayout, v8, i8, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v8, int i8, int i9, int i10) {
        int clamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i9 == 0 || topAndBottomOffset < i9 || topAndBottomOffset > i10 || topAndBottomOffset == (clamp = MathUtils.clamp(i8, i9, i10))) {
            return 0;
        }
        setTopAndBottomOffset(clamp);
        return topAndBottomOffset - clamp;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }
}
