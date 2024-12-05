package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzats extends zzfm implements zzatq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzats(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final int getAmount() throws RemoteException {
        Parcel C = C(2, u());
        int readInt = C.readInt();
        C.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final String getType() throws RemoteException {
        Parcel C = C(1, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }
}
