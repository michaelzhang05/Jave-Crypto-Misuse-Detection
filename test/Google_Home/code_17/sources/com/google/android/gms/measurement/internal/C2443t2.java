package com.google.android.gms.measurement.internal;

import G.a;
import Q.AbstractC1400p;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.C2472x3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2443t2 extends AbstractC2444t3 {

    /* renamed from: B, reason: collision with root package name */
    static final Pair f17811B = new Pair("", 0L);

    /* renamed from: A, reason: collision with root package name */
    public final C2457v2 f17812A;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f17813c;

    /* renamed from: d, reason: collision with root package name */
    private Object f17814d;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f17815e;

    /* renamed from: f, reason: collision with root package name */
    public C2471x2 f17816f;

    /* renamed from: g, reason: collision with root package name */
    public final C2478y2 f17817g;

    /* renamed from: h, reason: collision with root package name */
    public final C2478y2 f17818h;

    /* renamed from: i, reason: collision with root package name */
    public final A2 f17819i;

    /* renamed from: j, reason: collision with root package name */
    private String f17820j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17821k;

    /* renamed from: l, reason: collision with root package name */
    private long f17822l;

    /* renamed from: m, reason: collision with root package name */
    public final C2478y2 f17823m;

    /* renamed from: n, reason: collision with root package name */
    public final C2464w2 f17824n;

    /* renamed from: o, reason: collision with root package name */
    public final A2 f17825o;

    /* renamed from: p, reason: collision with root package name */
    public final C2457v2 f17826p;

    /* renamed from: q, reason: collision with root package name */
    public final C2464w2 f17827q;

    /* renamed from: r, reason: collision with root package name */
    public final C2478y2 f17828r;

    /* renamed from: s, reason: collision with root package name */
    public final C2478y2 f17829s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17830t;

    /* renamed from: u, reason: collision with root package name */
    public C2464w2 f17831u;

    /* renamed from: v, reason: collision with root package name */
    public C2464w2 f17832v;

    /* renamed from: w, reason: collision with root package name */
    public C2478y2 f17833w;

    /* renamed from: x, reason: collision with root package name */
    public final A2 f17834x;

    /* renamed from: y, reason: collision with root package name */
    public final A2 f17835y;

    /* renamed from: z, reason: collision with root package name */
    public final C2478y2 f17836z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2443t2(R2 r22) {
        super(r22);
        this.f17814d = new Object();
        this.f17823m = new C2478y2(this, "session_timeout", 1800000L);
        this.f17824n = new C2464w2(this, "start_new_session", true);
        this.f17828r = new C2478y2(this, "last_pause_time", 0L);
        this.f17829s = new C2478y2(this, "session_id", 0L);
        this.f17825o = new A2(this, "non_personalized_ads", null);
        this.f17826p = new C2457v2(this, "last_received_uri_timestamps_by_source", null);
        this.f17827q = new C2464w2(this, "allow_remote_dynamite", false);
        this.f17817g = new C2478y2(this, "first_open_time", 0L);
        this.f17818h = new C2478y2(this, "app_install_time", 0L);
        this.f17819i = new A2(this, "app_instance_id", null);
        this.f17831u = new C2464w2(this, "app_backgrounded", false);
        this.f17832v = new C2464w2(this, "deep_link_retrieval_complete", false);
        this.f17833w = new C2478y2(this, "deep_link_retrieval_attempts", 0L);
        this.f17834x = new A2(this, "firebase_feature_rollouts", null);
        this.f17835y = new A2(this, "deferred_attribution_cache", null);
        this.f17836z = new C2478y2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f17812A = new C2457v2(this, "default_event_parameters", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A(C2475y c2475y) {
        k();
        if (C2472x3.l(c2475y.a(), L().a())) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("dma_consent_settings", c2475y.j());
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B(C2472x3 c2472x3) {
        k();
        int b8 = c2472x3.b();
        if (v(b8)) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("consent_settings", c2472x3.z());
            edit.putInt("consent_source", b8);
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean C(C2467w5 c2467w5) {
        k();
        String string = J().getString("stored_tcf_param", "");
        String g8 = c2467w5.g();
        if (!g8.equals(string)) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("stored_tcf_param", g8);
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean D() {
        SharedPreferences sharedPreferences = this.f17813c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(Boolean bool) {
        k();
        SharedPreferences.Editor edit = J().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(String str) {
        k();
        SharedPreferences.Editor edit = J().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(boolean z8) {
        k();
        c().K().b("App measurement setting deferred collection", Boolean.valueOf(z8));
        SharedPreferences.Editor edit = J().edit();
        edit.putBoolean("deferred_analytics_collection", z8);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences H() {
        k();
        m();
        if (this.f17815e == null) {
            synchronized (this.f17814d) {
                try {
                    if (this.f17815e == null) {
                        String str = w().getPackageName() + "_preferences";
                        c().K().b("Default prefs file", str);
                        this.f17815e = w().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f17815e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(String str) {
        k();
        SharedPreferences.Editor edit = J().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences J() {
        k();
        m();
        AbstractC1400p.l(this.f17813c);
        return this.f17813c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SparseArray K() {
        Bundle a8 = this.f17826p.a();
        if (a8 == null) {
            return new SparseArray();
        }
        int[] intArray = a8.getIntArray("uriSources");
        long[] longArray = a8.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                c().G().a("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < intArray.length; i8++) {
                sparseArray.put(intArray[i8], Long.valueOf(longArray[i8]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2475y L() {
        k();
        return C2475y.c(J().getString("dma_consent_settings", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2472x3 M() {
        k();
        return C2472x3.e(J().getString("consent_settings", "G1"), J().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean N() {
        k();
        if (!J().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(J().getBoolean("use_service", false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean O() {
        k();
        if (J().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(J().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean P() {
        k();
        if (J().contains("measurement_enabled")) {
            return Boolean.valueOf(J().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String Q() {
        k();
        String string = J().getString("previous_os_version", null);
        b().m();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String R() {
        k();
        return J().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String S() {
        k();
        return J().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T() {
        k();
        Boolean P8 = P();
        SharedPreferences.Editor edit = J().edit();
        edit.clear();
        edit.apply();
        if (P8 != null) {
            t(P8);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2444t3
    protected final void l() {
        SharedPreferences sharedPreferences = w().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f17813c = sharedPreferences;
        boolean z8 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f17830t = z8;
        if (!z8) {
            SharedPreferences.Editor edit = this.f17813c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f17816f = new C2471x2(this, "health_monitor", Math.max(0L, ((Long) H.f17112d.a(null)).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2444t3
    protected final boolean q() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair r(String str) {
        k();
        if (!M().m(C2472x3.a.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long elapsedRealtime = x().elapsedRealtime();
        if (this.f17820j != null && elapsedRealtime < this.f17822l) {
            return new Pair(this.f17820j, Boolean.valueOf(this.f17821k));
        }
        this.f17822l = elapsedRealtime + a().E(str);
        G.a.b(true);
        try {
            a.C0050a a8 = G.a.a(w());
            this.f17820j = "";
            String a9 = a8.a();
            if (a9 != null) {
                this.f17820j = a9;
            }
            this.f17821k = a8.b();
        } catch (Exception e8) {
            c().F().b("Unable to get advertising id", e8);
            this.f17820j = "";
        }
        G.a.b(false);
        return new Pair(this.f17820j, Boolean.valueOf(this.f17821k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(SparseArray sparseArray) {
        if (sparseArray == null) {
            this.f17826p.b(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            iArr[i8] = sparseArray.keyAt(i8);
            jArr[i8] = ((Long) sparseArray.valueAt(i8)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f17826p.b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(Boolean bool) {
        k();
        SharedPreferences.Editor edit = J().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(boolean z8) {
        k();
        SharedPreferences.Editor edit = J().edit();
        edit.putBoolean("use_service", z8);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v(int i8) {
        return C2472x3.l(i8, J().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z(long j8) {
        if (j8 - this.f17823m.a() > this.f17828r.a()) {
            return true;
        }
        return false;
    }
}
