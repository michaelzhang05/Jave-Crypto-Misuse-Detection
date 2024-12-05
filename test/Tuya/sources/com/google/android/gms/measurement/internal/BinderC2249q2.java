package com.google.android.gms.measurement.internal;

import O.AbstractC1268l;
import O.C1269m;
import R.AbstractC1319p;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1950b;
import com.google.android.gms.internal.measurement.C1978e0;
import com.google.android.gms.internal.measurement.C2148z0;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import m0.AbstractBinderC3390c;

/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC2249q2 extends AbstractBinderC3390c {

    /* renamed from: a, reason: collision with root package name */
    private final r4 f16751a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f16752b;

    /* renamed from: k, reason: collision with root package name */
    private String f16753k;

    public BinderC2249q2(r4 r4Var, String str) {
        AbstractC1319p.l(r4Var);
        this.f16751a = r4Var;
        this.f16753k = null;
    }

    private final void j(C2270v c2270v, D4 d42) {
        this.f16751a.e();
        this.f16751a.j(c2270v, d42);
    }

    private final void q0(D4 d42, boolean z8) {
        AbstractC1319p.l(d42);
        AbstractC1319p.f(d42.f16061a);
        r0(d42.f16061a, false);
        this.f16751a.h0().M(d42.f16062b, d42.f16077q);
    }

    private final void r0(String str, boolean z8) {
        boolean z9;
        if (!TextUtils.isEmpty(str)) {
            if (z8) {
                try {
                    if (this.f16752b == null) {
                        if ("com.google.android.gms".equals(this.f16753k) || W.o.a(this.f16751a.c(), Binder.getCallingUid()) || C1269m.a(this.f16751a.c()).c(Binder.getCallingUid())) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.f16752b = Boolean.valueOf(z9);
                    }
                    if (this.f16752b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e8) {
                    this.f16751a.d().r().b("Measurement Service called with invalid calling package. appId", C2267u1.z(str));
                    throw e8;
                }
            }
            if (this.f16753k == null && AbstractC1268l.k(this.f16751a.c(), Binder.getCallingUid(), str)) {
                this.f16753k = str;
            }
            if (str.equals(this.f16753k)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.f16751a.d().r().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // m0.InterfaceC3391d
    public final void C(C2270v c2270v, D4 d42) {
        AbstractC1319p.l(c2270v);
        q0(d42, false);
        p0(new RunnableC2212j2(this, c2270v, d42));
    }

    @Override // m0.InterfaceC3391d
    public final List D(String str, String str2, String str3) {
        r0(str, true);
        try {
            return (List) this.f16751a.f().s(new CallableC2188f2(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f16751a.d().r().b("Failed to get conditional user properties as", e8);
            return Collections.emptyList();
        }
    }

    @Override // m0.InterfaceC3391d
    public final void M(D4 d42) {
        q0(d42, false);
        p0(new RunnableC2239o2(this, d42));
    }

    @Override // m0.InterfaceC3391d
    public final List P(String str, String str2, D4 d42) {
        q0(d42, false);
        String str3 = d42.f16061a;
        AbstractC1319p.l(str3);
        try {
            return (List) this.f16751a.f().s(new CallableC2182e2(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f16751a.d().r().b("Failed to get conditional user properties", e8);
            return Collections.emptyList();
        }
    }

    @Override // m0.InterfaceC3391d
    public final void S(long j8, String str, String str2, String str3) {
        p0(new RunnableC2244p2(this, str2, str3, str, j8));
    }

    @Override // m0.InterfaceC3391d
    public final void V(D4 d42) {
        AbstractC1319p.f(d42.f16061a);
        AbstractC1319p.l(d42.f16082v);
        RunnableC2206i2 runnableC2206i2 = new RunnableC2206i2(this, d42);
        AbstractC1319p.l(runnableC2206i2);
        if (this.f16751a.f().C()) {
            runnableC2206i2.run();
        } else {
            this.f16751a.f().A(runnableC2206i2);
        }
    }

    @Override // m0.InterfaceC3391d
    public final List W(String str, String str2, boolean z8, D4 d42) {
        q0(d42, false);
        String str3 = d42.f16061a;
        AbstractC1319p.l(str3);
        try {
            List<w4> list = (List) this.f16751a.f().s(new CallableC2170c2(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (w4 w4Var : list) {
                if (!z8 && y4.Y(w4Var.f16912c)) {
                }
                arrayList.add(new u4(w4Var));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f16751a.d().r().c("Failed to query user properties. appId", C2267u1.z(d42.f16061a), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.f16751a.d().r().c("Failed to query user properties. appId", C2267u1.z(d42.f16061a), e);
            return Collections.emptyList();
        }
    }

    @Override // m0.InterfaceC3391d
    public final void c0(D4 d42) {
        AbstractC1319p.f(d42.f16061a);
        r0(d42.f16061a, false);
        p0(new RunnableC2194g2(this, d42));
    }

    @Override // m0.InterfaceC3391d
    public final void e0(C2173d c2173d, D4 d42) {
        AbstractC1319p.l(c2173d);
        AbstractC1319p.l(c2173d.f16448c);
        q0(d42, false);
        C2173d c2173d2 = new C2173d(c2173d);
        c2173d2.f16446a = d42.f16061a;
        p0(new RunnableC2158a2(this, c2173d2, d42));
    }

    @Override // m0.InterfaceC3391d
    public final byte[] g0(C2270v c2270v, String str) {
        AbstractC1319p.f(str);
        AbstractC1319p.l(c2270v);
        r0(str, true);
        this.f16751a.d().q().b("Log and bundle. event", this.f16751a.W().d(c2270v.f16884a));
        long a8 = this.f16751a.a().a() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f16751a.f().t(new CallableC2224l2(this, c2270v, str)).get();
            if (bArr == null) {
                this.f16751a.d().r().b("Log and bundle returned null. appId", C2267u1.z(str));
                bArr = new byte[0];
            }
            this.f16751a.d().q().d("Log and bundle processed. event, size, time_ms", this.f16751a.W().d(c2270v.f16884a), Integer.valueOf(bArr.length), Long.valueOf((this.f16751a.a().a() / 1000000) - a8));
            return bArr;
        } catch (InterruptedException e8) {
            e = e8;
            this.f16751a.d().r().d("Failed to log and bundle. appId, event, error", C2267u1.z(str), this.f16751a.W().d(c2270v.f16884a), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.f16751a.d().r().d("Failed to log and bundle. appId, event, error", C2267u1.z(str), this.f16751a.W().d(c2270v.f16884a), e);
            return null;
        }
    }

    @Override // m0.InterfaceC3391d
    public final void h0(u4 u4Var, D4 d42) {
        AbstractC1319p.l(u4Var);
        q0(d42, false);
        p0(new RunnableC2229m2(this, u4Var, d42));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2270v l(C2270v c2270v, D4 d42) {
        C2260t c2260t;
        if ("_cmp".equals(c2270v.f16884a) && (c2260t = c2270v.f16885b) != null && c2260t.s() != 0) {
            String V7 = c2270v.f16885b.V("_cis");
            if ("referrer broadcast".equals(V7) || "referrer API".equals(V7)) {
                this.f16751a.d().u().b("Event has been filtered ", c2270v.toString());
                return new C2270v("_cmpx", c2270v.f16885b, c2270v.f16886c, c2270v.f16887d);
            }
        }
        return c2270v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n0(C2270v c2270v, D4 d42) {
        C1978e0 c1978e0;
        if (!this.f16751a.Z().C(d42.f16061a)) {
            j(c2270v, d42);
            return;
        }
        this.f16751a.d().v().b("EES config found for", d42.f16061a);
        S1 Z7 = this.f16751a.Z();
        String str = d42.f16061a;
        if (TextUtils.isEmpty(str)) {
            c1978e0 = null;
        } else {
            c1978e0 = (C1978e0) Z7.f16278j.get(str);
        }
        if (c1978e0 != null) {
            try {
                Map K8 = this.f16751a.g0().K(c2270v.f16885b.z(), true);
                String a8 = m0.q.a(c2270v.f16884a);
                if (a8 == null) {
                    a8 = c2270v.f16884a;
                }
                if (c1978e0.e(new C1950b(a8, c2270v.f16887d, K8))) {
                    if (c1978e0.g()) {
                        this.f16751a.d().v().b("EES edited event", c2270v.f16884a);
                        j(this.f16751a.g0().C(c1978e0.a().b()), d42);
                    } else {
                        j(c2270v, d42);
                    }
                    if (c1978e0.f()) {
                        for (C1950b c1950b : c1978e0.a().c()) {
                            this.f16751a.d().v().b("EES logging created event", c1950b.d());
                            j(this.f16751a.g0().C(c1950b), d42);
                        }
                        return;
                    }
                    return;
                }
            } catch (C2148z0 unused) {
                this.f16751a.d().r().c("EES error. appId, eventName", d42.f16062b, c2270v.f16884a);
            }
            this.f16751a.d().v().b("EES was not applied to event", c2270v.f16884a);
            j(c2270v, d42);
            return;
        }
        this.f16751a.d().v().b("EES not loaded for", d42.f16061a);
        j(c2270v, d42);
    }

    @Override // m0.InterfaceC3391d
    public final void o(D4 d42) {
        q0(d42, false);
        p0(new RunnableC2200h2(this, d42));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void o0(String str, Bundle bundle) {
        C2221l V7 = this.f16751a.V();
        V7.h();
        V7.i();
        byte[] g8 = V7.f16482b.g0().D(new C2246q(V7.f16777a, "", str, "dep", 0L, 0L, bundle)).g();
        V7.f16777a.d().v().c("Saving default event parameters, appId, data size", V7.f16777a.D().d(str), Integer.valueOf(g8.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("parameters", g8);
        try {
            if (V7.P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                V7.f16777a.d().r().b("Failed to insert default event parameters (got -1). appId", C2267u1.z(str));
            }
        } catch (SQLiteException e8) {
            V7.f16777a.d().r().c("Error storing default event parameters. appId", C2267u1.z(str), e8);
        }
    }

    @Override // m0.InterfaceC3391d
    public final void p(C2270v c2270v, String str, String str2) {
        AbstractC1319p.l(c2270v);
        AbstractC1319p.f(str);
        r0(str, true);
        p0(new RunnableC2218k2(this, c2270v, str));
    }

    final void p0(Runnable runnable) {
        AbstractC1319p.l(runnable);
        if (this.f16751a.f().C()) {
            runnable.run();
        } else {
            this.f16751a.f().z(runnable);
        }
    }

    @Override // m0.InterfaceC3391d
    public final void s(final Bundle bundle, D4 d42) {
        q0(d42, false);
        final String str = d42.f16061a;
        AbstractC1319p.l(str);
        p0(new Runnable() { // from class: com.google.android.gms.measurement.internal.Z1
            @Override // java.lang.Runnable
            public final void run() {
                BinderC2249q2.this.o0(str, bundle);
            }
        });
    }

    @Override // m0.InterfaceC3391d
    public final List t(String str, String str2, String str3, boolean z8) {
        r0(str, true);
        try {
            List<w4> list = (List) this.f16751a.f().s(new CallableC2176d2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (w4 w4Var : list) {
                if (!z8 && y4.Y(w4Var.f16912c)) {
                }
                arrayList.add(new u4(w4Var));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f16751a.d().r().c("Failed to get user properties as. appId", C2267u1.z(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e9) {
            e = e9;
            this.f16751a.d().r().c("Failed to get user properties as. appId", C2267u1.z(str), e);
            return Collections.emptyList();
        }
    }

    @Override // m0.InterfaceC3391d
    public final void u(C2173d c2173d) {
        AbstractC1319p.l(c2173d);
        AbstractC1319p.l(c2173d.f16448c);
        AbstractC1319p.f(c2173d.f16446a);
        r0(c2173d.f16446a, true);
        p0(new RunnableC2164b2(this, new C2173d(c2173d)));
    }

    @Override // m0.InterfaceC3391d
    public final List v(D4 d42, boolean z8) {
        q0(d42, false);
        String str = d42.f16061a;
        AbstractC1319p.l(str);
        try {
            List<w4> list = (List) this.f16751a.f().s(new CallableC2234n2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (w4 w4Var : list) {
                if (!z8 && y4.Y(w4Var.f16912c)) {
                }
                arrayList.add(new u4(w4Var));
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            this.f16751a.d().r().c("Failed to get user properties. appId", C2267u1.z(d42.f16061a), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.f16751a.d().r().c("Failed to get user properties. appId", C2267u1.z(d42.f16061a), e);
            return null;
        }
    }

    @Override // m0.InterfaceC3391d
    public final String z(D4 d42) {
        q0(d42, false);
        return this.f16751a.j0(d42);
    }
}
