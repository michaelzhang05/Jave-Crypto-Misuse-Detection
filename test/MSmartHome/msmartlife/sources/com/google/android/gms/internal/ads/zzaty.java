package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaty extends zzfm implements zzatw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void G1() throws RemoteException {
        R(1, u());
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void J6(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(4, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void Y(zzatq zzatqVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzatqVar);
        R(3, u);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void Z0() throws RemoteException {
        R(2, u());
    }
}
