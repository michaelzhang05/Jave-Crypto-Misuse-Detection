package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 4) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.o(parcel, z, GoogleSignInAccount.CREATOR);
            } else if (v != 8) {
                SafeParcelReader.H(parcel, z);
            } else {
                str2 = SafeParcelReader.p(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i2) {
        return new SignInAccount[i2];
    }
}
