package com.google.android.gms.measurement.internal;

import N.AbstractC1341l;
import Q.AbstractC1400p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.Z6;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l0.C3266a;
import l0.InterfaceC3272g;

/* loaded from: classes3.dex */
public final class D4 extends C1 {

    /* renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC2314a5 f17003c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3272g f17004d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f17005e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC2461w f17006f;

    /* renamed from: g, reason: collision with root package name */
    private final C2488z5 f17007g;

    /* renamed from: h, reason: collision with root package name */
    private final List f17008h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC2461w f17009i;

    /* JADX INFO: Access modifiers changed from: protected */
    public D4(R2 r22) {
        super(r22);
        this.f17008h = new ArrayList();
        this.f17007g = new C2488z5(r22.x());
        this.f17003c = new ServiceConnectionC2314a5(this);
        this.f17006f = new E4(this, r22);
        this.f17009i = new R4(this, r22);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(D4 d42, ComponentName componentName) {
        d42.k();
        if (d42.f17004d != null) {
            d42.f17004d = null;
            d42.c().K().b("Disconnected from device MeasurementService", componentName);
            d42.k();
            d42.Z();
        }
    }

    private final void N(Runnable runnable) {
        k();
        if (g0()) {
            runnable.run();
        } else {
            if (this.f17008h.size() >= 1000) {
                c().G().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f17008h.add(runnable);
            this.f17009i.b(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        k();
        c().K().b("Processing queued up service tasks", Integer.valueOf(this.f17008h.size()));
        Iterator it = this.f17008h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e8) {
                c().G().b("Task exception while flushing queue", e8);
            }
        }
        this.f17008h.clear();
        this.f17009i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        k();
        this.f17007g.c();
        this.f17006f.b(((Long) H.f17075M.a(null)).longValue());
    }

    private final b6 q0(boolean z8) {
        String str;
        C2332d2 m8 = m();
        if (z8) {
            str = c().O();
        } else {
            str = null;
        }
        return m8.B(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void s0(D4 d42) {
        d42.k();
        if (d42.g0()) {
            d42.c().K().a("Inactivity, disconnecting from the service");
            d42.a0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.C1
    protected final boolean A() {
        return false;
    }

    public final void C(Bundle bundle) {
        k();
        s();
        N(new Q4(this, q0(false), bundle));
    }

    public final void D(com.google.android.gms.internal.measurement.R0 r02) {
        k();
        s();
        N(new M4(this, q0(false), r02));
    }

    public final void E(com.google.android.gms.internal.measurement.R0 r02, G g8, String str) {
        k();
        s();
        if (h().r(AbstractC1341l.f7472a) != 0) {
            c().L().a("Not bundling data. Service unavailable or out of date");
            h().V(r02, new byte[0]);
        } else {
            N(new S4(this, g8, str, r02));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F(com.google.android.gms.internal.measurement.R0 r02, String str, String str2) {
        k();
        s();
        N(new Y4(this, str, str2, q0(false), r02));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(com.google.android.gms.internal.measurement.R0 r02, String str, String str2, boolean z8) {
        k();
        s();
        N(new G4(this, str, str2, q0(false), z8, r02));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(C2350g c2350g) {
        AbstractC1400p.l(c2350g);
        k();
        s();
        N(new W4(this, true, q0(true), n().E(c2350g), new C2350g(c2350g), c2350g));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I(G g8, String str) {
        AbstractC1400p.l(g8);
        k();
        s();
        N(new X4(this, true, q0(true), n().F(g8), g8, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(C2459v4 c2459v4) {
        k();
        s();
        N(new O4(this, c2459v4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(V5 v52) {
        k();
        s();
        N(new H4(this, q0(true), n().G(v52), v52));
    }

    public final void O(AtomicReference atomicReference) {
        k();
        s();
        N(new J4(this, atomicReference, q0(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P(AtomicReference atomicReference, Bundle bundle) {
        k();
        s();
        N(new I4(this, atomicReference, q0(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Q(AtomicReference atomicReference, String str, String str2, String str3) {
        k();
        s();
        N(new Z4(this, atomicReference, str, str2, str3, q0(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R(AtomicReference atomicReference, String str, String str2, String str3, boolean z8) {
        k();
        s();
        N(new RunnableC2321b5(this, atomicReference, str, str2, str3, q0(false), z8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S(InterfaceC3272g interfaceC3272g) {
        k();
        AbstractC1400p.l(interfaceC3272g);
        this.f17004d = interfaceC3272g;
        m0();
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T(InterfaceC3272g interfaceC3272g, R.a aVar, b6 b6Var) {
        int i8;
        k();
        s();
        int i9 = 0;
        int i10 = 100;
        while (i9 < 1001 && i10 == 100) {
            ArrayList arrayList = new ArrayList();
            List C8 = n().C(100);
            if (C8 != null) {
                arrayList.addAll(C8);
                i8 = C8.size();
            } else {
                i8 = 0;
            }
            if (aVar != null && i8 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                R.a aVar2 = (R.a) obj;
                if (aVar2 instanceof G) {
                    try {
                        interfaceC3272g.p((G) aVar2, b6Var);
                    } catch (RemoteException e8) {
                        c().G().b("Failed to send event to the service", e8);
                    }
                } else if (aVar2 instanceof V5) {
                    try {
                        interfaceC3272g.m0((V5) aVar2, b6Var);
                    } catch (RemoteException e9) {
                        c().G().b("Failed to send user property to the service", e9);
                    }
                } else if (aVar2 instanceof C2350g) {
                    try {
                        interfaceC3272g.t((C2350g) aVar2, b6Var);
                    } catch (RemoteException e10) {
                        c().G().b("Failed to send conditional user property to the service", e10);
                    }
                } else {
                    c().G().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i9++;
            i10 = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U(boolean z8) {
        k();
        s();
        if ((!Z6.a() || !a().q(H.f17111c1)) && z8) {
            n().H();
        }
        if (i0()) {
            N(new U4(this, q0(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C3266a V() {
        k();
        s();
        InterfaceC3272g interfaceC3272g = this.f17004d;
        if (interfaceC3272g == null) {
            Z();
            c().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        b6 q02 = q0(false);
        AbstractC1400p.l(q02);
        try {
            C3266a G8 = interfaceC3272g.G(q02);
            m0();
            return G8;
        } catch (RemoteException e8) {
            c().G().b("Failed to get consents; remote exception", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean W() {
        return this.f17005e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void X() {
        k();
        s();
        N(new P4(this, q0(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y() {
        k();
        s();
        b6 q02 = q0(true);
        n().I();
        N(new L4(this, q02));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z() {
        k();
        s();
        if (g0()) {
            return;
        }
        if (k0()) {
            this.f17003c.a();
            return;
        }
        if (!a().r()) {
            List<ResolveInfo> queryIntentServices = w().getPackageManager().queryIntentServices(new Intent().setClassName(w(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(w(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.f17003c.b(intent);
                return;
            }
            c().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    public final void a0() {
        k();
        s();
        this.f17003c.d();
        try {
            U.b.b().c(w(), this.f17003c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f17004d = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b0() {
        InterfaceC3272g interfaceC3272g = this.f17004d;
        if (interfaceC3272g == null) {
            c().G().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            b6 q02 = q0(false);
            AbstractC1400p.l(q02);
            interfaceC3272g.o0(q02);
            m0();
        } catch (RemoteException e8) {
            c().G().b("Failed to send Dma consent settings to the service", e8);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c0() {
        InterfaceC3272g interfaceC3272g = this.f17004d;
        if (interfaceC3272g == null) {
            c().G().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            b6 q02 = q0(false);
            AbstractC1400p.l(q02);
            interfaceC3272g.h0(q02);
            m0();
        } catch (RemoteException e8) {
            c().G().b("Failed to send storage consent settings to the service", e8);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d0() {
        k();
        s();
        b6 q02 = q0(false);
        n().H();
        N(new K4(this, q02));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e0() {
        k();
        s();
        N(new Runnable() { // from class: com.google.android.gms.measurement.internal.F4
            @Override // java.lang.Runnable
            public final void run() {
                D4.this.b0();
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f0() {
        k();
        s();
        N(new V4(this, q0(true)));
    }

    public final boolean g0() {
        k();
        s();
        if (this.f17004d != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h0() {
        k();
        s();
        if (!k0() || h().I0() >= 200900) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2, com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i0() {
        k();
        s();
        if (!k0() || h().I0() >= ((Integer) H.f17157t0.a(null)).intValue()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2, com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j0() {
        k();
        s();
        if (!k0() || h().I0() >= 241200) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2, com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k0() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.D4.k0():boolean");
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

    public final void o0(Bundle bundle) {
        k();
        s();
        if (a().q(H.f17141m1)) {
            N(new T4(this, q0(false), bundle));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2325c2
    public final /* bridge */ /* synthetic */ C2452u4 p() {
        return super.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p0(boolean z8) {
        k();
        s();
        if ((!Z6.a() || !a().q(H.f17111c1)) && z8) {
            n().H();
        }
        N(new Runnable() { // from class: com.google.android.gms.measurement.internal.C4
            @Override // java.lang.Runnable
            public final void run() {
                D4.this.c0();
            }
        });
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
