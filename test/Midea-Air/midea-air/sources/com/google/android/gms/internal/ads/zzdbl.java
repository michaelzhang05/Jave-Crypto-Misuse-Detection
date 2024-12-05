package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgy;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdbl {
    public static zzdgy a(String str, String str2, String str3, int i2, boolean z) {
        zzdgy.zza x = zzdgy.G().x(str2);
        String valueOf = String.valueOf(str3);
        return (zzdgy) ((zzdob) x.y(valueOf.length() != 0 ? "type.googleapis.com/google.crypto.tink.".concat(valueOf) : new String("type.googleapis.com/google.crypto.tink.")).v(0).u(true).A(str).J());
    }

    public static void b(zzdho zzdhoVar) throws GeneralSecurityException {
        for (zzdgy zzdgyVar : zzdhoVar.B()) {
            if (!zzdgyVar.B().isEmpty()) {
                if (!zzdgyVar.C().isEmpty()) {
                    if (!zzdgyVar.F().isEmpty()) {
                        zzdbk<?> o = zzdcf.o(zzdgyVar.F());
                        zzdcf.l(o.a());
                        zzdcf.k(o.b(zzdgyVar.B(), zzdgyVar.C(), zzdgyVar.D()), zzdgyVar.E());
                    } else {
                        throw new GeneralSecurityException("Missing catalogue_name.");
                    }
                } else {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
            } else {
                throw new GeneralSecurityException("Missing type_url.");
            }
        }
    }
}
