package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzatd extends zzfm implements zzatb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void V0(zzasr zzasrVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzasrVar);
        R(5, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdClosed() throws RemoteException {
        R(4, u());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdFailedToLoad(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(7, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        R(6, u());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdLoaded() throws RemoteException {
        R(1, u());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdOpened() throws RemoteException {
        R(2, u());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoCompleted() throws RemoteException {
        R(8, u());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoStarted() throws RemoteException {
        R(3, u());
    }
}
