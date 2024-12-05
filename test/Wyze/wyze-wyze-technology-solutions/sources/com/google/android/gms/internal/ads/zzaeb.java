package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzaeb extends zzfn implements zzaea {
    public zzaeb() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzaea H7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof zzaea) {
            return (zzaea) queryLocalInterface;
        }
        return new zzaec(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            String X0 = X0();
            parcel2.writeNoException();
            parcel2.writeString(X0);
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        List<zzaei> q0 = q0();
        parcel2.writeNoException();
        parcel2.writeList(q0);
        return true;
    }
}
