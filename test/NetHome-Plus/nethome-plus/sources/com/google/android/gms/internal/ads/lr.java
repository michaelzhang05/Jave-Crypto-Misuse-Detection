package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class lr extends zzdbt<zzdbj, zzdhi, zzdhk> {
    public lr() {
        super(zzdbj.class, zzdhi.class, zzdhk.class, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final zzdgr.zzb i() {
        return zzdgr.zzb.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ void j(zzdhi zzdhiVar) throws GeneralSecurityException {
        zzdlx.b(zzdhiVar.x(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* bridge */ /* synthetic */ void k(zzdhk zzdhkVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final /* synthetic */ zzdbj l(zzdhi zzdhiVar) throws GeneralSecurityException {
        zzdhi zzdhiVar2 = zzdhiVar;
        String x = zzdhiVar2.D().x();
        return new zzdcs(zzdhiVar2.D().y(), zzdbx.a(x).b(x));
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final int m0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final /* synthetic */ zzdhi n(zzdhk zzdhkVar) throws GeneralSecurityException {
        return (zzdhi) ((zzdob) zzdhi.E().u(zzdhkVar).v(0).J());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdhi p(zzdmr zzdmrVar) throws zzdok {
        return zzdhi.G(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdhk q(zzdmr zzdmrVar) throws zzdok {
        return zzdhk.C(zzdmrVar);
    }
}
