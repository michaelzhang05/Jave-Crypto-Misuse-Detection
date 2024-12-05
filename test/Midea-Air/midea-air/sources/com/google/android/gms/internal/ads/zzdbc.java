package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzdbc implements Parcelable.Creator<zzdbb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdbb createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                i2 = SafeParcelReader.B(parcel, z);
            } else if (v == 2) {
                str = SafeParcelReader.p(parcel, z);
            } else if (v != 3) {
                SafeParcelReader.H(parcel, z);
            } else {
                str2 = SafeParcelReader.p(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzdbb(i2, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdbb[] newArray(int i2) {
        return new zzdbb[i2];
    }
}
