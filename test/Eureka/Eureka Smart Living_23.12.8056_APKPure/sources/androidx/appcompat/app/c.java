package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.o3;
import androidx.core.app.i1;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.savedstate.a;

/* loaded from: classes.dex */
public abstract class c extends androidx.fragment.app.j implements d, i1.a {
    private g A;
    private Resources B;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.c {
        a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.e0().B(bundle);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements b.b {
        b() {
        }

        @Override // b.b
        public void a(Context context) {
            g e02 = c.this.e0();
            e02.s();
            e02.x(c.this.d().b("androidx:appcompat"));
        }
    }

    public c() {
        g0();
    }

    private void H() {
        k0.a(getWindow().getDecorView(), this);
        l0.a(getWindow().getDecorView(), this);
        i0.e.a(getWindow().getDecorView(), this);
        androidx.activity.v.a(getWindow().getDecorView(), this);
    }

    private void g0() {
        d().h("androidx:appcompat", new a());
        D(new b());
    }

    private boolean n0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        e0().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(e0().g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a f02 = f0();
        if (getWindow().hasFeature(0)) {
            if (f02 == null || !f02.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.p, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a f02 = f0();
        if (keyCode == 82 && f02 != null && f02.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public g e0() {
        if (this.A == null) {
            this.A = g.h(this, this);
        }
        return this.A;
    }

    public androidx.appcompat.app.a f0() {
        return e0().r();
    }

    @Override // android.app.Activity
    public View findViewById(int i6) {
        return e0().j(i6);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return e0().p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.B == null && o3.c()) {
            this.B = new o3(this, super.getResources());
        }
        Resources resources = this.B;
        return resources == null ? super.getResources() : resources;
    }

    public void h0(i1 i1Var) {
        i1Var.i(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i0(androidx.core.os.i iVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        e0().t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j0(int i6) {
    }

    @Override // androidx.core.app.i1.a
    public Intent k() {
        return androidx.core.app.r.a(this);
    }

    public void k0(i1 i1Var) {
    }

    public void l0() {
    }

    @Override // androidx.appcompat.app.d
    public void m(androidx.appcompat.view.b bVar) {
    }

    public boolean m0() {
        Intent k6 = k();
        if (k6 == null) {
            return false;
        }
        if (!p0(k6)) {
            o0(k6);
            return true;
        }
        i1 k7 = i1.k(this);
        h0(k7);
        k0(k7);
        k7.l();
        try {
            androidx.core.app.b.m(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // androidx.appcompat.app.d
    public void o(androidx.appcompat.view.b bVar) {
    }

    public void o0(Intent intent) {
        androidx.core.app.r.e(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e0().w(configuration);
        if (this.B != null) {
            this.B.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        l0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.j, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e0().y();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i6, KeyEvent keyEvent) {
        if (n0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // androidx.fragment.app.j, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a f02 = f0();
        if (menuItem.getItemId() != 16908332 || f02 == null || (f02.j() & 4) == 0) {
            return false;
        }
        return m0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i6, Menu menu) {
        return super.onMenuOpened(i6, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        e0().z(bundle);
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        e0().A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.j, android.app.Activity
    public void onStart() {
        super.onStart();
        e0().C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.j, android.app.Activity
    public void onStop() {
        super.onStop();
        e0().D();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i6) {
        super.onTitleChanged(charSequence, i6);
        e0().M(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a f02 = f0();
        if (getWindow().hasFeature(0)) {
            if (f02 == null || !f02.q()) {
                super.openOptionsMenu();
            }
        }
    }

    public boolean p0(Intent intent) {
        return androidx.core.app.r.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i6) {
        H();
        e0().H(i6);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i6) {
        super.setTheme(i6);
        e0().L(i6);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b t(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        H();
        e0().I(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        e0().J(view, layoutParams);
    }
}
