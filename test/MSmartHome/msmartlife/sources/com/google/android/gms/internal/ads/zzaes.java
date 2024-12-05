package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzaes extends zzfn implements zzaer {
    public zzaes() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzaer H7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        if (queryLocalInterface instanceof zzaer) {
            return (zzaer) queryLocalInterface;
        }
        return new zzaet(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            H(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
        } else if (i2 == 2) {
            M5();
        } else {
            if (i2 != 3) {
                return false;
            }
            a0(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
