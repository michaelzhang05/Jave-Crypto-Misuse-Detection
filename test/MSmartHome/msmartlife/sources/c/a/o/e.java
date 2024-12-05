package c.a.o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import c.a.o.b;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: h, reason: collision with root package name */
    private Context f2292h;

    /* renamed from: i, reason: collision with root package name */
    private ActionBarContextView f2293i;

    /* renamed from: j, reason: collision with root package name */
    private b.a f2294j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<View> f2295k;
    private boolean l;
    private boolean m;
    private androidx.appcompat.view.menu.g n;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f2292h = context;
        this.f2293i = actionBarContextView;
        this.f2294j = aVar;
        androidx.appcompat.view.menu.g W = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).W(1);
        this.n = W;
        W.V(this);
        this.m = z;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f2294j.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f2293i.l();
    }

    @Override // c.a.o.b
    public void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.f2293i.sendAccessibilityEvent(32);
        this.f2294j.a(this);
    }

    @Override // c.a.o.b
    public View d() {
        WeakReference<View> weakReference = this.f2295k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // c.a.o.b
    public Menu e() {
        return this.n;
    }

    @Override // c.a.o.b
    public MenuInflater f() {
        return new g(this.f2293i.getContext());
    }

    @Override // c.a.o.b
    public CharSequence g() {
        return this.f2293i.getSubtitle();
    }

    @Override // c.a.o.b
    public CharSequence i() {
        return this.f2293i.getTitle();
    }

    @Override // c.a.o.b
    public void k() {
        this.f2294j.c(this, this.n);
    }

    @Override // c.a.o.b
    public boolean l() {
        return this.f2293i.j();
    }

    @Override // c.a.o.b
    public void m(View view) {
        this.f2293i.setCustomView(view);
        this.f2295k = view != null ? new WeakReference<>(view) : null;
    }

    @Override // c.a.o.b
    public void n(int i2) {
        o(this.f2292h.getString(i2));
    }

    @Override // c.a.o.b
    public void o(CharSequence charSequence) {
        this.f2293i.setSubtitle(charSequence);
    }

    @Override // c.a.o.b
    public void q(int i2) {
        r(this.f2292h.getString(i2));
    }

    @Override // c.a.o.b
    public void r(CharSequence charSequence) {
        this.f2293i.setTitle(charSequence);
    }

    @Override // c.a.o.b
    public void s(boolean z) {
        super.s(z);
        this.f2293i.setTitleOptional(z);
    }
}
