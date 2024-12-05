package I1;

import B1.n;
import F1.a;
import H1.f;
import H1.h;
import I1.b;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a implements a.InterfaceC0041a {

    /* renamed from: i, reason: collision with root package name */
    private static a f3949i = new a();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f3950j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f3951k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f3952l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f3953m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f3955b;

    /* renamed from: h, reason: collision with root package name */
    private long f3961h;

    /* renamed from: a, reason: collision with root package name */
    private List f3954a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f3956c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List f3957d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private I1.b f3959f = new I1.b();

    /* renamed from: e, reason: collision with root package name */
    private F1.b f3958e = new F1.b();

    /* renamed from: g, reason: collision with root package name */
    private I1.c f3960g = new I1.c(new J1.c());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0063a implements Runnable {
        RunnableC0063a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f3960g.c();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.p().u();
        }
    }

    /* loaded from: classes4.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f3951k != null) {
                a.f3951k.post(a.f3952l);
                a.f3951k.postDelayed(a.f3953m, 200L);
            }
        }
    }

    a() {
    }

    private void d(long j8) {
        if (this.f3954a.size() > 0) {
            Iterator it = this.f3954a.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                TimeUnit.NANOSECONDS.toMillis(j8);
                throw null;
            }
        }
    }

    private void e(View view, F1.a aVar, JSONObject jSONObject, d dVar, boolean z8) {
        boolean z9;
        if (dVar == d.PARENT_VIEW) {
            z9 = true;
        } else {
            z9 = false;
        }
        aVar.a(view, jSONObject, this, z9, z8);
    }

    private void f(String str, View view, JSONObject jSONObject) {
        F1.a b8 = this.f3958e.b();
        String g8 = this.f3959f.g(str);
        if (g8 != null) {
            JSONObject a8 = b8.a(view);
            H1.c.h(a8, str);
            H1.c.n(a8, g8);
            H1.c.j(jSONObject, a8);
        }
    }

    private boolean g(View view, JSONObject jSONObject) {
        b.a i8 = this.f3959f.i(view);
        if (i8 != null) {
            H1.c.f(jSONObject, i8);
            return true;
        }
        return false;
    }

    private boolean j(View view, JSONObject jSONObject) {
        String k8 = this.f3959f.k(view);
        if (k8 != null) {
            H1.c.h(jSONObject, k8);
            H1.c.g(jSONObject, Boolean.valueOf(this.f3959f.o(view)));
            this.f3959f.l();
            return true;
        }
        return false;
    }

    private void l() {
        d(f.b() - this.f3961h);
    }

    private void m() {
        this.f3955b = 0;
        this.f3957d.clear();
        this.f3956c = false;
        Iterator it = E1.c.e().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((n) it.next()).s()) {
                this.f3956c = true;
                break;
            }
        }
        this.f3961h = f.b();
    }

    public static a p() {
        return f3949i;
    }

    private void r() {
        if (f3951k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f3951k = handler;
            handler.post(f3952l);
            f3951k.postDelayed(f3953m, 200L);
        }
    }

    private void t() {
        Handler handler = f3951k;
        if (handler != null) {
            handler.removeCallbacks(f3953m);
            f3951k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        m();
        n();
        l();
    }

    @Override // F1.a.InterfaceC0041a
    public void a(View view, F1.a aVar, JSONObject jSONObject, boolean z8) {
        d m8;
        boolean z9;
        if (!h.d(view) || (m8 = this.f3959f.m(view)) == d.UNDERLYING_VIEW) {
            return;
        }
        JSONObject a8 = aVar.a(view);
        H1.c.j(jSONObject, a8);
        if (!j(view, a8)) {
            boolean g8 = g(view, a8);
            if (!z8 && !g8) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (this.f3956c && m8 == d.OBSTRUCTION_VIEW && !z9) {
                this.f3957d.add(new K1.a(view));
            }
            e(view, aVar, a8, m8, z9);
        }
        this.f3955b++;
    }

    void n() {
        this.f3959f.n();
        long b8 = f.b();
        F1.a a8 = this.f3958e.a();
        if (this.f3959f.h().size() > 0) {
            Iterator it = this.f3959f.h().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a9 = a8.a(null);
                f(str, this.f3959f.a(str), a9);
                H1.c.m(a9);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f3960g.b(a9, hashSet, b8);
            }
        }
        if (this.f3959f.j().size() > 0) {
            JSONObject a10 = a8.a(null);
            e(null, a8, a10, d.PARENT_VIEW, false);
            H1.c.m(a10);
            this.f3960g.d(a10, this.f3959f.j(), b8);
            if (this.f3956c) {
                Iterator it2 = E1.c.e().a().iterator();
                while (it2.hasNext()) {
                    ((n) it2.next()).k(this.f3957d);
                }
            }
        } else {
            this.f3960g.c();
        }
        this.f3959f.c();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public void s() {
        o();
        this.f3954a.clear();
        f3950j.post(new RunnableC0063a());
    }
}
