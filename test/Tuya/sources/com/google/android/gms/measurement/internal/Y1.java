package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C2077q0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Y1 implements InterfaceC2263t2 {

    /* renamed from: H, reason: collision with root package name */
    private static volatile Y1 f16349H;

    /* renamed from: A, reason: collision with root package name */
    private volatile Boolean f16350A;

    /* renamed from: B, reason: collision with root package name */
    protected Boolean f16351B;

    /* renamed from: C, reason: collision with root package name */
    protected Boolean f16352C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f16353D;

    /* renamed from: E, reason: collision with root package name */
    private int f16354E;

    /* renamed from: G, reason: collision with root package name */
    final long f16356G;

    /* renamed from: a, reason: collision with root package name */
    private final Context f16357a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16358b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16359c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16360d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16361e;

    /* renamed from: f, reason: collision with root package name */
    private final C2167c f16362f;

    /* renamed from: g, reason: collision with root package name */
    private final C2197h f16363g;

    /* renamed from: h, reason: collision with root package name */
    private final I1 f16364h;

    /* renamed from: i, reason: collision with root package name */
    private final C2267u1 f16365i;

    /* renamed from: j, reason: collision with root package name */
    private final W1 f16366j;

    /* renamed from: k, reason: collision with root package name */
    private final C2160a4 f16367k;

    /* renamed from: l, reason: collision with root package name */
    private final y4 f16368l;

    /* renamed from: m, reason: collision with root package name */
    private final C2243p1 f16369m;

    /* renamed from: n, reason: collision with root package name */
    private final W.d f16370n;

    /* renamed from: o, reason: collision with root package name */
    private final C2219k3 f16371o;

    /* renamed from: p, reason: collision with root package name */
    private final Y2 f16372p;

    /* renamed from: q, reason: collision with root package name */
    private final D0 f16373q;

    /* renamed from: r, reason: collision with root package name */
    private final C2165b3 f16374r;

    /* renamed from: s, reason: collision with root package name */
    private final String f16375s;

    /* renamed from: t, reason: collision with root package name */
    private C2238o1 f16376t;

    /* renamed from: u, reason: collision with root package name */
    private K3 f16377u;

    /* renamed from: v, reason: collision with root package name */
    private C2241p f16378v;

    /* renamed from: w, reason: collision with root package name */
    private C2228m1 f16379w;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f16381y;

    /* renamed from: z, reason: collision with root package name */
    private long f16382z;

    /* renamed from: x, reason: collision with root package name */
    private boolean f16380x = false;

    /* renamed from: F, reason: collision with root package name */
    private final AtomicInteger f16355F = new AtomicInteger(0);

    Y1(C2278w2 c2278w2) {
        long currentTimeMillis;
        Bundle bundle;
        AbstractC1319p.l(c2278w2);
        Context context = c2278w2.f16899a;
        C2167c c2167c = new C2167c(context);
        this.f16362f = c2167c;
        AbstractC2205i1.f16515a = c2167c;
        this.f16357a = context;
        this.f16358b = c2278w2.f16900b;
        this.f16359c = c2278w2.f16901c;
        this.f16360d = c2278w2.f16902d;
        this.f16361e = c2278w2.f16906h;
        this.f16350A = c2278w2.f16903e;
        this.f16375s = c2278w2.f16908j;
        this.f16353D = true;
        C2077q0 c2077q0 = c2278w2.f16905g;
        if (c2077q0 != null && (bundle = c2077q0.f15851g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f16351B = (Boolean) obj;
            }
            Object obj2 = c2077q0.f15851g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f16352C = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.X2.d(context);
        W.d b8 = W.g.b();
        this.f16370n = b8;
        Long l8 = c2278w2.f16907i;
        if (l8 != null) {
            currentTimeMillis = l8.longValue();
        } else {
            currentTimeMillis = b8.currentTimeMillis();
        }
        this.f16356G = currentTimeMillis;
        this.f16363g = new C2197h(this);
        I1 i12 = new I1(this);
        i12.l();
        this.f16364h = i12;
        C2267u1 c2267u1 = new C2267u1(this);
        c2267u1.l();
        this.f16365i = c2267u1;
        y4 y4Var = new y4(this);
        y4Var.l();
        this.f16368l = y4Var;
        this.f16369m = new C2243p1(new C2273v2(c2278w2, this));
        this.f16373q = new D0(this);
        C2219k3 c2219k3 = new C2219k3(this);
        c2219k3.j();
        this.f16371o = c2219k3;
        Y2 y22 = new Y2(this);
        y22.j();
        this.f16372p = y22;
        C2160a4 c2160a4 = new C2160a4(this);
        c2160a4.j();
        this.f16367k = c2160a4;
        C2165b3 c2165b3 = new C2165b3(this);
        c2165b3.l();
        this.f16374r = c2165b3;
        W1 w12 = new W1(this);
        w12.l();
        this.f16366j = w12;
        C2077q0 c2077q02 = c2278w2.f16905g;
        boolean z8 = c2077q02 == null || c2077q02.f15846b == 0;
        if (context.getApplicationContext() instanceof Application) {
            Y2 I8 = I();
            if (I8.f16777a.f16357a.getApplicationContext() instanceof Application) {
                Application application = (Application) I8.f16777a.f16357a.getApplicationContext();
                if (I8.f16383c == null) {
                    I8.f16383c = new X2(I8);
                }
                if (z8) {
                    application.unregisterActivityLifecycleCallbacks(I8.f16383c);
                    application.registerActivityLifecycleCallbacks(I8.f16383c);
                    I8.f16777a.d().v().a("Registered activity lifecycle callback");
                }
            }
        } else {
            d().w().a("Application context is not an Application");
        }
        w12.z(new X1(this, c2278w2));
    }

    public static Y1 H(Context context, C2077q0 c2077q0, Long l8) {
        Bundle bundle;
        if (c2077q0 != null && (c2077q0.f15849e == null || c2077q0.f15850f == null)) {
            c2077q0 = new C2077q0(c2077q0.f15845a, c2077q0.f15846b, c2077q0.f15847c, c2077q0.f15848d, null, null, c2077q0.f15851g, null);
        }
        AbstractC1319p.l(context);
        AbstractC1319p.l(context.getApplicationContext());
        if (f16349H == null) {
            synchronized (Y1.class) {
                try {
                    if (f16349H == null) {
                        f16349H = new Y1(new C2278w2(context, c2077q0, l8));
                    }
                } finally {
                }
            }
        } else if (c2077q0 != null && (bundle = c2077q0.f15851g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC1319p.l(f16349H);
            f16349H.f16350A = Boolean.valueOf(c2077q0.f15851g.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC1319p.l(f16349H);
        return f16349H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void e(Y1 y12, C2278w2 c2278w2) {
        y12.f().h();
        y12.f16363g.w();
        C2241p c2241p = new C2241p(y12);
        c2241p.l();
        y12.f16378v = c2241p;
        C2228m1 c2228m1 = new C2228m1(y12, c2278w2.f16904f);
        c2228m1.j();
        y12.f16379w = c2228m1;
        C2238o1 c2238o1 = new C2238o1(y12);
        c2238o1.j();
        y12.f16376t = c2238o1;
        K3 k32 = new K3(y12);
        k32.j();
        y12.f16377u = k32;
        y12.f16368l.m();
        y12.f16364h.m();
        y12.f16379w.k();
        C2257s1 u8 = y12.d().u();
        y12.f16363g.q();
        u8.b("App measurement initialized, version", 79000L);
        y12.d().u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s8 = c2228m1.s();
        if (TextUtils.isEmpty(y12.f16358b)) {
            if (y12.N().U(s8)) {
                y12.d().u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                y12.d().u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(s8)));
            }
        }
        y12.d().q().a("Debug-level message logging enabled");
        if (y12.f16354E != y12.f16355F.get()) {
            y12.d().r().c("Not all components initialized", Integer.valueOf(y12.f16354E), Integer.valueOf(y12.f16355F.get()));
        }
        y12.f16380x = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void u(AbstractC2253r2 abstractC2253r2) {
        if (abstractC2253r2 != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void v(A1 a12) {
        if (a12 != null) {
            if (a12.m()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(a12.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void w(AbstractC2258s2 abstractC2258s2) {
        if (abstractC2258s2 != null) {
            if (abstractC2258s2.n()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2258s2.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public final C2241p A() {
        w(this.f16378v);
        return this.f16378v;
    }

    public final C2228m1 B() {
        v(this.f16379w);
        return this.f16379w;
    }

    public final C2238o1 C() {
        v(this.f16376t);
        return this.f16376t;
    }

    public final C2243p1 D() {
        return this.f16369m;
    }

    public final C2267u1 E() {
        C2267u1 c2267u1 = this.f16365i;
        if (c2267u1 == null || !c2267u1.n()) {
            return null;
        }
        return c2267u1;
    }

    public final I1 F() {
        u(this.f16364h);
        return this.f16364h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final W1 G() {
        return this.f16366j;
    }

    public final Y2 I() {
        v(this.f16372p);
        return this.f16372p;
    }

    public final C2165b3 J() {
        w(this.f16374r);
        return this.f16374r;
    }

    public final C2219k3 K() {
        v(this.f16371o);
        return this.f16371o;
    }

    public final K3 L() {
        v(this.f16377u);
        return this.f16377u;
    }

    public final C2160a4 M() {
        v(this.f16367k);
        return this.f16367k;
    }

    public final y4 N() {
        u(this.f16368l);
        return this.f16368l;
    }

    public final String O() {
        return this.f16358b;
    }

    public final String P() {
        return this.f16359c;
    }

    public final String Q() {
        return this.f16360d;
    }

    public final String R() {
        return this.f16375s;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2263t2
    public final W.d a() {
        return this.f16370n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2263t2
    public final C2167c b() {
        return this.f16362f;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2263t2
    public final Context c() {
        return this.f16357a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2263t2
    public final C2267u1 d() {
        w(this.f16365i);
        return this.f16365i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2263t2
    public final W1 f() {
        w(this.f16366j);
        return this.f16366j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.f16355F.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, int i8, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i8 != 200 && i8 != 204) {
            if (i8 == 304) {
                i8 = 304;
            }
            d().w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
        }
        if (th == null) {
            F().f16163s.a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble(CampaignEx.JSON_KEY_TIMESTAMP, 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        d().q().a("Deferred Deep Link is empty.");
                        return;
                    }
                    y4 N8 = N();
                    Y1 y12 = N8.f16777a;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = N8.f16777a.f16357a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f16372p.u("auto", "_cmp", bundle);
                        y4 N9 = N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N9.f16777a.f16357a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong(CampaignEx.JSON_KEY_TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N9.f16777a.f16357a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e8) {
                                N9.f16777a.d().r().b("Failed to persist Deferred Deep Link. exception", e8);
                                return;
                            }
                        }
                        return;
                    }
                    d().w().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e9) {
                    d().r().b("Failed to parse the Deferred Deep Link response. exception", e9);
                    return;
                }
            }
            d().q().a("Deferred Deep Link response empty.");
            return;
        }
        d().w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.f16354E++;
    }

    public final void j() {
        f().h();
        w(J());
        String s8 = B().s();
        Pair p8 = F().p(s8);
        if (this.f16363g.A() && !((Boolean) p8.second).booleanValue() && !TextUtils.isEmpty((CharSequence) p8.first)) {
            C2165b3 J8 = J();
            J8.k();
            ConnectivityManager connectivityManager = (ConnectivityManager) J8.f16777a.f16357a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                y4 N8 = N();
                B().f16777a.f16363g.q();
                URL s9 = N8.s(79000L, s8, (String) p8.first, (-1) + F().f16164t.a());
                if (s9 != null) {
                    C2165b3 J9 = J();
                    m0.m mVar = new m0.m(this);
                    J9.h();
                    J9.k();
                    AbstractC1319p.l(s9);
                    AbstractC1319p.l(mVar);
                    J9.f16777a.f().y(new RunnableC2159a3(J9, s8, s9, null, null, mVar));
                    return;
                }
                return;
            }
            d().w().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        d().q().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z8) {
        this.f16350A = Boolean.valueOf(z8);
    }

    public final void l(boolean z8) {
        f().h();
        this.f16353D = z8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0096, code lost:
    
        if (r8.l() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.google.android.gms.internal.measurement.C2077q0 r8) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Y1.m(com.google.android.gms.internal.measurement.q0):void");
    }

    public final boolean n() {
        if (this.f16350A != null && this.f16350A.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (x() == 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        f().h();
        return this.f16353D;
    }

    public final boolean q() {
        return TextUtils.isEmpty(this.f16358b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r() {
        boolean z8;
        if (this.f16380x) {
            f().h();
            Boolean bool = this.f16381y;
            if (bool == null || this.f16382z == 0 || (!bool.booleanValue() && Math.abs(this.f16370n.elapsedRealtime() - this.f16382z) > 1000)) {
                this.f16382z = this.f16370n.elapsedRealtime();
                boolean z9 = true;
                if (N().T("android.permission.INTERNET") && N().T("android.permission.ACCESS_NETWORK_STATE") && (Y.e.a(this.f16357a).f() || this.f16363g.G() || (y4.a0(this.f16357a) && y4.b0(this.f16357a, false)))) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Boolean valueOf = Boolean.valueOf(z8);
                this.f16381y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!N().M(B().t(), B().r()) && TextUtils.isEmpty(B().r())) {
                        z9 = false;
                    }
                    this.f16381y = Boolean.valueOf(z9);
                }
            }
            return this.f16381y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean s() {
        return this.f16361e;
    }

    public final int x() {
        f().h();
        if (this.f16363g.E()) {
            return 1;
        }
        Boolean bool = this.f16352C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        f().h();
        if (!this.f16353D) {
            return 8;
        }
        Boolean r8 = F().r();
        if (r8 != null) {
            if (r8.booleanValue()) {
                return 0;
            }
            return 3;
        }
        C2197h c2197h = this.f16363g;
        C2167c c2167c = c2197h.f16777a.f16362f;
        Boolean t8 = c2197h.t("firebase_analytics_collection_enabled");
        if (t8 != null) {
            if (t8.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.f16351B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.f16350A == null || this.f16350A.booleanValue()) {
            return 0;
        }
        return 7;
    }

    public final D0 y() {
        D0 d02 = this.f16373q;
        if (d02 != null) {
            return d02;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C2197h z() {
        return this.f16363g;
    }
}
