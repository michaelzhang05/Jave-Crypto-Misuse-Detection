package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaal extends zzfn implements zzaak {
    public zzaal() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzaak H7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzaak) {
            return (zzaak) queryLocalInterface;
        }
        return new zzaam(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String description = getDescription();
            parcel2.writeNoException();
            parcel2.writeString(description);
        } else {
            if (i2 != 2) {
                return false;
            }
            String Q1 = Q1();
            parcel2.writeNoException();
            parcel2.writeString(Q1);
        }
        return true;
    }
}
