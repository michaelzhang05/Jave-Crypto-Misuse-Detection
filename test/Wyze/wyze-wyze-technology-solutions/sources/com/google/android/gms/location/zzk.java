package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        long j2 = 50;
        long j3 = Long.MAX_VALUE;
        boolean z = true;
        float f2 = 0.0f;
        int i2 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z2);
            if (v == 1) {
                z = SafeParcelReader.w(parcel, z2);
            } else if (v == 2) {
                j2 = SafeParcelReader.D(parcel, z2);
            } else if (v == 3) {
                f2 = SafeParcelReader.y(parcel, z2);
            } else if (v == 4) {
                j3 = SafeParcelReader.D(parcel, z2);
            } else if (v != 5) {
                SafeParcelReader.H(parcel, z2);
            } else {
                i2 = SafeParcelReader.B(parcel, z2);
            }
        }
        SafeParcelReader.u(parcel, I);
        return new zzj(z, j2, f2, j3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i2) {
        return new zzj[i2];
    }
}
