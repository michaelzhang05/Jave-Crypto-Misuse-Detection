package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 4) {
                if (l8 != 7) {
                    if (l8 != 8) {
                        S.b.x(parcel, r8);
                    } else {
                        str2 = S.b.f(parcel, r8);
                    }
                } else {
                    googleSignInAccount = (GoogleSignInAccount) S.b.e(parcel, r8, GoogleSignInAccount.CREATOR);
                }
            } else {
                str = S.b.f(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new SignInAccount[i8];
    }
}
