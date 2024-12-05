package io.rakam.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.text.TextUtils;
import android.util.Pair;
import cm.aptoide.pt.BuildConfig;
import cm.aptoide.pt.account.AccountAnalytics;
import cm.aptoide.pt.notification.sync.LocalNotificationSyncManager;
import cm.aptoide.pt.timeline.view.follow.TimeLineFollowFragment;
import java.lang.Thread;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RakamClient.java */
/* loaded from: classes.dex */
public class g {
    public static final MediaType a = MediaType.parse("application/json; charset=utf-8");

    /* renamed from: b, reason: collision with root package name */
    private static final io.rakam.api.h f18476b = io.rakam.api.h.d();
    private long A;
    private long B;
    private boolean C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private JSONObject H;
    private boolean I;
    private AtomicBoolean J;
    AtomicBoolean K;
    Throwable L;
    private String M;
    k N;
    k O;

    /* renamed from: c, reason: collision with root package name */
    protected Context f18477c;

    /* renamed from: d, reason: collision with root package name */
    protected OkHttpClient f18478d;

    /* renamed from: e, reason: collision with root package name */
    protected io.rakam.api.b f18479e;

    /* renamed from: f, reason: collision with root package name */
    protected String f18480f;

    /* renamed from: g, reason: collision with root package name */
    protected String f18481g;

    /* renamed from: h, reason: collision with root package name */
    protected String f18482h;

    /* renamed from: i, reason: collision with root package name */
    protected String f18483i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18484j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18485k;
    protected boolean l;
    private boolean m;
    private boolean n;
    io.rakam.api.i o;
    protected String p;
    long q;
    long r;
    long s;
    long t;
    long u;
    private io.rakam.api.d v;
    private int w;
    private int x;
    private int y;
    private long z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RakamClient.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f18486f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f18487g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f18488h;

        a(g gVar, boolean z, String str) {
            this.f18486f = gVar;
            this.f18487g = z;
            this.f18488h = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.d(this.f18486f.f18480f)) {
                return;
            }
            if (this.f18487g && g.this.F) {
                g.this.S("_session_end");
            }
            g gVar = this.f18486f;
            String str = this.f18488h;
            gVar.f18482h = str;
            g.this.f18479e.A0(TimeLineFollowFragment.BundleKeys.USER_ID, str);
            if (this.f18487g) {
                long u = g.this.u();
                g.this.b0(u);
                g.this.N(u);
                if (g.this.F) {
                    g.this.S("_session_start");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RakamClient.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f18490f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f18491g;

        b(g gVar, String str) {
            this.f18490f = gVar;
            this.f18491g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.d(this.f18490f.f18480f)) {
                return;
            }
            g gVar = this.f18490f;
            String str = this.f18491g;
            gVar.f18483i = str;
            g.this.Q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RakamClient.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.J.set(false);
            g.this.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RakamClient.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f18494f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f18495g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f18496h;

        d(String str, long j2, long j3) {
            this.f18494f = str;
            this.f18495g = j2;
            this.f18496h = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.I(gVar.f18478d, this.f18494f, this.f18495g, this.f18496h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RakamClient.java */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f18498f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f18499g;

        /* compiled from: RakamClient.java */
        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                gVar.m0(gVar.C);
            }
        }

        e(long j2, long j3) {
            this.f18498f = j2;
            this.f18499g = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j2 = this.f18498f;
            if (j2 >= 0) {
                g.this.f18479e.G0(j2);
            }
            long j3 = this.f18499g;
            if (j3 >= 0) {
                g.this.f18479e.J0(j3);
            }
            g.this.K.set(false);
            if (g.this.f18479e.u0() <= g.this.w) {
                g.this.C = false;
                g gVar = g.this;
                gVar.D = gVar.x;
                return;
            }
            g.this.N.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RakamClient.java */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.K.set(false);
            g.this.m0(true);
        }
    }

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$g, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0265g implements Thread.UncaughtExceptionHandler {
        C0265g() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            g.f18476b.c("RakamClient", "Unknown exception thrown from log thread.", th);
        }
    }

    /* compiled from: RakamClient.java */
    /* loaded from: classes2.dex */
    class h implements Thread.UncaughtExceptionHandler {
        h() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            g.f18476b.c("RakamClient", "Unknown exception thrown from HTTP thread.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RakamClient.java */
    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f18505f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f18506g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f18507h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f18508i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ g f18509j;

        /* compiled from: RakamClient.java */
        /* loaded from: classes2.dex */
        class a implements io.rakam.api.c {
            a() {
            }

            @Override // io.rakam.api.c
            public void a(SQLiteDatabase sQLiteDatabase) {
                i iVar = i.this;
                g.this.f18479e.B0(sQLiteDatabase, AccountAnalytics.STORE, "device_id", iVar.f18509j.f18483i);
                i iVar2 = i.this;
                g.this.f18479e.B0(sQLiteDatabase, AccountAnalytics.STORE, TimeLineFollowFragment.BundleKeys.USER_ID, iVar2.f18509j.f18482h);
                i iVar3 = i.this;
                g.this.f18479e.B0(sQLiteDatabase, "long_store", "opt_out", Long.valueOf(iVar3.f18509j.m ? 1L : 0L));
                i iVar4 = i.this;
                g.this.f18479e.B0(sQLiteDatabase, "long_store", "previous_session_id", Long.valueOf(iVar4.f18509j.q));
                i iVar5 = i.this;
                g.this.f18479e.B0(sQLiteDatabase, "long_store", "last_event_time", Long.valueOf(iVar5.f18509j.t));
            }
        }

        i(Context context, boolean z, String str, String str2, g gVar) {
            this.f18505f = context;
            this.f18506g = z;
            this.f18507h = str;
            this.f18508i = str2;
            this.f18509j = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if (gVar.l) {
                return;
            }
            try {
                if (gVar.f18481g.equals("$default_instance")) {
                    g.o0(this.f18505f);
                    g.q0(this.f18505f);
                }
                g.this.f18478d = new OkHttpClient();
                g.this.v = new io.rakam.api.d(this.f18505f);
                g gVar2 = g.this;
                gVar2.f18483i = gVar2.C();
                if (this.f18506g) {
                    io.rakam.api.e e2 = io.rakam.api.e.e();
                    g gVar3 = g.this;
                    e2.c(gVar3.f18478d, this.f18507h, gVar3.f18483i);
                }
                g.this.v.s();
                String str = this.f18508i;
                if (str != null) {
                    this.f18509j.f18482h = str;
                    g.this.f18479e.A0(TimeLineFollowFragment.BundleKeys.USER_ID, str);
                } else {
                    this.f18509j.f18482h = g.this.f18479e.v0(TimeLineFollowFragment.BundleKeys.USER_ID);
                }
                Long k0 = g.this.f18479e.k0("opt_out");
                g.this.m = k0 != null && k0.longValue() == 1;
                g gVar4 = g.this;
                gVar4.u = gVar4.w("previous_session_id", -1L);
                g gVar5 = g.this;
                long j2 = gVar5.u;
                if (j2 >= 0) {
                    gVar5.q = j2;
                }
                gVar5.r = gVar5.w("last_event_id", -1L);
                g gVar6 = g.this;
                gVar6.s = gVar6.w("last_identify_id", -1L);
                g gVar7 = g.this;
                gVar7.t = gVar7.w("last_event_time", -1L);
                g.this.f18479e.L0(new a());
                g gVar8 = g.this;
                gVar8.l = true;
                String v0 = gVar8.f18479e.v0("super_properties");
                if (v0 != null) {
                    try {
                        g.this.H = new JSONObject(v0);
                    } catch (JSONException unused) {
                        g.this.f18479e.A0("super_properties", null);
                    }
                }
            } catch (CursorWindowAllocationException e3) {
                g.f18476b.b("RakamClient", String.format("Failed to initialize Rakam SDK due to: %s", e3.getMessage()));
                io.rakam.api.e.e().g("Failed to initialize Rakam SDK", e3);
                this.f18509j.f18480f = null;
            }
        }
    }

    public g() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String C() {
        Set<String> v = v();
        String v0 = this.f18479e.v0("device_id");
        String c2 = j.c(this.f18477c, this.f18481g, "device_id");
        if (!j.d(v0) && !v.contains(v0)) {
            if (!v0.equals(c2)) {
                Q(v0);
            }
            return v0;
        }
        if (!j.d(c2) && !v.contains(c2)) {
            Q(c2);
            return c2;
        }
        if (!this.f18484j && this.f18485k && !this.v.q()) {
            String c3 = this.v.c();
            if (!j.d(c3) && !v.contains(c3)) {
                Q(c3);
                return c3;
            }
        }
        String str = io.rakam.api.d.b() + "R";
        Q(str);
        return str;
    }

    private boolean D(long j2) {
        return j2 - this.t < (this.E ? this.A : this.B);
    }

    private static void K(SharedPreferences sharedPreferences, String str, boolean z, io.rakam.api.b bVar, String str2) {
        if (bVar.k0(str2) != null) {
            return;
        }
        bVar.z0(str2, Long.valueOf(sharedPreferences.getBoolean(str, z) ? 1L : 0L));
        sharedPreferences.edit().remove(str).apply();
    }

    private static void L(SharedPreferences sharedPreferences, String str, long j2, io.rakam.api.b bVar, String str2) {
        if (bVar.k0(str2) != null) {
            return;
        }
        bVar.z0(str2, Long.valueOf(sharedPreferences.getLong(str, j2)));
        sharedPreferences.edit().remove(str).apply();
    }

    private static void M(SharedPreferences sharedPreferences, String str, String str2, io.rakam.api.b bVar, String str3) {
        if (j.d(bVar.v0(str3))) {
            String string = sharedPreferences.getString(str, str2);
            if (j.d(string)) {
                return;
            }
            bVar.A0(str3, string);
            sharedPreferences.edit().remove(str).apply();
        }
    }

    private void P(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        k kVar = this.N;
        if (currentThread != kVar) {
            kVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(String str) {
        this.f18479e.A0("device_id", str);
        j.f(this.f18477c, this.f18481g, "device_id", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(String str) {
        if (s(String.format("sendSessionEvent('%s')", str)) && y()) {
            E(str, null, this.t, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(long j2) {
        this.q = j2;
        a0(j2);
    }

    private void f0(long j2) {
        if (this.F) {
            S("_session_end");
        }
        b0(j2);
        N(j2);
        if (this.F) {
            S("_session_start");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i0(String str) {
        return str.length() <= 1024 ? str : str.substring(0, 1024);
    }

    private void n0(long j2) {
        if (this.J.getAndSet(true)) {
            return;
        }
        this.N.b(new c(), j2);
    }

    static boolean o0(Context context) {
        return p0(context, null, null);
    }

    static boolean p0(Context context, String str, String str2) {
        if (str == null) {
            try {
                str = io.rakam.api.a.class.getPackage().getName();
            } catch (Exception unused) {
                str = "io.rakam.api";
            }
        }
        if (str2 == null) {
            str2 = "io.rakam.api";
        }
        try {
            if (str2.equals(str)) {
                return false;
            }
            String str3 = str + "." + context.getPackageName();
            SharedPreferences sharedPreferences = context.getSharedPreferences(str3, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            String str4 = str2 + "." + context.getPackageName();
            SharedPreferences.Editor edit = context.getSharedPreferences(str4, 0).edit();
            if (sharedPreferences.contains(str + ".previousSessionId")) {
                edit.putLong("io.rakam.api.previousSessionId", sharedPreferences.getLong(str + ".previousSessionId", -1L));
            }
            if (sharedPreferences.contains(str + ".deviceId")) {
                edit.putString("io.rakam.api.deviceId", sharedPreferences.getString(str + ".deviceId", null));
            }
            if (sharedPreferences.contains(str + ".userId")) {
                edit.putString("io.rakam.api.userId", sharedPreferences.getString(str + ".userId", null));
            }
            if (sharedPreferences.contains(str + ".optOut")) {
                edit.putBoolean("io.rakam.api.optOut", sharedPreferences.getBoolean(str + ".optOut", false));
            }
            edit.apply();
            sharedPreferences.edit().clear().apply();
            f18476b.e("RakamClient", "Upgraded shared preferences from " + str3 + " to " + str4);
            return true;
        } catch (Exception e2) {
            f18476b.c("RakamClient", "Error upgrading shared preferences", e2);
            io.rakam.api.e.e().g("Failed to upgrade shared prefs", e2);
            return false;
        }
    }

    static boolean q0(Context context) {
        return r0(context, null);
    }

    static boolean r0(Context context, String str) {
        if (str == null) {
            str = "io.rakam.api";
        }
        io.rakam.api.b D = io.rakam.api.b.D(context);
        String v0 = D.v0("device_id");
        Long k0 = D.k0("previous_session_id");
        Long k02 = D.k0("last_event_time");
        if (!j.d(v0) && k0 != null && k02 != null) {
            return true;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str + "." + context.getPackageName(), 0);
        M(sharedPreferences, "io.rakam.api.deviceId", null, D, "device_id");
        L(sharedPreferences, "io.rakam.api.lastEventTime", -1L, D, "last_event_time");
        L(sharedPreferences, "io.rakam.api.lastEventId", -1L, D, "last_event_id");
        L(sharedPreferences, "io.rakam.api.lastIdentifyId", -1L, D, "last_identify_id");
        L(sharedPreferences, "io.rakam.api.previousSessionId", -1L, D, "previous_session_id");
        M(sharedPreferences, "io.rakam.api.userId", null, D, TimeLineFollowFragment.BundleKeys.USER_ID);
        K(sharedPreferences, "io.rakam.api.optOut", false, D, "opt_out");
        return true;
    }

    private JSONObject t() throws JSONException {
        return new JSONObject().put("api_key", this.f18480f).put("library", new JSONObject().put("name", "rakam-android").put("version", "2.7.14")).put("upload_time", u());
    }

    private Set<String> v() {
        HashSet hashSet = new HashSet();
        hashSet.add(HttpUrl.FRAGMENT_ENCODE_SET);
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long w(String str, long j2) {
        Long k0 = this.f18479e.k0(str);
        return k0 == null ? j2 : k0.longValue();
    }

    private boolean y() {
        return this.q >= 0;
    }

    public synchronized g A(Context context, URL url, String str, String str2) {
        return B(context, url, str, str2, null, true);
    }

    public synchronized g B(Context context, URL url, String str, String str2, String str3, boolean z) {
        if (context == null) {
            f18476b.b("RakamClient", "Argument context cannot be null in initialize()");
            return this;
        }
        T(url);
        if (TextUtils.isEmpty(str)) {
            f18476b.b("RakamClient", "Argument apiKey cannot be null or blank in initialize()");
            return this;
        }
        Context applicationContext = context.getApplicationContext();
        this.f18477c = applicationContext;
        this.f18480f = str;
        this.f18479e = io.rakam.api.b.J(applicationContext, this.f18481g);
        if (j.d(str3)) {
            str3 = "Android";
        }
        this.p = str3;
        P(new i(context, z, str, str2, this));
        return this;
    }

    protected long E(String str, JSONObject jSONObject, long j2, boolean z) {
        Location l;
        f18476b.a("RakamClient", "Logged event to Rakam: " + str);
        if (this.m) {
            return -1L;
        }
        if (!(this.F && (str.equals("_session_start") || str.equals("_session_end"))) && !z) {
            if (!this.G) {
                g0(j2);
            } else {
                N(j2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("_id", UUID.randomUUID().toString());
            jSONObject2.put("_local_id", this.r);
            jSONObject2.put("_time", j2);
            jSONObject2.put("_user", O(this.f18482h));
            jSONObject2.put("_device_id", O(this.f18483i));
            jSONObject2.put("_session_id", z ? -1L : this.q);
            if (this.o.m()) {
                jSONObject2.put("_version_name", O(this.v.o()));
            }
            if (this.o.j()) {
                jSONObject2.put("_os_name", O(this.v.m()));
            }
            if (this.o.k()) {
                jSONObject2.put("_os_version", O(this.v.n()));
            }
            if (this.o.d()) {
                jSONObject2.put("_device_brand", O(this.v.d()));
            }
            if (this.o.e()) {
                jSONObject2.put("_device_manufacturer", O(this.v.j()));
            }
            if (this.o.f()) {
                jSONObject2.put("_device_model", O(this.v.k()));
            }
            if (this.o.b()) {
                jSONObject2.put("_carrier", O(this.v.f()));
            }
            if (this.o.c()) {
                jSONObject2.put("_country_code", O(this.v.g()));
            }
            if (this.o.h()) {
                jSONObject2.put("_language", O(this.v.i()));
            }
            if (this.o.l()) {
                jSONObject2.put("_platform", this.p);
            }
            jSONObject2.put("_library_name", "rakam-android");
            jSONObject2.put("_library_version", "2.7.14");
            jSONObject2.put("_ip", true);
            if (this.o.i() && (l = this.v.l()) != null) {
                jSONObject2.put("_latitude", l.getLatitude());
                jSONObject2.put("_longitude", l.getLongitude());
            }
            if (this.o.a() && this.v.c() != null) {
                jSONObject2.put("_android_adid", this.v.c());
            }
            jSONObject2.put("_limit_ad_tracking", this.v.q());
            jSONObject2.put("_gps_enabled", this.v.p());
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObject3 = this.H;
            if (jSONObject3 != null) {
                Iterator<String> keys2 = jSONObject3.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (jSONObject == null || !jSONObject.has(next2)) {
                        jSONObject2.put(next2, this.H.get(next2));
                    }
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("properties", k0(jSONObject2));
            jSONObject4.put("collection", O(str));
            return R(str, jSONObject4);
        } catch (JSONException e2) {
            f18476b.b("RakamClient", String.format("JSON Serialization of event type %s failed, skipping: %s", str, e2.toString()));
            io.rakam.api.e.e().g(String.format("Failed to JSON serialize event type %s", str), e2);
            return -1L;
        }
    }

    public void F(String str) {
        G(str, null);
    }

    public void G(String str, JSONObject jSONObject) {
        H(str, jSONObject, false);
    }

    public void H(String str, JSONObject jSONObject, boolean z) {
        if (s0(str)) {
            E(str, jSONObject, u(), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void I(okhttp3.OkHttpClient r15, java.lang.String r16, long r17, long r19) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.g.I(okhttp3.OkHttpClient, java.lang.String, long, long):void");
    }

    protected Pair<Pair<Long, Long>, JSONArray> J(List<JSONObject> list, List<JSONObject> list2, long j2) throws JSONException {
        long j3;
        long j4;
        JSONArray jSONArray = new JSONArray();
        long j5 = -1;
        long j6 = -1;
        while (true) {
            if (jSONArray.length() >= j2) {
                break;
            }
            boolean isEmpty = list.isEmpty();
            boolean isEmpty2 = list2.isEmpty();
            if (isEmpty && isEmpty2) {
                f18476b.g("RakamClient", String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", Long.valueOf(j2 - jSONArray.length())));
                break;
            }
            if (isEmpty2) {
                JSONObject remove = list.remove(0);
                j3 = remove.getLong("event_id");
                jSONArray.put(remove);
            } else {
                if (isEmpty) {
                    JSONObject remove2 = list2.remove(0);
                    j4 = remove2.getLong("event_id");
                    jSONArray.put(remove2);
                } else if (list.get(0).has("event_id") && list.get(0).getLong("event_id") >= list2.get(0).getLong("event_id")) {
                    JSONObject remove3 = list2.remove(0);
                    j4 = remove3.getLong("event_id");
                    jSONArray.put(remove3);
                } else {
                    JSONObject remove4 = list.remove(0);
                    j3 = remove4.getLong("event_id");
                    jSONArray.put(remove4);
                }
                j6 = j4;
            }
            j5 = j3;
        }
        return new Pair<>(new Pair(Long.valueOf(j5), Long.valueOf(j6)), jSONArray);
    }

    void N(long j2) {
        if (y()) {
            X(j2);
        }
    }

    protected Object O(Object obj) {
        return obj == null ? JSONObject.NULL : obj;
    }

    protected long R(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (j.d(jSONObject2)) {
            f18476b.b("RakamClient", String.format("Detected empty event string for event type %s, skipping", str));
            return -1L;
        }
        if (str.equals("$identify")) {
            long f2 = this.f18479e.f(jSONObject2);
            this.s = f2;
            Y(f2);
        } else {
            long a2 = this.f18479e.a(jSONObject2);
            this.r = a2;
            W(a2);
        }
        int min = Math.min(Math.max(1, this.y / 10), 20);
        if (this.f18479e.P() > this.y) {
            io.rakam.api.b bVar = this.f18479e;
            bVar.G0(bVar.q0(min));
        }
        if (this.f18479e.g0() > this.y) {
            io.rakam.api.b bVar2 = this.f18479e;
            bVar2.J0(bVar2.t0(min));
        }
        long u0 = this.f18479e.u0();
        int i2 = this.w;
        if (u0 % i2 == 0 && u0 >= i2) {
            l0();
        } else {
            n0(this.z);
        }
        return str.equals("$identify") ? this.s : this.r;
    }

    public void T(URL url) {
        if (url == null) {
            f18476b.b("RakamClient", "apiUrl can't be null");
            return;
        }
        String protocol = url.getProtocol();
        String host = url.getHost();
        int port = url.getPort();
        String str = protocol + "://" + host;
        if (url.getPath() != null && !url.getPath().equals("/") && !url.getPath().isEmpty()) {
            throw new IllegalStateException(String.format("Please set root address of the API address. A valid example is %s, %s is not valid.", str, url.toString()));
        }
        if (port > -1) {
            str = str + ":" + port;
        }
        this.M = str;
    }

    public g U(String str) {
        Set<String> v = v();
        if (s("setDeviceId()") && !j.d(str) && !v.contains(str)) {
            P(new b(this, str));
        }
        return this;
    }

    public g V(int i2) {
        this.z = i2;
        return this;
    }

    void W(long j2) {
        this.r = j2;
        this.f18479e.z0("last_event_id", Long.valueOf(j2));
    }

    void X(long j2) {
        this.t = j2;
        this.f18479e.z0("last_event_time", Long.valueOf(j2));
    }

    void Y(long j2) {
        this.s = j2;
        this.f18479e.z0("last_identify_id", Long.valueOf(j2));
    }

    public g Z(int i2) {
        f18476b.f(i2);
        return this;
    }

    void a0(long j2) {
        this.u = j2;
        this.f18479e.z0("previous_session_id", Long.valueOf(j2));
    }

    public g c0(JSONObject jSONObject) {
        this.H = jSONObject;
        this.f18479e.A0("super_properties", jSONObject.toString());
        return this;
    }

    public g d0(String str) {
        return e0(str, false);
    }

    public g e0(String str, boolean z) {
        if (!s("setUserId()")) {
            return this;
        }
        P(new a(this, z, str));
        return this;
    }

    public boolean g0(long j2) {
        if (y()) {
            if (D(j2)) {
                N(j2);
                return false;
            }
            f0(j2);
            return true;
        }
        if (D(j2)) {
            long j3 = this.u;
            if (j3 == -1) {
                f0(j2);
                return true;
            }
            b0(j3);
            N(j2);
            return false;
        }
        f0(j2);
        return true;
    }

    public g h0(boolean z) {
        this.F = z;
        return this;
    }

    public JSONArray j0(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new JSONArray();
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj.getClass().equals(String.class)) {
                jSONArray.put(i2, i0((String) obj));
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i2, k0((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                jSONArray.put(i2, j0((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    public JSONObject k0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1000) {
            f18476b.g("RakamClient", "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj.getClass().equals(String.class)) {
                    jSONObject.put(next, i0((String) obj));
                } else if (obj.getClass().equals(JSONObject.class)) {
                    jSONObject.put(next, k0((JSONObject) obj));
                } else if (obj.getClass().equals(JSONArray.class)) {
                    jSONObject.put(next, j0((JSONArray) obj));
                }
            } catch (JSONException e2) {
                f18476b.b("RakamClient", e2.toString());
            }
        }
        return jSONObject;
    }

    protected void l0() {
        m0(false);
        io.rakam.api.e.e().d();
    }

    protected void m0(boolean z) {
        if (this.m || this.n || this.K.getAndSet(true)) {
            return;
        }
        long min = Math.min(z ? this.D : this.x, this.f18479e.u0());
        if (min <= 0) {
            this.K.set(false);
            return;
        }
        try {
            try {
                Pair<Pair<Long, Long>, JSONArray> J = J(this.f18479e.Y(this.r, min), this.f18479e.i0(this.s, min), min);
                if (((JSONArray) J.second).length() == 0) {
                    this.K.set(false);
                    return;
                }
                try {
                    this.O.a(new d(new JSONObject().put("api", t()).put("events", J.second).toString(), ((Long) ((Pair) J.first).first).longValue(), ((Long) ((Pair) J.first).second).longValue()));
                } catch (JSONException e2) {
                    this.K.set(false);
                    f18476b.b("RakamClient", e2.toString());
                }
            } catch (JSONException e3) {
                this.K.set(false);
                f18476b.b("RakamClient", e3.toString());
                io.rakam.api.e.e().g("Failed to update server", e3);
            }
        } catch (CursorWindowAllocationException e4) {
            this.K.set(false);
            f18476b.b("RakamClient", String.format("Caught Cursor window exception during event upload, deferring upload: %s", e4.getMessage()));
            io.rakam.api.e.e().g("Failed to update server", e4);
        }
    }

    protected synchronized boolean s(String str) {
        if (this.f18477c == null) {
            f18476b.b("RakamClient", "context cannot be null, set context with initialize() before calling " + str);
            return false;
        }
        if (!TextUtils.isEmpty(this.f18480f)) {
            return true;
        }
        f18476b.b("RakamClient", "apiKey cannot be null or empty, set apiKey with initialize() before calling " + str);
        return false;
    }

    protected boolean s0(String str) {
        if (TextUtils.isEmpty(str)) {
            f18476b.b("RakamClient", "Argument eventType cannot be null or blank in logEvent()");
            return false;
        }
        return s("logEvent()");
    }

    protected long u() {
        return System.currentTimeMillis();
    }

    public JSONObject x() {
        return j.a(this.H);
    }

    public g z(Context context, URL url, String str) {
        return A(context, url, str, null);
    }

    public g(String str) {
        this.f18484j = false;
        this.f18485k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = new io.rakam.api.i();
        this.q = -1L;
        this.r = -1L;
        this.s = -1L;
        this.t = -1L;
        this.u = -1L;
        this.w = 30;
        this.x = 100;
        this.y = 1000;
        this.z = 30000L;
        this.A = LocalNotificationSyncManager.FIVE_MINUTES;
        this.B = BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS;
        this.C = false;
        this.D = 100;
        this.E = false;
        this.F = false;
        this.G = false;
        this.I = true;
        this.J = new AtomicBoolean(false);
        this.K = new AtomicBoolean(false);
        this.N = new k("logThread");
        this.O = new k("httpThread");
        this.f18481g = j.e(str);
        this.N.start();
        this.O.start();
        this.N.setUncaughtExceptionHandler(new C0265g());
        this.O.setUncaughtExceptionHandler(new h());
    }
}
