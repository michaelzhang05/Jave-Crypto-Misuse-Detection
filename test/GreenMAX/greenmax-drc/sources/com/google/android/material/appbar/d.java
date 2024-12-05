package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.u;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes2.dex */
class d {
    private final View a;

    /* renamed from: b, reason: collision with root package name */
    private int f16394b;

    /* renamed from: c, reason: collision with root package name */
    private int f16395c;

    /* renamed from: d, reason: collision with root package name */
    private int f16396d;

    /* renamed from: e, reason: collision with root package name */
    private int f16397e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16398f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16399g = true;

    public d(View view) {
        this.a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view = this.a;
        u.U(view, this.f16396d - (view.getTop() - this.f16394b));
        View view2 = this.a;
        u.T(view2, this.f16397e - (view2.getLeft() - this.f16395c));
    }

    public int b() {
        return this.f16394b;
    }

    public int c() {
        return this.f16396d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f16394b = this.a.getTop();
        this.f16395c = this.a.getLeft();
    }

    public boolean e(int i2) {
        if (!this.f16399g || this.f16397e == i2) {
            return false;
        }
        this.f16397e = i2;
        a();
        return true;
    }

    public boolean f(int i2) {
        if (!this.f16398f || this.f16396d == i2) {
            return false;
        }
        this.f16396d = i2;
        a();
        return true;
    }
}
