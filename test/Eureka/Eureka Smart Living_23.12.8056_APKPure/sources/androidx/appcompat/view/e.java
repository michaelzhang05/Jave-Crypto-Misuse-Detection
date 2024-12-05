package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f447c;

    /* renamed from: d, reason: collision with root package name */
    private ActionBarContextView f448d;

    /* renamed from: e, reason: collision with root package name */
    private b.a f449e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f450f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f451g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f452h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f453i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z5) {
        this.f447c = context;
        this.f448d = actionBarContextView;
        this.f449e = aVar;
        androidx.appcompat.view.menu.g S = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).S(1);
        this.f453i = S;
        S.R(this);
        this.f452h = z5;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f449e.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f448d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f451g) {
            return;
        }
        this.f451g = true;
        this.f449e.d(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f450f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f453i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f448d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f448d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f448d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f449e.a(this, this.f453i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f448d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f448d.setCustomView(view);
        this.f450f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i6) {
        o(this.f447c.getString(i6));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f448d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i6) {
        r(this.f447c.getString(i6));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f448d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z5) {
        super.s(z5);
        this.f448d.setTitleOptional(z5);
    }
}
