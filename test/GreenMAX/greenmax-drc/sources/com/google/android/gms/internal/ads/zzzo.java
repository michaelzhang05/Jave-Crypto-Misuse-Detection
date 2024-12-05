package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzzo extends zzfm implements zzzn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    public final IBinder A5(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, zzamp zzampVar, int i2, int i3) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzydVar);
        u.writeString(str);
        zzfo.c(u, zzampVar);
        u.writeInt(i2);
        u.writeInt(i3);
        Parcel C = C(2, u);
        IBinder readStrongBinder = C.readStrongBinder();
        C.recycle();
        return readStrongBinder;
    }
}
