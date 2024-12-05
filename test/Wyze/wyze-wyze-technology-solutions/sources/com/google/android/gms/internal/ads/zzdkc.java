package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes2.dex */
public final class zzdkc implements zzdbq {
    private static final byte[] a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private final zzdke f14766b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14767c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f14768d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdkv f14769e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdka f14770f;

    public zzdkc(ECPublicKey eCPublicKey, byte[] bArr, String str, zzdkv zzdkvVar, zzdka zzdkaVar) throws GeneralSecurityException {
        zzdkr.g(eCPublicKey);
        this.f14766b = new zzdke(eCPublicKey);
        this.f14768d = bArr;
        this.f14767c = str;
        this.f14769e = zzdkvVar;
        this.f14770f = zzdkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbq
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzdkf a2 = this.f14766b.a(this.f14767c, this.f14768d, bArr2, this.f14770f.b(), this.f14769e);
        byte[] a3 = this.f14770f.a(a2.b()).a(bArr, a);
        byte[] a4 = a2.a();
        return ByteBuffer.allocate(a4.length + a3.length).put(a4).put(a3).array();
    }
}
