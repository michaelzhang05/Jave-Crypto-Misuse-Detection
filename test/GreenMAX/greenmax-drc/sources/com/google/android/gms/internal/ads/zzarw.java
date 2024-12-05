package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzarw implements Parcelable.Creator<zzaru> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaru createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            if (SafeParcelReader.v(z) != 2) {
                SafeParcelReader.H(parcel, z);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.o(parcel, z, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzaru(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaru[] newArray(int i2) {
        return new zzaru[i2];
    }
}
