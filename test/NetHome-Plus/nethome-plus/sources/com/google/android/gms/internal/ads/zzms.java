package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzms extends zzpe implements zzso {
    private final zzma V;
    private final zzmh W;
    private boolean X;
    private boolean Y;
    private MediaFormat Z;
    private int a0;
    private int b0;
    private long c0;
    private boolean d0;

    public zzms(zzpg zzpgVar) {
        this(zzpgVar, null, true);
    }

    public static /* synthetic */ boolean b0(zzms zzmsVar, boolean z) {
        zzmsVar.d0 = true;
        return true;
    }

    public static void c0(int i2) {
    }

    private final boolean d0(String str) {
        return this.W.l(str);
    }

    public static void e0(int i2, long j2, long j3) {
    }

    public static void f0() {
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    protected final void H(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzku {
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.Z;
        boolean z = mediaFormat2 != null;
        String string = z ? mediaFormat2.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.Z;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.Y && integer == 6 && (i2 = this.b0) < 6) {
            iArr = new int[i2];
            for (int i3 = 0; i3 < this.b0; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            this.W.i(string, integer, integer2, this.a0, 0, iArr);
        } catch (zzml e2) {
            throw zzku.b(e2, g());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    protected final int I(zzpg zzpgVar, zzlh zzlhVar) throws zzpk {
        int i2;
        int i3;
        String str = zzlhVar.f15250k;
        boolean z = false;
        if (!zzsp.b(str)) {
            return 0;
        }
        int i4 = zzsy.a;
        int i5 = i4 >= 21 ? 16 : 0;
        if (d0(str) && zzpgVar.a() != null) {
            return i5 | 4 | 3;
        }
        zzpd b2 = zzpgVar.b(str, false);
        if (b2 == null) {
            return 1;
        }
        if (i4 < 21 || (((i2 = zzlhVar.x) == -1 || b2.e(i2)) && ((i3 = zzlhVar.w) == -1 || b2.f(i3)))) {
            z = true;
        }
        return i5 | 4 | (z ? 3 : 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzpe
    public final zzpd J(zzpg zzpgVar, zzlh zzlhVar, boolean z) throws zzpk {
        zzpd a;
        if (d0(zzlhVar.f15250k) && (a = zzpgVar.a()) != null) {
            this.X = true;
            return a;
        }
        this.X = false;
        return super.J(zzpgVar, zzlhVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    @Override // com.google.android.gms.internal.ads.zzpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void L(com.google.android.gms.internal.ads.zzpd r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzlh r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.a
            int r7 = com.google.android.gms.internal.ads.zzsy.a
            r0 = 0
            r1 = 24
            if (r7 >= r1) goto L37
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzsy.f15564c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzsy.f15563b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L35
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L35
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L37
        L35:
            r4 = 1
            goto L38
        L37:
            r4 = 0
        L38:
            r3.Y = r4
            boolean r4 = r3.X
            r7 = 0
            if (r4 == 0) goto L59
            android.media.MediaFormat r4 = r6.m()
            r3.Z = r4
            java.lang.String r1 = "mime"
            java.lang.String r2 = "audio/raw"
            r4.setString(r1, r2)
            android.media.MediaFormat r4 = r3.Z
            r5.configure(r4, r7, r7, r0)
            android.media.MediaFormat r4 = r3.Z
            java.lang.String r5 = r6.f15250k
            r4.setString(r1, r5)
            return
        L59:
            android.media.MediaFormat r4 = r6.m()
            r5.configure(r4, r7, r7, r0)
            r3.Z = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzms.L(com.google.android.gms.internal.ads.zzpd, android.media.MediaCodec, com.google.android.gms.internal.ads.zzlh, android.media.MediaCrypto):void");
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    protected final boolean N(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws zzku {
        if (this.X && (i3 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i2, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.U.f15321e++;
            this.W.t();
            return true;
        }
        try {
            if (!this.W.j(byteBuffer, j4)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.U.f15320d++;
            return true;
        } catch (zzmm | zzmp e2) {
            throw zzku.b(e2, g());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzpe
    public final void Q(zzlh zzlhVar) throws zzku {
        super.Q(zzlhVar);
        this.V.c(zzlhVar);
        this.a0 = "audio/raw".equals(zzlhVar.f15250k) ? zzlhVar.y : 2;
        this.b0 = zzlhVar.w;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    protected final void R(String str, long j2, long j3) {
        this.V.e(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    protected final void V() throws zzku {
        try {
            this.W.y();
        } catch (zzmp e2) {
            throw zzku.b(e2, g());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks, com.google.android.gms.internal.ads.zzkx
    public final void c(int i2, Object obj) throws zzku {
        if (i2 == 2) {
            this.W.g(((Float) obj).floatValue());
        } else if (i2 != 3) {
            super.c(i2, obj);
        } else {
            this.W.f(((Integer) obj).intValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzln d(zzln zzlnVar) {
        return this.W.m(zzlnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final long e() {
        long w = this.W.w(q());
        if (w != Long.MIN_VALUE) {
            if (!this.d0) {
                w = Math.max(this.c0, w);
            }
            this.c0 = w;
            this.d0 = false;
        }
        return this.c0;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzln f() {
        return this.W.A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    public final void h() {
        super.h();
        this.W.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    public final void i() {
        this.W.b();
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    public final void l(long j2, boolean z) throws zzku {
        super.l(j2, z);
        this.W.e();
        this.c0 = j2;
        this.d0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    public final void n() {
        try {
            this.W.d();
            try {
                super.n();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.n();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    public final void o(boolean z) throws zzku {
        super.o(z);
        this.V.d(this.U);
        int i2 = F().f15257b;
        if (i2 != 0) {
            this.W.k(i2);
        } else {
            this.W.B();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzlo
    public final boolean p() {
        return this.W.u() || super.p();
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzlo
    public final boolean q() {
        return super.q() && this.W.r();
    }

    @Override // com.google.android.gms.internal.ads.zzks, com.google.android.gms.internal.ads.zzlo
    public final zzso v() {
        return this;
    }

    private zzms(zzpg zzpgVar, zznj<Object> zznjVar, boolean z) {
        this(zzpgVar, null, true, null, null);
    }

    private zzms(zzpg zzpgVar, zznj<Object> zznjVar, boolean z, Handler handler, zzlz zzlzVar) {
        this(zzpgVar, null, true, null, null, null, new zzlx[0]);
    }

    private zzms(zzpg zzpgVar, zznj<Object> zznjVar, boolean z, Handler handler, zzlz zzlzVar, zzlw zzlwVar, zzlx... zzlxVarArr) {
        super(1, zzpgVar, zznjVar, z);
        this.W = new zzmh(null, zzlxVarArr, new h10(this));
        this.V = new zzma(null, null);
    }
}
