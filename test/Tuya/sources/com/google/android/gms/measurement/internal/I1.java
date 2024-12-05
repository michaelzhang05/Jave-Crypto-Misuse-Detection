package com.google.android.gms.measurement.internal;

import G.a;
import R.AbstractC1319p;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.internal.measurement.Z5;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I1 extends AbstractC2258s2 {

    /* renamed from: y, reason: collision with root package name */
    static final Pair f16146y = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f16147c;

    /* renamed from: d, reason: collision with root package name */
    public G1 f16148d;

    /* renamed from: e, reason: collision with root package name */
    public final F1 f16149e;

    /* renamed from: f, reason: collision with root package name */
    public final F1 f16150f;

    /* renamed from: g, reason: collision with root package name */
    public final H1 f16151g;

    /* renamed from: h, reason: collision with root package name */
    private String f16152h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16153i;

    /* renamed from: j, reason: collision with root package name */
    private long f16154j;

    /* renamed from: k, reason: collision with root package name */
    public final F1 f16155k;

    /* renamed from: l, reason: collision with root package name */
    public final D1 f16156l;

    /* renamed from: m, reason: collision with root package name */
    public final H1 f16157m;

    /* renamed from: n, reason: collision with root package name */
    public final D1 f16158n;

    /* renamed from: o, reason: collision with root package name */
    public final F1 f16159o;

    /* renamed from: p, reason: collision with root package name */
    public final F1 f16160p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16161q;

    /* renamed from: r, reason: collision with root package name */
    public final D1 f16162r;

    /* renamed from: s, reason: collision with root package name */
    public final D1 f16163s;

    /* renamed from: t, reason: collision with root package name */
    public final F1 f16164t;

    /* renamed from: u, reason: collision with root package name */
    public final H1 f16165u;

    /* renamed from: v, reason: collision with root package name */
    public final H1 f16166v;

    /* renamed from: w, reason: collision with root package name */
    public final F1 f16167w;

    /* renamed from: x, reason: collision with root package name */
    public final E1 f16168x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I1(Y1 y12) {
        super(y12);
        this.f16155k = new F1(this, "session_timeout", 1800000L);
        this.f16156l = new D1(this, "start_new_session", true);
        this.f16159o = new F1(this, "last_pause_time", 0L);
        this.f16160p = new F1(this, "session_id", 0L);
        this.f16157m = new H1(this, "non_personalized_ads", null);
        this.f16158n = new D1(this, "allow_remote_dynamite", false);
        this.f16149e = new F1(this, "first_open_time", 0L);
        this.f16150f = new F1(this, "app_install_time", 0L);
        this.f16151g = new H1(this, "app_instance_id", null);
        this.f16162r = new D1(this, "app_backgrounded", false);
        this.f16163s = new D1(this, "deep_link_retrieval_complete", false);
        this.f16164t = new F1(this, "deep_link_retrieval_attempts", 0L);
        this.f16165u = new H1(this, "firebase_feature_rollouts", null);
        this.f16166v = new H1(this, "deferred_attribution_cache", null);
        this.f16167w = new F1(this, "deferred_attribution_cache_timestamp", 0L);
        this.f16168x = new E1(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final void i() {
        SharedPreferences sharedPreferences = this.f16777a.c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f16147c = sharedPreferences;
        boolean z8 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f16161q = z8;
        if (!z8) {
            SharedPreferences.Editor edit = this.f16147c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f16777a.z();
        this.f16148d = new G1(this, "health_monitor", Math.max(0L, ((Long) AbstractC2217k1.f16590e.a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences o() {
        h();
        k();
        AbstractC1319p.l(this.f16147c);
        return this.f16147c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair p(String str) {
        h();
        Z5.c();
        if (this.f16777a.z().B(null, AbstractC2217k1.f16566K0) && !q().j(m0.o.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long elapsedRealtime = this.f16777a.a().elapsedRealtime();
        String str2 = this.f16152h;
        if (str2 != null && elapsedRealtime < this.f16154j) {
            return new Pair(str2, Boolean.valueOf(this.f16153i));
        }
        this.f16154j = elapsedRealtime + this.f16777a.z().r(str, AbstractC2217k1.f16586c);
        G.a.b(true);
        try {
            a.C0045a a8 = G.a.a(this.f16777a.c());
            this.f16152h = "";
            String a9 = a8.a();
            if (a9 != null) {
                this.f16152h = a9;
            }
            this.f16153i = a8.b();
        } catch (Exception e8) {
            this.f16777a.d().q().b("Unable to get advertising id", e8);
            this.f16152h = "";
        }
        G.a.b(false);
        return new Pair(this.f16152h, Boolean.valueOf(this.f16153i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m0.p q() {
        h();
        return m0.p.c(o().getString("consent_settings", "G1"), o().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean r() {
        h();
        if (o().contains("measurement_enabled")) {
            return Boolean.valueOf(o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(Boolean bool) {
        h();
        SharedPreferences.Editor edit = o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(boolean z8) {
        h();
        this.f16777a.d().v().b("App measurement setting deferred collection", Boolean.valueOf(z8));
        SharedPreferences.Editor edit = o().edit();
        edit.putBoolean("deferred_analytics_collection", z8);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u() {
        SharedPreferences sharedPreferences = this.f16147c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v(long j8) {
        if (j8 - this.f16155k.a() > this.f16159o.a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(int i8) {
        return m0.p.k(i8, o().getInt("consent_source", 100));
    }
}
