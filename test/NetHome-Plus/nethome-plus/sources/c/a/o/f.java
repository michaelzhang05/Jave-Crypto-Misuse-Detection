package c.a.o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import c.a.o.b;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public class f extends ActionMode {
    final Context a;

    /* renamed from: b, reason: collision with root package name */
    final b f2296b;

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements b.a {
        final ActionMode.Callback a;

        /* renamed from: b, reason: collision with root package name */
        final Context f2297b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f2298c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final c.e.g<Menu, Menu> f2299d = new c.e.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f2297b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f2299d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f2297b, (c.h.f.a.a) menu);
            this.f2299d.put(menu, oVar);
            return oVar;
        }

        @Override // c.a.o.b.a
        public void a(b bVar) {
            this.a.onDestroyActionMode(e(bVar));
        }

        @Override // c.a.o.b.a
        public boolean b(b bVar, Menu menu) {
            return this.a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // c.a.o.b.a
        public boolean c(b bVar, Menu menu) {
            return this.a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // c.a.o.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(bVar), new j(this.f2297b, (c.h.f.a.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f2298c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f2298c.get(i2);
                if (fVar != null && fVar.f2296b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f2297b, bVar);
            this.f2298c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.a = context;
        this.f2296b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2296b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2296b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.a, (c.h.f.a.a) this.f2296b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2296b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2296b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2296b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2296b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2296b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2296b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2296b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2296b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2296b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2296b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2296b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f2296b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f2296b.n(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f2296b.q(i2);
    }
}
