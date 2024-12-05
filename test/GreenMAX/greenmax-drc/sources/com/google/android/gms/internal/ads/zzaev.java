package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaev extends zzfm implements zzaeu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final IBinder L5(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, iObjectWrapper2);
        zzfo.c(u, iObjectWrapper3);
        Parcel C = C(1, u);
        IBinder readStrongBinder = C.readStrongBinder();
        C.recycle();
        return readStrongBinder;
    }
}
