package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzae implements Parcelable.Creator<zzad> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        Status status = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            if (SafeParcelReader.v(z) != 1) {
                SafeParcelReader.H(parcel, z);
            } else {
                status = (Status) SafeParcelReader.o(parcel, z, Status.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzad(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad[] newArray(int i2) {
        return new zzad[i2];
    }
}
