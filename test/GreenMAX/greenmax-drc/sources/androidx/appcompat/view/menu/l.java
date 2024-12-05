package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.u;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class l {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final g f304b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f305c;

    /* renamed from: d, reason: collision with root package name */
    private final int f306d;

    /* renamed from: e, reason: collision with root package name */
    private final int f307e;

    /* renamed from: f, reason: collision with root package name */
    private View f308f;

    /* renamed from: g, reason: collision with root package name */
    private int f309g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f310h;

    /* renamed from: i, reason: collision with root package name */
    private m.a f311i;

    /* renamed from: j, reason: collision with root package name */
    private k f312j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f313k;
    private final PopupWindow.OnDismissListener l;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2) {
        this(context, gVar, view, z, i2, 0);
    }

    private k a() {
        k qVar;
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(c.a.d.f2187c)) {
            qVar = new d(this.a, this.f308f, this.f306d, this.f307e, this.f305c);
        } else {
            qVar = new q(this.a, this.f304b, this.f308f, this.f306d, this.f307e, this.f305c);
        }
        qVar.m(this.f304b);
        qVar.v(this.l);
        qVar.q(this.f308f);
        qVar.g(this.f311i);
        qVar.s(this.f310h);
        qVar.t(this.f309g);
        return qVar;
    }

    private void l(int i2, int i3, boolean z, boolean z2) {
        k c2 = c();
        c2.w(z2);
        if (z) {
            if ((androidx.core.view.d.b(this.f309g, u.y(this.f308f)) & 7) == 5) {
                i2 -= this.f308f.getWidth();
            }
            c2.u(i2);
            c2.x(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c2.r(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        c2.show();
    }

    public void b() {
        if (d()) {
            this.f312j.dismiss();
        }
    }

    public k c() {
        if (this.f312j == null) {
            this.f312j = a();
        }
        return this.f312j;
    }

    public boolean d() {
        k kVar = this.f312j;
        return kVar != null && kVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f312j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f313k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f308f = view;
    }

    public void g(boolean z) {
        this.f310h = z;
        k kVar = this.f312j;
        if (kVar != null) {
            kVar.s(z);
        }
    }

    public void h(int i2) {
        this.f309g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f313k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f311i = aVar;
        k kVar = this.f312j;
        if (kVar != null) {
            kVar.g(aVar);
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
        if (this.f308f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f308f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.f309g = 8388611;
        this.l = new a();
        this.a = context;
        this.f304b = gVar;
        this.f308f = view;
        this.f305c = z;
        this.f306d = i2;
        this.f307e = i3;
    }
}
