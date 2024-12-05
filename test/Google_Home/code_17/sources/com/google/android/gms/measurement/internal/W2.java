package com.google.android.gms.measurement.internal;

import N.AbstractC1341l;
import N.C1342m;
import Q.AbstractC1400p;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.C2105e;
import com.google.android.gms.internal.measurement.C2106e0;
import com.google.android.gms.internal.measurement.C2113e7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.AbstractBinderC3271f;
import l0.AbstractC3282q;
import l0.C3266a;

/* loaded from: classes3.dex */
public final class W2 extends AbstractBinderC3271f {

    /* renamed from: a, reason: collision with root package name */
    private final I5 f17393a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f17394b;

    /* renamed from: k, reason: collision with root package name */
    private String f17395k;

    public W2(I5 i52) {
        this(i52, null);
    }

    private final void s0(Runnable runnable) {
        AbstractC1400p.l(runnable);
        if (this.f17393a.e().J()) {
            runnable.run();
        } else {
            this.f17393a.e().G(runnable);
        }
    }

    private final void t0(String str, boolean z8) {
        boolean z9;
        if (!TextUtils.isEmpty(str)) {
            if (z8) {
                try {
                    if (this.f17394b == null) {
                        if (!"com.google.android.gms".equals(this.f17395k) && !V.o.a(this.f17393a.w(), Binder.getCallingUid()) && !C1342m.a(this.f17393a.w()).c(Binder.getCallingUid())) {
                            z9 = false;
                            this.f17394b = Boolean.valueOf(z9);
                        }
                        z9 = true;
                        this.f17394b = Boolean.valueOf(z9);
                    }
                    if (this.f17394b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e8) {
                    this.f17393a.c().G().b("Measurement Service called with invalid calling package. appId", C2367i2.s(str));
                    throw e8;
                }
            }
            if (this.f17395k == null && AbstractC1341l.k(this.f17393a.w(), Binder.getCallingUid(), str)) {
                this.f17395k = str;
            }
            if (str.equals(this.f17395k)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.f17393a.c().G().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void w0(b6 b6Var, boolean z8) {
        AbstractC1400p.l(b6Var);
        AbstractC1400p.f(b6Var.f17497a);
        t0(b6Var.f17497a, false);
        this.f17393a.y0().k0(b6Var.f17498b, b6Var.f17513q);
    }

    private final void x0(Runnable runnable) {
        AbstractC1400p.l(runnable);
        if (this.f17393a.e().J()) {
            runnable.run();
        } else {
            this.f17393a.e().D(runnable);
        }
    }

    private final void z0(G g8, b6 b6Var) {
        this.f17393a.z0();
        this.f17393a.r(g8, b6Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void A0(b6 b6Var) {
        this.f17393a.z0();
        this.f17393a.m0(b6Var);
    }

    @Override // l0.InterfaceC3272g
    public final void B(b6 b6Var) {
        w0(b6Var, false);
        x0(new RunnableC2326c3(this, b6Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void B0(b6 b6Var) {
        this.f17393a.z0();
        this.f17393a.o0(b6Var);
    }

    @Override // l0.InterfaceC3272g
    public final void D(b6 b6Var) {
        AbstractC1400p.f(b6Var.f17497a);
        t0(b6Var.f17497a, false);
        x0(new RunnableC2375j3(this, b6Var));
    }

    @Override // l0.InterfaceC3272g
    public final C3266a G(b6 b6Var) {
        w0(b6Var, false);
        AbstractC1400p.f(b6Var.f17497a);
        try {
            return (C3266a) this.f17393a.e().B(new CallableC2389l3(this, b6Var)).get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            this.f17393a.c().G().c("Failed to get consent. appId", C2367i2.s(b6Var.f17497a), e8);
            return new C3266a(null);
        }
    }

    @Override // l0.InterfaceC3272g
    public final List I(b6 b6Var, boolean z8) {
        w0(b6Var, false);
        String str = b6Var.f17497a;
        AbstractC1400p.l(str);
        try {
            List<X5> list = (List) this.f17393a.e().t(new CallableC2430r3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (X5 x52 : list) {
                if (!z8 && a6.J0(x52.f17416c)) {
                }
                arrayList.add(new V5(x52));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f17393a.c().G().c("Failed to get user properties. appId", C2367i2.s(b6Var.f17497a), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.f17393a.c().G().c("Failed to get user properties. appId", C2367i2.s(b6Var.f17497a), e);
            return null;
        }
    }

    @Override // l0.InterfaceC3272g
    public final void L(long j8, String str, String str2, String str3) {
        x0(new RunnableC2340e3(this, str2, str3, str, j8));
    }

    @Override // l0.InterfaceC3272g
    public final List N(b6 b6Var, Bundle bundle) {
        w0(b6Var, false);
        AbstractC1400p.l(b6Var.f17497a);
        try {
            return (List) this.f17393a.e().t(new CallableC2437s3(this, b6Var, bundle)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f17393a.c().G().c("Failed to get trigger URIs. appId", C2367i2.s(b6Var.f17497a), e8);
            return Collections.emptyList();
        }
    }

    @Override // l0.InterfaceC3272g
    public final void O(C2350g c2350g) {
        AbstractC1400p.l(c2350g);
        AbstractC1400p.l(c2350g.f17580c);
        AbstractC1400p.f(c2350g.f17578a);
        t0(c2350g.f17578a, true);
        x0(new RunnableC2354g3(this, new C2350g(c2350g)));
    }

    @Override // l0.InterfaceC3272g
    public final String S(b6 b6Var) {
        w0(b6Var, false);
        return this.f17393a.V(b6Var);
    }

    @Override // l0.InterfaceC3272g
    public final List T(String str, String str2, String str3) {
        t0(str, true);
        try {
            return (List) this.f17393a.e().t(new CallableC2382k3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f17393a.c().G().b("Failed to get conditional user properties as", e8);
            return Collections.emptyList();
        }
    }

    @Override // l0.InterfaceC3272g
    public final void U(final Bundle bundle, b6 b6Var) {
        if (C2113e7.a() && this.f17393a.i0().q(H.f17138l1)) {
            w0(b6Var, false);
            final String str = b6Var.f17497a;
            AbstractC1400p.l(str);
            x0(new Runnable() { // from class: com.google.android.gms.measurement.internal.Y2
                @Override // java.lang.Runnable
                public final void run() {
                    W2.this.v0(bundle, str);
                }
            });
        }
    }

    @Override // l0.InterfaceC3272g
    public final void d0(b6 b6Var) {
        w0(b6Var, false);
        x0(new Z2(this, b6Var));
    }

    @Override // l0.InterfaceC3272g
    public final void h0(final b6 b6Var) {
        AbstractC1400p.f(b6Var.f17497a);
        AbstractC1400p.l(b6Var.f17518v);
        s0(new Runnable() { // from class: com.google.android.gms.measurement.internal.U2
            @Override // java.lang.Runnable
            public final void run() {
                W2.this.B0(b6Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void k(Bundle bundle, String str) {
        boolean q8 = this.f17393a.i0().q(H.f17132j1);
        boolean q9 = this.f17393a.i0().q(H.f17138l1);
        if (bundle.isEmpty() && q8 && q9) {
            this.f17393a.l0().c1(str);
        } else {
            this.f17393a.l0().k0(str, bundle);
        }
    }

    @Override // l0.InterfaceC3272g
    public final void k0(b6 b6Var) {
        AbstractC1400p.f(b6Var.f17497a);
        AbstractC1400p.l(b6Var.f17518v);
        s0(new RunnableC2396m3(this, b6Var));
    }

    @Override // l0.InterfaceC3272g
    public final List l0(String str, String str2, boolean z8, b6 b6Var) {
        w0(b6Var, false);
        String str3 = b6Var.f17497a;
        AbstractC1400p.l(str3);
        try {
            List<X5> list = (List) this.f17393a.e().t(new CallableC2347f3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (X5 x52 : list) {
                if (!z8 && a6.J0(x52.f17416c)) {
                }
                arrayList.add(new V5(x52));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f17393a.c().G().c("Failed to query user properties. appId", C2367i2.s(b6Var.f17497a), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.f17393a.c().G().c("Failed to query user properties. appId", C2367i2.s(b6Var.f17497a), e);
            return Collections.emptyList();
        }
    }

    @Override // l0.InterfaceC3272g
    public final void m(G g8, String str, String str2) {
        AbstractC1400p.l(g8);
        AbstractC1400p.f(str);
        t0(str, true);
        x0(new RunnableC2403n3(this, g8, str));
    }

    @Override // l0.InterfaceC3272g
    public final void m0(V5 v52, b6 b6Var) {
        AbstractC1400p.l(v52);
        w0(b6Var, false);
        x0(new RunnableC2417p3(this, v52, b6Var));
    }

    @Override // l0.InterfaceC3272g
    public final void n(final Bundle bundle, b6 b6Var) {
        w0(b6Var, false);
        final String str = b6Var.f17497a;
        AbstractC1400p.l(str);
        x0(new Runnable() { // from class: com.google.android.gms.measurement.internal.a3
            @Override // java.lang.Runnable
            public final void run() {
                W2.this.k(bundle, str);
            }
        });
    }

    @Override // l0.InterfaceC3272g
    public final byte[] o(G g8, String str) {
        AbstractC1400p.f(str);
        AbstractC1400p.l(g8);
        t0(str, true);
        this.f17393a.c().F().b("Log and bundle. event", this.f17393a.n0().c(g8.f17033a));
        long a8 = this.f17393a.x().a() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f17393a.e().B(new CallableC2424q3(this, g8, str)).get();
            if (bArr == null) {
                this.f17393a.c().G().b("Log and bundle returned null. appId", C2367i2.s(str));
                bArr = new byte[0];
            }
            this.f17393a.c().F().d("Log and bundle processed. event, size, time_ms", this.f17393a.n0().c(g8.f17033a), Integer.valueOf(bArr.length), Long.valueOf((this.f17393a.x().a() / 1000000) - a8));
            return bArr;
        } catch (InterruptedException e8) {
            e = e8;
            this.f17393a.c().G().d("Failed to log and bundle. appId, event, error", C2367i2.s(str), this.f17393a.n0().c(g8.f17033a), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.f17393a.c().G().d("Failed to log and bundle. appId, event, error", C2367i2.s(str), this.f17393a.n0().c(g8.f17033a), e);
            return null;
        }
    }

    @Override // l0.InterfaceC3272g
    public final void o0(final b6 b6Var) {
        AbstractC1400p.f(b6Var.f17497a);
        AbstractC1400p.l(b6Var.f17518v);
        s0(new Runnable() { // from class: com.google.android.gms.measurement.internal.X2
            @Override // java.lang.Runnable
            public final void run() {
                W2.this.A0(b6Var);
            }
        });
    }

    @Override // l0.InterfaceC3272g
    public final void p(G g8, b6 b6Var) {
        AbstractC1400p.l(g8);
        w0(b6Var, false);
        x0(new RunnableC2410o3(this, g8, b6Var));
    }

    @Override // l0.InterfaceC3272g
    public final void r(b6 b6Var) {
        w0(b6Var, false);
        x0(new RunnableC2319b3(this, b6Var));
    }

    @Override // l0.InterfaceC3272g
    public final void t(C2350g c2350g, b6 b6Var) {
        AbstractC1400p.l(c2350g);
        AbstractC1400p.l(c2350g.f17580c);
        w0(b6Var, false);
        C2350g c2350g2 = new C2350g(c2350g);
        c2350g2.f17578a = b6Var.f17497a;
        x0(new RunnableC2333d3(this, c2350g2, b6Var));
    }

    @Override // l0.InterfaceC3272g
    public final List u(String str, String str2, b6 b6Var) {
        w0(b6Var, false);
        String str3 = b6Var.f17497a;
        AbstractC1400p.l(str3);
        try {
            return (List) this.f17393a.e().t(new CallableC2361h3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f17393a.c().G().b("Failed to get conditional user properties", e8);
            return Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final G u0(G g8, b6 b6Var) {
        C c8;
        if ("_cmp".equals(g8.f17033a) && (c8 = g8.f17034b) != null && c8.p() != 0) {
            String J8 = g8.f17034b.J("_cis");
            if ("referrer broadcast".equals(J8) || "referrer API".equals(J8)) {
                this.f17393a.c().J().b("Event has been filtered ", g8.toString());
                return new G("_cmpx", g8.f17034b, g8.f17035c, g8.f17036d);
            }
        }
        return g8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void v0(android.os.Bundle r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.W2.v0(android.os.Bundle, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y0(G g8, b6 b6Var) {
        com.google.android.gms.internal.measurement.C c8;
        boolean z8;
        if (!this.f17393a.r0().X(b6Var.f17497a)) {
            z0(g8, b6Var);
            return;
        }
        this.f17393a.c().K().b("EES config found for", b6Var.f17497a);
        E2 r02 = this.f17393a.r0();
        String str = b6Var.f17497a;
        if (TextUtils.isEmpty(str)) {
            c8 = null;
        } else {
            c8 = (com.google.android.gms.internal.measurement.C) r02.f17017j.get(str);
        }
        if (c8 == null) {
            this.f17393a.c().K().b("EES not loaded for", b6Var.f17497a);
            z0(g8, b6Var);
            return;
        }
        try {
            Map Q8 = this.f17393a.x0().Q(g8.f17034b.y(), true);
            String a8 = AbstractC3282q.a(g8.f17033a);
            if (a8 == null) {
                a8 = g8.f17033a;
            }
            z8 = c8.d(new C2105e(a8, g8.f17036d, Q8));
        } catch (C2106e0 unused) {
            this.f17393a.c().G().c("EES error. appId, eventName", b6Var.f17498b, g8.f17033a);
            z8 = false;
        }
        if (!z8) {
            this.f17393a.c().K().b("EES was not applied to event", g8.f17033a);
            z0(g8, b6Var);
            return;
        }
        if (c8.g()) {
            this.f17393a.c().K().b("EES edited event", g8.f17033a);
            z0(this.f17393a.x0().H(c8.a().d()), b6Var);
        } else {
            z0(g8, b6Var);
        }
        if (c8.f()) {
            for (C2105e c2105e : c8.a().f()) {
                this.f17393a.c().K().b("EES logging created event", c2105e.e());
                z0(this.f17393a.x0().H(c2105e), b6Var);
            }
        }
    }

    @Override // l0.InterfaceC3272g
    public final List z(String str, String str2, String str3, boolean z8) {
        t0(str, true);
        try {
            List<X5> list = (List) this.f17393a.e().t(new CallableC2368i3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (X5 x52 : list) {
                if (!z8 && a6.J0(x52.f17416c)) {
                }
                arrayList.add(new V5(x52));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f17393a.c().G().c("Failed to get user properties as. appId", C2367i2.s(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.f17393a.c().G().c("Failed to get user properties as. appId", C2367i2.s(str), e);
            return Collections.emptyList();
        }
    }

    private W2(I5 i52, String str) {
        AbstractC1400p.l(i52);
        this.f17393a = i52;
        this.f17395k = null;
    }
}
