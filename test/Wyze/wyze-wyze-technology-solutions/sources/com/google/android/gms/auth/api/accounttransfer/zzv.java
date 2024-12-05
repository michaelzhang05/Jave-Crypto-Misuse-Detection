package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzv implements Parcelable.Creator<DeviceMetaData> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DeviceMetaData createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        long j2 = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < I) {
            int z3 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z3);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z3);
            } else if (v == 2) {
                z = SafeParcelReader.w(parcel, z3);
            } else if (v == 3) {
                j2 = SafeParcelReader.D(parcel, z3);
            } else if (v != 4) {
                SafeParcelReader.H(parcel, z3);
            } else {
                z2 = SafeParcelReader.w(parcel, z3);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new DeviceMetaData(i2, z, j2, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DeviceMetaData[] newArray(int i2) {
        return new DeviceMetaData[i2];
    }
}
