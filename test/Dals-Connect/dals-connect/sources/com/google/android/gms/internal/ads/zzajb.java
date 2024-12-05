package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzajb extends zzfn implements zzaja {
    public zzajb() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzajc zzajdVar;
        if (i2 == 3) {
            zzaar videoController = getVideoController();
            parcel2.writeNoException();
            zzfo.c(parcel2, videoController);
            return true;
        }
        if (i2 == 4) {
            destroy();
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 5) {
            return false;
        }
        IObjectWrapper C = IObjectWrapper.Stub.C(parcel.readStrongBinder());
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzajdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            if (queryLocalInterface instanceof zzajc) {
                zzajdVar = (zzajc) queryLocalInterface;
            } else {
                zzajdVar = new zzajd(readStrongBinder);
            }
        }
        E6(C, zzajdVar);
        parcel2.writeNoException();
        return true;
    }
}
