package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzaej extends zzfn implements zzaei {
    public zzaej() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzaei H7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof zzaei) {
            return (zzaei) queryLocalInterface;
        }
        return new zzaek(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper y4 = y4();
            parcel2.writeNoException();
            zzfo.c(parcel2, y4);
        } else if (i2 == 2) {
            Uri n0 = n0();
            parcel2.writeNoException();
            zzfo.g(parcel2, n0);
        } else if (i2 == 3) {
            double T3 = T3();
            parcel2.writeNoException();
            parcel2.writeDouble(T3);
        } else if (i2 == 4) {
            int width = getWidth();
            parcel2.writeNoException();
            parcel2.writeInt(width);
        } else {
            if (i2 != 5) {
                return false;
            }
            int height = getHeight();
            parcel2.writeNoException();
            parcel2.writeInt(height);
        }
        return true;
    }
}
