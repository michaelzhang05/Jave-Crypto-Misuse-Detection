package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* loaded from: classes2.dex */
public abstract class zzam extends zzb implements zzal {
    public zzam() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            b3((ProxyResponse) zzc.a(parcel, ProxyResponse.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            z1(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
