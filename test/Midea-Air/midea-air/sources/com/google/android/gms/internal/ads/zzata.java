package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzata extends zzfm implements zzasz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzata(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzasz
    public final IBinder o6(IObjectWrapper iObjectWrapper, zzamp zzampVar, int i2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, zzampVar);
        u.writeInt(i2);
        Parcel C = C(1, u);
        IBinder readStrongBinder = C.readStrongBinder();
        C.recycle();
        return readStrongBinder;
    }
}
