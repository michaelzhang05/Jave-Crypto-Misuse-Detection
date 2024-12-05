package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.b1;
import c3.g;
import c3.h;
import com.google.android.material.internal.m;
import m2.i;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: b0, reason: collision with root package name */
    private static final int f4659b0 = i.f7699p;

    /* renamed from: c0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f4660c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer T;
    private boolean U;
    private boolean V;
    private ImageView.ScaleType W;

    /* renamed from: a0, reason: collision with root package name */
    private Boolean f4661a0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.O);
    }

    private Pair T(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i6 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void U(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.R(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.H(context);
            gVar.Q(b1.y(this));
            b1.u0(this, gVar);
        }
    }

    private void V(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i6 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i7 = measuredWidth2 + i6;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i6, 0), Math.max(i7 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i6 += max;
            i7 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i7 - i6, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i6, view.getTop(), i7, view.getBottom());
    }

    private void W() {
        if (this.U || this.V) {
            TextView e6 = m.e(this);
            TextView c6 = m.c(this);
            if (e6 == null && c6 == null) {
                return;
            }
            Pair T = T(e6, c6);
            if (this.U && e6 != null) {
                V(e6, T);
            }
            if (!this.V || c6 == null) {
                return;
            }
            V(c6, T);
        }
    }

    private Drawable X(Drawable drawable) {
        if (drawable == null || this.T == null) {
            return drawable;
        }
        Drawable r5 = androidx.core.graphics.drawable.a.r(drawable.mutate());
        androidx.core.graphics.drawable.a.n(r5, this.T.intValue());
        return r5;
    }

    private void Y() {
        ImageView b6 = m.b(this);
        if (b6 != null) {
            Boolean bool = this.f4661a0;
            if (bool != null) {
                b6.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.W;
            if (scaleType != null) {
                b6.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.W;
    }

    public Integer getNavigationIconTint() {
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        W();
        Y();
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        h.d(this, f6);
    }

    public void setLogoAdjustViewBounds(boolean z5) {
        Boolean bool = this.f4661a0;
        if (bool == null || bool.booleanValue() != z5) {
            this.f4661a0 = Boolean.valueOf(z5);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.W != scaleType) {
            this.W = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(X(drawable));
    }

    public void setNavigationIconTint(int i6) {
        this.T = Integer.valueOf(i6);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z5) {
        if (this.V != z5) {
            this.V = z5;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z5) {
        if (this.U != z5) {
            this.U = z5;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f4659b0
            android.content.Context r8 = f3.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = m2.j.f7853w3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.l.i(r0, r1, r2, r3, r4, r5)
            int r10 = m2.j.f7871z3
            boolean r10 = r9.hasValue(r10)
            r0 = -1
            if (r10 == 0) goto L2b
            int r10 = m2.j.f7871z3
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L2b:
            int r10 = m2.j.B3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.U = r10
            int r10 = m2.j.A3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.V = r10
            int r10 = m2.j.f7865y3
            int r10 = r9.getInt(r10, r0)
            if (r10 < 0) goto L4c
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.f4660c0
            int r1 = r0.length
            if (r10 >= r1) goto L4c
            r10 = r0[r10]
            r7.W = r10
        L4c:
            int r10 = m2.j.f7859x3
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L60
            int r10 = m2.j.f7859x3
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f4661a0 = r10
        L60:
            r9.recycle()
            r7.U(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
