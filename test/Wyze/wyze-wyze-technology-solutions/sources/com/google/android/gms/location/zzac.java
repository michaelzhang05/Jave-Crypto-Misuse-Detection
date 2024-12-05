package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzac implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        List<Location> list = LocationResult.f16246f;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            if (SafeParcelReader.v(z) != 1) {
                SafeParcelReader.H(parcel, z);
            } else {
                list = SafeParcelReader.t(parcel, z, Location.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationResult[] newArray(int i2) {
        return new LocationResult[i2];
    }
}
