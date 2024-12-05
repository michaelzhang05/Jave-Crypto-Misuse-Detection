package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzah implements Parcelable.Creator<LocationSettingsResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsResult createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                status = (Status) SafeParcelReader.o(parcel, z, Status.CREATOR);
            } else if (v != 2) {
                SafeParcelReader.H(parcel, z);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.o(parcel, z, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsResult[] newArray(int i2) {
        return new LocationSettingsResult[i2];
    }
}
