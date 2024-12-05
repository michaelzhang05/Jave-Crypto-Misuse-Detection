package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    private int f2399a;

    /* renamed from: b, reason: collision with root package name */
    private int f2400b;

    public v0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2399a | this.f2400b;
    }

    public void b(View view, View view2, int i6) {
        c(view, view2, i6, 0);
    }

    public void c(View view, View view2, int i6, int i7) {
        if (i7 == 1) {
            this.f2400b = i6;
        } else {
            this.f2399a = i6;
        }
    }

    public void d(View view, int i6) {
        if (i6 == 1) {
            this.f2400b = 0;
        } else {
            this.f2399a = 0;
        }
    }
}
