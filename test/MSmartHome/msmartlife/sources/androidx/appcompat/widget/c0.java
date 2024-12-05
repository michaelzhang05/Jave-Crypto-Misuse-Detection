package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: LinearLayoutCompat.java */
/* loaded from: classes.dex */
public class c0 extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    private boolean f455f;

    /* renamed from: g, reason: collision with root package name */
    private int f456g;

    /* renamed from: h, reason: collision with root package name */
    private int f457h;

    /* renamed from: i, reason: collision with root package name */
    private int f458i;

    /* renamed from: j, reason: collision with root package name */
    private int f459j;

    /* renamed from: k, reason: collision with root package name */
    private int f460k;
    private float l;
    private boolean m;
    private int[] n;
    private int[] o;
    private Drawable p;
    private int q;
    private int r;
    private int s;
    private int t;

    public c0(Context context) {
        this(context, null);
    }

    private void A(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    private void k(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View s = s(i4);
            if (s.getVisibility() != 8) {
                a aVar = (a) s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = s.getMeasuredWidth();
                    measureChildWithMargins(s, i3, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void l(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View s = s(i4);
            if (s.getVisibility() != 8) {
                a aVar = (a) s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = s.getMeasuredHeight();
                    measureChildWithMargins(s, makeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int right;
        int left;
        int i2;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean b2 = w0.b(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View s = s(i3);
            if (s != null && s.getVisibility() != 8 && t(i3)) {
                a aVar = (a) s.getLayoutParams();
                if (b2) {
                    left2 = s.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                } else {
                    left2 = (s.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.q;
                }
                j(canvas, left2);
            }
        }
        if (t(virtualChildCount)) {
            View s2 = s(virtualChildCount - 1);
            if (s2 != null) {
                a aVar2 = (a) s2.getLayoutParams();
                if (b2) {
                    left = s2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i2 = this.q;
                    right = left - i2;
                } else {
                    right = s2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (b2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.q;
                right = left - i2;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f456g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f456g;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f456g == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i4 = this.f457h;
            if (this.f458i == 1 && (i2 = this.f459j & 112) != 48) {
                if (i2 == 16) {
                    i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f460k) / 2;
                } else if (i2 == 80) {
                    i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f460k;
                }
            }
            return i4 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f456g;
    }

    public Drawable getDividerDrawable() {
        return this.p;
    }

    public int getDividerPadding() {
        return this.t;
    }

    public int getDividerWidth() {
        return this.q;
    }

    public int getGravity() {
        return this.f459j;
    }

    public int getOrientation() {
        return this.f458i;
    }

    public int getShowDividers() {
        return this.s;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.l;
    }

    void h(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View s = s(i2);
            if (s != null && s.getVisibility() != 8 && t(i2)) {
                i(canvas, (s.getTop() - ((ViewGroup.MarginLayoutParams) ((a) s.getLayoutParams())).topMargin) - this.r);
            }
        }
        if (t(virtualChildCount)) {
            View s2 = s(virtualChildCount - 1);
            if (s2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.r;
            } else {
                bottom = s2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) s2.getLayoutParams())).bottomMargin;
            }
            i(canvas, bottom);
        }
    }

    void i(Canvas canvas, int i2) {
        this.p.setBounds(getPaddingLeft() + this.t, i2, (getWidth() - getPaddingRight()) - this.t, this.r + i2);
        this.p.draw(canvas);
    }

    void j(Canvas canvas, int i2) {
        this.p.setBounds(i2, getPaddingTop() + this.t, this.q + i2, (getHeight() - getPaddingBottom()) - this.t);
        this.p.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i2 = this.f458i;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.p == null) {
            return;
        }
        if (this.f458i == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f458i == 1) {
            v(i2, i3, i4, i5);
        } else {
            u(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f458i == 1) {
            z(i2, i3);
        } else {
            x(i2, i3);
        }
    }

    int p(View view, int i2) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i2) {
        return getChildAt(i2);
    }

    public void setBaselineAligned(boolean z) {
        this.f455f = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f456g = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.p) {
            return;
        }
        this.p = drawable;
        if (drawable != null) {
            this.q = drawable.getIntrinsicWidth();
            this.r = drawable.getIntrinsicHeight();
        } else {
            this.q = 0;
            this.r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.t = i2;
    }

    public void setGravity(int i2) {
        if (this.f459j != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f459j = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f459j;
        if ((8388615 & i4) != i3) {
            this.f459j = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.m = z;
    }

    public void setOrientation(int i2) {
        if (this.f458i != i2) {
            this.f458i = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.s) {
            requestLayout();
        }
        this.s = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f459j;
        if ((i4 & 112) != i3) {
            this.f459j = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.l = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t(int i2) {
        if (i2 == 0) {
            return (this.s & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.s & 4) != 0;
        }
        if ((this.s & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f459j
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f460k
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f460k
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.y(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.c0$a r5 = (androidx.appcompat.widget.c0.a) r5
            int r1 = r5.f461b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.u.y(r17)
            int r1 = androidx.core.view.d.b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto La2
            int r1 = r6.r
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc5:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.v(int, int, int, int):void");
    }

    void w(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void x(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.x(int, int):void");
    }

    int y(int i2) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.z(int, int):void");
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f455f = true;
        this.f456g = -1;
        this.f457h = 0;
        this.f459j = 8388659;
        int[] iArr = c.a.j.b1;
        q0 v = q0.v(context, attributeSet, iArr, i2, 0);
        androidx.core.view.u.g0(this, context, iArr, attributeSet, v.r(), i2, 0);
        int k2 = v.k(c.a.j.d1, -1);
        if (k2 >= 0) {
            setOrientation(k2);
        }
        int k3 = v.k(c.a.j.c1, -1);
        if (k3 >= 0) {
            setGravity(k3);
        }
        boolean a2 = v.a(c.a.j.e1, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.l = v.i(c.a.j.g1, -1.0f);
        this.f456g = v.k(c.a.j.f1, -1);
        this.m = v.a(c.a.j.j1, false);
        setDividerDrawable(v.g(c.a.j.h1));
        this.s = v.k(c.a.j.k1, 0);
        this.t = v.f(c.a.j.i1, 0);
        v.w();
    }

    /* compiled from: LinearLayoutCompat.java */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public float a;

        /* renamed from: b, reason: collision with root package name */
        public int f461b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f461b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.j.l1);
            this.a = obtainStyledAttributes.getFloat(c.a.j.n1, 0.0f);
            this.f461b = obtainStyledAttributes.getInt(c.a.j.m1, -1);
            obtainStyledAttributes.recycle();
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.f461b = -1;
            this.a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f461b = -1;
        }
    }
}
