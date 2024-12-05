package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2197h extends AbstractC2253r2 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f16503b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2191g f16504c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f16505d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2197h(Y1 y12) {
        super(y12);
        this.f16504c = new InterfaceC2191g() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.InterfaceC2191g
            public final String e(String str, String str2) {
                return null;
            }
        };
    }

    public static final long I() {
        return ((Long) AbstractC2217k1.f16592f.a(null)).longValue();
    }

    public static final long i() {
        return ((Long) AbstractC2217k1.f16555F.a(null)).longValue();
    }

    private final String j(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC1319p.l(str3);
            return str3;
        } catch (ClassNotFoundException e8) {
            this.f16777a.d().r().b("Could not find SystemProperties class", e8);
            return "";
        } catch (IllegalAccessException e9) {
            this.f16777a.d().r().b("Could not access SystemProperties.get()", e9);
            return "";
        } catch (NoSuchMethodException e10) {
            this.f16777a.d().r().b("Could not find SystemProperties.get() method", e10);
            return "";
        } catch (InvocationTargetException e11) {
            this.f16777a.d().r().b("SystemProperties.get() threw an exception", e11);
            return "";
        }
    }

    public final boolean A() {
        Boolean t8 = t("google_analytics_adid_collection_enabled");
        if (t8 != null && !t8.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean B(String str, C2211j1 c2211j1) {
        if (str == null) {
            return ((Boolean) c2211j1.a(null)).booleanValue();
        }
        String e8 = this.f16504c.e(str, c2211j1.b());
        if (TextUtils.isEmpty(e8)) {
            return ((Boolean) c2211j1.a(null)).booleanValue();
        }
        return ((Boolean) c2211j1.a(Boolean.valueOf("1".equals(e8)))).booleanValue();
    }

    public final boolean C(String str) {
        return "1".equals(this.f16504c.e(str, "gaia_collection_enabled"));
    }

    public final boolean D() {
        Boolean t8 = t("google_analytics_automatic_screen_reporting_enabled");
        if (t8 != null && !t8.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean E() {
        this.f16777a.b();
        Boolean t8 = t("firebase_analytics_collection_deactivated");
        if (t8 != null && t8.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean F(String str) {
        return "1".equals(this.f16504c.e(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G() {
        if (this.f16503b == null) {
            Boolean t8 = t("app_measurement_lite");
            this.f16503b = t8;
            if (t8 == null) {
                this.f16503b = Boolean.FALSE;
            }
        }
        if (!this.f16503b.booleanValue() && this.f16777a.s()) {
            return false;
        }
        return true;
    }

    public final boolean H() {
        if (this.f16505d == null) {
            synchronized (this) {
                try {
                    if (this.f16505d == null) {
                        ApplicationInfo applicationInfo = this.f16777a.c().getApplicationInfo();
                        String a8 = W.m.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z8 = false;
                            if (str != null && str.equals(a8)) {
                                z8 = true;
                            }
                            this.f16505d = Boolean.valueOf(z8);
                        }
                        if (this.f16505d == null) {
                            this.f16505d = Boolean.TRUE;
                            this.f16777a.d().r().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f16505d.booleanValue();
    }

    public final double k(String str, C2211j1 c2211j1) {
        if (str == null) {
            return ((Double) c2211j1.a(null)).doubleValue();
        }
        String e8 = this.f16504c.e(str, c2211j1.b());
        if (TextUtils.isEmpty(e8)) {
            return ((Double) c2211j1.a(null)).doubleValue();
        }
        try {
            return ((Double) c2211j1.a(Double.valueOf(Double.parseDouble(e8)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c2211j1.a(null)).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l(String str) {
        return p(str, AbstractC2217k1.f16563J, 500, 2000);
    }

    public final int m() {
        if (this.f16777a.N().X(201500000, true)) {
            return 100;
        }
        return 25;
    }

    public final int n(String str) {
        return p(str, AbstractC2217k1.f16565K, 25, 100);
    }

    public final int o(String str, C2211j1 c2211j1) {
        if (str == null) {
            return ((Integer) c2211j1.a(null)).intValue();
        }
        String e8 = this.f16504c.e(str, c2211j1.b());
        if (TextUtils.isEmpty(e8)) {
            return ((Integer) c2211j1.a(null)).intValue();
        }
        try {
            return ((Integer) c2211j1.a(Integer.valueOf(Integer.parseInt(e8)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c2211j1.a(null)).intValue();
        }
    }

    public final int p(String str, C2211j1 c2211j1, int i8, int i9) {
        return Math.max(Math.min(o(str, c2211j1), i9), i8);
    }

    public final long q() {
        this.f16777a.b();
        return 79000L;
    }

    public final long r(String str, C2211j1 c2211j1) {
        if (str == null) {
            return ((Long) c2211j1.a(null)).longValue();
        }
        String e8 = this.f16504c.e(str, c2211j1.b());
        if (TextUtils.isEmpty(e8)) {
            return ((Long) c2211j1.a(null)).longValue();
        }
        try {
            return ((Long) c2211j1.a(Long.valueOf(Long.parseLong(e8)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c2211j1.a(null)).longValue();
        }
    }

    final Bundle s() {
        try {
            if (this.f16777a.c().getPackageManager() == null) {
                this.f16777a.d().r().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c8 = Y.e.a(this.f16777a.c()).c(this.f16777a.c().getPackageName(), 128);
            if (c8 == null) {
                this.f16777a.d().r().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c8.metaData;
        } catch (PackageManager.NameNotFoundException e8) {
            this.f16777a.d().r().b("Failed to load metadata: Package name not found", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean t(String str) {
        AbstractC1319p.f(str);
        Bundle s8 = s();
        if (s8 == null) {
            this.f16777a.d().r().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!s8.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(s8.getBoolean(str));
    }

    public final String u() {
        return j("debug.firebase.analytics.app", "");
    }

    public final String v() {
        return j("debug.deferred.deeplink", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String w() {
        this.f16777a.b();
        return "FA";
    }

    public final String x(String str, C2211j1 c2211j1) {
        if (str == null) {
            return (String) c2211j1.a(null);
        }
        return (String) c2211j1.a(this.f16504c.e(str, c2211j1.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            R.AbstractC1319p.f(r4)
            android.os.Bundle r0 = r3.s()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.Y1 r4 = r3.f16777a
            com.google.android.gms.measurement.internal.u1 r4 = r4.d()
            com.google.android.gms.measurement.internal.s1 r4 = r4.r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.Y1 r0 = r3.f16777a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.c()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.Y1 r0 = r3.f16777a
            com.google.android.gms.measurement.internal.u1 r0 = r0.d()
            com.google.android.gms.measurement.internal.s1 r0 = r0.r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2197h.y(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(InterfaceC2191g interfaceC2191g) {
        this.f16504c = interfaceC2191g;
    }
}
