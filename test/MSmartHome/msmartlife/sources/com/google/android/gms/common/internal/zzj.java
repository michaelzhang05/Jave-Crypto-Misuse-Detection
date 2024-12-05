package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzj extends com.google.android.gms.internal.common.zzb implements zzi {
    public zzj() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzi C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof zzi) {
            return (zzi) queryLocalInterface;
        }
        return new zzk(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper l0 = l0();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.c(parcel2, l0);
        } else {
            if (i2 != 2) {
                return false;
            }
            int g2 = g();
            parcel2.writeNoException();
            parcel2.writeInt(g2);
        }
        return true;
    }
}
