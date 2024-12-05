package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
abstract class c extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    private d f4676a;

    /* renamed from: b, reason: collision with root package name */
    private int f4677b;

    /* renamed from: c, reason: collision with root package name */
    private int f4678c;

    public c() {
        this.f4677b = 0;
        this.f4678c = 0;
    }

    public int E() {
        d dVar = this.f4676a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i6) {
        coordinatorLayout.I(view, i6);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i6) {
        F(coordinatorLayout, view, i6);
        if (this.f4676a == null) {
            this.f4676a = new d(view);
        }
        this.f4676a.c();
        this.f4676a.a();
        int i7 = this.f4677b;
        if (i7 != 0) {
            this.f4676a.e(i7);
            this.f4677b = 0;
        }
        int i8 = this.f4678c;
        if (i8 == 0) {
            return true;
        }
        this.f4676a.d(i8);
        this.f4678c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4677b = 0;
        this.f4678c = 0;
    }
}
