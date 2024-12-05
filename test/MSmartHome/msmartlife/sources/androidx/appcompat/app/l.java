package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.x;
import androidx.core.view.u;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public class l extends androidx.appcompat.app.a {
    x a;

    /* renamed from: b, reason: collision with root package name */
    boolean f175b;

    /* renamed from: c, reason: collision with root package name */
    Window.Callback f176c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f177d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f178e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<a.b> f179f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f180g = new a();

    /* renamed from: h, reason: collision with root package name */
    private final Toolbar.f f181h;

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.A();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return l.this.f176c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements m.a {

        /* renamed from: f, reason: collision with root package name */
        private boolean f183f;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (this.f183f) {
                return;
            }
            this.f183f = true;
            l.this.a.h();
            Window.Callback callback = l.this.f176c;
            if (callback != null) {
                callback.onPanelClosed(108, gVar);
            }
            this.f183f = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback = l.this.f176c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            l lVar = l.this;
            if (lVar.f176c != null) {
                if (lVar.a.b()) {
                    l.this.f176c.onPanelClosed(108, gVar);
                } else if (l.this.f176c.onPreparePanel(0, null, gVar)) {
                    l.this.f176c.onMenuOpened(108, gVar);
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    private class e extends c.a.o.i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            if (i2 == 0) {
                return new View(l.this.a.getContext());
            }
            return super.onCreatePanelView(i2);
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (onPreparePanel) {
                l lVar = l.this;
                if (!lVar.f175b) {
                    lVar.a.c();
                    l.this.f175b = true;
                }
            }
            return onPreparePanel;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f181h = bVar;
        this.a = new r0(toolbar, false);
        e eVar = new e(callback);
        this.f176c = eVar;
        this.a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.a.setWindowTitle(charSequence);
    }

    private Menu y() {
        if (!this.f177d) {
            this.a.p(new c(), new d());
            this.f177d = true;
        }
        return this.a.l();
    }

    void A() {
        Menu y = y();
        androidx.appcompat.view.menu.g gVar = y instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) y : null;
        if (gVar != null) {
            gVar.h0();
        }
        try {
            y.clear();
            if (!this.f176c.onCreatePanelMenu(0, y) || !this.f176c.onPreparePanel(0, null, y)) {
                y.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.g0();
            }
        }
    }

    public void B(int i2, int i3) {
        this.a.k((i2 & i3) | ((i3 ^ (-1)) & this.a.t()));
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.a.f();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (!this.a.j()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z) {
        if (z == this.f178e) {
            return;
        }
        this.f178e = z;
        int size = this.f179f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f179f.get(i2).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.a.t();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        this.a.r().removeCallbacks(this.f180g);
        u.a0(this.a.r(), this.f180g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        super.l(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void m() {
        this.a.r().removeCallbacks(this.f180g);
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i2, KeyEvent keyEvent) {
        Menu y = y();
        if (y == null) {
            return false;
        }
        y.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return y.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean p() {
        return this.a.g();
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        B(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        B(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public Window.Callback z() {
        return this.f176c;
    }
}
