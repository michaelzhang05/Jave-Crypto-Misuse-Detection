package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                Z5((Status) zzc.a(parcel, Status.CREATOR));
                return true;
            case 2:
                t0((Status) zzc.a(parcel, Status.CREATOR), (com.google.android.gms.auth.api.accounttransfer.zzt) zzc.a(parcel, com.google.android.gms.auth.api.accounttransfer.zzt.CREATOR));
                return true;
            case 3:
                S0((Status) zzc.a(parcel, Status.CREATOR), (zzl) zzc.a(parcel, zzl.CREATOR));
                return true;
            case 4:
                N4();
                return true;
            case 5:
                i6((Status) zzc.a(parcel, Status.CREATOR));
                return true;
            case 6:
                y2(parcel.createByteArray());
                return true;
            case 7:
                J2((DeviceMetaData) zzc.a(parcel, DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
