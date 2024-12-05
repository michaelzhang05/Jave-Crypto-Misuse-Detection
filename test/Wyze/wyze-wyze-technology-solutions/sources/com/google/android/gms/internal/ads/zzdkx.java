package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdky;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class zzdkx<T_WRAPPER extends zzdky<T_ENGINE>, T_ENGINE> {
    private static final Logger a = Logger.getLogger(zzdkx.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final List<Provider> f14782b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzdkx<zzdkz, Cipher> f14783c;

    /* renamed from: d, reason: collision with root package name */
    public static final zzdkx<zzdld, Mac> f14784d;

    /* renamed from: e, reason: collision with root package name */
    public static final zzdkx<zzdlf, Signature> f14785e;

    /* renamed from: f, reason: collision with root package name */
    public static final zzdkx<zzdle, MessageDigest> f14786f;

    /* renamed from: g, reason: collision with root package name */
    public static final zzdkx<zzdla, KeyAgreement> f14787g;

    /* renamed from: h, reason: collision with root package name */
    public static final zzdkx<zzdlc, KeyPairGenerator> f14788h;

    /* renamed from: i, reason: collision with root package name */
    public static final zzdkx<zzdlb, KeyFactory> f14789i;

    /* renamed from: j, reason: collision with root package name */
    private T_WRAPPER f14790j;

    /* renamed from: k, reason: collision with root package name */
    private List<Provider> f14791k = f14782b;
    private boolean l = true;

    static {
        if (zzdlv.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    a.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f14782b = arrayList;
        } else {
            f14782b = new ArrayList();
        }
        f14783c = new zzdkx<>(new zzdkz());
        f14784d = new zzdkx<>(new zzdld());
        f14785e = new zzdkx<>(new zzdlf());
        f14786f = new zzdkx<>(new zzdle());
        f14787g = new zzdkx<>(new zzdla());
        f14788h = new zzdkx<>(new zzdlc());
        f14789i = new zzdkx<>(new zzdlb());
    }

    private zzdkx(T_WRAPPER t_wrapper) {
        this.f14790j = t_wrapper;
    }

    private final boolean a(String str, Provider provider) {
        try {
            this.f14790j.a(str, provider);
            return true;
        } catch (Exception e2) {
            zzdmb.d(e2);
            return false;
        }
    }

    public final T_ENGINE b(String str) throws GeneralSecurityException {
        for (Provider provider : this.f14791k) {
            if (a(str, provider)) {
                return (T_ENGINE) this.f14790j.a(str, provider);
            }
        }
        if (this.l) {
            return (T_ENGINE) this.f14790j.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}
