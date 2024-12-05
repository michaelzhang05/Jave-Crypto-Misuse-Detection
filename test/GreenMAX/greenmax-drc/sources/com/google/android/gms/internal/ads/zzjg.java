package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzjg implements zzid {
    private int A;
    private int B;
    private long C;
    private boolean D;
    private boolean E;
    private zzif F;
    private final f00 a;

    /* renamed from: b, reason: collision with root package name */
    private final h00 f15163b;

    /* renamed from: c, reason: collision with root package name */
    private final zzkm f15164c;

    /* renamed from: d, reason: collision with root package name */
    private final zzkm f15165d;

    /* renamed from: e, reason: collision with root package name */
    private final zzkm f15166e;

    /* renamed from: f, reason: collision with root package name */
    private long f15167f;

    /* renamed from: g, reason: collision with root package name */
    private long f15168g;

    /* renamed from: h, reason: collision with root package name */
    private long f15169h;

    /* renamed from: i, reason: collision with root package name */
    private long f15170i;

    /* renamed from: j, reason: collision with root package name */
    private k00 f15171j;

    /* renamed from: k, reason: collision with root package name */
    private k00 f15172k;
    private k00 l;
    private boolean m;
    private int n;
    private long o;
    private boolean p;
    private long q;
    private long r;
    private int s;
    private long t;
    private zzkk u;
    private zzkk v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public zzjg() {
        this(new c00());
    }

    private final void g(zzip zzipVar) {
        zzipVar.d(this.C, this.B, this.z, 0, null);
        this.y = 0;
        this.D = true;
    }

    private static boolean h(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str);
    }

    private final long k(long j2) {
        return TimeUnit.NANOSECONDS.toMicros(j2 * this.f15169h);
    }

    private final ArrayList<byte[]> l() throws zzhl {
        try {
            byte[] bArr = this.f15172k.f11680j;
            if (bArr[0] == 2) {
                int i2 = 1;
                int i3 = 0;
                while (bArr[i2] == -1) {
                    i3 += 255;
                    i2++;
                }
                int i4 = i2 + 1;
                int i5 = i3 + bArr[i2];
                int i6 = 0;
                while (bArr[i4] == -1) {
                    i6 += 255;
                    i4++;
                }
                int i7 = i4 + 1;
                int i8 = i6 + bArr[i4];
                if (bArr[i7] == 1) {
                    byte[] bArr2 = new byte[i5];
                    System.arraycopy(bArr, i7, bArr2, 0, i5);
                    int i9 = i7 + i5;
                    if (bArr[i9] == 3) {
                        int i10 = i9 + i8;
                        if (bArr[i10] == 5) {
                            byte[] bArr3 = new byte[bArr.length - i10];
                            System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                            ArrayList<byte[]> arrayList = new ArrayList<>(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new zzhl("Error parsing vorbis codec private");
                    }
                    throw new zzhl("Error parsing vorbis codec private");
                }
                throw new zzhl("Error parsing vorbis codec private");
            }
            throw new zzhl("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhl("Error parsing vorbis codec private");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.google.android.gms.internal.ads.zzie r9, com.google.android.gms.internal.ads.zzij r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.D = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3d
            boolean r3 = r8.D
            if (r3 != 0) goto L3d
            com.google.android.gms.internal.ads.f00 r2 = r8.a
            boolean r2 = r2.c(r9)
            if (r2 == 0) goto L5
            long r3 = r9.getPosition()
            boolean r5 = r8.p
            if (r5 == 0) goto L27
            r8.r = r3
            long r3 = r8.q
            r10.a = r3
            r8.s = r1
            r8.p = r0
        L25:
            r3 = 1
            goto L3a
        L27:
            int r3 = r8.s
            r4 = 2
            if (r3 != r4) goto L39
            long r3 = r8.r
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L39
            r10.a = r3
            r8.r = r5
            goto L25
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L5
            return r1
        L3d:
            if (r2 == 0) goto L40
            return r0
        L40:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.a(com.google.android.gms.internal.ads.zzie, com.google.android.gms.internal.ads.zzij):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i2, double d2) {
        if (i2 == 181) {
            this.f15171j.f11679i = (int) d2;
        } else {
            if (i2 != 17545) {
                return;
            }
            this.f15170i = k((long) d2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r8.f11672b != r10) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r17, int r18, com.google.android.gms.internal.ads.zzie r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.c(int, int, com.google.android.gms.internal.ads.zzie):void");
    }

    @Override // com.google.android.gms.internal.ads.zzid
    public final void d(zzif zzifVar) {
        this.F = zzifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzid
    public final void e() {
        this.t = -1L;
        this.y = 0;
        this.a.a();
        this.f15163b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i2, String str) throws zzhl {
        if (i2 != 134) {
            if (i2 == 17026 && !"webm".equals(str)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
                sb.append("DocType ");
                sb.append(str);
                sb.append(" not supported");
                throw new zzhl(sb.toString());
            }
            return;
        }
        this.f15171j.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i2, long j2, long j3) throws zzhl {
        if (i2 == 160) {
            this.E = false;
            return;
        }
        if (i2 == 174) {
            this.f15171j = new k00();
            return;
        }
        if (i2 == 187) {
            this.w = false;
            return;
        }
        if (i2 == 19899) {
            this.n = -1;
            this.o = -1L;
            return;
        }
        if (i2 == 20533) {
            this.f15171j.f11674d = true;
            return;
        }
        if (i2 == 408125543) {
            if (this.f15167f == -1) {
                this.f15167f = j2;
                this.f15168g = j3;
                return;
            }
            throw new zzhl("Multiple Segment elements not supported");
        }
        if (i2 != 475249515) {
            if (i2 == 524531317 && this.s == 0 && this.q != -1) {
                this.p = true;
                return;
            }
            return;
        }
        this.u = new zzkk();
        this.v = new zzkk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i2, long j2) throws zzhl {
        switch (i2) {
            case 131:
                this.f15171j.f11673c = (int) j2;
                return;
            case 159:
                this.f15171j.f11678h = (int) j2;
                return;
            case 176:
                this.f15171j.f11676f = (int) j2;
                return;
            case 179:
                this.u.a(k(j2));
                return;
            case 186:
                this.f15171j.f11677g = (int) j2;
                return;
            case 215:
                this.f15171j.f11672b = (int) j2;
                return;
            case 231:
                this.t = k(j2);
                return;
            case 241:
                if (this.w) {
                    return;
                }
                this.v.a(j2);
                this.w = true;
                return;
            case 251:
                this.E = true;
                return;
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("DocTypeReadVersion ");
                    sb.append(j2);
                    sb.append(" not supported");
                    throw new zzhl(sb.toString());
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("EBMLReadVersion ");
                sb2.append(j2);
                sb2.append(" not supported");
                throw new zzhl(sb2.toString());
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(49);
                sb3.append("ContentEncAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw new zzhl(sb3.toString());
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(56);
                sb4.append("AESSettingsCipherMode ");
                sb4.append(j2);
                sb4.append(" not supported");
                throw new zzhl(sb4.toString());
            case 20529:
                if (j2 == 0) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(55);
                sb5.append("ContentEncodingOrder ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw new zzhl(sb5.toString());
            case 20530:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new zzhl(sb6.toString());
            case 20531:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(54);
                sb7.append("ContentEncodingType ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw new zzhl(sb7.toString());
            case 21420:
                this.o = j2 + this.f15167f;
                return;
            case 22186:
                this.f15171j.f11681k = j2;
                return;
            case 22203:
                this.f15171j.l = j2;
                return;
            case 2807729:
                this.f15169h = j2;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i2) throws zzhl {
        int i3;
        zzhj e2;
        zzhj g2;
        if (i2 == 160) {
            if (this.y != 2) {
                return;
            }
            if (!this.E) {
                this.B |= 1;
            }
            k00 k00Var = this.f15172k;
            if (k00Var == null || this.A != k00Var.f11672b) {
                k00Var = this.l;
            }
            g(k00Var.m);
            return;
        }
        if (i2 == 174) {
            k00 k00Var2 = this.f15171j;
            if (k00Var2.f11672b != -1 && (i3 = k00Var2.f11673c) != -1) {
                if ((i3 == 2 && this.f15172k != null) || (i3 == 1 && this.l != null)) {
                    this.f15171j = null;
                    return;
                }
                if (i3 == 2 && h(k00Var2.a)) {
                    k00 k00Var3 = this.f15171j;
                    this.f15172k = k00Var3;
                    k00Var3.m = this.F.e(k00Var3.f11672b);
                    k00 k00Var4 = this.f15172k;
                    zzip zzipVar = k00Var4.m;
                    if (k00Var4 != null && "A_VORBIS".equals(k00Var4.a)) {
                        long j2 = this.f15170i;
                        k00 k00Var5 = this.f15172k;
                        g2 = zzhj.g("audio/vorbis", 8192, j2, k00Var5.f11678h, k00Var5.f11679i, l());
                    } else {
                        k00 k00Var6 = this.f15172k;
                        if (k00Var6 != null && "A_OPUS".equals(k00Var6.a)) {
                            ArrayList arrayList = new ArrayList(3);
                            arrayList.add(this.f15172k.f11680j);
                            arrayList.add(ByteBuffer.allocate(64).putLong(this.f15172k.f11681k).array());
                            arrayList.add(ByteBuffer.allocate(64).putLong(this.f15172k.l).array());
                            long j3 = this.f15170i;
                            k00 k00Var7 = this.f15172k;
                            g2 = zzhj.g("audio/opus", 5760, j3, k00Var7.f11678h, k00Var7.f11679i, arrayList);
                        } else {
                            throw new zzhl("Unable to build format");
                        }
                    }
                    zzipVar.b(g2);
                } else {
                    k00 k00Var8 = this.f15171j;
                    if (k00Var8.f11673c == 1 && h(k00Var8.a)) {
                        k00 k00Var9 = this.f15171j;
                        this.l = k00Var9;
                        k00Var9.m = this.F.e(k00Var9.f11672b);
                        k00 k00Var10 = this.l;
                        zzip zzipVar2 = k00Var10.m;
                        if (k00Var10 != null && "V_VP8".equals(k00Var10.a)) {
                            long j4 = this.f15170i;
                            k00 k00Var11 = this.l;
                            e2 = zzhj.e("video/x-vnd.on2.vp8", -1, j4, k00Var11.f11676f, k00Var11.f11677g, null);
                        } else {
                            k00 k00Var12 = this.l;
                            if (k00Var12 != null && "V_VP9".equals(k00Var12.a)) {
                                long j5 = this.f15170i;
                                k00 k00Var13 = this.l;
                                e2 = zzhj.e("video/x-vnd.on2.vp9", -1, j5, k00Var13.f11676f, k00Var13.f11677g, null);
                            } else {
                                throw new zzhl("Unable to build format");
                            }
                        }
                        zzipVar2.b(e2);
                    }
                }
                this.f15171j = null;
                return;
            }
            throw new zzhl("Mandatory element TrackNumber or TrackType not found");
        }
        if (i2 == 19899) {
            int i4 = this.n;
            if (i4 != -1) {
                long j6 = this.o;
                if (j6 != -1) {
                    if (i4 == 475249515) {
                        this.q = j6;
                        return;
                    }
                    return;
                }
            }
            throw new zzhl("Mandatory element SeekID or SeekPosition not found");
        }
        if (i2 == 25152) {
            k00 k00Var14 = this.f15171j;
            if (k00Var14.f11674d) {
                byte[] bArr = k00Var14.f11675e;
                if (bArr != null) {
                    if (this.m) {
                        return;
                    }
                    this.F.d(new zzhy("video/webm", bArr));
                    this.m = true;
                    return;
                }
                throw new zzhl("Encrypted Track found but ContentEncKeyID was not found");
            }
            throw new zzhl("Found an unsupported ContentEncoding");
        }
        if (i2 != 374648427) {
            if (i2 != 475249515 || this.s == 2) {
                return;
            }
            zzif zzifVar = this.F;
            if (this.f15167f == -1) {
                throw new zzhl("Segment start/end offsets unknown");
            }
            if (this.f15170i != -1) {
                zzkk zzkkVar = this.u;
                if (zzkkVar != null && this.v != null && zzkkVar.c() != 0 && this.u.c() == this.v.c()) {
                    int c2 = this.u.c();
                    int[] iArr = new int[c2];
                    long[] jArr = new long[c2];
                    long[] jArr2 = new long[c2];
                    long[] jArr3 = new long[c2];
                    int i5 = 0;
                    for (int i6 = 0; i6 < c2; i6++) {
                        jArr3[i6] = this.u.b(i6);
                        jArr[i6] = this.f15167f + this.v.b(i6);
                    }
                    while (true) {
                        int i7 = c2 - 1;
                        if (i5 < i7) {
                            int i8 = i5 + 1;
                            iArr[i5] = (int) (jArr[i8] - jArr[i5]);
                            jArr2[i5] = jArr3[i8] - jArr3[i5];
                            i5 = i8;
                        } else {
                            iArr[i7] = (int) ((this.f15167f + this.f15168g) - jArr[i7]);
                            jArr2[i7] = this.f15170i - jArr3[i7];
                            this.u = null;
                            this.v = null;
                            zzifVar.g(new zzia(iArr, jArr, jArr2, jArr3));
                            this.s = 2;
                            return;
                        }
                    }
                } else {
                    throw new zzhl("Invalid/missing cue points");
                }
            } else {
                throw new zzhl("Duration unknown");
            }
        } else {
            if (this.l == null && this.f15172k == null) {
                throw new zzhl("No valid tracks were found");
            }
            this.F.c();
        }
    }

    private zzjg(f00 f00Var) {
        this.f15167f = -1L;
        this.f15168g = -1L;
        this.f15169h = 1000000L;
        this.f15170i = -1L;
        this.q = -1L;
        this.r = -1L;
        this.s = 0;
        this.t = -1L;
        this.a = f00Var;
        f00Var.b(new j00(this));
        this.f15163b = new h00();
        this.f15164c = new zzkm(4);
        this.f15165d = new zzkm(ByteBuffer.allocate(4).putInt(-1).array());
        this.f15166e = new zzkm(4);
    }
}
