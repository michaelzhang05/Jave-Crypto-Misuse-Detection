package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class w10 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public long J;
    public long K;
    public boolean L;
    public boolean M;
    private String N;
    public zznw O;
    public int P;
    public String a;

    /* renamed from: b */
    public int f12305b;

    /* renamed from: c */
    public int f12306c;

    /* renamed from: d */
    public int f12307d;

    /* renamed from: e */
    public boolean f12308e;

    /* renamed from: f */
    public byte[] f12309f;

    /* renamed from: g */
    public zznx f12310g;

    /* renamed from: h */
    public byte[] f12311h;

    /* renamed from: i */
    public zzne f12312i;

    /* renamed from: j */
    public int f12313j;

    /* renamed from: k */
    public int f12314k;
    public int l;
    public int m;
    public int n;
    public byte[] o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public float z;

    private w10() {
        this.f12313j = -1;
        this.f12314k = -1;
        this.l = -1;
        this.m = -1;
        this.n = 0;
        this.o = null;
        this.p = -1;
        this.q = false;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = 1000;
        this.v = 200;
        this.w = -1.0f;
        this.x = -1.0f;
        this.y = -1.0f;
        this.z = -1.0f;
        this.A = -1.0f;
        this.B = -1.0f;
        this.C = -1.0f;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = -1.0f;
        this.G = 1;
        this.H = -1;
        this.I = 8000;
        this.J = 0L;
        this.K = 0L;
        this.M = true;
        this.N = "eng";
    }

    public static /* synthetic */ String a(w10 w10Var, String str) {
        w10Var.N = str;
        return str;
    }

    private static List<byte[]> b(zzst zzstVar) throws zzlm {
        try {
            zzstVar.l(16);
            if (zzstVar.w() != 826496599) {
                return null;
            }
            byte[] bArr = zzstVar.a;
            for (int b2 = zzstVar.b() + 20; b2 < bArr.length - 4; b2++) {
                if (bArr[b2] == 0 && bArr[b2 + 1] == 0 && bArr[b2 + 2] == 1 && bArr[b2 + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, b2, bArr.length));
                }
            }
            throw new zzlm("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzlm("Error parsing FourCC VC1 codec private");
        }
    }

    private static boolean d(zzst zzstVar) throws zzlm {
        UUID uuid;
        UUID uuid2;
        try {
            int v = zzstVar.v();
            if (v == 1) {
                return true;
            }
            if (v == 65534) {
                zzstVar.k(24);
                long e2 = zzstVar.e();
                uuid = zzod.f15353d;
                if (e2 == uuid.getMostSignificantBits()) {
                    long e3 = zzstVar.e();
                    uuid2 = zzod.f15353d;
                    if (e3 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzlm("Error parsing MS/ACM codec private");
        }
    }

    private static List<byte[]> e(byte[] bArr) throws zzlm {
        try {
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
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new zzlm("Error parsing vorbis codec private");
                    }
                    throw new zzlm("Error parsing vorbis codec private");
                }
                throw new zzlm("Error parsing vorbis codec private");
            }
            throw new zzlm("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzlm("Error parsing vorbis codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0198. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0379  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.zznp r43, int r44) throws com.google.android.gms.internal.ads.zzlm {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w10.c(com.google.android.gms.internal.ads.zznp, int):void");
    }

    public /* synthetic */ w10(u10 u10Var) {
        this();
    }
}
