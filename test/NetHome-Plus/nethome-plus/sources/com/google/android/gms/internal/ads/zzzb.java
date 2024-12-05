package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzzb extends zzfm implements zzyz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdClicked() throws RemoteException {
        R(6, u());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdClosed() throws RemoteException {
        R(1, u());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdFailedToLoad(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(2, u);
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdImpression() throws RemoteException {
        R(7, u());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdLeftApplication() throws RemoteException {
        R(3, u());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdLoaded() throws RemoteException {
        R(4, u());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdOpened() throws RemoteException {
        R(5, u());
    }
}
