package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes2.dex */
public final class zzdlb implements zzdky<KeyFactory> {
    @Override // com.google.android.gms.internal.ads.zzdky
    public final /* synthetic */ KeyFactory a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
