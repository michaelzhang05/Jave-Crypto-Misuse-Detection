package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdcs implements zzdbj {
    private static final byte[] a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private final zzdgw f14695b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdbj f14696c;

    public zzdcs(zzdgw zzdgwVar, zzdbj zzdbjVar) {
        this.f14695b = zzdgwVar;
        this.f14696c = zzdbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] g2 = zzdcf.n(this.f14695b).g();
        byte[] a2 = this.f14696c.a(g2, a);
        byte[] a3 = ((zzdbj) zzdcf.i(this.f14695b.x(), g2, zzdbj.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }
}
