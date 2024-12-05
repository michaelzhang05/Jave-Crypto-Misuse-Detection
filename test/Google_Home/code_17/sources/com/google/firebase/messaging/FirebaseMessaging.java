package com.google.firebase.messaging;

import M.C1298a;
import Q.AbstractC1400p;
import a1.InterfaceC1612a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b1.InterfaceC1956b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.V;
import com.google.firebase.messaging.a0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q0.AbstractC3828l;
import q0.C3826j;
import q0.InterfaceC3823g;
import q0.InterfaceC3825i;

/* loaded from: classes4.dex */
public class FirebaseMessaging {

    /* renamed from: m, reason: collision with root package name */
    private static a0 f18346m;

    /* renamed from: o, reason: collision with root package name */
    static ScheduledExecutorService f18348o;

    /* renamed from: a, reason: collision with root package name */
    private final A0.f f18349a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18350b;

    /* renamed from: c, reason: collision with root package name */
    private final D f18351c;

    /* renamed from: d, reason: collision with root package name */
    private final V f18352d;

    /* renamed from: e, reason: collision with root package name */
    private final a f18353e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f18354f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f18355g;

    /* renamed from: h, reason: collision with root package name */
    private final Task f18356h;

    /* renamed from: i, reason: collision with root package name */
    private final I f18357i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18358j;

    /* renamed from: k, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f18359k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f18345l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n, reason: collision with root package name */
    static InterfaceC1956b f18347n = new InterfaceC1956b() { // from class: com.google.firebase.messaging.r
        @Override // b1.InterfaceC1956b
        public final Object get() {
            s.j F8;
            F8 = FirebaseMessaging.F();
            return F8;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private final Y0.d f18360a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f18361b;

        /* renamed from: c, reason: collision with root package name */
        private Y0.b f18362c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f18363d;

        a(Y0.d dVar) {
            this.f18360a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Y0.a aVar) {
            if (c()) {
                FirebaseMessaging.this.J();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context k8 = FirebaseMessaging.this.f18349a.k();
            SharedPreferences sharedPreferences = k8.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = k8.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(k8.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f18361b) {
                    return;
                }
                Boolean e8 = e();
                this.f18363d = e8;
                if (e8 == null) {
                    Y0.b bVar = new Y0.b() { // from class: com.google.firebase.messaging.A
                        @Override // Y0.b
                        public final void a(Y0.a aVar) {
                            FirebaseMessaging.a.this.d(aVar);
                        }
                    };
                    this.f18362c = bVar;
                    this.f18360a.a(A0.b.class, bVar);
                }
                this.f18361b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            boolean t8;
            try {
                b();
                Boolean bool = this.f18363d;
                if (bool != null) {
                    t8 = bool.booleanValue();
                } else {
                    t8 = FirebaseMessaging.this.f18349a.t();
                }
            } catch (Throwable th) {
                throw th;
            }
            return t8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(A0.f fVar, InterfaceC1612a interfaceC1612a, InterfaceC1956b interfaceC1956b, InterfaceC1956b interfaceC1956b2, c1.e eVar, InterfaceC1956b interfaceC1956b3, Y0.d dVar) {
        this(fVar, interfaceC1612a, interfaceC1956b, interfaceC1956b2, eVar, interfaceC1956b3, dVar, new I(fVar.k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(C3826j c3826j) {
        try {
            c3826j.c(k());
        } catch (Exception e8) {
            c3826j.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(C1298a c1298a) {
        if (c1298a != null) {
            H.v(c1298a.p());
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (w()) {
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(f0 f0Var) {
        if (w()) {
            f0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s.j F() {
        return null;
    }

    private boolean H() {
        O.c(this.f18350b);
        if (!O.d(this.f18350b)) {
            return false;
        }
        if (this.f18349a.j(B0.a.class) != null) {
            return true;
        }
        if (!H.a() || f18347n == null) {
            return false;
        }
        return true;
    }

    private synchronized void I() {
        if (!this.f18358j) {
            K(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (L(r())) {
            I();
        }
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull A0.f fVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) fVar.j(FirebaseMessaging.class);
            AbstractC1400p.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging n() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(A0.f.l());
        }
        return firebaseMessaging;
    }

    private static synchronized a0 o(Context context) {
        a0 a0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f18346m == null) {
                    f18346m = new a0(context);
                }
                a0Var = f18346m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a0Var;
    }

    private String p() {
        if ("[DEFAULT]".equals(this.f18349a.m())) {
            return "";
        }
        return this.f18349a.o();
    }

    public static s.j s() {
        return (s.j) f18347n.get();
    }

    private void t() {
        this.f18351c.e().e(this.f18354f, new InterfaceC3823g() { // from class: com.google.firebase.messaging.x
            @Override // q0.InterfaceC3823g
            public final void a(Object obj) {
                FirebaseMessaging.this.B((C1298a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void E() {
        O.c(this.f18350b);
        Q.g(this.f18350b, this.f18351c, H());
        if (H()) {
            t();
        }
    }

    private void v(String str) {
        if ("[DEFAULT]".equals(this.f18349a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f18349a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C2583n(this.f18350b).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task y(String str, a0.a aVar, String str2) {
        o(this.f18350b).f(p(), str, str2, this.f18357i.a());
        if (aVar == null || !str2.equals(aVar.f18448a)) {
            v(str2);
        }
        return AbstractC3828l.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task z(final String str, final a0.a aVar) {
        return this.f18351c.f().o(this.f18355g, new InterfaceC3825i() { // from class: com.google.firebase.messaging.z
            @Override // q0.InterfaceC3825i
            public final Task a(Object obj) {
                Task y8;
                y8 = FirebaseMessaging.this.y(str, aVar, (String) obj);
                return y8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void G(boolean z8) {
        this.f18358j = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void K(long j8) {
        l(new b0(this, Math.min(Math.max(30L, 2 * j8), f18345l)), j8);
        this.f18358j = true;
    }

    boolean L(a0.a aVar) {
        if (aVar != null && !aVar.b(this.f18357i.a())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        final a0.a r8 = r();
        if (!L(r8)) {
            return r8.f18448a;
        }
        final String c8 = I.c(this.f18349a);
        try {
            return (String) AbstractC3828l.a(this.f18352d.b(c8, new V.a() { // from class: com.google.firebase.messaging.y
                @Override // com.google.firebase.messaging.V.a
                public final Task start() {
                    Task z8;
                    z8 = FirebaseMessaging.this.z(c8, r8);
                    return z8;
                }
            }));
        } catch (InterruptedException | ExecutionException e8) {
            throw new IOException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Runnable runnable, long j8) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f18348o == null) {
                    f18348o = new ScheduledThreadPoolExecutor(1, new W.a("TAG"));
                }
                f18348o.schedule(runnable, j8, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context m() {
        return this.f18350b;
    }

    public Task q() {
        final C3826j c3826j = new C3826j();
        this.f18354f.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.A(c3826j);
            }
        });
        return c3826j.a();
    }

    a0.a r() {
        return o(this.f18350b).d(p(), I.c(this.f18349a));
    }

    public boolean w() {
        return this.f18353e.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f18357i.g();
    }

    FirebaseMessaging(A0.f fVar, InterfaceC1612a interfaceC1612a, InterfaceC1956b interfaceC1956b, InterfaceC1956b interfaceC1956b2, c1.e eVar, InterfaceC1956b interfaceC1956b3, Y0.d dVar, I i8) {
        this(fVar, interfaceC1612a, interfaceC1956b3, dVar, i8, new D(fVar, i8, interfaceC1956b, interfaceC1956b2, eVar), AbstractC2584o.f(), AbstractC2584o.c(), AbstractC2584o.b());
    }

    FirebaseMessaging(A0.f fVar, InterfaceC1612a interfaceC1612a, InterfaceC1956b interfaceC1956b, Y0.d dVar, I i8, D d8, Executor executor, Executor executor2, Executor executor3) {
        this.f18358j = false;
        f18347n = interfaceC1956b;
        this.f18349a = fVar;
        this.f18353e = new a(dVar);
        Context k8 = fVar.k();
        this.f18350b = k8;
        C2586q c2586q = new C2586q();
        this.f18359k = c2586q;
        this.f18357i = i8;
        this.f18351c = d8;
        this.f18352d = new V(executor);
        this.f18354f = executor2;
        this.f18355g = executor3;
        Context k9 = fVar.k();
        if (k9 instanceof Application) {
            ((Application) k9).registerActivityLifecycleCallbacks(c2586q);
        } else {
            Log.w("FirebaseMessaging", "Context " + k9 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC1612a != null) {
            interfaceC1612a.a(new InterfaceC1612a.InterfaceC0261a() { // from class: com.google.firebase.messaging.s
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.C();
            }
        });
        Task e8 = f0.e(this, i8, d8, k8, AbstractC2584o.g());
        this.f18356h = e8;
        e8.e(executor2, new InterfaceC3823g() { // from class: com.google.firebase.messaging.u
            @Override // q0.InterfaceC3823g
            public final void a(Object obj) {
                FirebaseMessaging.this.D((f0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.E();
            }
        });
    }
}
