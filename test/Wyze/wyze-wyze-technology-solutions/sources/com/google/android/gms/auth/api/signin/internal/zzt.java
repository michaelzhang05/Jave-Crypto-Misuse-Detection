package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzt extends com.google.android.gms.internal.p000authapi.zzd implements zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzd
    protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 101:
                u2((GoogleSignInAccount) com.google.android.gms.internal.p000authapi.zze.a(parcel, GoogleSignInAccount.CREATOR), (Status) com.google.android.gms.internal.p000authapi.zze.a(parcel, Status.CREATOR));
                break;
            case 102:
                N0((Status) com.google.android.gms.internal.p000authapi.zze.a(parcel, Status.CREATOR));
                break;
            case 103:
                E1((Status) com.google.android.gms.internal.p000authapi.zze.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
