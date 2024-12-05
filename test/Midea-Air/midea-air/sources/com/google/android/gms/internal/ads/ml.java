package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class ml extends zzaoq {

    /* renamed from: f, reason: collision with root package name */
    private zzcjy<zzaov, zzcla> f11824f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzcmg f11825g;

    private ml(zzcmg zzcmgVar, zzcjy zzcjyVar) {
        this.f11825g = zzcmgVar;
        this.f11824f = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    public final void K4(zzang zzangVar) throws RemoteException {
        zzcmg.c(this.f11825g, zzangVar);
        this.f11824f.f14137c.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    public final void j(String str) throws RemoteException {
        this.f11824f.f14137c.onAdFailedToLoad(0);
    }
}
