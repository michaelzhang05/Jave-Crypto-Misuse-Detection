package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzdaz implements Parcelable.Creator<zzday> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzday createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        int i2 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v != 2) {
                SafeParcelReader.H(parcel, z);
            } else {
                bArr = SafeParcelReader.g(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzday(i2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzday[] newArray(int i2) {
        return new zzday[i2];
    }
}
