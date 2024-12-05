package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zad implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < I) {
            int z4 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z4)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z4);
                    break;
                case 2:
                    arrayList = SafeParcelReader.t(parcel, z4, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.o(parcel, z4, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.w(parcel, z4);
                    break;
                case 5:
                    z2 = SafeParcelReader.w(parcel, z4);
                    break;
                case 6:
                    z3 = SafeParcelReader.w(parcel, z4);
                    break;
                case 7:
                    str = SafeParcelReader.p(parcel, z4);
                    break;
                case 8:
                    str2 = SafeParcelReader.p(parcel, z4);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.t(parcel, z4, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                default:
                    SafeParcelReader.H(parcel, z4);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new GoogleSignInOptions(i2, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (ArrayList<GoogleSignInOptionsExtensionParcelable>) arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i2) {
        return new GoogleSignInOptions[i2];
    }
}
