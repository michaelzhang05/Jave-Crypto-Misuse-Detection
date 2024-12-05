package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes2.dex */
public final class zai implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        while (parcel.dataPosition() < I) {
            int z3 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z3)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z3);
                    break;
                case 2:
                    i3 = SafeParcelReader.B(parcel, z3);
                    break;
                case 3:
                    z = SafeParcelReader.w(parcel, z3);
                    break;
                case 4:
                    i4 = SafeParcelReader.B(parcel, z3);
                    break;
                case 5:
                    z2 = SafeParcelReader.w(parcel, z3);
                    break;
                case 6:
                    str = SafeParcelReader.p(parcel, z3);
                    break;
                case 7:
                    i5 = SafeParcelReader.B(parcel, z3);
                    break;
                case 8:
                    str2 = SafeParcelReader.p(parcel, z3);
                    break;
                case 9:
                    zaaVar = (zaa) SafeParcelReader.o(parcel, z3, zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.H(parcel, z3);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new FastJsonResponse.Field(i2, i3, z, i4, z2, str, i5, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i2) {
        return new FastJsonResponse.Field[i2];
    }
}
