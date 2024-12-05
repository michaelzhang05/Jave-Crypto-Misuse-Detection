package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.K7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l0.C3266a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class R2 implements InterfaceC2465w3 {

    /* renamed from: I, reason: collision with root package name */
    private static volatile R2 f17297I;

    /* renamed from: A, reason: collision with root package name */
    private volatile Boolean f17298A;

    /* renamed from: B, reason: collision with root package name */
    private Boolean f17299B;

    /* renamed from: C, reason: collision with root package name */
    private Boolean f17300C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f17301D;

    /* renamed from: E, reason: collision with root package name */
    private int f17302E;

    /* renamed from: F, reason: collision with root package name */
    private int f17303F;

    /* renamed from: H, reason: collision with root package name */
    final long f17305H;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17306a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17307b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17308c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17309d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17310e;

    /* renamed from: f, reason: collision with root package name */
    private final C2329d f17311f;

    /* renamed from: g, reason: collision with root package name */
    private final C2364i f17312g;

    /* renamed from: h, reason: collision with root package name */
    private final C2443t2 f17313h;

    /* renamed from: i, reason: collision with root package name */
    private final C2367i2 f17314i;

    /* renamed from: j, reason: collision with root package name */
    private final M2 f17315j;

    /* renamed from: k, reason: collision with root package name */
    private final C2419p5 f17316k;

    /* renamed from: l, reason: collision with root package name */
    private final a6 f17317l;

    /* renamed from: m, reason: collision with root package name */
    private final C2360h2 f17318m;

    /* renamed from: n, reason: collision with root package name */
    private final V.d f17319n;

    /* renamed from: o, reason: collision with root package name */
    private final C2452u4 f17320o;

    /* renamed from: p, reason: collision with root package name */
    private final A3 f17321p;

    /* renamed from: q, reason: collision with root package name */
    private final C2308a f17322q;

    /* renamed from: r, reason: collision with root package name */
    private final C2425q4 f17323r;

    /* renamed from: s, reason: collision with root package name */
    private final String f17324s;

    /* renamed from: t, reason: collision with root package name */
    private C2353g2 f17325t;

    /* renamed from: u, reason: collision with root package name */
    private D4 f17326u;

    /* renamed from: v, reason: collision with root package name */
    private B f17327v;

    /* renamed from: w, reason: collision with root package name */
    private C2332d2 f17328w;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f17330y;

    /* renamed from: z, reason: collision with root package name */
    private long f17331z;

    /* renamed from: x, reason: collision with root package name */
    private boolean f17329x = false;

    /* renamed from: G, reason: collision with root package name */
    private AtomicInteger f17304G = new AtomicInteger(0);

    private R2(C2486z3 c2486z3) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z8 = false;
        AbstractC1400p.l(c2486z3);
        C2329d c2329d = new C2329d(c2486z3.f17979a);
        this.f17311f = c2329d;
        Z1.f17431a = c2329d;
        Context context = c2486z3.f17979a;
        this.f17306a = context;
        this.f17307b = c2486z3.f17980b;
        this.f17308c = c2486z3.f17981c;
        this.f17309d = c2486z3.f17982d;
        this.f17310e = c2486z3.f17986h;
        this.f17298A = c2486z3.f17983e;
        this.f17324s = c2486z3.f17988j;
        this.f17301D = true;
        com.google.android.gms.internal.measurement.Z0 z02 = c2486z3.f17985g;
        if (z02 != null && (bundle = z02.f16523g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f17299B = (Boolean) obj;
            }
            Object obj2 = z02.f16523g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f17300C = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.R3.l(context);
        V.d b8 = V.g.b();
        this.f17319n = b8;
        Long l8 = c2486z3.f17987i;
        if (l8 != null) {
            currentTimeMillis = l8.longValue();
        } else {
            currentTimeMillis = b8.currentTimeMillis();
        }
        this.f17305H = currentTimeMillis;
        this.f17312g = new C2364i(this);
        C2443t2 c2443t2 = new C2443t2(this);
        c2443t2.n();
        this.f17313h = c2443t2;
        C2367i2 c2367i2 = new C2367i2(this);
        c2367i2.n();
        this.f17314i = c2367i2;
        a6 a6Var = new a6(this);
        a6Var.n();
        this.f17317l = a6Var;
        this.f17318m = new C2360h2(new B3(c2486z3, this));
        this.f17322q = new C2308a(this);
        C2452u4 c2452u4 = new C2452u4(this);
        c2452u4.t();
        this.f17320o = c2452u4;
        A3 a32 = new A3(this);
        a32.t();
        this.f17321p = a32;
        C2419p5 c2419p5 = new C2419p5(this);
        c2419p5.t();
        this.f17316k = c2419p5;
        C2425q4 c2425q4 = new C2425q4(this);
        c2425q4.n();
        this.f17323r = c2425q4;
        M2 m22 = new M2(this);
        m22.n();
        this.f17315j = m22;
        com.google.android.gms.internal.measurement.Z0 z03 = c2486z3.f17985g;
        if (z03 != null && z03.f16518b != 0) {
            z8 = true;
        }
        boolean z9 = !z8;
        if (context.getApplicationContext() instanceof Application) {
            H().V0(z9);
        } else {
            c().L().a("Application context is not an Application");
        }
        m22.D(new S2(this, c2486z3));
    }

    public static R2 a(Context context, com.google.android.gms.internal.measurement.Z0 z02, Long l8) {
        Bundle bundle;
        if (z02 != null && (z02.f16521e == null || z02.f16522f == null)) {
            z02 = new com.google.android.gms.internal.measurement.Z0(z02.f16517a, z02.f16518b, z02.f16519c, z02.f16520d, null, null, z02.f16523g, null);
        }
        AbstractC1400p.l(context);
        AbstractC1400p.l(context.getApplicationContext());
        if (f17297I == null) {
            synchronized (R2.class) {
                try {
                    if (f17297I == null) {
                        f17297I = new R2(new C2486z3(context, z02, l8));
                    }
                } finally {
                }
            }
        } else if (z02 != null && (bundle = z02.f16523g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC1400p.l(f17297I);
            f17297I.j(z02.f16523g.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC1400p.l(f17297I);
        return f17297I;
    }

    private static void d(C1 c12) {
        if (c12 != null) {
            if (c12.z()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: " + String.valueOf(c12.getClass()));
        }
        throw new IllegalStateException("Component not created");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f(R2 r22, C2486z3 c2486z3) {
        r22.e().k();
        B b8 = new B(r22);
        b8.n();
        r22.f17327v = b8;
        C2332d2 c2332d2 = new C2332d2(r22, c2486z3.f17984f);
        c2332d2.t();
        r22.f17328w = c2332d2;
        C2353g2 c2353g2 = new C2353g2(r22);
        c2353g2.t();
        r22.f17325t = c2353g2;
        D4 d42 = new D4(r22);
        d42.t();
        r22.f17326u = d42;
        r22.f17317l.o();
        r22.f17313h.o();
        r22.f17328w.u();
        r22.c().J().b("App measurement initialized, version", 102001L);
        r22.c().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String F8 = c2332d2.F();
        if (TextUtils.isEmpty(r22.f17307b)) {
            if (r22.L().E0(F8, r22.f17312g.X())) {
                r22.c().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                r22.c().J().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + F8);
            }
        }
        r22.c().F().a("Debug-level message logging enabled");
        if (r22.f17302E != r22.f17304G.get()) {
            r22.c().G().c("Not all components initialized", Integer.valueOf(r22.f17302E), Integer.valueOf(r22.f17304G.get()));
        }
        r22.f17329x = true;
    }

    private static void g(AbstractC2444t3 abstractC2444t3) {
        if (abstractC2444t3 != null) {
            if (abstractC2444t3.p()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC2444t3.getClass()));
        }
        throw new IllegalStateException("Component not created");
    }

    private static void h(AbstractC2451u3 abstractC2451u3) {
        if (abstractC2451u3 != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    private final C2425q4 s() {
        g(this.f17323r);
        return this.f17323r;
    }

    public final B A() {
        g(this.f17327v);
        return this.f17327v;
    }

    public final C2332d2 B() {
        d(this.f17328w);
        return this.f17328w;
    }

    public final C2353g2 C() {
        d(this.f17325t);
        return this.f17325t;
    }

    public final C2360h2 D() {
        return this.f17318m;
    }

    public final C2367i2 E() {
        C2367i2 c2367i2 = this.f17314i;
        if (c2367i2 != null && c2367i2.p()) {
            return this.f17314i;
        }
        return null;
    }

    public final C2443t2 F() {
        h(this.f17313h);
        return this.f17313h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final M2 G() {
        return this.f17315j;
    }

    public final A3 H() {
        d(this.f17321p);
        return this.f17321p;
    }

    public final C2452u4 I() {
        d(this.f17320o);
        return this.f17320o;
    }

    public final D4 J() {
        d(this.f17326u);
        return this.f17326u;
    }

    public final C2419p5 K() {
        d(this.f17316k);
        return this.f17316k;
    }

    public final a6 L() {
        h(this.f17317l);
        return this.f17317l;
    }

    public final String M() {
        return this.f17307b;
    }

    public final String N() {
        return this.f17308c;
    }

    public final String O() {
        return this.f17309d;
    }

    public final String P() {
        return this.f17324s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R() {
        this.f17304G.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00ec, code lost:
    
        if (r1.C() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0161, code lost:
    
        if (r1.C() != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.gms.internal.measurement.Z0 r13) {
        /*
            Method dump skipped, instructions count: 1305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.R2.b(com.google.android.gms.internal.measurement.Z0):void");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final C2367i2 c() {
        g(this.f17314i);
        return this.f17314i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final M2 e() {
        g(this.f17315j);
        return this.f17315j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void i(String str, int i8, Throwable th, byte[] bArr, Map map) {
        if ((i8 == 200 || i8 == 204 || i8 == 304) && th == null) {
            F().f17832v.a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(optString)) {
                        c().F().a("Deferred Deep Link is empty.");
                        return;
                    }
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    String optString4 = jSONObject.optString("gad_source", "");
                    double optDouble = jSONObject.optDouble(CampaignEx.JSON_KEY_TIMESTAMP, 0.0d);
                    Bundle bundle = new Bundle();
                    if (K7.a() && this.f17312g.q(H.f17090T0)) {
                        if (!L().M0(optString)) {
                            c().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                            return;
                        }
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle.putString("gbraid", optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle.putString("gad_source", optString4);
                        }
                    } else if (!L().M0(optString)) {
                        c().L().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                        return;
                    }
                    if (K7.a()) {
                        this.f17312g.q(H.f17090T0);
                    }
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.f17321p.b1("auto", "_cmp", bundle);
                    a6 L8 = L();
                    if (!TextUtils.isEmpty(optString) && L8.i0(optString, optDouble)) {
                        L8.w().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                        return;
                    }
                    return;
                } catch (JSONException e8) {
                    c().G().b("Failed to parse the Deferred Deep Link response. exception", e8);
                    return;
                }
            }
            c().F().a("Deferred Deep Link response empty.");
            return;
        }
        c().L().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z8) {
        this.f17298A = Boolean.valueOf(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.f17302E++;
    }

    public final boolean l() {
        if (this.f17298A != null && this.f17298A.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (u() == 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        e().k();
        return this.f17301D;
    }

    public final boolean o() {
        return TextUtils.isEmpty(this.f17307b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean p() {
        boolean z8;
        if (this.f17329x) {
            e().k();
            Boolean bool = this.f17330y;
            if (bool == null || this.f17331z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f17319n.elapsedRealtime() - this.f17331z) > 1000)) {
                this.f17331z = this.f17319n.elapsedRealtime();
                boolean z9 = true;
                if (L().F0("android.permission.INTERNET") && L().F0("android.permission.ACCESS_NETWORK_STATE") && (X.e.a(this.f17306a).f() || this.f17312g.r() || (a6.d0(this.f17306a) && a6.e0(this.f17306a, false)))) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Boolean valueOf = Boolean.valueOf(z8);
                this.f17330y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!L().k0(B().G(), B().E()) && TextUtils.isEmpty(B().E())) {
                        z9 = false;
                    }
                    this.f17330y = Boolean.valueOf(z9);
                }
            }
            return this.f17330y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean q() {
        return this.f17310e;
    }

    public final boolean r() {
        Bundle bundle;
        int i8;
        String str;
        e().k();
        g(s());
        String F8 = B().F();
        Pair r8 = F().r(F8);
        boolean z8 = false;
        if (this.f17312g.Y() && !((Boolean) r8.second).booleanValue() && !TextUtils.isEmpty((CharSequence) r8.first)) {
            if (!s().t()) {
                c().L().a("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder sb = new StringBuilder();
            D4 J8 = J();
            J8.k();
            J8.s();
            if (!J8.k0() || J8.h().I0() >= 234200) {
                C3266a q02 = H().q0();
                if (q02 != null) {
                    bundle = q02.f34199a;
                } else {
                    bundle = null;
                }
                int i9 = 1;
                if (bundle == null) {
                    int i10 = this.f17303F;
                    this.f17303F = i10 + 1;
                    if (i10 < 10) {
                        z8 = true;
                    }
                    C2381k2 F9 = c().F();
                    if (z8) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    F9.b("Failed to retrieve DMA consent from the service, " + str + " retryCount", Integer.valueOf(this.f17303F));
                    return z8;
                }
                C2472x3 c8 = C2472x3.c(bundle, 100);
                sb.append("&gcs=");
                sb.append(c8.y());
                C2475y b8 = C2475y.b(bundle, 100);
                sb.append("&dma=");
                if (b8.h() == Boolean.FALSE) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                sb.append(i8);
                if (!TextUtils.isEmpty(b8.i())) {
                    sb.append("&dma_cps=");
                    sb.append(b8.i());
                }
                if (C2475y.e(bundle) == Boolean.TRUE) {
                    i9 = 0;
                }
                sb.append("&npa=");
                sb.append(i9);
                c().K().b("Consent query parameters to Bow", sb);
            }
            a6 L8 = L();
            B();
            URL K8 = L8.K(102001L, F8, (String) r8.first, F().f17833w.a() - 1, sb.toString());
            if (K8 != null) {
                C2425q4 s8 = s();
                InterfaceC2418p4 interfaceC2418p4 = new InterfaceC2418p4() { // from class: com.google.android.gms.measurement.internal.T2
                    @Override // com.google.android.gms.measurement.internal.InterfaceC2418p4
                    public final void a(String str2, int i11, Throwable th, byte[] bArr, Map map) {
                        R2.this.i(str2, i11, th, bArr, map);
                    }
                };
                s8.k();
                s8.m();
                AbstractC1400p.l(K8);
                AbstractC1400p.l(interfaceC2418p4);
                s8.e().z(new RunnableC2438s4(s8, F8, K8, null, null, interfaceC2418p4));
            }
            return false;
        }
        c().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    public final void t(boolean z8) {
        e().k();
        this.f17301D = z8;
    }

    public final int u() {
        e().k();
        if (this.f17312g.a0()) {
            return 1;
        }
        Boolean bool = this.f17300C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!n()) {
            return 8;
        }
        Boolean P8 = F().P();
        if (P8 != null) {
            if (P8.booleanValue()) {
                return 0;
            }
            return 3;
        }
        Boolean G8 = this.f17312g.G("firebase_analytics_collection_enabled");
        if (G8 != null) {
            if (G8.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.f17299B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.f17298A == null || this.f17298A.booleanValue()) {
            return 0;
        }
        return 7;
    }

    public final C2308a v() {
        C2308a c2308a = this.f17322q;
        if (c2308a != null) {
            return c2308a;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final Context w() {
        return this.f17306a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final V.d x() {
        return this.f17319n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final C2329d y() {
        return this.f17311f;
    }

    public final C2364i z() {
        return this.f17312g;
    }
}
