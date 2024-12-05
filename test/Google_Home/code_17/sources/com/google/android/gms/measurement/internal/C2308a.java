package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2308a extends AbstractC2325c2 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f17442b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f17443c;

    /* renamed from: d, reason: collision with root package name */
    private long f17444d;

    public C2308a(R2 r22) {
        super(r22);
        this.f17443c = new ArrayMap();
        this.f17442b = new ArrayMap();
    }

    private final void A(String str, long j8, C2459v4 c2459v4) {
        if (c2459v4 == null) {
            c().K().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            c().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j8);
        a6.X(c2459v4, bundle, true);
        o().b1("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j8) {
        Iterator it = this.f17442b.keySet().iterator();
        while (it.hasNext()) {
            this.f17442b.put((String) it.next(), Long.valueOf(j8));
        }
        if (!this.f17442b.isEmpty()) {
            this.f17444d = j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void C(C2308a c2308a, String str, long j8) {
        c2308a.k();
        AbstractC1400p.f(str);
        Integer num = (Integer) c2308a.f17443c.get(str);
        if (num != null) {
            C2459v4 C8 = c2308a.p().C(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c2308a.f17443c.remove(str);
                Long l8 = (Long) c2308a.f17442b.get(str);
                if (l8 == null) {
                    c2308a.c().G().a("First ad unit exposure time was never set");
                } else {
                    long longValue = j8 - l8.longValue();
                    c2308a.f17442b.remove(str);
                    c2308a.A(str, longValue, C8);
                }
                if (c2308a.f17443c.isEmpty()) {
                    long j9 = c2308a.f17444d;
                    if (j9 == 0) {
                        c2308a.c().G().a("First ad exposure time was never set");
                        return;
                    } else {
                        c2308a.t(j8 - j9, C8);
                        c2308a.f17444d = 0L;
                        return;
                    }
                }
                return;
            }
            c2308a.f17443c.put(str, Integer.valueOf(intValue));
            return;
        }
        c2308a.c().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void t(long j8, C2459v4 c2459v4) {
        if (c2459v4 == null) {
            c().K().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            c().K().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j8);
        a6.X(c2459v4, bundle, true);
        o().b1("am", "_xa", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void v(C2308a c2308a, String str, long j8) {
        c2308a.k();
        AbstractC1400p.f(str);
        if (c2308a.f17443c.isEmpty()) {
            c2308a.f17444d = j8;
        }
        Integer num = (Integer) c2308a.f17443c.get(str);
        if (num != null) {
            c2308a.f17443c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c2308a.f17443c.size() >= 100) {
            c2308a.c().L().a("Too many ads visible");
        } else {
            c2308a.f17443c.put(str, 1);
            c2308a.f17442b.put(str, Long.valueOf(j8));
        }
    }

    public final void D(String str, long j8) {
        if (str != null && str.length() != 0) {
            e().D(new RunnableC2482z(this, str, j8));
        } else {
            c().G().a("Ad unit id must be a non-empty string");
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

    public final void s(long j8) {
        C2459v4 C8 = p().C(false);
        for (String str : this.f17442b.keySet()) {
            A(str, j8 - ((Long) this.f17442b.get(str)).longValue(), C8);
        }
        if (!this.f17442b.isEmpty()) {
            t(j8 - this.f17444d, C8);
        }
        B(j8);
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

    public final void z(String str, long j8) {
        if (str != null && str.length() != 0) {
            e().D(new Z(this, str, j8));
        } else {
            c().G().a("Ad unit id must be a non-empty string");
        }
    }
}
