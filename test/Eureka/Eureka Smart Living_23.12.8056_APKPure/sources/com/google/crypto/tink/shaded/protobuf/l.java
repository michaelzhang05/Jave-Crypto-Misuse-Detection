package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.crypto.tink.shaded.protobuf.p1;
import com.google.crypto.tink.shaded.protobuf.q1;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l implements q1 {

    /* renamed from: a, reason: collision with root package name */
    private final k f5542a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5543a;

        static {
            int[] iArr = new int[p1.b.values().length];
            f5543a = iArr;
            try {
                iArr[p1.b.f5595j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5543a[p1.b.f5594i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5543a[p1.b.f5592g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5543a[p1.b.f5602q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5543a[p1.b.f5604s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5543a[p1.b.f5600o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5543a[p1.b.f5593h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5543a[p1.b.f5590e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5543a[p1.b.f5603r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5543a[p1.b.f5605t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5543a[p1.b.f5591f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5543a[p1.b.f5596k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private l(k kVar) {
        k kVar2 = (k) z.b(kVar, "output");
        this.f5542a = kVar2;
        kVar2.f5530a = this;
    }

    public static l P(k kVar) {
        l lVar = kVar.f5530a;
        return lVar != null ? lVar : new l(kVar);
    }

    private void Q(int i6, h0.a aVar, Map map) {
        int[] iArr = a.f5543a;
        throw null;
    }

    private void R(int i6, Object obj) {
        if (obj instanceof String) {
            this.f5542a.C0(i6, (String) obj);
        } else {
            this.f5542a.a0(i6, (h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void A(int i6, int i7) {
        this.f5542a.d0(i6, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void B(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.p0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.w(((Long) list.get(i9)).longValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.q0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void C(int i6, int i7) {
        this.f5542a.f0(i6, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void D(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.d0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.k(((Integer) list.get(i9)).intValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.e0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void E(int i6, double d6) {
        this.f5542a.b0(i6, d6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void F(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.b0(i6, ((Double) list.get(i7)).doubleValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.i(((Double) list.get(i9)).doubleValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.c0(((Double) list.get(i7)).doubleValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void G(int i6, Object obj, d1 d1Var) {
        this.f5542a.l0(i6, (o0) obj, d1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void H(int i6, long j6) {
        this.f5542a.w0(i6, j6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void I(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.w0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.E(((Long) list.get(i9)).longValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.x0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void J(int i6, int i7) {
        this.f5542a.y0(i6, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void K(int i6, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            this.f5542a.a0(i6, (h) list.get(i7));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void L(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.f0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.m(((Integer) list.get(i9)).intValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.g0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void M(int i6, Object obj, d1 d1Var) {
        this.f5542a.r0(i6, (o0) obj, d1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void N(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.G0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.P(((Long) list.get(i9)).longValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.H0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void O(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.Y(i6, ((Boolean) list.get(i7)).booleanValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.e(((Boolean) list.get(i9)).booleanValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.Z(((Boolean) list.get(i7)).booleanValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void a(int i6, h hVar) {
        this.f5542a.a0(i6, hVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void b(int i6, List list, d1 d1Var) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            G(i6, list.get(i7), d1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void c(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.n0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.u(((Integer) list.get(i9)).intValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.o0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void d(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.j0(i6, ((Float) list.get(i7)).floatValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.q(((Float) list.get(i9)).floatValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.k0(((Float) list.get(i7)).floatValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void e(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.E0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.N(((Integer) list.get(i9)).intValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.F0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void f(int i6, long j6) {
        this.f5542a.p0(i6, j6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void g(int i6, h0.a aVar, Map map) {
        if (this.f5542a.T()) {
            Q(i6, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f5542a.D0(i6, 2);
            this.f5542a.F0(h0.a(aVar, entry.getKey(), entry.getValue()));
            h0.b(this.f5542a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void h(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.A0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.I(((Long) list.get(i9)).longValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.B0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void i(int i6, boolean z5) {
        this.f5542a.Y(i6, z5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void j(int i6, long j6) {
        this.f5542a.h0(i6, j6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void k(int i6, int i7) {
        this.f5542a.E0(i6, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void l(int i6, List list, d1 d1Var) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            M(i6, list.get(i7), d1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void m(int i6, Object obj) {
        if (obj instanceof h) {
            this.f5542a.t0(i6, (h) obj);
        } else {
            this.f5542a.s0(i6, (o0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public q1.a n() {
        return q1.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void o(int i6, long j6) {
        this.f5542a.A0(i6, j6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void p(int i6, float f6) {
        this.f5542a.j0(i6, f6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void q(int i6, List list) {
        int i7 = 0;
        if (!(list instanceof d0)) {
            while (i7 < list.size()) {
                this.f5542a.C0(i6, (String) list.get(i7));
                i7++;
            }
        } else {
            d0 d0Var = (d0) list;
            while (i7 < list.size()) {
                R(i6, d0Var.c(i7));
                i7++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void r(int i6, int i7) {
        this.f5542a.u0(i6, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void s(int i6) {
        this.f5542a.D0(i6, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void t(int i6) {
        this.f5542a.D0(i6, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void u(int i6, String str) {
        this.f5542a.C0(i6, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void v(int i6, int i7) {
        this.f5542a.n0(i6, i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void w(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.y0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.G(((Integer) list.get(i9)).intValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.z0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void x(int i6, long j6) {
        this.f5542a.G0(i6, j6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void y(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.h0(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.o(((Long) list.get(i9)).longValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.i0(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public void z(int i6, List list, boolean z5) {
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                this.f5542a.u0(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        this.f5542a.D0(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            i8 += k.C(((Integer) list.get(i9)).intValue());
        }
        this.f5542a.F0(i8);
        while (i7 < list.size()) {
            this.f5542a.v0(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }
}
