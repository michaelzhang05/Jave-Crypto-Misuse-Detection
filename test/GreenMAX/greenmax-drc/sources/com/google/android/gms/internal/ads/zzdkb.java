package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* loaded from: classes2.dex */
public final class zzdkb implements zzdbp {
    private static final byte[] a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private final ECPrivateKey f14760b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdkd f14761c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14762d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f14763e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdkv f14764f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdka f14765g;

    public zzdkb(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzdkv zzdkvVar, zzdka zzdkaVar) throws GeneralSecurityException {
        this.f14760b = eCPrivateKey;
        this.f14761c = new zzdkd(eCPrivateKey);
        this.f14763e = bArr;
        this.f14762d = str;
        this.f14764f = zzdkvVar;
        this.f14765g = zzdkaVar;
    }
}
