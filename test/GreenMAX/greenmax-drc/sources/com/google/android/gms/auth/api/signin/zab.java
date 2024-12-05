package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zab implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z);
                    break;
                case 2:
                    str = SafeParcelReader.p(parcel, z);
                    break;
                case 3:
                    str2 = SafeParcelReader.p(parcel, z);
                    break;
                case 4:
                    str3 = SafeParcelReader.p(parcel, z);
                    break;
                case 5:
                    str4 = SafeParcelReader.p(parcel, z);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.o(parcel, z, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.p(parcel, z);
                    break;
                case 8:
                    j2 = SafeParcelReader.D(parcel, z);
                    break;
                case 9:
                    str6 = SafeParcelReader.p(parcel, z);
                    break;
                case 10:
                    arrayList = SafeParcelReader.t(parcel, z, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.p(parcel, z);
                    break;
                case 12:
                    str8 = SafeParcelReader.p(parcel, z);
                    break;
                default:
                    SafeParcelReader.H(parcel, z);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new GoogleSignInAccount(i2, str, str2, str3, str4, uri, str5, j2, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
