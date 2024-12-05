package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class fr extends zzdbt<zzdbj, zzddr, zzddt> {
    public fr() throws GeneralSecurityException {
        super(zzdbj.class, zzddr.class, zzddt.class, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzdcf.j(new gr());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final zzdgr.zzb i() {
        return zzdgr.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ void j(zzddr zzddrVar) throws GeneralSecurityException {
        zzdlx.b(zzddrVar.x(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ void k(zzddt zzddtVar) throws GeneralSecurityException {
        zzdlx.a(zzddtVar.x().x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final /* synthetic */ zzdbj l(zzddr zzddrVar) throws GeneralSecurityException {
        zzddr zzddrVar2 = zzddrVar;
        return new zzdkw((zzdlk) zzdcf.h("type.googleapis.com/google.crypto.tink.AesCtrKey", zzddrVar2.F(), zzdlk.class), (zzdby) zzdcf.h("type.googleapis.com/google.crypto.tink.HmacKey", zzddrVar2.G(), zzdby.class), zzddrVar2.G().E().y());
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final int m0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final /* synthetic */ zzddr n(zzddt zzddtVar) throws GeneralSecurityException {
        zzddt zzddtVar2 = zzddtVar;
        zzdeb zzdebVar = (zzdeb) zzdcf.e("type.googleapis.com/google.crypto.tink.AesCtrKey", zzddtVar2.x());
        return (zzddr) ((zzdob) zzddr.H().u(zzdebVar).v((zzdgl) zzdcf.e("type.googleapis.com/google.crypto.tink.HmacKey", zzddtVar2.y())).x(0).J());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzddr p(zzdmr zzdmrVar) throws zzdok {
        return zzddr.K(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzddt q(zzdmr zzdmrVar) throws zzdok {
        return zzddt.B(zzdmrVar);
    }
}
