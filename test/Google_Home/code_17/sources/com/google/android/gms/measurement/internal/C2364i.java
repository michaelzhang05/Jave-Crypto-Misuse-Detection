package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.V7;
import com.google.android.gms.internal.measurement.W7;
import java.lang.reflect.InvocationTargetException;
import l0.EnumC3280o;

/* renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2364i extends AbstractC2451u3 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f17626b;

    /* renamed from: c, reason: collision with root package name */
    private String f17627c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC2378k f17628d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f17629e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2364i(R2 r22) {
        super(r22);
        this.f17628d = new InterfaceC2378k() { // from class: com.google.android.gms.measurement.internal.h
            @Override // com.google.android.gms.measurement.internal.InterfaceC2378k
            public final String g(String str, String str2) {
                return null;
            }
        };
    }

    public static long M() {
        return ((Long) H.f17115e.a(null)).longValue();
    }

    public static long R() {
        return ((Long) H.f17063G.a(null)).longValue();
    }

    public static long S() {
        return ((Integer) H.f17136l.a(null)).intValue();
    }

    public static long T() {
        return ((Long) H.f17061F.a(null)).longValue();
    }

    public static long U() {
        return ((Long) H.f17051A.a(null)).longValue();
    }

    private final String g(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            AbstractC1400p.l(str3);
            return str3;
        } catch (ClassNotFoundException e8) {
            c().G().b("Could not find SystemProperties class", e8);
            return str2;
        } catch (IllegalAccessException e9) {
            c().G().b("Could not access SystemProperties.get()", e9);
            return str2;
        } catch (NoSuchMethodException e10) {
            c().G().b("Could not find SystemProperties.get() method", e10);
            return str2;
        } catch (InvocationTargetException e11) {
            c().G().b("SystemProperties.get() threw an exception", e11);
            return str2;
        }
    }

    private final Bundle t() {
        try {
            if (w().getPackageManager() == null) {
                c().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c8 = X.e.a(w()).c(w().getPackageName(), 128);
            if (c8 == null) {
                c().G().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c8.metaData;
        } catch (PackageManager.NameNotFoundException e8) {
            c().G().b("Failed to load metadata: Package name not found", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int A() {
        if (!W7.a() || !a().J(null, H.f17062F0) || !h().c0(231100000, true)) {
            return 0;
        }
        return 35;
    }

    public final int B(String str) {
        return v(str, H.f17148p);
    }

    public final long C(String str, C2318b2 c2318b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c2318b2.a(null)).longValue();
        }
        String g8 = this.f17628d.g(str, c2318b2.b());
        if (TextUtils.isEmpty(g8)) {
            return ((Long) c2318b2.a(null)).longValue();
        }
        try {
            return ((Long) c2318b2.a(Long.valueOf(Long.parseLong(g8)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c2318b2.a(null)).longValue();
        }
    }

    public final EnumC3280o D(String str, boolean z8) {
        Object obj;
        AbstractC1400p.f(str);
        Bundle t8 = t();
        if (t8 == null) {
            c().G().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = t8.get(str);
        }
        if (obj == null) {
            return EnumC3280o.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC3280o.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC3280o.DENIED;
        }
        if (z8 && "eu_consent_policy".equals(obj)) {
            return EnumC3280o.POLICY;
        }
        c().L().b("Invalid manifest metadata for", str);
        return EnumC3280o.UNINITIALIZED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long E(String str) {
        return C(str, H.f17106b);
    }

    public final String F(String str, C2318b2 c2318b2) {
        if (TextUtils.isEmpty(str)) {
            return (String) c2318b2.a(null);
        }
        return (String) c2318b2.a(this.f17628d.g(str, c2318b2.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean G(String str) {
        AbstractC1400p.f(str);
        Bundle t8 = t();
        if (t8 == null) {
            c().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!t8.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(t8.getBoolean(str));
    }

    public final boolean H(String str, C2318b2 c2318b2) {
        return J(str, c2318b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String I(String str) {
        return F(str, H.f17079O);
    }

    public final boolean J(String str, C2318b2 c2318b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c2318b2.a(null)).booleanValue();
        }
        String g8 = this.f17628d.g(str, c2318b2.b());
        if (TextUtils.isEmpty(g8)) {
            return ((Boolean) c2318b2.a(null)).booleanValue();
        }
        return ((Boolean) c2318b2.a(Boolean.valueOf("1".equals(g8)))).booleanValue();
    }

    public final int K() {
        if (h().c0(201500000, true)) {
            return 100;
        }
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List L(java.lang.String r4) {
        /*
            r3 = this;
            Q.AbstractC1400p.f(r4)
            android.os.Bundle r0 = r3.t()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.i2 r4 = r3.c()
            com.google.android.gms.measurement.internal.k2 r4 = r4.G()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.w()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.i2 r0 = r3.c()
            com.google.android.gms.measurement.internal.k2 r0 = r0.G()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2364i.L(java.lang.String):java.util.List");
    }

    public final void N(String str) {
        this.f17627c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean O(String str) {
        return J(str, H.f17077N);
    }

    public final boolean P(String str) {
        return "1".equals(this.f17628d.g(str, "gaia_collection_enabled"));
    }

    public final boolean Q(String str) {
        return "1".equals(this.f17628d.g(str, "measurement.event_sampling_enabled"));
    }

    public final String V() {
        return g("debug.firebase.analytics.app", "");
    }

    public final String W() {
        return g("debug.deferred.deeplink", "");
    }

    public final String X() {
        return this.f17627c;
    }

    public final boolean Y() {
        Boolean G8 = G("google_analytics_adid_collection_enabled");
        if (G8 != null && !G8.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean Z() {
        Boolean G8 = G("google_analytics_automatic_screen_reporting_enabled");
        if (G8 != null && !G8.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    public final boolean a0() {
        Boolean G8 = G("firebase_analytics_collection_deactivated");
        if (G8 != null && G8.booleanValue()) {
            return true;
        }
        return false;
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

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final double l(String str, C2318b2 c2318b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c2318b2.a(null)).doubleValue();
        }
        String g8 = this.f17628d.g(str, c2318b2.b());
        if (TextUtils.isEmpty(g8)) {
            return ((Double) c2318b2.a(null)).doubleValue();
        }
        try {
            return ((Double) c2318b2.a(Double.valueOf(Double.parseDouble(g8)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c2318b2.a(null)).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m(String str) {
        return n(str, H.f17071K, 500, 2000);
    }

    public final int n(String str, C2318b2 c2318b2, int i8, int i9) {
        return Math.max(Math.min(v(str, c2318b2), i9), i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(String str, boolean z8) {
        if (!V7.a() || !a().J(null, H.f17094V0)) {
            return 100;
        }
        if (!z8) {
            return 500;
        }
        return n(str, H.f17091U, 100, 500);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(InterfaceC2378k interfaceC2378k) {
        this.f17628d = interfaceC2378k;
    }

    public final boolean q(C2318b2 c2318b2) {
        return J(null, c2318b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        if (this.f17626b == null) {
            Boolean G8 = G("app_measurement_lite");
            this.f17626b = G8;
            if (G8 == null) {
                this.f17626b = Boolean.FALSE;
            }
        }
        if (!this.f17626b.booleanValue() && this.f17844a.q()) {
            return false;
        }
        return true;
    }

    public final boolean s() {
        boolean z8;
        if (this.f17629e == null) {
            synchronized (this) {
                try {
                    if (this.f17629e == null) {
                        ApplicationInfo applicationInfo = w().getApplicationInfo();
                        String a8 = V.m.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            if (str != null && str.equals(a8)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            this.f17629e = Boolean.valueOf(z8);
                        }
                        if (this.f17629e == null) {
                            this.f17629e = Boolean.TRUE;
                            c().G().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f17629e.booleanValue();
    }

    public final int u(String str) {
        return n(str, H.f17073L, 25, 100);
    }

    public final int v(String str, C2318b2 c2318b2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c2318b2.a(null)).intValue();
        }
        String g8 = this.f17628d.g(str, c2318b2.b());
        if (TextUtils.isEmpty(g8)) {
            return ((Integer) c2318b2.a(null)).intValue();
        }
        try {
            return ((Integer) c2318b2.a(Integer.valueOf(Integer.parseInt(g8)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c2318b2.a(null)).intValue();
        }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int z(String str, boolean z8) {
        return Math.max(o(str, z8), 256);
    }
}
