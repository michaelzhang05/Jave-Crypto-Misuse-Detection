package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class el extends zzaon {

    /* renamed from: f, reason: collision with root package name */
    private zzcjy<zzaov, zzcla> f11364f;

    private el(zzclq zzclqVar, zzcjy zzcjyVar) {
        this.f11364f = zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void B() throws RemoteException {
        this.f11364f.f14137c.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void j(String str) throws RemoteException {
        this.f11364f.f14137c.onAdFailedToLoad(0);
    }
}
