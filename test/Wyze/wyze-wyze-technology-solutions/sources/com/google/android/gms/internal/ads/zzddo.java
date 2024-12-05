package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzddo {

    @Deprecated
    public static final zzdho a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private static final zzdho f14705b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzdho f14706c;

    static {
        zzdho zzdhoVar = (zzdho) ((zzdob) zzdho.C().v("TINK_MAC_1_0_0").u(zzdbl.a("TinkMac", "Mac", "HmacKey", 0, true)).J());
        a = zzdhoVar;
        f14705b = (zzdho) ((zzdob) zzdho.C().j(zzdhoVar).v("TINK_MAC_1_1_0").J());
        f14706c = (zzdho) ((zzdob) zzdho.C().j(zzdhoVar).v("TINK_MAC").J());
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() throws GeneralSecurityException {
        zzdcf.m("TinkMac", new xr());
        zzdbl.b(f14706c);
    }
}
