package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2310a;

    /* renamed from: b, reason: collision with root package name */
    private a f2311b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0037b f2312c;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0037b {
        void onActionProviderVisibilityChanged(boolean z5);
    }

    public b(Context context) {
        this.f2310a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f2312c = null;
        this.f2311b = null;
    }

    public void h(a aVar) {
        this.f2311b = aVar;
    }

    public abstract void i(InterfaceC0037b interfaceC0037b);
}
