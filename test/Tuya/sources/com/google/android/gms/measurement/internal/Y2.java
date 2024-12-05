package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.C1949a7;
import com.google.android.gms.internal.measurement.C2051m6;
import com.google.android.gms.internal.measurement.W5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import m0.AbstractC3385B;

/* loaded from: classes3.dex */
public final class Y2 extends A1 {

    /* renamed from: c, reason: collision with root package name */
    protected X2 f16383c;

    /* renamed from: d, reason: collision with root package name */
    private m0.t f16384d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f16385e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16386f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f16387g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f16388h;

    /* renamed from: i, reason: collision with root package name */
    private m0.p f16389i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicLong f16390j;

    /* renamed from: k, reason: collision with root package name */
    private long f16391k;

    /* renamed from: l, reason: collision with root package name */
    final F4 f16392l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f16393m;

    /* renamed from: n, reason: collision with root package name */
    private final x4 f16394n;

    /* JADX INFO: Access modifiers changed from: protected */
    public Y2(Y1 y12) {
        super(y12);
        this.f16385e = new CopyOnWriteArraySet();
        this.f16388h = new Object();
        this.f16393m = true;
        this.f16394n = new M2(this);
        this.f16387g = new AtomicReference();
        this.f16389i = m0.p.f34880c;
        this.f16391k = -1L;
        this.f16390j = new AtomicLong(0L);
        this.f16392l = new F4(y12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Boolean bool, boolean z8) {
        h();
        i();
        this.f16777a.d().q().b("Setting app measurement enabled (FE)", bool);
        this.f16777a.F().s(bool);
        if (z8) {
            I1 F8 = this.f16777a.F();
            Y1 y12 = F8.f16777a;
            F8.h();
            SharedPreferences.Editor edit = F8.o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (!this.f16777a.p() && (bool == null || bool.booleanValue())) {
            return;
        }
        P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        long j8;
        h();
        String a8 = this.f16777a.F().f16157m.a();
        if (a8 != null) {
            if ("unset".equals(a8)) {
                M(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", null, this.f16777a.a().currentTimeMillis());
            } else {
                if (true != "true".equals(a8)) {
                    j8 = 0;
                } else {
                    j8 = 1;
                }
                M(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", Long.valueOf(j8), this.f16777a.a().currentTimeMillis());
            }
        }
        if (this.f16777a.o() && this.f16393m) {
            this.f16777a.d().q().a("Recording app launch after enabling measurement for the first time (FE)");
            f0();
            C2051m6.c();
            if (this.f16777a.z().B(null, AbstractC2217k1.f16597h0)) {
                this.f16777a.M().f16424e.a();
            }
            this.f16777a.f().z(new B2(this));
            return;
        }
        this.f16777a.d().q().a("Updating Scion state (FE)");
        this.f16777a.L().w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void b0(Y2 y22, m0.p pVar, m0.p pVar2) {
        boolean z8;
        m0.o[] oVarArr = {m0.o.ANALYTICS_STORAGE, m0.o.AD_STORAGE};
        int i8 = 0;
        while (true) {
            if (i8 < 2) {
                m0.o oVar = oVarArr[i8];
                if (!pVar2.j(oVar) && pVar.j(oVar)) {
                    z8 = true;
                    break;
                }
                i8++;
            } else {
                z8 = false;
                break;
            }
        }
        boolean n8 = pVar.n(pVar2, m0.o.ANALYTICS_STORAGE, m0.o.AD_STORAGE);
        if (!z8 && !n8) {
            return;
        }
        y22.f16777a.B().v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c0(Y2 y22, m0.p pVar, long j8, boolean z8, boolean z9) {
        y22.h();
        y22.i();
        m0.p q8 = y22.f16777a.F().q();
        if (j8 <= y22.f16391k && m0.p.k(q8.a(), pVar.a())) {
            y22.f16777a.d().u().b("Dropped out-of-date consent setting, proposed settings", pVar);
            return;
        }
        I1 F8 = y22.f16777a.F();
        Y1 y12 = F8.f16777a;
        F8.h();
        int a8 = pVar.a();
        if (F8.w(a8)) {
            SharedPreferences.Editor edit = F8.o().edit();
            edit.putString("consent_settings", pVar.i());
            edit.putInt("consent_source", a8);
            edit.apply();
            y22.f16391k = j8;
            y22.f16777a.L().t(z8);
            if (z9) {
                y22.f16777a.L().S(new AtomicReference());
                return;
            }
            return;
        }
        y22.f16777a.d().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(pVar.a()));
    }

    protected final void A(String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i8 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i8 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i8];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i8] = new Bundle((Bundle) parcelable);
                        }
                        i8++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i8 < list.size()) {
                        Object obj2 = list.get(i8);
                        if (obj2 instanceof Bundle) {
                            list.set(i8, new Bundle((Bundle) obj2));
                        }
                        i8++;
                    }
                }
            }
        }
        this.f16777a.f().z(new D2(this, str, str2, j8, bundle2, z8, z9, z10, str3));
    }

    final void B(String str, String str2, long j8, Object obj) {
        this.f16777a.f().z(new E2(this, str, str2, obj, j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(String str) {
        this.f16387g.set(str);
    }

    public final void D(Bundle bundle) {
        E(bundle, this.f16777a.a().currentTimeMillis());
    }

    public final void E(Bundle bundle, long j8) {
        AbstractC1319p.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(MBridgeConstans.APP_ID))) {
            this.f16777a.d().w().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(MBridgeConstans.APP_ID);
        AbstractC1319p.l(bundle2);
        m0.n.a(bundle2, MBridgeConstans.APP_ID, String.class, null);
        m0.n.a(bundle2, TtmlNode.ATTR_TTS_ORIGIN, String.class, null);
        m0.n.a(bundle2, "name", String.class, null);
        m0.n.a(bundle2, "value", Object.class, null);
        m0.n.a(bundle2, "trigger_event_name", String.class, null);
        m0.n.a(bundle2, "trigger_timeout", Long.class, 0L);
        m0.n.a(bundle2, "timed_out_event_name", String.class, null);
        m0.n.a(bundle2, "timed_out_event_params", Bundle.class, null);
        m0.n.a(bundle2, "triggered_event_name", String.class, null);
        m0.n.a(bundle2, "triggered_event_params", Bundle.class, null);
        m0.n.a(bundle2, "time_to_live", Long.class, 0L);
        m0.n.a(bundle2, "expired_event_name", String.class, null);
        m0.n.a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC1319p.f(bundle2.getString("name"));
        AbstractC1319p.f(bundle2.getString(TtmlNode.ATTR_TTS_ORIGIN));
        AbstractC1319p.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j8);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f16777a.N().p0(string) == 0) {
            if (this.f16777a.N().l0(string, obj) == 0) {
                Object p8 = this.f16777a.N().p(string, obj);
                if (p8 == null) {
                    this.f16777a.d().r().c("Unable to normalize conditional user property value", this.f16777a.D().f(string), obj);
                    return;
                }
                m0.n.b(bundle2, p8);
                long j9 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    this.f16777a.z();
                    if (j9 > 15552000000L || j9 < 1) {
                        this.f16777a.d().r().c("Invalid conditional user property timeout", this.f16777a.D().f(string), Long.valueOf(j9));
                        return;
                    }
                }
                long j10 = bundle2.getLong("time_to_live");
                this.f16777a.z();
                if (j10 <= 15552000000L && j10 >= 1) {
                    this.f16777a.f().z(new G2(this, bundle2));
                    return;
                } else {
                    this.f16777a.d().r().c("Invalid conditional user property time to live", this.f16777a.D().f(string), Long.valueOf(j10));
                    return;
                }
            }
            this.f16777a.d().r().c("Invalid conditional user property value", this.f16777a.D().f(string), obj);
            return;
        }
        this.f16777a.d().r().b("Invalid conditional user property name", this.f16777a.D().f(string));
    }

    public final void F(m0.p pVar, long j8) {
        m0.p pVar2;
        boolean z8;
        m0.p pVar3;
        boolean z9;
        boolean z10;
        i();
        int a8 = pVar.a();
        if (a8 != -10 && pVar.f() == null && pVar.g() == null) {
            this.f16777a.d().x().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f16388h) {
            try {
                pVar2 = this.f16389i;
                z8 = false;
                if (m0.p.k(a8, pVar2.a())) {
                    z10 = pVar.m(this.f16389i);
                    m0.o oVar = m0.o.ANALYTICS_STORAGE;
                    if (pVar.j(oVar) && !this.f16389i.j(oVar)) {
                        z8 = true;
                    }
                    m0.p e8 = pVar.e(this.f16389i);
                    this.f16389i = e8;
                    pVar3 = e8;
                    z9 = z8;
                    z8 = true;
                } else {
                    pVar3 = pVar;
                    z9 = false;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8) {
            this.f16777a.d().u().b("Ignoring lower-priority consent settings, proposed settings", pVar3);
            return;
        }
        long andIncrement = this.f16390j.getAndIncrement();
        if (z10) {
            this.f16387g.set(null);
            this.f16777a.f().A(new T2(this, pVar3, j8, andIncrement, z9, pVar2));
            return;
        }
        U2 u22 = new U2(this, pVar3, andIncrement, z9, pVar2);
        if (a8 != 30 && a8 != -10) {
            this.f16777a.f().z(u22);
        } else {
            this.f16777a.f().A(u22);
        }
    }

    public final void G(Bundle bundle, int i8, long j8) {
        i();
        String h8 = m0.p.h(bundle);
        if (h8 != null) {
            this.f16777a.d().x().b("Ignoring invalid consent setting", h8);
            this.f16777a.d().x().a("Valid consent values are 'granted', 'denied'");
        }
        F(m0.p.b(bundle, i8), j8);
    }

    public final void H(m0.t tVar) {
        m0.t tVar2;
        boolean z8;
        h();
        i();
        if (tVar != null && tVar != (tVar2 = this.f16384d)) {
            if (tVar2 == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC1319p.p(z8, "EventInterceptor already set.");
        }
        this.f16384d = tVar;
    }

    public final void I(Boolean bool) {
        i();
        this.f16777a.f().z(new S2(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(m0.p pVar) {
        boolean z8;
        Boolean bool;
        h();
        if ((pVar.j(m0.o.ANALYTICS_STORAGE) && pVar.j(m0.o.AD_STORAGE)) || this.f16777a.L().A()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 != this.f16777a.p()) {
            this.f16777a.l(z8);
            I1 F8 = this.f16777a.F();
            Y1 y12 = F8.f16777a;
            F8.h();
            if (F8.o().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(F8.o().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z8 || bool == null || bool.booleanValue()) {
                O(Boolean.valueOf(z8), false);
            }
        }
    }

    public final void K(String str, String str2, Object obj, boolean z8) {
        L("auto", "_ldl", obj, true, this.f16777a.a().currentTimeMillis());
    }

    public final void L(String str, String str2, Object obj, boolean z8, long j8) {
        int i8;
        String str3;
        int length;
        int i9;
        if (z8) {
            i8 = this.f16777a.N().p0(str2);
        } else {
            y4 N8 = this.f16777a.N();
            if (N8.S("user property", str2)) {
                if (!N8.P("user property", m0.s.f34891a, null, str2)) {
                    i8 = 15;
                } else {
                    N8.f16777a.z();
                    if (N8.N("user property", 24, str2)) {
                        i8 = 0;
                    }
                }
            }
            i8 = 6;
        }
        if (i8 != 0) {
            y4 N9 = this.f16777a.N();
            this.f16777a.z();
            String r8 = N9.r(str2, 24, true);
            if (str2 != null) {
                i9 = str2.length();
            } else {
                i9 = 0;
            }
            this.f16777a.N().C(this.f16394n, null, i8, "_ev", r8, i9);
            return;
        }
        if (str == null) {
            str3 = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        } else {
            str3 = str;
        }
        if (obj != null) {
            int l02 = this.f16777a.N().l0(str2, obj);
            if (l02 != 0) {
                y4 N10 = this.f16777a.N();
                this.f16777a.z();
                String r9 = N10.r(str2, 24, true);
                if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                    length = 0;
                } else {
                    length = obj.toString().length();
                }
                this.f16777a.N().C(this.f16394n, null, l02, "_ev", r9, length);
                return;
            }
            Object p8 = this.f16777a.N().p(str2, obj);
            if (p8 != null) {
                B(str3, str2, j8, p8);
                return;
            }
            return;
        }
        B(str3, str2, j8, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            R.AbstractC1319p.f(r9)
            R.AbstractC1319p.f(r10)
            r8.h()
            r8.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L62
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "false"
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.Y1 r5 = r8.f16777a
            com.google.android.gms.measurement.internal.I1 r5 = r5.F()
            com.google.android.gms.measurement.internal.H1 r5 = r5.f16157m
            int r6 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r6 != 0) goto L4a
            java.lang.String r0 = "true"
        L4a:
            r5.b(r0)
            r3 = r1
            r6 = r4
            goto L64
        L50:
            if (r11 != 0) goto L62
            com.google.android.gms.measurement.internal.Y1 r10 = r8.f16777a
            com.google.android.gms.measurement.internal.I1 r10 = r10.F()
            com.google.android.gms.measurement.internal.H1 r10 = r10.f16157m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
            r3 = r1
            goto L64
        L62:
            r3 = r10
            r6 = r11
        L64:
            com.google.android.gms.measurement.internal.Y1 r10 = r8.f16777a
            boolean r10 = r10.o()
            if (r10 != 0) goto L7c
            com.google.android.gms.measurement.internal.Y1 r9 = r8.f16777a
            com.google.android.gms.measurement.internal.u1 r9 = r9.d()
            com.google.android.gms.measurement.internal.s1 r9 = r9.v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7c:
            com.google.android.gms.measurement.internal.Y1 r10 = r8.f16777a
            boolean r10 = r10.r()
            if (r10 != 0) goto L85
            return
        L85:
            com.google.android.gms.measurement.internal.u4 r10 = new com.google.android.gms.measurement.internal.u4
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.Y1 r9 = r8.f16777a
            com.google.android.gms.measurement.internal.K3 r9 = r9.L()
            r9.y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Y2.M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void N(m0.u uVar) {
        i();
        AbstractC1319p.l(uVar);
        if (!this.f16385e.remove(uVar)) {
            this.f16777a.d().w().a("OnEventListener had not been registered");
        }
    }

    public final int Q(String str) {
        AbstractC1319p.f(str);
        this.f16777a.z();
        return 25;
    }

    public final Boolean R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f16777a.f().r(atomicReference, 15000L, "boolean test flag value", new J2(this, atomicReference));
    }

    public final Double S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f16777a.f().r(atomicReference, 15000L, "double test flag value", new R2(this, atomicReference));
    }

    public final Integer T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f16777a.f().r(atomicReference, 15000L, "int test flag value", new Q2(this, atomicReference));
    }

    public final Long U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f16777a.f().r(atomicReference, 15000L, "long test flag value", new P2(this, atomicReference));
    }

    public final String V() {
        return (String) this.f16387g.get();
    }

    public final String W() {
        C2177d3 r8 = this.f16777a.K().r();
        if (r8 != null) {
            return r8.f16464b;
        }
        return null;
    }

    public final String X() {
        C2177d3 r8 = this.f16777a.K().r();
        if (r8 != null) {
            return r8.f16463a;
        }
        return null;
    }

    public final String Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f16777a.f().r(atomicReference, 15000L, "String test flag value", new O2(this, atomicReference));
    }

    public final ArrayList Z(String str, String str2) {
        if (this.f16777a.f().C()) {
            this.f16777a.d().r().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f16777a.b();
        if (C2167c.a()) {
            this.f16777a.d().r().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f16777a.f().r(atomicReference, 5000L, "get conditional user properties", new I2(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f16777a.d().r().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return y4.v(list);
    }

    public final Map a0(String str, String str2, boolean z8) {
        if (this.f16777a.f().C()) {
            this.f16777a.d().r().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f16777a.b();
        if (C2167c.a()) {
            this.f16777a.d().r().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f16777a.f().r(atomicReference, 5000L, "get user properties", new K2(this, atomicReference, null, str, str2, z8));
        List<u4> list = (List) atomicReference.get();
        if (list == null) {
            this.f16777a.d().r().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z8));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (u4 u4Var : list) {
            Object s8 = u4Var.s();
            if (s8 != null) {
                arrayMap.put(u4Var.f16878b, s8);
            }
        }
        return arrayMap;
    }

    public final void f0() {
        h();
        i();
        if (this.f16777a.r()) {
            if (this.f16777a.z().B(null, AbstractC2217k1.f16585b0)) {
                C2197h z8 = this.f16777a.z();
                z8.f16777a.b();
                Boolean t8 = z8.t("google_analytics_deferred_deep_link_enabled");
                if (t8 != null && t8.booleanValue()) {
                    this.f16777a.d().q().a("Deferred Deep Link feature enabled.");
                    this.f16777a.f().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.A2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Y2 y22 = Y2.this;
                            y22.h();
                            if (!y22.f16777a.F().f16163s.b()) {
                                long a8 = y22.f16777a.F().f16164t.a();
                                y22.f16777a.F().f16164t.b(1 + a8);
                                y22.f16777a.z();
                                if (a8 >= 5) {
                                    y22.f16777a.d().w().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    y22.f16777a.F().f16163s.a(true);
                                    return;
                                } else {
                                    y22.f16777a.j();
                                    return;
                                }
                            }
                            y22.f16777a.d().q().a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.f16777a.L().O();
            this.f16393m = false;
            I1 F8 = this.f16777a.F();
            F8.h();
            String string = F8.o().getString("previous_os_version", null);
            F8.f16777a.A().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F8.o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f16777a.A().k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    u("auto", "_ou", bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.A1
    protected final boolean n() {
        return false;
    }

    public final void o(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.f16777a.a().currentTimeMillis();
        AbstractC1319p.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f16777a.f().z(new H2(this, bundle2));
    }

    public final void p() {
        if ((this.f16777a.c().getApplicationContext() instanceof Application) && this.f16383c != null) {
            ((Application) this.f16777a.c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f16383c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void q(Bundle bundle) {
        if (bundle == null) {
            this.f16777a.F().f16168x.b(new Bundle());
            return;
        }
        Bundle a8 = this.f16777a.F().f16168x.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f16777a.N().V(obj)) {
                    this.f16777a.N().C(this.f16394n, null, 27, null, null, 0);
                }
                this.f16777a.d().x().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (y4.Y(str)) {
                this.f16777a.d().x().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a8.remove(str);
            } else {
                y4 N8 = this.f16777a.N();
                this.f16777a.z();
                if (N8.Q("param", str, 100, obj)) {
                    this.f16777a.N().D(a8, str, obj);
                }
            }
        }
        this.f16777a.N();
        int m8 = this.f16777a.z().m();
        if (a8.size() > m8) {
            int i8 = 0;
            for (String str2 : new TreeSet(a8.keySet())) {
                i8++;
                if (i8 > m8) {
                    a8.remove(str2);
                }
            }
            this.f16777a.N().C(this.f16394n, null, 26, null, null, 0);
            this.f16777a.d().x().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f16777a.F().f16168x.b(a8);
        this.f16777a.L().v(a8);
    }

    public final void r(String str, String str2, Bundle bundle) {
        s(str, str2, bundle, true, true, this.f16777a.a().currentTimeMillis());
    }

    public final void s(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8) {
        Bundle bundle2;
        boolean z10;
        String str3;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            if (!z9 || this.f16384d == null || y4.Y(str2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (str == null) {
                str3 = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            } else {
                str3 = str;
            }
            A(str3, str2, j8, bundle2, z9, z10, z8, null);
            return;
        }
        this.f16777a.K().E(bundle2, j8);
    }

    public final void t(String str, String str2, Bundle bundle, String str3) {
        Y1.t();
        A("auto", str2, this.f16777a.a().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(String str, String str2, Bundle bundle) {
        h();
        v(str, str2, this.f16777a.a().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(String str, String str2, long j8, Bundle bundle) {
        boolean z8;
        h();
        if (this.f16384d == null || y4.Y(str2)) {
            z8 = true;
        } else {
            z8 = false;
        }
        w(str, str2, j8, bundle, true, z8, true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        boolean z11;
        boolean b8;
        String str4;
        long j9;
        Bundle[] bundleArr;
        Class<?> cls;
        AbstractC1319p.f(str);
        AbstractC1319p.l(bundle);
        h();
        i();
        if (this.f16777a.o()) {
            List u8 = this.f16777a.B().u();
            if (u8 != null && !u8.contains(str2)) {
                this.f16777a.d().q().c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f16386f) {
                this.f16386f = true;
                try {
                    if (!this.f16777a.s()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f16777a.c().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.f16777a.c());
                    } catch (Exception e8) {
                        this.f16777a.d().w().b("Failed to invoke Tag Manager's initialize() method", e8);
                    }
                } catch (ClassNotFoundException unused) {
                    this.f16777a.d().u().a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.f16777a.b();
                M("auto", "_lgclid", bundle.getString("gclid"), this.f16777a.a().currentTimeMillis());
            }
            this.f16777a.b();
            if (z8 && y4.c0(str2)) {
                this.f16777a.N().z(bundle, this.f16777a.F().f16168x.a());
            }
            if (!z10) {
                this.f16777a.b();
                if (!"_iap".equals(str2)) {
                    y4 N8 = this.f16777a.N();
                    int i8 = 2;
                    if (N8.S(NotificationCompat.CATEGORY_EVENT, str2)) {
                        if (N8.P(NotificationCompat.CATEGORY_EVENT, m0.q.f34883a, m0.q.f34884b, str2)) {
                            N8.f16777a.z();
                            if (N8.N(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                                i8 = 0;
                            }
                        } else {
                            i8 = 13;
                        }
                    }
                    if (i8 != 0) {
                        this.f16777a.d().s().b("Invalid public event name. Event will not be logged (FE)", this.f16777a.D().d(str2));
                        y4 N9 = this.f16777a.N();
                        this.f16777a.z();
                        this.f16777a.N().C(this.f16394n, null, i8, "_ev", N9.r(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            this.f16777a.b();
            C2177d3 s8 = this.f16777a.K().s(false);
            if (s8 != null && !bundle.containsKey("_sc")) {
                s8.f16466d = true;
            }
            y4.y(s8, bundle, z8 && !z10);
            boolean equals = "am".equals(str);
            boolean Y7 = y4.Y(str2);
            if (!z8 || this.f16384d == null || Y7) {
                z11 = equals;
            } else {
                if (!equals) {
                    this.f16777a.d().q().c("Passing event to registered event handler (FE)", this.f16777a.D().d(str2), this.f16777a.D().b(bundle));
                    AbstractC1319p.l(this.f16384d);
                    this.f16384d.a(str, str2, bundle, j8);
                    return;
                }
                z11 = true;
            }
            if (this.f16777a.r()) {
                int m02 = this.f16777a.N().m0(str2);
                if (m02 != 0) {
                    this.f16777a.d().s().b("Invalid event name. Event will not be logged (FE)", this.f16777a.D().d(str2));
                    y4 N10 = this.f16777a.N();
                    this.f16777a.z();
                    this.f16777a.N().C(this.f16394n, str3, m02, "_ev", N10.r(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle x02 = this.f16777a.N().x0(str3, str2, bundle, W.e.b("_o", "_sn", "_sc", "_si"), z10);
                AbstractC1319p.l(x02);
                this.f16777a.b();
                if (this.f16777a.K().s(false) != null && "_ae".equals(str2)) {
                    Y3 y32 = this.f16777a.M().f16425f;
                    long elapsedRealtime = y32.f16398d.f16777a.a().elapsedRealtime();
                    long j10 = elapsedRealtime - y32.f16396b;
                    y32.f16396b = elapsedRealtime;
                    if (j10 > 0) {
                        this.f16777a.N().w(x02, j10);
                    }
                }
                W5.c();
                if (this.f16777a.z().B(null, AbstractC2217k1.f16595g0)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        y4 N11 = this.f16777a.N();
                        String string = x02.getString("_ffr");
                        if (W.n.a(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!AbstractC3385B.a(string, N11.f16777a.F().f16165u.a())) {
                            N11.f16777a.F().f16165u.b(string);
                        } else {
                            N11.f16777a.d().q().a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String a8 = this.f16777a.N().f16777a.F().f16165u.a();
                        if (!TextUtils.isEmpty(a8)) {
                            x02.putString("_ffr", a8);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(x02);
                if (this.f16777a.z().B(null, AbstractC2217k1.f16562I0)) {
                    b8 = this.f16777a.M().t();
                } else {
                    b8 = this.f16777a.F().f16162r.b();
                }
                if (this.f16777a.F().f16159o.a() > 0 && this.f16777a.F().v(j8) && b8) {
                    this.f16777a.d().v().a("Current session is expired, remove the session number, ID, and engagement time");
                    j9 = 0;
                    str4 = "_ae";
                    M("auto", "_sid", null, this.f16777a.a().currentTimeMillis());
                    M("auto", "_sno", null, this.f16777a.a().currentTimeMillis());
                    M("auto", "_se", null, this.f16777a.a().currentTimeMillis());
                    this.f16777a.F().f16160p.b(0L);
                } else {
                    str4 = "_ae";
                    j9 = 0;
                }
                if (x02.getLong("extend_session", j9) == 1) {
                    this.f16777a.d().v().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f16777a.M().f16424e.b(j8, true);
                }
                ArrayList arrayList2 = new ArrayList(x02.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    String str5 = (String) arrayList2.get(i9);
                    if (str5 != null) {
                        this.f16777a.N();
                        Object obj = x02.get(str5);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            x02.putParcelableArray(str5, bundleArr);
                        }
                    }
                }
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    Bundle bundle2 = (Bundle) arrayList.get(i10);
                    String str6 = i10 != 0 ? "_ep" : str2;
                    bundle2.putString("_o", str);
                    if (z9) {
                        bundle2 = this.f16777a.N().w0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.f16777a.L().o(new C2270v(str6, new C2260t(bundle3), str, j8), str3);
                    if (!z11) {
                        Iterator it = this.f16385e.iterator();
                        while (it.hasNext()) {
                            ((m0.u) it.next()).a(str, str2, new Bundle(bundle3), j8);
                        }
                    }
                    i10++;
                }
                this.f16777a.b();
                if (this.f16777a.K().s(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.f16777a.M().f16425f.d(true, true, this.f16777a.a().elapsedRealtime());
                return;
            }
            return;
        }
        this.f16777a.d().q().a("Event not sent since app measurement is disabled");
    }

    public final void x(m0.u uVar) {
        i();
        AbstractC1319p.l(uVar);
        if (!this.f16385e.add(uVar)) {
            this.f16777a.d().w().a("OnEventListener already registered");
        }
    }

    public final void y(long j8) {
        this.f16387g.set(null);
        this.f16777a.f().z(new F2(this, j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(long j8, boolean z8) {
        h();
        i();
        this.f16777a.d().q().a("Resetting analytics data (FE)");
        C2160a4 M8 = this.f16777a.M();
        M8.h();
        M8.f16425f.a();
        C1949a7.c();
        if (this.f16777a.z().B(null, AbstractC2217k1.f16613p0)) {
            this.f16777a.B().v();
        }
        boolean o8 = this.f16777a.o();
        I1 F8 = this.f16777a.F();
        F8.f16149e.b(j8);
        if (!TextUtils.isEmpty(F8.f16777a.F().f16165u.a())) {
            F8.f16165u.b(null);
        }
        C2051m6.c();
        C2197h z9 = F8.f16777a.z();
        C2211j1 c2211j1 = AbstractC2217k1.f16597h0;
        if (z9.B(null, c2211j1)) {
            F8.f16159o.b(0L);
        }
        F8.f16160p.b(0L);
        if (!F8.f16777a.z().E()) {
            F8.t(!o8);
        }
        F8.f16166v.b(null);
        F8.f16167w.b(0L);
        F8.f16168x.b(null);
        if (z8) {
            this.f16777a.L().q();
        }
        C2051m6.c();
        if (this.f16777a.z().B(null, c2211j1)) {
            this.f16777a.M().f16424e.a();
        }
        this.f16393m = !o8;
    }
}
