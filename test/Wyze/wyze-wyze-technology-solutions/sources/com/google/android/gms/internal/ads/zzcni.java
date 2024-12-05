package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzcni extends zzcoj {
    private zzbvj m;
    private zzbrp n;

    public zzcni(zzbri zzbriVar, zzbrt zzbrtVar, zzbse zzbseVar, zzbso zzbsoVar, zzbrp zzbrpVar, zzbtp zzbtpVar, zzbvq zzbvqVar, zzbsv zzbsvVar, zzbvj zzbvjVar) {
        super(zzbriVar, zzbrtVar, zzbseVar, zzbsoVar, zzbtpVar, zzbsvVar, zzbvqVar);
        this.m = zzbvjVar;
        this.n = zzbrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    public final void E(int i2) throws RemoteException {
        this.n.E(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    public final void G5(zzato zzatoVar) {
        this.m.R(zzatoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    public final void H0() {
        this.m.r();
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    public final void S() {
        this.m.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    public final void Y(zzatq zzatqVar) throws RemoteException {
        this.m.R(new zzato(zzatqVar.getType(), zzatqVar.getAmount()));
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    public final void h7() throws RemoteException {
        this.m.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.internal.ads.zzamv
    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
