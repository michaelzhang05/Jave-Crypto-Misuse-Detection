package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f728a;

    /* renamed from: b, reason: collision with root package name */
    private View f729b;

    /* renamed from: c, reason: collision with root package name */
    private View f730c;

    /* renamed from: d, reason: collision with root package name */
    private View f731d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f732e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f733f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f734g;

    /* renamed from: h, reason: collision with root package name */
    boolean f735h;

    /* renamed from: i, reason: collision with root package name */
    boolean f736i;

    /* renamed from: j, reason: collision with root package name */
    private int f737j;

    /* loaded from: classes.dex */
    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.b1.u0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f6250a);
        this.f732e = obtainStyledAttributes.getDrawable(d.j.f6255b);
        this.f733f = obtainStyledAttributes.getDrawable(d.j.f6265d);
        this.f737j = obtainStyledAttributes.getDimensionPixelSize(d.j.f6295j, -1);
        boolean z5 = true;
        if (getId() == d.f.H) {
            this.f735h = true;
            this.f734g = obtainStyledAttributes.getDrawable(d.j.f6260c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f735h ? this.f732e != null || this.f733f != null : this.f734g != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f732e;
        if (drawable != null && drawable.isStateful()) {
            this.f732e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f733f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f733f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f734g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f734g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f729b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f732e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f733f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f734g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f730c = findViewById(d.f.f6188a);
        this.f731d = findViewById(d.f.f6193f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f728a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z5, i6, i7, i8, i9);
        View view2 = this.f729b;
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i10 = layoutParams.bottomMargin;
            view2.layout(i6, measuredHeight2 - i10, i8, measuredHeight - i10);
        }
        if (this.f735h) {
            Drawable drawable3 = this.f734g;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z6 = false;
            }
        } else {
            if (this.f732e != null) {
                if (this.f730c.getVisibility() == 0) {
                    drawable2 = this.f732e;
                    left = this.f730c.getLeft();
                    top = this.f730c.getTop();
                    right = this.f730c.getRight();
                    view = this.f730c;
                } else {
                    View view3 = this.f731d;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f732e.setBounds(0, 0, 0, 0);
                        z7 = true;
                    } else {
                        drawable2 = this.f732e;
                        left = this.f731d.getLeft();
                        top = this.f731d.getTop();
                        right = this.f731d.getRight();
                        view = this.f731d;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z7 = true;
            }
            this.f736i = z8;
            if (!z8 || (drawable = this.f733f) == null) {
                z6 = z7;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z6) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f730c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f737j
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f730c
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f729b
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f730c
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f730c
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f731d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f731d
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f729b
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f732e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f732e);
        }
        this.f732e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f730c;
            if (view != null) {
                this.f732e.setBounds(view.getLeft(), this.f730c.getTop(), this.f730c.getRight(), this.f730c.getBottom());
            }
        }
        boolean z5 = true;
        if (!this.f735h ? this.f732e != null || this.f733f != null : this.f734g != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f734g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f734g);
        }
        this.f734g = drawable;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f735h && (drawable2 = this.f734g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f735h ? !(this.f732e != null || this.f733f != null) : this.f734g == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f733f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f733f);
        }
        this.f733f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f736i && (drawable2 = this.f733f) != null) {
                drawable2.setBounds(this.f729b.getLeft(), this.f729b.getTop(), this.f729b.getRight(), this.f729b.getBottom());
            }
        }
        boolean z5 = true;
        if (!this.f735h ? this.f732e != null || this.f733f != null : this.f734g != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(v2 v2Var) {
        View view = this.f729b;
        if (view != null) {
            removeView(view);
        }
        this.f729b = v2Var;
    }

    public void setTransitioning(boolean z5) {
        this.f728a = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z5 = i6 == 0;
        Drawable drawable = this.f732e;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f733f;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f734g;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f732e && !this.f735h) || (drawable == this.f733f && this.f736i) || ((drawable == this.f734g && this.f735h) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i6) {
        if (i6 != 0) {
            return super.startActionModeForChild(view, callback, i6);
        }
        return null;
    }
}
