package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzdha;
import java.security.GeneralSecurityException;

@Deprecated
/* loaded from: classes2.dex */
public final class zzdbz {
    private static void a(zzdha zzdhaVar) throws GeneralSecurityException {
        for (zzdha.zzb zzbVar : zzdhaVar.y()) {
            if (zzbVar.A().E() == zzdgr.zzb.UNKNOWN_KEYMATERIAL || zzbVar.A().E() == zzdgr.zzb.SYMMETRIC || zzbVar.A().E() == zzdgr.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("keyset contains secret key material");
            }
        }
    }

    @Deprecated
    public static final zzdbu b(byte[] bArr) throws GeneralSecurityException {
        try {
            zzdha C = zzdha.C(bArr);
            a(C);
            return zzdbu.a(C);
        } catch (zzdok unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
