package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class t0 implements l3 {
    private final zztv a;

    private t0(zztv zztvVar) {
        zztv zztvVar2 = (zztv) zzuq.d(zztvVar, "output");
        this.a = zztvVar2;
        zztvVar2.f16111c = this;
    }

    public static t0 P(zztv zztvVar) {
        t0 t0Var = zztvVar.f16111c;
        return t0Var != null ? t0Var : new t0(zztvVar);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void A(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (list instanceof zzve) {
            zzve zzveVar = (zzve) list;
            while (i3 < list.size()) {
                Object g2 = zzveVar.g(i3);
                if (g2 instanceof String) {
                    this.a.G(i2, (String) g2);
                } else {
                    this.a.i(i2, (zzte) g2);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.G(i2, list.get(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void B(int i2, List<?> list, e2 e2Var) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            L(i2, list.get(i3), e2Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void C(int i2, List<?> list, e2 e2Var) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            K(i2, list.get(i3), e2Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void D(int i2, boolean z) throws IOException {
        this.a.H(i2, z);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void E(int i2) throws IOException {
        this.a.f0(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void F(int i2, zzte zzteVar) throws IOException {
        this.a.i(i2, zzteVar);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void G(int i2) throws IOException {
        this.a.f0(i2, 3);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void H(int i2, String str) throws IOException {
        this.a.G(i2, str);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void I(int i2, int i3) throws IOException {
        this.a.r0(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void J(int i2, int i3) throws IOException {
        this.a.p0(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void K(int i2, Object obj, e2 e2Var) throws IOException {
        this.a.k(i2, (zzvv) obj, e2Var);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void L(int i2, Object obj, e2 e2Var) throws IOException {
        zztv zztvVar = this.a;
        zztvVar.f0(i2, 3);
        e2Var.e((zzvv) obj, zztvVar.f16111c);
        zztvVar.f0(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void M(int i2, int i3) throws IOException {
        this.a.r0(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final <K, V> void N(int i2, p1<K, V> p1Var, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.f0(i2, 2);
            this.a.K(zzvn.a(p1Var, entry.getKey(), entry.getValue()));
            zzvn.b(this.a, p1Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void O(int i2, int i3) throws IOException {
        this.a.n0(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void a(int i2, long j2) throws IOException {
        this.a.D(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void b(int i2, long j2) throws IOException {
        this.a.g0(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void c(int i2, Object obj) throws IOException {
        if (obj instanceof zzte) {
            this.a.E(i2, (zzte) obj);
        } else {
            this.a.F(i2, (zzvv) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void d(int i2, double d2) throws IOException {
        this.a.f(i2, d2);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void e(int i2, long j2) throws IOException {
        this.a.g0(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void f(int i2, List<Boolean> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.E0(list.get(i5).booleanValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.D0(list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.H(i2, list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void g(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.P(list.get(i5).intValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.u(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.l0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void h(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.U(list.get(i5).intValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.u(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.l0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final int i() {
        return zzuo.zze.f16136k;
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void j(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.q(list.get(i5).longValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.n(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.h(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void k(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.J(list.get(i5).longValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.p(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.g0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void l(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.S(list.get(i5).intValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.N(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.r0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void m(int i2, long j2) throws IOException {
        this.a.h(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void n(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.Q(list.get(i5).intValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.K(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.n0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void o(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.T(list.get(i5).intValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.N(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.r0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void p(int i2, long j2) throws IOException {
        this.a.h(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void q(int i2, float f2) throws IOException {
        this.a.g(i2, f2);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void r(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.t(list.get(i5).longValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.p(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.g0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void s(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.s(list.get(i5).longValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.o(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.D(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void t(int i2, int i3) throws IOException {
        this.a.l0(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void u(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.r(list.get(i5).longValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.n(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.h(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void v(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.R(list.get(i5).intValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.M(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.p0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void w(int i2, List<Double> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.X(list.get(i5).doubleValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.C(list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.f(i2, list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void x(int i2, List<zzte> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.a.i(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void y(int i2, int i3) throws IOException {
        this.a.l0(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.l3
    public final void z(int i2, List<Float> list, boolean z) throws IOException {
        int i3 = 0;
        if (z) {
            this.a.f0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zztv.v(list.get(i5).floatValue());
            }
            this.a.K(i4);
            while (i3 < list.size()) {
                this.a.e(list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.g(i2, list.get(i3).floatValue());
            i3++;
        }
    }
}
