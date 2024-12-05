package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.r0;
import com.google.firebase.messaging.w0;
import j4.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: n, reason: collision with root package name */
    private static final long f5806n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o, reason: collision with root package name */
    private static w0 f5807o;

    /* renamed from: p, reason: collision with root package name */
    static b1.g f5808p;

    /* renamed from: q, reason: collision with root package name */
    static ScheduledExecutorService f5809q;

    /* renamed from: a, reason: collision with root package name */
    private final w3.e f5810a;

    /* renamed from: b, reason: collision with root package name */
    private final l4.e f5811b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f5812c;

    /* renamed from: d, reason: collision with root package name */
    private final b0 f5813d;

    /* renamed from: e, reason: collision with root package name */
    private final r0 f5814e;

    /* renamed from: f, reason: collision with root package name */
    private final a f5815f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f5816g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f5817h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f5818i;

    /* renamed from: j, reason: collision with root package name */
    private final l2.i f5819j;

    /* renamed from: k, reason: collision with root package name */
    private final g0 f5820k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5821l;

    /* renamed from: m, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f5822m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private final h4.d f5823a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5824b;

        /* renamed from: c, reason: collision with root package name */
        private h4.b f5825c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f5826d;

        a(h4.d dVar) {
            this.f5823a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(h4.a aVar) {
            if (c()) {
                FirebaseMessaging.this.G();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j6 = FirebaseMessaging.this.f5810a.j();
            SharedPreferences sharedPreferences = j6.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j6.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j6.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            if (this.f5824b) {
                return;
            }
            Boolean e6 = e();
            this.f5826d = e6;
            if (e6 == null) {
                h4.b bVar = new h4.b() { // from class: com.google.firebase.messaging.y
                    @Override // h4.b
                    public final void a(h4.a aVar) {
                        FirebaseMessaging.a.this.d(aVar);
                    }
                };
                this.f5825c = bVar;
                this.f5823a.b(w3.b.class, bVar);
            }
            this.f5824b = true;
        }

        synchronized boolean c() {
            Boolean bool;
            b();
            bool = this.f5826d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f5810a.s();
        }

        synchronized void f(boolean z5) {
            b();
            h4.b bVar = this.f5825c;
            if (bVar != null) {
                this.f5823a.a(w3.b.class, bVar);
                this.f5825c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f5810a.j().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z5);
            edit.apply();
            if (z5) {
                FirebaseMessaging.this.G();
            }
            this.f5826d = Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(w3.e eVar, j4.a aVar, k4.b bVar, k4.b bVar2, l4.e eVar2, b1.g gVar, h4.d dVar) {
        this(eVar, aVar, bVar, bVar2, eVar2, gVar, dVar, new g0(eVar.j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        if (u()) {
            G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(b1 b1Var) {
        if (u()) {
            b1Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        m0.c(this.f5812c);
    }

    private synchronized void F() {
        if (!this.f5821l) {
            H(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (I(r())) {
            F();
        }
    }

    static synchronized FirebaseMessaging getInstance(w3.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.i(FirebaseMessaging.class);
            v1.n.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging n() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(w3.e.k());
        }
        return firebaseMessaging;
    }

    private static synchronized w0 o(Context context) {
        w0 w0Var;
        synchronized (FirebaseMessaging.class) {
            if (f5807o == null) {
                f5807o = new w0(context);
            }
            w0Var = f5807o;
        }
        return w0Var;
    }

    private String p() {
        return "[DEFAULT]".equals(this.f5810a.l()) ? "" : this.f5810a.n();
    }

    public static b1.g s() {
        return f5808p;
    }

    private void t(String str) {
        if ("[DEFAULT]".equals(this.f5810a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f5810a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.f5812c).i(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ l2.i w(final String str, final w0.a aVar) {
        return this.f5813d.f().n(this.f5818i, new l2.h() { // from class: com.google.firebase.messaging.x
            @Override // l2.h
            public final l2.i a(Object obj) {
                l2.i x5;
                x5 = FirebaseMessaging.this.x(str, aVar, (String) obj);
                return x5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ l2.i x(String str, w0.a aVar, String str2) {
        o(this.f5812c).g(p(), str, str2, this.f5820k.a());
        if (aVar == null || !str2.equals(aVar.f6003a)) {
            t(str2);
        }
        return l2.l.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(l2.j jVar) {
        try {
            l2.l.a(this.f5813d.c());
            o(this.f5812c).d(p(), g0.c(this.f5810a));
            jVar.c(null);
        } catch (Exception e6) {
            jVar.b(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(l2.j jVar) {
        try {
            jVar.c(j());
        } catch (Exception e6) {
            jVar.b(e6);
        }
    }

    public void D(boolean z5) {
        this.f5815f.f(z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void E(boolean z5) {
        this.f5821l = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void H(long j6) {
        l(new x0(this, Math.min(Math.max(30L, 2 * j6), f5806n)), j6);
        this.f5821l = true;
    }

    boolean I(w0.a aVar) {
        return aVar == null || aVar.b(this.f5820k.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String j() {
        final w0.a r5 = r();
        if (!I(r5)) {
            return r5.f6003a;
        }
        final String c6 = g0.c(this.f5810a);
        try {
            return (String) l2.l.a(this.f5814e.b(c6, new r0.a() { // from class: com.google.firebase.messaging.v
                @Override // com.google.firebase.messaging.r0.a
                public final l2.i start() {
                    l2.i w5;
                    w5 = FirebaseMessaging.this.w(c6, r5);
                    return w5;
                }
            }));
        } catch (InterruptedException | ExecutionException e6) {
            throw new IOException(e6);
        }
    }

    public l2.i k() {
        if (r() == null) {
            return l2.l.e(null);
        }
        final l2.j jVar = new l2.j();
        n.e().execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.y(jVar);
            }
        });
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Runnable runnable, long j6) {
        synchronized (FirebaseMessaging.class) {
            if (f5809q == null) {
                f5809q = new ScheduledThreadPoolExecutor(1, new a2.a("TAG"));
            }
            f5809q.schedule(runnable, j6, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context m() {
        return this.f5812c;
    }

    public l2.i q() {
        final l2.j jVar = new l2.j();
        this.f5816g.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.z(jVar);
            }
        });
        return jVar.a();
    }

    w0.a r() {
        return o(this.f5812c).e(p(), g0.c(this.f5810a));
    }

    public boolean u() {
        return this.f5815f.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v() {
        return this.f5820k.g();
    }

    FirebaseMessaging(w3.e eVar, j4.a aVar, k4.b bVar, k4.b bVar2, l4.e eVar2, b1.g gVar, h4.d dVar, g0 g0Var) {
        this(eVar, aVar, eVar2, gVar, dVar, g0Var, new b0(eVar, g0Var, bVar, bVar2, eVar2), n.f(), n.c(), n.b());
    }

    FirebaseMessaging(w3.e eVar, j4.a aVar, l4.e eVar2, b1.g gVar, h4.d dVar, g0 g0Var, b0 b0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f5821l = false;
        f5808p = gVar;
        this.f5810a = eVar;
        this.f5811b = eVar2;
        this.f5815f = new a(dVar);
        Context j6 = eVar.j();
        this.f5812c = j6;
        p pVar = new p();
        this.f5822m = pVar;
        this.f5820k = g0Var;
        this.f5817h = executor;
        this.f5813d = b0Var;
        this.f5814e = new r0(executor);
        this.f5816g = executor2;
        this.f5818i = executor3;
        Context j7 = eVar.j();
        if (j7 instanceof Application) {
            ((Application) j7).registerActivityLifecycleCallbacks(pVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + j7 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0109a() { // from class: com.google.firebase.messaging.q
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.A();
            }
        });
        l2.i e6 = b1.e(this, g0Var, b0Var, j6, n.g());
        this.f5819j = e6;
        e6.e(executor2, new l2.f() { // from class: com.google.firebase.messaging.s
            @Override // l2.f
            public final void d(Object obj) {
                FirebaseMessaging.this.B((b1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.C();
            }
        });
    }
}
