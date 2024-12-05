package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.b1;
import androidx.core.view.w;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f691a;

    /* renamed from: b, reason: collision with root package name */
    private final g f692b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f693c;

    /* renamed from: d, reason: collision with root package name */
    private final int f694d;

    /* renamed from: e, reason: collision with root package name */
    private final int f695e;

    /* renamed from: f, reason: collision with root package name */
    private View f696f;

    /* renamed from: g, reason: collision with root package name */
    private int f697g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f698h;

    /* renamed from: i, reason: collision with root package name */
    private m.a f699i;

    /* renamed from: j, reason: collision with root package name */
    private k f700j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f701k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f702l;

    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z5, int i6) {
        this(context, gVar, view, z5, i6, 0);
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.f691a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        k dVar = Math.min(point.x, point.y) >= this.f691a.getResources().getDimensionPixelSize(d.d.f6149a) ? new d(this.f691a, this.f696f, this.f694d, this.f695e, this.f693c) : new q(this.f691a, this.f692b, this.f696f, this.f694d, this.f695e, this.f693c);
        dVar.l(this.f692b);
        dVar.u(this.f702l);
        dVar.p(this.f696f);
        dVar.h(this.f699i);
        dVar.r(this.f698h);
        dVar.s(this.f697g);
        return dVar;
    }

    private void l(int i6, int i7, boolean z5, boolean z6) {
        k c6 = c();
        c6.v(z6);
        if (z5) {
            if ((w.b(this.f697g, b1.E(this.f696f)) & 7) == 5) {
                i6 -= this.f696f.getWidth();
            }
            c6.t(i6);
            c6.w(i7);
            int i8 = (int) ((this.f691a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c6.q(new Rect(i6 - i8, i7 - i8, i6 + i8, i7 + i8));
        }
        c6.f();
    }

    public void b() {
        if (d()) {
            this.f700j.dismiss();
        }
    }

    public k c() {
        if (this.f700j == null) {
            this.f700j = a();
        }
        return this.f700j;
    }

    public boolean d() {
        k kVar = this.f700j;
        return kVar != null && kVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f700j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f701k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f696f = view;
    }

    public void g(boolean z5) {
        this.f698h = z5;
        k kVar = this.f700j;
        if (kVar != null) {
            kVar.r(z5);
        }
    }

    public void h(int i6) {
        this.f697g = i6;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f701k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f699i = aVar;
        k kVar = this.f700j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f696f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i6, int i7) {
        if (d()) {
            return true;
        }
        if (this.f696f == null) {
            return false;
        }
        l(i6, i7, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z5, int i6, int i7) {
        this.f697g = 8388611;
        this.f702l = new a();
        this.f691a = context;
        this.f692b = gVar;
        this.f696f = view;
        this.f693c = z5;
        this.f694d = i6;
        this.f695e = i7;
    }
}
