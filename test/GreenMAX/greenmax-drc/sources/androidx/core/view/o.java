package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper.java */
/* loaded from: classes.dex */
public class o {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f1014b;

    public o(ViewGroup viewGroup) {
    }

    public int a() {
        return this.a | this.f1014b;
    }

    public void b(View view, View view2, int i2) {
        c(view, view2, i2, 0);
    }

    public void c(View view, View view2, int i2, int i3) {
        if (i3 == 1) {
            this.f1014b = i2;
        } else {
            this.a = i2;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i2) {
        if (i2 == 1) {
            this.f1014b = 0;
        } else {
            this.a = 0;
        }
    }
}
