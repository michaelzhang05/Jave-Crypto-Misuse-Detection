package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator<zzb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzb createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                bundle = SafeParcelReader.f(parcel, z);
            } else if (v != 2) {
                SafeParcelReader.H(parcel, z);
            } else {
                featureArr = (Feature[]) SafeParcelReader.s(parcel, z, Feature.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzb(bundle, featureArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzb[] newArray(int i2) {
        return new zzb[i2];
    }
}
