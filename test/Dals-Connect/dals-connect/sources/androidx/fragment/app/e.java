package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.x;

/* compiled from: FragmentController.java */
/* loaded from: classes.dex */
public class e {
    private final g<?> a;

    private e(g<?> gVar) {
        this.a = gVar;
    }

    public static e b(g<?> gVar) {
        return new e((g) c.h.j.j.d(gVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        g<?> gVar = this.a;
        gVar.f1124j.x(gVar, gVar, fragment);
    }

    public void c() {
        this.a.f1124j.G();
    }

    public void d(Configuration configuration) {
        this.a.f1124j.H(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.f1124j.I(menuItem);
    }

    public void f() {
        this.a.f1124j.J();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.f1124j.K(menu, menuInflater);
    }

    public void h() {
        this.a.f1124j.L();
    }

    public void i() {
        this.a.f1124j.N();
    }

    public void j(boolean z) {
        this.a.f1124j.O(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.f1124j.d0(menuItem);
    }

    public void l(Menu menu) {
        this.a.f1124j.e0(menu);
    }

    public void m() {
        this.a.f1124j.g0();
    }

    public void n(boolean z) {
        this.a.f1124j.h0(z);
    }

    public boolean o(Menu menu) {
        return this.a.f1124j.i0(menu);
    }

    public void p() {
        this.a.f1124j.k0();
    }

    public void q() {
        this.a.f1124j.l0();
    }

    public void r() {
        this.a.f1124j.n0();
    }

    public boolean s() {
        return this.a.f1124j.t0();
    }

    public Fragment t(String str) {
        return this.a.f1124j.y0(str);
    }

    public h u() {
        return this.a.f1124j;
    }

    public void v() {
        this.a.f1124j.Y0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.f1124j.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        g<?> gVar = this.a;
        if (gVar instanceof x) {
            gVar.f1124j.h1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable y() {
        return this.a.f1124j.j1();
    }
}
