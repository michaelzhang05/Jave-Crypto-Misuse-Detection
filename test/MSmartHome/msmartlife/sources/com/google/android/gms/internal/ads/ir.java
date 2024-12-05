package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class ir extends zzdbt<zzdbj, zzdet, zzdev> {
    public ir() {
        super(zzdbj.class, zzdet.class, zzdev.class, "type.googleapis.com/google.crypto.tink.AesGcmKey");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final zzdgr.zzb i() {
        return zzdgr.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ void j(zzdet zzdetVar) throws GeneralSecurityException {
        zzdet zzdetVar2 = zzdetVar;
        zzdlx.b(zzdetVar2.x(), 0);
        zzdlx.a(zzdetVar2.D().size());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ void k(zzdev zzdevVar) throws GeneralSecurityException {
        zzdlx.a(zzdevVar.x());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdbj l(zzdet zzdetVar) throws GeneralSecurityException {
        return new zzdjm(zzdetVar.D().a());
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final int m0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdet n(zzdev zzdevVar) throws GeneralSecurityException {
        return (zzdet) ((zzdob) zzdet.E().u(zzdmr.V(zzdlo.c(zzdevVar.x()))).v(0).J());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdet p(zzdmr zzdmrVar) throws zzdok {
        return zzdet.C(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdev q(zzdmr zzdmrVar) throws zzdok {
        return zzdev.y(zzdmrVar);
    }
}
