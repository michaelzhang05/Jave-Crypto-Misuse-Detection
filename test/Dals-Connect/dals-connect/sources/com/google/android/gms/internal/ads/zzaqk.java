package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaqk extends zzfm implements zzaqj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzaqj
    public final IBinder J5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        Parcel C = C(1, u);
        IBinder readStrongBinder = C.readStrongBinder();
        C.recycle();
        return readStrongBinder;
    }
}
