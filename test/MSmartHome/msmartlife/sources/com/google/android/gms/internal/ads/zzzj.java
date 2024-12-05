package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzzj extends zzfm implements zzzi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final IBinder z6(IObjectWrapper iObjectWrapper, String str, zzamp zzampVar, int i2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeString(str);
        zzfo.c(u, zzampVar);
        u.writeInt(i2);
        Parcel C = C(1, u);
        IBinder readStrongBinder = C.readStrongBinder();
        C.recycle();
        return readStrongBinder;
    }
}
