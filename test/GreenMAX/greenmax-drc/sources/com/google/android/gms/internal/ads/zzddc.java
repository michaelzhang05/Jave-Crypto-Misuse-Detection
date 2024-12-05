package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzddc {

    @Deprecated
    public static final zzdho a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final zzdho f14703b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzdho f14704c;

    static {
        zzdho zzdhoVar = (zzdho) ((zzdob) zzdho.C().j(zzdcj.a).u(zzdbl.a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).u(zzdbl.a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).v("TINK_HYBRID_1_0_0").J());
        a = zzdhoVar;
        f14703b = (zzdho) ((zzdob) zzdho.C().j(zzdhoVar).v("TINK_HYBRID_1_1_0").J());
        f14704c = (zzdho) ((zzdob) zzdho.C().j(zzdcj.f14694c).u(zzdbl.a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).u(zzdbl.a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).v("TINK_HYBRID").J());
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() throws GeneralSecurityException {
        zzdcj.a();
        zzdcf.m("TinkHybridEncrypt", new qr());
        zzdcf.m("TinkHybridDecrypt", new pr());
        zzdbl.b(f14704c);
    }
}
