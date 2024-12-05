package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f454a;

    /* renamed from: b, reason: collision with root package name */
    final b f455b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f456a;

        /* renamed from: b, reason: collision with root package name */
        final Context f457b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f458c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final l.g f459d = new l.g();

        public a(Context context, ActionMode.Callback callback) {
            this.f457b = context;
            this.f456a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f459d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f457b, (t.a) menu);
            this.f459d.put(menu, oVar);
            return oVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f456a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, MenuItem menuItem) {
            return this.f456a.onActionItemClicked(e(bVar), new androidx.appcompat.view.menu.j(this.f457b, (t.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f456a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public void d(b bVar) {
            this.f456a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f458c.size();
            for (int i6 = 0; i6 < size; i6++) {
                f fVar = (f) this.f458c.get(i6);
                if (fVar != null && fVar.f455b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f457b, bVar);
            this.f458c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f454a = context;
        this.f455b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f455b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f455b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f454a, (t.a) this.f455b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f455b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f455b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f455b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f455b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f455b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f455b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f455b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f455b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i6) {
        this.f455b.n(i6);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f455b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i6) {
        this.f455b.q(i6);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z5) {
        this.f455b.s(z5);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f455b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f455b.r(charSequence);
    }
}
