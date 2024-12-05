package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.internal.measurement.C2164j8;
import com.google.android.gms.internal.measurement.S6;
import com.google.android.gms.internal.measurement.Z6;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.measurement.internal.A3;
import com.google.android.gms.measurement.internal.C2472x3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import l0.AbstractC3279n;
import l0.AbstractC3282q;
import l0.AbstractC3284s;
import l0.AbstractC3287v;
import l0.AbstractC3288w;
import l0.C3266a;
import l0.C3278m;
import l0.EnumC3280o;
import l0.InterfaceC3283r;
import l0.InterfaceC3285t;
import z0.AbstractC4216b;
import z0.InterfaceFutureC4218d;

/* loaded from: classes3.dex */
public final class A3 extends C1 {

    /* renamed from: c, reason: collision with root package name */
    private C2390l4 f16943c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3283r f16944d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f16945e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16946f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f16947g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f16948h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16949i;

    /* renamed from: j, reason: collision with root package name */
    private int f16950j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC2461w f16951k;

    /* renamed from: l, reason: collision with root package name */
    private PriorityQueue f16952l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16953m;

    /* renamed from: n, reason: collision with root package name */
    private C2472x3 f16954n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicLong f16955o;

    /* renamed from: p, reason: collision with root package name */
    private long f16956p;

    /* renamed from: q, reason: collision with root package name */
    final d6 f16957q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f16958r;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC2461w f16959s;

    /* renamed from: t, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f16960t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC2461w f16961u;

    /* renamed from: v, reason: collision with root package name */
    private final Z5 f16962v;

    /* JADX INFO: Access modifiers changed from: protected */
    public A3(R2 r22) {
        super(r22);
        this.f16945e = new CopyOnWriteArraySet();
        this.f16948h = new Object();
        this.f16949i = false;
        this.f16950j = 1;
        this.f16958r = true;
        this.f16962v = new C2334d4(this);
        this.f16947g = new AtomicReference();
        this.f16954n = C2472x3.f17896c;
        this.f16956p = -1L;
        this.f16955o = new AtomicLong(0L);
        this.f16957q = new d6(r22);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int C(A3 a32, Throwable th) {
        String message = th.getMessage();
        a32.f16953m = false;
        if (message != null) {
            if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    return 3;
                }
                return 2;
            }
            if (message.contains("Background")) {
                a32.f16953m = true;
            }
            return 1;
        }
        return 2;
    }

    public static int E(String str) {
        AbstractC1400p.f(str);
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0() {
        long j8;
        k();
        String a8 = f().f17825o.a();
        if (a8 != null) {
            if ("unset".equals(a8)) {
                i0(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", null, x().currentTimeMillis());
            } else {
                if ("true".equals(a8)) {
                    j8 = 1;
                } else {
                    j8 = 0;
                }
                i0(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", Long.valueOf(j8), x().currentTimeMillis());
            }
        }
        if (this.f17844a.m() && this.f16958r) {
            c().F().a("Recording app launch after enabling measurement for the first time (FE)");
            C0();
            r().f17764e.a();
            e().D(new Q3(this));
            return;
        }
        c().F().a("Updating Scion state (FE)");
        q().f0();
    }

    private final void N(Bundle bundle, int i8, long j8) {
        String str;
        s();
        String h8 = C2472x3.h(bundle);
        if (h8 != null) {
            c().M().b("Ignoring invalid consent setting", h8);
            c().M().a("Valid consent values are 'granted', 'denied'");
        }
        boolean J8 = e().J();
        C2472x3 c8 = C2472x3.c(bundle, i8);
        if (c8.C()) {
            S(c8, j8, J8);
        }
        C2475y b8 = C2475y.b(bundle, i8);
        if (b8.k()) {
            Q(b8, J8);
        }
        Boolean e8 = C2475y.e(bundle);
        if (e8 != null) {
            if (i8 == -30) {
                str = "tcf";
            } else {
                str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            }
            j0(str, "allow_personalized_ads", e8.toString(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void P0(A3 a32, int i8) {
        if (a32.f16951k == null) {
            a32.f16951k = new N3(a32, a32.f17844a);
        }
        a32.f16951k.b(i8 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Q0(A3 a32, Bundle bundle) {
        a32.k();
        a32.s();
        AbstractC1400p.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(TtmlNode.ATTR_TTS_ORIGIN);
        AbstractC1400p.f(string);
        AbstractC1400p.f(string2);
        AbstractC1400p.l(bundle.get("value"));
        if (!a32.f17844a.m()) {
            a32.c().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        V5 v52 = new V5(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            G H8 = a32.h().H(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            a32.q().H(new C2350g(bundle.getString(MBridgeConstans.APP_ID), string2, v52, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), a32.h().H(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), H8, bundle.getLong("time_to_live"), a32.h().H(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void S0(String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        e().D(new V3(this, str, str2, j8, a6.D(bundle), z8, z9, z10, str3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void U(A3 a32, Bundle bundle) {
        a32.k();
        a32.s();
        AbstractC1400p.l(bundle);
        String f8 = AbstractC1400p.f(bundle.getString("name"));
        if (!a32.f17844a.m()) {
            a32.c().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            a32.q().H(new C2350g(bundle.getString(MBridgeConstans.APP_ID), "", new V5(f8, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), a32.h().H(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void V(A3 a32, C2472x3 c2472x3, long j8, boolean z8, boolean z9) {
        a32.k();
        a32.s();
        C2472x3 M8 = a32.f().M();
        if (j8 <= a32.f16956p && C2472x3.l(M8.b(), c2472x3.b())) {
            a32.c().J().b("Dropped out-of-date consent setting, proposed settings", c2472x3);
            return;
        }
        if (a32.f().B(c2472x3)) {
            a32.c().K().b("Setting storage consent(FE)", c2472x3);
            a32.f16956p = j8;
            if (a32.q().j0()) {
                a32.q().p0(z8);
            } else {
                a32.q().U(z8);
            }
            if (z9) {
                a32.q().O(new AtomicReference());
                return;
            }
            return;
        }
        a32.c().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c2472x3.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void W(A3 a32, C2472x3 c2472x3, C2472x3 c2472x32) {
        if (!Z6.a() || !a32.a().q(H.f17111c1)) {
            C2472x3.a aVar = C2472x3.a.ANALYTICS_STORAGE;
            C2472x3.a aVar2 = C2472x3.a.AD_STORAGE;
            boolean n8 = c2472x3.n(c2472x32, aVar, aVar2);
            boolean s8 = c2472x3.s(c2472x32, aVar, aVar2);
            if (n8 || s8) {
                a32.m().I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(Boolean bool, boolean z8) {
        k();
        s();
        c().F().b("Setting app measurement enabled (FE)", bool);
        f().t(bool);
        if (z8) {
            f().E(bool);
        }
        if (this.f17844a.n() || (bool != null && !bool.booleanValue())) {
            K0();
        }
    }

    private final void e0(String str, String str2, long j8, Object obj) {
        e().D(new U3(this, str, str2, obj, j8));
    }

    private final Bundle g1(Bundle bundle) {
        Bundle a8 = f().f17812A.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                h();
                if (a6.h0(obj)) {
                    h();
                    a6.Y(this.f16962v, 27, null, null, 0);
                }
                c().M().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (a6.J0(str)) {
                c().M().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a8.remove(str);
            } else if (h().l0("param", str, a().o(null, false), obj)) {
                h().O(a8, str, obj);
            }
        }
        h();
        if (a6.g0(a8, a().K())) {
            h();
            a6.Y(this.f16962v, 26, null, null, 0);
            c().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        return a8;
    }

    @Override // com.google.android.gms.measurement.internal.C1
    protected final boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PriorityQueue A0() {
        if (this.f16952l == null) {
            AbstractC3288w.a();
            this.f16952l = AbstractC3287v.a(Comparator$CC.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.D3
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long valueOf;
                    valueOf = Long.valueOf(((C2481y5) obj).f17929b);
                    return valueOf;
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.C3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                    return compare;
                }
            }));
        }
        return this.f16952l;
    }

    public final void B0() {
        k();
        s();
        if (a().q(H.f17129i1)) {
            D4 q8 = q();
            q8.k();
            q8.s();
            if (!q8.k0() || q8.h().I0() >= 242600) {
                q().X();
            }
        }
    }

    public final void C0() {
        k();
        s();
        if (!this.f17844a.p()) {
            return;
        }
        Boolean G8 = a().G("google_analytics_deferred_deep_link_enabled");
        if (G8 != null && G8.booleanValue()) {
            c().F().a("Deferred Deep Link feature enabled.");
            e().D(new Runnable() { // from class: l0.x
                @Override // java.lang.Runnable
                public final void run() {
                    A3.this.F0();
                }
            });
        }
        q().Y();
        this.f16958r = false;
        String Q8 = f().Q();
        if (!TextUtils.isEmpty(Q8)) {
            b().m();
            if (!Q8.equals(Build.VERSION.RELEASE)) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", Q8);
                b1("auto", "_ou", bundle);
            }
        }
    }

    public final void D0() {
        if ((w().getApplicationContext() instanceof Application) && this.f16943c != null) {
            ((Application) w().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f16943c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E0() {
        if (C2164j8.a() && a().q(H.f17068I0)) {
            if (e().J()) {
                c().G().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C2329d.a()) {
                c().G().a("Cannot get trigger URIs from main thread");
                return;
            }
            s();
            c().K().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            e().s(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.F3
                @Override // java.lang.Runnable
                public final void run() {
                    A3.this.m0(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                c().G().a("Timed out waiting for get trigger URIs");
            } else {
                e().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.E3
                    @Override // java.lang.Runnable
                    public final void run() {
                        A3.this.l0(list);
                    }
                });
            }
        }
    }

    public final void F0() {
        k();
        if (f().f17832v.b()) {
            c().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a8 = f().f17833w.a();
        f().f17833w.b(1 + a8);
        if (a8 >= 5) {
            c().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            f().f17832v.a(true);
        } else {
            if (this.f16959s == null) {
                this.f16959s = new Y3(this, this.f17844a);
            }
            this.f16959s.b(0L);
        }
    }

    public final ArrayList G(String str, String str2) {
        if (e().J()) {
            c().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C2329d.a()) {
            c().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f17844a.e().s(atomicReference, 5000L, "get conditional user properties", new RunnableC2327c4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            c().G().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return a6.t0(list);
    }

    public final void G0() {
        k();
        c().F().a("Handle tcf update.");
        C2467w5 c8 = C2467w5.c(f().H());
        c().K().b("Tcf preferences read", c8);
        if (f().C(c8)) {
            Bundle b8 = c8.b();
            c().K().b("Consent generated from Tcf", b8);
            if (b8 != Bundle.EMPTY) {
                N(b8, -30, x().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c8.e());
            b1("auto", "_tcf", bundle);
        }
    }

    public final Map H(String str, String str2, boolean z8) {
        if (e().J()) {
            c().G().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C2329d.a()) {
            c().G().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f17844a.e().s(atomicReference, 5000L, "get user properties", new RunnableC2320b4(this, atomicReference, null, str, str2, z8));
        List<V5> list = (List) atomicReference.get();
        if (list == null) {
            c().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z8));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (V5 v52 : list) {
            Object p8 = v52.p();
            if (p8 != null) {
                arrayMap.put(v52.f17387b, p8);
            }
        }
        return arrayMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H0() {
        C2481y5 c2481y5;
        MeasurementManagerFutures S02;
        k();
        this.f16953m = false;
        if (A0().isEmpty() || this.f16949i || (c2481y5 = (C2481y5) A0().poll()) == null || (S02 = h().S0()) == null) {
            return;
        }
        this.f16949i = true;
        c().K().b("Registering trigger URI", c2481y5.f17928a);
        InterfaceFutureC4218d registerTriggerAsync = S02.registerTriggerAsync(Uri.parse(c2481y5.f17928a));
        if (registerTriggerAsync == null) {
            this.f16949i = false;
            A0().add(c2481y5);
            return;
        }
        if (!a().q(H.f17078N0)) {
            SparseArray K8 = f().K();
            K8.put(c2481y5.f17930c, Long.valueOf(c2481y5.f17929b));
            f().s(K8);
        }
        AbstractC4216b.a(registerTriggerAsync, new O3(this, c2481y5), new L3(this));
    }

    public final void I(long j8) {
        a1(null);
        e().D(new X3(this, j8));
    }

    public final void I0() {
        k();
        c().F().a("Register tcfPrefChangeListener.");
        if (this.f16960t == null) {
            this.f16961u = new S3(this, this.f17844a);
            this.f16960t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.K3
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    A3.this.L(sharedPreferences, str);
                }
            };
        }
        f().H().registerOnSharedPreferenceChangeListener(this.f16960t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(long j8, boolean z8) {
        k();
        s();
        c().F().a("Resetting analytics data (FE)");
        C2419p5 r8 = r();
        r8.k();
        r8.f17765f.b();
        m().I();
        boolean m8 = this.f17844a.m();
        C2443t2 f8 = f();
        f8.f17817g.b(j8);
        if (!TextUtils.isEmpty(f8.f().f17834x.a())) {
            f8.f17834x.b(null);
        }
        f8.f17828r.b(0L);
        f8.f17829s.b(0L);
        if (!f8.a().a0()) {
            f8.G(!m8);
        }
        f8.f17835y.b(null);
        f8.f17836z.b(0L);
        f8.f17812A.b(null);
        if (z8) {
            q().d0();
        }
        r().f17764e.a();
        this.f16958r = !m8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J0() {
        return this.f16953m;
    }

    public final void K(Intent intent) {
        if (u8.a() && a().q(H.f17167y0)) {
            Uri data = intent.getData();
            if (data == null) {
                c().J().a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter != null && queryParameter.equals("1")) {
                String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    c().J().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
                    a().N(queryParameter2);
                    return;
                }
                return;
            }
            c().J().a("Preview Mode was not enabled.");
            a().N(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void L(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            c().K().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC2461w) AbstractC1400p.l(this.f16961u)).b(500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void M(Bundle bundle) {
        Bundle g12;
        if (bundle.isEmpty()) {
            g12 = bundle;
        } else {
            g12 = g1(bundle);
        }
        f().f17812A.b(g12);
        if (!bundle.isEmpty() || a().q(H.f17135k1)) {
            q().C(g12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M0(long j8) {
        J(j8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void N0(Bundle bundle) {
        if (!bundle.isEmpty()) {
            bundle = g1(bundle);
        }
        f().f17812A.b(bundle);
        D4 q8 = q();
        q8.k();
        q8.s();
        if (!q8.k0() || q8.h().I0() >= 243100) {
            q().o0(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void O(Bundle bundle, long j8) {
        if (TextUtils.isEmpty(m().G())) {
            N(bundle, 0, j8);
        } else {
            c().M().a("Using developer consent only; google app id found");
        }
    }

    public final void O0(Bundle bundle, long j8) {
        AbstractC1400p.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(MBridgeConstans.APP_ID))) {
            c().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(MBridgeConstans.APP_ID);
        AbstractC1400p.l(bundle2);
        AbstractC3279n.a(bundle2, MBridgeConstans.APP_ID, String.class, null);
        AbstractC3279n.a(bundle2, TtmlNode.ATTR_TTS_ORIGIN, String.class, null);
        AbstractC3279n.a(bundle2, "name", String.class, null);
        AbstractC3279n.a(bundle2, "value", Object.class, null);
        AbstractC3279n.a(bundle2, "trigger_event_name", String.class, null);
        AbstractC3279n.a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC3279n.a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC3279n.a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC3279n.a(bundle2, "triggered_event_name", String.class, null);
        AbstractC3279n.a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC3279n.a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC3279n.a(bundle2, "expired_event_name", String.class, null);
        AbstractC3279n.a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC1400p.f(bundle2.getString("name"));
        AbstractC1400p.f(bundle2.getString(TtmlNode.ATTR_TTS_ORIGIN));
        AbstractC1400p.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j8);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (h().r0(string) != 0) {
            c().G().b("Invalid conditional user property name", d().g(string));
            return;
        }
        if (h().t(string, obj) != 0) {
            c().G().c("Invalid conditional user property value", d().g(string), obj);
            return;
        }
        Object A02 = h().A0(string, obj);
        if (A02 == null) {
            c().G().c("Unable to normalize conditional user property value", d().g(string), obj);
            return;
        }
        AbstractC3279n.b(bundle2, A02);
        long j9 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j9 > 15552000000L || j9 < 1)) {
            c().G().c("Invalid conditional user property timeout", d().g(string), Long.valueOf(j9));
            return;
        }
        long j10 = bundle2.getLong("time_to_live");
        if (j10 <= 15552000000L && j10 >= 1) {
            e().D(new RunnableC2313a4(this, bundle2));
        } else {
            c().G().c("Invalid conditional user property time to live", d().g(string), Long.valueOf(j10));
        }
    }

    public final void P(com.google.android.gms.internal.measurement.R0 r02) {
        e().D(new RunnableC2341e4(this, r02));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(C2475y c2475y, boolean z8) {
        RunnableC2383k4 runnableC2383k4 = new RunnableC2383k4(this, c2475y);
        if (z8) {
            k();
            runnableC2383k4.run();
        } else {
            e().D(runnableC2383k4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(C2472x3 c2472x3) {
        boolean z8;
        k();
        if ((c2472x3.B() && c2472x3.A()) || q().i0()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 != this.f17844a.n()) {
            this.f17844a.t(z8);
            Boolean O8 = f().O();
            if (!z8 || O8 == null || O8.booleanValue()) {
                a0(Boolean.valueOf(z8), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void R0(String str) {
        if (m().K(str)) {
            m().I();
        }
    }

    public final void S(C2472x3 c2472x3, long j8, boolean z8) {
        C2472x3 c2472x32;
        boolean z9;
        boolean z10;
        boolean z11;
        C2472x3 c2472x33 = c2472x3;
        s();
        int b8 = c2472x3.b();
        if (S6.a() && a().q(H.f17100Y0)) {
            if (b8 != -10) {
                EnumC3280o t8 = c2472x3.t();
                EnumC3280o enumC3280o = EnumC3280o.UNINITIALIZED;
                if (t8 == enumC3280o && c2472x3.v() == enumC3280o) {
                    c().M().a("Ignoring empty consent settings");
                    return;
                }
            }
        } else if (b8 != -10 && c2472x3.w() == null && c2472x3.x() == null) {
            c().M().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f16948h) {
            try {
                c2472x32 = this.f16954n;
                z9 = false;
                if (C2472x3.l(b8, c2472x32.b())) {
                    z10 = c2472x3.u(this.f16954n);
                    if (c2472x3.B() && !this.f16954n.B()) {
                        z9 = true;
                    }
                    c2472x33 = c2472x3.p(this.f16954n);
                    this.f16954n = c2472x33;
                    z11 = z9;
                    z9 = true;
                } else {
                    z10 = false;
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z9) {
            c().J().b("Ignoring lower-priority consent settings, proposed settings", c2472x33);
            return;
        }
        long andIncrement = this.f16955o.getAndIncrement();
        if (z10) {
            a1(null);
            RunnableC2376j4 runnableC2376j4 = new RunnableC2376j4(this, c2472x33, j8, andIncrement, z11, c2472x32);
            if (z8) {
                k();
                runnableC2376j4.run();
                return;
            } else {
                e().G(runnableC2376j4);
                return;
            }
        }
        RunnableC2397m4 runnableC2397m4 = new RunnableC2397m4(this, c2472x33, andIncrement, z11, c2472x32);
        if (z8) {
            k();
            runnableC2397m4.run();
        } else if (b8 != 30 && b8 != -10) {
            e().D(runnableC2397m4);
        } else {
            e().G(runnableC2397m4);
        }
    }

    public final void T0(String str, String str2, Bundle bundle) {
        h0(str, str2, bundle, true, true, x().currentTimeMillis());
    }

    public final void U0(InterfaceC3285t interfaceC3285t) {
        s();
        AbstractC1400p.l(interfaceC3285t);
        if (!this.f16945e.remove(interfaceC3285t)) {
            c().L().a("OnEventListener had not been registered");
        }
    }

    public final void V0(boolean z8) {
        if (w().getApplicationContext() instanceof Application) {
            Application application = (Application) w().getApplicationContext();
            if (this.f16943c == null) {
                this.f16943c = new C2390l4(this);
            }
            if (z8) {
                application.unregisterActivityLifecycleCallbacks(this.f16943c);
                application.registerActivityLifecycleCallbacks(this.f16943c);
                c().K().a("Registered activity lifecycle callback");
            }
        }
    }

    public final void W0(long j8) {
        e().D(new T3(this, j8));
    }

    public final void X0(Bundle bundle) {
        O0(bundle, x().currentTimeMillis());
    }

    public final void Y0(final Bundle bundle, final long j8) {
        e().G(new Runnable() { // from class: com.google.android.gms.measurement.internal.G3
            @Override // java.lang.Runnable
            public final void run() {
                A3.this.O(bundle, j8);
            }
        });
    }

    public final void Z(Boolean bool) {
        s();
        e().D(new RunnableC2362h4(this, bool));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a1(String str) {
        this.f16947g.set(str);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    public final void b0(final String str, long j8) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.f17844a.c().L().a("User ID must be non-empty or null");
        } else {
            e().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.J3
                @Override // java.lang.Runnable
                public final void run() {
                    A3.this.R0(str);
                }
            });
            k0(null, "_id", str, true, j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b1(String str, String str2, Bundle bundle) {
        k();
        c0(str, str2, x().currentTimeMillis(), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c0(String str, String str2, long j8, Bundle bundle) {
        boolean z8;
        k();
        if (this.f16944d != null && !a6.J0(str2)) {
            z8 = false;
        } else {
            z8 = true;
        }
        d0(str, str2, j8, bundle, true, z8, true, null);
    }

    public final void c1(boolean z8) {
        s();
        e().D(new R3(this, z8));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d0(String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        boolean b8;
        String str4;
        long j9;
        int i8;
        int length;
        Class<?> cls;
        AbstractC1400p.f(str);
        AbstractC1400p.l(bundle);
        k();
        s();
        if (!this.f17844a.m()) {
            c().F().a("Event not sent since app measurement is disabled");
            return;
        }
        List H8 = m().H();
        if (H8 != null && !H8.contains(str2)) {
            c().F().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f16946f) {
            this.f16946f = true;
            try {
                if (!this.f17844a.q()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, w().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, w());
                } catch (Exception e8) {
                    c().L().b("Failed to invoke Tag Manager's initialize() method", e8);
                }
            } catch (ClassNotFoundException unused) {
                c().J().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            i0("auto", "_lgclid", bundle.getString("gclid"), x().currentTimeMillis());
        }
        if (z8 && a6.N0(str2)) {
            h().N(bundle, f().f17812A.a());
        }
        if (!z10 && !"_iap".equals(str2)) {
            a6 L8 = this.f17844a.L();
            int i9 = 2;
            if (L8.C0(NotificationCompat.CATEGORY_EVENT, str2)) {
                if (!L8.p0(NotificationCompat.CATEGORY_EVENT, AbstractC3282q.f34215a, AbstractC3282q.f34216b, str2)) {
                    i9 = 13;
                } else if (L8.j0(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                    i9 = 0;
                }
            }
            if (i9 != 0) {
                c().H().b("Invalid public event name. Event will not be logged (FE)", d().c(str2));
                this.f17844a.L();
                String J8 = a6.J(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f17844a.L();
                a6.Y(this.f16962v, i9, "_ev", J8, length);
                return;
            }
        }
        C2459v4 C8 = p().C(false);
        if (C8 != null && !bundle.containsKey("_sc")) {
            C8.f17867d = true;
        }
        a6.X(C8, bundle, z8 && !z10);
        boolean equals = "am".equals(str);
        boolean J02 = a6.J0(str2);
        if (z8 && this.f16944d != null && !J02 && !equals) {
            c().F().c("Passing event to registered event handler (FE)", d().c(str2), d().a(bundle));
            AbstractC1400p.l(this.f16944d);
            this.f16944d.a(str, str2, bundle, j8);
            return;
        }
        if (this.f17844a.p()) {
            int s8 = h().s(str2);
            if (s8 != 0) {
                c().H().b("Invalid event name. Event will not be logged (FE)", d().c(str2));
                h();
                String J9 = a6.J(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f17844a.L();
                a6.Z(this.f16962v, str3, s8, "_ev", J9, length);
                return;
            }
            Bundle F8 = h().F(str3, str2, bundle, V.e.b("_o", "_sn", "_sc", "_si"), z10);
            AbstractC1400p.l(F8);
            if (p().C(false) != null && "_ae".equals(str2)) {
                C2460v5 c2460v5 = r().f17765f;
                long elapsedRealtime = c2460v5.f17873d.x().elapsedRealtime();
                long j10 = elapsedRealtime - c2460v5.f17871b;
                c2460v5.f17871b = elapsedRealtime;
                if (j10 > 0) {
                    h().M(F8, j10);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                a6 h8 = h();
                String string = F8.getString("_ffr");
                if (V.n.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, h8.f().f17834x.a())) {
                    h8.c().F().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                h8.f().f17834x.b(string);
            } else if ("_ae".equals(str2)) {
                String a8 = h().f().f17834x.a();
                if (!TextUtils.isEmpty(a8)) {
                    F8.putString("_ffr", a8);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(F8);
            if (a().q(H.f17080O0)) {
                b8 = r().F();
            } else {
                b8 = f().f17831u.b();
            }
            if (f().f17828r.a() <= 0 || !f().z(j8) || !b8) {
                str4 = "_ae";
                j9 = 0;
            } else {
                c().K().a("Current session is expired, remove the session number, ID, and engagement time");
                j9 = 0;
                str4 = "_ae";
                i0("auto", "_sid", null, x().currentTimeMillis());
                i0("auto", "_sno", null, x().currentTimeMillis());
                i0("auto", "_se", null, x().currentTimeMillis());
                f().f17829s.b(0L);
            }
            if (F8.getLong("extend_session", j9) == 1) {
                c().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i8 = 1;
                this.f17844a.K().f17764e.b(j8, true);
            } else {
                i8 = 1;
            }
            ArrayList arrayList2 = new ArrayList(F8.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10 += i8;
                String str5 = (String) obj;
                if (str5 != null) {
                    h();
                    Bundle[] x02 = a6.x0(F8.get(str5));
                    if (x02 != null) {
                        F8.putParcelableArray(str5, x02);
                    }
                }
                i8 = 1;
            }
            int i11 = 0;
            while (i11 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i11);
                String str6 = i11 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str);
                if (z9) {
                    bundle2 = h().E(bundle2, null);
                }
                Bundle bundle3 = bundle2;
                q().I(new G(str6, new C(bundle3), str, j8), str3);
                if (!equals) {
                    Iterator it = this.f16945e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3285t) it.next()).a(str, str2, new Bundle(bundle3), j8);
                    }
                }
                i11++;
            }
            if (p().C(false) == null || !str4.equals(str2)) {
                return;
            }
            r().E(true, true, x().elapsedRealtime());
        }
    }

    public final void d1(Bundle bundle) {
        final Bundle bundle2;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        e().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.H3
            @Override // java.lang.Runnable
            public final void run() {
                A3.this.M(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    public final void e1(Bundle bundle, long j8) {
        N(bundle, -20, j8);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    public final void f0(String str, String str2, Bundle bundle) {
        long currentTimeMillis = x().currentTimeMillis();
        AbstractC1400p.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        e().D(new Z3(this, bundle2));
    }

    public final void f1(Bundle bundle) {
        final Bundle bundle2;
        if (a().q(H.f17141m1)) {
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = new Bundle(bundle);
            }
            e().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.I3
                @Override // java.lang.Runnable
                public final void run() {
                    A3.this.N0(bundle2);
                }
            });
        }
    }

    public final void g0(String str, String str2, Bundle bundle, String str3) {
        j();
        S0(str, str2, x().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    public final void h0(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8) {
        String str3;
        Bundle bundle2;
        boolean z10;
        if (str == null) {
            str3 = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (Objects.equals(str2, "screen_view")) {
            p().I(bundle2, j8);
            return;
        }
        if (z9 && this.f16944d != null && !a6.J0(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        S0(str3, str2, j8, bundle2, z9, z10, z8, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2, com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i0(String str, String str2, Object obj, long j8) {
        long j9;
        AbstractC1400p.f(str);
        AbstractC1400p.f(str2);
        k();
        s();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    if ("false".equals(str3.toLowerCase(Locale.ENGLISH))) {
                        j9 = 1;
                    } else {
                        j9 = 0;
                    }
                    Long valueOf = Long.valueOf(j9);
                    A2 a22 = f().f17825o;
                    if (valueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    a22.b(str4);
                    obj = valueOf;
                    str2 = "_npa";
                    c().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                f().f17825o.b("unset");
                str2 = "_npa";
            }
            c().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str5 = str2;
        Object obj2 = obj;
        if (!this.f17844a.m()) {
            c().K().a("User property not set since app measurement is disabled");
        } else {
            if (!this.f17844a.p()) {
                return;
            }
            q().M(new V5(str5, j8, obj2, str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2, com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final void j0(String str, String str2, Object obj, boolean z8) {
        k0(str, str2, obj, z8, x().currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2, com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final void k0(String str, String str2, Object obj, boolean z8, long j8) {
        int i8;
        if (str == null) {
            str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        }
        String str3 = str;
        int i9 = 0;
        if (z8) {
            i8 = h().r0(str2);
        } else {
            a6 h8 = h();
            if (h8.C0("user property", str2)) {
                if (!h8.o0("user property", AbstractC3284s.f34219a, str2)) {
                    i8 = 15;
                } else if (h8.j0("user property", 24, str2)) {
                    i8 = 0;
                }
            }
            i8 = 6;
        }
        if (i8 != 0) {
            h();
            String J8 = a6.J(str2, 24, true);
            if (str2 != null) {
                i9 = str2.length();
            }
            this.f17844a.L();
            a6.Y(this.f16962v, i8, "_ev", J8, i9);
            return;
        }
        if (obj != null) {
            int t8 = h().t(str2, obj);
            if (t8 != 0) {
                h();
                String J9 = a6.J(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i9 = String.valueOf(obj).length();
                }
                this.f17844a.L();
                a6.Y(this.f16962v, t8, "_ev", J9, i9);
                return;
            }
            Object A02 = h().A0(str2, obj);
            if (A02 != null) {
                e0(str3, str2, j8, A02);
                return;
            }
            return;
        }
        e0(str3, str2, j8, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2308a l() {
        return super.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void l0(List list) {
        boolean contains;
        k();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray K8 = f().K();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2481y5 c2481y5 = (C2481y5) it.next();
                contains = K8.contains(c2481y5.f17930c);
                if (!contains || ((Long) K8.get(c2481y5.f17930c)).longValue() < c2481y5.f17929b) {
                    A0().add(c2481y5);
                }
            }
            H0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2332d2 m() {
        return super.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m0(AtomicReference atomicReference) {
        Bundle a8 = f().f17826p.a();
        D4 q8 = q();
        if (a8 == null) {
            a8 = new Bundle();
        }
        q8.P(atomicReference, a8);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2353g2 n() {
        return super.n();
    }

    public final void n0(InterfaceC3283r interfaceC3283r) {
        InterfaceC3283r interfaceC3283r2;
        boolean z8;
        k();
        s();
        if (interfaceC3283r != null && interfaceC3283r != (interfaceC3283r2 = this.f16944d)) {
            if (interfaceC3283r2 == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC1400p.p(z8, "EventInterceptor already set.");
        }
        this.f16944d = interfaceC3283r;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ A3 o() {
        return super.o();
    }

    public final void o0(InterfaceC3285t interfaceC3285t) {
        s();
        AbstractC1400p.l(interfaceC3285t);
        if (!this.f16945e.add(interfaceC3285t)) {
            c().L().a("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2452u4 p() {
        return super.p();
    }

    public final Application.ActivityLifecycleCallbacks p0() {
        return this.f16943c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ D4 q() {
        return super.q();
    }

    public final C3266a q0() {
        k();
        return q().V();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2419p5 r() {
        return super.r();
    }

    public final Boolean r0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) e().s(atomicReference, 15000L, "boolean test flag value", new M3(this, atomicReference));
    }

    public final Double s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) e().s(atomicReference, 15000L, "double test flag value", new RunnableC2369i4(this, atomicReference));
    }

    public final Integer t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) e().s(atomicReference, 15000L, "int test flag value", new RunnableC2348f4(this, atomicReference));
    }

    public final Long u0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) e().s(atomicReference, 15000L, "long test flag value", new RunnableC2355g4(this, atomicReference));
    }

    public final String v0() {
        return (String) this.f16947g.get();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    public final String w0() {
        C2459v4 P8 = this.f17844a.I().P();
        if (P8 != null) {
            return P8.f17865b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    public final String x0() {
        C2459v4 P8 = this.f17844a.I().P();
        if (P8 != null) {
            return P8.f17864a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2329d y() {
        return super.y();
    }

    public final String y0() {
        if (this.f17844a.M() != null) {
            return this.f17844a.M();
        }
        try {
            return new C3278m(w(), this.f17844a.P()).b("google_app_id");
        } catch (IllegalStateException e8) {
            this.f17844a.c().G().b("getGoogleAppId failed with exception", e8);
            return null;
        }
    }

    public final String z0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) e().s(atomicReference, 15000L, "String test flag value", new W3(this, atomicReference));
    }
}
