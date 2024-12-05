package t0;

import android.view.View;
import android.view.Window;
import androidx.core.view.a3;
import androidx.core.view.b1;
import androidx.core.view.c3;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f9258a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.app.c f9259b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9260c = c();

    public a(androidx.appcompat.app.c cVar) {
        this.f9259b = cVar;
        this.f9258a = cVar.getWindow().getStatusBarColor();
    }

    private boolean b() {
        return (this.f9259b.getWindow().getDecorView().getSystemUiVisibility() & 1024) == 1024;
    }

    private String c() {
        return a3.a(this.f9259b.getWindow(), this.f9259b.getWindow().getDecorView()).b() ? "LIGHT" : "DARK";
    }

    public b a() {
        Window window = this.f9259b.getWindow();
        c3 K = b1.K(window.getDecorView());
        boolean z5 = K != null && K.o(c3.m.c());
        b bVar = new b();
        bVar.g(c());
        bVar.f(b());
        bVar.h(z5);
        bVar.e(String.format("#%06X", Integer.valueOf(window.getStatusBarColor() & 16777215)));
        return bVar;
    }

    public void d() {
        a3.a(this.f9259b.getWindow(), this.f9259b.getWindow().getDecorView()).a(c3.m.c());
    }

    public void e(int i6) {
        Window window = this.f9259b.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i6);
        this.f9258a = i6;
    }

    public void f(Boolean bool) {
        Window window;
        int i6;
        View decorView = this.f9259b.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (bool.booleanValue()) {
            decorView.setSystemUiVisibility(systemUiVisibility | 256 | 1024);
            this.f9258a = this.f9259b.getWindow().getStatusBarColor();
            window = this.f9259b.getWindow();
            i6 = 0;
        } else {
            decorView.setSystemUiVisibility(systemUiVisibility & (-257) & (-1025));
            window = this.f9259b.getWindow();
            i6 = this.f9258a;
        }
        window.setStatusBarColor(i6);
    }

    public void g(String str) {
        Window window = this.f9259b.getWindow();
        View decorView = window.getDecorView();
        if (str.equals("DEFAULT")) {
            str = this.f9260c;
        }
        a3.a(window, decorView).d(!str.equals("DARK"));
    }

    public void h() {
        a3.a(this.f9259b.getWindow(), this.f9259b.getWindow().getDecorView()).e(c3.m.c());
    }
}
