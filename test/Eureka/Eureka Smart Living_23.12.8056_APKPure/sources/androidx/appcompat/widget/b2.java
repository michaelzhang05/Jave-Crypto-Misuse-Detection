package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
public interface b2 {
    void a(Menu menu, m.a aVar);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    int i();

    void j(int i6);

    void k(int i6);

    void l(v2 v2Var);

    void m(boolean z5);

    int n();

    androidx.core.view.w2 o(int i6, long j6);

    void p();

    boolean q();

    void r();

    void s(boolean z5);

    void setIcon(int i6);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i6);
}
