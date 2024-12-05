package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b1;
import androidx.core.view.c3;
import androidx.core.view.w;
import java.util.List;

/* loaded from: classes.dex */
abstract class b extends c {

    /* renamed from: d, reason: collision with root package name */
    final Rect f4672d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f4673e;

    /* renamed from: f, reason: collision with root package name */
    private int f4674f;

    /* renamed from: g, reason: collision with root package name */
    private int f4675g;

    public b() {
        this.f4672d = new Rect();
        this.f4673e = new Rect();
        this.f4674f = 0;
    }

    private static int L(int i6) {
        if (i6 == 0) {
            return 8388659;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.c
    public void F(CoordinatorLayout coordinatorLayout, View view, int i6) {
        int i7;
        View G = G(coordinatorLayout.r(view));
        if (G != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            Rect rect = this.f4672d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, G.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((coordinatorLayout.getHeight() + G.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
            c3 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && b1.B(coordinatorLayout) && !b1.B(view)) {
                rect.left += lastWindowInsets.i();
                rect.right -= lastWindowInsets.j();
            }
            Rect rect2 = this.f4673e;
            w.a(L(eVar.f1891c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i6);
            int H = H(G);
            view.layout(rect2.left, rect2.top - H, rect2.right, rect2.bottom - H);
            i7 = rect2.top - G.getBottom();
        } else {
            super.F(coordinatorLayout, view, i6);
            i7 = 0;
        }
        this.f4674f = i7;
    }

    abstract View G(List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int H(View view) {
        if (this.f4675g == 0) {
            return 0;
        }
        float I = I(view);
        int i6 = this.f4675g;
        return u.a.b((int) (I * i6), 0, i6);
    }

    abstract float I(View view);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int J(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int K() {
        return this.f4674f;
    }

    public final void M(int i6) {
        this.f4675g = i6;
    }

    protected boolean N() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int i9) {
        View G;
        c3 lastWindowInsets;
        int i10 = view.getLayoutParams().height;
        if ((i10 != -1 && i10 != -2) || (G = G(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (b1.B(G) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.k() + lastWindowInsets.h();
        }
        int J = size + J(G);
        int measuredHeight = G.getMeasuredHeight();
        if (N()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            J -= measuredHeight;
        }
        coordinatorLayout.J(view, i6, i7, View.MeasureSpec.makeMeasureSpec(J, i10 == -1 ? 1073741824 : Integer.MIN_VALUE), i9);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4672d = new Rect();
        this.f4673e = new Rect();
        this.f4674f = 0;
    }
}
