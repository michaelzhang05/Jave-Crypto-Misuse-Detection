package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator<HarmfulAppsData> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HarmfulAppsData createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 2) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v == 3) {
                bArr = SafeParcelReader.g(parcel, z);
            } else if (v != 4) {
                SafeParcelReader.H(parcel, z);
            } else {
                i2 = SafeParcelReader.B(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new HarmfulAppsData(str, bArr, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HarmfulAppsData[] newArray(int i2) {
        return new HarmfulAppsData[i2];
    }
}
