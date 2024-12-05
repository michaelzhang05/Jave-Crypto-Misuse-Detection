package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* loaded from: classes3.dex */
public final class C2419p5 extends C1 {

    /* renamed from: c */
    private Handler f17762c;

    /* renamed from: d */
    private boolean f17763d;

    /* renamed from: e */
    protected final C2474x5 f17764e;

    /* renamed from: f */
    protected final C2460v5 f17765f;

    /* renamed from: g */
    private final C2426q5 f17766g;

    public C2419p5(R2 r22) {
        super(r22);
        this.f17763d = true;
        this.f17764e = new C2474x5(this);
        this.f17765f = new C2460v5(this);
        this.f17766g = new C2426q5(this);
    }

    public static /* synthetic */ void C(C2419p5 c2419p5, long j8) {
        c2419p5.k();
        c2419p5.G();
        c2419p5.c().K().b("Activity paused, time", Long.valueOf(j8));
        c2419p5.f17766g.b(j8);
        if (c2419p5.a().Z()) {
            c2419p5.f17765f.e(j8);
        }
    }

    public final void G() {
        k();
        if (this.f17762c == null) {
            this.f17762c = new com.google.android.gms.internal.measurement.N0(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void I(C2419p5 c2419p5, long j8) {
        c2419p5.k();
        c2419p5.G();
        c2419p5.c().K().b("Activity resumed, time", Long.valueOf(j8));
        if (c2419p5.a().q(H.f17080O0)) {
            if (c2419p5.a().Z() || c2419p5.f17763d) {
                c2419p5.f17765f.f(j8);
            }
        } else if (c2419p5.a().Z() || c2419p5.f().f17831u.b()) {
            c2419p5.f17765f.f(j8);
        }
        c2419p5.f17766g.a();
        C2474x5 c2474x5 = c2419p5.f17764e;
        c2474x5.f17910a.k();
        if (c2474x5.f17910a.f17844a.m()) {
            c2474x5.b(c2474x5.f17910a.x().currentTimeMillis(), false);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C1
    protected final boolean A() {
        return false;
    }

    public final void D(boolean z8) {
        k();
        this.f17763d = z8;
    }

    public final boolean E(boolean z8, boolean z9, long j8) {
        return this.f17765f.d(z8, z9, j8);
    }

    public final boolean F() {
        k();
        return this.f17763d;
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
