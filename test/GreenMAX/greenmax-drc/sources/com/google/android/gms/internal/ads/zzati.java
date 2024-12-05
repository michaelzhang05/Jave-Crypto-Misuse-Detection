package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzati implements Parcelable.Creator<zzath> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzath createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        zzxz zzxzVar = null;
        String str = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 2) {
                zzxzVar = (zzxz) SafeParcelReader.o(parcel, z, zzxz.CREATOR);
            } else if (v != 3) {
                SafeParcelReader.H(parcel, z);
            } else {
                str = SafeParcelReader.p(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzath(zzxzVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzath[] newArray(int i2) {
        return new zzath[i2];
    }
}
