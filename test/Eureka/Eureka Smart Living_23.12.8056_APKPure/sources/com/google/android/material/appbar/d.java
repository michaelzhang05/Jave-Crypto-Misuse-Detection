package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.b1;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final View f4679a;

    /* renamed from: b, reason: collision with root package name */
    private int f4680b;

    /* renamed from: c, reason: collision with root package name */
    private int f4681c;

    /* renamed from: d, reason: collision with root package name */
    private int f4682d;

    /* renamed from: e, reason: collision with root package name */
    private int f4683e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4684f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4685g = true;

    public d(View view) {
        this.f4679a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view = this.f4679a;
        b1.b0(view, this.f4682d - (view.getTop() - this.f4680b));
        View view2 = this.f4679a;
        b1.a0(view2, this.f4683e - (view2.getLeft() - this.f4681c));
    }

    public int b() {
        return this.f4682d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f4680b = this.f4679a.getTop();
        this.f4681c = this.f4679a.getLeft();
    }

    public boolean d(int i6) {
        if (!this.f4685g || this.f4683e == i6) {
            return false;
        }
        this.f4683e = i6;
        a();
        return true;
    }

    public boolean e(int i6) {
        if (!this.f4684f || this.f4682d == i6) {
            return false;
        }
        this.f4682d = i6;
        a();
        return true;
    }
}
