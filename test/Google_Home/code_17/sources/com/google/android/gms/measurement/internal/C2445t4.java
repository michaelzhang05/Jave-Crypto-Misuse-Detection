package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C2302z2;
import com.google.android.gms.internal.measurement.D2;
import com.google.android.gms.internal.measurement.E2;
import com.google.android.gms.internal.measurement.I2;
import com.google.android.gms.internal.measurement.K7;
import com.google.android.gms.internal.measurement.o8;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2445t4 extends F5 {
    public C2445t4(I5 i52) {
        super(i52);
    }

    private static String g(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.F5
    protected final boolean u() {
        return false;
    }

    public final byte[] v(G g8, String str) {
        X5 x52;
        Bundle bundle;
        E2.a aVar;
        D2.a aVar2;
        C2485z2 c2485z2;
        byte[] bArr;
        long j8;
        D a8;
        k();
        this.f17844a.Q();
        AbstractC1400p.l(g8);
        AbstractC1400p.f(str);
        if (!a().H(str, H.f17137l0)) {
            c().F().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(g8.f17033a) && !"_iapx".equals(g8.f17033a)) {
            c().F().c("Generating a payload for this event is not available. package_name, event_name", str, g8.f17033a);
            return null;
        }
        D2.a L8 = com.google.android.gms.internal.measurement.D2.L();
        n().b1();
        try {
            C2485z2 L02 = n().L0(str);
            if (L02 == null) {
                c().F().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!L02.A()) {
                c().F().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            E2.a Q02 = com.google.android.gms.internal.measurement.E2.u2().r0(1).Q0("android");
            if (!TextUtils.isEmpty(L02.l())) {
                Q02.P(L02.l());
            }
            if (!TextUtils.isEmpty(L02.n())) {
                Q02.b0((String) AbstractC1400p.l(L02.n()));
            }
            if (!TextUtils.isEmpty(L02.o())) {
                Q02.h0((String) AbstractC1400p.l(L02.o()));
            }
            if (L02.U() != -2147483648L) {
                Q02.e0((int) L02.U());
            }
            Q02.k0(L02.z0()).Z(L02.v0());
            String q8 = L02.q();
            String j9 = L02.j();
            if (!TextUtils.isEmpty(q8)) {
                Q02.K0(q8);
            } else if (!TextUtils.isEmpty(j9)) {
                Q02.E(j9);
            }
            Q02.A0(L02.J0());
            C2472x3 U8 = this.f16988b.U(str);
            Q02.T(L02.t0());
            if (this.f17844a.m() && a().P(Q02.X0()) && U8.A() && !TextUtils.isEmpty(null)) {
                Q02.B0(null);
            }
            Q02.p0(U8.y());
            if (U8.A() && L02.z()) {
                Pair z8 = p().z(L02.l(), U8);
                if (L02.z() && z8 != null && !TextUtils.isEmpty((CharSequence) z8.first)) {
                    Q02.S0(g((String) z8.first, Long.toString(g8.f17036d)));
                    Object obj = z8.second;
                    if (obj != null) {
                        Q02.W(((Boolean) obj).booleanValue());
                    }
                }
            }
            b().m();
            E2.a x02 = Q02.x0(Build.MODEL);
            b().m();
            x02.O0(Build.VERSION.RELEASE).z0((int) b().s()).W0(b().t());
            if (U8.B() && L02.m() != null) {
                Q02.V(g((String) AbstractC1400p.l(L02.m()), Long.toString(g8.f17036d)));
            }
            if (!TextUtils.isEmpty(L02.p())) {
                Q02.I0((String) AbstractC1400p.l(L02.p()));
            }
            String l8 = L02.l();
            List X02 = n().X0(l8);
            Iterator it = X02.iterator();
            while (true) {
                if (it.hasNext()) {
                    x52 = (X5) it.next();
                    if ("_lte".equals(x52.f17416c)) {
                        break;
                    }
                } else {
                    x52 = null;
                    break;
                }
            }
            if (x52 == null || x52.f17418e == null) {
                X5 x53 = new X5(l8, "auto", "_lte", x().currentTimeMillis(), 0L);
                X02.add(x53);
                n().h0(x53);
            }
            com.google.android.gms.internal.measurement.I2[] i2Arr = new com.google.android.gms.internal.measurement.I2[X02.size()];
            for (int i8 = 0; i8 < X02.size(); i8++) {
                I2.a t8 = com.google.android.gms.internal.measurement.I2.S().r(((X5) X02.get(i8)).f17416c).t(((X5) X02.get(i8)).f17417d);
                l().W(t8, ((X5) X02.get(i8)).f17418e);
                i2Arr[i8] = (com.google.android.gms.internal.measurement.I2) ((AbstractC2091c5) t8.k());
            }
            Q02.g0(Arrays.asList(i2Arr));
            l().V(Q02);
            this.f16988b.t(L02, Q02);
            if (K7.a() && a().q(H.f17092U0)) {
                this.f16988b.a0(L02, Q02);
            }
            C2395m2 b8 = C2395m2.b(g8);
            h().N(b8.f17718d, n().J0(str));
            h().W(b8, a().u(str));
            Bundle bundle2 = b8.f17718d;
            bundle2.putLong("_c", 1L);
            c().F().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", g8.f17035c);
            if (h().E0(Q02.X0(), L02.v())) {
                h().O(bundle2, "_dbg", 1L);
                h().O(bundle2, "_r", 1L);
            }
            D K02 = n().K0(str, g8.f17033a);
            if (K02 == null) {
                bundle = bundle2;
                aVar = Q02;
                aVar2 = L8;
                c2485z2 = L02;
                bArr = null;
                a8 = new D(str, g8.f17033a, 0L, 0L, g8.f17036d, 0L, null, null, null, null);
                j8 = 0;
            } else {
                bundle = bundle2;
                aVar = Q02;
                aVar2 = L8;
                c2485z2 = L02;
                bArr = null;
                j8 = K02.f16994f;
                a8 = K02.a(g8.f17036d);
            }
            n().U(a8);
            A a9 = new A(this.f17844a, g8.f17035c, str, g8.f17033a, g8.f17036d, j8, bundle);
            C2302z2.a s8 = C2302z2.S().B(a9.f16935d).z(a9.f16933b).s(a9.f16936e);
            Iterator it2 = a9.f16937f.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                B2.a t9 = com.google.android.gms.internal.measurement.B2.U().t(str2);
                Object H8 = a9.f16937f.H(str2);
                if (H8 != null) {
                    l().U(t9, H8);
                    s8.t(t9);
                }
            }
            E2.a aVar3 = aVar;
            aVar3.z(s8).A(com.google.android.gms.internal.measurement.F2.G().o(com.google.android.gms.internal.measurement.A2.G().o(a8.f16991c).p(g8.f17033a)));
            aVar3.D(m().z(c2485z2.l(), Collections.emptyList(), aVar3.H(), Long.valueOf(s8.D()), Long.valueOf(s8.D())));
            if (s8.H()) {
                aVar3.w0(s8.D()).f0(s8.D());
            }
            long D02 = c2485z2.D0();
            if (D02 != 0) {
                aVar3.o0(D02);
            }
            long H02 = c2485z2.H0();
            if (H02 != 0) {
                aVar3.s0(H02);
            } else if (D02 != 0) {
                aVar3.s0(D02);
            }
            String u8 = c2485z2.u();
            if (o8.a() && a().H(str, H.f17163w0) && u8 != null) {
                aVar3.U0(u8);
            }
            c2485z2.y();
            aVar3.j0((int) c2485z2.F0()).H0(102001L).D0(x().currentTimeMillis()).c0(true);
            this.f16988b.D(aVar3.X0(), aVar3);
            D2.a aVar4 = aVar2;
            aVar4.p(aVar3);
            C2485z2 c2485z22 = c2485z2;
            c2485z22.C0(aVar3.i0());
            c2485z22.y0(aVar3.d0());
            n().V(c2485z22, false, false);
            n().i1();
            try {
                return l().i0(((com.google.android.gms.internal.measurement.D2) ((AbstractC2091c5) aVar4.k())).i());
            } catch (IOException e8) {
                c().G().c("Data loss. Failed to bundle and serialize. appId", C2367i2.s(str), e8);
                return bArr;
            }
        } catch (SecurityException e9) {
            c().F().b("Resettable device id encryption failed", e9.getMessage());
            return new byte[0];
        } catch (SecurityException e10) {
            c().F().b("app instance id encryption failed", e10.getMessage());
            return new byte[0];
        } finally {
            n().g1();
        }
    }
}
