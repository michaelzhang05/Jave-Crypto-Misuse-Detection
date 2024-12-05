package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzag implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        zzae zzaeVar = null;
        boolean z2 = false;
        while (parcel.dataPosition() < I) {
            int z3 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z3);
            if (v == 1) {
                arrayList = SafeParcelReader.t(parcel, z3, LocationRequest.CREATOR);
            } else if (v == 2) {
                z = SafeParcelReader.w(parcel, z3);
            } else if (v == 3) {
                z2 = SafeParcelReader.w(parcel, z3);
            } else if (v != 5) {
                SafeParcelReader.H(parcel, z3);
            } else {
                zzaeVar = (zzae) SafeParcelReader.o(parcel, z3, zzae.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new LocationSettingsRequest(arrayList, z, z2, zzaeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest[] newArray(int i2) {
        return new LocationSettingsRequest[i2];
    }
}
