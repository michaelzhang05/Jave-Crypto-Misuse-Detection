package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final o f2941a;

    private m(o oVar) {
        this.f2941a = oVar;
    }

    public static m b(o oVar) {
        return new m((o) androidx.core.util.h.g(oVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        o oVar = this.f2941a;
        oVar.f2947e.m(oVar, oVar, fragment);
    }

    public void c() {
        this.f2941a.f2947e.x();
    }

    public boolean d(MenuItem menuItem) {
        return this.f2941a.f2947e.A(menuItem);
    }

    public void e() {
        this.f2941a.f2947e.B();
    }

    public void f() {
        this.f2941a.f2947e.D();
    }

    public void g() {
        this.f2941a.f2947e.M();
    }

    public void h() {
        this.f2941a.f2947e.Q();
    }

    public void i() {
        this.f2941a.f2947e.R();
    }

    public void j() {
        this.f2941a.f2947e.T();
    }

    public boolean k() {
        return this.f2941a.f2947e.a0(true);
    }

    public w l() {
        return this.f2941a.f2947e;
    }

    public void m() {
        this.f2941a.f2947e.W0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2941a.f2947e.v0().onCreateView(view, str, context, attributeSet);
    }
}
