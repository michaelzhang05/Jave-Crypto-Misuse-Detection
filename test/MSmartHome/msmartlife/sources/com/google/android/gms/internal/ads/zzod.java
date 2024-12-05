package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzne;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzod implements zznn {
    private static final zznq a = new u10();

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f15351b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f15352c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: d, reason: collision with root package name */
    private static final UUID f15353d = new UUID(72057594037932032L, -9223371306706625679L);
    private long A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private zzsn F;
    private zzsn G;
    private boolean H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private int[] N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private byte W;
    private int X;
    private int Y;
    private int Z;
    private boolean a0;
    private boolean b0;
    private zznp c0;

    /* renamed from: e, reason: collision with root package name */
    private final s10 f15354e;

    /* renamed from: f, reason: collision with root package name */
    private final y10 f15355f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray<w10> f15356g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15357h;

    /* renamed from: i, reason: collision with root package name */
    private final zzst f15358i;

    /* renamed from: j, reason: collision with root package name */
    private final zzst f15359j;

    /* renamed from: k, reason: collision with root package name */
    private final zzst f15360k;
    private final zzst l;
    private final zzst m;
    private final zzst n;
    private final zzst o;
    private final zzst p;
    private final zzst q;
    private ByteBuffer r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private w10 x;
    private boolean y;
    private int z;

    public zzod() {
        this(0);
    }

    private final int b(zzno zznoVar, zznw zznwVar, int i2) throws IOException, InterruptedException {
        int d2;
        int u = this.n.u();
        if (u > 0) {
            d2 = Math.min(i2, u);
            zznwVar.b(this.n, d2);
        } else {
            d2 = zznwVar.d(zznoVar, i2, false);
        }
        this.R += d2;
        this.Z += d2;
        return d2;
    }

    private final void j(zzno zznoVar, w10 w10Var, int i2) throws IOException, InterruptedException {
        int i3;
        if ("S_TEXT/UTF8".equals(w10Var.a)) {
            byte[] bArr = f15351b;
            int length = bArr.length + i2;
            if (this.o.a() < length) {
                this.o.a = Arrays.copyOf(bArr, length + i2);
            }
            zznoVar.readFully(this.o.a, bArr.length, i2);
            this.o.k(0);
            this.o.o(length);
            return;
        }
        zznw zznwVar = w10Var.O;
        if (!this.S) {
            if (w10Var.f12308e) {
                this.Q &= -1073741825;
                if (!this.T) {
                    zznoVar.readFully(this.f15360k.a, 0, 1);
                    this.R++;
                    byte[] bArr2 = this.f15360k.a;
                    if ((bArr2[0] & 128) != 128) {
                        this.W = bArr2[0];
                        this.T = true;
                    } else {
                        throw new zzlm("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.W;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.Q |= 1073741824;
                    if (!this.U) {
                        zznoVar.readFully(this.p.a, 0, 8);
                        this.R += 8;
                        this.U = true;
                        zzst zzstVar = this.f15360k;
                        zzstVar.a[0] = (byte) ((z ? 128 : 0) | 8);
                        zzstVar.k(0);
                        zznwVar.b(this.f15360k, 1);
                        this.Z++;
                        this.p.k(0);
                        zznwVar.b(this.p, 8);
                        this.Z += 8;
                    }
                    if (z) {
                        if (!this.V) {
                            zznoVar.readFully(this.f15360k.a, 0, 1);
                            this.R++;
                            this.f15360k.k(0);
                            this.X = this.f15360k.g();
                            this.V = true;
                        }
                        int i4 = this.X << 2;
                        this.f15360k.j(i4);
                        zznoVar.readFully(this.f15360k.a, 0, i4);
                        this.R += i4;
                        short s = (short) ((this.X / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.r;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.r = ByteBuffer.allocate(i5);
                        }
                        this.r.position(0);
                        this.r.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i3 = this.X;
                            if (i6 >= i3) {
                                break;
                            }
                            int s2 = this.f15360k.s();
                            if (i6 % 2 == 0) {
                                this.r.putShort((short) (s2 - i7));
                            } else {
                                this.r.putInt(s2 - i7);
                            }
                            i6++;
                            i7 = s2;
                        }
                        int i8 = (i2 - this.R) - i7;
                        if (i3 % 2 == 1) {
                            this.r.putInt(i8);
                        } else {
                            this.r.putShort((short) i8);
                            this.r.putInt(0);
                        }
                        this.q.m(this.r.array(), i5);
                        zznwVar.b(this.q, i5);
                        this.Z += i5;
                    }
                }
            } else {
                byte[] bArr3 = w10Var.f12309f;
                if (bArr3 != null) {
                    this.n.m(bArr3, bArr3.length);
                }
            }
            this.S = true;
        }
        int c2 = i2 + this.n.c();
        if (!"V_MPEG4/ISO/AVC".equals(w10Var.a) && !"V_MPEGH/ISO/HEVC".equals(w10Var.a)) {
            while (true) {
                int i9 = this.R;
                if (i9 >= c2) {
                    break;
                } else {
                    b(zznoVar, zznwVar, c2 - i9);
                }
            }
        } else {
            byte[] bArr4 = this.f15359j.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i10 = w10Var.P;
            int i11 = 4 - i10;
            while (this.R < c2) {
                int i12 = this.Y;
                if (i12 == 0) {
                    int min = Math.min(i10, this.n.u());
                    zznoVar.readFully(bArr4, i11 + min, i10 - min);
                    if (min > 0) {
                        this.n.n(bArr4, i11, min);
                    }
                    this.R += i10;
                    this.f15359j.k(0);
                    this.Y = this.f15359j.s();
                    this.f15358i.k(0);
                    zznwVar.b(this.f15358i, 4);
                    this.Z += 4;
                } else {
                    this.Y = i12 - b(zznoVar, zznwVar, i12);
                }
            }
        }
        if ("A_VORBIS".equals(w10Var.a)) {
            this.l.k(0);
            zznwVar.b(this.l, 4);
            this.Z += 4;
        }
    }

    private final void k(w10 w10Var, long j2) {
        byte[] m;
        if ("S_TEXT/UTF8".equals(w10Var.a)) {
            byte[] bArr = this.o.a;
            long j3 = this.K;
            if (j3 == -9223372036854775807L) {
                m = f15352c;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (i2 * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - (60000000 * i3);
                m = zzsy.m(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j5 / 1000000)), Integer.valueOf((int) ((j5 - (1000000 * r4)) / 1000))));
            }
            System.arraycopy(m, 0, bArr, 19, 12);
            zznw zznwVar = w10Var.O;
            zzst zzstVar = this.o;
            zznwVar.b(zzstVar, zzstVar.c());
            this.Z += this.o.c();
        }
        w10Var.O.c(j2, this.Q, this.Z, 0, w10Var.f12310g);
        this.a0 = true;
        r();
    }

    private static int[] l(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        return iArr.length >= i2 ? iArr : new int[Math.max(iArr.length << 1, i2)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    private final void o(zzno zznoVar, int i2) throws IOException, InterruptedException {
        if (this.f15360k.c() >= i2) {
            return;
        }
        if (this.f15360k.a() < i2) {
            zzst zzstVar = this.f15360k;
            byte[] bArr = zzstVar.a;
            zzstVar.m(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i2)), this.f15360k.c());
        }
        zzst zzstVar2 = this.f15360k;
        zznoVar.readFully(zzstVar2.a, zzstVar2.c(), i2 - this.f15360k.c());
        this.f15360k.o(i2);
    }

    private final long q(long j2) throws zzlm {
        long j3 = this.u;
        if (j3 != -9223372036854775807L) {
            return zzsy.c(j2, j3, 1000L);
        }
        throw new zzlm("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void r() {
        this.R = 0;
        this.Z = 0;
        this.Y = 0;
        this.S = false;
        this.T = false;
        this.V = false;
        this.X = 0;
        this.W = (byte) 0;
        this.U = false;
        this.n.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i2, double d2) {
        if (i2 == 181) {
            this.x.I = (int) d2;
            return;
        }
        if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.x.w = (float) d2;
                    return;
                case 21970:
                    this.x.x = (float) d2;
                    return;
                case 21971:
                    this.x.y = (float) d2;
                    return;
                case 21972:
                    this.x.z = (float) d2;
                    return;
                case 21973:
                    this.x.A = (float) d2;
                    return;
                case 21974:
                    this.x.B = (float) d2;
                    return;
                case 21975:
                    this.x.C = (float) d2;
                    return;
                case 21976:
                    this.x.D = (float) d2;
                    return;
                case 21977:
                    this.x.E = (float) d2;
                    return;
                case 21978:
                    this.x.F = (float) d2;
                    return;
                default:
                    return;
            }
        }
        this.v = (long) d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zznn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.google.android.gms.internal.ads.zzno r9, com.google.android.gms.internal.ads.zznt r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.a0 = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3a
            boolean r3 = r8.a0
            if (r3 != 0) goto L3a
            com.google.android.gms.internal.ads.s10 r2 = r8.f15354e
            boolean r2 = r2.c(r9)
            if (r2 == 0) goto L5
            long r3 = r9.getPosition()
            boolean r5 = r8.B
            if (r5 == 0) goto L25
            r8.D = r3
            long r3 = r8.C
            r10.a = r3
            r8.B = r0
        L23:
            r3 = 1
            goto L37
        L25:
            boolean r3 = r8.y
            if (r3 == 0) goto L36
            long r3 = r8.D
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r10.a = r3
            r8.D = r5
            goto L23
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L5
            return r1
        L3a:
            if (r2 == 0) goto L3d
            return r0
        L3d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzod.d(com.google.android.gms.internal.ads.zzno, com.google.android.gms.internal.ads.zznt):int");
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void e(zznp zznpVar) {
        this.c0 = zznpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ee, code lost:
    
        throw new com.google.android.gms.internal.ads.zzlm("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r20, int r21, com.google.android.gms.internal.ads.zzno r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzod.f(int, int, com.google.android.gms.internal.ads.zzno):void");
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final boolean g(zzno zznoVar) throws IOException, InterruptedException {
        return new x10().a(zznoVar);
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void h(long j2, long j3) {
        this.E = -9223372036854775807L;
        this.I = 0;
        this.f15354e.a();
        this.f15355f.a();
        r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i2, String str) throws zzlm {
        if (i2 == 134) {
            this.x.a = str;
            return;
        }
        if (i2 != 17026) {
            if (i2 != 2274716) {
                return;
            }
            w10.a(this.x, str);
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzlm(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i2, long j2, long j3) throws zzlm {
        if (i2 == 160) {
            this.b0 = false;
            return;
        }
        if (i2 == 174) {
            this.x = new w10(null);
            return;
        }
        if (i2 == 187) {
            this.H = false;
            return;
        }
        if (i2 == 19899) {
            this.z = -1;
            this.A = -1L;
            return;
        }
        if (i2 == 20533) {
            this.x.f12308e = true;
            return;
        }
        if (i2 == 21968) {
            this.x.q = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.t;
            if (j4 != -1 && j4 != j2) {
                throw new zzlm("Multiple Segment elements not supported");
            }
            this.t = j2;
            this.s = j3;
            return;
        }
        if (i2 != 475249515) {
            if (i2 == 524531317 && !this.y) {
                if (this.f15357h && this.C != -1) {
                    this.B = true;
                    return;
                } else {
                    this.c0.z(new zznv(this.w));
                    this.y = true;
                    return;
                }
            }
            return;
        }
        this.F = new zzsn();
        this.G = new zzsn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i2, long j2) throws zzlm {
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw new zzlm(sb.toString());
        }
        if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw new zzlm(sb2.toString());
        }
        switch (i2) {
            case 131:
                this.x.f12306c = (int) j2;
                return;
            case 136:
                this.x.L = j2 == 1;
                return;
            case 155:
                this.K = q(j2);
                return;
            case 159:
                this.x.G = (int) j2;
                return;
            case 176:
                this.x.f12313j = (int) j2;
                return;
            case 179:
                this.F.a(q(j2));
                return;
            case 186:
                this.x.f12314k = (int) j2;
                return;
            case 215:
                this.x.f12305b = (int) j2;
                return;
            case 231:
                this.E = q(j2);
                return;
            case 241:
                if (this.H) {
                    return;
                }
                this.G.a(j2);
                this.H = true;
                return;
            case 251:
                this.b0 = true;
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw new zzlm(sb3.toString());
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j2);
                    sb4.append(" not supported");
                    throw new zzlm(sb4.toString());
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw new zzlm(sb5.toString());
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new zzlm(sb6.toString());
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw new zzlm(sb7.toString());
            case 21420:
                this.A = j2 + this.t;
                return;
            case 21432:
                int i3 = (int) j2;
                if (i3 == 0) {
                    this.x.p = 0;
                    return;
                }
                if (i3 == 1) {
                    this.x.p = 2;
                    return;
                } else if (i3 == 3) {
                    this.x.p = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.x.p = 3;
                    return;
                }
            case 21680:
                this.x.l = (int) j2;
                return;
            case 21682:
                this.x.n = (int) j2;
                return;
            case 21690:
                this.x.m = (int) j2;
                return;
            case 21930:
                this.x.M = j2 == 1;
                return;
            case 22186:
                this.x.J = j2;
                return;
            case 22203:
                this.x.K = j2;
                return;
            case 25188:
                this.x.H = (int) j2;
                return;
            case 2352003:
                this.x.f12307d = (int) j2;
                return;
            case 2807729:
                this.u = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        int i4 = (int) j2;
                        if (i4 == 1) {
                            this.x.t = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.x.t = 1;
                            return;
                        }
                    case 21946:
                        int i5 = (int) j2;
                        if (i5 != 1) {
                            if (i5 == 16) {
                                this.x.s = 6;
                                return;
                            } else if (i5 == 18) {
                                this.x.s = 7;
                                return;
                            } else if (i5 != 6 && i5 != 7) {
                                return;
                            }
                        }
                        this.x.s = 3;
                        return;
                    case 21947:
                        w10 w10Var = this.x;
                        w10Var.q = true;
                        int i6 = (int) j2;
                        if (i6 == 1) {
                            w10Var.r = 1;
                            return;
                        }
                        if (i6 == 9) {
                            w10Var.r = 6;
                            return;
                        } else {
                            if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                w10Var.r = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.x.u = (int) j2;
                        return;
                    case 21949:
                        this.x.v = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(int i2) throws zzlm {
        zznu zznvVar;
        zzsn zzsnVar;
        zzsn zzsnVar2;
        int i3;
        if (i2 == 160) {
            if (this.I != 2) {
                return;
            }
            if (!this.b0) {
                this.Q |= 1;
            }
            k(this.f15356g.get(this.O), this.J);
            this.I = 0;
            return;
        }
        if (i2 == 174) {
            String str = this.x.a;
            if ((("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) ? 1 : 0) != 0) {
                w10 w10Var = this.x;
                w10Var.c(this.c0, w10Var.f12305b);
                SparseArray<w10> sparseArray = this.f15356g;
                w10 w10Var2 = this.x;
                sparseArray.put(w10Var2.f12305b, w10Var2);
            }
            this.x = null;
            return;
        }
        if (i2 == 19899) {
            int i4 = this.z;
            if (i4 != -1) {
                long j2 = this.A;
                if (j2 != -1) {
                    if (i4 == 475249515) {
                        this.C = j2;
                        return;
                    }
                    return;
                }
            }
            throw new zzlm("Mandatory element SeekID or SeekPosition not found");
        }
        if (i2 == 25152) {
            w10 w10Var3 = this.x;
            if (w10Var3.f12308e) {
                if (w10Var3.f12310g != null) {
                    w10Var3.f12312i = new zzne(new zzne.zza(zzkt.f15230b, "video/webm", this.x.f12310g.f15350b));
                    return;
                }
                throw new zzlm("Encrypted Track found but ContentEncKeyID was not found");
            }
            return;
        }
        if (i2 == 28032) {
            w10 w10Var4 = this.x;
            if (w10Var4.f12308e && w10Var4.f12309f != null) {
                throw new zzlm("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.u == -9223372036854775807L) {
                this.u = 1000000L;
            }
            long j3 = this.v;
            if (j3 != -9223372036854775807L) {
                this.w = q(j3);
                return;
            }
            return;
        }
        if (i2 != 374648427) {
            if (i2 == 475249515 && !this.y) {
                zznp zznpVar = this.c0;
                if (this.t != -1 && this.w != -9223372036854775807L && (zzsnVar = this.F) != null && zzsnVar.c() != 0 && (zzsnVar2 = this.G) != null && zzsnVar2.c() == this.F.c()) {
                    int c2 = this.F.c();
                    int[] iArr = new int[c2];
                    long[] jArr = new long[c2];
                    long[] jArr2 = new long[c2];
                    long[] jArr3 = new long[c2];
                    for (int i5 = 0; i5 < c2; i5++) {
                        jArr3[i5] = this.F.b(i5);
                        jArr[i5] = this.t + this.G.b(i5);
                    }
                    while (true) {
                        i3 = c2 - 1;
                        if (r1 >= i3) {
                            break;
                        }
                        int i6 = r1 + 1;
                        iArr[r1] = (int) (jArr[i6] - jArr[r1]);
                        jArr2[r1] = jArr3[i6] - jArr3[r1];
                        r1 = i6;
                    }
                    iArr[i3] = (int) ((this.t + this.s) - jArr[i3]);
                    jArr2[i3] = this.w - jArr3[i3];
                    this.F = null;
                    this.G = null;
                    zznvVar = new zznl(iArr, jArr, jArr2, jArr3);
                } else {
                    this.F = null;
                    this.G = null;
                    zznvVar = new zznv(this.w);
                }
                zznpVar.z(zznvVar);
                this.y = true;
                return;
            }
            return;
        }
        if (this.f15356g.size() != 0) {
            this.c0.c();
            return;
        }
        throw new zzlm("No valid tracks were found");
    }

    private zzod(int i2) {
        this(new p10(), 0);
    }

    private zzod(s10 s10Var, int i2) {
        this.t = -1L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f15354e = s10Var;
        s10Var.b(new v10(this, null));
        this.f15357h = true;
        this.f15355f = new y10();
        this.f15356g = new SparseArray<>();
        this.f15360k = new zzst(4);
        this.l = new zzst(ByteBuffer.allocate(4).putInt(-1).array());
        this.m = new zzst(4);
        this.f15358i = new zzst(zzsq.a);
        this.f15359j = new zzst(4);
        this.n = new zzst();
        this.o = new zzst();
        this.p = new zzst(8);
        this.q = new zzst();
    }
}
