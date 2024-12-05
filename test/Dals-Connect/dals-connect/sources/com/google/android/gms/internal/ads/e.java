package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e extends zzzd {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ zzabl f11329f;

    private e(zzabl zzablVar) {
        this.f11329f = zzablVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final String M() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final boolean U() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void U5(zzxz zzxzVar, int i2) throws RemoteException {
        zzbad.g("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazt.a.post(new f(this));
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void a2(zzxz zzxzVar) throws RemoteException {
        U5(zzxzVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }
}
