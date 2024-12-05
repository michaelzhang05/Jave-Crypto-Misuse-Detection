package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzatl extends zzfn implements zzatk {
    public zzatl() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzatk H7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzatk) {
            return (zzatk) queryLocalInterface;
        }
        return new zzatm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                V2(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                break;
            case 2:
                t1(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                r3(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                break;
            case 4:
                M0(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                break;
            case 5:
                R1(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                break;
            case 6:
                r6(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                break;
            case 7:
                X3(IObjectWrapper.Stub.C(parcel.readStrongBinder()), (zzato) zzfo.b(parcel, zzato.CREATOR));
                break;
            case 8:
                e7(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                break;
            case 9:
                h2(IObjectWrapper.Stub.C(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                c4(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                break;
            case 11:
                l5(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                break;
            case 12:
                zzb((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
