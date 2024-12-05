package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzp implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        zzm zzmVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i2 = 1;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v == 2) {
                zzmVar = (zzm) SafeParcelReader.o(parcel, z, zzm.CREATOR);
            } else if (v == 3) {
                iBinder = SafeParcelReader.A(parcel, z);
            } else if (v != 4) {
                SafeParcelReader.H(parcel, z);
            } else {
                iBinder2 = SafeParcelReader.A(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzo(i2, zzmVar, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i2) {
        return new zzo[i2];
    }
}
