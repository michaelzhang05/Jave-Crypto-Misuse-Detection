package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C1944a2;
import com.google.android.gms.internal.measurement.C1949a7;
import com.google.android.gms.internal.measurement.C1989f2;
import com.google.android.gms.internal.measurement.C1998g2;
import com.google.android.gms.internal.measurement.E6;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2224l2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2270v f16659a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16660b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16661c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2224l2(BinderC2249q2 binderC2249q2, C2270v c2270v, String str) {
        this.f16661c = binderC2249q2;
        this.f16659a = c2270v;
        this.f16660b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r4 r4Var;
        r4 r4Var2;
        w4 w4Var;
        C2268u2 c2268u2;
        com.google.android.gms.internal.measurement.U1 u12;
        String str;
        Bundle bundle;
        com.google.android.gms.internal.measurement.W1 w12;
        String str2;
        r c8;
        long j8;
        byte[] bArr;
        r4 r4Var3;
        r4Var = this.f16661c.f16751a;
        r4Var.e();
        r4Var2 = this.f16661c.f16751a;
        C2171c3 d02 = r4Var2.d0();
        C2270v c2270v = this.f16659a;
        String str3 = this.f16660b;
        d02.h();
        Y1.t();
        AbstractC1319p.l(c2270v);
        AbstractC1319p.f(str3);
        if (!d02.f16777a.z().B(str3, AbstractC2217k1.f16578W)) {
            d02.f16777a.d().q().b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        }
        if (!"_iap".equals(c2270v.f16884a) && !"_iapx".equals(c2270v.f16884a)) {
            d02.f16777a.d().q().c("Generating a payload for this event is not available. package_name, event_name", str3, c2270v.f16884a);
            return null;
        }
        com.google.android.gms.internal.measurement.U1 B8 = com.google.android.gms.internal.measurement.V1.B();
        d02.f16482b.V().e0();
        try {
            C2268u2 R8 = d02.f16482b.V().R(str3);
            if (R8 == null) {
                d02.f16777a.d().q().b("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
                r4Var3 = d02.f16482b;
            } else if (!R8.O()) {
                d02.f16777a.d().q().b("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
                r4Var3 = d02.f16482b;
            } else {
                com.google.android.gms.internal.measurement.W1 S12 = com.google.android.gms.internal.measurement.X1.S1();
                S12.V(1);
                S12.Q("android");
                if (!TextUtils.isEmpty(R8.l0())) {
                    S12.r(R8.l0());
                }
                if (!TextUtils.isEmpty(R8.n0())) {
                    S12.t((String) AbstractC1319p.l(R8.n0()));
                }
                if (!TextUtils.isEmpty(R8.o0())) {
                    S12.v((String) AbstractC1319p.l(R8.o0()));
                }
                if (R8.R() != -2147483648L) {
                    S12.w((int) R8.R());
                }
                S12.M(R8.c0());
                S12.E(R8.a0());
                String a8 = R8.a();
                String j02 = R8.j0();
                if (!TextUtils.isEmpty(a8)) {
                    S12.K(a8);
                } else if (!TextUtils.isEmpty(j02)) {
                    S12.q(j02);
                }
                E6.c();
                if (d02.f16777a.z().B(null, AbstractC2217k1.f16558G0)) {
                    S12.b0(R8.h0());
                }
                m0.p c02 = d02.f16482b.c0(str3);
                S12.B(R8.Z());
                if (d02.f16777a.o() && d02.f16777a.z().C(S12.i0()) && c02.j(m0.o.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    S12.D(null);
                }
                S12.A(c02.i());
                if (c02.j(m0.o.AD_STORAGE) && R8.N()) {
                    Pair n8 = d02.f16482b.e0().n(R8.l0(), c02);
                    if (R8.N() && !TextUtils.isEmpty((CharSequence) n8.first)) {
                        try {
                            S12.W(C2171c3.e((String) n8.first, Long.toString(c2270v.f16887d)));
                            Object obj = n8.second;
                            if (obj != null) {
                                S12.O(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e8) {
                            d02.f16777a.d().q().b("Resettable device id encryption failed", e8.getMessage());
                            bArr = new byte[0];
                            r4Var3 = d02.f16482b;
                        }
                    }
                }
                d02.f16777a.A().k();
                S12.C(Build.MODEL);
                d02.f16777a.A().k();
                S12.P(Build.VERSION.RELEASE);
                S12.c0((int) d02.f16777a.A().p());
                S12.g0(d02.f16777a.A().q());
                try {
                    if (c02.j(m0.o.ANALYTICS_STORAGE) && R8.m0() != null) {
                        S12.s(C2171c3.e((String) AbstractC1319p.l(R8.m0()), Long.toString(c2270v.f16887d)));
                    }
                    if (!TextUtils.isEmpty(R8.p0())) {
                        S12.J((String) AbstractC1319p.l(R8.p0()));
                    }
                    String l02 = R8.l0();
                    List c03 = d02.f16482b.V().c0(l02);
                    Iterator it = c03.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            w4Var = (w4) it.next();
                            if ("_lte".equals(w4Var.f16912c)) {
                                break;
                            }
                        } else {
                            w4Var = null;
                            break;
                        }
                    }
                    if (w4Var == null || w4Var.f16914e == null) {
                        w4 w4Var2 = new w4(l02, "auto", "_lte", d02.f16777a.a().currentTimeMillis(), 0L);
                        c03.add(w4Var2);
                        d02.f16482b.V().x(w4Var2);
                    }
                    t4 g02 = d02.f16482b.g0();
                    g02.f16777a.d().v().a("Checking account type status for ad personalization signals");
                    if (g02.f16777a.A().s()) {
                        String l03 = R8.l0();
                        AbstractC1319p.l(l03);
                        if (R8.N() && g02.f16482b.Z().B(l03)) {
                            g02.f16777a.d().q().a("Turning off ad personalization due to account type");
                            Iterator it2 = c03.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if ("_npa".equals(((w4) it2.next()).f16912c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            c03.add(new w4(l03, "auto", "_npa", g02.f16777a.a().currentTimeMillis(), 1L));
                        }
                    }
                    C1998g2[] c1998g2Arr = new C1998g2[c03.size()];
                    for (int i8 = 0; i8 < c03.size(); i8++) {
                        C1989f2 E8 = C1998g2.E();
                        E8.t(((w4) c03.get(i8)).f16912c);
                        E8.v(((w4) c03.get(i8)).f16913d);
                        d02.f16482b.g0().M(E8, ((w4) c03.get(i8)).f16914e);
                        c1998g2Arr[i8] = (C1998g2) E8.k();
                    }
                    S12.v0(Arrays.asList(c1998g2Arr));
                    C2272v1 b8 = C2272v1.b(c2270v);
                    d02.f16777a.N().z(b8.f16892d, d02.f16482b.V().Q(str3));
                    d02.f16777a.N().B(b8, d02.f16777a.z().n(str3));
                    Bundle bundle2 = b8.f16892d;
                    bundle2.putLong("_c", 1L);
                    d02.f16777a.d().q().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", c2270v.f16886c);
                    if (d02.f16777a.N().U(S12.i0())) {
                        d02.f16777a.N().D(bundle2, "_dbg", 1L);
                        d02.f16777a.N().D(bundle2, "_r", 1L);
                    }
                    r V7 = d02.f16482b.V().V(str3, c2270v.f16884a);
                    if (V7 == null) {
                        w12 = S12;
                        c2268u2 = R8;
                        u12 = B8;
                        str = str3;
                        bundle = bundle2;
                        str2 = null;
                        c8 = new r(str3, c2270v.f16884a, 0L, 0L, 0L, c2270v.f16887d, 0L, null, null, null, null);
                        j8 = 0;
                    } else {
                        c2268u2 = R8;
                        u12 = B8;
                        str = str3;
                        bundle = bundle2;
                        w12 = S12;
                        str2 = null;
                        long j9 = V7.f16764f;
                        c8 = V7.c(c2270v.f16887d);
                        j8 = j9;
                    }
                    d02.f16482b.V().q(c8);
                    C2246q c2246q = new C2246q(d02.f16777a, c2270v.f16886c, str, c2270v.f16884a, c2270v.f16887d, j8, bundle);
                    com.google.android.gms.internal.measurement.L1 F8 = com.google.android.gms.internal.measurement.M1.F();
                    F8.B(c2246q.f16747d);
                    F8.x(c2246q.f16745b);
                    F8.A(c2246q.f16748e);
                    C2255s c2255s = new C2255s(c2246q.f16749f);
                    while (c2255s.hasNext()) {
                        String next = c2255s.next();
                        com.google.android.gms.internal.measurement.P1 F9 = com.google.android.gms.internal.measurement.Q1.F();
                        F9.y(next);
                        Object L8 = c2246q.f16749f.L(next);
                        if (L8 != null) {
                            d02.f16482b.g0().L(F9, L8);
                            F8.s(F9);
                        }
                    }
                    com.google.android.gms.internal.measurement.W1 w13 = w12;
                    w13.w0(F8);
                    com.google.android.gms.internal.measurement.Y1 B9 = C1944a2.B();
                    com.google.android.gms.internal.measurement.N1 B10 = com.google.android.gms.internal.measurement.O1.B();
                    B10.o(c8.f16761c);
                    B10.p(c2270v.f16884a);
                    B9.o(B10);
                    w13.S(B9);
                    w13.r0(d02.f16482b.T().m(c2268u2.l0(), Collections.emptyList(), w13.m0(), Long.valueOf(F8.q()), Long.valueOf(F8.q())));
                    if (F8.F()) {
                        w13.a0(F8.q());
                        w13.F(F8.q());
                    }
                    long d03 = c2268u2.d0();
                    if (d03 != 0) {
                        w13.T(d03);
                    }
                    long f02 = c2268u2.f0();
                    if (f02 != 0) {
                        w13.U(f02);
                    } else if (d03 != 0) {
                        w13.U(d03);
                    }
                    String d8 = c2268u2.d();
                    C1949a7.c();
                    String str4 = str;
                    if (d02.f16777a.z().B(str4, AbstractC2217k1.f16615q0) && d8 != null) {
                        w13.Z(d8);
                    }
                    c2268u2.g();
                    w13.x((int) c2268u2.e0());
                    d02.f16777a.z().q();
                    w13.e0(79000L);
                    w13.d0(d02.f16777a.a().currentTimeMillis());
                    w13.Y(true);
                    if (d02.f16777a.z().B(str2, AbstractC2217k1.f16623u0)) {
                        d02.f16482b.h(w13.i0(), w13);
                    }
                    com.google.android.gms.internal.measurement.U1 u13 = u12;
                    u13.o(w13);
                    C2268u2 c2268u22 = c2268u2;
                    c2268u22.E(w13.p0());
                    c2268u22.C(w13.o0());
                    d02.f16482b.V().p(c2268u22);
                    d02.f16482b.V().o();
                    d02.f16482b.V().f0();
                    try {
                        return d02.f16482b.g0().Q(((com.google.android.gms.internal.measurement.V1) u13.k()).g());
                    } catch (IOException e9) {
                        d02.f16777a.d().r().c("Data loss. Failed to bundle and serialize. appId", C2267u1.z(str4), e9);
                        return str2;
                    }
                } catch (SecurityException e10) {
                    d02.f16777a.d().q().b("app instance id encryption failed", e10.getMessage());
                    byte[] bArr2 = new byte[0];
                    d02.f16482b.V().f0();
                    return bArr2;
                }
            }
            r4Var3.V().f0();
            return bArr;
        } catch (Throwable th) {
            d02.f16482b.V().f0();
            throw th;
        }
    }
}
