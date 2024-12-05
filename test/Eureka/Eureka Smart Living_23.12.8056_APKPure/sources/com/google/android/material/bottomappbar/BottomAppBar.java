package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.f0;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b1;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import m2.a;
import m2.i;

/* loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar {
    private static final int T = i.f7691h;
    private static final int U = a.f7571y;
    private static final int V = a.E;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m, reason: collision with root package name */
        private final Rect f4716m;

        /* renamed from: n, reason: collision with root package name */
        private WeakReference f4717n;

        /* renamed from: o, reason: collision with root package name */
        private int f4718o;

        /* renamed from: p, reason: collision with root package name */
        private final View.OnLayoutChangeListener f4719p;

        /* loaded from: classes.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                f0.a(Behavior.this.f4717n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f4719p = new a();
            this.f4716m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i7) {
            f0.a(view);
            return P(coordinatorLayout, null, view2, view3, i6, i7);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i6) {
            this.f4717n = new WeakReference(bottomAppBar);
            View U = BottomAppBar.U(bottomAppBar);
            if (U != null && !b1.U(U)) {
                BottomAppBar.W(bottomAppBar, U);
                this.f4718o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) U.getLayoutParams())).bottomMargin;
                U.addOnLayoutChangeListener(this.f4719p);
                BottomAppBar.T(bottomAppBar);
            }
            coordinatorLayout.I(bottomAppBar, i6);
            return super.l(coordinatorLayout, bottomAppBar, i6);
        }

        public boolean P(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i6, int i7) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i6) {
            f0.a(view);
            return O(coordinatorLayout, null, i6);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4719p = new a();
            this.f4716m = new Rect();
        }
    }

    static /* synthetic */ void T(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View U(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.e) view.getLayoutParams()).f1892d = 17;
        throw null;
    }
}
