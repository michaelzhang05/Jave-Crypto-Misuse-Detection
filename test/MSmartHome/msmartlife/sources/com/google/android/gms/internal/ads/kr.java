package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class kr extends zzdbt<zzdbj, zzdhe, zzdhg> {
    public kr() {
        super(zzdbj.class, zzdhe.class, zzdhg.class, "type.googleapis.com/google.crypto.tink.KmsAeadKey");
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final zzdgr.zzb i() {
        return zzdgr.zzb.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ void j(zzdhe zzdheVar) throws GeneralSecurityException {
        zzdlx.b(zzdheVar.x(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* bridge */ /* synthetic */ void k(zzdhg zzdhgVar) throws GeneralSecurityException {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final /* synthetic */ zzdbj l(zzdhe zzdheVar) throws GeneralSecurityException {
        String x = zzdheVar.D().x();
        return zzdbx.a(x).b(x);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final int m0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final /* synthetic */ zzdhe n(zzdhg zzdhgVar) throws GeneralSecurityException {
        return (zzdhe) ((zzdob) zzdhe.E().u(zzdhgVar).v(0).J());
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdhe p(zzdmr zzdmrVar) throws zzdok {
        return zzdhe.G(zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    protected final /* synthetic */ zzdhg q(zzdmr zzdmrVar) throws zzdok {
        return zzdhg.B(zzdmrVar);
    }
}
