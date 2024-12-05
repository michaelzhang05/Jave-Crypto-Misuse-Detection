package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.f0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b1;
import java.util.List;
import v2.a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    private int f5433a;

    public ExpandableBehavior() {
        this.f5433a = 0;
    }

    protected a E(CoordinatorLayout coordinatorLayout, View view) {
        List r5 = coordinatorLayout.r(view);
        int size = r5.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) r5.get(i6);
            if (e(coordinatorLayout, view, view2)) {
                f0.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        f0.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i6) {
        if (b1.U(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5433a = 0;
    }
}
