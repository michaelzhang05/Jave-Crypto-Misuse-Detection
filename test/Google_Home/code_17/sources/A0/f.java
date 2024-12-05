package A0;

import D0.C1053c;
import D0.C1057g;
import D0.o;
import D0.x;
import Q.AbstractC1398n;
import Q.AbstractC1400p;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import b1.InterfaceC1956b;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C2061a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import g1.C2860a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o1.AbstractC3513c;
import o1.C3512b;

/* loaded from: classes.dex */
public class f {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f76k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map f77l = new ArrayMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f78a;

    /* renamed from: b, reason: collision with root package name */
    private final String f79b;

    /* renamed from: c, reason: collision with root package name */
    private final o f80c;

    /* renamed from: d, reason: collision with root package name */
    private final D0.o f81d;

    /* renamed from: g, reason: collision with root package name */
    private final x f84g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1956b f85h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f82e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f83f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List f86i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List f87j = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements ComponentCallbacks2C2061a.InterfaceC0371a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference f88a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (V.k.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f88a.get() == null) {
                    b bVar = new b();
                    if (androidx.compose.animation.core.d.a(f88a, null, bVar)) {
                        ComponentCallbacks2C2061a.c(application);
                        ComponentCallbacks2C2061a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2061a.InterfaceC0371a
        public void a(boolean z8) {
            synchronized (f.f76k) {
                try {
                    Iterator it = new ArrayList(f.f77l.values()).iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar.f82e.get()) {
                            fVar.y(z8);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference f89b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        private final Context f90a;

        public c(Context context) {
            this.f90a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f89b.get() == null) {
                c cVar = new c(context);
                if (androidx.compose.animation.core.d.a(f89b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f90a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f76k) {
                try {
                    Iterator it = f.f77l.values().iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, o oVar) {
        this.f78a = (Context) AbstractC1400p.l(context);
        this.f79b = AbstractC1400p.f(str);
        this.f80c = (o) AbstractC1400p.l(oVar);
        p b8 = FirebaseInitProvider.b();
        AbstractC3513c.b("Firebase");
        AbstractC3513c.b("ComponentDiscovery");
        List b9 = C1057g.c(context, ComponentDiscoveryService.class).b();
        AbstractC3513c.a();
        AbstractC3513c.b("Runtime");
        o.b g8 = D0.o.m(E0.m.INSTANCE).d(b9).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C1053c.s(context, Context.class, new Class[0])).b(C1053c.s(this, f.class, new Class[0])).b(C1053c.s(oVar, o.class, new Class[0])).g(new C3512b());
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.c()) {
            g8.b(C1053c.s(b8, p.class, new Class[0]));
        }
        D0.o e8 = g8.e();
        this.f81d = e8;
        AbstractC3513c.a();
        this.f84g = new x(new InterfaceC1956b() { // from class: A0.d
            @Override // b1.InterfaceC1956b
            public final Object get() {
                C2860a v8;
                v8 = f.this.v(context);
                return v8;
            }
        });
        this.f85h = e8.c(Z0.f.class);
        g(new a() { // from class: A0.e
            @Override // A0.f.a
            public final void a(boolean z8) {
                f.this.w(z8);
            }
        });
        AbstractC3513c.a();
    }

    private void i() {
        AbstractC1400p.p(!this.f83f.get(), "FirebaseApp was deleted");
    }

    public static f l() {
        f fVar;
        synchronized (f76k) {
            try {
                fVar = (f) f77l.get("[DEFAULT]");
                if (fVar != null) {
                    ((Z0.f) fVar.f85h.get()).l();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + V.m.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!UserManagerCompat.isUserUnlocked(this.f78a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f78a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f81d.p(u());
        ((Z0.f) this.f85h.get()).l();
    }

    public static f q(Context context) {
        synchronized (f76k) {
            try {
                if (f77l.containsKey("[DEFAULT]")) {
                    return l();
                }
                o a8 = o.a(context);
                if (a8 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, a8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f r(Context context, o oVar) {
        return s(context, oVar, "[DEFAULT]");
    }

    public static f s(Context context, o oVar, String str) {
        f fVar;
        b.c(context);
        String x8 = x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f76k) {
            Map map = f77l;
            AbstractC1400p.p(!map.containsKey(x8), "FirebaseApp name " + x8 + " already exists!");
            AbstractC1400p.m(context, "Application context cannot be null.");
            fVar = new f(context, x8, oVar);
            map.put(x8, fVar);
        }
        fVar.p();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C2860a v(Context context) {
        return new C2860a(context, o(), (Y0.c) this.f81d.a(Y0.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(boolean z8) {
        if (!z8) {
            ((Z0.f) this.f85h.get()).l();
        }
    }

    private static String x(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(boolean z8) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f86i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z8);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f79b.equals(((f) obj).m());
    }

    public void g(a aVar) {
        i();
        if (this.f82e.get() && ComponentCallbacks2C2061a.b().d()) {
            aVar.a(true);
        }
        this.f86i.add(aVar);
    }

    public void h(g gVar) {
        i();
        AbstractC1400p.l(gVar);
        this.f87j.add(gVar);
    }

    public int hashCode() {
        return this.f79b.hashCode();
    }

    public Object j(Class cls) {
        i();
        return this.f81d.a(cls);
    }

    public Context k() {
        i();
        return this.f78a;
    }

    public String m() {
        i();
        return this.f79b;
    }

    public o n() {
        i();
        return this.f80c;
    }

    public String o() {
        return V.c.a(m().getBytes(Charset.defaultCharset())) + "+" + V.c.a(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return ((C2860a) this.f84g.get()).b();
    }

    public String toString() {
        return AbstractC1398n.c(this).a("name", this.f79b).a("options", this.f80c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
