package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class N4 implements N6 {

    /* renamed from: a, reason: collision with root package name */
    private final K4 f16236a;

    private N4(K4 k42) {
        K4 k43 = (K4) AbstractC2111e5.f(k42, "output");
        this.f16236a = k43;
        k43.f16179a = this;
    }

    public static N4 P(K4 k42) {
        N4 n42 = k42.f16179a;
        if (n42 != null) {
            return n42;
        }
        return new N4(k42);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void A(int i8, float f8) {
        this.f16236a.J(i8, f8);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void B(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2242s5) {
            C2242s5 c2242s5 = (C2242s5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2242s5.size(); i11++) {
                    i10 += K4.S(c2242s5.g(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2242s5.size()) {
                    this.f16236a.s(c2242s5.g(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2242s5.size()) {
                this.f16236a.m(i8, c2242s5.g(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.S(((Long) list.get(i13)).longValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.s(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.m(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void C(int i8, AbstractC2241s4 abstractC2241s4) {
        this.f16236a.n(i8, abstractC2241s4);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void D(int i8, int i9) {
        this.f16236a.b0(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void E(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2242s5) {
            C2242s5 c2242s5 = (C2242s5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2242s5.size(); i11++) {
                    i10 += K4.n0(c2242s5.g(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2242s5.size()) {
                    this.f16236a.N(c2242s5.g(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2242s5.size()) {
                this.f16236a.L(i8, c2242s5.g(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.n0(((Long) list.get(i13)).longValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.N(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.L(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void F(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2121f5.size(); i11++) {
                    i10 += K4.c0(c2121f5.d(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2121f5.size()) {
                    this.f16236a.k(c2121f5.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2121f5.size()) {
                this.f16236a.l(i8, c2121f5.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.c0(((Integer) list.get(i13)).intValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.k(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.l(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void G(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2121f5.size(); i11++) {
                    i10 += K4.v0(c2121f5.d(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2121f5.size()) {
                    this.f16236a.U(c2121f5.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2121f5.size()) {
                this.f16236a.b0(i8, c2121f5.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.v0(((Integer) list.get(i13)).intValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.U(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.b0(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void H(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2121f5.size(); i11++) {
                    i10 += K4.g0(c2121f5.d(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2121f5.size()) {
                    this.f16236a.H(c2121f5.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2121f5.size()) {
                this.f16236a.K(i8, c2121f5.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.g0(((Integer) list.get(i13)).intValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.H(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.K(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void I(int i8, List list) {
        int i9 = 0;
        if (list instanceof InterfaceC2216p5) {
            InterfaceC2216p5 interfaceC2216p5 = (InterfaceC2216p5) list;
            while (i9 < list.size()) {
                Object a8 = interfaceC2216p5.a(i9);
                if (a8 instanceof String) {
                    this.f16236a.q(i8, (String) a8);
                } else {
                    this.f16236a.n(i8, (AbstractC2241s4) a8);
                }
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.q(i8, (String) list.get(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void J(int i8, int i9) {
        this.f16236a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void K(int i8, long j8) {
        this.f16236a.q0(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void L(int i8, List list, boolean z8) {
        if (list instanceof AbstractC2081b5) {
            android.support.v4.media.a.a(list);
            if (z8) {
                this.f16236a.V(i8, 2);
                throw null;
            }
            throw null;
        }
        int i9 = 0;
        if (z8) {
            this.f16236a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += K4.d(((Float) list.get(i11)).floatValue());
            }
            this.f16236a.U(i10);
            while (i9 < list.size()) {
                this.f16236a.G(((Float) list.get(i9)).floatValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.J(i8, ((Float) list.get(i9)).floatValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void M(int i8, int i9) {
        this.f16236a.y0(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void N(int i8, long j8) {
        this.f16236a.L(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void O(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f16236a.n(i8, (AbstractC2241s4) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void a(int i8) {
        this.f16236a.V(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void b(int i8, boolean z8) {
        this.f16236a.r(i8, z8);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void c(int i8, Object obj, Y5 y52) {
        this.f16236a.p(i8, (I5) obj, y52);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void d(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2121f5.size(); i11++) {
                    i10 += K4.k0(c2121f5.d(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2121f5.size()) {
                    this.f16236a.k(c2121f5.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2121f5.size()) {
                this.f16236a.l(i8, c2121f5.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.k0(((Integer) list.get(i13)).intValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.k(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.l(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void e(int i8, long j8) {
        this.f16236a.L(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void f(int i8, int i9) {
        this.f16236a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void g(int i8) {
        this.f16236a.V(i8, 3);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void h(int i8, List list, boolean z8) {
        if (list instanceof AbstractC2224q4) {
            android.support.v4.media.a.a(list);
            if (z8) {
                this.f16236a.V(i8, 2);
                throw null;
            }
            throw null;
        }
        int i9 = 0;
        if (z8) {
            this.f16236a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += K4.h(((Boolean) list.get(i11)).booleanValue());
            }
            this.f16236a.U(i10);
            while (i9 < list.size()) {
                this.f16236a.O(((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.r(i8, ((Boolean) list.get(i9)).booleanValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void i(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2242s5) {
            C2242s5 c2242s5 = (C2242s5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2242s5.size(); i11++) {
                    i10 += K4.a0(c2242s5.g(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2242s5.size()) {
                    this.f16236a.N(c2242s5.g(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2242s5.size()) {
                this.f16236a.L(i8, c2242s5.g(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.a0(((Long) list.get(i13)).longValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.N(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.L(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void j(int i8, int i9) {
        this.f16236a.K(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void k(int i8, long j8) {
        this.f16236a.m(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void l(int i8, Object obj) {
        if (obj instanceof AbstractC2241s4) {
            this.f16236a.M(i8, (AbstractC2241s4) obj);
        } else {
            this.f16236a.o(i8, (I5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void m(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2121f5.size(); i11++) {
                    i10 += K4.X(c2121f5.d(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2121f5.size()) {
                    this.f16236a.H(c2121f5.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2121f5.size()) {
                this.f16236a.K(i8, c2121f5.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.X(((Integer) list.get(i13)).intValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.H(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.K(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void n(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2242s5) {
            C2242s5 c2242s5 = (C2242s5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2242s5.size(); i11++) {
                    i10 += K4.j0(c2242s5.g(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2242s5.size()) {
                    this.f16236a.r0(c2242s5.g(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2242s5.size()) {
                this.f16236a.q0(i8, c2242s5.g(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.j0(((Long) list.get(i13)).longValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.r0(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.q0(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void o(int i8, List list, Y5 y52) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            c(i8, list.get(i9), y52);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void p(int i8, List list, boolean z8) {
        if (list instanceof M4) {
            android.support.v4.media.a.a(list);
            if (z8) {
                this.f16236a.V(i8, 2);
                throw null;
            }
            throw null;
        }
        int i9 = 0;
        if (z8) {
            this.f16236a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += K4.c(((Double) list.get(i11)).doubleValue());
            }
            this.f16236a.U(i10);
            while (i9 < list.size()) {
                this.f16236a.F(((Double) list.get(i9)).doubleValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.I(i8, ((Double) list.get(i9)).doubleValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void q(int i8, String str) {
        this.f16236a.q(i8, str);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void r(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2242s5) {
            C2242s5 c2242s5 = (C2242s5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2242s5.size(); i11++) {
                    i10 += K4.f0(c2242s5.g(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2242s5.size()) {
                    this.f16236a.s(c2242s5.g(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2242s5.size()) {
                this.f16236a.m(i8, c2242s5.g(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.f0(((Long) list.get(i13)).longValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.s(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.m(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void s(int i8, Object obj, Y5 y52) {
        K4 k42 = this.f16236a;
        k42.V(i8, 3);
        y52.g((I5) obj, k42.f16179a);
        k42.V(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void t(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2121f5) {
            C2121f5 c2121f5 = (C2121f5) list;
            if (z8) {
                this.f16236a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2121f5.size(); i11++) {
                    i10 += K4.o0(c2121f5.d(i11));
                }
                this.f16236a.U(i10);
                while (i9 < c2121f5.size()) {
                    this.f16236a.x0(c2121f5.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2121f5.size()) {
                this.f16236a.y0(i8, c2121f5.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16236a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += K4.o0(((Integer) list.get(i13)).intValue());
            }
            this.f16236a.U(i12);
            while (i9 < list.size()) {
                this.f16236a.x0(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16236a.y0(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void u(int i8, AbstractC2305z5 abstractC2305z5, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f16236a.V(i8, 2);
            this.f16236a.U(A5.a(abstractC2305z5, entry.getKey(), entry.getValue()));
            A5.b(this.f16236a, abstractC2305z5, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void v(int i8, int i9) {
        this.f16236a.K(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final int w() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void x(int i8, long j8) {
        this.f16236a.m(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void y(int i8, double d8) {
        this.f16236a.I(i8, d8);
    }

    @Override // com.google.android.gms.internal.measurement.N6
    public final void z(int i8, List list, Y5 y52) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            s(i8, list.get(i9), y52);
        }
    }
}
