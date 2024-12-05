package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzab implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        long j2 = 3600000;
        long j3 = 600000;
        long j4 = Long.MAX_VALUE;
        long j5 = 0;
        int i2 = 102;
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        float f2 = 0.0f;
        while (parcel.dataPosition() < I) {
            int z2 = SafeParcelReader.z(parcel);
            switch (SafeParcelReader.v(z2)) {
                case 1:
                    i2 = SafeParcelReader.B(parcel, z2);
                    break;
                case 2:
                    j2 = SafeParcelReader.D(parcel, z2);
                    break;
                case 3:
                    j3 = SafeParcelReader.D(parcel, z2);
                    break;
                case 4:
                    z = SafeParcelReader.w(parcel, z2);
                    break;
                case 5:
                    j4 = SafeParcelReader.D(parcel, z2);
                    break;
                case 6:
                    i3 = SafeParcelReader.B(parcel, z2);
                    break;
                case 7:
                    f2 = SafeParcelReader.y(parcel, z2);
                    break;
                case 8:
                    j5 = SafeParcelReader.D(parcel, z2);
                    break;
                default:
                    SafeParcelReader.H(parcel, z2);
                    break;
            }
        }
        SafeParcelReader.u(parcel, I);
        return new LocationRequest(i2, j2, j3, z, j4, i3, f2, j5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest[] newArray(int i2) {
        return new LocationRequest[i2];
    }
}
