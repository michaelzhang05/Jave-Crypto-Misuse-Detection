package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.GraphRequest;
import com.facebook.internal.k;
import com.facebook.internal.v;
import com.facebook.internal.x;
import com.facebook.internal.y;
import com.facebook.t.u.c;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookSdk.java */
/* loaded from: classes.dex */
public final class f {
    private static final String a = "com.facebook.f";

    /* renamed from: c, reason: collision with root package name */
    private static Executor f9073c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f9074d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile String f9075e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile String f9076f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile Boolean f9077g;
    private static com.facebook.internal.q<File> l;
    private static Context m;
    private static Boolean s;
    private static Boolean t;
    private static j u;

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet<l> f9072b = new HashSet<>(Arrays.asList(l.DEVELOPER_ERRORS));

    /* renamed from: h, reason: collision with root package name */
    private static volatile String f9078h = "facebook.com";

    /* renamed from: i, reason: collision with root package name */
    private static AtomicLong f9079i = new AtomicLong(65536);

    /* renamed from: j, reason: collision with root package name */
    private static volatile boolean f9080j = false;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f9081k = false;
    private static int n = 64206;
    private static final Object o = new Object();
    private static String p = v.a();
    public static boolean q = false;
    public static boolean r = false;

    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    static class a implements j {
        a() {
        }

        @Override // com.facebook.f.j
        public GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.f fVar) {
            return GraphRequest.L(accessToken, str, jSONObject, fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    public static class b implements Callable<File> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public File call() throws Exception {
            return f.m.getCacheDir();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    public static class c implements k.c {
        c() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.internal.a0.c.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    public static class d implements k.c {
        d() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.t.i.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    public static class e implements k.c {
        e() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                f.q = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0129f implements k.c {
        C0129f() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                f.r = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    public static class g implements k.c {
        g() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.internal.b0.e.e.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    public static class h implements Callable<Void> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f9082f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f9083g;

        h(k kVar, Context context) {
            this.f9082f = kVar;
            this.f9083g = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            com.facebook.b.h().i();
            n.b().c();
            if (AccessToken.t() && Profile.c() == null) {
                Profile.b();
            }
            k kVar = this.f9082f;
            if (kVar != null) {
                kVar.a();
            }
            com.facebook.t.g.g(f.m, f.f9074d);
            s.n();
            com.facebook.t.g.j(this.f9083g.getApplicationContext()).c();
            return null;
        }
    }

    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    static class i implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f9084f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9085g;

        i(Context context, String str) {
            this.f9084f = context;
            this.f9085g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                f.A(this.f9084f, this.f9085g);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    public interface j {
        GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.f fVar);
    }

    /* compiled from: FacebookSdk.java */
    /* loaded from: classes.dex */
    public interface k {
        void a();
    }

    static {
        Boolean bool = Boolean.FALSE;
        s = bool;
        t = bool;
        u = new a();
    }

    static void A(Context context, String str) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return;
        }
        try {
            try {
                if (context != null && str != null) {
                    com.facebook.internal.a h2 = com.facebook.internal.a.h(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String str2 = str + "ping";
                    long j2 = sharedPreferences.getLong(str2, 0L);
                    try {
                        GraphRequest a2 = u.a(null, String.format("%s/activities", str), com.facebook.t.u.c.a(c.b.MOBILE_INSTALL_EVENT, h2, com.facebook.t.g.d(context), q(context), context), null);
                        if (j2 == 0 && a2.g().g() == null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(str2, System.currentTimeMillis());
                            edit.apply();
                            return;
                        }
                        return;
                    } catch (JSONException e2) {
                        throw new FacebookException("An error occurred while publishing install.", e2);
                    }
                }
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            } catch (Exception e3) {
                x.U("Facebook-publish", e3);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
        }
    }

    public static void B(Context context, String str) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return;
        }
        try {
            m().execute(new i(context.getApplicationContext(), str));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
        }
    }

    @Deprecated
    public static synchronized void C(Context context) {
        synchronized (f.class) {
            D(context, null);
        }
    }

    @Deprecated
    public static synchronized void D(Context context, k kVar) {
        synchronized (f.class) {
            if (s.booleanValue()) {
                if (kVar != null) {
                    kVar.a();
                }
                return;
            }
            y.i(context, "applicationContext");
            y.e(context, false);
            y.f(context, false);
            m = context.getApplicationContext();
            com.facebook.t.g.d(context);
            z(m);
            if (!x.Q(f9074d)) {
                s = Boolean.TRUE;
                if (h()) {
                    c();
                }
                if ((m instanceof Application) && s.g()) {
                    com.facebook.t.u.a.x((Application) m, f9074d);
                }
                com.facebook.internal.n.k();
                com.facebook.internal.s.x();
                com.facebook.internal.b.b(m);
                l = new com.facebook.internal.q<>(new b());
                com.facebook.internal.k.a(k.d.Instrument, new c());
                com.facebook.internal.k.a(k.d.AppEvents, new d());
                com.facebook.internal.k.a(k.d.ChromeCustomTabsPrefetching, new e());
                com.facebook.internal.k.a(k.d.IgnoreAppSwitchToLoggedOut, new C0129f());
                com.facebook.internal.k.a(k.d.Monitoring, new g());
                m().execute(new FutureTask(new h(kVar, context)));
                return;
            }
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
    }

    public static void c() {
        t = Boolean.TRUE;
    }

    public static boolean d() {
        return s.e();
    }

    public static Context e() {
        y.k();
        return m;
    }

    public static String f() {
        y.k();
        return f9074d;
    }

    public static String g() {
        y.k();
        return f9075e;
    }

    public static boolean h() {
        return s.f();
    }

    public static boolean i() {
        return s.g();
    }

    public static int j() {
        y.k();
        return n;
    }

    public static String k() {
        y.k();
        return f9076f;
    }

    public static boolean l() {
        return s.h();
    }

    public static Executor m() {
        synchronized (o) {
            if (f9073c == null) {
                f9073c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f9073c;
    }

    public static String n() {
        return f9078h;
    }

    public static String o() {
        x.V(a, String.format("getGraphApiVersion: %s", p));
        return p;
    }

    public static String p() {
        AccessToken g2 = AccessToken.g();
        String l2 = g2 != null ? g2.l() : null;
        if (l2 == null) {
            return f9078h;
        }
        if (l2.equals("gaming")) {
            return f9078h.replace("facebook.com", "fb.gg");
        }
        return f9078h;
    }

    public static boolean q(Context context) {
        y.k();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static boolean r() {
        return s.i();
    }

    public static long s() {
        y.k();
        return f9079i.get();
    }

    public static String t() {
        return "7.1.0";
    }

    public static boolean u() {
        return f9080j;
    }

    public static synchronized boolean v() {
        boolean booleanValue;
        synchronized (f.class) {
            booleanValue = t.booleanValue();
        }
        return booleanValue;
    }

    public static synchronized boolean w() {
        boolean booleanValue;
        synchronized (f.class) {
            booleanValue = s.booleanValue();
        }
        return booleanValue;
    }

    public static boolean x() {
        return f9081k;
    }

    public static boolean y(l lVar) {
        boolean z;
        HashSet<l> hashSet = f9072b;
        synchronized (hashSet) {
            z = u() && hashSet.contains(lVar);
        }
        return z;
    }

    static void z(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return;
            }
            if (f9074d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                        f9074d = str.substring(2);
                    } else {
                        f9074d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f9075e == null) {
                f9075e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f9076f == null) {
                f9076f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (n == 64206) {
                n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f9077g == null) {
                f9077g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
