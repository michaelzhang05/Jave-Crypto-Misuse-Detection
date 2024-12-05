package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zap implements Parcelable.Creator<SafeParcelResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeParcelResponse createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        Parcel parcel2 = null;
        zak zakVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v == 2) {
                parcel2 = SafeParcelReader.m(parcel, z);
            } else if (v != 3) {
                SafeParcelReader.H(parcel, z);
            } else {
                zakVar = (zak) SafeParcelReader.o(parcel, z, zak.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new SafeParcelResponse(i2, parcel2, zakVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SafeParcelResponse[] newArray(int i2) {
        return new SafeParcelResponse[i2];
    }
}
