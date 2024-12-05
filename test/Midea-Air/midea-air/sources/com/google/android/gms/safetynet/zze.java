package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zze implements Parcelable.Creator<zzd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzd createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        long j2 = 0;
        HarmfulAppsData[] harmfulAppsDataArr = null;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z2);
            if (v == 2) {
                j2 = SafeParcelReader.D(parcel, z2);
            } else if (v == 3) {
                harmfulAppsDataArr = (HarmfulAppsData[]) SafeParcelReader.s(parcel, z2, HarmfulAppsData.CREATOR);
            } else if (v == 4) {
                i2 = SafeParcelReader.B(parcel, z2);
            } else if (v != 5) {
                SafeParcelReader.H(parcel, z2);
            } else {
                z = SafeParcelReader.w(parcel, z2);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzd(j2, harmfulAppsDataArr, i2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzd[] newArray(int i2) {
        return new zzd[i2];
    }
}
