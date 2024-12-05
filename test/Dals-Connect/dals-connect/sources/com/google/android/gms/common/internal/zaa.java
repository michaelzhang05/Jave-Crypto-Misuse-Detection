package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zaa implements Parcelable.Creator<AuthAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i2 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z);
                    break;
                case 2:
                    iBinder = SafeParcelReader.A(parcel, z);
                    break;
                case 3:
                    scopeArr = (Scope[]) SafeParcelReader.s(parcel, z, Scope.CREATOR);
                    break;
                case 4:
                    num = SafeParcelReader.C(parcel, z);
                    break;
                case 5:
                    num2 = SafeParcelReader.C(parcel, z);
                    break;
                case 6:
                    account = (Account) SafeParcelReader.o(parcel, z, Account.CREATOR);
                    break;
                default:
                    SafeParcelReader.H(parcel, z);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new AuthAccountRequest(i2, iBinder, scopeArr, num, num2, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest[] newArray(int i2) {
        return new AuthAccountRequest[i2];
    }
}
