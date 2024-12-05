package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzaac extends zzfn implements zzaab {
    public zzaac() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                f0();
                parcel2.writeNoException();
                return true;
            case 2:
                I5(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                p5(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                S1(zzfo.e(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                M6(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                p2(parcel.readString(), IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float I4 = I4();
                parcel2.writeNoException();
                parcel2.writeFloat(I4);
                return true;
            case 8:
                boolean H3 = H3();
                parcel2.writeNoException();
                zzfo.a(parcel2, H3);
                return true;
            case 9:
                String F3 = F3();
                parcel2.writeNoException();
                parcel2.writeString(F3);
                return true;
            case 10:
                D2(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                s0(zzamq.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                P1(zzaiu.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzaio> K2 = K2();
                parcel2.writeNoException();
                parcel2.writeTypedList(K2);
                return true;
            default:
                return false;
        }
    }
}
