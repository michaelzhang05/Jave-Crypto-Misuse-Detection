package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes2.dex */
public abstract class zzpe extends zzks {

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f15397i = zzsy.n("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private ByteBuffer[] F;
    private ByteBuffer[] G;
    private long H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    protected zznc U;

    /* renamed from: j, reason: collision with root package name */
    private final zzpg f15398j;

    /* renamed from: k, reason: collision with root package name */
    private final zznj<Object> f15399k;
    private final boolean l;
    private final zznd m;
    private final zznd n;
    private final zzlj o;
    private final List<Long> p;
    private final MediaCodec.BufferInfo q;
    private zzlh r;
    private zznh<Object> s;
    private zznh<Object> t;
    private MediaCodec u;
    private zzpd v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public zzpe(int i2, zzpg zzpgVar, zznj<Object> zznjVar, boolean z) {
        super(i2);
        zzsk.e(zzsy.a >= 16);
        this.f15398j = (zzpg) zzsk.d(zzpgVar);
        this.f15399k = zznjVar;
        this.l = z;
        this.m = new zznd(0);
        this.n = new zznd(0);
        this.o = new zzlj();
        this.p = new ArrayList();
        this.q = new MediaCodec.BufferInfo();
        this.M = 0;
        this.N = 0;
    }

    private final void M(zzpf zzpfVar) throws zzku {
        throw zzku.b(zzpfVar, g());
    }

    private final boolean S(long j2, long j3) throws zzku {
        boolean N;
        boolean z;
        if (this.J < 0) {
            if (this.B && this.P) {
                try {
                    this.J = this.u.dequeueOutputBuffer(this.q, 0L);
                } catch (IllegalStateException unused) {
                    Z();
                    if (this.R) {
                        U();
                    }
                    return false;
                }
            } else {
                this.J = this.u.dequeueOutputBuffer(this.q, 0L);
            }
            int i2 = this.J;
            if (i2 < 0) {
                if (i2 != -2) {
                    if (i2 == -3) {
                        this.G = this.u.getOutputBuffers();
                        return true;
                    }
                    if (this.z && (this.Q || this.N == 2)) {
                        Z();
                    }
                    return false;
                }
                MediaFormat outputFormat = this.u.getOutputFormat();
                if (this.y && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.E = true;
                } else {
                    if (this.C) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    H(this.u, outputFormat);
                }
                return true;
            }
            if (this.E) {
                this.E = false;
                this.u.releaseOutputBuffer(i2, false);
                this.J = -1;
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.q;
            if ((bufferInfo.flags & 4) != 0) {
                Z();
                this.J = -1;
                return false;
            }
            ByteBuffer byteBuffer = this.G[i2];
            if (byteBuffer != null) {
                byteBuffer.position(bufferInfo.offset);
                MediaCodec.BufferInfo bufferInfo2 = this.q;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j4 = this.q.presentationTimeUs;
            int size = this.p.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (this.p.get(i3).longValue() == j4) {
                    this.p.remove(i3);
                    z = true;
                    break;
                }
                i3++;
            }
            this.K = z;
        }
        if (this.B && this.P) {
            try {
                MediaCodec mediaCodec = this.u;
                ByteBuffer[] byteBufferArr = this.G;
                int i4 = this.J;
                ByteBuffer byteBuffer2 = byteBufferArr[i4];
                MediaCodec.BufferInfo bufferInfo3 = this.q;
                N = N(j2, j3, mediaCodec, byteBuffer2, i4, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.K);
            } catch (IllegalStateException unused2) {
                Z();
                if (this.R) {
                    U();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.u;
            ByteBuffer[] byteBufferArr2 = this.G;
            int i5 = this.J;
            ByteBuffer byteBuffer3 = byteBufferArr2[i5];
            MediaCodec.BufferInfo bufferInfo4 = this.q;
            N = N(j2, j3, mediaCodec2, byteBuffer3, i5, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.K);
        }
        if (!N) {
            return false;
        }
        long j5 = this.q.presentationTimeUs;
        this.J = -1;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean Y() throws com.google.android.gms.internal.ads.zzku {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.Y():boolean");
    }

    private final void Z() throws zzku {
        if (this.N == 2) {
            U();
            T();
        } else {
            this.R = true;
            V();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void C(long j2, long j3) throws zzku {
        if (this.R) {
            V();
            return;
        }
        if (this.r == null) {
            this.n.a();
            int j4 = j(this.o, this.n, true);
            if (j4 != -5) {
                if (j4 == -4) {
                    zzsk.e(this.n.f());
                    this.Q = true;
                    Z();
                    return;
                }
                return;
            }
            Q(this.o.a);
        }
        T();
        if (this.u != null) {
            zzsx.a("drainAndFeed");
            do {
            } while (S(j2, j3));
            do {
            } while (Y());
            zzsx.b();
        } else {
            m(j2);
            this.n.a();
            int j5 = j(this.o, this.n, false);
            if (j5 == -5) {
                Q(this.o.a);
            } else if (j5 == -4) {
                zzsk.e(this.n.f());
                this.Q = true;
                Z();
            }
        }
        this.U.a();
    }

    protected void H(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzku {
    }

    protected abstract int I(zzpg zzpgVar, zzlh zzlhVar) throws zzpk;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzpd J(zzpg zzpgVar, zzlh zzlhVar, boolean z) throws zzpk {
        return zzpgVar.b(zzlhVar.f15250k, z);
    }

    protected void K(zznd zzndVar) {
    }

    protected abstract void L(zzpd zzpdVar, MediaCodec mediaCodec, zzlh zzlhVar, MediaCrypto mediaCrypto) throws zzpk;

    protected abstract boolean N(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws zzku;

    protected boolean O(MediaCodec mediaCodec, boolean z, zzlh zzlhVar, zzlh zzlhVar2) {
        return false;
    }

    protected boolean P(zzpd zzpdVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r5.p == r0.p) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q(com.google.android.gms.internal.ads.zzlh r5) throws com.google.android.gms.internal.ads.zzku {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzlh r0 = r4.r
            r4.r = r5
            com.google.android.gms.internal.ads.zzne r5 = r5.n
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.google.android.gms.internal.ads.zzne r2 = r0.n
        Ld:
            boolean r5 = com.google.android.gms.internal.ads.zzsy.g(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L49
            com.google.android.gms.internal.ads.zzlh r5 = r4.r
            com.google.android.gms.internal.ads.zzne r5 = r5.n
            if (r5 == 0) goto L47
            com.google.android.gms.internal.ads.zznj<java.lang.Object> r5 = r4.f15399k
            if (r5 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.zzlh r3 = r4.r
            com.google.android.gms.internal.ads.zzne r3 = r3.n
            com.google.android.gms.internal.ads.zznh r5 = r5.a(r1, r3)
            r4.t = r5
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r1 = r4.s
            if (r5 != r1) goto L49
            com.google.android.gms.internal.ads.zznj<java.lang.Object> r1 = r4.f15399k
            r1.b(r5)
            goto L49
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.g()
            com.google.android.gms.internal.ads.zzku r5 = com.google.android.gms.internal.ads.zzku.b(r5, r0)
            throw r5
        L47:
            r4.t = r1
        L49:
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r5 = r4.t
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r1 = r4.s
            if (r5 != r1) goto L7a
            android.media.MediaCodec r5 = r4.u
            if (r5 == 0) goto L7a
            com.google.android.gms.internal.ads.zzpd r1 = r4.v
            boolean r1 = r1.f15392b
            com.google.android.gms.internal.ads.zzlh r3 = r4.r
            boolean r5 = r4.O(r5, r1, r0, r3)
            if (r5 == 0) goto L7a
            r4.L = r2
            r4.M = r2
            boolean r5 = r4.y
            if (r5 == 0) goto L76
            com.google.android.gms.internal.ads.zzlh r5 = r4.r
            int r1 = r5.o
            int r3 = r0.o
            if (r1 != r3) goto L76
            int r5 = r5.p
            int r0 = r0.p
            if (r5 != r0) goto L76
            goto L77
        L76:
            r2 = 0
        L77:
            r4.D = r2
            return
        L7a:
            boolean r5 = r4.O
            if (r5 == 0) goto L81
            r4.N = r2
            return
        L81:
            r4.U()
            r4.T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.Q(com.google.android.gms.internal.ads.zzlh):void");
    }

    protected void R(String str, long j2, long j3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(28:24|(1:114)(1:30)|31|(1:113)(1:45)|46|(2:52|(18:60|61|(1:111)(1:67)|68|(1:110)(1:72)|73|(1:102)(1:77)|78|(1:101)(1:84)|85|86|87|(1:89)(1:98)|90|91|(1:93)(1:96)|94|95))|112|61|(2:63|65)|111|68|(1:70)|110|73|(1:75)|102|78|(1:80)|101|85|86|87|(0)(0)|90|91|(0)(0)|94|95) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d3, code lost:
    
        M(new com.google.android.gms.internal.ads.zzpf(r11.r, (java.lang.Throwable) r1, false, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d2, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0181 A[Catch: Exception -> 0x01d2, TryCatch #1 {Exception -> 0x01d2, blocks: (B:87:0x0171, B:89:0x0181, B:90:0x018c, B:98:0x0186), top: B:86:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0186 A[Catch: Exception -> 0x01d2, TryCatch #1 {Exception -> 0x01d2, blocks: (B:87:0x0171, B:89:0x0181, B:90:0x018c, B:98:0x0186), top: B:86:0x0171 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() throws com.google.android.gms.internal.ads.zzku {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.T():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U() {
        this.H = -9223372036854775807L;
        this.I = -1;
        this.J = -1;
        this.S = false;
        this.K = false;
        this.p.clear();
        this.F = null;
        this.G = null;
        this.v = null;
        this.L = false;
        this.O = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.P = false;
        this.M = 0;
        this.N = 0;
        this.m.f15325c = null;
        MediaCodec mediaCodec = this.u;
        if (mediaCodec != null) {
            this.U.f15318b++;
            try {
                mediaCodec.stop();
                try {
                    this.u.release();
                    this.u = null;
                    zznh<Object> zznhVar = this.s;
                    if (zznhVar == null || this.t == zznhVar) {
                        return;
                    }
                    try {
                        this.f15399k.b(zznhVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.u = null;
                    zznh<Object> zznhVar2 = this.s;
                    if (zznhVar2 != null && this.t != zznhVar2) {
                        try {
                            this.f15399k.b(zznhVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.u.release();
                    this.u = null;
                    zznh<Object> zznhVar3 = this.s;
                    if (zznhVar3 != null && this.t != zznhVar3) {
                        try {
                            this.f15399k.b(zznhVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.u = null;
                    zznh<Object> zznhVar4 = this.s;
                    if (zznhVar4 != null && this.t != zznhVar4) {
                        try {
                            this.f15399k.b(zznhVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    protected void V() throws zzku {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodec W() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzpd X() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.zzks, com.google.android.gms.internal.ads.zzlp
    public final int a() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final int b(zzlh zzlhVar) throws zzku {
        try {
            return I(this.f15398j, zzlhVar);
        } catch (zzpk e2) {
            throw zzku.b(e2, g());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzks
    public void h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzks
    public void i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzks
    public void l(long j2, boolean z) throws zzku {
        this.Q = false;
        this.R = false;
        if (this.u != null) {
            this.H = -9223372036854775807L;
            this.I = -1;
            this.J = -1;
            this.T = true;
            this.S = false;
            this.K = false;
            this.p.clear();
            this.D = false;
            this.E = false;
            if (!this.x && (!this.A || !this.P)) {
                if (this.N != 0) {
                    U();
                    T();
                } else {
                    this.u.flush();
                    this.O = false;
                }
            } else {
                U();
                T();
            }
            if (!this.L || this.r == null) {
                return;
            }
            this.M = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzks
    public void n() {
        this.r = null;
        try {
            U();
            try {
                zznh<Object> zznhVar = this.s;
                if (zznhVar != null) {
                    this.f15399k.b(zznhVar);
                }
                try {
                    zznh<Object> zznhVar2 = this.t;
                    if (zznhVar2 != null && zznhVar2 != this.s) {
                        this.f15399k.b(zznhVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    zznh<Object> zznhVar3 = this.t;
                    if (zznhVar3 != null && zznhVar3 != this.s) {
                        this.f15399k.b(zznhVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.s != null) {
                    this.f15399k.b(this.s);
                }
                try {
                    zznh<Object> zznhVar4 = this.t;
                    if (zznhVar4 != null && zznhVar4 != this.s) {
                        this.f15399k.b(zznhVar4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    zznh<Object> zznhVar5 = this.t;
                    if (zznhVar5 != null && zznhVar5 != this.s) {
                        this.f15399k.b(zznhVar5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzks
    public void o(boolean z) throws zzku {
        this.U = new zznc();
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public boolean p() {
        if (this.r == null || this.S) {
            return false;
        }
        if (G() || this.J >= 0) {
            return true;
        }
        return this.H != -9223372036854775807L && SystemClock.elapsedRealtime() < this.H;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public boolean q() {
        return this.R;
    }
}
