package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import e.e.b.b.b;
import e.e.b.b.k;
import e.e.b.b.z.h;
import e.e.b.b.z.n;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, n {
    private static final int[] o = {R.attr.state_checkable};
    private static final int[] p = {R.attr.state_checked};
    private static final int[] q = {b.E};
    private static final int r = k.q;
    private final com.google.android.material.card.a s;
    private boolean t;
    private boolean u;
    private boolean v;
    private a w;

    /* loaded from: classes2.dex */
    public interface a {
        void a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.w);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.s.k().getBounds());
        return rectF;
    }

    private void h() {
        if (Build.VERSION.SDK_INT > 26) {
            this.s.j();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.s.l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.s.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.s.n();
    }

    public ColorStateList getCheckedIconTint() {
        return this.s.o();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.s.y().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.s.y().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.s.y().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.s.y().top;
    }

    public float getProgress() {
        return this.s.s();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.s.q();
    }

    public ColorStateList getRippleColor() {
        return this.s.t();
    }

    public e.e.b.b.z.k getShapeAppearanceModel() {
        return this.s.u();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.s.v();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.s.w();
    }

    public int getStrokeWidth() {
        return this.s.x();
    }

    public boolean i() {
        com.google.android.material.card.a aVar = this.s;
        return aVar != null && aVar.B();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.u;
    }

    public boolean j() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i2, int i3, int i4, int i5) {
        super.f(i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.s.k());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, o);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, p);
        }
        if (j()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(i());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.s.D(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.t) {
            if (!this.s.A()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.s.E(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i2) {
        this.s.F(ColorStateList.valueOf(i2));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        this.s.V();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.s.G(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.s.H(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.u != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.s.I(drawable);
    }

    public void setCheckedIconResource(int i2) {
        this.s.I(c.a.k.a.a.d(getContext(), i2));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.s.J(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.s.T();
    }

    public void setDragged(boolean z) {
        if (this.v != z) {
            this.v = z;
            refreshDrawableState();
            h();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.s.X();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.w = aVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.s.X();
        this.s.U();
    }

    public void setProgress(float f2) {
        this.s.L(f2);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
        super.setRadius(f2);
        this.s.K(f2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.s.M(colorStateList);
    }

    public void setRippleColorResource(int i2) {
        this.s.M(c.a.k.a.a.c(getContext(), i2));
    }

    @Override // e.e.b.b.z.n
    public void setShapeAppearanceModel(e.e.b.b.z.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.u(getBoundsAsRectF()));
        }
        this.s.N(kVar);
    }

    public void setStrokeColor(int i2) {
        this.s.O(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(int i2) {
        this.s.P(i2);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.s.X();
        this.s.U();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (i() && isEnabled()) {
            this.u = !this.u;
            refreshDrawableState();
            h();
            a aVar = this.w;
            if (aVar != null) {
                aVar.a(this, this.u);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.r
            android.content.Context r8 = com.google.android.material.theme.a.a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.u = r8
            r7.v = r8
            r0 = 1
            r7.t = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = e.e.b.b.l.i3
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.s = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.F(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.Q(r9, r10, r1, r2)
            r0.C(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.s.F(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.s.O(colorStateList);
    }
}
