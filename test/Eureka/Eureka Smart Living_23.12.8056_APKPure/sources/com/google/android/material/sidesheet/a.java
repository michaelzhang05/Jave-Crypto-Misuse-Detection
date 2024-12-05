package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    final SideSheetBehavior f5162a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SideSheetBehavior sideSheetBehavior) {
        this.f5162a = sideSheetBehavior;
    }

    private boolean i(View view) {
        return view.getLeft() > (d() - c()) / 2;
    }

    private boolean j(float f6, float f7) {
        return c.a(f6, f7) && f7 > ((float) this.f5162a.e0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.b
    public float a(int i6) {
        float d6 = d();
        return (d6 - i6) / (d6 - c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.b
    public int b(View view, float f6, float f7) {
        if (f6 < 0.0f) {
            return 3;
        }
        if (k(view, f6)) {
            if (!j(f6, f7) && !i(view)) {
                return 3;
            }
        } else if (f6 == 0.0f || !c.a(f6, f7)) {
            int left = view.getLeft();
            if (Math.abs(left - c()) < Math.abs(left - d())) {
                return 3;
            }
        }
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.b
    public int c() {
        return Math.max(0, d() - this.f5162a.W());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.b
    public int d() {
        return this.f5162a.d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.b
    public int e(View view) {
        return view.getLeft();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.b
    public int f() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.b
    public boolean g(View view, int i6, boolean z5) {
        int c02 = this.f5162a.c0(i6);
        y.c f02 = this.f5162a.f0();
        return f02 != null && (!z5 ? !f02.H(view, c02, view.getTop()) : !f02.F(c02, view.getTop()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.b
    public void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i6, int i7) {
        int d02 = this.f5162a.d0();
        if (i6 <= d02) {
            marginLayoutParams.rightMargin = d02 - i6;
        }
    }

    boolean k(View view, float f6) {
        return Math.abs(((float) view.getRight()) + (f6 * this.f5162a.a0())) > this.f5162a.b0();
    }
}
