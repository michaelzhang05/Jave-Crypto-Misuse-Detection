package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.Context;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.measurement.internal.C2472x3;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2332d2 extends C1 {

    /* renamed from: c, reason: collision with root package name */
    private String f17535c;

    /* renamed from: d, reason: collision with root package name */
    private String f17536d;

    /* renamed from: e, reason: collision with root package name */
    private int f17537e;

    /* renamed from: f, reason: collision with root package name */
    private String f17538f;

    /* renamed from: g, reason: collision with root package name */
    private long f17539g;

    /* renamed from: h, reason: collision with root package name */
    private long f17540h;

    /* renamed from: i, reason: collision with root package name */
    private List f17541i;

    /* renamed from: j, reason: collision with root package name */
    private String f17542j;

    /* renamed from: k, reason: collision with root package name */
    private int f17543k;

    /* renamed from: l, reason: collision with root package name */
    private String f17544l;

    /* renamed from: m, reason: collision with root package name */
    private String f17545m;

    /* renamed from: n, reason: collision with root package name */
    private String f17546n;

    /* renamed from: o, reason: collision with root package name */
    private long f17547o;

    /* renamed from: p, reason: collision with root package name */
    private String f17548p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2332d2(R2 r22, long j8) {
        super(r22);
        this.f17547o = 0L;
        this.f17548p = null;
        this.f17540h = j8;
    }

    private final String J() {
        if (v8.a() && a().q(H.f17153r0)) {
            c().K().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = w().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, w());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                } catch (Exception unused) {
                    c().M().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                c().N().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.C1
    protected final boolean A() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.b6 B(java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2332d2.B(java.lang.String):com.google.android.gms.measurement.internal.b6");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int C() {
        s();
        return this.f17543k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int D() {
        s();
        return this.f17537e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String E() {
        s();
        return this.f17545m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String F() {
        s();
        AbstractC1400p.l(this.f17535c);
        return this.f17535c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String G() {
        k();
        s();
        AbstractC1400p.l(this.f17544l);
        return this.f17544l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List H() {
        return this.f17541i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I() {
        String format;
        String str;
        k();
        if (!f().M().m(C2472x3.a.ANALYTICS_STORAGE)) {
            c().F().a("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            h().W0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        C2381k2 F8 = c().F();
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        F8.a(String.format("Resetting session stitching token to %s", str));
        this.f17546n = format;
        this.f17547o = x().currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean K(String str) {
        boolean z8;
        String str2 = this.f17548p;
        if (str2 != null && !str2.equals(str)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f17548p = str;
        return z8;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0190 A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:18:0x016b, B:21:0x0188, B:23:0x0190, B:25:0x01ac, B:27:0x01c0, B:28:0x01c5, B:30:0x01c3), top: B:17:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ac A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:18:0x016b, B:21:0x0188, B:23:0x0190, B:25:0x01ac, B:27:0x01c0, B:28:0x01c5, B:30:0x01c3), top: B:17:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    @Override // com.google.android.gms.measurement.internal.C1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void v() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2332d2.v():void");
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
