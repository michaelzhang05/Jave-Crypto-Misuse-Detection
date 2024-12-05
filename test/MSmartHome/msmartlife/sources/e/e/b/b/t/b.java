package e.e.b.b.t;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ExpandableWidgetHelper.java */
/* loaded from: classes2.dex */
public final class b {
    private final View a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17530b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f17531c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.a);
        }
    }

    public int b() {
        return this.f17531c;
    }

    public boolean c() {
        return this.f17530b;
    }

    public void d(Bundle bundle) {
        this.f17530b = bundle.getBoolean("expanded", false);
        this.f17531c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f17530b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f17530b);
        bundle.putInt("expandedComponentIdHint", this.f17531c);
        return bundle;
    }

    public void f(int i2) {
        this.f17531c = i2;
    }
}
