package c.f.b.k.m;

import c.f.b.k.d;
import c.f.b.k.e;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public class b {
    private final ArrayList<c.f.b.k.e> a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private a f2546b = new a();

    /* renamed from: c, reason: collision with root package name */
    private c.f.b.k.f f2547c;

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static int f2548b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static int f2549c = 2;

        /* renamed from: d, reason: collision with root package name */
        public e.b f2550d;

        /* renamed from: e, reason: collision with root package name */
        public e.b f2551e;

        /* renamed from: f, reason: collision with root package name */
        public int f2552f;

        /* renamed from: g, reason: collision with root package name */
        public int f2553g;

        /* renamed from: h, reason: collision with root package name */
        public int f2554h;

        /* renamed from: i, reason: collision with root package name */
        public int f2555i;

        /* renamed from: j, reason: collision with root package name */
        public int f2556j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f2557k;
        public boolean l;
        public int m;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: c.f.b.k.m.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0055b {
        void a();

        void b(c.f.b.k.e eVar, a aVar);
    }

    public b(c.f.b.k.f fVar) {
        this.f2547c = fVar;
    }

    private boolean a(InterfaceC0055b interfaceC0055b, c.f.b.k.e eVar, int i2) {
        this.f2546b.f2550d = eVar.y();
        this.f2546b.f2551e = eVar.O();
        this.f2546b.f2552f = eVar.R();
        this.f2546b.f2553g = eVar.v();
        a aVar = this.f2546b;
        aVar.l = false;
        aVar.m = i2;
        e.b bVar = aVar.f2550d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar == bVar2;
        boolean z2 = aVar.f2551e == bVar2;
        boolean z3 = z && eVar.X > 0.0f;
        boolean z4 = z2 && eVar.X > 0.0f;
        if (z3 && eVar.s[0] == 4) {
            aVar.f2550d = e.b.FIXED;
        }
        if (z4 && eVar.s[1] == 4) {
            aVar.f2551e = e.b.FIXED;
        }
        interfaceC0055b.b(eVar, aVar);
        eVar.U0(this.f2546b.f2554h);
        eVar.v0(this.f2546b.f2555i);
        eVar.u0(this.f2546b.f2557k);
        eVar.k0(this.f2546b.f2556j);
        a aVar2 = this.f2546b;
        aVar2.m = a.a;
        return aVar2.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r5.X <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(c.f.b.k.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<c.f.b.k.e> r0 = r13.D0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.B1(r1)
            c.f.b.k.m.b$b r2 = r13.r1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto Laa
            java.util.ArrayList<c.f.b.k.e> r5 = r13.D0
            java.lang.Object r5 = r5.get(r4)
            c.f.b.k.e r5 = (c.f.b.k.e) r5
            boolean r6 = r5 instanceof c.f.b.k.g
            if (r6 == 0) goto L22
            goto La4
        L22:
            boolean r6 = r5 instanceof c.f.b.k.a
            if (r6 == 0) goto L28
            goto La4
        L28:
            boolean r6 = r5.c0()
            if (r6 == 0) goto L30
            goto La4
        L30:
            if (r1 == 0) goto L47
            c.f.b.k.m.l r6 = r5.f2534f
            if (r6 == 0) goto L47
            c.f.b.k.m.n r7 = r5.f2535g
            if (r7 == 0) goto L47
            c.f.b.k.m.g r6 = r6.f2608e
            boolean r6 = r6.f2575j
            if (r6 == 0) goto L47
            c.f.b.k.m.g r6 = r7.f2608e
            boolean r6 = r6.f2575j
            if (r6 == 0) goto L47
            goto La4
        L47:
            c.f.b.k.e$b r6 = r5.s(r3)
            r7 = 1
            c.f.b.k.e$b r8 = r5.s(r7)
            c.f.b.k.e$b r9 = c.f.b.k.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.q
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.r
            if (r10 == r7) goto L60
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.B1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof c.f.b.k.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.q
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.Z()
            if (r11 != 0) goto L7c
            r10 = 1
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.r
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.Z()
            if (r11 != 0) goto L8b
            r10 = 1
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.X
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La4
        L9b:
            int r6 = c.f.b.k.m.b.a.a
            r12.a(r2, r5, r6)
            c.f.b.e r5 = r13.I0
            if (r5 != 0) goto La8
        La4:
            int r4 = r4 + 1
            goto L12
        La8:
            r13 = 0
            throw r13
        Laa:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.m.b.b(c.f.b.k.f):void");
    }

    private void c(c.f.b.k.f fVar, String str, int i2, int i3) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.K0(0);
        fVar.J0(0);
        fVar.U0(i2);
        fVar.v0(i3);
        fVar.K0(G);
        fVar.J0(F);
        this.f2547c.b1();
    }

    public long d(c.f.b.k.f fVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean z;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        boolean z4;
        int i13;
        boolean z5;
        int i14;
        int i15;
        boolean z6;
        InterfaceC0055b r1 = fVar.r1();
        int size = fVar.D0.size();
        int R = fVar.R();
        int v = fVar.v();
        boolean b2 = c.f.b.k.j.b(i2, 128);
        boolean z7 = b2 || c.f.b.k.j.b(i2, 64);
        if (z7) {
            for (int i16 = 0; i16 < size; i16++) {
                c.f.b.k.e eVar = fVar.D0.get(i16);
                e.b y = eVar.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z8 = (y == bVar) && (eVar.O() == bVar) && eVar.t() > 0.0f;
                if ((eVar.Z() && z8) || ((eVar.b0() && z8) || (eVar instanceof c.f.b.k.k) || eVar.Z() || eVar.b0())) {
                    z7 = false;
                    break;
                }
            }
        }
        if (z7 && c.f.b.d.f2464g != null) {
            throw null;
        }
        boolean z9 = z7 & ((i5 == 1073741824 && i7 == 1073741824) || b2);
        if (z9) {
            int min = Math.min(fVar.E(), i6);
            int min2 = Math.min(fVar.D(), i8);
            if (i5 == 1073741824 && fVar.R() != min) {
                fVar.U0(min);
                fVar.u1();
            }
            if (i7 == 1073741824 && fVar.v() != min2) {
                fVar.v0(min2);
                fVar.u1();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                z = fVar.o1(b2);
                i11 = 2;
            } else {
                boolean p1 = fVar.p1(b2);
                if (i5 == 1073741824) {
                    p1 &= fVar.q1(b2, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    z = fVar.q1(b2, 1) & p1;
                    i11++;
                } else {
                    z = p1;
                }
            }
            if (z) {
                fVar.Y0(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            z = false;
            i11 = 0;
        }
        if (z && i11 == 2) {
            return 0L;
        }
        int s1 = fVar.s1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.a.size();
        if (size > 0) {
            c(fVar, "First pass", R, v);
        }
        if (size2 > 0) {
            e.b y2 = fVar.y();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z10 = y2 == bVar2;
            boolean z11 = fVar.O() == bVar2;
            int max = Math.max(fVar.R(), this.f2547c.G());
            int max2 = Math.max(fVar.v(), this.f2547c.F());
            int i17 = 0;
            boolean z12 = false;
            while (i17 < size2) {
                c.f.b.k.e eVar2 = this.a.get(i17);
                if (eVar2 instanceof c.f.b.k.k) {
                    int R2 = eVar2.R();
                    i14 = s1;
                    int v2 = eVar2.v();
                    i15 = R;
                    boolean a2 = a(r1, eVar2, a.f2548b) | z12;
                    if (fVar.I0 == null) {
                        int R3 = eVar2.R();
                        int v3 = eVar2.v();
                        if (R3 != R2) {
                            eVar2.U0(R3);
                            if (z10 && eVar2.K() > max) {
                                max = Math.max(max, eVar2.K() + eVar2.m(d.b.RIGHT).e());
                            }
                            z6 = true;
                        } else {
                            z6 = a2;
                        }
                        if (v3 != v2) {
                            eVar2.v0(v3);
                            if (z11 && eVar2.p() > max2) {
                                max2 = Math.max(max2, eVar2.p() + eVar2.m(d.b.BOTTOM).e());
                            }
                            z6 = true;
                        }
                        z12 = z6 | ((c.f.b.k.k) eVar2).d1();
                    } else {
                        throw null;
                    }
                } else {
                    i14 = s1;
                    i15 = R;
                }
                i17++;
                s1 = i14;
                R = i15;
            }
            int i18 = s1;
            int i19 = R;
            int i20 = 0;
            int i21 = 2;
            while (i20 < i21) {
                int i22 = 0;
                while (i22 < size2) {
                    c.f.b.k.e eVar3 = this.a.get(i22);
                    if (((eVar3 instanceof c.f.b.k.h) && !(eVar3 instanceof c.f.b.k.k)) || (eVar3 instanceof c.f.b.k.g) || eVar3.Q() == 8 || ((z9 && eVar3.f2534f.f2608e.f2575j && eVar3.f2535g.f2608e.f2575j) || (eVar3 instanceof c.f.b.k.k))) {
                        z4 = z9;
                        i13 = size2;
                    } else {
                        int R4 = eVar3.R();
                        int v4 = eVar3.v();
                        z4 = z9;
                        int n = eVar3.n();
                        int i23 = a.f2548b;
                        i13 = size2;
                        if (i20 == 1) {
                            i23 = a.f2549c;
                        }
                        boolean a3 = a(r1, eVar3, i23) | z12;
                        if (fVar.I0 == null) {
                            int R5 = eVar3.R();
                            int v5 = eVar3.v();
                            if (R5 != R4) {
                                eVar3.U0(R5);
                                if (z10 && eVar3.K() > max) {
                                    max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                                }
                                z5 = true;
                            } else {
                                z5 = a3;
                            }
                            if (v5 != v4) {
                                eVar3.v0(v5);
                                if (z11 && eVar3.p() > max2) {
                                    max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                                }
                                z5 = true;
                            }
                            z12 = (!eVar3.U() || n == eVar3.n()) ? z5 : true;
                        } else {
                            throw null;
                        }
                    }
                    i22++;
                    size2 = i13;
                    z9 = z4;
                }
                boolean z13 = z9;
                int i24 = size2;
                if (!z12) {
                    break;
                }
                c(fVar, "intermediate pass", i19, v);
                i20++;
                size2 = i24;
                z9 = z13;
                i21 = 2;
                z12 = false;
            }
            if (z12) {
                c(fVar, "2nd pass", i19, v);
                if (fVar.R() < max) {
                    fVar.U0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fVar.v() < max2) {
                    fVar.v0(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    c(fVar, "3rd pass", i19, v);
                }
            }
            i12 = i18;
        } else {
            i12 = s1;
        }
        fVar.E1(i12);
        return 0L;
    }

    public void e(c.f.b.k.f fVar) {
        this.a.clear();
        int size = fVar.D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            c.f.b.k.e eVar = fVar.D0.get(i2);
            e.b y = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y == bVar || eVar.O() == bVar) {
                this.a.add(eVar);
            }
        }
        fVar.u1();
    }
}
