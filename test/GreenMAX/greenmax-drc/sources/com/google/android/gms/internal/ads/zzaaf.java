package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaaf extends zzfm implements zzaae {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzaae
    public final IBinder Z6(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeInt(i2);
        Parcel C = C(1, u);
        IBinder readStrongBinder = C.readStrongBinder();
        C.recycle();
        return readStrongBinder;
    }
}
