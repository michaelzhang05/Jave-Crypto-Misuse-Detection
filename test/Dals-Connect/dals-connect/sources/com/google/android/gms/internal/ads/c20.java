package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import cm.aptoide.pt.root.execution.Command;
import com.google.android.gms.internal.ads.zzpo;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class c20 {
    private static final int a = zzsy.i("vide");

    /* renamed from: b, reason: collision with root package name */
    private static final int f11199b = zzsy.i("soun");

    /* renamed from: c, reason: collision with root package name */
    private static final int f11200c = zzsy.i(Command.CommandHandler.TEXT);

    /* renamed from: d, reason: collision with root package name */
    private static final int f11201d = zzsy.i("sbtl");

    /* renamed from: e, reason: collision with root package name */
    private static final int f11202e = zzsy.i("subt");

    /* renamed from: f, reason: collision with root package name */
    private static final int f11203f = zzsy.i("clcp");

    /* renamed from: g, reason: collision with root package name */
    private static final int f11204g = zzsy.i("cenc");

    /* renamed from: h, reason: collision with root package name */
    private static final int f11205h = zzsy.i("meta");

    private static int a(zzst zzstVar, int i2, int i3, f20 f20Var, int i4) {
        int b2 = zzstVar.b();
        while (true) {
            if (b2 - i2 >= i3) {
                return 0;
            }
            zzstVar.k(b2);
            int d2 = zzstVar.d();
            zzsk.b(d2 > 0, "childAtomSize should be positive");
            if (zzstVar.d() == z10.V) {
                int i5 = b2 + 8;
                Pair pair = null;
                Integer num = null;
                zzpb zzpbVar = null;
                boolean z = false;
                while (i5 - b2 < d2) {
                    zzstVar.k(i5);
                    int d3 = zzstVar.d();
                    int d4 = zzstVar.d();
                    if (d4 == z10.b0) {
                        num = Integer.valueOf(zzstVar.d());
                    } else if (d4 == z10.W) {
                        zzstVar.l(4);
                        z = zzstVar.d() == f11204g;
                    } else if (d4 == z10.X) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= d3) {
                                zzpbVar = null;
                                break;
                            }
                            zzstVar.k(i6);
                            int d5 = zzstVar.d();
                            if (zzstVar.d() == z10.Y) {
                                zzstVar.l(6);
                                boolean z2 = zzstVar.g() == 1;
                                int g2 = zzstVar.g();
                                byte[] bArr = new byte[16];
                                zzstVar.n(bArr, 0, 16);
                                zzpbVar = new zzpb(z2, g2, bArr);
                            } else {
                                i6 += d5;
                            }
                        }
                    }
                    i5 += d3;
                }
                if (z) {
                    zzsk.b(num != null, "frma atom is mandatory");
                    zzsk.b(zzpbVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzpbVar);
                }
                if (pair != null) {
                    f20Var.a[i4] = (zzpb) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            b2 += d2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:399:0x00a3, code lost:
    
        if (r14 == 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x047f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzpa b(com.google.android.gms.internal.ads.a20 r50, com.google.android.gms.internal.ads.b20 r51, long r52, com.google.android.gms.internal.ads.zzne r54, boolean r55) throws com.google.android.gms.internal.ads.zzlm {
        /*
            Method dump skipped, instructions count: 1823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c20.b(com.google.android.gms.internal.ads.a20, com.google.android.gms.internal.ads.b20, long, com.google.android.gms.internal.ads.zzne, boolean):com.google.android.gms.internal.ads.zzpa");
    }

    public static o20 c(zzpa zzpaVar, a20 a20Var, zznr zznrVar) throws zzlm {
        e20 h20Var;
        boolean z;
        int i2;
        int i3;
        zzpa zzpaVar2;
        int i4;
        long[] jArr;
        int[] iArr;
        int i5;
        long[] jArr2;
        int[] iArr2;
        long j2;
        long j3;
        long[] jArr3;
        long[] jArr4;
        boolean z2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i6;
        int i7;
        int i8;
        int i9;
        b20 d2 = a20Var.d(z10.q0);
        if (d2 != null) {
            h20Var = new g20(d2);
        } else {
            b20 d3 = a20Var.d(z10.r0);
            if (d3 != null) {
                h20Var = new h20(d3);
            } else {
                throw new zzlm("Track has no sample table size information");
            }
        }
        int b2 = h20Var.b();
        if (b2 == 0) {
            return new o20(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        b20 d4 = a20Var.d(z10.s0);
        if (d4 == null) {
            d4 = a20Var.d(z10.t0);
            z = true;
        } else {
            z = false;
        }
        zzst zzstVar = d4.Q0;
        zzst zzstVar2 = a20Var.d(z10.p0).Q0;
        zzst zzstVar3 = a20Var.d(z10.m0).Q0;
        b20 d5 = a20Var.d(z10.n0);
        zzst zzstVar4 = null;
        zzst zzstVar5 = d5 != null ? d5.Q0 : null;
        b20 d6 = a20Var.d(z10.o0);
        zzst zzstVar6 = d6 != null ? d6.Q0 : null;
        d20 d20Var = new d20(zzstVar2, zzstVar, z);
        zzstVar3.k(12);
        int s = zzstVar3.s() - 1;
        int s2 = zzstVar3.s();
        int s3 = zzstVar3.s();
        if (zzstVar6 != null) {
            zzstVar6.k(12);
            i2 = zzstVar6.s();
        } else {
            i2 = 0;
        }
        int i10 = -1;
        if (zzstVar5 != null) {
            zzstVar5.k(12);
            i3 = zzstVar5.s();
            if (i3 > 0) {
                i10 = zzstVar5.s() - 1;
                zzstVar4 = zzstVar5;
            }
        } else {
            zzstVar4 = zzstVar5;
            i3 = 0;
        }
        long j4 = 0;
        if (!(h20Var.a() && "audio/raw".equals(zzpaVar.f15384f.f15250k) && s == 0 && i2 == 0 && i3 == 0)) {
            long[] jArr5 = new long[b2];
            iArr = new int[b2];
            jArr2 = new long[b2];
            int i11 = i3;
            iArr2 = new int[b2];
            int i12 = i10;
            long j5 = 0;
            j2 = 0;
            int i13 = 0;
            i5 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = i2;
            int i18 = s3;
            int i19 = s2;
            int i20 = s;
            int i21 = i11;
            while (i13 < b2) {
                while (i15 == 0) {
                    zzsk.e(d20Var.a());
                    j5 = d20Var.f11272d;
                    i15 = d20Var.f11271c;
                    i18 = i18;
                    i19 = i19;
                }
                int i22 = i19;
                int i23 = i18;
                if (zzstVar6 != null) {
                    while (i14 == 0 && i17 > 0) {
                        i14 = zzstVar6.s();
                        i16 = zzstVar6.d();
                        i17--;
                    }
                    i14--;
                }
                int i24 = i16;
                jArr5[i13] = j5;
                iArr[i13] = h20Var.c();
                if (iArr[i13] > i5) {
                    i5 = iArr[i13];
                }
                int i25 = b2;
                e20 e20Var = h20Var;
                jArr2[i13] = j2 + i24;
                iArr2[i13] = zzstVar4 == null ? 1 : 0;
                if (i13 == i12) {
                    iArr2[i13] = 1;
                    i21--;
                    if (i21 > 0) {
                        i12 = zzstVar4.s() - 1;
                    }
                }
                long[] jArr6 = jArr5;
                j2 += i23;
                int i26 = i22 - 1;
                if (i26 != 0 || i20 <= 0) {
                    i8 = i23;
                    i9 = i26;
                } else {
                    i9 = zzstVar3.s();
                    i8 = zzstVar3.s();
                    i20--;
                }
                int i27 = i9;
                j5 += iArr[i13];
                i15--;
                i13++;
                b2 = i25;
                jArr5 = jArr6;
                i12 = i12;
                i16 = i24;
                i19 = i27;
                i18 = i8;
                h20Var = e20Var;
            }
            i4 = b2;
            long[] jArr7 = jArr5;
            int i28 = i19;
            zzsk.a(i14 == 0);
            while (i17 > 0) {
                zzsk.a(zzstVar6.s() == 0);
                zzstVar6.d();
                i17--;
            }
            if (i21 == 0 && i28 == 0) {
                i7 = i15;
                if (i7 == 0 && i20 == 0) {
                    zzpaVar2 = zzpaVar;
                    jArr = jArr7;
                }
            } else {
                i7 = i15;
            }
            zzpaVar2 = zzpaVar;
            int i29 = zzpaVar2.a;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i29);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i21);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i28);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i20);
            Log.w("AtomParsers", sb.toString());
            jArr = jArr7;
        } else {
            zzpaVar2 = zzpaVar;
            i4 = b2;
            e20 e20Var2 = h20Var;
            int i30 = d20Var.a;
            long[] jArr8 = new long[i30];
            int[] iArr6 = new int[i30];
            while (d20Var.a()) {
                int i31 = d20Var.f11270b;
                jArr8[i31] = d20Var.f11272d;
                iArr6[i31] = d20Var.f11271c;
            }
            int c2 = e20Var2.c();
            long j6 = s3;
            int i32 = 8192 / c2;
            int i33 = 0;
            for (int i34 = 0; i34 < i30; i34++) {
                i33 += zzsy.j(iArr6[i34], i32);
            }
            long[] jArr9 = new long[i33];
            int[] iArr7 = new int[i33];
            long[] jArr10 = new long[i33];
            int[] iArr8 = new int[i33];
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            while (i35 < i30) {
                int i39 = iArr6[i35];
                long j7 = jArr8[i35];
                int i40 = i30;
                int i41 = i39;
                while (i41 > 0) {
                    int min = Math.min(i32, i41);
                    jArr9[i37] = j7;
                    iArr7[i37] = c2 * min;
                    i38 = Math.max(i38, iArr7[i37]);
                    jArr10[i37] = i36 * j6;
                    iArr8[i37] = 1;
                    j7 += iArr7[i37];
                    i36 += min;
                    i41 -= min;
                    i37++;
                    jArr8 = jArr8;
                    iArr6 = iArr6;
                }
                i35++;
                i30 = i40;
            }
            zzou zzouVar = new zzou(jArr9, iArr7, i38, jArr10, iArr8);
            jArr = zzouVar.a;
            iArr = zzouVar.f15361b;
            i5 = zzouVar.f15362c;
            jArr2 = zzouVar.f15363d;
            iArr2 = zzouVar.f15364e;
            j2 = 0;
        }
        if (zzpaVar2.f15387i != null && !zznrVar.c()) {
            long[] jArr11 = zzpaVar2.f15387i;
            if (jArr11.length == 1 && zzpaVar2.f15380b == 1 && jArr2.length >= 2) {
                long j8 = zzpaVar2.f15388j[0];
                long c3 = zzsy.c(jArr11[0], zzpaVar2.f15381c, zzpaVar2.f15382d) + j8;
                if (jArr2[0] <= j8 && j8 < jArr2[1] && jArr2[jArr2.length - 1] < c3 && c3 <= j2) {
                    long j9 = j2 - c3;
                    long c4 = zzsy.c(j8 - jArr2[0], zzpaVar2.f15384f.x, zzpaVar2.f15381c);
                    long c5 = zzsy.c(j9, zzpaVar2.f15384f.x, zzpaVar2.f15381c);
                    if ((c4 != 0 || c5 != 0) && c4 <= 2147483647L && c5 <= 2147483647L) {
                        zznrVar.f15348c = (int) c4;
                        zznrVar.f15349d = (int) c5;
                        zzsy.f(jArr2, 1000000L, zzpaVar2.f15381c);
                        return new o20(jArr, iArr, i5, jArr2, iArr2);
                    }
                }
            }
            long[] jArr12 = zzpaVar2.f15387i;
            if (jArr12.length == 1) {
                char c6 = 0;
                if (jArr12[0] == 0) {
                    int i42 = 0;
                    while (i42 < jArr2.length) {
                        jArr2[i42] = zzsy.c(jArr2[i42] - zzpaVar2.f15388j[c6], 1000000L, zzpaVar2.f15381c);
                        i42++;
                        c6 = 0;
                    }
                    return new o20(jArr, iArr, i5, jArr2, iArr2);
                }
            }
            boolean z3 = zzpaVar2.f15380b == 1;
            boolean z4 = false;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            while (true) {
                long[] jArr13 = zzpaVar2.f15387i;
                j3 = -1;
                if (i45 >= jArr13.length) {
                    break;
                }
                int i46 = i5;
                int[] iArr9 = iArr;
                long j10 = zzpaVar2.f15388j[i45];
                if (j10 != -1) {
                    i6 = i46;
                    long c7 = zzsy.c(jArr13[i45], zzpaVar2.f15381c, zzpaVar2.f15382d);
                    int k2 = zzsy.k(jArr2, j10, true, true);
                    int k3 = zzsy.k(jArr2, j10 + c7, z3, false);
                    i43 += k3 - k2;
                    z4 |= i44 != k2;
                    i44 = k3;
                } else {
                    i6 = i46;
                }
                i45++;
                iArr = iArr9;
                i5 = i6;
            }
            int i47 = i5;
            int[] iArr10 = iArr;
            boolean z5 = z4 | (i43 != i4);
            long[] jArr14 = z5 ? new long[i43] : jArr;
            int[] iArr11 = z5 ? new int[i43] : iArr10;
            int i48 = z5 ? 0 : i47;
            int[] iArr12 = z5 ? new int[i43] : iArr2;
            long[] jArr15 = new long[i43];
            int i49 = i48;
            int i50 = 0;
            int i51 = 0;
            while (true) {
                long[] jArr16 = zzpaVar2.f15387i;
                if (i50 >= jArr16.length) {
                    break;
                }
                int[] iArr13 = iArr11;
                int[] iArr14 = iArr12;
                long j11 = zzpaVar2.f15388j[i50];
                long j12 = jArr16[i50];
                if (j11 != j3) {
                    jArr3 = jArr14;
                    long[] jArr17 = jArr;
                    long c8 = zzsy.c(j12, zzpaVar2.f15381c, zzpaVar2.f15382d) + j11;
                    int k4 = zzsy.k(jArr2, j11, true, true);
                    int k5 = zzsy.k(jArr2, c8, z3, false);
                    if (z5) {
                        int i52 = k5 - k4;
                        System.arraycopy(jArr17, k4, jArr3, i51, i52);
                        iArr4 = iArr10;
                        z2 = z3;
                        iArr3 = iArr13;
                        System.arraycopy(iArr4, k4, iArr3, i51, i52);
                        jArr4 = jArr17;
                        iArr5 = iArr14;
                        System.arraycopy(iArr2, k4, iArr5, i51, i52);
                    } else {
                        iArr4 = iArr10;
                        jArr4 = jArr17;
                        iArr5 = iArr14;
                        z2 = z3;
                        iArr3 = iArr13;
                    }
                    int i53 = i49;
                    while (k4 < k5) {
                        int[] iArr15 = iArr5;
                        int[] iArr16 = iArr4;
                        long j13 = j11;
                        jArr15[i51] = zzsy.c(j4, 1000000L, zzpaVar2.f15382d) + zzsy.c(jArr2[k4] - j11, 1000000L, zzpaVar2.f15381c);
                        if (z5 && iArr3[i51] > i53) {
                            i53 = iArr16[k4];
                        }
                        i51++;
                        k4++;
                        iArr4 = iArr16;
                        j11 = j13;
                        iArr5 = iArr15;
                    }
                    iArr14 = iArr5;
                    iArr10 = iArr4;
                    i49 = i53;
                } else {
                    jArr3 = jArr14;
                    jArr4 = jArr;
                    z2 = z3;
                    iArr3 = iArr13;
                }
                j4 += j12;
                i50++;
                iArr11 = iArr3;
                jArr14 = jArr3;
                z3 = z2;
                iArr12 = iArr14;
                jArr = jArr4;
                j3 = -1;
            }
            long[] jArr18 = jArr14;
            int[] iArr17 = iArr11;
            int[] iArr18 = iArr12;
            boolean z6 = false;
            for (int i54 = 0; i54 < iArr18.length && !z6; i54++) {
                z6 |= (iArr18[i54] & 1) != 0;
            }
            if (z6) {
                return new o20(jArr18, iArr17, i49, jArr15, iArr18);
            }
            throw new zzlm("The edited sample sequence does not contain a sync sample.");
        }
        int[] iArr19 = iArr;
        zzsy.f(jArr2, 1000000L, zzpaVar2.f15381c);
        return new o20(jArr, iArr19, i5, jArr2, iArr2);
    }

    public static zzpo d(b20 b20Var, boolean z) {
        if (z) {
            return null;
        }
        zzst zzstVar = b20Var.Q0;
        zzstVar.k(8);
        while (zzstVar.u() >= 8) {
            int b2 = zzstVar.b();
            int d2 = zzstVar.d();
            if (zzstVar.d() == z10.B0) {
                zzstVar.k(b2);
                int i2 = b2 + d2;
                zzstVar.l(12);
                while (true) {
                    if (zzstVar.b() >= i2) {
                        break;
                    }
                    int b3 = zzstVar.b();
                    int d3 = zzstVar.d();
                    if (zzstVar.d() == z10.C0) {
                        zzstVar.k(b3);
                        int i3 = b3 + d3;
                        zzstVar.l(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzstVar.b() < i3) {
                            zzpo.zza d4 = k20.d(zzstVar);
                            if (d4 != null) {
                                arrayList.add(d4);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzpo(arrayList);
                        }
                    } else {
                        zzstVar.l(d3 - 8);
                    }
                }
                return null;
            }
            zzstVar.l(d2 - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> e(zzst zzstVar, int i2) {
        zzstVar.k(i2 + 8 + 4);
        zzstVar.l(1);
        f(zzstVar);
        zzstVar.l(2);
        int g2 = zzstVar.g();
        if ((g2 & 128) != 0) {
            zzstVar.l(2);
        }
        if ((g2 & 64) != 0) {
            zzstVar.l(zzstVar.h());
        }
        if ((g2 & 32) != 0) {
            zzstVar.l(2);
        }
        zzstVar.l(1);
        f(zzstVar);
        int g3 = zzstVar.g();
        String str = null;
        if (g3 == 32) {
            str = "video/mp4v-es";
        } else if (g3 == 33) {
            str = "video/avc";
        } else if (g3 != 35) {
            if (g3 != 64) {
                if (g3 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (g3 == 165) {
                    str = "audio/ac3";
                } else if (g3 != 166) {
                    switch (g3) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g3) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzstVar.l(12);
        zzstVar.l(1);
        int f2 = f(zzstVar);
        byte[] bArr = new byte[f2];
        zzstVar.n(bArr, 0, f2);
        return Pair.create(str, bArr);
    }

    private static int f(zzst zzstVar) {
        int g2 = zzstVar.g();
        int i2 = g2 & 127;
        while ((g2 & 128) == 128) {
            g2 = zzstVar.g();
            i2 = (i2 << 7) | (g2 & 127);
        }
        return i2;
    }
}
