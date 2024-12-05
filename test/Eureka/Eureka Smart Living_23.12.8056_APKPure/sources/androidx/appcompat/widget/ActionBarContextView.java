package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f738i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f739j;

    /* renamed from: k, reason: collision with root package name */
    private View f740k;

    /* renamed from: l, reason: collision with root package name */
    private View f741l;

    /* renamed from: m, reason: collision with root package name */
    private View f742m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f743n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f744o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f745p;

    /* renamed from: q, reason: collision with root package name */
    private int f746q;

    /* renamed from: r, reason: collision with root package name */
    private int f747r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f748s;

    /* renamed from: t, reason: collision with root package name */
    private int f749t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f750a;

        a(androidx.appcompat.view.b bVar) {
            this.f750a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f750a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f743n == null) {
            LayoutInflater.from(getContext()).inflate(d.g.f6214a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f743n = linearLayout;
            this.f744o = (TextView) linearLayout.findViewById(d.f.f6192e);
            this.f745p = (TextView) this.f743n.findViewById(d.f.f6191d);
            if (this.f746q != 0) {
                this.f744o.setTextAppearance(getContext(), this.f746q);
            }
            if (this.f747r != 0) {
                this.f745p.setTextAppearance(getContext(), this.f747r);
            }
        }
        this.f744o.setText(this.f738i);
        this.f745p.setText(this.f739j);
        boolean z5 = !TextUtils.isEmpty(this.f738i);
        boolean z6 = !TextUtils.isEmpty(this.f739j);
        int i6 = 0;
        this.f745p.setVisibility(z6 ? 0 : 8);
        LinearLayout linearLayout2 = this.f743n;
        if (!z5 && !z6) {
            i6 = 8;
        }
        linearLayout2.setVisibility(i6);
        if (this.f743n.getParent() == null) {
            addView(this.f743n);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.w2 f(int i6, long j6) {
        return super.f(i6, j6);
    }

    public void g() {
        if (this.f740k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f739j;
    }

    public CharSequence getTitle() {
        return this.f738i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(androidx.appcompat.view.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f740k
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f749t
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f740k = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f740k
            goto L15
        L22:
            android.view.View r0 = r3.f740k
            int r1 = d.f.f6196i
            android.view.View r0 = r0.findViewById(r1)
            r3.f741l = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.g) r4
            androidx.appcompat.widget.c r0 = r3.f906d
            if (r0 == 0) goto L41
            r0.y()
        L41:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f906d = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f906d
            android.content.Context r2 = r3.f904b
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f906d
            androidx.appcompat.view.menu.n r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f905c = r4
            r1 = 0
            androidx.core.view.b1.u0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f905c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(androidx.appcompat.view.b):void");
    }

    public boolean j() {
        return this.f748s;
    }

    public void k() {
        removeAllViews();
        this.f742m = null;
        this.f905c = null;
        this.f906d = null;
        View view = this.f741l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f906d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f906d;
        if (cVar != null) {
            cVar.B();
            this.f906d.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        boolean b6 = p3.b(this);
        int paddingRight = b6 ? (i8 - i6) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
        View view = this.f740k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f740k.getLayoutParams();
            int i10 = b6 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i11 = b6 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d6 = androidx.appcompat.widget.a.d(paddingRight, i10, b6);
            paddingRight = androidx.appcompat.widget.a.d(d6 + e(this.f740k, d6, paddingTop, paddingTop2, b6), i11, b6);
        }
        int i12 = paddingRight;
        LinearLayout linearLayout = this.f743n;
        if (linearLayout != null && this.f742m == null && linearLayout.getVisibility() != 8) {
            i12 += e(this.f743n, i12, paddingTop, paddingTop2, b6);
        }
        int i13 = i12;
        View view2 = this.f742m;
        if (view2 != null) {
            e(view2, i13, paddingTop, paddingTop2, b6);
        }
        int paddingLeft = b6 ? getPaddingLeft() : (i8 - i6) - getPaddingRight();
        ActionMenuView actionMenuView = this.f905c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b6);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i7) {
        if (View.MeasureSpec.getMode(i6) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i7) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i6);
        int i8 = this.f907e;
        if (i8 <= 0) {
            i8 = View.MeasureSpec.getSize(i7);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i9 = i8 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        View view = this.f740k;
        if (view != null) {
            int c6 = c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f740k.getLayoutParams();
            paddingLeft = c6 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f905c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f905c, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f743n;
        if (linearLayout != null && this.f742m == null) {
            if (this.f748s) {
                this.f743n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f743n.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f743n.setVisibility(z5 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f742m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            int i13 = i12 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i12 >= 0) {
                i9 = Math.min(i12, i9);
            }
            this.f742m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(i9, i13));
        }
        if (this.f907e > 0) {
            setMeasuredDimension(size, i8);
            return;
        }
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i14) {
                i14 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i14);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i6) {
        this.f907e = i6;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f742m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f742m = view;
        if (view != null && (linearLayout = this.f743n) != null) {
            removeView(linearLayout);
            this.f743n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f739j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f738i = charSequence;
        i();
        androidx.core.view.b1.t0(this, charSequence);
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.f748s) {
            requestLayout();
        }
        this.f748s = z5;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i6) {
        super.setVisibility(i6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f6120g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        c3 v5 = c3.v(context, attributeSet, d.j.f6370y, i6, 0);
        androidx.core.view.b1.u0(this, v5.g(d.j.f6375z));
        this.f746q = v5.n(d.j.D, 0);
        this.f747r = v5.n(d.j.C, 0);
        this.f907e = v5.m(d.j.B, 0);
        this.f749t = v5.n(d.j.A, d.g.f6217d);
        v5.w();
    }
}
