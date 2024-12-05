package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaud extends zzfm implements zzaub {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void Y0() throws RemoteException {
        R(1, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void Z4(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(2, u);
    }
}
