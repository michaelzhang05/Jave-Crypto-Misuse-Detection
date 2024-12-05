package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class zzdsr implements zzbd {

    /* renamed from: f, reason: collision with root package name */
    private static zzdtc f14966f = zzdtc.b(zzdsr.class);

    /* renamed from: g, reason: collision with root package name */
    private String f14967g;

    /* renamed from: h, reason: collision with root package name */
    private zzbe f14968h;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f14971k;
    private long l;
    private long m;
    private zzdsw o;
    private long n = -1;
    private ByteBuffer p = null;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14970j = true;

    /* renamed from: i, reason: collision with root package name */
    boolean f14969i = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdsr(String str) {
        this.f14967g = str;
    }

    private final synchronized void b() {
        if (!this.f14970j) {
            try {
                zzdtc zzdtcVar = f14966f;
                String valueOf = String.valueOf(this.f14967g);
                zzdtcVar.a(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.f14971k = this.o.h(this.l, this.n);
                this.f14970j = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    public final void a(zzdsw zzdswVar, ByteBuffer byteBuffer, long j2, zzba zzbaVar) throws IOException {
        long H = zzdswVar.H();
        this.l = H;
        this.m = H - byteBuffer.remaining();
        this.n = j2;
        this.o = zzdswVar;
        zzdswVar.j0(zzdswVar.H() + j2);
        this.f14970j = false;
        this.f14969i = false;
        c();
    }

    public final synchronized void c() {
        b();
        zzdtc zzdtcVar = f14966f;
        String valueOf = String.valueOf(this.f14967g);
        zzdtcVar.a(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f14971k;
        if (byteBuffer != null) {
            this.f14969i = true;
            byteBuffer.rewind();
            d(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.p = byteBuffer.slice();
            }
            this.f14971k = null;
        }
    }

    protected abstract void d(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.zzbd
    public final void f(zzbe zzbeVar) {
        this.f14968h = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    public final String getType() {
        return this.f14967g;
    }
}
