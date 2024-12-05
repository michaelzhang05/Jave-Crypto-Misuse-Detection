package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzapk implements Parcelable.Creator<zzapj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzapj createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v == 2) {
                i3 = SafeParcelReader.B(parcel, z);
            } else if (v != 3) {
                SafeParcelReader.H(parcel, z);
            } else {
                i4 = SafeParcelReader.B(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzapj(i2, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzapj[] newArray(int i2) {
        return new zzapj[i2];
    }
}
