package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zam implements Parcelable.Creator<ResolveAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v == 2) {
                account = (Account) SafeParcelReader.o(parcel, z, Account.CREATOR);
            } else if (v == 3) {
                i3 = SafeParcelReader.B(parcel, z);
            } else if (v != 4) {
                SafeParcelReader.H(parcel, z);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.o(parcel, z, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new ResolveAccountRequest(i2, account, i3, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest[] newArray(int i2) {
        return new ResolveAccountRequest[i2];
    }
}
