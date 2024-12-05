package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class tl extends zzaot {

    /* renamed from: f, reason: collision with root package name */
    private zzcjy<zzaov, zzcla> f12202f;

    private tl(zzcnd zzcndVar, zzcjy zzcjyVar) {
        this.f12202f = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void B() throws RemoteException {
        this.f12202f.f14137c.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void j(String str) throws RemoteException {
        this.f12202f.f14137c.onAdFailedToLoad(0);
    }
}
