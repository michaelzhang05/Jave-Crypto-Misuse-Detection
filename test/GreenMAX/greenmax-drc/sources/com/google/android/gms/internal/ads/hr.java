package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class hr extends zzdbt<zzdbj, zzdeh, zzdej> {
    public hr() {
        super(zzdbj.class, zzdeh.class, zzdej.class, "type.googleapis.com/google.crypto.tink.AesEaxKey");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final zzdgr.zzb i() {
        return zzdgr.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ void j(zzdeh zzdehVar) throws GeneralSecurityException {
        zzdeh zzdehVar2 = zzdehVar;
        zzdlx.b(zzdehVar2.x(), 0);
        zzdlx.a(zzdehVar2.F().size());
        if (zzdehVar2.G().x() != 12 && zzdehVar2.G().x() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ void k(zzdej zzdejVar) throws GeneralSecurityException {
        zzdej zzdejVar2 = zzdejVar;
        zzdlx.a(zzdejVar2.x());
        if (zzdejVar2.A().x() != 12 && zzdejVar2.A().x() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final /* synthetic */ zzdbj l(zzdeh zzdehVar) throws GeneralSecurityException {
        zzdeh zzdehVar2 = zzdehVar;
        return new zzdjk(zzdehVar2.F().a(), zzdehVar2.G().x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final int m0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final /* synthetic */ zzdeh n(zzdej zzdejVar) throws GeneralSecurityException {
        zzdej zzdejVar2 = zzdejVar;
        return (zzdeh) ((zzdob) zzdeh.H().u(zzdmr.V(zzdlo.c(zzdejVar2.x()))).v(zzdejVar2.A()).x(0).J());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdeh p(zzdmr zzdmrVar) throws zzdok {
        return zzdeh.E(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdej q(zzdmr zzdmrVar) throws zzdok {
        return zzdej.y(zzdmrVar);
    }
}
