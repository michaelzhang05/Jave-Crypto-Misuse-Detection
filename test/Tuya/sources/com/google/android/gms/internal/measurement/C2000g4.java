package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2000g4 implements G5 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1991f4 f15716a;

    private C2000g4(AbstractC1991f4 abstractC1991f4) {
        byte[] bArr = B4.f15272d;
        this.f15716a = abstractC1991f4;
        abstractC1991f4.f15703a = this;
    }

    public static C2000g4 K(AbstractC1991f4 abstractC1991f4) {
        C2000g4 c2000g4 = abstractC1991f4.f15703a;
        if (c2000g4 != null) {
            return c2000g4;
        }
        return new C2000g4(abstractC1991f4);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void A(int i8, X3 x32) {
        this.f15716a.g(i8, x32);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void B(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).intValue();
                i10 += 4;
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.i(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.h(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void C(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Double) list.get(i11)).doubleValue();
                i10 += 8;
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.k(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.j(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void D(int i8, long j8) {
        this.f15716a.s(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void E(int i8) {
        this.f15716a.p(i8, 3);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void F(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Float) list.get(i11)).floatValue();
                i10 += 4;
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.i(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.h(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void G(int i8, long j8) {
        this.f15716a.j(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void H(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += AbstractC1991f4.z((longValue >> 63) ^ (longValue + longValue));
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                AbstractC1991f4 abstractC1991f4 = this.f15716a;
                long longValue2 = ((Long) list.get(i9)).longValue();
                abstractC1991f4.t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            AbstractC1991f4 abstractC1991f42 = this.f15716a;
            long longValue3 = ((Long) list.get(i9)).longValue();
            abstractC1991f42.s(i8, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void I(int i8, long j8) {
        this.f15716a.s(i8, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void J(int i8) {
        this.f15716a.p(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void a(int i8, Object obj, InterfaceC2026j5 interfaceC2026j5) {
        AbstractC1991f4 abstractC1991f4 = this.f15716a;
        abstractC1991f4.p(i8, 3);
        interfaceC2026j5.b((Y4) obj, abstractC1991f4.f15703a);
        abstractC1991f4.p(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void b(int i8, int i9) {
        this.f15716a.q(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void c(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).longValue();
                i10 += 8;
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.k(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.j(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void d(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f15716a.g(i8, (X3) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void e(int i8, int i9) {
        this.f15716a.h(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void f(int i8, boolean z8) {
        this.f15716a.f(i8, z8);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void g(int i8, int i9) {
        this.f15716a.q(i8, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void h(int i8, String str) {
        this.f15716a.o(i8, str);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void i(int i8, long j8) {
        this.f15716a.s(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void j(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Boolean) list.get(i11)).booleanValue();
                i10++;
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.e(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.f(i8, ((Boolean) list.get(i9)).booleanValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void k(int i8, long j8) {
        this.f15716a.j(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void l(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC1991f4.y(((Integer) list.get(i11)).intValue());
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.r(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.q(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void m(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).intValue();
                i10 += 4;
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.i(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.h(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void n(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC1991f4.v(((Integer) list.get(i11)).intValue());
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.m(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.l(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void o(int i8, int i9) {
        this.f15716a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void p(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC1991f4.v(((Integer) list.get(i11)).intValue());
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.m(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.l(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void q(int i8, int i9) {
        this.f15716a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void r(int i8, List list) {
        int i9 = 0;
        if (list instanceof G4) {
            G4 g42 = (G4) list;
            while (i9 < list.size()) {
                Object o8 = g42.o(i9);
                if (o8 instanceof String) {
                    this.f15716a.o(i8, (String) o8);
                } else {
                    this.f15716a.g(i8, (X3) o8);
                }
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.o(i8, (String) list.get(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void s(int i8, double d8) {
        this.f15716a.j(i8, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void t(int i8, Object obj, InterfaceC2026j5 interfaceC2026j5) {
        Y4 y42 = (Y4) obj;
        C1964c4 c1964c4 = (C1964c4) this.f15716a;
        c1964c4.r((i8 << 3) | 2);
        c1964c4.r(((H3) y42).e(interfaceC2026j5));
        interfaceC2026j5.b(y42, c1964c4.f15703a);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void u(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).longValue();
                i10 += 8;
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.k(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.j(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void v(int i8, int i9) {
        this.f15716a.h(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void w(int i8, float f8) {
        this.f15716a.h(i8, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void x(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += AbstractC1991f4.y((intValue >> 31) ^ (intValue + intValue));
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                AbstractC1991f4 abstractC1991f4 = this.f15716a;
                int intValue2 = ((Integer) list.get(i9)).intValue();
                abstractC1991f4.r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            AbstractC1991f4 abstractC1991f42 = this.f15716a;
            int intValue3 = ((Integer) list.get(i9)).intValue();
            abstractC1991f42.q(i8, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void y(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC1991f4.z(((Long) list.get(i11)).longValue());
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.t(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.s(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final void z(int i8, List list, boolean z8) {
        int i9 = 0;
        if (z8) {
            this.f15716a.p(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC1991f4.z(((Long) list.get(i11)).longValue());
            }
            this.f15716a.r(i10);
            while (i9 < list.size()) {
                this.f15716a.t(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f15716a.s(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }
}
