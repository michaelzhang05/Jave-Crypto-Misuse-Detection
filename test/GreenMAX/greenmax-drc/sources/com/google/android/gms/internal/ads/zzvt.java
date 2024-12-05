package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzvt implements Parcelable.Creator<zzvs> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvs createFromParcel(Parcel parcel) {
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
        return new zzvs(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvs[] newArray(int i2) {
        return new zzvs[i2];
    }
}
