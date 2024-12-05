package com.google.android.gms.measurement.internal;

import O.AbstractC1268l;
import R.AbstractC1319p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.InterfaceC2029k0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m0.InterfaceC3391d;

/* loaded from: classes3.dex */
public final class K3 extends A1 {

    /* renamed from: c, reason: collision with root package name */
    private final J3 f16201c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3391d f16202d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f16203e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC2236o f16204f;

    /* renamed from: g, reason: collision with root package name */
    private final C2166b4 f16205g;

    /* renamed from: h, reason: collision with root package name */
    private final List f16206h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC2236o f16207i;

    /* JADX INFO: Access modifiers changed from: protected */
    public K3(Y1 y12) {
        super(y12);
        this.f16206h = new ArrayList();
        this.f16205g = new C2166b4(y12.a());
        this.f16201c = new J3(this);
        this.f16204f = new C2269u3(this, y12);
        this.f16207i = new C2279w3(this, y12);
    }

    private final D4 C(boolean z8) {
        Pair a8;
        this.f16777a.b();
        C2228m1 B8 = this.f16777a.B();
        String str = null;
        if (z8) {
            C2267u1 d8 = this.f16777a.d();
            if (d8.f16777a.F().f16148d != null && (a8 = d8.f16777a.F().f16148d.a()) != null && a8 != I1.f16146y) {
                str = String.valueOf(a8.second) + ":" + ((String) a8.first);
            }
        }
        return B8.q(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        h();
        this.f16777a.d().v().b("Processing queued up service tasks", Integer.valueOf(this.f16206h.size()));
        Iterator it = this.f16206h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e8) {
                this.f16777a.d().r().b("Task exception while flushing queue", e8);
            }
        }
        this.f16206h.clear();
        this.f16207i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        h();
        this.f16205g.b();
        AbstractC2236o abstractC2236o = this.f16204f;
        this.f16777a.z();
        abstractC2236o.d(((Long) AbstractC2217k1.f16567L.a(null)).longValue());
    }

    private final void F(Runnable runnable) {
        h();
        if (z()) {
            runnable.run();
            return;
        }
        long size = this.f16206h.size();
        this.f16777a.z();
        if (size >= 1000) {
            this.f16777a.d().r().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f16206h.add(runnable);
        this.f16207i.d(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        P();
    }

    private final boolean G() {
        this.f16777a.b();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void M(K3 k32, ComponentName componentName) {
        k32.h();
        if (k32.f16202d != null) {
            k32.f16202d = null;
            k32.f16777a.d().v().b("Disconnected from device MeasurementService", componentName);
            k32.h();
            k32.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A() {
        h();
        i();
        if (!B() || this.f16777a.N().q0() >= ((Integer) AbstractC2217k1.f16601j0.a(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.K3.B():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean J() {
        return this.f16203e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O() {
        h();
        i();
        D4 C8 = C(true);
        this.f16777a.C().r();
        F(new RunnableC2254r3(this, C8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void P() {
        h();
        i();
        if (z()) {
            return;
        }
        if (!B()) {
            if (!this.f16777a.z().G()) {
                this.f16777a.b();
                List<ResolveInfo> queryIntentServices = this.f16777a.c().getPackageManager().queryIntentServices(new Intent().setClassName(this.f16777a.c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context c8 = this.f16777a.c();
                    this.f16777a.b();
                    intent.setComponent(new ComponentName(c8, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f16201c.b(intent);
                    return;
                }
                this.f16777a.d().r().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        this.f16201c.c();
    }

    public final void Q() {
        h();
        i();
        this.f16201c.d();
        try {
            V.b.b().c(this.f16777a.c(), this.f16201c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f16202d = null;
    }

    public final void R(InterfaceC2029k0 interfaceC2029k0) {
        h();
        i();
        F(new RunnableC2250q3(this, C(false), interfaceC2029k0));
    }

    public final void S(AtomicReference atomicReference) {
        h();
        i();
        F(new RunnableC2245p3(this, atomicReference, C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T(InterfaceC2029k0 interfaceC2029k0, String str, String str2) {
        h();
        i();
        F(new C3(this, str, str2, C(false), interfaceC2029k0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        i();
        F(new B3(this, atomicReference, null, str2, str3, C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void V(InterfaceC2029k0 interfaceC2029k0, String str, String str2, boolean z8) {
        h();
        i();
        F(new RunnableC2230m3(this, str, str2, C(false), z8, interfaceC2029k0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void W(AtomicReference atomicReference, String str, String str2, String str3, boolean z8) {
        h();
        i();
        F(new D3(this, atomicReference, null, str2, str3, C(false), z8));
    }

    @Override // com.google.android.gms.measurement.internal.A1
    protected final boolean n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(C2270v c2270v, String str) {
        AbstractC1319p.l(c2270v);
        h();
        i();
        G();
        F(new RunnableC2294z3(this, true, C(true), this.f16777a.C().v(c2270v), c2270v, str));
    }

    public final void p(InterfaceC2029k0 interfaceC2029k0, C2270v c2270v, String str) {
        h();
        i();
        if (this.f16777a.N().r0(AbstractC1268l.f7671a) != 0) {
            this.f16777a.d().w().a("Not bundling data. Service unavailable or out of date");
            this.f16777a.N().H(interfaceC2029k0, new byte[0]);
        } else {
            F(new RunnableC2274v3(this, c2270v, str, interfaceC2029k0));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        h();
        i();
        D4 C8 = C(false);
        G();
        this.f16777a.C().q();
        F(new RunnableC2240o3(this, C8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(InterfaceC3391d interfaceC3391d, S.a aVar, D4 d42) {
        int i8;
        h();
        i();
        G();
        this.f16777a.z();
        int i9 = 0;
        int i10 = 100;
        while (i9 < 1001 && i10 == 100) {
            ArrayList arrayList = new ArrayList();
            List p8 = this.f16777a.C().p(100);
            if (p8 != null) {
                arrayList.addAll(p8);
                i8 = p8.size();
            } else {
                i8 = 0;
            }
            if (aVar != null && i8 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                S.a aVar2 = (S.a) arrayList.get(i11);
                if (aVar2 instanceof C2270v) {
                    try {
                        interfaceC3391d.C((C2270v) aVar2, d42);
                    } catch (RemoteException e8) {
                        this.f16777a.d().r().b("Failed to send event to the service", e8);
                    }
                } else if (aVar2 instanceof u4) {
                    try {
                        interfaceC3391d.h0((u4) aVar2, d42);
                    } catch (RemoteException e9) {
                        this.f16777a.d().r().b("Failed to send user property to the service", e9);
                    }
                } else if (aVar2 instanceof C2173d) {
                    try {
                        interfaceC3391d.e0((C2173d) aVar2, d42);
                    } catch (RemoteException e10) {
                        this.f16777a.d().r().b("Failed to send conditional user property to the service", e10);
                    }
                } else {
                    this.f16777a.d().r().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i9++;
            i10 = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(C2173d c2173d) {
        AbstractC1319p.l(c2173d);
        h();
        i();
        this.f16777a.b();
        F(new A3(this, true, C(true), this.f16777a.C().u(c2173d), new C2173d(c2173d), c2173d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(boolean z8) {
        h();
        i();
        if (z8) {
            G();
            this.f16777a.C().q();
        }
        if (A()) {
            F(new RunnableC2289y3(this, C(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(C2177d3 c2177d3) {
        h();
        i();
        F(new RunnableC2259s3(this, c2177d3));
    }

    public final void v(Bundle bundle) {
        h();
        i();
        F(new RunnableC2264t3(this, C(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        h();
        i();
        F(new RunnableC2284x3(this, C(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(InterfaceC3391d interfaceC3391d) {
        h();
        AbstractC1319p.l(interfaceC3391d);
        this.f16202d = interfaceC3391d;
        E();
        D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(u4 u4Var) {
        h();
        i();
        G();
        F(new RunnableC2235n3(this, C(true), this.f16777a.C().w(u4Var), u4Var));
    }

    public final boolean z() {
        h();
        i();
        if (this.f16202d != null) {
            return true;
        }
        return false;
    }
}
