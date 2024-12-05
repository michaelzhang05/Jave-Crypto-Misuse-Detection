package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class zzdss extends zzdsu implements zzbd {
    private zzbe o;
    private String p;
    private boolean q;
    private long r;

    public zzdss(String str) {
        this.p = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    public final void a(zzdsw zzdswVar, ByteBuffer byteBuffer, long j2, zzba zzbaVar) throws IOException {
        this.r = zzdswVar.H() - byteBuffer.remaining();
        this.q = byteBuffer.remaining() == 16;
        o(zzdswVar, j2, zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    public final void f(zzbe zzbeVar) {
        this.o = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    public final String getType() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.zzdsu
    public final void o(zzdsw zzdswVar, long j2, zzba zzbaVar) throws IOException {
        this.f14975i = zzdswVar;
        long H = zzdswVar.H();
        this.f14977k = H;
        this.l = H - ((this.q || 8 + j2 >= 4294967296L) ? 16 : 8);
        zzdswVar.j0(zzdswVar.H() + j2);
        this.m = zzdswVar.H();
        this.f14974h = zzbaVar;
    }
}
