package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator<TokenData> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < I) {
            int z3 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z3)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z3);
                    break;
                case 2:
                    str = SafeParcelReader.p(parcel, z3);
                    break;
                case 3:
                    l = SafeParcelReader.E(parcel, z3);
                    break;
                case 4:
                    z = SafeParcelReader.w(parcel, z3);
                    break;
                case 5:
                    z2 = SafeParcelReader.w(parcel, z3);
                    break;
                case 6:
                    arrayList = SafeParcelReader.r(parcel, z3);
                    break;
                case 7:
                    str2 = SafeParcelReader.p(parcel, z3);
                    break;
                default:
                    SafeParcelReader.H(parcel, z3);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new TokenData(i2, str, l, z, z2, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData[] newArray(int i2) {
        return new TokenData[i2];
    }
}
