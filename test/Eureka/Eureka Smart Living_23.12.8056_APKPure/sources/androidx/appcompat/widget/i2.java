package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public abstract class i2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1057a;

    /* renamed from: b, reason: collision with root package name */
    private int f1058b;

    /* renamed from: c, reason: collision with root package name */
    private int f1059c;

    /* renamed from: d, reason: collision with root package name */
    private int f1060d;

    /* renamed from: e, reason: collision with root package name */
    private int f1061e;

    /* renamed from: f, reason: collision with root package name */
    private int f1062f;

    /* renamed from: g, reason: collision with root package name */
    private float f1063g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1064h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f1065i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f1066j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f1067k;

    /* renamed from: l, reason: collision with root package name */
    private int f1068l;

    /* renamed from: m, reason: collision with root package name */
    private int f1069m;

    /* renamed from: n, reason: collision with root package name */
    private int f1070n;

    /* renamed from: o, reason: collision with root package name */
    private int f1071o;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i6, int i7) {
            super(i6, i7);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public i2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A(View view, int i6, int i7, int i8, int i9) {
        view.layout(i6, i7, i8 + i6, i9 + i7);
    }

    private void k(int i6, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i8 = 0; i8 < i6; i8++) {
            View s5 = s(i8);
            if (s5.getVisibility() != 8) {
                a aVar = (a) s5.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i9 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = s5.getMeasuredWidth();
                    measureChildWithMargins(s5, i7, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i9;
                }
            }
        }
    }

    private void l(int i6, int i7) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i8 = 0; i8 < i6; i8++) {
            View s5 = s(i8);
            if (s5.getVisibility() != 8) {
                a aVar = (a) s5.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i9 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = s5.getMeasuredHeight();
                    measureChildWithMargins(s5, makeMeasureSpec, 0, i7, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i9;
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
        int i6;
        int virtualChildCount = getVirtualChildCount();
        boolean b6 = p3.b(this);
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View s5 = s(i7);
            if (s5 != null && s5.getVisibility() != 8 && t(i7)) {
                a aVar = (a) s5.getLayoutParams();
                j(canvas, b6 ? s5.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (s5.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1068l);
            }
        }
        if (t(virtualChildCount)) {
            View s6 = s(virtualChildCount - 1);
            if (s6 != null) {
                a aVar2 = (a) s6.getLayoutParams();
                if (b6) {
                    left = s6.getLeft();
                    i6 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i6) - this.f1068l;
                } else {
                    right = s6.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b6) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i6 = getPaddingRight();
                right = (left - i6) - this.f1068l;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i6;
        if (this.f1058b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i7 = this.f1058b;
        if (childCount <= i7) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i7);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1058b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i8 = this.f1059c;
        if (this.f1060d == 1 && (i6 = this.f1061e & 112) != 48) {
            if (i6 == 16) {
                i8 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1062f) / 2;
            } else if (i6 == 80) {
                i8 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1062f;
            }
        }
        return i8 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1058b;
    }

    public Drawable getDividerDrawable() {
        return this.f1067k;
    }

    public int getDividerPadding() {
        return this.f1071o;
    }

    public int getDividerWidth() {
        return this.f1068l;
    }

    public int getGravity() {
        return this.f1061e;
    }

    public int getOrientation() {
        return this.f1060d;
    }

    public int getShowDividers() {
        return this.f1070n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1063g;
    }

    void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            View s5 = s(i6);
            if (s5 != null && s5.getVisibility() != 8 && t(i6)) {
                i(canvas, (s5.getTop() - ((LinearLayout.LayoutParams) ((a) s5.getLayoutParams())).topMargin) - this.f1069m);
            }
        }
        if (t(virtualChildCount)) {
            View s6 = s(virtualChildCount - 1);
            i(canvas, s6 == null ? (getHeight() - getPaddingBottom()) - this.f1069m : s6.getBottom() + ((LinearLayout.LayoutParams) ((a) s6.getLayoutParams())).bottomMargin);
        }
    }

    void i(Canvas canvas, int i6) {
        this.f1067k.setBounds(getPaddingLeft() + this.f1071o, i6, (getWidth() - getPaddingRight()) - this.f1071o, this.f1069m + i6);
        this.f1067k.draw(canvas);
    }

    void j(Canvas canvas, int i6) {
        this.f1067k.setBounds(i6, getPaddingTop() + this.f1071o, this.f1068l + i6, (getHeight() - getPaddingBottom()) - this.f1071o);
        this.f1067k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i6 = this.f1060d;
        if (i6 == 0) {
            return new a(-2, -2);
        }
        if (i6 == 1) {
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
        if (this.f1067k == null) {
            return;
        }
        if (this.f1060d == 1) {
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
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        if (this.f1060d == 1) {
            v(i6, i7, i8, i9);
        } else {
            u(i6, i7, i8, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        if (this.f1060d == 1) {
            z(i6, i7);
        } else {
            x(i6, i7);
        }
    }

    int p(View view, int i6) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i6) {
        return getChildAt(i6);
    }

    public void setBaselineAligned(boolean z5) {
        this.f1057a = z5;
    }

    public void setBaselineAlignedChildIndex(int i6) {
        if (i6 >= 0 && i6 < getChildCount()) {
            this.f1058b = i6;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1067k) {
            return;
        }
        this.f1067k = drawable;
        if (drawable != null) {
            this.f1068l = drawable.getIntrinsicWidth();
            this.f1069m = drawable.getIntrinsicHeight();
        } else {
            this.f1068l = 0;
            this.f1069m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i6) {
        this.f1071o = i6;
    }

    public void setGravity(int i6) {
        if (this.f1061e != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.f1061e = i6;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i6) {
        int i7 = i6 & 8388615;
        int i8 = this.f1061e;
        if ((8388615 & i8) != i7) {
            this.f1061e = i7 | ((-8388616) & i8);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z5) {
        this.f1064h = z5;
    }

    public void setOrientation(int i6) {
        if (this.f1060d != i6) {
            this.f1060d = i6;
            requestLayout();
        }
    }

    public void setShowDividers(int i6) {
        if (i6 != this.f1070n) {
            requestLayout();
        }
        this.f1070n = i6;
    }

    public void setVerticalGravity(int i6) {
        int i7 = i6 & 112;
        int i8 = this.f1061e;
        if ((i8 & 112) != i7) {
            this.f1061e = i7 | (i8 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f1063g = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t(int i6) {
        if (i6 == 0) {
            return (this.f1070n & 1) != 0;
        }
        if (i6 == getChildCount()) {
            return (this.f1070n & 4) != 0;
        }
        if ((this.f1070n & 2) == 0) {
            return false;
        }
        for (int i7 = i6 - 1; i7 >= 0; i7--) {
            if (getChildAt(i7).getVisibility() != 8) {
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
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i2.u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
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
            int r0 = r6.f1061e
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
            int r1 = r6.f1062f
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1062f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc6
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.y(r12)
            int r0 = r0 + r1
            goto Lc3
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc3
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.i2$a r5 = (androidx.appcompat.widget.i2.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.b1.E(r17)
            int r1 = androidx.core.view.w.b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1069m
            int r0 = r0 + r1
        La0:
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
        Lc3:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i2.v(int, int, int, int):void");
    }

    void w(View view, int i6, int i7, int i8, int i9, int i10) {
        measureChildWithMargins(view, i7, i8, i9, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a0, code lost:
    
        if (r8 > 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03ad, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03ae, code lost:
    
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03ab, code lost:
    
        if (r8 < 0) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void x(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i2.x(int, int):void");
    }

    int y(int i6) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ce, code lost:
    
        if (r15 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02db, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02dc, code lost:
    
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02d9, code lost:
    
        if (r15 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0319  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i2.z(int, int):void");
    }

    public i2(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f1057a = true;
        this.f1058b = -1;
        this.f1059c = 0;
        this.f1061e = 8388659;
        c3 v5 = c3.v(context, attributeSet, d.j.f6252a1, i6, 0);
        androidx.core.view.b1.o0(this, context, d.j.f6252a1, attributeSet, v5.r(), i6, 0);
        int k6 = v5.k(d.j.f6262c1, -1);
        if (k6 >= 0) {
            setOrientation(k6);
        }
        int k7 = v5.k(d.j.f6257b1, -1);
        if (k7 >= 0) {
            setGravity(k7);
        }
        boolean a6 = v5.a(d.j.f6267d1, true);
        if (!a6) {
            setBaselineAligned(a6);
        }
        this.f1063g = v5.i(d.j.f6277f1, -1.0f);
        this.f1058b = v5.k(d.j.f6272e1, -1);
        this.f1064h = v5.a(d.j.f6292i1, false);
        setDividerDrawable(v5.g(d.j.f6282g1));
        this.f1070n = v5.k(d.j.f6297j1, 0);
        this.f1071o = v5.f(d.j.f6287h1, 0);
        v5.w();
    }
}
