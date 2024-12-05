package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzzd extends zzfn implements zzzc {
    public zzzd() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            a2((zzxz) zzfo.b(parcel, zzxz.CREATOR));
            parcel2.writeNoException();
        } else if (i2 == 2) {
            String mediationAdapterClassName = getMediationAdapterClassName();
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
        } else if (i2 == 3) {
            boolean U = U();
            parcel2.writeNoException();
            zzfo.a(parcel2, U);
        } else if (i2 == 4) {
            String M = M();
            parcel2.writeNoException();
            parcel2.writeString(M);
        } else {
            if (i2 != 5) {
                return false;
            }
            U5((zzxz) zzfo.b(parcel, zzxz.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
