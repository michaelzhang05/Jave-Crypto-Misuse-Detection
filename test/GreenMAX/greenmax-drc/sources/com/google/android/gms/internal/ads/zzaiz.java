package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaiz implements Parcelable.Creator<zzaiy> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiy createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            if (SafeParcelReader.v(z) != 1) {
                SafeParcelReader.H(parcel, z);
            } else {
                i2 = SafeParcelReader.B(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzaiy(i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiy[] newArray(int i2) {
        return new zzaiy[i2];
    }
}
