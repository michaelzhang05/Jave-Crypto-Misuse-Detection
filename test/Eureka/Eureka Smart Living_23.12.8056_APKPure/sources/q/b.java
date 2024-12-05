package q;

import java.util.ArrayList;
import p.d;
import p.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f8894a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private a f8895b = new a();

    /* renamed from: c, reason: collision with root package name */
    private p.f f8896c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public e.b f8897a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f8898b;

        /* renamed from: c, reason: collision with root package name */
        public int f8899c;

        /* renamed from: d, reason: collision with root package name */
        public int f8900d;

        /* renamed from: e, reason: collision with root package name */
        public int f8901e;

        /* renamed from: f, reason: collision with root package name */
        public int f8902f;

        /* renamed from: g, reason: collision with root package name */
        public int f8903g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f8904h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f8905i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f8906j;
    }

    /* renamed from: q.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0132b {
        void a();

        void b(p.e eVar, a aVar);
    }

    public b(p.f fVar) {
        this.f8896c = fVar;
    }

    private boolean a(InterfaceC0132b interfaceC0132b, p.e eVar, boolean z5) {
        this.f8895b.f8897a = eVar.y();
        this.f8895b.f8898b = eVar.M();
        this.f8895b.f8899c = eVar.P();
        this.f8895b.f8900d = eVar.v();
        a aVar = this.f8895b;
        aVar.f8905i = false;
        aVar.f8906j = z5;
        e.b bVar = aVar.f8897a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z6 = bVar == bVar2;
        boolean z7 = aVar.f8898b == bVar2;
        boolean z8 = z6 && eVar.Q > 0.0f;
        boolean z9 = z7 && eVar.Q > 0.0f;
        if (z8 && eVar.f8667n[0] == 4) {
            aVar.f8897a = e.b.FIXED;
        }
        if (z9 && eVar.f8667n[1] == 4) {
            aVar.f8898b = e.b.FIXED;
        }
        interfaceC0132b.b(eVar, aVar);
        eVar.E0(this.f8895b.f8901e);
        eVar.h0(this.f8895b.f8902f);
        eVar.g0(this.f8895b.f8904h);
        eVar.b0(this.f8895b.f8903g);
        a aVar2 = this.f8895b;
        aVar2.f8906j = false;
        return aVar2.f8905i;
    }

    private void b(p.f fVar) {
        int size = fVar.f8736w0.size();
        InterfaceC0132b U0 = fVar.U0();
        for (int i6 = 0; i6 < size; i6++) {
            p.e eVar = (p.e) fVar.f8736w0.get(i6);
            if (!(eVar instanceof p.h) && (!eVar.f8649e.f8957e.f8927j || !eVar.f8651f.f8957e.f8927j)) {
                e.b s5 = eVar.s(0);
                e.b s6 = eVar.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (!(s5 == bVar && eVar.f8663l != 1 && s6 == bVar && eVar.f8665m != 1)) {
                    a(U0, eVar, false);
                }
            }
        }
        U0.a();
    }

    private void c(p.f fVar, String str, int i6, int i7) {
        int E = fVar.E();
        int D = fVar.D();
        fVar.u0(0);
        fVar.t0(0);
        fVar.E0(i6);
        fVar.h0(i7);
        fVar.u0(E);
        fVar.t0(D);
        this.f8896c.K0();
    }

    public long d(p.f fVar, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        boolean z5;
        int i15;
        boolean z6;
        boolean z7;
        int i16;
        int i17;
        InterfaceC0132b interfaceC0132b;
        int i18;
        boolean z8;
        boolean z9;
        int i19;
        InterfaceC0132b U0 = fVar.U0();
        int size = fVar.f8736w0.size();
        int P = fVar.P();
        int v5 = fVar.v();
        boolean b6 = p.k.b(i6, 128);
        boolean z10 = b6 || p.k.b(i6, 64);
        if (z10) {
            for (int i20 = 0; i20 < size; i20++) {
                p.e eVar = (p.e) fVar.f8736w0.get(i20);
                e.b y5 = eVar.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z11 = (y5 == bVar) && (eVar.M() == bVar) && eVar.t() > 0.0f;
                if ((eVar.V() && z11) || ((eVar.X() && z11) || (eVar instanceof p.l) || eVar.V() || eVar.X())) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            boolean z12 = o.d.f8134r;
        }
        if (z10 && ((i9 == 1073741824 && i11 == 1073741824) || b6)) {
            int min = Math.min(fVar.C(), i10);
            int min2 = Math.min(fVar.B(), i12);
            if (i9 == 1073741824 && fVar.P() != min) {
                fVar.E0(min);
                fVar.X0();
            }
            if (i11 == 1073741824 && fVar.v() != min2) {
                fVar.h0(min2);
                fVar.X0();
            }
            if (i9 == 1073741824 && i11 == 1073741824) {
                z5 = fVar.R0(b6);
                i15 = 2;
            } else {
                boolean S0 = fVar.S0(b6);
                if (i9 == 1073741824) {
                    z9 = S0 & fVar.T0(b6, 0);
                    i19 = 1;
                } else {
                    z9 = S0;
                    i19 = 0;
                }
                if (i11 == 1073741824) {
                    boolean T0 = fVar.T0(b6, 1) & z9;
                    i15 = i19 + 1;
                    z5 = T0;
                } else {
                    i15 = i19;
                    z5 = z9;
                }
            }
            if (z5) {
                fVar.I0(i9 == 1073741824, i11 == 1073741824);
            }
        } else {
            z5 = false;
            i15 = 0;
        }
        if (z5 && i15 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(fVar);
        }
        int V0 = fVar.V0();
        int size2 = this.f8894a.size();
        if (size > 0) {
            c(fVar, "First pass", P, v5);
        }
        if (size2 > 0) {
            e.b y6 = fVar.y();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z13 = y6 == bVar2;
            boolean z14 = fVar.M() == bVar2;
            int max = Math.max(fVar.P(), this.f8896c.E());
            int max2 = Math.max(fVar.v(), this.f8896c.D());
            int i21 = 0;
            boolean z15 = false;
            while (i21 < size2) {
                p.e eVar2 = (p.e) this.f8894a.get(i21);
                if (eVar2 instanceof p.l) {
                    int P2 = eVar2.P();
                    int v6 = eVar2.v();
                    i18 = V0;
                    boolean a6 = z15 | a(U0, eVar2, true);
                    int P3 = eVar2.P();
                    int v7 = eVar2.v();
                    if (P3 != P2) {
                        eVar2.E0(P3);
                        if (z13 && eVar2.I() > max) {
                            max = Math.max(max, eVar2.I() + eVar2.m(d.b.RIGHT).c());
                        }
                        z8 = true;
                    } else {
                        z8 = a6;
                    }
                    if (v7 != v6) {
                        eVar2.h0(v7);
                        if (z14 && eVar2.p() > max2) {
                            max2 = Math.max(max2, eVar2.p() + eVar2.m(d.b.BOTTOM).c());
                        }
                        z8 = true;
                    }
                    z15 = z8 | ((p.l) eVar2).V0();
                } else {
                    i18 = V0;
                }
                i21++;
                V0 = i18;
            }
            int i22 = V0;
            int i23 = 0;
            while (i23 < 2) {
                int i24 = 0;
                while (i24 < size2) {
                    p.e eVar3 = (p.e) this.f8894a.get(i24);
                    if (((eVar3 instanceof p.i) && !(eVar3 instanceof p.l)) || (eVar3 instanceof p.h) || eVar3.O() == 8 || ((eVar3.f8649e.f8957e.f8927j && eVar3.f8651f.f8957e.f8927j) || (eVar3 instanceof p.l))) {
                        i17 = i23;
                        i16 = size2;
                        interfaceC0132b = U0;
                    } else {
                        int P4 = eVar3.P();
                        int v8 = eVar3.v();
                        i16 = size2;
                        int n6 = eVar3.n();
                        i17 = i23;
                        z15 |= a(U0, eVar3, true);
                        int P5 = eVar3.P();
                        interfaceC0132b = U0;
                        int v9 = eVar3.v();
                        if (P5 != P4) {
                            eVar3.E0(P5);
                            if (z13 && eVar3.I() > max) {
                                max = Math.max(max, eVar3.I() + eVar3.m(d.b.RIGHT).c());
                            }
                            z15 = true;
                        }
                        if (v9 != v8) {
                            eVar3.h0(v9);
                            if (z14 && eVar3.p() > max2) {
                                max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).c());
                            }
                            z15 = true;
                        }
                        if (eVar3.S() && n6 != eVar3.n()) {
                            z15 = true;
                        }
                    }
                    i24++;
                    size2 = i16;
                    U0 = interfaceC0132b;
                    i23 = i17;
                }
                int i25 = i23;
                int i26 = size2;
                InterfaceC0132b interfaceC0132b2 = U0;
                if (z15) {
                    c(fVar, "intermediate pass", P, v5);
                    z15 = false;
                }
                i23 = i25 + 1;
                size2 = i26;
                U0 = interfaceC0132b2;
            }
            if (z15) {
                c(fVar, "2nd pass", P, v5);
                if (fVar.P() < max) {
                    fVar.E0(max);
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (fVar.v() < max2) {
                    fVar.h0(max2);
                    z7 = true;
                } else {
                    z7 = z6;
                }
                if (z7) {
                    c(fVar, "3rd pass", P, v5);
                }
            }
            V0 = i22;
        }
        fVar.g1(V0);
        return 0L;
    }

    public void e(p.f fVar) {
        int i6;
        this.f8894a.clear();
        int size = fVar.f8736w0.size();
        while (i6 < size) {
            p.e eVar = (p.e) fVar.f8736w0.get(i6);
            e.b y5 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y5 != bVar) {
                e.b y6 = eVar.y();
                e.b bVar2 = e.b.MATCH_PARENT;
                i6 = (y6 == bVar2 || eVar.M() == bVar || eVar.M() == bVar2) ? 0 : i6 + 1;
            }
            this.f8894a.add(eVar);
        }
        fVar.X0();
    }
}
