package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class zziv implements zzid, zzio {

    /* renamed from: f, reason: collision with root package name */
    private long f15149f;

    /* renamed from: g, reason: collision with root package name */
    private int f15150g;

    /* renamed from: h, reason: collision with root package name */
    private long f15151h;

    /* renamed from: i, reason: collision with root package name */
    private int f15152i;

    /* renamed from: j, reason: collision with root package name */
    private zzkm f15153j;

    /* renamed from: k, reason: collision with root package name */
    private int f15154k;
    private int l;
    private int m;
    private zzif n;
    private zz[] o;

    /* renamed from: c, reason: collision with root package name */
    private final zzkm f15146c = new zzkm(16);

    /* renamed from: d, reason: collision with root package name */
    private final Stack<zzir> f15147d = new Stack<>();
    private final zzkm a = new zzkm(zzkj.a);

    /* renamed from: b, reason: collision with root package name */
    private final zzkm f15145b = new zzkm(4);

    /* renamed from: e, reason: collision with root package name */
    private int f15148e = 0;

    @Override // com.google.android.gms.internal.ads.zzid
    public final int a(zzie zzieVar, zzij zzijVar) throws IOException, InterruptedException {
        zz[] zzVarArr;
        int i2;
        long j2;
        zzir zzirVar;
        boolean z;
        zziv zzivVar;
        ArrayList arrayList;
        int i3;
        zzix a;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long n;
        zzkm zzkmVar;
        zzkm zzkmVar2;
        int i13;
        zzkm zzkmVar3;
        int i14;
        int i15;
        int i16;
        boolean z2;
        zziv zzivVar2 = this;
        zzie zzieVar2 = zzieVar;
        zzij zzijVar2 = zzijVar;
        while (true) {
            int i17 = zzivVar2.f15148e;
            if (i17 == 0) {
                zziv zzivVar3 = zzivVar2;
                if (zzieVar.b(zzivVar3.f15146c.a, 0, 8, true)) {
                    zzivVar3.f15146c.g(0);
                    zzivVar3.f15151h = zzivVar3.f15146c.k();
                    zzivVar3.f15150g = zzivVar3.f15146c.c();
                    if (zzivVar3.f15151h == 1) {
                        zzieVar.readFully(zzivVar3.f15146c.a, 8, 8);
                        zzivVar3.f15151h = zzivVar3.f15146c.d();
                        zzivVar3.f15149f += 16;
                        zzivVar3.f15152i = 16;
                    } else {
                        zzivVar3.f15149f += 8;
                        zzivVar3.f15152i = 8;
                    }
                    int i18 = zzivVar3.f15150g;
                    if (i18 == wz.p || i18 == wz.r || i18 == wz.s || i18 == wz.t || i18 == wz.u) {
                        if (zzivVar3.f15151h == 1) {
                            zzivVar3.f15147d.add(new zzir(zzivVar3.f15150g, (zzivVar3.f15149f + zzivVar3.f15151h) - zzivVar3.f15152i));
                        } else {
                            zzivVar3.f15147d.add(new zzir(zzivVar3.f15150g, (zzivVar3.f15149f + zzivVar3.f15151h) - zzivVar3.f15152i));
                        }
                        zzivVar3.f15148e = 0;
                    } else {
                        if (i18 == wz.A || i18 == wz.q || i18 == wz.B || i18 == wz.Q || i18 == wz.R || i18 == wz.C || i18 == wz.f12352b || i18 == wz.v || i18 == wz.f12356f || i18 == wz.f12354d || i18 == wz.T || i18 == wz.U || i18 == wz.V || i18 == wz.W || i18 == wz.X || i18 == wz.Y || i18 == wz.Z || i18 == wz.z) {
                            zzkh.d(zzivVar3.f15151h < 2147483647L);
                            zzkm zzkmVar4 = new zzkm((int) zzivVar3.f15151h);
                            zzivVar3.f15153j = zzkmVar4;
                            System.arraycopy(zzivVar3.f15146c.a, 0, zzkmVar4.a, 0, 8);
                            zzivVar3.f15148e = 1;
                        } else {
                            zzivVar3.f15153j = null;
                            zzivVar3.f15148e = 1;
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return -1;
                }
                zzijVar2 = zzijVar;
                zzivVar2 = zzivVar3;
                zzieVar2 = zzieVar;
            } else {
                if (i17 != 1) {
                    long j3 = Long.MAX_VALUE;
                    int i19 = 0;
                    int i20 = -1;
                    while (true) {
                        zzVarArr = zzivVar2.o;
                        if (i19 >= zzVarArr.length) {
                            break;
                        }
                        zz zzVar = zzVarArr[i19];
                        int i21 = zzVar.f12552d;
                        a00 a00Var = zzVar.f12550b;
                        if (i21 != a00Var.a) {
                            long j4 = a00Var.f11039b[i21];
                            if (j4 < j3) {
                                i20 = i19;
                                j3 = j4;
                            }
                        }
                        i19++;
                    }
                    if (i20 == -1) {
                        return -1;
                    }
                    zz zzVar2 = zzVarArr[i20];
                    int i22 = zzVar2.f12552d;
                    long j5 = zzVar2.f12550b.f11039b[i22];
                    long position = (j5 - zzieVar.getPosition()) + zzivVar2.l;
                    if (position < 0) {
                        i2 = 1;
                        j2 = j5;
                    } else {
                        if (position < 262144) {
                            zzieVar2.a((int) position);
                            zzivVar2.f15154k = zzVar2.f12550b.f11040c[i22];
                            int i23 = zzVar2.a.f15160g;
                            if (i23 == -1) {
                                while (true) {
                                    int i24 = zzivVar2.l;
                                    int i25 = zzivVar2.f15154k;
                                    if (i24 >= i25) {
                                        break;
                                    }
                                    int a2 = zzVar2.f12551c.a(zzieVar2, i25 - i24);
                                    zzivVar2.l += a2;
                                    zzivVar2.m -= a2;
                                }
                            } else {
                                byte[] bArr = zzivVar2.f15145b.a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i26 = 4 - i23;
                                while (zzivVar2.l < zzivVar2.f15154k) {
                                    int i27 = zzivVar2.m;
                                    if (i27 == 0) {
                                        zzieVar2.readFully(zzivVar2.f15145b.a, i26, i23);
                                        zzivVar2.f15145b.g(0);
                                        zzivVar2.m = zzivVar2.f15145b.m();
                                        zzivVar2.a.g(0);
                                        zzVar2.f12551c.c(zzivVar2.a, 4);
                                        zzivVar2.l += 4;
                                        zzivVar2.f15154k += i26;
                                    } else {
                                        int a3 = zzVar2.f12551c.a(zzieVar2, i27);
                                        zzivVar2.l += a3;
                                        zzivVar2.m -= a3;
                                    }
                                }
                            }
                            zzip zzipVar = zzVar2.f12551c;
                            a00 a00Var2 = zzVar2.f12550b;
                            zzipVar.d(a00Var2.f11041d[i22], a00Var2.f11042e[i22], zzivVar2.f15154k, 0, null);
                            zzVar2.f12552d++;
                            zzivVar2.l = 0;
                            zzivVar2.m = 0;
                            return 0;
                        }
                        j2 = j5;
                        i2 = 1;
                    }
                    zzijVar2.a = j2;
                    return i2;
                }
                zzivVar2.f15148e = 0;
                long j6 = zzivVar2.f15149f;
                long j7 = zzivVar2.f15151h;
                int i28 = zzivVar2.f15152i;
                long j8 = j6 + (j7 - i28);
                zzivVar2.f15149f = j8;
                long j9 = j7 - i28;
                zzkm zzkmVar5 = zzivVar2.f15153j;
                boolean z3 = zzkmVar5 == null && (j7 >= 262144 || j7 > 2147483647L);
                if (z3) {
                    zzijVar2.a = j8;
                } else if (zzkmVar5 != null) {
                    zzieVar2.readFully(zzkmVar5.a, i28, (int) j9);
                    if (!zzivVar2.f15147d.isEmpty()) {
                        zzivVar2.f15147d.peek().c0.add(new zzis(zzivVar2.f15150g, zzivVar2.f15153j));
                    }
                } else {
                    zzieVar2.a((int) j9);
                }
                while (!zzivVar2.f15147d.isEmpty() && zzivVar2.f15147d.peek().b0 == zzivVar2.f15149f) {
                    zzir pop = zzivVar2.f15147d.pop();
                    if (pop.a0 == wz.p) {
                        ArrayList arrayList2 = new ArrayList();
                        int i29 = 0;
                        while (i29 < pop.d0.size()) {
                            zzir zzirVar2 = pop.d0.get(i29);
                            if (zzirVar2.a0 == wz.r && (a = xz.a(zzirVar2, pop.c(wz.q))) != null && ((i4 = a.f15155b) == 1936684398 || i4 == 1986618469)) {
                                zzir d2 = zzirVar2.d(wz.s).d(wz.t).d(wz.u);
                                zzkm zzkmVar6 = d2.c(wz.X).b0;
                                int i30 = wz.Y;
                                zzis c2 = d2.c(i30);
                                if (c2 == null) {
                                    c2 = d2.c(wz.Z);
                                }
                                zzkm zzkmVar7 = c2.b0;
                                zzkm zzkmVar8 = d2.c(wz.W).b0;
                                zzkm zzkmVar9 = d2.c(wz.T).b0;
                                zzis c3 = d2.c(wz.U);
                                zzkm zzkmVar10 = c3 != null ? c3.b0 : null;
                                zzis c4 = d2.c(wz.V);
                                zzkm zzkmVar11 = c4 != null ? c4.b0 : null;
                                zzkmVar6.g(12);
                                int m = zzkmVar6.m();
                                int m2 = zzkmVar6.m();
                                int[] iArr = new int[m2];
                                z = z3;
                                long[] jArr = new long[m2];
                                zzirVar = pop;
                                long[] jArr2 = new long[m2];
                                ArrayList arrayList3 = arrayList2;
                                int[] iArr2 = new int[m2];
                                int i31 = i29;
                                zzkmVar7.g(12);
                                int m3 = zzkmVar7.m();
                                zzkmVar8.g(12);
                                int m4 = zzkmVar8.m() - 1;
                                int i32 = m3;
                                if (zzkmVar8.c() == 1) {
                                    int m5 = zzkmVar8.m();
                                    zzkmVar8.h(4);
                                    if (m4 > 0) {
                                        i7 = zzkmVar8.m() - 1;
                                        i5 = m5;
                                        i6 = 12;
                                    } else {
                                        i5 = m5;
                                        i6 = 12;
                                        i7 = -1;
                                    }
                                    zzkmVar9.g(i6);
                                    int m6 = zzkmVar9.m() - 1;
                                    int m7 = zzkmVar9.m();
                                    int m8 = zzkmVar9.m();
                                    if (zzkmVar11 != null) {
                                        zzkmVar11.g(i6);
                                        i8 = zzkmVar11.m() - 1;
                                        i9 = zzkmVar11.m();
                                        i10 = zzkmVar11.c();
                                    } else {
                                        i8 = 0;
                                        i9 = 0;
                                        i10 = 0;
                                    }
                                    if (zzkmVar10 != null) {
                                        zzkmVar10.g(i6);
                                        int m9 = zzkmVar10.m();
                                        i11 = zzkmVar10.m() - 1;
                                        i12 = m9;
                                    } else {
                                        i11 = -1;
                                        i12 = 0;
                                    }
                                    if (c2.a0 == i30) {
                                        n = zzkmVar7.k();
                                    } else {
                                        n = zzkmVar7.n();
                                    }
                                    int i33 = i12;
                                    long j10 = n;
                                    int i34 = 0;
                                    long j11 = 0;
                                    int i35 = i7;
                                    int i36 = i11;
                                    int i37 = 0;
                                    int i38 = i9;
                                    zzkm zzkmVar12 = zzkmVar8;
                                    int i39 = m8;
                                    int i40 = m6;
                                    int i41 = m4;
                                    int i42 = i10;
                                    int i43 = i8;
                                    int i44 = m7;
                                    int i45 = i5;
                                    while (i37 < m2) {
                                        jArr2[i37] = j10;
                                        iArr[i37] = m == 0 ? zzkmVar6.m() : m;
                                        zzkm zzkmVar13 = zzkmVar6;
                                        int i46 = i34;
                                        jArr[i37] = j11 + i42;
                                        iArr2[i37] = zzkmVar10 == null ? 1 : 0;
                                        if (i37 == i36) {
                                            iArr2[i37] = 1;
                                            i33--;
                                            if (i33 > 0) {
                                                i36 = zzkmVar10.m() - 1;
                                            }
                                        }
                                        j11 += i39;
                                        i44--;
                                        if (i44 == 0 && i40 > 0) {
                                            i40--;
                                            i44 = zzkmVar9.m();
                                            i39 = zzkmVar9.m();
                                        }
                                        if (zzkmVar11 != null && i38 - 1 == 0 && i43 > 0) {
                                            i43--;
                                            i38 = zzkmVar11.m();
                                            i42 = zzkmVar11.c();
                                        }
                                        i5--;
                                        if (i5 == 0) {
                                            i34 = i46 + 1;
                                            i13 = i32;
                                            i14 = i33;
                                            if (i34 < i13) {
                                                zzkmVar = zzkmVar11;
                                                if (c2.a0 == wz.Y) {
                                                    j10 = zzkmVar7.k();
                                                } else {
                                                    j10 = zzkmVar7.n();
                                                }
                                            } else {
                                                zzkmVar = zzkmVar11;
                                            }
                                            i15 = i35;
                                            if (i34 == i15) {
                                                i45 = zzkmVar12.m();
                                                zzkmVar2 = zzkmVar10;
                                                zzkmVar3 = zzkmVar12;
                                                zzkmVar3.h(4);
                                                i41--;
                                                if (i41 > 0) {
                                                    i15 = zzkmVar3.m() - 1;
                                                }
                                            } else {
                                                zzkmVar2 = zzkmVar10;
                                                zzkmVar3 = zzkmVar12;
                                            }
                                            i16 = m2;
                                            if (i34 < i13) {
                                                i5 = i45;
                                            }
                                        } else {
                                            zzkmVar = zzkmVar11;
                                            zzkmVar2 = zzkmVar10;
                                            i13 = i32;
                                            zzkmVar3 = zzkmVar12;
                                            i14 = i33;
                                            i15 = i35;
                                            i16 = m2;
                                            j10 += iArr[i37];
                                            i34 = i46;
                                        }
                                        i37++;
                                        i35 = i15;
                                        zzkmVar10 = zzkmVar2;
                                        i33 = i14;
                                        m2 = i16;
                                        zzkmVar12 = zzkmVar3;
                                        i32 = i13;
                                        zzkmVar6 = zzkmVar13;
                                        zzkmVar11 = zzkmVar;
                                    }
                                    zzkq.c(jArr, 1000000L, a.f15156c);
                                    zzkh.a(i33 == 0);
                                    zzkh.a(i44 == 0);
                                    zzkh.a(i5 == 0);
                                    zzkh.a(i40 == 0);
                                    zzkh.a(i43 == 0);
                                    a00 a00Var3 = new a00(jArr2, iArr, jArr, iArr2);
                                    if (a00Var3.a != 0) {
                                        zzivVar = this;
                                        i3 = i31;
                                        zz zzVar3 = new zz(a, a00Var3, zzivVar.n.e(i3));
                                        zzVar3.f12551c.b(a.f15158e);
                                        arrayList = arrayList3;
                                        arrayList.add(zzVar3);
                                    } else {
                                        zzivVar = this;
                                        arrayList = arrayList3;
                                        i3 = i31;
                                    }
                                } else {
                                    throw new IllegalStateException("stsc first chunk must be 1");
                                }
                            } else {
                                zzirVar = pop;
                                z = z3;
                                zzivVar = zzivVar2;
                                arrayList = arrayList2;
                                i3 = i29;
                            }
                            i29 = i3 + 1;
                            arrayList2 = arrayList;
                            zzivVar2 = zzivVar;
                            z3 = z;
                            pop = zzirVar;
                        }
                        zziv zzivVar4 = zzivVar2;
                        zzivVar4.o = (zz[]) arrayList2.toArray(new zz[0]);
                        zzivVar4.n.c();
                        zzivVar4.n.g(zzivVar4);
                        zzivVar4.f15148e = 2;
                        zzivVar2 = zzivVar4;
                    } else {
                        boolean z4 = z3;
                        zziv zzivVar5 = zzivVar2;
                        if (!zzivVar5.f15147d.isEmpty()) {
                            zzivVar5.f15147d.peek().d0.add(pop);
                        }
                        zzivVar2 = zzivVar5;
                        z3 = z4;
                    }
                }
                zziv zzivVar6 = zzivVar2;
                if (z3) {
                    return 1;
                }
                zzieVar2 = zzieVar;
                zzijVar2 = zzijVar;
                zzivVar2 = zzivVar6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final long b(long j2) {
        int i2;
        long j3 = Long.MAX_VALUE;
        int i3 = 0;
        while (true) {
            zz[] zzVarArr = this.o;
            if (i3 >= zzVarArr.length) {
                return j3;
            }
            a00 a00Var = zzVarArr[i3].f12550b;
            int a = zzkq.a(a00Var.f11041d, j2, true, false);
            while (true) {
                i2 = -1;
                if (a < 0) {
                    a = -1;
                    break;
                }
                if (a00Var.f11041d[a] <= j2 && (a00Var.f11042e[a] & 1) != 0) {
                    break;
                }
                a--;
            }
            if (a == -1) {
                int h2 = zzkq.h(a00Var.f11041d, j2, true, false);
                while (true) {
                    long[] jArr = a00Var.f11041d;
                    if (h2 < jArr.length) {
                        if (jArr[h2] >= j2 && (a00Var.f11042e[h2] & 1) != 0) {
                            i2 = h2;
                            break;
                        }
                        h2++;
                    } else {
                        break;
                    }
                }
                a = i2;
            }
            zz[] zzVarArr2 = this.o;
            zzVarArr2[i3].f12552d = a;
            long j4 = a00Var.f11039b[zzVarArr2[i3].f12552d];
            if (j4 < j3) {
                j3 = j4;
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    public final void d(zzif zzifVar) {
        this.n = zzifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    public final void e() {
        this.f15149f = 0L;
        this.l = 0;
        this.m = 0;
    }
}
