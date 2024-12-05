package F1;

import C1.a;
import E1.f;
import E1.h;
import F1.b;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import y1.C3981n;

/* loaded from: classes3.dex */
public class a implements a.InterfaceC0017a {

    /* renamed from: i, reason: collision with root package name */
    private static a f2409i = new a();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f2410j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f2411k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f2412l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f2413m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f2415b;

    /* renamed from: h, reason: collision with root package name */
    private long f2421h;

    /* renamed from: a, reason: collision with root package name */
    private List f2414a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f2416c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List f2417d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private F1.b f2419f = new F1.b();

    /* renamed from: e, reason: collision with root package name */
    private C1.b f2418e = new C1.b();

    /* renamed from: g, reason: collision with root package name */
    private F1.c f2420g = new F1.c(new G1.c());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F1.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0038a implements Runnable {
        RunnableC0038a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f2420g.c();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.p().u();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f2411k != null) {
                a.f2411k.post(a.f2412l);
                a.f2411k.postDelayed(a.f2413m, 200L);
            }
        }
    }

    a() {
    }

    private void d(long j8) {
        if (this.f2414a.size() > 0) {
            Iterator it = this.f2414a.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                TimeUnit.NANOSECONDS.toMillis(j8);
                throw null;
            }
        }
    }

    private void e(View view, C1.a aVar, JSONObject jSONObject, d dVar, boolean z8) {
        boolean z9;
        if (dVar == d.PARENT_VIEW) {
            z9 = true;
        } else {
            z9 = false;
        }
        aVar.a(view, jSONObject, this, z9, z8);
    }

    private void f(String str, View view, JSONObject jSONObject) {
        C1.a b8 = this.f2418e.b();
        String g8 = this.f2419f.g(str);
        if (g8 != null) {
            JSONObject a8 = b8.a(view);
            E1.c.g(a8, str);
            E1.c.n(a8, g8);
            E1.c.i(jSONObject, a8);
        }
    }

    private boolean g(View view, JSONObject jSONObject) {
        b.a i8 = this.f2419f.i(view);
        if (i8 != null) {
            E1.c.e(jSONObject, i8);
            return true;
        }
        return false;
    }

    private boolean j(View view, JSONObject jSONObject) {
        String k8 = this.f2419f.k(view);
        if (k8 != null) {
            E1.c.g(jSONObject, k8);
            E1.c.f(jSONObject, Boolean.valueOf(this.f2419f.o(view)));
            this.f2419f.l();
            return true;
        }
        return false;
    }

    private void l() {
        d(f.b() - this.f2421h);
    }

    private void m() {
        this.f2415b = 0;
        this.f2417d.clear();
        this.f2416c = false;
        Iterator it = B1.c.e().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((C3981n) it.next()).s()) {
                this.f2416c = true;
                break;
            }
        }
        this.f2421h = f.b();
    }

    public static a p() {
        return f2409i;
    }

    private void r() {
        if (f2411k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f2411k = handler;
            handler.post(f2412l);
            f2411k.postDelayed(f2413m, 200L);
        }
    }

    private void t() {
        Handler handler = f2411k;
        if (handler != null) {
            handler.removeCallbacks(f2413m);
            f2411k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        m();
        n();
        l();
    }

    @Override // C1.a.InterfaceC0017a
    public void a(View view, C1.a aVar, JSONObject jSONObject, boolean z8) {
        d m8;
        boolean z9;
        if (!h.d(view) || (m8 = this.f2419f.m(view)) == d.UNDERLYING_VIEW) {
            return;
        }
        JSONObject a8 = aVar.a(view);
        E1.c.i(jSONObject, a8);
        if (!j(view, a8)) {
            boolean g8 = g(view, a8);
            if (!z8 && !g8) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (this.f2416c && m8 == d.OBSTRUCTION_VIEW && !z9) {
                this.f2417d.add(new H1.a(view));
            }
            e(view, aVar, a8, m8, z9);
        }
        this.f2415b++;
    }

    void n() {
        this.f2419f.n();
        long b8 = f.b();
        C1.a a8 = this.f2418e.a();
        if (this.f2419f.h().size() > 0) {
            Iterator it = this.f2419f.h().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a9 = a8.a(null);
                f(str, this.f2419f.a(str), a9);
                E1.c.m(a9);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f2420g.b(a9, hashSet, b8);
            }
        }
        if (this.f2419f.j().size() > 0) {
            JSONObject a10 = a8.a(null);
            e(null, a8, a10, d.PARENT_VIEW, false);
            E1.c.m(a10);
            this.f2420g.d(a10, this.f2419f.j(), b8);
            if (this.f2416c) {
                Iterator it2 = B1.c.e().a().iterator();
                while (it2.hasNext()) {
                    ((C3981n) it2.next()).k(this.f2417d);
                }
            }
        } else {
            this.f2420g.c();
        }
        this.f2419f.c();
    }

    public void o() {
        t();
    }

    public void q() {
        r();
    }

    public void s() {
        o();
        this.f2414a.clear();
        f2410j.post(new RunnableC0038a());
    }
}
