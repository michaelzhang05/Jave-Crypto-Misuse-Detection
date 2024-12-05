package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes2.dex */
public abstract class zzgr extends zzhp {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private long F;

    /* renamed from: b, reason: collision with root package name */
    public final zzga f15075b;

    /* renamed from: c, reason: collision with root package name */
    private final zzhz f15076c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15077d;

    /* renamed from: e, reason: collision with root package name */
    private final zzhn f15078e;

    /* renamed from: f, reason: collision with root package name */
    private final zzhm f15079f;

    /* renamed from: g, reason: collision with root package name */
    private final zzhk f15080g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Long> f15081h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.BufferInfo f15082i;

    /* renamed from: j, reason: collision with root package name */
    private final zzgw f15083j;

    /* renamed from: k, reason: collision with root package name */
    protected final Handler f15084k;
    private zzhj l;
    private zzhw m;
    private MediaCodec n;
    private boolean o;
    private ByteBuffer[] p;
    private ByteBuffer[] q;
    private long r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z;

    public zzgr(zzhn zzhnVar, zzhz zzhzVar, boolean z, Handler handler, zzgw zzgwVar) {
        zzkh.d(zzkq.a >= 16);
        this.f15078e = zzhnVar;
        this.f15076c = null;
        this.f15077d = true;
        this.f15084k = handler;
        this.f15083j = zzgwVar;
        this.f15075b = new zzga();
        this.f15079f = new zzhm(0);
        this.f15080g = new zzhk();
        this.f15081h = new ArrayList();
        this.f15082i = new MediaCodec.BufferInfo();
        this.w = 0;
        this.x = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean G(boolean r18) throws java.io.IOException, com.google.android.gms.internal.ads.zzgd {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.G(boolean):boolean");
    }

    private final void L() throws zzgd {
        this.r = -1L;
        this.s = -1;
        this.t = -1;
        this.E = true;
        this.D = false;
        this.f15081h.clear();
        if (zzkq.a >= 18 && this.x == 0) {
            this.n.flush();
            this.y = false;
        } else {
            K();
            H();
        }
        if (!this.v || this.l == null) {
            return;
        }
        this.w = 1;
    }

    private final void x(MediaCodec.CryptoException cryptoException) {
        Handler handler = this.f15084k;
        if (handler == null || this.f15083j == null) {
            return;
        }
        handler.post(new ez(this, cryptoException));
    }

    private final void z(zzgv zzgvVar) throws zzgd {
        Handler handler = this.f15084k;
        if (handler != null && this.f15083j != null) {
            handler.post(new dz(this, zzgvVar));
        }
        throw new zzgd(zzgvVar);
    }

    protected void A(zzhj zzhjVar, MediaFormat mediaFormat) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B(zzhk zzhkVar) throws zzgd {
        zzhj zzhjVar = this.l;
        zzhj zzhjVar2 = zzhkVar.a;
        this.l = zzhjVar2;
        this.m = zzhkVar.f15101b;
        MediaCodec mediaCodec = this.n;
        if (mediaCodec != null && D(mediaCodec, this.o, zzhjVar, zzhjVar2)) {
            this.v = true;
            this.w = 1;
        } else if (this.y) {
            this.x = 1;
        } else {
            K();
            H();
        }
    }

    protected abstract boolean C(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i2, boolean z) throws zzgd;

    protected boolean D(MediaCodec mediaCodec, boolean z, zzhj zzhjVar, zzhj zzhjVar2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean E(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgc F(String str, boolean z) throws zzgz {
        return zzgx.b(str, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H() throws zzgd {
        MediaCrypto mediaCrypto;
        zzgc zzgcVar;
        if (I()) {
            String str = this.l.a;
            boolean z = false;
            zzhw zzhwVar = this.m;
            if (zzhwVar != null) {
                zzhz zzhzVar = this.f15076c;
                if (zzhzVar != null) {
                    if (!this.u) {
                        zzhzVar.c(zzhwVar);
                        this.u = true;
                    }
                    int state = this.f15076c.getState();
                    if (state == 0) {
                        throw new zzgd(this.f15076c.b());
                    }
                    if (state != 3 && state != 4) {
                        return;
                    }
                    mediaCrypto = this.f15076c.d();
                    z = this.f15076c.a(str);
                } else {
                    throw new zzgd("Media requires a DrmSessionManager");
                }
            } else {
                mediaCrypto = null;
            }
            try {
                zzgcVar = F(str, z);
            } catch (zzgz e2) {
                z(new zzgv(this.l, e2, -49998));
                zzgcVar = null;
            }
            if (zzgcVar == null) {
                z(new zzgv(this.l, (Throwable) null, -49999));
            }
            String str2 = zzgcVar.a;
            this.o = zzgcVar.f15063b;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                MediaCodec createByCodecName = MediaCodec.createByCodecName(str2);
                this.n = createByCodecName;
                y(createByCodecName, str2, this.l.i(), mediaCrypto);
                this.n.start();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = this.f15084k;
                if (handler != null && this.f15083j != null) {
                    handler.post(new fz(this, str2, elapsedRealtime2, j2));
                }
                this.p = this.n.getInputBuffers();
                this.q = this.n.getOutputBuffers();
            } catch (Exception e3) {
                z(new zzgv(this.l, e3, str2));
            }
            this.r = d() == 3 ? SystemClock.elapsedRealtime() : -1L;
            this.s = -1;
            this.t = -1;
            this.E = true;
            this.f15075b.a++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean I() {
        return this.n == null && this.l != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean J() {
        return this.n != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K() {
        if (this.n != null) {
            this.r = -1L;
            this.s = -1;
            this.t = -1;
            this.D = false;
            this.f15081h.clear();
            this.p = null;
            this.q = null;
            this.v = false;
            this.y = false;
            this.o = false;
            this.w = 0;
            this.x = 0;
            this.f15075b.f15051b++;
            try {
                this.n.stop();
                try {
                    this.n.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.n.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int M() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public final long b() {
        return this.f15078e.u(this.z).f15107b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public boolean e() {
        if (this.l != null && !this.D) {
            if (this.A == 0 && this.t < 0) {
                if (SystemClock.elapsedRealtime() < this.r + 1000) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public void f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public void g() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public void i(long j2) throws zzgd {
        this.F = j2;
        this.f15078e.s(j2);
        this.A = 0;
        this.B = false;
        this.C = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r17.n != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r17.C != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r17.t >= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r17.t = r17.n.dequeueOutputBuffer(r17.f15082i, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r0 = r17.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r0 != (-2)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        A(r17.l, r17.n.getOutputFormat());
        r17.f15075b.f15052c++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
    
        if (r14 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        if (G(true) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
    
        if (G(false) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
    
        if (r0 != (-3)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
    
        r17.q = r17.n.getOutputBuffers();
        r17.f15075b.f15053d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        if (r0 < 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
    
        r0 = r17.f15082i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        if ((r0.flags & 4) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
    
        if (r17.x != 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
    
        K();
        H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
    
        r17.C = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        r0 = r0.presentationTimeUs;
        r2 = r17.f15081h.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
    
        if (r3 >= r2) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cf, code lost:
    
        if (r17.f15081h.get(r3).longValue() != r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d1, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d7, code lost:
    
        r6 = r17.n;
        r1 = r17.q;
        r9 = r17.t;
        r7 = r1[r9];
        r8 = r17.f15082i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r0 == (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e3, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f5, code lost:
    
        if (C(r18, r20, r6, r7, r8, r9, r16) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f7, code lost:
    
        if (r0 == (-1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f9, code lost:
    
        r17.f15081h.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        r17.t = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ff, code lost:
    
        r17.F = r17.f15082i.presentationTimeUs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e6, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d6, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0109, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        r17.f15075b.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011e, code lost:
    
        return;
     */
    @Override // com.google.android.gms.internal.ads.zzhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(long r18, long r20) throws com.google.android.gms.internal.ads.zzgd {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.l(long, long):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public void m(long j2, boolean z) {
        this.f15078e.p(this.z, j2);
        this.A = 0;
        this.B = false;
        this.C = false;
        this.D = false;
        this.F = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    protected final int o(long j2) throws zzgd {
        try {
            if (!this.f15078e.t(j2)) {
                return 0;
            }
            for (int i2 = 0; i2 < this.f15078e.r(); i2++) {
                if (E(this.f15078e.u(i2).a)) {
                    this.z = i2;
                    return 1;
                }
            }
            return -1;
        } catch (IOException e2) {
            throw new zzgd(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public final long q() {
        long q = this.f15078e.q();
        return (q == -1 || q == -3) ? q : Math.max(q, t());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public boolean s() {
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public long t() {
        return this.F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public void u() {
        this.l = null;
        this.m = null;
        try {
            K();
            try {
                if (this.u) {
                    this.f15076c.close();
                    this.u = false;
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                if (this.u) {
                    this.f15076c.close();
                    this.u = false;
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    protected final void v() {
        this.f15078e.a();
    }

    protected void y(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
    }
}
