package w3;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.os.v;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import v1.n;
import z3.o;
import z3.x;

/* loaded from: classes.dex */
public class e {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f9751k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map f9752l = new l.a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f9753a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9754b;

    /* renamed from: c, reason: collision with root package name */
    private final l f9755c;

    /* renamed from: d, reason: collision with root package name */
    private final o f9756d;

    /* renamed from: g, reason: collision with root package name */
    private final x f9759g;

    /* renamed from: h, reason: collision with root package name */
    private final k4.b f9760h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f9757e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f9758f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List f9761i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List f9762j = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements a.InterfaceC0078a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference f9763a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (z1.i.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f9763a.get() == null) {
                    b bVar = new b();
                    if (u1.x.a(f9763a, null, bVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0078a
        public void a(boolean z5) {
            synchronized (e.f9751k) {
                Iterator it = new ArrayList(e.f9752l.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f9757e.get()) {
                        eVar.x(z5);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference f9764b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        private final Context f9765a;

        public c(Context context) {
            this.f9765a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f9764b.get() == null) {
                c cVar = new c(context);
                if (u1.x.a(f9764b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f9765a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f9751k) {
                Iterator it = e.f9752l.values().iterator();
                while (it.hasNext()) {
                    ((e) it.next()).o();
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, l lVar) {
        this.f9753a = (Context) n.h(context);
        this.f9754b = n.d(str);
        this.f9755c = (l) n.h(lVar);
        m b6 = FirebaseInitProvider.b();
        t4.c.b("Firebase");
        t4.c.b("ComponentDiscovery");
        List b7 = z3.g.c(context, ComponentDiscoveryService.class).b();
        t4.c.a();
        t4.c.b("Runtime");
        o.b g6 = o.k(a4.m.INSTANCE).d(b7).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(z3.c.s(context, Context.class, new Class[0])).b(z3.c.s(this, e.class, new Class[0])).b(z3.c.s(lVar, l.class, new Class[0])).g(new t4.b());
        if (v.a(context) && FirebaseInitProvider.c()) {
            g6.b(z3.c.s(b6, m.class, new Class[0]));
        }
        o e6 = g6.e();
        this.f9756d = e6;
        t4.c.a();
        this.f9759g = new x(new k4.b() { // from class: w3.c
            @Override // k4.b
            public final Object get() {
                p4.a u5;
                u5 = e.this.u(context);
                return u5;
            }
        });
        this.f9760h = e6.b(i4.f.class);
        g(new a() { // from class: w3.d
            @Override // w3.e.a
            public final void a(boolean z5) {
                e.this.v(z5);
            }
        });
        t4.c.a();
    }

    private void h() {
        n.k(!this.f9758f.get(), "FirebaseApp was deleted");
    }

    public static e k() {
        e eVar;
        synchronized (f9751k) {
            eVar = (e) f9752l.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + z1.j.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!v.a(this.f9753a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            c.b(this.f9753a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.f9756d.n(t());
        ((i4.f) this.f9760h.get()).l();
    }

    public static e p(Context context) {
        synchronized (f9751k) {
            if (f9752l.containsKey("[DEFAULT]")) {
                return k();
            }
            l a6 = l.a(context);
            if (a6 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return q(context, a6);
        }
    }

    public static e q(Context context, l lVar) {
        return r(context, lVar, "[DEFAULT]");
    }

    public static e r(Context context, l lVar, String str) {
        e eVar;
        b.c(context);
        String w5 = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f9751k) {
            Map map = f9752l;
            n.k(!map.containsKey(w5), "FirebaseApp name " + w5 + " already exists!");
            n.i(context, "Application context cannot be null.");
            eVar = new e(context, w5, lVar);
            map.put(w5, eVar);
        }
        eVar.o();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p4.a u(Context context) {
        return new p4.a(context, n(), (h4.c) this.f9756d.a(h4.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(boolean z5) {
        if (z5) {
            return;
        }
        ((i4.f) this.f9760h.get()).l();
    }

    private static String w(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(boolean z5) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f9761i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z5);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f9754b.equals(((e) obj).l());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f9757e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            aVar.a(true);
        }
        this.f9761i.add(aVar);
    }

    public int hashCode() {
        return this.f9754b.hashCode();
    }

    public Object i(Class cls) {
        h();
        return this.f9756d.a(cls);
    }

    public Context j() {
        h();
        return this.f9753a;
    }

    public String l() {
        h();
        return this.f9754b;
    }

    public l m() {
        h();
        return this.f9755c;
    }

    public String n() {
        return z1.c.a(l().getBytes(Charset.defaultCharset())) + "+" + z1.c.a(m().c().getBytes(Charset.defaultCharset()));
    }

    public boolean s() {
        h();
        return ((p4.a) this.f9759g.get()).b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return v1.m.c(this).a("name", this.f9754b).a("options", this.f9755c).toString();
    }
}
