package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator<GetServiceRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z2)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z2);
                    break;
                case 2:
                    i3 = SafeParcelReader.B(parcel, z2);
                    break;
                case 3:
                    i4 = SafeParcelReader.B(parcel, z2);
                    break;
                case 4:
                    str = SafeParcelReader.p(parcel, z2);
                    break;
                case 5:
                    iBinder = SafeParcelReader.A(parcel, z2);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.s(parcel, z2, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.f(parcel, z2);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.o(parcel, z2, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.H(parcel, z2);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.s(parcel, z2, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.s(parcel, z2, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.w(parcel, z2);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new GetServiceRequest(i2, i3, i4, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest[] newArray(int i2) {
        return new GetServiceRequest[i2];
    }
}
