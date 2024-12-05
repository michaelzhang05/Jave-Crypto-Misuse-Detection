package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2452u4 extends C1 {

    /* renamed from: c, reason: collision with root package name */
    private volatile C2459v4 f17845c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C2459v4 f17846d;

    /* renamed from: e, reason: collision with root package name */
    protected C2459v4 f17847e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f17848f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f17849g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f17850h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C2459v4 f17851i;

    /* renamed from: j, reason: collision with root package name */
    private C2459v4 f17852j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17853k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f17854l;

    public C2452u4(R2 r22) {
        super(r22);
        this.f17854l = new Object();
        this.f17848f = new ConcurrentHashMap();
    }

    private final String D(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        if (split.length > 0) {
            str2 = split[split.length - 1];
        } else {
            str2 = "";
        }
        if (str2.length() > a().o(null, false)) {
            return str2.substring(0, a().o(null, false));
        }
        return str2;
    }

    private final void G(Activity activity, C2459v4 c2459v4, boolean z8) {
        C2459v4 c2459v42;
        C2459v4 c2459v43;
        String str;
        if (this.f17845c == null) {
            c2459v42 = this.f17846d;
        } else {
            c2459v42 = this.f17845c;
        }
        C2459v4 c2459v44 = c2459v42;
        if (c2459v4.f17865b == null) {
            if (activity != null) {
                str = D(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            c2459v43 = new C2459v4(c2459v4.f17864a, str, c2459v4.f17866c, c2459v4.f17868e, c2459v4.f17869f);
        } else {
            c2459v43 = c2459v4;
        }
        this.f17846d = this.f17845c;
        this.f17845c = c2459v43;
        e().D(new RunnableC2466w4(this, c2459v43, c2459v44, x().elapsedRealtime(), z8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J(C2452u4 c2452u4, Bundle bundle, C2459v4 c2459v4, C2459v4 c2459v42, long j8) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c2452u4.N(c2459v4, c2459v42, j8, true, c2452u4.h().F(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [long, android.os.BaseBundle] */
    public final void N(C2459v4 c2459v4, C2459v4 c2459v42, long j8, boolean z8, Bundle bundle) {
        boolean z9;
        Bundle bundle2;
        String str;
        long j9;
        k();
        boolean z10 = false;
        if (c2459v42 != null && c2459v42.f17866c == c2459v4.f17866c && Objects.equals(c2459v42.f17865b, c2459v4.f17865b) && Objects.equals(c2459v42.f17864a, c2459v4.f17864a)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z8 && this.f17847e != null) {
            z10 = true;
        }
        if (z9) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            a6.X(c2459v4, bundle2, true);
            if (c2459v42 != null) {
                String str2 = c2459v42.f17864a;
                if (str2 != null) {
                    "_pn".putString("_pn", str2);
                }
                String str3 = c2459v42.f17865b;
                if (str3 != null) {
                    "_pc".putString("_pc", str3);
                }
                ?? r8 = c2459v42.f17866c;
                r8.putLong("_pi", r8);
            }
            ?? r82 = 0;
            if (z10) {
                long a8 = r().f17765f.a(j8);
                if (a8 > 0) {
                    h().M(null, a8);
                }
            }
            if (!a().Z()) {
                r82.putLong("_mst", 1L);
            }
            if (c2459v4.f17868e) {
                str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            } else {
                str = "auto";
            }
            String str4 = str;
            long currentTimeMillis = x().currentTimeMillis();
            if (c2459v4.f17868e) {
                currentTimeMillis = c2459v4.f17869f;
                if (currentTimeMillis != 0) {
                    j9 = currentTimeMillis;
                    o().c0(str4, "_vs", j9, null);
                }
            }
            j9 = currentTimeMillis;
            o().c0(str4, "_vs", j9, null);
        }
        if (z10) {
            O(this.f17847e, true, j8);
        }
        this.f17847e = c2459v4;
        if (c2459v4.f17868e) {
            this.f17852j = c2459v4;
        }
        q().J(c2459v4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(C2459v4 c2459v4, boolean z8, long j8) {
        boolean z9;
        l().s(x().elapsedRealtime());
        if (c2459v4 != null && c2459v4.f17867d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (r().E(z9, z8, j8) && c2459v4 != null) {
            c2459v4.f17867d = false;
        }
    }

    private final C2459v4 T(Activity activity) {
        AbstractC1400p.l(activity);
        C2459v4 c2459v4 = (C2459v4) this.f17848f.get(activity);
        if (c2459v4 == null) {
            C2459v4 c2459v42 = new C2459v4(null, D(activity.getClass(), "Activity"), h().R0());
            this.f17848f.put(activity, c2459v42);
            c2459v4 = c2459v42;
        }
        if (this.f17851i != null) {
            return this.f17851i;
        }
        return c2459v4;
    }

    @Override // com.google.android.gms.measurement.internal.C1
    protected final boolean A() {
        return false;
    }

    public final C2459v4 C(boolean z8) {
        s();
        k();
        if (!z8) {
            return this.f17847e;
        }
        C2459v4 c2459v4 = this.f17847e;
        if (c2459v4 != null) {
            return c2459v4;
        }
        return this.f17852j;
    }

    public final void E(Activity activity) {
        synchronized (this.f17854l) {
            try {
                if (activity == this.f17849g) {
                    this.f17849g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!a().Z()) {
            return;
        }
        this.f17848f.remove(activity);
    }

    public final void F(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!a().Z() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f17848f.put(activity, new C2459v4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void H(Activity activity, String str, String str2) {
        String str3;
        if (!a().Z()) {
            c().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C2459v4 c2459v4 = this.f17845c;
        if (c2459v4 == null) {
            c().M().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f17848f.get(activity) == null) {
            c().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = D(activity.getClass(), "Activity");
        }
        boolean equals = Objects.equals(c2459v4.f17865b, str2);
        boolean equals2 = Objects.equals(c2459v4.f17864a, str);
        if (equals && equals2) {
            c().M().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > a().o(null, false))) {
            c().M().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > a().o(null, false))) {
            c().M().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        C2381k2 K8 = c().K();
        if (str == null) {
            str3 = "null";
        } else {
            str3 = str;
        }
        K8.c("Setting current screen to name, class", str3, str2);
        C2459v4 c2459v42 = new C2459v4(str, str2, h().R0());
        this.f17848f.put(activity, c2459v42);
        G(activity, c2459v42, true);
    }

    public final void I(Bundle bundle, long j8) {
        String str;
        String str2;
        String str3;
        C2459v4 c2459v4;
        synchronized (this.f17854l) {
            try {
                if (!this.f17853k) {
                    c().M().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String str4 = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > a().o(null, false))) {
                        c().M().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > a().o(null, false))) {
                        c().M().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        str4 = string2;
                    }
                } else {
                    str = null;
                }
                if (str4 == null) {
                    Activity activity = this.f17849g;
                    if (activity != null) {
                        str4 = D(activity.getClass(), "Activity");
                    } else {
                        str4 = "Activity";
                    }
                }
                String str5 = str4;
                C2459v4 c2459v42 = this.f17845c;
                if (this.f17850h && c2459v42 != null) {
                    this.f17850h = false;
                    boolean equals = Objects.equals(c2459v42.f17865b, str5);
                    boolean equals2 = Objects.equals(c2459v42.f17864a, str);
                    if (equals && equals2) {
                        c().M().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C2381k2 K8 = c().K();
                if (str == null) {
                    str2 = "null";
                } else {
                    str2 = str;
                }
                if (str5 == null) {
                    str3 = "null";
                } else {
                    str3 = str5;
                }
                K8.c("Logging screen view with name, class", str2, str3);
                if (this.f17845c == null) {
                    c2459v4 = this.f17846d;
                } else {
                    c2459v4 = this.f17845c;
                }
                C2459v4 c2459v43 = c2459v4;
                C2459v4 c2459v44 = new C2459v4(str, str5, h().R0(), true, j8);
                this.f17845c = c2459v44;
                this.f17846d = c2459v43;
                this.f17851i = c2459v44;
                e().D(new RunnableC2473x4(this, bundle, c2459v44, c2459v43, x().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C2459v4 P() {
        return this.f17845c;
    }

    public final void Q(Activity activity) {
        synchronized (this.f17854l) {
            this.f17853k = false;
            this.f17850h = true;
        }
        long elapsedRealtime = x().elapsedRealtime();
        if (!a().Z()) {
            this.f17845c = null;
            e().D(new RunnableC2480y4(this, elapsedRealtime));
        } else {
            C2459v4 T8 = T(activity);
            this.f17846d = this.f17845c;
            this.f17845c = null;
            e().D(new B4(this, T8, elapsedRealtime));
        }
    }

    public final void R(Activity activity, Bundle bundle) {
        C2459v4 c2459v4;
        if (!a().Z() || bundle == null || (c2459v4 = (C2459v4) this.f17848f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2459v4.f17866c);
        bundle2.putString("name", c2459v4.f17864a);
        bundle2.putString("referrer_name", c2459v4.f17865b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void S(Activity activity) {
        synchronized (this.f17854l) {
            this.f17853k = true;
            if (activity != this.f17849g) {
                synchronized (this.f17854l) {
                    this.f17849g = activity;
                    this.f17850h = false;
                }
                if (a().Z()) {
                    this.f17851i = null;
                    e().D(new A4(this));
                }
            }
        }
        if (!a().Z()) {
            this.f17845c = this.f17851i;
            e().D(new RunnableC2487z4(this));
        } else {
            G(activity, T(activity), false);
            C2308a l8 = l();
            l8.e().D(new RunnableC2317b1(l8, l8.x().elapsedRealtime()));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2, com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2, com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2, com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2308a l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2332d2 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2353g2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ A3 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2452u4 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ D4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2419p5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2329d y() {
        return super.y();
    }
}
