package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzace implements Parcelable.Creator<zzacd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzacd createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < I) {
            int z4 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z4);
            if (v == 2) {
                z = SafeParcelReader.w(parcel, z4);
            } else if (v == 3) {
                z2 = SafeParcelReader.w(parcel, z4);
            } else if (v != 4) {
                SafeParcelReader.H(parcel, z4);
            } else {
                z3 = SafeParcelReader.w(parcel, z4);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzacd(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzacd[] newArray(int i2) {
        return new zzacd[i2];
    }
}
