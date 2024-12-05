package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            z5((Account) com.google.android.gms.internal.auth.zzc.a(parcel, Account.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            d0(com.google.android.gms.internal.auth.zzc.b(parcel));
        }
        return true;
    }
}
