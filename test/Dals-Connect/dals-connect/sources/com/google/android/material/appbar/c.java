package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes2.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {
    private d a;

    /* renamed from: b, reason: collision with root package name */
    private int f16392b;

    /* renamed from: c, reason: collision with root package name */
    private int f16393c;

    public c() {
        this.f16392b = 0;
        this.f16393c = 0;
    }

    public int E() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.I(v, i2);
    }

    public boolean G(int i2) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.f(i2);
        }
        this.f16392b = i2;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        F(coordinatorLayout, v, i2);
        if (this.a == null) {
            this.a = new d(v);
        }
        this.a.d();
        this.a.a();
        int i3 = this.f16392b;
        if (i3 != 0) {
            this.a.f(i3);
            this.f16392b = 0;
        }
        int i4 = this.f16393c;
        if (i4 == 0) {
            return true;
        }
        this.a.e(i4);
        this.f16393c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16392b = 0;
        this.f16393c = 0;
    }
}
