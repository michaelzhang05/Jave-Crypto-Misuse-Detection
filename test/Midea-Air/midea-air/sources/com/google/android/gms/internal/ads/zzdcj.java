package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdcj {

    @Deprecated
    public static final zzdho a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private static final zzdho f14693b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzdho f14694c;

    static {
        zzdho zzdhoVar = (zzdho) ((zzdob) zzdho.C().j(zzddo.a).u(zzdbl.a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).u(zzdbl.a("TinkAead", "Aead", "AesEaxKey", 0, true)).u(zzdbl.a("TinkAead", "Aead", "AesGcmKey", 0, true)).u(zzdbl.a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).u(zzdbl.a("TinkAead", "Aead", "KmsAeadKey", 0, true)).u(zzdbl.a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).v("TINK_AEAD_1_0_0").J());
        a = zzdhoVar;
        f14693b = (zzdho) ((zzdob) zzdho.C().j(zzdhoVar).v("TINK_AEAD_1_1_0").J());
        f14694c = (zzdho) ((zzdob) zzdho.C().j(zzddo.f14706c).u(zzdbl.a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).u(zzdbl.a("TinkAead", "Aead", "AesEaxKey", 0, true)).u(zzdbl.a("TinkAead", "Aead", "AesGcmKey", 0, true)).u(zzdbl.a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).u(zzdbl.a("TinkAead", "Aead", "KmsAeadKey", 0, true)).u(zzdbl.a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).u(zzdbl.a("TinkAead", "Aead", "XChaCha20Poly1305Key", 0, true)).v("TINK_AEAD").J());
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() throws GeneralSecurityException {
        zzddo.a();
        zzdcf.m("TinkAead", new dr());
        zzdbl.b(f14694c);
    }
}
