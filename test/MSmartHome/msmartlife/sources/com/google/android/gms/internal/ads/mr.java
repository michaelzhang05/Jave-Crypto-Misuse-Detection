package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class mr extends zzdbt<zzdbj, zzdig, zzdgh> {
    public mr() {
        super(zzdbj.class, zzdig.class, zzdgh.class, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final zzdgr.zzb i() {
        return zzdgr.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ void j(zzdig zzdigVar) throws GeneralSecurityException {
        zzdig zzdigVar2 = zzdigVar;
        zzdlx.b(zzdigVar2.x(), 0);
        if (zzdigVar2.C().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* bridge */ /* synthetic */ void k(zzdgh zzdghVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final /* synthetic */ zzdbj l(zzdig zzdigVar) throws GeneralSecurityException {
        return new zzdma(zzdigVar.C().a());
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final int m0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdig n(zzdgh zzdghVar) throws GeneralSecurityException {
        return (zzdig) ((zzdob) zzdig.D().v(0).u(zzdmr.V(zzdlo.c(32))).J());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdig p(zzdmr zzdmrVar) throws zzdok {
        return zzdig.F(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdgh q(zzdmr zzdmrVar) throws zzdok {
        return zzdgh.y(zzdmrVar);
    }
}
