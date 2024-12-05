package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzbjg extends zzfn implements zzbjf {
    public zzbjg() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                K0((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle i22 = i2((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.g(parcel2, i22);
                return true;
            case 3:
                w3(parcel.readString(), parcel.readString(), (Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                e6(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map a4 = a4(parcel.readString(), parcel.readString(), zzfo.e(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(a4);
                return true;
            case 6:
                int G3 = G3(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(G3);
                return true;
            case 7:
                Y4((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                Z(parcel.readString(), parcel.readString(), (Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List T4 = T4(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(T4);
                return true;
            case 10:
                String Y1 = Y1();
                parcel2.writeNoException();
                parcel2.writeString(Y1);
                return true;
            case 11:
                String p4 = p4();
                parcel2.writeNoException();
                parcel2.writeString(p4);
                return true;
            case 12:
                long r2 = r2();
                parcel2.writeNoException();
                parcel2.writeLong(r2);
                return true;
            case 13:
                f6(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                w7(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                F4(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                String z2 = z2();
                parcel2.writeNoException();
                parcel2.writeString(z2);
                return true;
            case 17:
                String W4 = W4();
                parcel2.writeNoException();
                parcel2.writeString(W4);
                return true;
            case 18:
                String l4 = l4();
                parcel2.writeNoException();
                parcel2.writeString(l4);
                return true;
            default:
                return false;
        }
    }
}
