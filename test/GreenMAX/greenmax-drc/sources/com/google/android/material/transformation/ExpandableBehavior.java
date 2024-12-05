package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    private int a;

    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f16804f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f16805g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e.e.b.b.t.a f16806h;

        a(View view, int i2, e.e.b.b.t.a aVar) {
            this.f16804f = view;
            this.f16805g = i2;
            this.f16806h = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f16804f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.f16805g) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                e.e.b.b.t.a aVar = this.f16806h;
                expandableBehavior.H((View) aVar, this.f16804f, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    private boolean F(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i2 = this.a;
        return i2 == 0 || i2 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected e.e.b.b.t.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r = coordinatorLayout.r(view);
        int size = r.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = r.get(i2);
            if (e(coordinatorLayout, view, view2)) {
                return (e.e.b.b.t.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        e.e.b.b.t.a aVar = (e.e.b.b.t.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        e.e.b.b.t.a G;
        if (u.O(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i3 = G.a() ? 1 : 2;
        this.a = i3;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i3, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
