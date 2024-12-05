package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzgn extends zzgr {
    private final zzgq G;
    private final zzhq H;
    private int I;
    private long J;

    public zzgn(zzhn zzhnVar, Handler handler, zzgq zzgqVar) {
        this(zzhnVar, null, true, handler, zzgqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected final void A(zzhj zzhjVar, MediaFormat mediaFormat) {
        if (zzkl.c(zzhjVar.a)) {
            this.H.h(zzhjVar.i(), 0);
        } else {
            this.H.h(mediaFormat, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected final boolean C(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i2, boolean z) throws zzgd {
        if (z) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.f15075b.f15055f++;
            this.H.l();
            return true;
        }
        if (!this.H.a()) {
            try {
                int i3 = this.I;
                if (i3 != 0) {
                    this.H.q(i3);
                } else {
                    this.I = this.H.q(0);
                }
                if (d() == 3) {
                    this.H.c();
                }
            } catch (zzhu e2) {
                Handler handler = this.f15084k;
                if (handler != null && this.G != null) {
                    handler.post(new bz(this, e2));
                }
                throw new zzgd(e2);
            }
        }
        try {
            int f2 = this.H.f(byteBuffer, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs);
            if ((f2 & 1) != 0) {
                this.J = Long.MIN_VALUE;
            }
            if ((f2 & 2) == 0) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.f15075b.f15054e++;
            return true;
        } catch (zzhv e3) {
            Handler handler2 = this.f15084k;
            if (handler2 != null && this.G != null) {
                handler2.post(new cz(this, e3));
            }
            throw new zzgd(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr
    public final boolean E(String str) {
        return zzkl.b(str) && super.E(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr
    public final zzgc F(String str, boolean z) throws zzgz {
        if (zzkl.c(str)) {
            return new zzgc("OMX.google.raw.decoder", true);
        }
        return super.F(str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzgf
    public final void c(int i2, Object obj) throws zzgd {
        if (i2 == 1) {
            this.H.e(((Float) obj).floatValue());
        } else {
            super.c(i2, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    public final boolean e() {
        if (this.H.m()) {
            return true;
        }
        return super.e() && M() == 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    public final void f() {
        super.f();
        this.H.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    public final void g() {
        this.H.b();
        super.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    public final void i(long j2) throws zzgd {
        super.i(j2);
        this.H.d();
        this.J = Long.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    public final void m(long j2, boolean z) {
        super.m(j2, z);
        this.J = Long.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhp
    public final boolean r() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    public final boolean s() {
        if (super.s()) {
            return (this.H.m() && this.H.n()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    public final long t() {
        long p = this.H.p(s());
        if (p == Long.MIN_VALUE) {
            this.J = Math.max(this.J, super.t());
        } else {
            this.J = Math.max(this.J, p);
        }
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    public final void u() {
        this.I = 0;
        try {
            this.H.d();
        } finally {
            super.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected final void y(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        if ("OMX.google.raw.decoder".equals(str)) {
            String string = mediaFormat.getString("mime");
            mediaFormat.setString("mime", "audio/raw");
            mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
            mediaFormat.setString("mime", string);
            return;
        }
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
    }

    private zzgn(zzhn zzhnVar, zzhz zzhzVar, boolean z, Handler handler, zzgq zzgqVar) {
        super(zzhnVar, null, true, handler, zzgqVar);
        this.G = zzgqVar;
        this.I = 0;
        this.H = new zzhq();
    }
}
